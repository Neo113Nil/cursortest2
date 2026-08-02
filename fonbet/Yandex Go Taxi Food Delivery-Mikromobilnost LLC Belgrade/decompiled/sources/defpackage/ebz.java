package defpackage;

import android.graphics.drawable.Drawable;
import com.yandex.go.permission.location_with_agreement.ui.LocationPermissionWithAgreementModalView;

/* loaded from: classes13.dex */
public final /* synthetic */ class ebz implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ LocationPermissionWithAgreementModalView b;

    public /* synthetic */ ebz(LocationPermissionWithAgreementModalView locationPermissionWithAgreementModalView, int i) {
        this.a = i;
        this.b = locationPermissionWithAgreementModalView;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 agreement$lambda$0$0;
        zy11 iconImage$lambda$0;
        int i = this.a;
        LocationPermissionWithAgreementModalView locationPermissionWithAgreementModalView = this.b;
        switch (i) {
            case 0:
                agreement$lambda$0$0 = LocationPermissionWithAgreementModalView.setAgreement$lambda$0$0(locationPermissionWithAgreementModalView, (String) obj);
                return agreement$lambda$0$0;
            default:
                iconImage$lambda$0 = LocationPermissionWithAgreementModalView.setIconImage$lambda$0(locationPermissionWithAgreementModalView, (Drawable) obj);
                return iconImage$lambda$0;
        }
    }
}
