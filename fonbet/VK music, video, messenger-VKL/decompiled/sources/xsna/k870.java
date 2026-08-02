package xsna;

import com.vk.ecomm.market.ui.view.ratingview.DynamicRatingView;

/* compiled from: NotificationCSatStarsView.kt */
/* loaded from: classes4.dex */
public final class k870 implements DynamicRatingView.a {
    public final /* synthetic */ m870 b;

    public k870(m870 m870Var) {
        this.b = m870Var;
    }

    @Override // com.vk.ecomm.market.ui.view.ratingview.DynamicRatingView.a
    public final void v1(float f, boolean z) {
        m870 m870Var = this.b;
        m870Var.f = true;
        m870Var.e.setAlpha(1.0f);
    }
}
