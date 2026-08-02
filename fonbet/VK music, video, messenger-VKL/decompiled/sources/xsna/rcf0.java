package xsna;

import com.vk.dto.common.im.ImageList;
import com.vk.im.ui.views.dialogs.DialogItemView;
import com.vkontakte.android.R;

/* compiled from: RecommendedChannelVkMeItemViewHolder.kt */
/* loaded from: classes16.dex */
public final class rcf0 extends vfz<pcf0> {
    public final DialogItemView l;
    public pcf0 m;

    public rcf0(DialogItemView dialogItemView, com.vk.channels.impl.list.f fVar) {
        super(dialogItemView);
        this.l = dialogItemView;
        bwt0.i0(dialogItemView, new wd3(24, fVar, this));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(pcf0 pcf0Var) {
        pcf0 pcf0Var2 = pcf0Var;
        this.m = pcf0Var2;
        ImageList imageList = pcf0Var2.c;
        int i = DialogItemView.e;
        DialogItemView dialogItemView = this.l;
        dialogItemView.f(imageList, null, false);
        dialogItemView.p(pcf0Var2.d, false);
        int i2 = pcf0Var2.e;
        dialogItemView.h(dialogItemView.getResources().getQuantityString(R.plurals.followers_count, Integer.min(i2, 1000), uqm0.f(i2)), null);
        dialogItemView.setVerified(pcf0Var2.f);
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
