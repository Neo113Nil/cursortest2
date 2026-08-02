package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.c;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* loaded from: classes11.dex */
public final class f3z extends c {
    public final String b;
    public final ArrayList c;
    public final EvaluableType d;
    public final ArrayList e;
    public final bdo f;

    public f3z(String str, ArrayList arrayList, EvaluableType evaluableType, ArrayList arrayList2, String str2) {
        this.b = str;
        this.c = arrayList;
        this.d = evaluableType;
        this.e = arrayList2;
        Set set = jdo.c;
        this.f = new bdo(str2);
    }

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        for (Object obj : this.e) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            linkedHashMap.put((String) obj, list.get(i));
            i = i2;
        }
        return new mdo(new cxq0(new kcz0(linkedHashMap, (o231) cxq0Var.b), (jb7) cxq0Var.c, (gp50) cxq0Var.w, (yvi0) cxq0Var.x, 17)).b(this.f);
    }

    @Override // com.yandex.div.evaluable.c
    public final List b() {
        return this.c;
    }

    @Override // com.yandex.div.evaluable.c
    public final String c() {
        return this.b;
    }

    @Override // com.yandex.div.evaluable.c
    public final EvaluableType d() {
        return this.d;
    }

    @Override // com.yandex.div.evaluable.c
    public final boolean f() {
        return false;
    }
}
