package defpackage;

import androidx.core.view.OneShotPreDrawListener;
import java.util.List;
import ru.yandex.taxi.scooters.presentation.ontheway.completion.completion_acceptance.ScootersCompletionAcceptanceModalView;

/* loaded from: classes6.dex */
public final class m8n0 implements p8n0 {
    public final /* synthetic */ ScootersCompletionAcceptanceModalView a;

    public m8n0(ScootersCompletionAcceptanceModalView scootersCompletionAcceptanceModalView) {
        this.a = scootersCompletionAcceptanceModalView;
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        k8n0 k8n0Var;
        n8n0 binding;
        n8n0 binding2;
        n8n0 binding3;
        x8n0 x8n0Var = (x8n0) obj;
        ScootersCompletionAcceptanceModalView scootersCompletionAcceptanceModalView = this.a;
        k8n0Var = scootersCompletionAcceptanceModalView.itemsAdapter;
        List list = x8n0Var.a;
        boolean z = x8n0Var.c;
        k8n0Var.submitList(list, null);
        binding = scootersCompletionAcceptanceModalView.getBinding();
        binding.c.setText(x8n0Var.b);
        binding2 = scootersCompletionAcceptanceModalView.getBinding();
        boolean z2 = (binding2.d.getVisibility() == 0) != z;
        binding3 = scootersCompletionAcceptanceModalView.getBinding();
        binding3.d.setVisibility(z ? 0 : 8);
        if (z2) {
            OneShotPreDrawListener.add(scootersCompletionAcceptanceModalView, new tqs(14, scootersCompletionAcceptanceModalView, scootersCompletionAcceptanceModalView));
        }
    }
}
