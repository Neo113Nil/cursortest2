package defpackage;

import com.yandex.go.taxi.order.models.api.response.OrderChangesDto;
import java.util.HashMap;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

/* loaded from: classes14.dex */
public final class d821 {
    public final b1 a;

    public d821(b1 b1Var) {
        this.a = b1Var;
    }

    public final void a(cc9 cc9Var, n821 n821Var) {
        zzs zzsVar;
        zzs zzsVar2;
        zzs zzsVar3;
        String str = cc9Var.c;
        String str2 = cc9Var.b.a;
        Integer num = null;
        OrderChangesDto.Status status = n821Var != null ? n821Var.a : null;
        int i = status == null ? -1 : c821.a[status.ordinal()];
        String str3 = (i == 1 || i == 2) ? "success" : i != 3 ? i != 4 ? "user" : "unavailable" : "failed";
        Double valueOf = (n821Var == null || (zzsVar3 = n821Var.b) == null) ? null : Double.valueOf(zzsVar3.a);
        Double valueOf2 = (n821Var == null || (zzsVar2 = n821Var.b) == null) ? null : Double.valueOf(zzsVar2.b);
        if (n821Var != null && (zzsVar = n821Var.b) != null) {
            num = Integer.valueOf(zzsVar.c);
        }
        b1 b1Var = this.a;
        b1Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("source", str);
        hashMap.put("p_type", str2);
        hashMap.put(CRLReasonCodeExtension.REASON, str3);
        if (valueOf != null) {
            hashMap.put("geo_lat", valueOf);
        }
        if (valueOf2 != null) {
            hashMap.put("geo_lon", valueOf2);
        }
        if (num != null) {
            hashMap.put("geo_accuracy", num);
        }
        b1Var.a.a("ChangeSourceConfirmationScreen.Closed", hashMap, 1, new HashMap());
    }
}
