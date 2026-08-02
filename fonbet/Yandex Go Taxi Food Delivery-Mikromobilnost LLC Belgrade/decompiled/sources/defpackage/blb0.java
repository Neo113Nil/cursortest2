package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.yandex.taxi.logistics.sdk.photocomments.PhotocommentsMode;
import ru.yandex.taxi.logistics.sdk.photocomments.a;

/* loaded from: classes5.dex */
public final class blb0 implements bms {
    public final /* synthetic */ tls A;
    public final /* synthetic */ sls B;
    public final /* synthetic */ List a;
    public final /* synthetic */ gv90 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ tls w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ PhotocommentsMode y;
    public final /* synthetic */ tkb0 z;

    public blb0(List list, gv90 gv90Var, ArrayList arrayList, tls tlsVar, boolean z, PhotocommentsMode photocommentsMode, tkb0 tkb0Var, tls tlsVar2, sls slsVar) {
        this.a = list;
        this.b = gv90Var;
        this.c = arrayList;
        this.w = tlsVar;
        this.x = z;
        this.y = photocommentsMode;
        this.z = tkb0Var;
        this.A = tlsVar2;
        this.B = slsVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        u4y u4yVar = (u4y) obj;
        int intValue = ((Number) obj2).intValue();
        fid fidVar = (fid) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (((bts) fidVar).k(u4yVar) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= fidVar.c(intValue) ? 32 : 16;
        }
        boolean z = true;
        bts btsVar = (bts) fidVar;
        if (btsVar.V(i & 1, (i & 147) != 146)) {
            mkb0 mkb0Var = (mkb0) this.a.get(intValue);
            btsVar.e0(-284823661);
            String d = ohb1.d(c0i0.delivery_photocomment_item_content_description, new Object[]{Integer.valueOf(intValue + 1)}, btsVar);
            gv90 gv90Var = this.b;
            boolean z2 = gv90Var instanceof mu90 ? ((mu90) gv90Var).b : gv90Var != null;
            boolean e = btsVar.e(gv90Var);
            if ((((i & 112) ^ 48) <= 32 || !btsVar.c(intValue)) && (i & 48) != 32) {
                z = false;
            }
            boolean z3 = e | z;
            ArrayList arrayList = this.c;
            boolean e2 = z3 | btsVar.e(arrayList);
            tls tlsVar = this.w;
            boolean k = e2 | btsVar.k(tlsVar);
            Object Q = btsVar.Q();
            if (k || Q == did.a) {
                yya0 yya0Var = new yya0(gv90Var, intValue, arrayList, tlsVar, 1);
                btsVar.o0(yya0Var);
                Q = yya0Var;
            }
            tls tlsVar2 = (tls) Q;
            if (!z2) {
                tlsVar2 = null;
            }
            a.j(mkb0Var, d, this.x, this.y, this.z, tlsVar2, this.A, this.B, btsVar, 0);
            btsVar.t(false);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }
}
