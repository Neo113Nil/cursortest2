package xsna;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.Uri;
import com.vk.media.pipeline.model.timeline.Timeline;
import com.vk.media.pipeline.stat.ErrorStatBuilder;
import java.io.File;
import xsna.qpa0;

/* compiled from: TransformSession.kt */
/* loaded from: classes3.dex */
public final class okp0 implements tsi0 {
    public final csp a;
    public final xu10 b;
    public final ykm0 c;
    public jrk0 e;
    public qpa0 d = new qpa0.d(false);
    public final ju4 f = new ju4();

    public okp0(csp cspVar, Timeline timeline, nfq nfqVar, xu10 xu10Var, ykm0 ykm0Var, boolean z) {
        this.a = cspVar;
        this.b = xu10Var;
        this.c = ykm0Var;
    }

    @Override // xsna.tsi0
    public final zu10 a(Throwable th) {
        return ((ErrorStatBuilder) this.f.b).b(th);
    }

    public final void b(a5o0 a5o0Var) {
        String str = a5o0Var.e;
        File file = (File) this.c.a;
        csp cspVar = this.a;
        try {
            f100 f100Var = cspVar.d;
            f100 f100Var2 = cspVar.d;
            if (f100Var != null) {
                f100Var.i("TransformSession", str + " output can write: " + file.canWrite());
            }
            if (f100Var2 != null) {
                f100Var2.i("TransformSession", str + " output size bytes: " + file.length());
            }
            MediaExtractor a = br10.a(cspVar.a, Uri.fromFile(file));
            int b = br10.b(a, "video/");
            int b2 = br10.b(a, "audio/");
            MediaFormat trackFormat = a.getTrackFormat(b);
            MediaFormat trackFormat2 = b2 != -1 ? a.getTrackFormat(b2) : null;
            if (f100Var2 != null) {
                f100Var2.i("TransformSession", str + " output format: v=" + trackFormat + ", a=" + trackFormat2);
            }
            a.release();
        } catch (Throwable th) {
            f100 f100Var3 = cspVar.d;
            if (f100Var3 != null) {
                f100Var3.a("TransformSession", th);
            }
        }
    }
}
