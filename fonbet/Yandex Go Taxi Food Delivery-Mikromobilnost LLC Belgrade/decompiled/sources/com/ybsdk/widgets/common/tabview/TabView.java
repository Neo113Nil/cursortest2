package com.ybsdk.widgets.common.tabview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ybsdk.core.utils.ext.view.b;
import com.ybsdk.core.utils.text.d;
import defpackage.h8;
import defpackage.j5x0;
import defpackage.k5x0;
import defpackage.kp50;
import defpackage.lwg0;
import defpackage.nyg0;
import defpackage.p1i0;
import defpackage.scc;
import defpackage.tls;
import defpackage.vng;
import defpackage.wtn;
import defpackage.xty0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0002\u0019\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001b\u001a\u00020\u00152\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0004\b\u001b\u0010\u001cR0\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\u001cR\u0016\u0010\"\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/ybsdk/widgets/common/tabview/TabView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lk5x0;", "tab", "Landroid/widget/TextView;", "createVariantView", "(Lk5x0;)Landroid/widget/TextView;", "", "first", "last", "Landroid/widget/LinearLayout$LayoutParams;", "variantLayoutParams", "(ZZ)Landroid/widget/LinearLayout$LayoutParams;", "Lzy11;", "syncSelectedStatus", "()V", "Lkotlin/Function1;", "Lj5x0;", "update", "render", "(Ltls;)V", "onTabSelectedListener", "Ltls;", "getOnTabSelectedListener", "()Ltls;", "setOnTabSelectedListener", ClidProvider.STATE, "Lj5x0;", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TabView extends LinearLayout {
    private tls onTabSelectedListener;
    private j5x0 state;

    public TabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.state = j5x0.c;
        setClipToPadding(false);
        setClipToOutline(true);
        setBackground(vng.t(nyg0.ybsdk_background_tab_view, getContext()));
        setOrientation(0);
        setElevation(0.0f);
    }

    private final TextView createVariantView(k5x0 tab) {
        TextView textView = new TextView(new ContextThemeWrapper(getContext(), p1i0.YbSdk_Widget_WidgetsCommon_TabView_TextView));
        textView.setText(d.a(textView.getContext(), tab.a));
        textView.setBackground(vng.t(nyg0.ybsdk_background_tab_view_variant, textView.getContext()));
        textView.setGravity(17);
        textView.setElevation(kp50.t(b.h(lwg0.ybsdk_tab_elevation, textView)));
        textView.setPadding(b.h(lwg0.ybsdk_tab_horizontal_padding, textView), b.h(lwg0.ybsdk_tab_vertical_padding, textView), b.h(lwg0.ybsdk_tab_horizontal_padding, textView), kp50.r(14));
        xty0.b(textView);
        return textView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$3$lambda$2$lambda$1(TabView tabView, int i, View view) {
        j5x0 j5x0Var = tabView.state;
        tabView.state = new j5x0(j5x0Var.a, Integer.valueOf(i));
        tabView.syncSelectedStatus();
        Integer num = tabView.state.b;
        if (num != null) {
            int intValue = num.intValue();
            tls tlsVar = tabView.onTabSelectedListener;
            if (tlsVar != null) {
                tlsVar.invoke(tabView.state.a.get(intValue));
            }
        }
    }

    private final void syncSelectedStatus() {
        h8 h8Var = new h8(3, this);
        int i = 0;
        while (h8Var.hasNext()) {
            Object next = h8Var.next();
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            View view = (View) next;
            Integer num = this.state.b;
            view.setSelected(num != null && i == num.intValue());
            i = i2;
        }
    }

    private final LinearLayout.LayoutParams variantLayoutParams(boolean first, boolean last) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
        layoutParams.weight = 1.0f;
        layoutParams.setMargins(first ? b.h(lwg0.ybsdk_margin_tab_view_selector, this) : 0, b.h(lwg0.ybsdk_margin_tab_view_selector, this), last ? b.h(lwg0.ybsdk_margin_tab_view_selector, this) : 0, b.h(lwg0.ybsdk_margin_tab_view_selector, this));
        return layoutParams;
    }

    public final tls getOnTabSelectedListener() {
        return this.onTabSelectedListener;
    }

    public final void render(tls update) {
        j5x0 j5x0Var = this.state;
        List list = j5x0Var.a;
        j5x0 j5x0Var2 = (j5x0) update.invoke(j5x0Var);
        this.state = j5x0Var2;
        if (j5x0Var2.a.equals(list)) {
            return;
        }
        removeAllViews();
        int i = 0;
        for (Object obj : this.state.a) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            TextView createVariantView = createVariantView((k5x0) obj);
            createVariantView.setOnClickListener(new wtn(this, i, 8));
            boolean z = true;
            boolean z2 = i == 0;
            if (i != scc.f(this.state.a)) {
                z = false;
            }
            addView(createVariantView, variantLayoutParams(z2, z));
            i = i2;
        }
        syncSelectedStatus();
    }

    public final void setOnTabSelectedListener(tls tlsVar) {
        this.onTabSelectedListener = tlsVar;
    }

    public TabView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ TabView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public TabView(Context context) {
        this(context, null, 0, 6, null);
    }
}
