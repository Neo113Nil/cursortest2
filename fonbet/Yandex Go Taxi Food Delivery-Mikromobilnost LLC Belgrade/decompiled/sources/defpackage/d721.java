package defpackage;

import com.yandex.messaging.domain.actions.a;
import com.yandex.messaging.domain.k;
import com.yandex.messaging.internal.storage.folders.d;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.coroutines.Continuation;

/* loaded from: classes15.dex */
public final class d721 extends k {
    public final a b;
    public final d c;
    public final k020 d;
    public final el21 e;
    public final xw50 f;
    public final zwr g;

    public d721(a aVar, d dVar, k020 k020Var, el21 el21Var, xw50 xw50Var, zwr zwrVar, kse kseVar) {
        super(kseVar.e);
        this.b = aVar;
        this.c = dVar;
        this.d = k020Var;
        this.e = el21Var;
        this.f = xw50Var;
        this.g = zwrVar;
    }

    @Override // com.yandex.messaging.domain.k
    public final Object b(Object obj, Continuation continuation) {
        c721 c721Var = (c721) obj;
        if (!this.f.a()) {
            return new iyj0(lwr.a);
        }
        String str = c721Var.b;
        String str2 = c721Var.c;
        ywr t = this.d.t(c721Var.a, str);
        if (t == null) {
            return new iyj0(kwr.a);
        }
        String str3 = c721Var.b;
        long j = c721Var.a;
        hwr hwrVar = t.a;
        int i = hwrVar.d;
        String str4 = str2 == null ? hwrVar.b : str2;
        Set set = c721Var.d;
        if (set == null) {
            set = hwrVar.f;
        }
        Set set2 = c721Var.e;
        if (set2 == null) {
            set2 = hwrVar.g;
        }
        Set set3 = c721Var.f;
        if (set3 == null) {
            set3 = t.b();
        }
        Set set4 = set3;
        Set set5 = c721Var.g;
        if (set5 == null) {
            set5 = t.a();
        }
        jjf jjfVar = new jjf(str3, j, str4, i, set, set2, set4, set5);
        String str5 = c721Var.b;
        Integer num = str2 != null ? new Integer(str2.length()) : null;
        Integer num2 = new Integer(set.size());
        List J0 = kotlin.collections.a.J0(set4);
        zwr zwrVar = this.g;
        zwrVar.getClass();
        LinkedHashMap l = b.l(new Pair("id", str5));
        if (num != null) {
            l.put("new_name_length", Integer.valueOf(num.intValue()));
        }
        l.put("included_chat_ids_count", Integer.valueOf(num2.intValue()));
        l.put("included_type_ids", J0);
        zwrVar.a.reportEvent("edit_custom_folder", l);
        return this.b.a(new b721(jjfVar, this.c, this.e), continuation);
    }
}
