package defpackage;

import com.google.crypto.tink.proto.HashType;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class jf1 extends g2f0 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jf1(int i, Class cls) {
        super(cls);
        this.b = i;
    }

    @Override // defpackage.g2f0
    public final Object a(vt10 vt10Var) {
        switch (this.b) {
            case 0:
                ef1 ef1Var = (ef1) vt10Var;
                return new nye0(new kye0(ef1Var.A().j()), ef1Var.B().z());
            case 1:
                vf1 vf1Var = (vf1) vt10Var;
                g2f0[] g2f0VarArr = {new ng1(gg1.class)};
                HashMap hashMap = new HashMap();
                for (g2f0 g2f0Var : g2f0VarArr) {
                    boolean containsKey = hashMap.containsKey(g2f0Var.a);
                    Class cls = g2f0Var.a;
                    if (containsKey) {
                        vg10.g(cls.getCanonicalName(), "KeyTypeManager constructed with duplicate factories for primitive ");
                        return null;
                    }
                    hashMap.put(cls, g2f0Var);
                }
                if (g2f0VarArr.length > 0) {
                    Class cls2 = g2f0VarArr[0].a;
                }
                Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                jg1 A = vf1Var.A();
                g2f0 g2f0Var2 = (g2f0) unmodifiableMap.get(gg1.class);
                if (g2f0Var2 != null) {
                    return new rzn((gg1) g2f0Var2.a(A), (m200) new sou().g(vf1Var.B(), m200.class), vf1Var.B().C().B());
                }
                vg10.i("Requested primitive class ", gg1.class.getCanonicalName(), " not supported.");
                return null;
            case 2:
                wg1 wg1Var = (wg1) vt10Var;
                return new tg1(wg1Var.A().j(), wg1Var.B().z());
            case 3:
                return new hh1(((kh1) vt10Var).z().j());
            case 4:
                return new th1(((wh1) vt10Var).z().j());
            case 5:
                return new ei1(((hi1) vt10Var).z().j());
            case 6:
                return new s79(((v79) vt10Var).z().j(), 0);
            case 7:
                mou mouVar = (mou) vt10Var;
                HashType A2 = mouVar.C().A();
                SecretKeySpec secretKeySpec = new SecretKeySpec(mouVar.B().j(), "HMAC");
                int B = mouVar.C().B();
                int i = rou.a[A2.ordinal()];
                if (i == 1) {
                    return new nye0(new mye0("HMACSHA1", secretKeySpec), B);
                }
                if (i == 2) {
                    return new nye0(new mye0("HMACSHA224", secretKeySpec), B);
                }
                if (i == 3) {
                    return new nye0(new mye0("HMACSHA256", secretKeySpec), B);
                }
                if (i == 4) {
                    return new nye0(new mye0("HMACSHA384", secretKeySpec), B);
                }
                if (i == 5) {
                    return new nye0(new mye0("HMACSHA512", secretKeySpec), B);
                }
                kbs.v("unknown hash");
                return null;
            case 8:
                String y = ((ulx) vt10Var).z().y();
                return ((ba2) zlx.a(y)).c(y);
            case 9:
                dmx dmxVar = (dmx) vt10Var;
                String z = dmxVar.z().z();
                return new amx(dmxVar.z().y(), ((ba2) zlx.a(z)).c(z));
            default:
                return new s79(((ad51) vt10Var).z().j(), 1);
        }
    }
}
