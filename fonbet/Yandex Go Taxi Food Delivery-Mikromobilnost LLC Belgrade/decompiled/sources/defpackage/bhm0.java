package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.yandex.div.core.state.b;
import com.yandex.div.core.view2.Div2View;
import com.yandex.payment.divkit.sbp.DKSbpSearchBankLayout;

/* loaded from: classes2.dex */
public final class bhm0 implements plk {
    public final iu31 b;

    public bhm0(iu31 iu31Var) {
        this.b = iu31Var;
    }

    @Override // defpackage.plk
    public final void bindView(View view, clk clkVar, Div2View div2View, rvo rvoVar, b bVar) {
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        if (childCount < 0) {
            return;
        }
        int i = 0;
        while (true) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof DKSbpSearchBankLayout) {
                this.b.a.invoke((ViewGroup) childAt);
            }
            if (i == childCount) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.plk
    public final View createView(clk clkVar, Div2View div2View, rvo rvoVar, b bVar) {
        FrameLayout frameLayout = new FrameLayout(div2View.getContext());
        if (jl40.l(clkVar.j, "search_field")) {
            DKSbpSearchBankLayout dKSbpSearchBankLayout = new DKSbpSearchBankLayout(div2View.getContext(), null, 2, null);
            dKSbpSearchBankLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            frameLayout.addView(dKSbpSearchBankLayout);
        }
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // defpackage.plk
    public final boolean isCustomTypeSupported(String str) {
        return str.equals("search_field");
    }

    @Override // defpackage.plk
    public final f5l preload(clk clkVar, c5l c5lVar) {
        return ngd0.x;
    }

    @Override // defpackage.plk
    public final void release(View view, clk clkVar) {
    }
}
