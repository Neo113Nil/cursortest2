package defpackage;

import com.yandex.go.places.impl.ui.payments.info.PaymentsInfoModalView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class ana0 implements dna0 {
    public final /* synthetic */ PaymentsInfoModalView a;

    public ana0(PaymentsInfoModalView paymentsInfoModalView) {
        this.a = paymentsInfoModalView;
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        fna0 fna0Var;
        bna0 binding;
        hna0 hna0Var = (hna0) obj;
        PaymentsInfoModalView paymentsInfoModalView = this.a;
        fna0Var = paymentsInfoModalView.presenter;
        String str = fna0Var.z.c.j;
        binding = paymentsInfoModalView.getBinding();
        RobotoTextView robotoTextView = binding.g;
        String str2 = hna0Var.b;
        boolean z = hna0Var.c;
        robotoTextView.setText(str2);
        RobotoTextView robotoTextView2 = binding.g;
        String str3 = hna0Var.b;
        robotoTextView2.setVisibility((str3 == null || str3.length() == 0) ? 8 : 0);
        RobotoTextView robotoTextView3 = binding.h;
        StringBuilder sb = new StringBuilder();
        sb.append(hna0Var.a);
        String str4 = PaymentsInfoModalView.NBSP_DASH + str;
        if (str == null || evu0.J(str) || !z) {
            str4 = null;
        }
        if (str4 == null) {
            str4 = "";
        }
        sb.append(str4);
        robotoTextView3.setText(sb.toString());
        binding.f.setVisibility(z ? 0 : 8);
        binding.c.setVisibility(z ? 0 : 8);
    }
}
