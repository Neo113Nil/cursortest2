package defpackage;

import ru.yandex.taxi.search.view.AddressSearchModalView;

/* loaded from: classes6.dex */
public final class p51 {
    public static AddressSearchModalView a(b61 b61Var) {
        AddressSearchModalView addressSearchModalView = new AddressSearchModalView(b61Var);
        addressSearchModalView.setOnKeyboardListener(new o51(addressSearchModalView, 0));
        return addressSearchModalView;
    }
}
