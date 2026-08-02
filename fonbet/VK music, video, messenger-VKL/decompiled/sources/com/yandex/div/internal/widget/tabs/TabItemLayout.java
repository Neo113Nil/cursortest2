package com.yandex.div.internal.widget.tabs;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.yandex.div.R$id;
import xsna.zcl;

/* compiled from: TabItemLayout.kt */
/* loaded from: classes7.dex */
public final class TabItemLayout extends LinearLayout {
    public TabItemLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setId(R$id.div_tabbed_tab_title_item);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        setOrientation(1);
        setGravity(0);
    }

    public /* synthetic */ TabItemLayout(Context context, AttributeSet attributeSet, int i, zcl zclVar) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
