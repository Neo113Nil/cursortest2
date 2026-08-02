package com.yandex.go.yb.main_menu.ui;

import android.content.Context;
import android.view.View;
import androidx.appcompat.view.ContextThemeWrapper;
import com.ybsdk.api.widgets.YBBalanceBadgeView;
import com.ybsdk.rconfig.configs.CommonFeatureFlag;
import com.ybsdk.widgets.BalanceBadgeV2ViewImpl;
import com.ybsdk.widgets.BalanceBadgeViewImpl;
import defpackage.br31;
import defpackage.cr31;
import defpackage.df51;
import defpackage.i3y;
import defpackage.j1i0;
import defpackage.ky51;
import defpackage.ly51;
import defpackage.oi51;
import defpackage.sv51;
import defpackage.w511;
import defpackage.wlp;
import defpackage.xop0;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes15.dex */
public final class c implements ky51 {
    public final /* synthetic */ d a;

    public c(d dVar) {
        this.a = dVar;
    }

    @Override // defpackage.ky51
    public final void t6(sv51 sv51Var) {
        int i;
        YBBalanceBadgeView balanceBadgeViewImpl;
        int i2;
        boolean z = sv51Var.d;
        d dVar = this.a;
        ly51 ly51Var = dVar.b;
        i3y i3yVar = dVar.a;
        if (!z) {
            if (i3yVar.isInitialized()) {
                ((View) i3yVar.getValue()).setVisibility(8);
            }
            ly51Var.x.f.l(YbWalletMenuItemPresenter$MenuItemState.HIDDEN);
            return;
        }
        ly51Var.x.f.l(YbWalletMenuItemPresenter$MenuItemState.DISPLAYED);
        ((View) i3yVar.getValue()).setVisibility(0);
        ((ListItemComponent) i3yVar.getValue()).setTitle(sv51Var.a);
        ((ListItemComponent) i3yVar.getValue()).setSubtitle(sv51Var.b);
        df51 df51Var = sv51Var.c;
        if (df51Var == null && dVar.d == null) {
            return;
        }
        YbWalletMenuItemViewHolderImpl$BadgeWrapper ybWalletMenuItemViewHolderImpl$BadgeWrapper = dVar.d;
        if (ybWalletMenuItemViewHolderImpl$BadgeWrapper == null) {
            Context context = ((ListItemComponent) i3yVar.getValue()).getContext();
            oi51 oi51Var = (oi51) dVar.c.getValue();
            Context context2 = ((ListItemComponent) i3yVar.getValue()).getContext();
            cr31 cr31Var = (cr31) oi51Var;
            com.ybsdk.rconfig.b bVar = cr31Var.b;
            bVar.getClass();
            boolean isEnabled = ((CommonFeatureFlag) bVar.d(wlp.h0).getData()).isEnabled();
            xop0 xop0Var = cr31Var.a;
            if (isEnabled) {
                int i3 = br31.a[xop0Var.a().ordinal()];
                if (i3 == 1) {
                    i2 = j1i0.YbSdk_BadgeV2ViewTheme_Light;
                } else {
                    if (i3 != 2) {
                        w511.b();
                        return;
                    }
                    i2 = j1i0.YbSdk_BadgeV2ViewTheme_Dark;
                }
                balanceBadgeViewImpl = new BalanceBadgeV2ViewImpl(new ContextThemeWrapper(context2, i2), null, 0, 6, null);
            } else {
                int i4 = br31.a[xop0Var.a().ordinal()];
                if (i4 == 1) {
                    i = j1i0.YbSdk_BadgeViewTheme_Light;
                } else {
                    if (i4 != 2) {
                        w511.b();
                        return;
                    }
                    i = j1i0.YbSdk_BadgeViewTheme_Dark;
                }
                balanceBadgeViewImpl = new BalanceBadgeViewImpl(new ContextThemeWrapper(context2, i), null, 0, 6, null);
            }
            ybWalletMenuItemViewHolderImpl$BadgeWrapper = new YbWalletMenuItemViewHolderImpl$BadgeWrapper(context, balanceBadgeViewImpl);
            dVar.d = ybWalletMenuItemViewHolderImpl$BadgeWrapper;
            ((ListItemComponent) i3yVar.getValue()).setTrailView(ybWalletMenuItemViewHolderImpl$BadgeWrapper);
        }
        ybWalletMenuItemViewHolderImpl$BadgeWrapper.render(df51Var);
    }
}
