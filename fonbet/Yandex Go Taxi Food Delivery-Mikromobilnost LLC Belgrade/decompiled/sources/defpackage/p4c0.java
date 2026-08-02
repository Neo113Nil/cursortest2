package defpackage;

import com.yandex.go.places.address.loader.impl.modal.PlacesAddressLoaderModalView;

/* loaded from: classes13.dex */
public final /* synthetic */ class p4c0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PlacesAddressLoaderModalView b;

    public /* synthetic */ p4c0(PlacesAddressLoaderModalView placesAddressLoaderModalView, int i) {
        this.a = i;
        this.b = placesAddressLoaderModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        PlacesAddressLoaderModalView placesAddressLoaderModalView = this.b;
        switch (i) {
            case 0:
                PlacesAddressLoaderModalView.setupButtons$lambda$0$0(placesAddressLoaderModalView);
                break;
            case 1:
                PlacesAddressLoaderModalView.setupButtons$lambda$0$1(placesAddressLoaderModalView);
                break;
            case 2:
                PlacesAddressLoaderModalView.setupButtons$lambda$0$2(placesAddressLoaderModalView);
                break;
            case 3:
                PlacesAddressLoaderModalView.animateButtonOnCancellation$lambda$0$0$0(placesAddressLoaderModalView);
                break;
            default:
                PlacesAddressLoaderModalView.animateButtonOnCancellation$lambda$0(placesAddressLoaderModalView);
                break;
        }
    }
}
