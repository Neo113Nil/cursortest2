package ru.ok.android.externcalls.sdk;

import android.os.Handler;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;
import ru.ok.android.external.sdk.MicSampleListener;
import ru.ok.android.processing.PCMWrapper;
import ru.ok.android.webrtc.stat.utils.WeightedAverage;

/* loaded from: classes9.dex */
public class AudioLevelListener implements MicSampleListener {
    private final Handler handler;
    private boolean isActive;
    private final WeightedAverage noise;
    private final Runnable reporter;
    private final short triggerDiff;

    public AudioLevelListener(short s, @NonNull Handler handler, @NonNull Runnable runnable) {
        WeightedAverage weightedAverage = new WeightedAverage(0.05f);
        this.noise = weightedAverage;
        this.isActive = true;
        this.reporter = runnable;
        this.triggerDiff = s;
        this.handler = handler;
        weightedAverage.update(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public void listen() {
        this.isActive = true;
    }

    @Override // ru.ok.android.external.sdk.MicSampleListener
    public void onSample(int i, int i2, int i3, @NonNull PCMWrapper pCMWrapper) {
        if (this.isActive) {
            WeightedAverage weightedAverage = new WeightedAverage(0.3f);
            weightedAverage.update(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            for (int i4 = 0; i4 < pCMWrapper.size; i4++) {
                float abs = Math.abs((int) pCMWrapper.get16(i4));
                weightedAverage.update(abs);
                this.noise.update(abs);
                if (weightedAverage.getValue() - this.noise.getValue() > this.triggerDiff) {
                    this.handler.post(this.reporter);
                    return;
                }
            }
        }
    }

    public void stop() {
        this.isActive = false;
    }
}
