package defpackage;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.ui.ActionButtonsState;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.ui.VerticalHubV1ModalView;
import java.util.ArrayList;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes14.dex */
public final class fc31 implements lc31 {
    public final /* synthetic */ VerticalHubV1ModalView a;

    public fc31(VerticalHubV1ModalView verticalHubV1ModalView) {
        this.a = verticalHubV1ModalView;
    }

    @Override // defpackage.lc31
    public final void X6(rc31 rc31Var, rc31 rc31Var2) {
        xb31 binding;
        xb31 binding2;
        t1w currentInsets;
        xb31 binding3;
        xb31 binding4;
        h0s h0sVar;
        ActionButtonsState actionButtonsState = rc31Var2.a;
        z9o z9oVar = rc31Var2.e;
        VerticalHubV1ModalView verticalHubV1ModalView = this.a;
        if (rc31Var == null || !jl40.l(rc31Var.a, actionButtonsState)) {
            verticalHubV1ModalView.renderActionButtons(actionButtonsState);
        }
        gyu gyuVar = rc31Var2.d;
        if (rc31Var == null || !jl40.l(rc31Var.d, gyuVar)) {
            verticalHubV1ModalView.renderFooter(gyuVar);
        }
        if (rc31Var == null || !jl40.l(rc31Var.e, z9oVar)) {
            verticalHubV1ModalView.renderErrorState(z9oVar);
        }
        ArrayList arrayList = rc31Var2.b;
        if (rc31Var == null || !rc31Var.b.equals(arrayList)) {
            verticalHubV1ModalView.renderHubItems(arrayList, new a621(1, rc31Var2, verticalHubV1ModalView));
        }
        ThemeType themeType = (rc31Var == null || (h0sVar = rc31Var.c) == null) ? null : h0sVar.b;
        h0s h0sVar2 = rc31Var2.c;
        if (themeType != h0sVar2.b) {
            verticalHubV1ModalView.renderShadow(h0sVar2);
        }
        if (z9oVar != null) {
            binding3 = verticalHubV1ModalView.getBinding();
            xw31.I(binding3.c, null, null, null, Integer.valueOf(tje.u(70, verticalHubV1ModalView.getContext())));
            binding4 = verticalHubV1ModalView.getBinding();
            xw31.I(binding4.d, null, null, null, 0);
        } else {
            binding = verticalHubV1ModalView.getBinding();
            xw31.I(binding.c, null, null, null, 0);
            binding2 = verticalHubV1ModalView.getBinding();
            xw31.I(binding2.d, null, null, null, Integer.valueOf(tje.u(130, verticalHubV1ModalView.getContext())));
        }
        verticalHubV1ModalView.updateModalState();
        currentInsets = verticalHubV1ModalView.getCurrentInsets();
        verticalHubV1ModalView.applyInsets(currentInsets);
    }

    @Override // defpackage.lc31
    public final void expand() {
        this.a.expand();
    }
}
