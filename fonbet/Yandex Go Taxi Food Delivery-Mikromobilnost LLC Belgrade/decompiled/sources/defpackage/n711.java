package defpackage;

import java.util.List;
import kotlin.collections.a;

/* loaded from: classes12.dex */
public final class n711 implements bms {
    public final /* synthetic */ tls A;
    public final /* synthetic */ tls B;
    public final /* synthetic */ wls C;
    public final /* synthetic */ List a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ List c;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ tls x;
    public final /* synthetic */ tls y;
    public final /* synthetic */ tls z;

    public n711(List list, boolean z, List list2, boolean z2, tls tlsVar, tls tlsVar2, tls tlsVar3, tls tlsVar4, tls tlsVar5, wls wlsVar) {
        this.a = list;
        this.b = z;
        this.c = list2;
        this.w = z2;
        this.x = tlsVar;
        this.y = tlsVar2;
        this.z = tlsVar3;
        this.A = tlsVar4;
        this.B = tlsVar5;
        this.C = wlsVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        f530 f530Var;
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
        bts btsVar = (bts) fidVar;
        if (btsVar.V(i & 1, (i & 147) != 146)) {
            h711 h711Var = (h711) this.a.get(intValue);
            btsVar.e0(1493728756);
            boolean z = this.b;
            c530 c530Var = c530.a;
            if (z) {
                f530Var = ljs0.c(c530Var, 1.0f);
            } else {
                f530 c = ljs0.c(c530Var, 1.0f);
                u4yVar.getClass();
                f530Var = c;
            }
            h711 h711Var2 = (h711) a.S(intValue + 1, this.c);
            boolean z2 = this.w && (h711Var instanceof s611) && ((h711Var2 instanceof q611) || (h711Var2 instanceof e711));
            Object obj5 = this.x;
            boolean k = btsVar.k(obj5) | btsVar.e(h711Var);
            Object Q = btsVar.Q();
            Object obj6 = did.a;
            if (k || Q == obj6) {
                Q = new z5(28, obj5, h711Var);
                btsVar.o0(Q);
            }
            sls slsVar = (sls) Q;
            Object obj7 = this.C;
            boolean k2 = btsVar.k(obj7) | btsVar.e(h711Var);
            Object Q2 = btsVar.Q();
            if (k2 || Q2 == obj6) {
                Q2 = new qmy0(1, obj7, h711Var);
                btsVar.o0(Q2);
            }
            a5l0.b(h711Var, f530Var, slsVar, this.y, this.z, this.A, this.B, (tls) Q2, this.w, z2, btsVar, 0);
            btsVar.t(false);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }
}
