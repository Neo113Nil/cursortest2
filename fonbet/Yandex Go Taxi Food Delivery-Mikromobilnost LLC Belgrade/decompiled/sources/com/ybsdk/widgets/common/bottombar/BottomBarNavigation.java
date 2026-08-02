package com.ybsdk.widgets.common.bottombar;

import android.animation.AnimatorInflater;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.core.common.domain.entities.BottomBarItemId;
import defpackage.ar5;
import defpackage.cma1;
import defpackage.fch0;
import defpackage.j061;
import defpackage.jl40;
import defpackage.jr31;
import defpackage.k5;
import defpackage.ny61;
import defpackage.poh0;
import defpackage.rb6;
import defpackage.s5r;
import defpackage.smg0;
import defpackage.tb6;
import defpackage.tls;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.b;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u000eB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0015\u001a\u00020\u000b2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b0\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b0\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/ybsdk/widgets/common/bottombar/BottomBarNavigation;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bottomInset", "Lzy11;", "applyBottomInset", "(I)V", "Lrb6;", "bottomState", "render", "(Lrb6;)V", "Lkotlin/Function1;", "Ltb6;", "tabClick", "setOnTabClickListener", "(Ltls;)V", "Lcom/ybsdk/core/common/domain/entities/BottomBarItemId;", "tabId", "Lcom/ybsdk/widgets/common/bottombar/BottomBarTabView;", "getTab", "(Lcom/ybsdk/core/common/domain/entities/BottomBarItemId;)Lcom/ybsdk/widgets/common/bottombar/BottomBarTabView;", "onTabClickListener", "Ltls;", "Lj061;", "binding", "Lj061;", "Landroid/widget/LinearLayout$LayoutParams;", "layoutParamsForTab", "Landroid/widget/LinearLayout$LayoutParams;", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BottomBarNavigation extends ConstraintLayout {
    private final j061 binding;
    private final LinearLayout.LayoutParams layoutParamsForTab;
    private tls onTabClickListener;

    public static final class a implements tls {
        public static final a a = new a();

        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            return Boolean.valueOf(obj instanceof BottomBarTabView);
        }
    }

    public BottomBarNavigation(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View O;
        this.onTabClickListener = new ar5(22);
        LayoutInflater.from(context).inflate(poh0.ybsdk_buttom_nav_bar, this);
        int i2 = fch0.layoutNavBar;
        LinearLayout linearLayout = (LinearLayout) cma1.O(i2, this);
        if (linearLayout == null || (O = cma1.O((i2 = fch0.shandowView), this)) == null) {
            ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
            throw null;
        }
        this.binding = new j061(this, linearLayout, O);
        this.layoutParamsForTab = new LinearLayout.LayoutParams(-1, -2, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onTabClickListener$lambda$0(tb6 tb6Var) {
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$3$lambda$2(BottomBarTabView bottomBarTabView, BottomBarNavigation bottomBarNavigation, View view) {
        tb6 bottomBarTabState = bottomBarTabView.getBottomBarTabState();
        if (bottomBarTabState != null) {
            bottomBarNavigation.onTabClickListener.invoke(bottomBarTabState);
        }
    }

    public final void applyBottomInset(int bottomInset) {
        LinearLayout linearLayout = this.binding.b;
        linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), bottomInset);
    }

    public final BottomBarTabView getTab(BottomBarItemId tabId) {
        Object obj;
        s5r s5rVar = new s5r(b.g(new jr31(this.binding.b, 0), a.a));
        while (true) {
            if (!s5rVar.hasNext()) {
                break;
            }
            Object next = s5rVar.next();
            tb6 bottomBarTabState = ((BottomBarTabView) next).getBottomBarTabState();
            if (jl40.l(bottomBarTabState != null ? bottomBarTabState.a : null, tabId.getId())) {
                obj = next;
                break;
            }
        }
        return (BottomBarTabView) obj;
    }

    public final void render(rb6 bottomState) {
        LinearLayout linearLayout = this.binding.b;
        ArrayList arrayList = bottomState.a;
        int size = arrayList.size();
        for (int childCount = linearLayout.getChildCount(); childCount < size; childCount++) {
            BottomBarTabView bottomBarTabView = new BottomBarTabView(linearLayout.getContext(), null, 0, 6, null);
            linearLayout.addView(bottomBarTabView);
            bottomBarTabView.setLayoutParams(this.layoutParamsForTab);
            bottomBarTabView.setStateListAnimator(AnimatorInflater.loadStateListAnimator(linearLayout.getContext(), smg0.ybsdk_click_scale_tab_animator));
            bottomBarTabView.setOnClickListener(new k5(10, bottomBarTabView, this));
        }
        int childCount2 = linearLayout.getChildCount() - 1;
        int size2 = arrayList.size();
        if (size2 <= childCount2) {
            while (true) {
                linearLayout.removeView(linearLayout.getChildAt(childCount2));
                if (childCount2 == size2) {
                    break;
                } else {
                    childCount2--;
                }
            }
        }
        int childCount3 = linearLayout.getChildCount();
        for (int i = 0; i < childCount3; i++) {
            View childAt = linearLayout.getChildAt(i);
            BottomBarTabView bottomBarTabView2 = childAt instanceof BottomBarTabView ? (BottomBarTabView) childAt : null;
            if (bottomBarTabView2 != null) {
                bottomBarTabView2.render((tb6) arrayList.get(i));
            }
        }
    }

    public final void setOnTabClickListener(tls tabClick) {
        this.onTabClickListener = tabClick;
    }

    public BottomBarNavigation(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ BottomBarNavigation(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public BottomBarNavigation(Context context) {
        this(context, null, 0, 6, null);
    }
}
