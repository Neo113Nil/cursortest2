package xsna;

import com.vk.dto.common.VerifyInfo;
import com.vk.im.ui.views.dialogs.DialogItemView;

/* compiled from: VhSubscribedChannel.kt */
/* loaded from: classes2.dex */
public final class nvr0 extends vfz<uwm0> {
    public static final /* synthetic */ int o = 0;
    public final DialogItemView l;
    public final mkr0 m;
    public uwm0 n;

    public nvr0(DialogItemView dialogItemView, mkr0 mkr0Var) {
        super(dialogItemView);
        this.l = dialogItemView;
        this.m = mkr0Var;
        jjc.g(dialogItemView, new zyl0(this, 12));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(uwm0 uwm0Var) {
        uwm0 uwm0Var2 = uwm0Var;
        this.n = uwm0Var2;
        CharSequence charSequence = uwm0Var2.d;
        DialogItemView dialogItemView = this.l;
        dialogItemView.p(charSequence, false);
        dialogItemView.h(uwm0Var2.h, null);
        dialogItemView.f(uwm0Var2.c, null, false);
        boolean z = uwm0Var2.k;
        dialogItemView.setMutedVisible(z);
        dialogItemView.setTime(uwm0Var2.i);
        int i = uwm0Var2.j;
        if (i > 0) {
            dialogItemView.setUnreadInMuted(z);
            dialogItemView.r(i, false);
        } else {
            dialogItemView.u();
        }
        dialogItemView.o();
        dialogItemView.setCasperIconVisible(false);
        dialogItemView.setWritingDisabledIconVisible(false);
        dialogItemView.setImageStatusVisible(false);
        dialogItemView.setDonutIconVisible(false);
        dialogItemView.setVerified(new VerifyInfo(false, false, false, false, false, false, 63, null));
        dialogItemView.k();
        dialogItemView.setUnreadOutVisible(false);
        dialogItemView.setReadOutVisible(false);
        dialogItemView.setSendingVisible(false);
        dialogItemView.setErrorVisible(false);
        dialogItemView.j(DialogItemView.ExtraIcon.NONE, false);
    }
}
