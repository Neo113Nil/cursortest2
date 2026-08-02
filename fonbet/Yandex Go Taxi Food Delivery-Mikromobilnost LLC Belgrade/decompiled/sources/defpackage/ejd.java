package defpackage;

import ru.yandex.taxi.search.address.view.CompositeAddressSearchView;

/* loaded from: classes6.dex */
public final /* synthetic */ class ejd implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ CompositeAddressSearchView b;

    public /* synthetic */ ejd(CompositeAddressSearchView compositeAddressSearchView, int i) {
        this.a = i;
        this.b = compositeAddressSearchView;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 inputListeners$lambda$0;
        yy4 yy4Var;
        int i = this.a;
        CompositeAddressSearchView compositeAddressSearchView = this.b;
        switch (i) {
            case 0:
                inputListeners$lambda$0 = CompositeAddressSearchView.setInputListeners$lambda$0(compositeAddressSearchView);
                return inputListeners$lambda$0;
            default:
                yy4Var = compositeAddressSearchView.presenter;
                yy4Var.dh();
                return zy11.a;
        }
    }
}
