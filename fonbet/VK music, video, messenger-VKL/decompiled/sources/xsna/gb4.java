package xsna;

import android.media.AudioRecord;
import android.media.MediaFormat;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AutomaticGainControl;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.log.L;
import xsna.gzf;

/* compiled from: Audio.java */
/* loaded from: classes3.dex */
public final class gb4 {

    @Nullable
    public final gzf.a a;
    public final long b;
    public final AudioRecord c;
    public final AcousticEchoCanceler d;
    public final AutomaticGainControl e;

    public gb4(@NonNull MediaFormat mediaFormat) {
        Throwable th;
        gzf.a aVar;
        AudioRecord audioRecord;
        Exception exc;
        int minBufferSize;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            aVar = new gzf.a(mediaFormat);
            try {
                int i = aVar.c;
                int i2 = aVar.b;
                int i3 = i2 == 2 ? 12 : 16;
                if (i <= 0) {
                    minBufferSize = -2;
                } else {
                    minBufferSize = AudioRecord.getMinBufferSize(i, i2 == 2 ? 12 : 16, 2);
                }
                audioRecord = new AudioRecord(1, i, i3, 2, minBufferSize * 4);
                try {
                    try {
                        if (audioRecord.getState() != 1) {
                            throw new IllegalStateException("record state=" + audioRecord.getState());
                        }
                    } catch (Exception e) {
                        exc = e;
                        L.j(exc, "failed to create audio record");
                        if (audioRecord != null) {
                            try {
                                audioRecord.release();
                            } catch (Exception unused) {
                            }
                            audioRecord = null;
                        }
                        this.a = aVar;
                        this.c = audioRecord;
                        this.d = null;
                        this.e = null;
                        this.b = System.currentTimeMillis() - currentTimeMillis;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    this.a = aVar;
                    this.c = audioRecord;
                    this.d = null;
                    this.e = null;
                    this.b = System.currentTimeMillis() - currentTimeMillis;
                    throw th;
                }
            } catch (Exception e2) {
                exc = e2;
                audioRecord = null;
            } catch (Throwable th3) {
                th = th3;
                audioRecord = null;
                this.a = aVar;
                this.c = audioRecord;
                this.d = null;
                this.e = null;
                this.b = System.currentTimeMillis() - currentTimeMillis;
                throw th;
            }
        } catch (Exception e3) {
            exc = e3;
            aVar = null;
            audioRecord = null;
        } catch (Throwable th4) {
            th = th4;
            aVar = null;
            audioRecord = null;
        }
        this.a = aVar;
        this.c = audioRecord;
        this.d = null;
        this.e = null;
        this.b = System.currentTimeMillis() - currentTimeMillis;
    }

    public final void a() {
        System.currentTimeMillis();
        AutomaticGainControl automaticGainControl = this.e;
        if (automaticGainControl != null) {
            try {
                automaticGainControl.setEnabled(false);
                automaticGainControl.release();
            } catch (Exception e) {
                L.j(e, "failed to release audio automatic gain control");
            }
        }
        AcousticEchoCanceler acousticEchoCanceler = this.d;
        if (acousticEchoCanceler != null) {
            try {
                acousticEchoCanceler.setEnabled(false);
                acousticEchoCanceler.release();
            } catch (Exception e2) {
                L.j(e2, "failed to release audio acoustic echo canceler");
            }
        }
        AudioRecord audioRecord = this.c;
        if (audioRecord != null) {
            try {
                if (audioRecord.getRecordingState() != 1) {
                    audioRecord.stop();
                }
            } catch (Exception unused) {
            }
        }
        if (audioRecord != null) {
            try {
                audioRecord.release();
            } catch (Exception e3) {
                L.j(e3, "failed to release audio record");
            }
        }
        System.currentTimeMillis();
    }
}
