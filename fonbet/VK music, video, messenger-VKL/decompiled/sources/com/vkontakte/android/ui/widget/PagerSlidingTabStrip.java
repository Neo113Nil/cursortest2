package com.vkontakte.android.ui.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import com.vk.typography.Font;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vkontakte.android.R;
import com.vkontakte.android.ui.widget.SubPagerOfList;
import java.util.ArrayList;
import xsna.cc90;
import xsna.cqi;
import xsna.dhr0;

/* loaded from: classes7.dex */
public class PagerSlidingTabStrip extends PagerSlidingTabStripBase implements SubPagerOfList.b {
    public static final /* synthetic */ int I = 0;
    public ViewPager H;

    public PagerSlidingTabStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Context context2 = getContext();
        Typeface a = cqi.a(Font.Companion, FontFamily.MEDIUM, 13.0f, context2);
        TextSizeUnit textSizeUnit = TextSizeUnit.SP;
        this.B = a;
        this.C = 0;
        g();
        cc90 cc90Var = new cc90(this);
        if (this.d == null) {
            this.d = new ArrayList();
        }
        this.d.add(cc90Var);
    }

    @Nullable
    private ViewGroup getTabsContainer() {
        View childAt = getChildCount() > 0 ? getChildAt(0) : null;
        if (childAt instanceof ViewGroup) {
            return (ViewGroup) childAt;
        }
        return null;
    }

    @Override // com.vkontakte.android.ui.widget.PagerSlidingTabStripBase, xsna.too0
    public final void Ng() {
        super.Ng();
        h(this.H.getCurrentItem());
    }

    @Override // com.vkontakte.android.ui.widget.PagerSlidingTabStripBase
    public final void f() {
        super.f();
        h(this.H.getCurrentItem());
    }

    public final void h(int i) {
        ViewGroup tabsContainer = getTabsContainer();
        if (tabsContainer == null) {
            return;
        }
        for (int childCount = tabsContainer.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = tabsContainer.getChildAt(childCount);
            if (childAt instanceof TextView) {
                if (childCount == i) {
                    ((TextView) childAt).setTextColor(dhr0.t.c(R.attr.vk_ui_text_primary));
                } else {
                    ((TextView) childAt).setTextColor(dhr0.t.c(R.attr.vk_ui_text_tertiary));
                }
            }
        }
    }

    @Override // com.vkontakte.android.ui.widget.PagerSlidingTabStripBase
    public void setViewPager(ViewPager viewPager) {
        this.H = viewPager;
        super.setViewPager(viewPager);
    }
}
