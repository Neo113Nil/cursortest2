package defpackage;

import com.yandex.go.chargers.order.active.ChargersActiveOrderModalView;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes12.dex */
public final class mk9 implements pk9 {
    public final /* synthetic */ ChargersActiveOrderModalView a;

    public mk9(ChargersActiveOrderModalView chargersActiveOrderModalView) {
        this.a = chargersActiveOrderModalView;
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        nk9 binding;
        FloatButtonIconComponent floatButtonIconComponent;
        xx9 xx9Var;
        ck9 ck9Var;
        g18 g18Var;
        pav pavVar;
        nk9 binding2;
        gl9 gl9Var = (gl9) obj;
        ChargersActiveOrderModalView chargersActiveOrderModalView = this.a;
        binding = chargersActiveOrderModalView.getBinding();
        floatButtonIconComponent = chargersActiveOrderModalView.backButton;
        xx9Var = chargersActiveOrderModalView.chargersEnvironmentRepository;
        xx9Var.a.getClass();
        floatButtonIconComponent.setVisibility(0);
        chargersActiveOrderModalView.setupTabs(gl9Var.e);
        ck9Var = chargersActiveOrderModalView.itemsAdapter;
        ck9Var.submitList(gl9Var.b, null);
        RobotoTextView robotoTextView = binding.d;
        xk9 xk9Var = gl9Var.a;
        robotoTextView.setText(xk9Var.a.a);
        RobotoTextView robotoTextView2 = binding.b;
        yk9 yk9Var = xk9Var.b;
        CharSequence charSequence = yk9Var.a;
        String str = yk9Var.b;
        robotoTextView2.setText(charSequence);
        g18Var = chargersActiveOrderModalView.imageRequestCancellable;
        if (g18Var != null) {
            g18Var.cancel();
        }
        if (str != null) {
            pavVar = chargersActiveOrderModalView.imageLoader;
            binding2 = chargersActiveOrderModalView.getBinding();
            chargersActiveOrderModalView.imageRequestCancellable = ((nac) pavVar.a(binding2.c)).c(str);
        }
    }
}
