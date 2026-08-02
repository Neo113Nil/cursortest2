package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;
import java.util.SimpleTimeZone;
import ru.cprocsp.ACSP.tools.integrity.CSPIntegrityConstants;

/* loaded from: classes4.dex */
public class kkh implements i87 {
    public final Hashtable a;

    public kkh(xc3 xc3Var) {
        this.a = xc3Var != null ? xc3.b(xc3Var.a) : new Hashtable();
    }

    public Hashtable a(Map map) {
        u2 A;
        Hashtable hashtable = new Hashtable();
        Hashtable hashtable2 = this.a;
        Enumeration keys = hashtable2.keys();
        while (keys.hasMoreElements()) {
            Object nextElement = keys.nextElement();
            hashtable.put(nextElement, hashtable2.get(nextElement));
        }
        u2 u2Var = j87.a;
        if (!hashtable.containsKey(u2Var) && (A = u2.A(map.get("contentType"))) != null) {
            vc3 vc3Var = new vc3(u2Var, new lqf(A));
            hashtable.put(vc3Var.a, vc3Var);
        }
        u2 u2Var2 = j87.c;
        if (!hashtable.containsKey(u2Var2)) {
            Date date = new Date();
            s5z0 s5z0Var = new s5z0();
            SimpleTimeZone simpleTimeZone = new SimpleTimeZone(0, "Z");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", s5z.a);
            simpleDateFormat.setTimeZone(simpleTimeZone);
            String str = simpleDateFormat.format(date) + "Z";
            int parseInt = Integer.parseInt(str.substring(0, 4));
            s5z0Var.a = (parseInt < 1950 || parseInt > 2049) ? new tpf(str) : new pqf(str.substring(2));
            vc3 vc3Var2 = new vc3(u2Var2, new lqf(s5z0Var));
            hashtable.put(vc3Var2.a, vc3Var2);
        }
        u2 u2Var3 = j87.b;
        if (!hashtable.containsKey(u2Var3)) {
            vc3 vc3Var3 = new vc3(u2Var3, new lqf(new dqf((byte[]) map.get(CSPIntegrityConstants.DIGEST))));
            hashtable.put(vc3Var3.a, vc3Var3);
        }
        u2 u2Var4 = j87.e;
        if (!hashtable.contains(u2Var4)) {
            vc3 vc3Var4 = new vc3(u2Var4, new lqf(new h87((xr1) map.get("digestAlgID"), (xr1) map.get("signatureAlgID"))));
            hashtable.put(vc3Var4.a, vc3Var4);
        }
        return hashtable;
    }

    @Override // defpackage.i87
    public final xc3 b(Map map) {
        return new xc3(a(map));
    }

    public kkh() {
        this.a = new Hashtable();
    }
}
