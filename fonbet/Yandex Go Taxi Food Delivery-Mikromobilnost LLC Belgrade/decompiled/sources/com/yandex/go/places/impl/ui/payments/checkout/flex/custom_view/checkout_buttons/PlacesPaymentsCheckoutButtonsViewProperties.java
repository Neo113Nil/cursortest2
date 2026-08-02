package com.yandex.go.places.impl.ui.payments.checkout.flex.custom_view.checkout_buttons;

import defpackage.gsq0;
import defpackage.qje;
import defpackage.zzs;
import kotlin.Metadata;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/impl/ui/payments/checkout/flex/custom_view/checkout_buttons/PlacesPaymentsCheckoutButtonsViewProperties;", "", "Companion", "$serializer", "com/yandex/go/places/impl/ui/payments/checkout/flex/custom_view/checkout_buttons/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PlacesPaymentsCheckoutButtonsViewProperties {
    public static final b Companion = new b();
    public final String a;
    public final double b;
    public final double c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final zzs h;

    public /* synthetic */ PlacesPaymentsCheckoutButtonsViewProperties(int i, String str, double d, double d2, String str2, String str3, String str4, String str5, zzs zzsVar) {
        if (127 != (i & HProv.PP_VERSION_TIMESTAMP)) {
            qje.Z(i, HProv.PP_VERSION_TIMESTAMP, PlacesPaymentsCheckoutButtonsViewProperties$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = d;
        this.c = d2;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        if ((i & 128) == 0) {
            this.h = new zzs(d, d2, 0, null, null, 28);
        } else {
            this.h = zzsVar;
        }
    }
}
