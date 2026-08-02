package xsna;

import androidx.lifecycle.Lifecycle;
import com.vk.toggle.features.ComFeatures;

/* compiled from: PostingItemController.kt */
/* loaded from: classes4.dex */
public final class fgc0 implements androidx.lifecycle.l {
    public final /* synthetic */ ggc0 b;
    public final /* synthetic */ f5z c;

    /* compiled from: PostingItemController.kt */
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
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public fgc0(ggc0 ggc0Var, f5z f5zVar) {
        this.b = ggc0Var;
        this.c = f5zVar;
    }

    @Override // androidx.lifecycle.l
    public final void onStateChanged(f5z f5zVar, Lifecycle.Event event) {
        ggc0 ggc0Var = this.b;
        egc0 egc0Var = ggc0Var.g;
        int i = a.$EnumSwitchMapping$0[event.ordinal()];
        if (i != 1) {
            if (i == 2) {
                egc0Var.o7(ce60.b.i());
                return;
            }
            if (i == 3) {
                egc0Var.getClass();
                return;
            } else {
                if (i != 4) {
                    return;
                }
                egc0Var.onDestroy();
                this.c.getLifecycle().removeObserver(this);
                return;
            }
        }
        egc0Var.onStart();
        uaq0 uaq0Var = ggc0Var.f;
        ComFeatures comFeatures = ComFeatures.COM_POSTING_AUTHOR_SELECTION;
        comFeatures.getClass();
        if (com.vk.toggle.b.A.a(comFeatures)) {
            pgc0 pgc0Var = egc0Var instanceof pgc0 ? (pgc0) egc0Var : null;
            if (pgc0Var == null) {
                return;
            }
            ggc0Var.b.a(io.reactivex.rxjava3.core.q.W(uaq0Var.d(), uaq0Var.b(), uaq0Var.a(), uaq0Var.c()).a0(asu0.a.d()).subscribe(new j3z(new fo6(20, pgc0Var, ggc0Var), 11), new lw30(new zsw(15), 7)));
        }
    }
}
