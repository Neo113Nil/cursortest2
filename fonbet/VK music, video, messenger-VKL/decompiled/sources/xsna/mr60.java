package xsna;

import androidx.lifecycle.Lifecycle;
import xsna.xn60;

/* compiled from: NewsfeedListOverlayFragmentLifecycleListener.kt */
/* loaded from: classes4.dex */
public final class mr60 implements androidx.lifecycle.l {
    public final /* synthetic */ nr60 b;

    /* compiled from: NewsfeedListOverlayFragmentLifecycleListener.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public mr60(nr60 nr60Var) {
        this.b = nr60Var;
    }

    @Override // androidx.lifecycle.l
    public final void onStateChanged(f5z f5zVar, Lifecycle.Event event) {
        fo60 fo60Var = this.b.c;
        int i = a.$EnumSwitchMapping$0[event.ordinal()];
        if (i == 1) {
            fo60Var.a(xn60.c.b.C4024c.b);
            return;
        }
        if (i == 2) {
            fo60Var.a(xn60.c.b.h.b);
        } else {
            if (i != 3) {
                return;
            }
            fo60Var.a(xn60.c.b.d.b);
            f5zVar.getLifecycle().removeObserver(this);
        }
    }
}
