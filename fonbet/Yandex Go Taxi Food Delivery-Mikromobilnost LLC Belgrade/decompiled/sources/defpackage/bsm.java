package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yx360.design.compose.atoms.DsButtonClose$Type;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public final class bsm implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ wls c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ bsm(Object obj, Object obj2, Object obj3, boolean z, wls wlsVar, int i) {
        this.a = i;
        this.w = obj;
        this.x = obj2;
        this.y = obj3;
        this.b = z;
        this.c = wlsVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bf, code lost:
    
        if (defpackage.jl40.l(r11.Q(), java.lang.Integer.valueOf(r6)) == false) goto L30;
     */
    @Override // defpackage.wls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        zy11 zy11Var;
        wls wlsVar;
        sls slsVar;
        bts btsVar;
        wls wlsVar2;
        boolean z;
        int i;
        uo5 uo5Var;
        int i2 = this.a;
        zy11 zy11Var2 = zy11.a;
        Object obj3 = this.y;
        Object obj4 = this.x;
        Object obj5 = this.w;
        switch (i2) {
            case 0:
                String str = (String) obj4;
                String str2 = (String) obj5;
                fid fidVar = (fid) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar2 = (bts) fidVar;
                    if (btsVar2.E()) {
                        btsVar2.Y();
                        return zy11Var2;
                    }
                }
                c530 c530Var = c530.a;
                f530 v = ljs0.v(c530Var, null, 3);
                zrm zrmVar = (zrm) obj3;
                uo5 uo5Var2 = x4c.b;
                z910 d = pi6.d(uo5Var2, false);
                bts btsVar3 = (bts) fidVar;
                int hashCode = Long.hashCode(btsVar3.T);
                r1b0 o = btsVar3.o();
                f530 d2 = b.d(fidVar, v);
                ohd.G1.getClass();
                sls slsVar2 = d.b;
                bts btsVar4 = (bts) fidVar;
                if (btsVar4.a == null) {
                    cma1.b0();
                    throw null;
                }
                btsVar4.i0();
                if (btsVar4.S) {
                    btsVar4.n(slsVar2);
                } else {
                    btsVar4.r0();
                }
                wls wlsVar3 = d.f;
                qje.W(fidVar, wlsVar3, d);
                wls wlsVar4 = d.e;
                qje.W(fidVar, wlsVar4, o);
                wls wlsVar5 = d.g;
                if (!btsVar4.S) {
                    zy11Var = zy11Var2;
                    break;
                } else {
                    zy11Var = zy11Var2;
                }
                b64.z(hashCode, btsVar4, hashCode, wlsVar5);
                wls wlsVar6 = d.d;
                qje.W(fidVar, wlsVar6, d2);
                if (zrmVar != null) {
                    btsVar4.e0(-1737629561);
                    f530 v2 = ljs0.v(c530Var, null, 3);
                    DsButtonClose$Type dsButtonClose$Type = (DsButtonClose$Type) zrmVar.b;
                    sls slsVar3 = (sls) zrmVar.c;
                    slsVar = slsVar2;
                    wlsVar2 = wlsVar3;
                    btsVar = btsVar4;
                    wlsVar = wlsVar4;
                    csm.a(this.b, dsButtonClose$Type, slsVar3, v2, fidVar, HProv.ALG_TYPE_SECURECHANNEL);
                    btsVar.t(false);
                } else {
                    wlsVar = wlsVar4;
                    slsVar = slsVar2;
                    btsVar = btsVar4;
                    wlsVar2 = wlsVar3;
                    btsVar.e0(-1737276688);
                    qnm.c.getClass();
                    oeb1.c(fidVar, ljs0.m(c530Var, 40.0f));
                    btsVar.t(false);
                }
                btsVar.t(true);
                if ((str2 == null || str2.length() == 0) && (str == null || str.length() == 0)) {
                    z = false;
                    i = 3;
                    uo5Var = null;
                    btsVar.e0(-585535312);
                    oeb1.c(fidVar, c530Var);
                    btsVar.t(false);
                } else {
                    btsVar.e0(-585785513);
                    i = 3;
                    uo5Var = null;
                    csm.e(384, fidVar, ljs0.v(c530Var, null, 3), str2, str);
                    z = false;
                    btsVar.t(false);
                }
                f530 v3 = ljs0.v(c530Var, uo5Var, i);
                z910 d3 = pi6.d(uo5Var2, z);
                int hashCode2 = Long.hashCode(btsVar.T);
                r1b0 o2 = btsVar.o();
                f530 d4 = b.d(fidVar, v3);
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar);
                } else {
                    btsVar.r0();
                }
                qje.W(fidVar, wlsVar2, d3);
                qje.W(fidVar, wlsVar, o2);
                if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                    b64.z(hashCode2, btsVar, hashCode2, wlsVar5);
                }
                qje.W(fidVar, wlsVar6, d4);
                wls wlsVar7 = this.c;
                if (wlsVar7 != null) {
                    btsVar.e0(-990579818);
                    wlsVar7.invoke(fidVar, 0);
                    btsVar.t(false);
                } else {
                    btsVar.e0(-990509479);
                    qnm.c.getClass();
                    oeb1.c(fidVar, ljs0.m(c530Var, 40.0f));
                    btsVar.t(false);
                }
                btsVar.t(true);
                return zy11Var;
            default:
                fid fidVar2 = (fid) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar5 = (bts) fidVar2;
                    if (btsVar5.E()) {
                        btsVar5.Y();
                        return zy11Var2;
                    }
                }
                mtm.b((spm) obj5, (fn6) obj4, (wbz0) obj3, this.b, this.c, fidVar2, 0);
                return zy11Var2;
        }
    }
}
