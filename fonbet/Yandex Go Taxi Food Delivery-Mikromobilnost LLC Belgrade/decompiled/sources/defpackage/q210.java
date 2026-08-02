package defpackage;

import com.yandex.go.zone.model.Zone;
import com.yandex.go.zone.repository.o;
import defpackage.i210;
import java.util.Map;

/* loaded from: classes6.dex */
public final class q210 {
    public final o a;

    public q210(o oVar) {
        this.a = oVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0074, code lost:
    
        if (r9 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0086, code lost:
    
        r8 = new defpackage.c210(r9, r2.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0083, code lost:
    
        if (r9 == null) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final e210 a() {
        i210 i210Var;
        Map map;
        i210.c cVar;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Zone g = this.a.g();
        d210 d210Var = null;
        if (g == null || (i210Var = (i210) g.z.a(i210.class)) == null || (map = i210Var.b) == null || (cVar = i210Var.c) == null || (str = cVar.a) == null || (str2 = (String) map.get(str)) == null) {
            return null;
        }
        if (evu0.J(str2)) {
            str2 = null;
        }
        if (str2 == null) {
            return null;
        }
        String str6 = cVar.b;
        if (str6 == null || (str3 = (String) map.get(str6)) == null || evu0.J(str3)) {
            str3 = null;
        }
        Boolean bool = cVar.c;
        boolean booleanValue = bool != null ? bool.booleanValue() : true;
        i210.d dVar = cVar.d;
        if (dVar != null) {
            String str7 = dVar.a;
            String str8 = (String) map.get(str7);
            if (str8 != null) {
                if (evu0.J(str8)) {
                    str8 = null;
                }
            }
            if (str7 != null) {
                if (evu0.J(str7)) {
                    str7 = null;
                }
                str8 = str7;
            } else {
                str8 = null;
            }
        }
        c210 c210Var = null;
        b210 b210Var = new b210(str2, str3, booleanValue, c210Var);
        i210.b bVar = i210Var.d;
        if (bVar == null || (str5 = bVar.a) == null || (str4 = (String) map.get(str5)) == null || evu0.J(str4)) {
            str4 = null;
        }
        i210.a aVar = i210Var.e;
        if (aVar != null ? jl40.l(aVar.a, Boolean.TRUE) : false) {
            Integer num = aVar.b;
            int intValue = num != null ? num.intValue() : 10;
            Integer num2 = aVar.c;
            int intValue2 = num2 != null ? num2.intValue() : 5;
            Integer num3 = aVar.d;
            int intValue3 = num3 != null ? num3.intValue() : 5;
            Integer num4 = aVar.e;
            int intValue4 = num4 != null ? num4.intValue() : -95;
            Boolean bool2 = aVar.f;
            boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : true;
            Boolean bool3 = aVar.g;
            d210Var = new d210(intValue, intValue2, intValue3, intValue4, booleanValue2, bool3 != null ? bool3.booleanValue() : false);
        }
        return new e210(b210Var, new a210(str4, d210Var));
    }
}
