package xsna;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.ui.platform.ComposeView;
import com.vk.core.dialogs.bottomsheet.modern.impl.CustomisableBottomSheetBehavior;
import com.vk.core.dialogs.bottomsheet.modern.impl.CustomisableBottomSheetFragment;
import com.vk.dto.common.data.Subscription;
import com.vk.music.notifications.subscription.MusicBuyMusicSubscriptionFragment;
import com.vkontakte.android.R;
import xsna.mut0;

/* compiled from: BuyMusicSubscriptionController.kt */
/* loaded from: classes3.dex */
public final class dt8 extends bh6 {
    public final String n;
    public final u750 o;
    public final MusicBuyMusicSubscriptionFragment p;
    public final izs<Subscription, s3q0> q;
    public final boolean r;
    public ViewGroup s;
    public final we0 t = new we0(this, 10);

    public dt8(AppCompatActivity appCompatActivity, String str, u750 u750Var, MusicBuyMusicSubscriptionFragment musicBuyMusicSubscriptionFragment, izs izsVar, boolean z) {
        this.n = str;
        this.o = u750Var;
        this.p = musicBuyMusicSubscriptionFragment;
        this.q = izsVar;
        this.r = z;
        this.j = new ct8(this);
        this.c = false;
        CustomisableBottomSheetBehavior<FrameLayout> customisableBottomSheetBehavior = new CustomisableBottomSheetBehavior<>(appCompatActivity);
        customisableBottomSheetBehavior.i = true;
        customisableBottomSheetBehavior.I(iah0.u());
        customisableBottomSheetBehavior.J(3);
        this.k = customisableBottomSheetBehavior;
        this.h = new v9(this, 11);
    }

    public final void B() {
        ViewGroup viewGroup = this.s;
        if (viewGroup != null) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams != null) {
                int i = iah0.f().widthPixels;
                int i2 = iah0.f().heightPixels;
                if (i > i2) {
                    i = i2;
                }
                layoutParams.width = i;
            }
            ViewGroup viewGroup2 = this.s;
            if (viewGroup2 != null) {
                viewGroup2.requestLayout();
            }
        }
    }

    @Override // xsna.bh6, xsna.gw20
    public final View x(CustomisableBottomSheetFragment customisableBottomSheetFragment, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.music_subscription_bottom_sheet_view, viewGroup, false);
        inflate.findViewById(R.id.touch_outside).setOnClickListener(new bt8(this, 0));
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.designed_bottom_sheet);
        viewGroup2.addView(z(layoutInflater, viewGroup, bundle));
        this.s = viewGroup2;
        B();
        return inflate;
    }

    @Override // xsna.bh6
    public final View z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ComposeView composeView = new ComposeView(layoutInflater.getContext(), null, 6);
        composeView.setViewCompositionStrategy(mut0.c.a);
        composeView.setContent(new jai(1665194694, new v95(this, 2), true));
        return composeView;
    }
}
