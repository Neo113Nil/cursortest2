package xsna;

import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.im.ImageList;
import com.vk.im.ui.views.dialogs.DialogItemView;
import com.vkontakte.android.R;

/* compiled from: VhUnsubscribedChannel.kt */
/* loaded from: classes2.dex */
public final class svr0 extends vfz<r6q0> {
    public static final /* synthetic */ int o = 0;
    public final DialogItemView l;
    public final mkr0 m;
    public r6q0 n;

    public svr0(DialogItemView dialogItemView, mkr0 mkr0Var) {
        super(dialogItemView);
        this.l = dialogItemView;
        this.m = mkr0Var;
        jjc.g(dialogItemView, new r0r0(this, 3));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(r6q0 r6q0Var) {
        r6q0 r6q0Var2 = r6q0Var;
        this.n = r6q0Var2;
        ImageList imageList = r6q0Var2.c;
        int i = DialogItemView.e;
        DialogItemView dialogItemView = this.l;
        dialogItemView.f(imageList, null, false);
        dialogItemView.p(r6q0Var2.d, false);
        int i2 = r6q0Var2.h;
        if (BuildInfo.t()) {
            dialogItemView.h(dialogItemView.getResources().getQuantityString(R.plurals.followers_count, Integer.min(i2, 1000), uqm0.f(i2)), null);
        } else {
            dialogItemView.i();
        }
        dialogItemView.setVerified(r6q0Var2.i);
        dialogItemView.u();
        dialogItemView.o();
        dialogItemView.setCasperIconVisible(false);
        dialogItemView.setImageStatusVisible(false);
        dialogItemView.setDonutIconVisible(false);
        dialogItemView.k();
        dialogItemView.setUnreadOutVisible(false);
        dialogItemView.setReadOutVisible(false);
        dialogItemView.setSendingVisible(false);
        dialogItemView.setErrorVisible(false);
        dialogItemView.j(DialogItemView.ExtraIcon.NONE, false);
    }
}
