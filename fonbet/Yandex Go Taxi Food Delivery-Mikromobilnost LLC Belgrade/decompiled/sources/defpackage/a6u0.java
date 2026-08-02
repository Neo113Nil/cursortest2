package defpackage;

import com.yandex.div.core.state.b;
import java.util.Map;
import kotlin.collections.a;

/* loaded from: classes.dex */
public final class a6u0 extends fll {
    public final Map a;

    public a6u0(Map map) {
        this.a = map;
    }

    @Override // defpackage.fll
    public final /* bridge */ /* synthetic */ void a(m3k m3kVar, aw5 aw5Var, b bVar) {
    }

    @Override // defpackage.fll
    public final Object e(u2k u2kVar, aw5 aw5Var, b bVar) {
        c231 variable;
        String str = u2kVar.c.H;
        if (str != null && (variable = aw5Var.b.getVariable(str)) != null) {
            String str2 = bVar.e() + '/' + ((String) a.Z(bVar.c));
            Map map = this.a;
            if (map.get(str2) == null) {
                map.put(str2, new b6u0(variable));
            }
            super.e(u2kVar, aw5Var, bVar);
        }
        return zy11.a;
    }
}
