package defpackage;

import com.yandex.messaging.domain.actions.a;
import com.yandex.messaging.domain.k;
import com.yandex.messaging.internal.storage.folders.d;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.coroutines.Continuation;

/* loaded from: classes15.dex */
public final class k5f extends k {
    public final a b;
    public final d c;
    public final k020 d;
    public final el21 e;
    public final xw50 f;
    public final w5t g;
    public final zwr h;

    public k5f(a aVar, d dVar, k020 k020Var, el21 el21Var, xw50 xw50Var, w5t w5tVar, zwr zwrVar, kse kseVar) {
        super(kseVar.e);
        this.b = aVar;
        this.c = dVar;
        this.d = k020Var;
        this.e = el21Var;
        this.f = xw50Var;
        this.g = w5tVar;
        this.h = zwrVar;
    }

    @Override // com.yandex.messaging.domain.k
    public final Object b(Object obj, Continuation continuation) {
        j5f j5fVar = (j5f) obj;
        if (!this.f.a()) {
            return new iyj0(lwr.a);
        }
        long c = this.g.b.c();
        gwr l = this.d.b.l();
        int size = ((List) androidx.room.util.a.b(l.a, true, false, new bwr(c, l, 0))).size();
        String uuid = UUID.randomUUID().toString();
        String str = j5fVar.a;
        jjf jjfVar = new jjf(uuid, c, str, size, j5fVar.b, j5fVar.c, j5fVar.d, j5fVar.e);
        Integer num = new Integer(str.length());
        Integer num2 = new Integer(j5fVar.b.size());
        List J0 = kotlin.collections.a.J0(j5fVar.d);
        zwr zwrVar = this.h;
        zwrVar.getClass();
        LinkedHashMap l2 = b.l(new Pair("id", uuid), new Pair("new_folders_count", Integer.valueOf(size + 1)));
        l2.put("name_length", Integer.valueOf(num.intValue()));
        l2.put("included_chat_ids_count", Integer.valueOf(num2.intValue()));
        l2.put("included_type_ids", J0);
        zwrVar.a.reportEvent("create_folder", l2);
        return this.b.a(new i5f(jjfVar, this.c, this.e), continuation);
    }
}
