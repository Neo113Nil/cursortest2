package defpackage;

import com.yandex.go.taxi.order.change.source.mvp.UpdateSourcePointConfirmationModalView;
import ru.yandex.taxi.design.ButtonComponent;

/* loaded from: classes14.dex */
public final class h821 implements j821 {
    public final /* synthetic */ UpdateSourcePointConfirmationModalView a;

    public h821(UpdateSourcePointConfirmationModalView updateSourcePointConfirmationModalView) {
        this.a = updateSourcePointConfirmationModalView;
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        b821 binding;
        r821 r821Var = (r821) obj;
        binding = this.a.getBinding();
        binding.e.setText(r821Var.a);
        binding.d.setText(r821Var.b);
        ButtonComponent buttonComponent = binding.b;
        buttonComponent.setText(r821Var.c);
        boolean z = r821Var.d;
        buttonComponent.setClickable(!z);
        if (z) {
            buttonComponent.startAnimation();
        } else {
            buttonComponent.stopAnimation();
        }
    }
}
