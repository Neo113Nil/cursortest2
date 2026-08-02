package defpackage;

import androidx.room.RoomDatabase;
import androidx.room.util.a;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class ka51 {
    public final RoomDatabase a;
    public final ple0 b = new ple0(6);

    public ka51(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    public final void a(String str, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a.b(this.a, false, true, new fgw0(10, this, new ja51((String) it.next(), str)));
        }
    }
}
