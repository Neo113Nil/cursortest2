package xsna;

import com.vk.core.snackbar.HideReason;
import java.util.concurrent.TimeUnit;

/* compiled from: VKNotificationViewDelegate.kt */
/* loaded from: classes6.dex */
public final class ber0 {
    public static final int e = iah0.a(40);
    public static final long f = TimeUnit.SECONDS.toMillis(10);
    public final fvv0 a;
    public final ggu0 b;
    public final mfu0 c;
    public final v5n0 d;

    /* compiled from: VKNotificationViewDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HideReason.values().length];
            try {
                iArr[HideReason.Timeout.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HideReason.Swipe.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ber0(fvv0 fvv0Var, ggu0 ggu0Var, mfu0 mfu0Var, v5n0 v5n0Var) {
        this.a = fvv0Var;
        this.b = ggu0Var;
        this.c = mfu0Var;
        this.d = v5n0Var;
    }

    public final void a() {
        io.reactivex.rxjava3.disposables.b bVar = this.b.r;
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        hg1.e(bVar, vdx0Var.m().a(this.a.getAppId()).subscribe(new dh40(new hfm0(this, 9), 21), new s520(new rzl0(this, 14), 28)));
    }
}
