package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.chargers.order.active.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.a;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes12.dex */
public final class fj70 extends lys {
    public static final /* synthetic */ int V = 0;
    public final ConstraintLayout S;
    public final d T;
    public dl9 U;

    public fj70(ConstraintLayout constraintLayout, d dVar) {
        super(constraintLayout);
        this.S = constraintLayout;
        this.T = dVar;
        int h = c.h(12, constraintLayout);
        constraintLayout.setId(View.generateViewId());
        constraintLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        constraintLayout.setPadding(h, 0, h, 0);
    }

    @Override // defpackage.wys
    public final void Y() {
        this.U = null;
        super.Y();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.CharSequence, kdc] */
    @Override // defpackage.wys
    public final void c(Object obj) {
        fj70 fj70Var;
        boolean z;
        dl9 dl9Var = (dl9) obj;
        List list = dl9Var.a;
        dl9 dl9Var2 = this.U;
        Object obj2 = null;
        List list2 = dl9Var2 != null ? dl9Var2.a : null;
        int size = list.size();
        ConstraintLayout constraintLayout = this.S;
        if (size == constraintLayout.getChildCount() && list2 != null) {
            ArrayList P0 = a.P0(list2, list);
            if (!P0.isEmpty()) {
                Iterator it = P0.iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    cl9 cl9Var = (cl9) pair.getFirst();
                    cl9 cl9Var2 = (cl9) pair.getSecond();
                    if (jl40.l(cl9Var.d, cl9Var2.d) && jl40.l(cl9Var.b, cl9Var2.b) && cl9Var.e == cl9Var2.e && cl9Var.f == cl9Var2.f) {
                    }
                }
            }
            c0(list);
            fj70Var = this;
            fj70Var.U = dl9Var;
        }
        if (list.size() == constraintLayout.getChildCount() && list2 != null) {
            ArrayList P02 = a.P0(list2, list);
            if (!P02.isEmpty()) {
                Iterator it2 = P02.iterator();
                while (it2.hasNext()) {
                    Pair pair2 = (Pair) it2.next();
                    if (!jl40.l(((cl9) pair2.getFirst()).b, ((cl9) pair2.getSecond()).b)) {
                    }
                }
            }
            fj70Var = this;
            constraintLayout.post(new sf30(24, new xw8(true, (Object) constraintLayout, (Object) fj70Var, (Object) list, 4)));
            fj70Var.U = dl9Var;
        }
        fj70Var = this;
        constraintLayout.removeAllViews();
        int i = mrg0.go_design_m_space;
        View view = fj70Var.a;
        int d = c.d(i, view);
        Iterator it3 = list.iterator();
        while (true) {
            ?? r7 = obj2;
            z = false;
            if (!it3.hasNext()) {
                break;
            }
            cl9 cl9Var3 = (cl9) it3.next();
            ButtonComponent buttonComponent = new ButtonComponent(constraintLayout.getContext(), null, 0, 6, null);
            buttonComponent.setId(View.generateViewId());
            buttonComponent.setOutline(0, r7);
            buttonComponent.setButtonSize(3);
            buttonComponent.setLayoutParams(new ConstraintLayout.LayoutParams(0, -1));
            buttonComponent.setRoundedCornersRadius(d);
            boolean z2 = cl9Var3.f;
            boolean z3 = cl9Var3.e;
            if (z2) {
                buttonComponent.setText((CharSequence) r7);
                buttonComponent.setTextIconPadding(0);
            } else {
                buttonComponent.setText(mcb1.b(buttonComponent, cl9Var3.a, "", 0, 12));
                buttonComponent.setTextIconPadding(tje.u(4, view.getContext()));
            }
            buttonComponent.setDebounceClickListener(new sd30(8, cl9Var3, fj70Var));
            buttonComponent.setPadding(0, 0, 0, 0);
            kdc kdcVar = cl9Var3.d;
            if (kdcVar != null) {
                buttonComponent.setButtonBackground(s8o.m(kdcVar, buttonComponent.getContext()));
                buttonComponent.setDisabledButtonBackground(s8o.m(kdcVar, buttonComponent.getContext()));
            }
            Bitmap bitmap = cl9Var3.c;
            buttonComponent.setTextIcon(bitmap != null ? new BitmapDrawable(buttonComponent.getResources(), bitmap) : r7);
            buttonComponent.setEnabled(z3);
            if (!z3) {
                buttonComponent.setAlpha(0.5f);
            }
            constraintLayout.addView(buttonComponent);
            obj2 = r7;
        }
        new xw8(z, constraintLayout, fj70Var, list, 4).invoke();
        fj70Var.U = dl9Var;
    }

    public final void c0(List list) {
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            cl9 cl9Var = (cl9) obj;
            View childAt = this.S.getChildAt(i);
            ButtonComponent buttonComponent = childAt instanceof ButtonComponent ? (ButtonComponent) childAt : null;
            if (buttonComponent != null) {
                if (cl9Var.f) {
                    buttonComponent.setText((CharSequence) null);
                    buttonComponent.setTextIconPadding(0);
                } else {
                    buttonComponent.setText(mcb1.b(buttonComponent, cl9Var.a, "", 0, 12));
                    buttonComponent.setTextIconPadding(c.g(4.0f, this.a));
                }
            }
            i = i2;
        }
    }
}
