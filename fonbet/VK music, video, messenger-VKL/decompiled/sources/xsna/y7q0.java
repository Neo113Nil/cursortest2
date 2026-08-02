package xsna;

import com.vk.im.engine.internal.storage.delegates.channel_messages.ChannelMessageColumn;
import com.vk.im.engine.models.messages.Msg;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;

/* compiled from: UpdateChannelPostViewedStatusCmd.kt */
/* loaded from: classes2.dex */
public final class y7q0 extends le6<s3q0> {
    public final LinkedHashMap b;

    public y7q0(LinkedHashMap linkedHashMap) {
        this.b = linkedHashMap;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        Iterable iterable;
        g2b g2bVar = w2wVar.I0().y().b;
        tgl0 tgl0Var = g2bVar.d;
        LinkedHashMap linkedHashMap = this.b;
        if (linkedHashMap.isEmpty()) {
            iterable = EmptyList.b;
        } else {
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder("\n                UPDATE ");
            sb.append(g2bVar.b.a);
            sb.append(" \n                SET ");
            cr.a(ChannelMessageColumn.IS_VIEWED, sb, " = 1 \n                WHERE ");
            sb.append(ChannelMessageColumn.OWNER_ID);
            sb.append(" = ? \n                AND ");
            sb.append(ChannelMessageColumn.POST_ID);
            sb.append(" = ?\n            ");
            SQLiteStatement compileStatement = tgl0Var.b().compileStatement(xqm0.g(sb.toString()));
            try {
                tgl0Var.I0().u(new f2b(linkedHashMap, compileStatement, g2bVar, arrayList));
                s3q0 s3q0Var = s3q0.a;
                compileStatement.close();
                iterable = arrayList;
            } finally {
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj : iterable) {
            Long valueOf = Long.valueOf(((Msg) obj).c);
            Object obj2 = linkedHashMap2.get(valueOf);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap2.put(valueOf, obj2);
            }
            ((List) obj2).add(obj);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(on00.e(linkedHashMap2.size()));
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            Object key = entry.getKey();
            Iterable iterable2 = (Iterable) entry.getValue();
            ArrayList arrayList2 = new ArrayList(c5g.u(iterable2, 10));
            Iterator it = iterable2.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(((Msg) it.next()).b));
            }
            linkedHashMap3.put(key, arrayList2);
        }
        w2wVar.e1(this, new o280(null, linkedHashMap3));
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y7q0) && epx.f(this.b, ((y7q0) obj).b);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // xsna.e1w
    public final String toString() {
        return "UpdateChannelPostViewedStatusCmd(ownerIdToPostIdMap=" + this.b + ')';
    }
}
