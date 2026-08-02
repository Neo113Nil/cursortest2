package defpackage;

import android.content.Context;
import com.yandex.mapkit.ScreenPoint;

/* loaded from: classes14.dex */
public final class gzx extends bhf {
    public final vgf A;
    public xm00 B;
    public final ScreenPoint C;
    public final Context z;

    public gzx(ah00 ah00Var, no21 no21Var, Context context, vgf vgfVar) {
        super(ah00Var, no21Var);
        this.z = context;
        this.A = vgfVar;
        this.C = new ScreenPoint();
    }

    @Override // defpackage.bhf
    public final ugf Jg() {
        xm00 xm00Var = this.B;
        if (xm00Var != null) {
            this.A.getClass();
            return new ahf(this.z, xm00Var);
        }
        ny61.r("container is null. Attach method is not called possibly");
        return null;
    }

    @Override // defpackage.bhf
    public final ScreenPoint Kg() {
        return this.C;
    }

    public final void attach() {
        resume();
        if (this.B == null) {
            this.B = ((gh00) ((ah00) this.b)).i.p();
        }
    }

    public final void detach() {
        pause();
        xm00 xm00Var = this.B;
        if (xm00Var != null) {
            xm00Var.d();
            Ig();
        }
        this.B = null;
    }
}
