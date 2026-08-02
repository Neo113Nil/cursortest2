package defpackage;

import ru.yandex.taxi.analytics.Events$Suggest$ZeroSuggestAdditionalTapArea;
import ru.yandex.taxi.preorder.suggested.selection.SuggestsView;
import ru.yandex.taxi.search.view.BaseAddressSearchView;

/* loaded from: classes6.dex */
public final class fx4 implements SuggestsView.a {
    public final /* synthetic */ BaseAddressSearchView a;

    public fx4(BaseAddressSearchView baseAddressSearchView) {
        this.a = baseAddressSearchView;
    }

    @Override // ru.yandex.taxi.preorder.suggested.selection.SuggestsView.a
    public final void L6(x9v0 x9v0Var) {
        this.a.onItemSelectedLongTap(x9v0Var);
    }

    @Override // ru.yandex.taxi.preorder.suggested.selection.SuggestsView.a
    public final void N0(int i) {
        this.a.onScrollToBottom(i);
    }

    @Override // ru.yandex.taxi.preorder.suggested.selection.SuggestsView.a
    public final void T8() {
        e8v0 e8v0Var;
        BaseAddressSearchView baseAddressSearchView = this.a;
        e8v0Var = baseAddressSearchView.suggestScrollKeyboardVisibilityExperimentRepository;
        if (((Boolean) e8v0Var.a.b()).booleanValue()) {
            baseAddressSearchView.closeKeyboard();
        }
    }

    @Override // ru.yandex.taxi.preorder.suggested.selection.SuggestsView.a
    public final void Ue(yn0 yn0Var, String str, String str2, Events$Suggest$ZeroSuggestAdditionalTapArea events$Suggest$ZeroSuggestAdditionalTapArea) {
        this.a.onAdditionalItemSelected(yn0Var, str, str2, events$Suggest$ZeroSuggestAdditionalTapArea);
    }

    @Override // ru.yandex.taxi.preorder.suggested.selection.SuggestsView.a
    public final void W0(x9v0 x9v0Var) {
        this.a.onDotsClicked(x9v0Var);
    }

    @Override // ru.yandex.taxi.preorder.suggested.selection.SuggestsView.a
    public final void Za(x9v0 x9v0Var) {
        this.a.onItemSelected(x9v0Var);
    }

    @Override // ru.yandex.taxi.preorder.suggested.selection.SuggestsView.a
    public final void Zd(String str, String str2) {
        this.a.onAdditionalItemShow(str, str2);
    }

    @Override // ru.yandex.taxi.preorder.suggested.selection.SuggestsView.a
    public final void bc(k8v0 k8v0Var) {
        this.a.onTrailAction(j8v0.a);
    }

    @Override // ru.yandex.taxi.preorder.suggested.selection.SuggestsView.a
    public final void s7(k8v0 k8v0Var) {
        this.a.onTrailButtonBind(j8v0.a);
    }

    @Override // ru.yandex.taxi.preorder.suggested.selection.SuggestsView.a
    public final void w6() {
        e8v0 e8v0Var;
        BaseAddressSearchView baseAddressSearchView = this.a;
        e8v0Var = baseAddressSearchView.suggestScrollKeyboardVisibilityExperimentRepository;
        if (((Boolean) e8v0Var.a.b()).booleanValue()) {
            baseAddressSearchView.requestActiveInputViewFocus();
        }
    }
}
