package com.ybsdk.widgets.common.bottombar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.core.common.domain.entities.BottomBarItemId;
import com.ybsdk.core.utils.text.d;
import defpackage.cma1;
import defpackage.dzh0;
import defpackage.fch0;
import defpackage.li91;
import defpackage.ny61;
import defpackage.poh0;
import defpackage.qb6;
import defpackage.tb6;
import defpackage.x161;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u000eR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/widgets/common/bottombar/BottomBarTabView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ltb6;", "tabState", "Lzy11;", "setAccessibilityDescription", "(Ltb6;)V", "", "isNameNoun", "(Ltb6;)Z", "getCurrentState", "()Ltb6;", ClidProvider.STATE, "render", "bottomBarTabState", "Ltb6;", "Lx161;", "binding", "Lx161;", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BottomBarTabView extends ConstraintLayout {
    private final x161 binding;
    private tb6 bottomBarTabState;

    public BottomBarTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(poh0.ybsdk_item_bottom_bar, this);
        int i2 = fch0.iconView;
        ImageView imageView = (ImageView) cma1.O(i2, this);
        if (imageView != null) {
            i2 = fch0.subText;
            TextView textView = (TextView) cma1.O(i2, this);
            if (textView != null) {
                this.binding = new x161(this, imageView, textView);
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    private final boolean isNameNoun(tb6 tb6Var) {
        qb6 qb6Var = BottomBarItemId.Companion;
        String str = tb6Var.a;
        qb6Var.getClass();
        return qb6.a(str) != BottomBarItemId.PAY;
    }

    private final void setAccessibilityDescription(tb6 tabState) {
        this.binding.c.setContentDescription(getContext().getString((isNameNoun(tabState) && tabState.d) ? dzh0.ybsdk_tab_bar_accessibility_noun_tab_selected : isNameNoun(tabState) ? dzh0.ybsdk_tab_bar_accessibility_noun_tab_not_selected : tabState.d ? dzh0.ybsdk_tab_bar_accessibility_verb_tab_selected : dzh0.ybsdk_tab_bar_accessibility_verb_tab_not_selected, d.a(getContext(), tabState.b)));
    }

    /* renamed from: getCurrentState, reason: from getter */
    public final tb6 getBottomBarTabState() {
        return this.bottomBarTabState;
    }

    public final void render(tb6 state) {
        boolean z = state.d;
        x161 x161Var = this.binding;
        this.bottomBarTabState = state;
        TextView textView = x161Var.c;
        ImageView imageView = x161Var.b;
        textView.setText(d.a(getContext(), state.b));
        Integer num = state.c;
        if (num != null) {
            imageView.setImageResource(num.intValue());
        }
        imageView.setSelected(z);
        x161Var.c.setSelected(z);
        setAccessibilityDescription(state);
        li91.j(this, state.f);
    }

    public BottomBarTabView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ BottomBarTabView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public BottomBarTabView(Context context) {
        this(context, null, 0, 6, null);
    }
}
