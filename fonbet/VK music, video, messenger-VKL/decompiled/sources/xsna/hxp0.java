package xsna;

import androidx.lifecycle.Lifecycle;

/* compiled from: UIVisibilityBehavior.kt */
/* loaded from: classes17.dex */
public final class hxp0 implements androidx.lifecycle.l {
    public final /* synthetic */ gxp0 b;
    public final /* synthetic */ hyc c;

    /* compiled from: UIVisibilityBehavior.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public hxp0(gxp0 gxp0Var, hyc hycVar) {
        this.b = gxp0Var;
        this.c = hycVar;
    }

    @Override // androidx.lifecycle.l
    public final void onStateChanged(f5z f5zVar, Lifecycle.Event event) {
        int i = a.$EnumSwitchMapping$0[event.ordinal()];
        hyc hycVar = this.c;
        gxp0 gxp0Var = this.b;
        if (i == 1) {
            gxp0Var.b(hycVar);
        } else {
            if (i != 2) {
                return;
            }
            gxp0Var.d(hycVar);
        }
    }
}
