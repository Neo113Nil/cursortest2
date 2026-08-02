package xsna;

import android.os.Parcelable;

/* compiled from: PendingBlurredImagePostingHolder.kt */
/* loaded from: classes4.dex */
public final class nu90 extends mh7 implements zu90 {
    @Override // xsna.zu90
    public final int S() {
        Parcelable parcelable = this.d;
        ju90 ju90Var = parcelable instanceof ju90 ? (ju90) parcelable : null;
        if (ju90Var != null) {
            return ju90Var.S();
        }
        return 0;
    }
}
