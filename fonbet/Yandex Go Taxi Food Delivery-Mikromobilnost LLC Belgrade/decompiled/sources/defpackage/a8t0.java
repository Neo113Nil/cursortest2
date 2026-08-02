package defpackage;

import android.widget.ImageView;
import com.yandex.go.something_wrong_screen.ui.SomethingWrongOnboardingScreenModalView;
import ru.yandex.taxi.design.ListTitleComponent;

/* loaded from: classes13.dex */
public final class a8t0 implements t8t0 {
    public final /* synthetic */ SomethingWrongOnboardingScreenModalView a;

    public a8t0(SomethingWrongOnboardingScreenModalView somethingWrongOnboardingScreenModalView) {
        this.a = somethingWrongOnboardingScreenModalView;
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        b8t0 binding;
        pav pavVar;
        k7x0 k7x0Var;
        f8t0 f8t0Var = (f8t0) obj;
        SomethingWrongOnboardingScreenModalView somethingWrongOnboardingScreenModalView = this.a;
        binding = somethingWrongOnboardingScreenModalView.getBinding();
        ListTitleComponent listTitleComponent = binding.d;
        ImageView imageView = binding.c;
        listTitleComponent.setTitle(f8t0Var.a);
        String str = f8t0Var.b;
        if (str.length() == 0) {
            imageView.setVisibility(8);
            return;
        }
        pavVar = somethingWrongOnboardingScreenModalView.imageLoader;
        nac nacVar = (nac) pavVar.a(imageView);
        nacVar.i = new gas0(12, binding);
        k7x0Var = somethingWrongOnboardingScreenModalView.tagUrlFormatter;
        nacVar.c(((m7x0) k7x0Var).a(str));
    }

    @Override // defpackage.t8t0
    public final void requestFocus() {
        b8t0 binding;
        b8t0 binding2;
        SomethingWrongOnboardingScreenModalView somethingWrongOnboardingScreenModalView = this.a;
        binding = somethingWrongOnboardingScreenModalView.getBinding();
        xw31.w(binding.d);
        binding2 = somethingWrongOnboardingScreenModalView.getBinding();
        binding2.d.requestFocus();
    }
}
