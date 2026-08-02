package defpackage;

import ru.yandex.taxi.search.fragment.AddressMapPickerFragment;

/* loaded from: classes6.dex */
public final /* synthetic */ class a01 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AddressMapPickerFragment b;

    public /* synthetic */ a01(AddressMapPickerFragment addressMapPickerFragment, int i) {
        this.a = i;
        this.b = addressMapPickerFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        AddressMapPickerFragment addressMapPickerFragment = this.b;
        switch (i) {
            case 0:
                addressMapPickerFragment.addressConfirmed();
                break;
            case 1:
                AddressMapPickerFragment.onUnsupportedTaxiAddress$lambda$0(addressMapPickerFragment);
                break;
            case 2:
                AddressMapPickerFragment.bindViewsInFields$lambda$0(addressMapPickerFragment);
                break;
            default:
                addressMapPickerFragment.onLocationClick(true);
                break;
        }
    }
}
