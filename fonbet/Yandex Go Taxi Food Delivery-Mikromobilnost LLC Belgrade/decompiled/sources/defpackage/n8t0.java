package defpackage;

import com.yandex.go.something_wrong_screen.ui.SomethingWrongScreenModalView;
import defpackage.o8t0;
import defpackage.tje;
import defpackage.v8t0;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemSwitchComponent;

/* loaded from: classes13.dex */
public final class n8t0 implements r8t0 {
    public final /* synthetic */ SomethingWrongScreenModalView a;

    public n8t0(SomethingWrongScreenModalView somethingWrongScreenModalView) {
        this.a = somethingWrongScreenModalView;
    }

    @Override // defpackage.r8t0
    public final void U3(z8t0 z8t0Var) {
        final o8t0 binding;
        final SomethingWrongScreenModalView somethingWrongScreenModalView = this.a;
        binding = somethingWrongScreenModalView.getBinding();
        binding.d.setTitle(z8t0Var.a);
        binding.c.setText(z8t0Var.b);
        ListItemSwitchComponent listItemSwitchComponent = binding.e;
        listItemSwitchComponent.setTitle(z8t0Var.c);
        listItemSwitchComponent.setSubtitle(z8t0Var.d);
        listItemSwitchComponent.setLeadImage(f1h0.ic_shake_phone_24);
        listItemSwitchComponent.setChecked(z8t0Var.e);
        listItemSwitchComponent.setDebounceClickListener(new Runnable() { // from class: com.yandex.go.something_wrong_screen.ui.c
            @Override // java.lang.Runnable
            public final void run() {
                v8t0 v8t0Var;
                ListItemSwitchComponent listItemSwitchComponent2 = o8t0.this.e;
                listItemSwitchComponent2.setCheckedWithAnimation(!listItemSwitchComponent2.isChecked());
                v8t0Var = somethingWrongScreenModalView.presenter;
                tje.N(v8t0Var.Jg(), null, null, new SomethingWrongScreenPresenter$onToggleClick$1(v8t0Var, listItemSwitchComponent2.isChecked(), null), 3);
            }
        });
        ButtonComponent buttonComponent = binding.b;
        buttonComponent.setText(z8t0Var.f);
        buttonComponent.setDebounceClickListener(new epo0(28, somethingWrongScreenModalView, z8t0Var));
    }
}
