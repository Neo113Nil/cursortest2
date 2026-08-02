package ru.ok.android.webrtc.processing;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.webrtc.audio.JavaAudioDeviceModule;
import ru.ok.android.external.sdk.MicSampleListener;
import ru.ok.android.processing.PCMWrapper;

/* loaded from: classes9.dex */
public class MicListener implements JavaAudioDeviceModule.AudioRecordSampleHook {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioRecordSampleHook
    public void onWebRtcAudioRecordSamplesReady(int i, int i2, int i3, byte[] bArr, int i4, int i5) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        PCMWrapper wrap = PCMWrapper.wrap(i, bArr, i4, i5);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.c < elapsedRealtime) {
                aVar.c = aVar.b + elapsedRealtime;
                aVar.a.onSample(i, i2, i3, wrap);
            }
        }
    }

    public void registerCallback(@NonNull MicSampleListener micSampleListener, long j) {
        this.a.add(new a(micSampleListener, j));
    }

    public void removeCallback(@NonNull MicSampleListener micSampleListener) {
        this.a.remove(new a(micSampleListener, 0L));
    }
}
