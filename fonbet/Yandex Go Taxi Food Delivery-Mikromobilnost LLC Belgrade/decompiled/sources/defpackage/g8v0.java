package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.order.tariffs_suggest.ui.SuggestTariffCashbackView;
import defpackage.g8v0;
import ru.yandex.taxi.design.CheckBoxComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.design.utils.a;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes12.dex */
public final class g8v0 extends wys {
    public static final /* synthetic */ int Z = 0;
    public final ListItemComponent R;
    public final m2y S;
    public final m2y T;
    public final mfb U;
    public final zls V;
    public final a W;

    public g8v0(ListItemComponent listItemComponent, m2y m2yVar, m2y m2yVar2, mfb mfbVar, zls zlsVar, a aVar) {
        super(listItemComponent);
        this.R = listItemComponent;
        this.S = m2yVar;
        this.T = m2yVar2;
        this.U = mfbVar;
        this.V = zlsVar;
        this.W = aVar;
        listItemComponent.setUseAutoAccessibilityDelegate(false);
        listItemComponent.setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: com.yandex.go.order.tariffs_suggest.adapter.SuggestTariffViewHolder$1
            @Override // android.view.View.AccessibilityDelegate
            public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfo info) {
                super.onInitializeAccessibilityNodeInfo(host, info);
                info.setClassName("android.widget.CheckBox");
                info.setCheckable(true);
                info.setChecked(((CheckBoxComponent) g8v0.this.T.e).isChecked());
            }
        });
    }

    @Override // defpackage.wys
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public final void c(hp8 hp8Var) {
        DividerPosition dividerPosition = DividerPosition.TOP;
        DividerType dividerType = hp8Var.i;
        boolean z = hp8Var.l;
        boolean z2 = hp8Var.g;
        ListItemComponent listItemComponent = this.R;
        listItemComponent.setDividers(dividerPosition, dividerType);
        boolean z3 = hp8Var.h;
        listItemComponent.setEnabled(z3);
        listItemComponent.setContentDescription(hp8Var.k);
        listItemComponent.setTitle(hp8Var.c);
        listItemComponent.setSubtitle(hp8Var.d);
        m2y m2yVar = this.T;
        ((RobotoTextView) m2yVar.b).setText(hp8Var.e);
        String str = hp8Var.f;
        SuggestTariffCashbackView suggestTariffCashbackView = (SuggestTariffCashbackView) m2yVar.d;
        suggestTariffCashbackView.setVisibility(str != null ? 0 : 8);
        if (str != null) {
            suggestTariffCashbackView.setCashbackValue(str);
        }
        e0(z2, z3, z);
        listItemComponent.setTrailView((GoLinearLayout) m2yVar.c);
        m2y m2yVar2 = this.S;
        listItemComponent.setLeadView((GoConstraintLayout) m2yVar2.d);
        d0(hp8Var);
        e0(z2, z3, z);
        ((ImageView) m2yVar2.e).setImageDrawable(hp8Var.b.a);
        listItemComponent.setDebounceClickListener(new tpt0(13, this, hp8Var));
    }

    public final void d0(hp8 hp8Var) {
        gp8 gp8Var = hp8Var.b;
        RobotoTextView robotoTextView = (RobotoTextView) this.S.b;
        if (gp8Var.b == null) {
            robotoTextView.setVisibility(8);
            return;
        }
        Context context = robotoTextView.getContext();
        int u = tje.u(6, robotoTextView.getContext());
        View view = this.a;
        robotoTextView.setBackground(gtq0.v(this.W, context, u, new hgr0(c.j(0, view), tje.w(3, view.getContext()), tje.w(4, view.getContext()), qje.t(xng0.effectShadowBottom, view.getContext())), s8o.m(gp8Var.d, robotoTextView.getContext()), 8));
        robotoTextView.setPadding((int) tje.w(8, view.getContext()), (int) tje.w(2, view.getContext()), (int) tje.w(8, view.getContext()), (int) tje.w(8, view.getContext()));
        robotoTextView.setText(gp8Var.b);
        robotoTextView.setTextColor(gp8Var.c);
        robotoTextView.setVisibility(0);
    }

    public final void e0(boolean z, boolean z2, boolean z3) {
        Drawable t;
        mfb mfbVar = this.U;
        if (!z3 && z) {
            t = mfbVar.a();
        } else if (!z3 && !z) {
            t = mfbVar.b();
        } else if (z && !z2) {
            t = vng.t(mfbVar.e, mfbVar.a);
        } else if (z && z2) {
            t = vng.t(mfbVar.d, mfbVar.a);
        } else {
            t = vng.t(mfbVar.h, mfbVar.a);
        }
        m2y m2yVar = this.T;
        CheckBoxComponent checkBoxComponent = (CheckBoxComponent) m2yVar.e;
        CheckBoxComponent checkBoxComponent2 = (CheckBoxComponent) m2yVar.e;
        checkBoxComponent.setImageDrawable(t);
        checkBoxComponent2.setChecked(z);
        checkBoxComponent2.setEnabled(z2);
    }
}
