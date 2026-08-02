package defpackage;

import android.media.MediaCodec;
import android.os.Trace;
import androidx.media3.exoplayer.mediacodec.wrapper.a;
import java.io.IOException;

/* loaded from: classes10.dex */
public final class k2o implements xwo {
    public boolean a;
    public boolean b;

    public static hd10 a(lb10 lb10Var, tb10 tb10Var) {
        hd10 aVar;
        StringBuilder sb = new StringBuilder("createCodec:");
        sb10 sb10Var = lb10Var.a;
        sb10 sb10Var2 = lb10Var.a;
        sb.append(sb10Var.a);
        Trace.beginSection(sb.toString());
        if (tb10Var == null) {
            aVar = new cd60(MediaCodec.createByCodecName(sb10Var2.a), 0);
        } else {
            aVar = new a(sb10Var2.a, new vbb(2, lb10Var), tb10Var);
        }
        Trace.endSection();
        return aVar;
    }

    @Override // defpackage.mb10
    public final pb10 o(lb10 lb10Var) {
        return p(lb10Var, null);
    }

    @Override // defpackage.xwo
    public final pb10 p(lb10 lb10Var, ub10 ub10Var) {
        hd10 hd10Var = null;
        try {
            lb10Var.a.getClass();
            hd10Var = a(lb10Var, ub10Var == null ? null : ub10Var.create());
            uii0 uii0Var = new uii0(hd10Var, lb10Var.f, this.b);
            uii0Var.y = this.a;
            uii0Var.b0(lb10Var);
            uii0Var.c0();
            return uii0Var;
        } catch (IOException | RuntimeException e) {
            if (hd10Var != null) {
                hd10Var.release();
            }
            throw e;
        }
    }
}
