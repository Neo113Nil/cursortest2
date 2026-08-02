package defpackage;

import androidx.room.RoomDatabase;
import androidx.room.util.a;

/* loaded from: classes15.dex */
public final class kcb {
    public final RoomDatabase a;
    public final fc1 b = new fc1(9);
    public final jcb c = new jcb(0);

    public kcb(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    public final String a(long j) {
        return (String) a.b(this.a, true, false, new hcb(j, 0));
    }
}
