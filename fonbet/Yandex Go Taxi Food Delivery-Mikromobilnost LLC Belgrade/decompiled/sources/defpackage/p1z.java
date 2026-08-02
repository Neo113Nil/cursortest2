package defpackage;

import android.os.SystemClock;
import com.yandex.messaging.core.net.entities.ContactsUploadData;
import com.yandex.messaging.core.net.entities.ContactsUploadParam;
import com.yandex.messaging.internal.storage.contacts.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$IntRef;

/* loaded from: classes15.dex */
public final class p1z {
    public final at2 a;
    public final a b;
    public final x22 c;
    public final i2z d;

    public p1z(x22 x22Var, at2 at2Var, a aVar) {
        this.a = at2Var;
        this.b = aVar;
        this.c = x22Var;
        this.d = at2Var.r0();
    }

    public static void c() {
        if (ydz.a.a()) {
            ydz.a();
        }
    }

    public final int a(int i, ContactsUploadData.Record[] recordArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        this.a.P(new ynn(ref$IntRef, this, recordArr, i));
        this.c.g("tech remote contacts updated", "time_diff", Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime), "requested", Integer.valueOf(i), "received", Integer.valueOf(recordArr.length), "changed", Integer.valueOf(ref$IntRef.element));
        return ref$IntRef.element;
    }

    public final Pair b() {
        int i;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        i2z i2zVar = this.d;
        ycc.r((List) androidx.room.util.a.b(i2zVar.b, true, false, new xpy(13)), linkedHashSet);
        linkedHashSet.size();
        c();
        List<h2z> list = (List) androidx.room.util.a.b(i2zVar.b, true, false, new xpy(12));
        list.size();
        c();
        if (!list.isEmpty()) {
            for (h2z h2zVar : list) {
                Objects.toString(h2zVar);
                c();
                arrayList.add(new ContactsUploadParam.Record(h2zVar.a, h2zVar.d, h2zVar.e));
            }
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            h2z h2zVar2 = (h2z) androidx.room.util.a.b(i2zVar.b, true, false, new vsq((String) it.next(), 20));
            if (h2zVar2 != null) {
                ContactsUploadParam.Record record = new ContactsUploadParam.Record(h2zVar2.a, h2zVar2.d, h2zVar2.e);
                it.remove();
                if (arrayList.isEmpty()) {
                    i = 0;
                } else {
                    Iterator it2 = arrayList.iterator();
                    i = 0;
                    while (it2.hasNext()) {
                        if (jl40.l(((ContactsUploadParam.Record) it2.next()).localId, record.localId) && (i = i + 1) < 0) {
                            scc.l();
                            throw null;
                        }
                    }
                }
                if (i == 0) {
                    arrayList.add(record);
                }
            }
        }
        return new Pair(arrayList.toArray(new ContactsUploadParam.Record[0]), linkedHashSet.toArray(new String[0]));
    }
}
