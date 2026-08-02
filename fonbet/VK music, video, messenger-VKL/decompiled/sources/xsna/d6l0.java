package xsna;

import android.app.Activity;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: StickerSelectionControllerImpl.kt */
/* loaded from: classes15.dex */
public final class d6l0 {
    public final Activity a;
    public final w860 b;
    public x6a0 c;

    /* compiled from: StickerSelectionControllerImpl.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((d6l0) this.receiver).b();
            return s3q0.a;
        }
    }

    public d6l0(Activity activity, o6a0 o6a0Var) {
        this.a = activity;
        tia0.F0();
        w860 w860Var = new w860(activity, o6a0Var, new a(0, this, d6l0.class, "onHide", "onHide()V", 0));
        this.b = w860Var;
        x6a0 x6a0Var = new x6a0(bwt0.u(activity), w860Var);
        x6a0Var.setPermittedClickableStickers(EmptySet.b);
        x6a0Var.O.e(x6a0Var.Q.getCurrentItem());
        this.c = x6a0Var;
    }

    public final float a() {
        return this.c.K.c;
    }

    public final void b() {
        x6a0 x6a0Var = this.c;
        x6a0Var.K.J(4);
        afi0 afi0Var = x6a0Var.c0;
        if (afi0Var != null) {
            afi0Var.c();
        }
    }
}
