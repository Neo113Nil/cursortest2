package defpackage;

import android.os.HandlerThread;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final /* synthetic */ class j281 implements pg61 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ j281(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // defpackage.pg61
    public final Object get() {
        int i = this.a;
        int i2 = this.b;
        switch (i) {
            case 0:
                StringBuilder sb = new StringBuilder("ExoPlayer:MediaCodecAsyncAdapter:");
                if (i2 == 1) {
                    sb.append("Audio");
                } else if (i2 == 2) {
                    sb.append("Video");
                } else {
                    n.A(sb, "Unknown(", i2, Extension.C_BRAKE);
                }
                return new HandlerThread(sb.toString());
            default:
                StringBuilder sb2 = new StringBuilder("ExoPlayer:MediaCodecQueueingThread:");
                if (i2 == 1) {
                    sb2.append("Audio");
                } else if (i2 == 2) {
                    sb2.append("Video");
                } else {
                    n.A(sb2, "Unknown(", i2, Extension.C_BRAKE);
                }
                return new HandlerThread(sb2.toString());
        }
    }
}
