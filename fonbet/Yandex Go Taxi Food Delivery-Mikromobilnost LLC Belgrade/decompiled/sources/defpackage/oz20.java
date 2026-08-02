package defpackage;

import ru.yandex.taxi.search.address.view.ModalSourceSearchView;
import ru.yandex.taxi.search.view.AddressSearchView;
import ru.yandex.taxi.search.view.BaseAddressSearchView;

/* loaded from: classes6.dex */
public final class oz20 extends b61 {
    public qz20 A;
    public boolean B;

    @Override // defpackage.b61, defpackage.zw4
    public final BaseAddressSearchView a() {
        return new ModalSourceSearchView(this);
    }

    @Override // defpackage.b61
    /* renamed from: d */
    public final AddressSearchView a() {
        return new ModalSourceSearchView(this);
    }
}
