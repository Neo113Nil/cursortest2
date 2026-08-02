package defpackage;

import com.yandex.go.mob.HostMobSupportedApiNames;
import com.ybsdk.core.common.data.network.dto.nfc.NfcInfoDto;
import com.ybsdk.core.common.data.network.dto.nfc.NfcProductTypeDto;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.a;
import ru.yandex.taxi.network.api.models.GoApiName;

/* loaded from: classes8.dex */
public final class lot implements p8w {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ lot(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.p8w
    public final kvj0 intercept(m8w m8wVar) {
        String c;
        HostMobSupportedApiNames hostMobSupportedApiNames;
        iq20 a;
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ju6 ju6Var = (ju6) obj;
                zci0 zci0Var = (zci0) m8wVar;
                d5j0 d5j0Var = zci0Var.e;
                GoApiName goApiName = (GoApiName) obj2;
                switch (kot.a[goApiName.ordinal()]) {
                    case 1:
                        c = ((not) ju6Var).c();
                        break;
                    case 2:
                        c = ((not) ju6Var).d();
                        break;
                    case 3:
                        not notVar = (not) ju6Var;
                        notVar.getClass();
                        HostMobSupportedApiNames hostMobSupportedApiNames2 = HostMobSupportedApiNames.BILLING;
                        notVar.c.getClass();
                        c = notVar.f(hostMobSupportedApiNames2, "https://pcidss.yandex.net/api/");
                        break;
                    case 4:
                        not notVar2 = (not) ju6Var;
                        notVar2.getClass();
                        HostMobSupportedApiNames hostMobSupportedApiNames3 = HostMobSupportedApiNames.BILLING_INTERNATIONAL;
                        notVar2.c.getClass();
                        c = notVar2.f(hostMobSupportedApiNames3, "https://api.diehard.yango.com/api/");
                        break;
                    case 5:
                    case 6:
                        return zci0Var.b(d5j0Var);
                    default:
                        w511.b();
                        return null;
                }
                if (!evu0.y(c, d5j0Var.a.d, false)) {
                    return zci0Var.b(d5j0Var);
                }
                t4j0 b = d5j0Var.b();
                b.g(HostMobSupportedApiNames.class, q5z.c(goApiName));
                return zci0Var.b(new d5j0(b));
            case 1:
                zci0 zci0Var2 = (zci0) m8wVar;
                d5j0 d5j0Var2 = zci0Var2.e;
                if (((x6v) d5j0Var2.c(x6v.class)) == null && (hostMobSupportedApiNames = (HostMobSupportedApiNames) d5j0Var2.c(HostMobSupportedApiNames.class)) != null && (a = ((nle) obj2).a(hostMobSupportedApiNames)) != null) {
                    pr20 pr20Var = a.a;
                    kwu kwuVar = d5j0Var2.a;
                    String K = cvw.K(pr20Var);
                    oq20 oq20Var = a.b;
                    Map map = a.c;
                    String a2 = ((wot) obj).a(d5j0Var2);
                    y6v y6vVar = (y6v) d5j0Var2.c(y6v.class);
                    jwu g = kwuVar.g();
                    g.h(K);
                    g.g(a2);
                    if (y6vVar == null) {
                        for (Pair pair : oq20Var.a) {
                            g.p((String) pair.getFirst(), (String) pair.getSecond());
                        }
                    }
                    kwu e = g.e();
                    t4j0 b2 = d5j0Var2.b();
                    b2.a = e;
                    for (Map.Entry entry : map.entrySet()) {
                        b2.d((String) entry.getKey(), (String) entry.getValue());
                    }
                    if (pr20Var.b) {
                        b2.d("Host", pr20Var.a.d);
                    }
                    return zci0Var2.b(new d5j0(b2));
                }
                return zci0Var2.b(d5j0Var2);
            default:
                zci0 zci0Var3 = (zci0) m8wVar;
                d5j0 d5j0Var3 = zci0Var3.e;
                boolean a3 = ((csu) obj2).a(d5j0Var3.a.d);
                NfcInfoDto nfcInfoDto = ((q860) obj).a;
                if (!a3 || nfcInfoDto == null) {
                    return zci0Var3.b(d5j0Var3);
                }
                t4j0 b3 = d5j0Var3.b();
                b3.d(yu50.h, String.valueOf(nfcInfoDto.isNfcAvailable()));
                b3.d(yu50.i, String.valueOf(nfcInfoDto.isNfcPaymentSetup()));
                b3.d(yu50.j, String.valueOf(nfcInfoDto.isNfcPaymentDefault()));
                List<NfcProductTypeDto> tokenizedProductTypes = nfcInfoDto.getTokenizedProductTypes();
                List<NfcProductTypeDto> list = tokenizedProductTypes;
                if (list != null && !list.isEmpty()) {
                    b3.d(yu50.k, a.X(tokenizedProductTypes, null, null, null, null, 63));
                }
                NfcProductTypeDto defaultNfcProductType = nfcInfoDto.getDefaultNfcProductType();
                if (defaultNfcProductType != null) {
                    b3.d(yu50.l, defaultNfcProductType.name());
                }
                return zci0Var3.b(new d5j0(b3));
        }
    }
}
