package defpackage;

import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.feature.partnerselection.api.PartnerSelectionFeature$Companion$Entry;
import com.ybsdk.feature.transfer.version2.internal.screens.main.presentation.a;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final /* synthetic */ class fl01 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ fl01(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        r0 r0Var;
        Object value;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                pz40 Y = aVar.Y();
                do {
                    r0Var = (r0) Y;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, zk01.c((xk01) value, new ri01(13))));
            case 1:
                aVar.g0();
                break;
            case 2:
                if (zk01.b((xk01) aVar.X()) != null) {
                    aVar.Z(ml01.a);
                    break;
                }
                break;
            default:
                aVar.o0();
                qj01 qj01Var = aVar.V;
                em3 em3Var = qj01Var.a.q0;
                String str = qj01Var.b;
                String str2 = qj01Var.c;
                String str3 = qj01Var.d;
                LinkedHashMap w = g8e.w(3, "transfer_session_id", str);
                if (str2 != null) {
                    w.put("transfer_direction", str2);
                }
                if (str3 != null) {
                    w.put("transfer_scenario", str3);
                }
                com.ybsdk.core.analytics.a aVar2 = em3Var.a;
                byte[] bArr = y5e.X;
                byte[] bArr2 = new byte[27];
                for (int i2 = 0; i2 < 27; i2++) {
                    bArr2[i2] = (byte) (bArr[i2] ^ y5e.c[i2 % 8]);
                }
                aVar2.a(new String(bArr2, uza.a), w);
                wk01 b = zk01.b((xk01) aVar.X());
                if (b != null) {
                    String str4 = b.w;
                    if (str4 == null) {
                        x4c.g("Phone number is null", null, null, Collections.singletonList(orp0.e), 6);
                        break;
                    } else {
                        String str5 = b.J;
                        ai90 ai90Var = aVar.M;
                        String str6 = b.g.a;
                        PartnerSelectionFeature$Companion$Entry partnerSelectionFeature$Companion$Entry = PartnerSelectionFeature$Companion$Entry.TRANSFER;
                        MoneyEntity moneyEntity = new MoneyEntity(b.d, b.c, "");
                        String str7 = b.e;
                        String h0 = aVar.h0();
                        eh01 eh01Var = b.p;
                        aVar.C.h(o791.j(ai90Var, str4, str6, partnerSelectionFeature$Companion$Entry, moneyEntity, str7, eh01Var != null ? eh01Var.a : null, h0, b.a, str5, 128));
                        break;
                    }
                }
                break;
        }
        return zy11Var;
    }
}
