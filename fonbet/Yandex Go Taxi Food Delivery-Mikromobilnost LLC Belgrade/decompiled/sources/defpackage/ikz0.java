package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import defpackage.hkz0;
import defpackage.ikz0;
import java.util.ArrayList;
import ru.yandex.taxi.design.ButtonComponent;

/* loaded from: classes6.dex */
public final class ikz0 extends RecyclerView.Adapter {
    public final boolean a;
    public jhu0 c;
    public ArrayList b = new ArrayList();
    public sls w = new v4m0(3);

    public ikz0(boolean z) {
        this.a = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.w = new zgz0(2, recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        final hkz0 hkz0Var = (hkz0) x0Var;
        pkz0 pkz0Var = (pkz0) this.b.get(i);
        final ikz0 ikz0Var = hkz0Var.Q;
        ButtonComponent buttonComponent = hkz0Var.N;
        buttonComponent.setOnClickListener(new y7z0(1, hkz0Var, pkz0Var));
        qg qgVar = hkz0Var.P;
        boolean z = pkz0Var.b;
        qgVar.a = z;
        mkz0 mkz0Var = pkz0Var.d;
        if (mkz0Var instanceof kkz0) {
            kkz0 kkz0Var = (kkz0) mkz0Var;
            buttonComponent.setButtonBackground(kkz0Var.b);
            buttonComponent.setButtonTitleColor(kkz0Var.a);
            buttonComponent.setTextTypeface(kkz0Var.c);
        } else if (!(mkz0Var instanceof lkz0)) {
            w511.b();
            return;
        } else if (z) {
            buttonComponent.setButtonBackground(new bdc(xng0.controlMain));
            buttonComponent.setButtonTitleColor(new bdc(xng0.textOnControl));
            buttonComponent.setTextTypeface(3);
        } else {
            buttonComponent.setButtonBackground(new bdc(xng0.controlMinor));
            buttonComponent.setButtonTitleColor(new bdc(xng0.textOnControlMinor));
            buttonComponent.setTextTypeface(0);
        }
        buttonComponent.setText(pkz0Var.a);
        buttonComponent.setContentDescription(pkz0Var.a());
        rqb1 rqb1Var = pkz0Var.c;
        buttonComponent.setTextSize(0, rqb1Var instanceof okz0 ? ((okz0) rqb1Var).a : tje.r(mrg0.component_text_size_body, buttonComponent.getContext()));
        if (ikz0Var.a) {
            buttonComponent.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ru.yandex.taxi.widget.toggle_buttons.ToggleButtonsAdapter$ToggleButtonViewHolder$fitWidthAfterLayout$1
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    ViewGroup.LayoutParams layoutParams = hkz0.this.N.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                    if (marginLayoutParams != null) {
                        ikz0 ikz0Var2 = ikz0Var;
                        hkz0 hkz0Var2 = hkz0.this;
                        int intValue = ((((Number) ikz0Var2.w.invoke()).intValue() - (ikz0Var2.b.size() * marginLayoutParams.getMarginStart())) - (ikz0Var2.b.size() * marginLayoutParams.getMarginEnd())) / ikz0Var2.b.size();
                        if (hkz0Var2.N.getMeasuredWidth() < intValue) {
                            hkz0Var2.N.setWidth(intValue);
                        }
                    }
                    hkz0.this.N.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new hkz0(this, LayoutInflater.from(viewGroup.getContext()).inflate(zrh0.toggle_button_item_view, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(x0 x0Var) {
        ((hkz0) x0Var).O = new x5s0(16, this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(x0 x0Var) {
        ((hkz0) x0Var).O = new c90(23);
    }
}
