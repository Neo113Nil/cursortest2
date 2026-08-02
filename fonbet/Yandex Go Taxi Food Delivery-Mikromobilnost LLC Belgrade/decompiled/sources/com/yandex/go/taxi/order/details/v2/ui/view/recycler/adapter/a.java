package com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.b;
import com.yandex.go.taxi.order.details.v2.analytics.g;
import defpackage.ei;
import defpackage.h8;
import defpackage.jqs0;
import defpackage.ny61;
import defpackage.qk4;
import defpackage.qpk0;
import defpackage.wqs0;
import defpackage.xqs0;
import defpackage.xss0;
import defpackage.yck0;
import defpackage.yqs0;
import ru.yandex.taxi.superapp.orders.models.ActionAccessibilityType;

/* loaded from: classes14.dex */
public final class a extends qpk0 {
    public static final /* synthetic */ int U = 0;
    public final yqs0 R;
    public final g S;
    public jqs0 T;

    public a(yqs0 yqs0Var, g gVar) {
        super(yqs0Var.asView());
        this.R = yqs0Var;
        this.S = gVar;
    }

    @Override // defpackage.wys
    public final void Y() {
        super.Y();
        this.T = null;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        yck0 yck0Var = (yck0) obj;
        xqs0 xqs0Var = yck0Var.c;
        xss0 xss0Var = xqs0Var.a;
        wqs0 wqs0Var = xqs0Var.b;
        yqs0 yqs0Var = this.R;
        yqs0Var.render(xss0Var, wqs0Var);
        yqs0Var.renderLoading(yck0Var.e);
        yqs0Var.setAction(xss0Var.d, yck0Var.j);
        yqs0Var.renderBackground(yck0Var.d);
        yqs0Var.renderEnabled(yck0Var.f);
        c0(yck0Var.i);
        boolean z = yck0Var.g;
        jqs0 jqs0Var = this.T;
        if (jqs0Var != null) {
            jqs0Var.a = z;
        }
        qk4 qk4Var = yck0Var.h;
        yqs0Var.renderBadge(qk4Var != null ? qk4Var.a : null, qk4Var != null ? qk4Var.b : null, qk4Var != null ? qk4Var.c : null, qk4Var != null ? qk4Var.d : null);
        b0(new RideCardButtonsAdapter$ButtonUiStateViewHolder$bind$1(this, yck0Var, null));
    }

    public final void c0(ActionAccessibilityType actionAccessibilityType) {
        final boolean z = actionAccessibilityType == ActionAccessibilityType.CHECKBOX;
        View view = null;
        yqs0 yqs0Var = this.R;
        if (z) {
            this.T = new jqs0();
            b.p(yqs0Var.asView(), this.T);
        } else {
            this.T = null;
            b.p(yqs0Var.asView(), new ei(15));
        }
        final View asView = yqs0Var.asView();
        if (!asView.isAttachedToWindow()) {
            asView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.RideCardButtonsAdapter$ButtonUiStateViewHolder$bindAccessibilityType$$inlined$doOnAttach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view2) {
                    asView.removeOnAttachStateChangeListener(this);
                    ViewGroup viewGroup = view2 instanceof ViewGroup ? (ViewGroup) view2 : null;
                    if (viewGroup != null) {
                        h8 h8Var = new h8(3, viewGroup);
                        View view3 = (View) (h8Var.hasNext() ? h8Var.next() : null);
                        if (view3 == null) {
                            return;
                        }
                        if (z) {
                            ((ViewGroup) view2).setImportantForAccessibility(1);
                            view3.setImportantForAccessibility(2);
                        } else {
                            ((ViewGroup) view2).setImportantForAccessibility(2);
                            view3.setImportantForAccessibility(1);
                        }
                    }
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view2) {
                }
            });
            return;
        }
        ViewGroup viewGroup = asView instanceof ViewGroup ? (ViewGroup) asView : null;
        if (viewGroup != null) {
            if ((viewGroup.getChildCount() > 0) && (view = viewGroup.getChildAt(0)) == null) {
                ny61.s();
                return;
            }
            if (view == null) {
                return;
            }
            if (z) {
                ((ViewGroup) asView).setImportantForAccessibility(1);
                view.setImportantForAccessibility(2);
            } else {
                ((ViewGroup) asView).setImportantForAccessibility(2);
                view.setImportantForAccessibility(1);
            }
        }
    }
}
