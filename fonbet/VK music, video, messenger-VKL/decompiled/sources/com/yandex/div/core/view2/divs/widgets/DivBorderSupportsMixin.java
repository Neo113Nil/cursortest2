package com.yandex.div.core.view2.divs.widgets;

import android.view.View;
import android.view.ViewOutlineProvider;
import com.unity3d.services.UnityAdsConstants;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div2.u1;

/* compiled from: DivBorderSupportsMixin.kt */
/* loaded from: classes7.dex */
public final class DivBorderSupportsMixin implements DivBorderSupports {
    private DivBorderDrawer borderDrawer;
    private boolean needClipping = true;

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public DivBorderDrawer getDivBorderDrawer() {
        return this.borderDrawer;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public boolean getNeedClipping() {
        return this.needClipping;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setBorder(BindingContext bindingContext, u1 u1Var, View view) {
        if (this.borderDrawer == null && u1Var != null) {
            this.borderDrawer = new DivBorderDrawer(bindingContext.getDivView(), view);
        }
        DivBorderDrawer divBorderDrawer = this.borderDrawer;
        if (divBorderDrawer != null) {
            divBorderDrawer.setBorder(u1Var, bindingContext.getExpressionResolver());
        }
        DivBorderDrawer divBorderDrawer2 = this.borderDrawer;
        if (divBorderDrawer2 != null) {
            divBorderDrawer2.setNeedClipping(getNeedClipping());
        }
        if (u1Var == null) {
            view.setElevation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view.setClipToOutline(false);
            view.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
            releaseBorderDrawer();
            this.borderDrawer = null;
        }
        view.invalidate();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setNeedClipping(boolean z) {
        DivBorderDrawer divBorderDrawer = this.borderDrawer;
        if (divBorderDrawer != null) {
            divBorderDrawer.setNeedClipping(z);
        }
        this.needClipping = z;
    }
}
