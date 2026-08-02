package defpackage;

import androidx.room.RoomDatabase;
import androidx.room.util.a;

/* loaded from: classes15.dex */
public final class meb {
    public final RoomDatabase a;
    public final fc1 b = new fc1(10);
    public final jcb c = new jcb(1);
    public final jcb d = new jcb(2);

    public meb(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    public final t2b a(String str) {
        return (t2b) a.b(this.a, true, false, new b5a(str, 18));
    }

    public final String b(long j) {
        return (String) a.b(this.a, true, false, new hcb(j, 2));
    }

    public final Long c(String str) {
        return (Long) a.b(this.a, true, false, new b5a(str, 13));
    }

    public final Long d(long j) {
        return (Long) a.b(this.a, true, false, new hcb(j, 12));
    }

    public final q2b e(long j) {
        return (q2b) a.b(this.a, true, false, new hcb(j, 16));
    }

    public final Long f(long j) {
        return (Long) a.b(this.a, true, false, new hcb(j, 10));
    }

    public final long g(long j) {
        return ((Number) a.b(this.a, true, false, new hcb(j, 3))).longValue();
    }

    public final p2b h(String str) {
        return (p2b) a.b(this.a, true, false, new b5a(str, 21));
    }

    public final void i(t2b t2bVar) {
        ((Number) a.b(this.a, false, true, new a7b(9, this, t2bVar))).longValue();
    }
}
