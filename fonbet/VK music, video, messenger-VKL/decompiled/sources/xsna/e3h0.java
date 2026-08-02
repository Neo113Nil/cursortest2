package xsna;

import android.content.Context;
import com.vk.api.money.MoneySendTransfer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.money.MoneyReceiverInfo;
import com.vk.money.createtransfer.people.ReceiverType;
import java.util.LinkedHashMap;

/* compiled from: SbpToSbpTransferStrategy.kt */
/* loaded from: classes3.dex */
public final class e3h0 implements rjp0, w8i {
    @Override // xsna.rjp0
    public final void a(Context context, MoneySendTransfer moneySendTransfer, k9k k9kVar) {
        Integer g;
        Long k;
        LinkedHashMap<String, String> linkedHashMap = moneySendTransfer.j;
        String str = linkedHashMap.get("receiver_id");
        long longValue = (str == null || (k = cqm0.k(str)) == null) ? 0L : k.longValue();
        String str2 = linkedHashMap.get("amount");
        int intValue = (str2 == null || (g = cqm0.g(str2)) == null) ? 0 : g.intValue();
        String str3 = linkedHashMap.get("message");
        if (str3 == null) {
            str3 = "";
        }
        f3h0 f3h0Var = new f3h0(context);
        gzs<s3q0> gzsVar = fkq0.a;
        f3h0Var.a(new UserId(longValue), intValue, str3, new d3h0(k9kVar));
    }

    @Override // xsna.rjp0
    public final int c() {
        return ReceiverType.Sbp2Sbp.h();
    }

    @Override // xsna.rjp0
    public final MoneyReceiverInfo d(nl nlVar) {
        return nlVar.f();
    }
}
