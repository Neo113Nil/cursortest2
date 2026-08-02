package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.navigator.gas_stations.analytics.a;

/* loaded from: classes12.dex */
public final /* synthetic */ class lvs implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Address c;

    public /* synthetic */ lvs(String str, Address address, int i) {
        this.a = i;
        this.b = str;
        this.c = address;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        wgu0 wgu0Var = wgu0.a;
        Address address = this.c;
        String str = this.b;
        hws hwsVar = (hws) obj;
        switch (i) {
            case 0:
                jws jwsVar = hwsVar.a;
                a aVar = jwsVar.J;
                (aVar != null ? aVar : null).c(str, "go_via");
                jws.P(jwsVar, new o8g0(new b8l0(new uhu0(wgu0Var)), address));
                break;
            default:
                jws jwsVar2 = hwsVar.a;
                a aVar2 = jwsVar2.J;
                (aVar2 != null ? aVar2 : null).c(str, "go_to");
                jws.P(jwsVar2, new o8g0(new b8l0(new vhu0(wgu0Var)), address));
                break;
        }
        return zy11Var;
    }
}
