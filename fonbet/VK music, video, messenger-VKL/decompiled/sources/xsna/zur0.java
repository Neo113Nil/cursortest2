package xsna;

import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.im.ImageList;
import com.vk.im.ui.views.dialogs.DialogItemView;
import com.vkontakte.android.R;

/* compiled from: VhRecommendedChannel.kt */
/* loaded from: classes2.dex */
public final class zur0 extends vfz<lcf0> {
    public static final /* synthetic */ int o = 0;
    public final DialogItemView l;
    public final mkr0 m;
    public lcf0 n;

    public zur0(DialogItemView dialogItemView, mkr0 mkr0Var) {
        super(dialogItemView);
        this.l = dialogItemView;
        this.m = mkr0Var;
        jjc.g(dialogItemView, new lxh0(this, 7));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(lcf0 lcf0Var) {
        lcf0 lcf0Var2 = lcf0Var;
        this.n = lcf0Var2;
        ImageList imageList = lcf0Var2.c;
        int i = DialogItemView.e;
        DialogItemView dialogItemView = this.l;
        dialogItemView.f(imageList, null, false);
        dialogItemView.p(lcf0Var2.d, false);
        int i2 = lcf0Var2.e;
        if (BuildInfo.t()) {
            dialogItemView.h(dialogItemView.getResources().getQuantityString(R.plurals.followers_count, Integer.min(i2, 1000), uqm0.f(i2)), null);
        } else {
            dialogItemView.i();
        }
        dialogItemView.setVerified(lcf0Var2.f);
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
