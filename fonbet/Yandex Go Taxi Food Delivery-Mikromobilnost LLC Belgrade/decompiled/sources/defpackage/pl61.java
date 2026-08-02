package defpackage;

import java.util.Map;
import kotlin.collections.b;

/* loaded from: classes7.dex */
public final class pl61 {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public pl61(gh61 gh61Var) {
        this.b = gh61Var;
    }

    public final Object a(gb81 gb81Var) {
        String str;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                byte[] bArr = gb81Var.b;
                Map map = gb81Var.c;
                if (map == null) {
                    map = b.f();
                }
                if (bArr != null) {
                    try {
                        str = new String(bArr, ob71.a(map));
                    } catch (Exception unused) {
                        str = new String(bArr, uza.a);
                    }
                } else {
                    str = null;
                }
                if (str == null || evu0.J(str)) {
                    return null;
                }
                sbx sbxVar = (sbx) obj;
                sbxVar.getClass();
                kc71.Companion.getClass();
                return (kc71) sbxVar.b(po61.a, str);
            default:
                return (qb71) ((gh61) obj).a(gb81Var);
        }
    }

    public pl61(mo71 mo71Var, sbx sbxVar) {
        this.b = sbxVar;
    }
}
