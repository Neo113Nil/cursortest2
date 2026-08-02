package defpackage;

import com.yandex.go.inapp_calls.ui.select.CallTypeSelectModalView;
import ru.yandex.taxi.design.ButtonComponent;

/* loaded from: classes12.dex */
public final class lk7 implements pk7 {
    public final /* synthetic */ CallTypeSelectModalView a;

    public lk7(CallTypeSelectModalView callTypeSelectModalView) {
        this.a = callTypeSelectModalView;
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        nk7 binding;
        nk7 binding2;
        nk7 binding3;
        nk7 binding4;
        nk7 binding5;
        nk7 binding6;
        nk7 binding7;
        bc bcVar = (bc) obj;
        CallTypeSelectModalView callTypeSelectModalView = this.a;
        binding = callTypeSelectModalView.getBinding();
        binding.f.setText((String) bcVar.a);
        binding2 = callTypeSelectModalView.getBinding();
        binding2.e.setText((String) bcVar.b);
        binding3 = callTypeSelectModalView.getBinding();
        ButtonComponent buttonComponent = binding3.c;
        sk7 sk7Var = (sk7) bcVar.w;
        buttonComponent.setText(mcb1.b(buttonComponent, (String) sk7Var.b, (String) sk7Var.c, 0, 12));
        md6 md6Var = (md6) sk7Var.w;
        buttonComponent.setButtonTitleColor((kdc) md6Var.c);
        buttonComponent.setButtonBackground((kdc) md6Var.b);
        binding4 = callTypeSelectModalView.getBinding();
        ButtonComponent buttonComponent2 = binding4.b;
        sk7 sk7Var2 = (sk7) bcVar.c;
        buttonComponent2.setText(mcb1.b(buttonComponent2, (String) sk7Var2.b, (String) sk7Var2.c, 0, 12));
        md6 md6Var2 = (md6) sk7Var2.w;
        buttonComponent2.setButtonTitleColor((kdc) md6Var2.c);
        buttonComponent2.setButtonBackground((kdc) md6Var2.b);
        ga0 ga0Var = (ga0) bcVar.x;
        binding5 = callTypeSelectModalView.getBinding();
        binding5.d.setVisibility(ga0Var == null ? 8 : 0);
        if (ga0Var == null) {
            return;
        }
        binding6 = callTypeSelectModalView.getBinding();
        binding6.d.setTitle(ga0Var.a);
        binding7 = callTypeSelectModalView.getBinding();
        binding7.d.setSubtitle(ga0Var.b);
    }
}
