package xsna;

import android.view.View;
import android.widget.LinearLayout;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vkontakte.android.R;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptySet;

/* compiled from: MusicBuySubscriptionTabletPopup.kt */
/* loaded from: classes3.dex */
public final class wc40 extends com.vk.music.notifications.inapp.c {
    public final b920 i;
    public final Set<zym0> j;
    public final iy2 k;
    public final rh6 l;
    public final th4 m;
    public final int n = R.layout.popup_music_buy_subscription_tablet;
    public final Object o = msy.a(LazyThreadSafetyMode.NONE, new cj4(28));
    public final vc40 p = new vc40(this);

    public wc40(b920 b920Var, Set set, iy2 iy2Var, rh6 rh6Var, th4 th4Var) {
        this.i = b920Var;
        this.j = set;
        this.k = iy2Var;
        this.l = rh6Var;
        this.m = th4Var;
    }

    @Override // com.vk.music.notifications.inapp.InAppNotification
    public final int G() {
        return this.n;
    }

    @Override // com.vk.music.notifications.inapp.InAppNotification
    public final void d() {
        this.k.getClass();
        s3q0 s3q0Var = s3q0.a;
        super.d();
    }

    @Override // com.vk.music.notifications.inapp.InAppNotification
    public final void d3(View view) {
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.content_container);
        int i = 0;
        while (true) {
            b920 b920Var = this.i;
            if (i >= b920Var.m()) {
                return;
            }
            linearLayout.addView(b920Var.i(linearLayout, i, this.p, i == 0 ? this.j : EmptySet.b));
            i++;
        }
    }

    @Override // com.vk.music.notifications.inapp.InAppNotification, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
