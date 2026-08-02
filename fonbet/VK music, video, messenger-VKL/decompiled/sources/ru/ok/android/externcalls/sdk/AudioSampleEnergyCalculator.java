package ru.ok.android.externcalls.sdk;

import android.os.Handler;
import androidx.annotation.NonNull;
import ru.ok.android.external.sdk.MicSampleListener;
import ru.ok.android.externcalls.sdk.AudioSampleEnergyCalculator;
import ru.ok.android.processing.PCMWrapper;
import ru.ok.android.webrtc.utils.AudioProcessor;

/* loaded from: classes9.dex */
public class AudioSampleEnergyCalculator implements MicSampleListener {
    private final Handler mainThreadHandler;
    private final AudioProcessor processor = new AudioProcessor();

    public AudioSampleEnergyCalculator(Handler handler) {
        this.mainThreadHandler = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSample$0(long j) {
        this.processor.appendAudioLevel(j);
    }

    public AudioProcessor getProcessor() {
        return this.processor;
    }

    @Override // ru.ok.android.external.sdk.MicSampleListener
    public void onSample(int i, int i2, int i3, @NonNull PCMWrapper pCMWrapper) {
        long j = 0;
        int i4 = 0;
        while (true) {
            if (i4 >= pCMWrapper.size) {
                final long sqrt = (long) Math.sqrt(j / r0);
                this.mainThreadHandler.post(new Runnable() { // from class: xsna.xw4
                    @Override // java.lang.Runnable
                    public final void run() {
                        AudioSampleEnergyCalculator.this.lambda$onSample$0(sqrt);
                    }
                });
                return;
            } else {
                short s = pCMWrapper.get16(i4);
                j += s * s;
                i4++;
            }
        }
    }
}
