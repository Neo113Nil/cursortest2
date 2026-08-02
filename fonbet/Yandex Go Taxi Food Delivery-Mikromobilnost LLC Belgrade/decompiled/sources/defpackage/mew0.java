package defpackage;

import android.widget.LinearLayout;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.mainscreen.superapp.analytics.SuperappMainAnalytics$SearchBarTapSource;
import com.yandex.go.superapp.searchbar.impl.ui.searchbar.SuperappSearchbarButtonView;
import com.yandex.go.superapp.searchbar.impl.ui.searchbar.SuperappSearchbarView;
import java.util.ArrayList;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class mew0 implements udw0 {
    public final int a;
    public jew0 b;
    public final /* synthetic */ SuperappSearchbarView c;

    public mew0(SuperappSearchbarView superappSearchbarView) {
        this.c = superappSearchbarView;
        this.a = c.h(40, superappSearchbarView);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
    
        if (r1 == null) goto L40;
     */
    @Override // defpackage.eyi0
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void render(kew0 kew0Var) {
        Object obj;
        pav pavVar;
        ytz ytzVar;
        tls tlsVar;
        if (!(kew0Var instanceof jew0)) {
            this.b = null;
            return;
        }
        jew0 jew0Var = this.b;
        jew0 jew0Var2 = (jew0) kew0Var;
        CharSequence charSequence = jew0Var2.b;
        z2f0 z2f0Var = jew0Var2.a;
        this.b = jew0Var2;
        boolean l = jl40.l(jew0Var != null ? jew0Var.a : null, z2f0Var);
        int i = 8;
        SuperappSearchbarView superappSearchbarView = this.c;
        if (!l) {
            if (z2f0Var != null) {
                superappSearchbarView.getBinding().f.render(z2f0Var);
            }
            superappSearchbarView.getBinding().f.setVisibility(z2f0Var == null ? 8 : 0);
        }
        if (!jl40.l(jew0Var != null ? jew0Var.b : null, charSequence)) {
            superappSearchbarView.getBinding().e.setText(charSequence);
            RobotoTextView robotoTextView = superappSearchbarView.getBinding().e;
            if (charSequence != null && !evu0.J(charSequence)) {
                i = 0;
            }
            robotoTextView.setVisibility(i);
        }
        c.z(new gyt0(16, kew0Var, superappSearchbarView), superappSearchbarView);
        if (z2f0Var instanceof x2f0) {
            obj = ((x2f0) z2f0Var).c;
        } else if (z2f0Var instanceof y2f0) {
            obj = ((y2f0) z2f0Var).a;
        } else {
            if (z2f0Var != null) {
                w511.b();
                return;
            }
            obj = "";
        }
        String obj2 = charSequence != null ? charSequence.toString() : null;
        String obj3 = evu0.k0(obj + " " + (obj2 != null ? obj2 : "")).toString();
        if (!jl40.l(superappSearchbarView.getContentDescription(), obj3)) {
            superappSearchbarView.setContentDescription(obj3);
        }
        h(superappSearchbarView.getBinding().d, jew0Var2.d, SuperappMainAnalytics$SearchBarTapSource.ExpandedLeadButtons);
        h(superappSearchbarView.getBinding().g, jew0Var2.e, SuperappMainAnalytics$SearchBarTapSource.ExpandedTrailButtons);
        int abs = Math.abs(superappSearchbarView.getBinding().d.getChildCount() - superappSearchbarView.getBinding().g.getChildCount());
        int childCount = superappSearchbarView.getBinding().d.getChildCount();
        int childCount2 = superappSearchbarView.getBinding().g.getChildCount();
        int i2 = this.a;
        if (childCount > childCount2) {
            GoLinearLayout goLinearLayout = superappSearchbarView.getBinding().g;
            goLinearLayout.setPaddingRelative(i2 * abs, goLinearLayout.getPaddingTop(), goLinearLayout.getPaddingEnd(), goLinearLayout.getPaddingBottom());
        } else if (superappSearchbarView.getBinding().d.getChildCount() < superappSearchbarView.getBinding().g.getChildCount()) {
            GoLinearLayout goLinearLayout2 = superappSearchbarView.getBinding().d;
            goLinearLayout2.setPaddingRelative(goLinearLayout2.getPaddingStart(), goLinearLayout2.getPaddingTop(), i2 * abs, goLinearLayout2.getPaddingBottom());
        }
        iew0 iew0Var = jew0Var2.f;
        if (iew0Var != null) {
            SuperappSearchbarButtonView superappSearchbarButtonView = superappSearchbarView.getBinding().b;
            pavVar = superappSearchbarView.imageLoader;
            ytzVar = superappSearchbarView.lottieLoader;
            tlsVar = superappSearchbarView.lottieAnimationEndHandler;
            superappSearchbarButtonView.bind(iew0Var, pavVar, ytzVar, tlsVar, new gyt0(17, iew0Var, superappSearchbarView));
        }
    }

    public final void h(GoLinearLayout goLinearLayout, ArrayList arrayList, SuperappMainAnalytics$SearchBarTapSource superappMainAnalytics$SearchBarTapSource) {
        SuperappSearchbarView superappSearchbarView;
        pav pavVar;
        ytz ytzVar;
        tls tlsVar;
        while (goLinearLayout.getChildCount() > arrayList.size()) {
            goLinearLayout.removeViewAt(goLinearLayout.getChildCount() - 1);
        }
        int size = arrayList.size() - goLinearLayout.getChildCount();
        int i = 0;
        int i2 = 0;
        while (true) {
            superappSearchbarView = this.c;
            if (i2 >= size) {
                break;
            }
            SuperappSearchbarButtonView superappSearchbarButtonView = new SuperappSearchbarButtonView(superappSearchbarView.getContext(), null, 2, null);
            int i3 = this.a;
            goLinearLayout.addView(superappSearchbarButtonView, new LinearLayout.LayoutParams(i3, i3));
            i2++;
        }
        for (Object obj : arrayList) {
            int i4 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            iew0 iew0Var = (iew0) obj;
            SuperappSearchbarButtonView superappSearchbarButtonView2 = (SuperappSearchbarButtonView) goLinearLayout.getChildAt(i);
            pavVar = superappSearchbarView.imageLoader;
            ytzVar = superappSearchbarView.lottieLoader;
            tlsVar = superappSearchbarView.lottieAnimationEndHandler;
            superappSearchbarButtonView2.bind(iew0Var, pavVar, ytzVar, tlsVar, new xlp0(21, iew0Var, superappSearchbarView, superappMainAnalytics$SearchBarTapSource));
            i = i4;
        }
    }
}
