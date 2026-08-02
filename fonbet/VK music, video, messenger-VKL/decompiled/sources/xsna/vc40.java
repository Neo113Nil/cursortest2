package xsna;

import android.view.View;
import com.vk.dto.common.data.Subscription;

/* compiled from: MusicBuySubscriptionTabletPopup.kt */
/* loaded from: classes3.dex */
public final class vc40 implements f950 {
    public final /* synthetic */ wc40 a;

    public vc40(wc40 wc40Var) {
        this.a = wc40Var;
    }

    @Override // xsna.f950
    public final void a(View view, Subscription subscription) {
        wc40 wc40Var = this.a;
        if (subscription != null) {
            wc40Var.l.invoke(subscription);
        } else if (view != null) {
            wc40Var.m.onClick(view);
        }
        wc40Var.d();
    }
}
