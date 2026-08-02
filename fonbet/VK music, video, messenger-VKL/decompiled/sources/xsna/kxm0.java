package xsna;

import android.app.Activity;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetSideEffectOptions;

/* compiled from: SubscriptionAction.kt */
/* loaded from: classes2.dex */
public abstract class kxm0 extends h6s0 {
    public final VideoBottomSheetSideEffectOptions c;

    public kxm0(int i, VideoBottomSheetSideEffectOptions videoBottomSheetSideEffectOptions) {
        super(i);
        this.c = videoBottomSheetSideEffectOptions;
    }

    @Override // xsna.h6s0
    public final e520 a(s6s0 s6s0Var) {
        if (f(s6s0Var)) {
            return e();
        }
        return null;
    }

    @Override // xsna.h6s0
    public final void c(Activity activity, s6s0 s6s0Var, y6s0 y6s0Var) {
        if (y6s0Var != null) {
            y6s0Var.b(this.c, s6s0Var.a);
        }
    }

    public abstract e520 e();

    public abstract boolean f(s6s0 s6s0Var);
}
