package defpackage;

import java.util.Arrays;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import ru.yandex.taxi.yaplus.b;

/* loaded from: classes6.dex */
public final class o2d0 implements v1g0 {
    public final /* synthetic */ int a;
    public final wnt b;
    public final h3y c;

    public /* synthetic */ o2d0(wnt wntVar, h3y h3yVar, int i) {
        this.a = i;
        this.b = wntVar;
        this.c = h3yVar;
    }

    @Override // defpackage.v1g0
    public final boolean a(Map map) {
        int i = this.a;
        h3y h3yVar = this.c;
        Object obj = null;
        wnt wntVar = this.b;
        switch (i) {
            case 0:
                String str = (String) map.get("extra");
                KSerializer serializer = i5p.Companion.serializer();
                if (str != null && str.length() != 0) {
                    try {
                        obj = ((xnt) wntVar).c(str, serializer);
                    } catch (SerializationException e) {
                        jst.e.k(e, String.format("Failed to parse '%s' from gcm message", Arrays.copyOf(new Object[]{str}, 1)));
                    }
                }
                i5p i5pVar = (i5p) obj;
                if (i5pVar == null || !i5pVar.f) {
                    break;
                } else {
                    iid0 iid0Var = ((b) h3yVar.get()).c;
                    cne0 cne0Var = iid0Var.a;
                    cne0Var.u(iid0Var.b, true);
                    cne0Var.b();
                    break;
                }
            default:
                String str2 = (String) map.get("extra");
                KSerializer serializer2 = i5p.Companion.serializer();
                if (str2 != null && str2.length() != 0) {
                    try {
                        obj = ((xnt) wntVar).c(str2, serializer2);
                    } catch (SerializationException e2) {
                        jst.e.k(e2, String.format("Failed to parse '%s' from gcm message", Arrays.copyOf(new Object[]{str2}, 1)));
                    }
                }
                i5p i5pVar2 = (i5p) obj;
                if (i5pVar2 == null || !i5pVar2.g) {
                    break;
                } else {
                    eky ekyVar = (eky) h3yVar.get();
                    cne0 cne0Var2 = (cne0) ekyVar.b;
                    cne0Var2.u(ekyVar.x, true);
                    cne0Var2.b();
                    break;
                }
                break;
        }
        return true;
    }
}
