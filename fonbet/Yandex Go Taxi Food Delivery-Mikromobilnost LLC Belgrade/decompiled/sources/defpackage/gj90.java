package defpackage;

import com.ybsdk.core.transfer.utils.domain.entities.PartnerEntity;
import com.ybsdk.feature.partnerselection.internal.screens.partners.presentation.PartnersFragment;
import com.ybsdk.feature.partnerselection.internal.screens.partners.presentation.c;
import com.ybsdk.feature.transfer.version2.internal.screens.phone.receivername.b;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final /* synthetic */ class gj90 implements dms {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gj90(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        r0 r0Var;
        Object value;
        int i;
        r0 r0Var2;
        Object value2;
        int i2 = this.a;
        String str = null;
        zy11 zy11Var = zy11.a;
        Object obj6 = this.b;
        switch (i2) {
            case 0:
                c cVar = (c) obj6;
                PartnersFragment.Arguments arguments = cVar.C;
                String str2 = cVar.H;
                Throwable th = (Throwable) obj2;
                String str3 = (String) obj3;
                br51 br51Var = (br51) obj5;
                us3 us3Var = cVar.B;
                if (br51Var == null) {
                    if (str3 != null) {
                        str = str3;
                    } else if (th != null) {
                        str = th.getMessage();
                    }
                    us3Var.j(str, str2, arguments.getTransferScenario());
                    cVar.Z(new ij90(th));
                    break;
                } else {
                    us3Var.j(br51Var.a, str2, arguments.getTransferScenario());
                    cVar.Z(hj90.a);
                    pz40 Y = cVar.Y();
                    do {
                        r0Var = (r0) Y;
                        value = r0Var.getValue();
                    } while (!r0Var.k(value, bj90.a((bj90) value, br51Var, null, 14)));
                }
            case 1:
                tls tlsVar = (tls) obj6;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                o4q0 o4q0Var = (o4q0) obj3;
                fid fidVar = (fid) obj4;
                int intValue = ((Integer) obj5).intValue();
                if ((intValue & 48) == 0) {
                    i = (fidVar.a(booleanValue) ? 32 : 16) | intValue;
                } else {
                    i = intValue;
                }
                if ((intValue & 384) == 0) {
                    i |= (intValue & 512) == 0 ? ((bts) fidVar).k(o4q0Var) : fidVar.e(o4q0Var) ? 256 : 128;
                }
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(i & 1, (i & 1169) != 1168)) {
                    btsVar.Y();
                    break;
                } else {
                    x6b1.d(o4q0Var, booleanValue, tlsVar, btsVar, (14 & (i >> 6)) | (i & 112), 0);
                    break;
                }
            case 2:
                com.ybsdk.feature.transfer.version2.internal.screens.phone.c cVar2 = (com.ybsdk.feature.transfer.version2.internal.screens.phone.c) obj6;
                PartnerEntity partnerEntity = (PartnerEntity) obj;
                Throwable th2 = (Throwable) obj2;
                String str4 = (String) obj3;
                String str5 = (String) obj4;
                br51 br51Var2 = (br51) obj5;
                if (br51Var2 == null) {
                    zm01 i0 = cVar2.i0();
                    if (str4 != null) {
                        str = str4;
                    } else if (th2 != null) {
                        str = th2.getMessage();
                    }
                    i0.g(str);
                    cVar2.Z(new zeb0(partnerEntity, str4, str5, th2));
                    break;
                } else {
                    cVar2.i0().g(br51Var2.a);
                    cVar2.Z(web0.a);
                    pz40 Y2 = cVar2.Y();
                    while (true) {
                        r0 r0Var3 = (r0) Y2;
                        Object value3 = r0Var3.getValue();
                        br51 br51Var3 = br51Var2;
                        if (r0Var3.k(value3, in01.a((in01) value3, null, null, null, null, null, null, null, null, null, br51Var3, 7679))) {
                            break;
                        } else {
                            br51Var2 = br51Var3;
                        }
                    }
                }
            default:
                b bVar = (b) obj6;
                Throwable th3 = (Throwable) obj2;
                String str6 = (String) obj3;
                String str7 = (String) obj4;
                br51 br51Var4 = (br51) obj5;
                pz40 Y3 = bVar.Y();
                do {
                    r0Var2 = (r0) Y3;
                    value2 = r0Var2.getValue();
                } while (!r0Var2.k(value2, yn01.a((yn01) value2, null, false, 1)));
                bVar.Z(new wn01(str6, str7, br51Var4, th3));
                break;
        }
        return zy11Var;
    }
}
