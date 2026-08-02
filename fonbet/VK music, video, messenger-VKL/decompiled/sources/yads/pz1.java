package yads;

import android.content.Context;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.c5g;
import xsna.g5g;
import xsna.j5g;
import xsna.on00;

/* loaded from: classes10.dex */
public final class pz1 extends q42 implements x12 {
    public final gz1 P;
    public final t12 Q;
    public final nj2 R;
    public final j32 S;

    public pz1(Context context, gz1 gz1Var, t12 t12Var, nj2 nj2Var, up upVar, g02 g02Var) {
        super(context, upVar, g02Var);
        this.P = gz1Var;
        this.Q = t12Var;
        this.R = nj2Var;
        d4 d4Var = upVar.a.c;
        dr2 dr2Var = gz1Var.a;
        j32 j32Var = new j32(d4Var, dr2Var.b, this.i, this.j, new s03(gz1Var, new br2(), new n9(), new wy()));
        this.S = j32Var;
        a(j32Var);
    }

    @Override // yads.x12
    public final void a(s22 s22Var, pu puVar) {
        a(s22Var.c, this.R, new a32(s22Var), puVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d5  */
    @Override // yads.x12
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final y00 getAdAssets() {
        h10 h10Var;
        fw fwVar;
        int ordinal;
        n10 n10Var;
        h10 h10Var2;
        List list;
        t12 t12Var = this.Q;
        nz1 nz1Var = t12Var.f;
        gz1 gz1Var = t12Var.a;
        nz1Var.getClass();
        List<oi> list2 = gz1Var.b;
        int e = on00.e(c5g.u(list2, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (oi oiVar : list2) {
            Pair pair = new Pair(oiVar.a, oiVar.c);
            linkedHashMap.put(pair.i(), pair.j());
        }
        Object obj = linkedHashMap.get(X3.i.I0);
        o10 o10Var = null;
        po1 po1Var = obj instanceof po1 ? (po1) obj : null;
        Object obj2 = linkedHashMap.get("favicon");
        x41 x41Var = obj2 instanceof x41 ? (x41) obj2 : null;
        Object obj3 = linkedHashMap.get("icon");
        x41 x41Var2 = obj3 instanceof x41 ? (x41) obj3 : null;
        Object obj4 = linkedHashMap.get("close_button");
        gw gwVar = obj4 instanceof gw ? (gw) obj4 : null;
        Object obj5 = linkedHashMap.get("age");
        String str = obj5 instanceof String ? (String) obj5 : null;
        Object obj6 = linkedHashMap.get("body");
        String str2 = obj6 instanceof String ? (String) obj6 : null;
        Object obj7 = linkedHashMap.get("call_to_action");
        String str3 = obj7 instanceof String ? (String) obj7 : null;
        Object obj8 = linkedHashMap.get(X3.j.D);
        String str4 = obj8 instanceof String ? (String) obj8 : null;
        Object obj9 = linkedHashMap.get("price");
        String str5 = obj9 instanceof String ? (String) obj9 : null;
        Object obj10 = linkedHashMap.get(CampaignEx.JSON_KEY_STAR);
        String str6 = obj10 instanceof String ? (String) obj10 : null;
        Object obj11 = linkedHashMap.get("review_count");
        String str7 = obj11 instanceof String ? (String) obj11 : null;
        Object obj12 = linkedHashMap.get("sponsored");
        String str8 = obj12 instanceof String ? (String) obj12 : null;
        Object obj13 = linkedHashMap.get("title");
        String str9 = obj13 instanceof String ? (String) obj13 : null;
        Object obj14 = linkedHashMap.get("warning");
        String str10 = obj14 instanceof String ? (String) obj14 : null;
        boolean z = linkedHashMap.get("feedback") != null;
        x41 x41Var3 = (po1Var == null || (list = po1Var.c) == null) ? null : (x41) j5g.a0(list);
        h12 h12Var = nz1Var.b;
        nj2 nj2Var = nz1Var.a;
        h12Var.getClass();
        a10 a = h12.a(nj2Var, x41Var3);
        h12 h12Var2 = nz1Var.b;
        nj2 nj2Var2 = nz1Var.a;
        h12Var2.getClass();
        a10 a2 = h12.a(nj2Var2, x41Var);
        h12 h12Var3 = nz1Var.b;
        nj2 nj2Var3 = nz1Var.a;
        h12Var3.getClass();
        a10 a3 = h12.a(nj2Var3, x41Var2);
        u12 u12Var = nz1Var.c;
        u12Var.getClass();
        if (po1Var != null) {
            we3 we3Var = po1Var.b;
            List list3 = po1Var.c;
            pk1 pk1Var = po1Var.a;
            if (we3Var != null) {
                ci3 ci3Var = u12Var.a;
                nf3 nf3Var = (nf3) j5g.Y(we3Var.a);
                ci3Var.getClass();
                int i = ((p72) nf3Var.d).c;
                h10Var2 = new h10(i != 0 ? r1.b / i : 1.7777778f);
            } else if (list3 != null && list3.size() > 1) {
                u12Var.b.getClass();
                h10Var2 = new h10((float) hy1.a(list3));
            } else if (pk1Var != null) {
                h10Var2 = new h10(pk1Var.b);
            }
            h10Var = h10Var2;
            nz1Var.e.getClass();
            if (gwVar != null && (fwVar = gwVar.a) != null) {
                ordinal = fwVar.ordinal();
                if (ordinal != 0) {
                    n10Var = n10.b;
                } else {
                    if (ordinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    n10Var = n10.c;
                }
                o10Var = new o10(n10Var, gwVar.b);
            }
            nz1Var.d.getClass();
            return new y00(h10Var, a2, a3, a, o10Var, str, str2, str3, str4, str5, k32.a(str6), str7, str8, str9, str10, z);
        }
        h10Var = null;
        nz1Var.e.getClass();
        if (gwVar != null) {
            ordinal = fwVar.ordinal();
            if (ordinal != 0) {
            }
            o10Var = new o10(n10Var, gwVar.b);
        }
        nz1Var.d.getClass();
        return new y00(h10Var, a2, a3, a, o10Var, str, str2, str3, str4, str5, k32.a(str6), str7, str8, str9, str10, z);
    }

    @Override // yads.x12
    public final dr2 getAdType() {
        return this.Q.a.a;
    }

    @Override // yads.x12
    public final String getCampaignId() {
        return this.P.k;
    }

    @Override // yads.x12
    public final String getCreativeId() {
        return this.P.j;
    }

    @Override // yads.x12
    public final String getInfo() {
        return this.Q.a.d;
    }

    @Override // yads.q42, yads.x12
    public final void loadImages() {
        t12 t12Var = this.Q;
        List singletonList = Collections.singletonList(t12Var.a);
        e51 e51Var = t12Var.e;
        e51Var.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = singletonList.iterator();
        while (it.hasNext()) {
            g5g.y(e51Var.a(((gz1) it.next()).b), linkedHashSet);
        }
        t12Var.d.a(linkedHashSet, new s12(t12Var));
    }

    @Override // yads.x12
    public final void a(s22 s22Var) {
        this.S.f = s22Var.e;
        a(s22Var.c, this.R, new a32(s22Var));
    }

    @Override // yads.x12
    public final gc a() {
        return this.Q.a.i;
    }
}
