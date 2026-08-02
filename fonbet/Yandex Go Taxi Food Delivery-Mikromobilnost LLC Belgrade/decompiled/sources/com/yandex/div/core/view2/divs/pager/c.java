package com.yandex.div.core.view2.divs.pager;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.view2.f;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivPager$ItemAlignment;
import defpackage.aw5;
import defpackage.egk;
import defpackage.hgk;
import defpackage.kjk;
import defpackage.m3k;
import defpackage.rvo;
import defpackage.sls;
import defpackage.wfx;

/* loaded from: classes.dex */
public final class c extends kjk {
    public static final /* synthetic */ int W = 0;
    public final aw5 S;
    public final DivPagerPageLayout T;
    public final sls U;
    public final sls V;

    public c(aw5 aw5Var, DivPagerPageLayout divPagerPageLayout, hgk hgkVar, f fVar, sls slsVar, sls slsVar2) {
        super(divPagerPageLayout, aw5Var, hgkVar, fVar);
        this.S = aw5Var;
        this.T = divPagerPageLayout;
        this.U = slsVar;
        this.V = slsVar2;
        divPagerPageLayout.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerViewHolder$special$$inlined$doOnEveryDetach$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                c cVar = c.this;
                int i = c.W;
                m3k m3kVar = cVar.R;
                if (m3kVar == null) {
                    return;
                }
                cVar.S.a.getDiv2Component().G().h(c.this.S, view, m3kVar);
            }
        });
    }

    @Override // defpackage.kjk
    public final void W(aw5 aw5Var, m3k m3kVar, int i, com.yandex.div.core.state.b bVar) {
        Enum r3;
        super.W(aw5Var, m3kVar, i, bVar);
        DivPagerPageLayout divPagerPageLayout = this.T;
        View child = divPagerPageLayout.getChild();
        ViewGroup.LayoutParams layoutParams = child != null ? child.getLayoutParams() : null;
        DivLayoutParams divLayoutParams = layoutParams instanceof DivLayoutParams ? (DivLayoutParams) layoutParams : null;
        if (divLayoutParams != null) {
            egk d = m3kVar.d();
            rvo rvoVar = aw5Var.b;
            DivPagerAdapter$onCreateViewHolder$1 divPagerAdapter$onCreateViewHolder$1 = (DivPagerAdapter$onCreateViewHolder$1) this.U;
            Expression o = ((Boolean) divPagerAdapter$onCreateViewHolder$1.invoke()).booleanValue() ? d.o() : d.h();
            if (o == null || (r3 = (Enum) o.a(rvoVar)) == null) {
                r3 = ((DivPagerAdapter$onCreateViewHolder$2) this.V).this$0.I;
            }
            int i2 = 17;
            if (((Boolean) divPagerAdapter$onCreateViewHolder$1.invoke()).booleanValue()) {
                if (r3 != DivPager$ItemAlignment.CENTER && r3 != DivAlignmentVertical.CENTER) {
                    i2 = (r3 == DivPager$ItemAlignment.END || r3 == DivAlignmentVertical.BOTTOM) ? 80 : 48;
                }
            } else if (r3 != DivPager$ItemAlignment.CENTER && r3 != DivAlignmentHorizontal.CENTER) {
                i2 = (r3 == DivPager$ItemAlignment.END || r3 == DivAlignmentHorizontal.END) ? 8388613 : r3 == DivAlignmentHorizontal.LEFT ? 3 : r3 == DivAlignmentHorizontal.RIGHT ? 5 : 8388611;
            }
            divLayoutParams.setGravity(i2);
            divPagerPageLayout.requestLayout();
        }
    }

    @Override // defpackage.kjk
    public final void X() {
        int i = wfx.a;
    }
}
