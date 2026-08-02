package com.yandex.div.core.view2.divs.widgets;

import android.view.View;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div2.u1;

/* compiled from: DivBorderSupports.kt */
/* loaded from: classes7.dex */
public interface DivBorderSupports {
    DivBorderDrawer getDivBorderDrawer();

    boolean getNeedClipping();

    default void invalidateBorder() {
        DivBorderDrawer divBorderDrawer = getDivBorderDrawer();
        if (divBorderDrawer != null) {
            divBorderDrawer.invalidateBorder();
        }
    }

    default void onBoundsChanged(int i, int i2) {
        DivBorderDrawer divBorderDrawer = getDivBorderDrawer();
        if (divBorderDrawer != null) {
            divBorderDrawer.onBoundsChanged(i, i2);
        }
    }

    default void releaseBorderDrawer() {
        DivBorderDrawer divBorderDrawer = getDivBorderDrawer();
        if (divBorderDrawer != null) {
            divBorderDrawer.release();
        }
    }

    void setBorder(BindingContext bindingContext, u1 u1Var, View view);

    void setNeedClipping(boolean z);
}
