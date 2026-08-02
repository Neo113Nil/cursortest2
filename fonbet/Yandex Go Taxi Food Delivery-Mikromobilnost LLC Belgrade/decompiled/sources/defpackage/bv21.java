package defpackage;

import androidx.room.RoomDatabase;
import androidx.room.util.a;

/* loaded from: classes15.dex */
public final class bv21 {
    public final RoomDatabase a;
    public final x7b0 b = new x7b0(15);
    public final x7b0 c = new x7b0(16);
    public final jcb d = new jcb(4);

    public bv21(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    public final in21 a(String str) {
        return (in21) a.b(this.a, true, false, new il01(str, 17));
    }

    public final am21 b(String str) {
        return (am21) a.b(this.a, true, false, new il01(str, 25));
    }

    public final boolean c(String str) {
        return ((Boolean) a.b(this.a, true, false, new il01(str, 24))).booleanValue();
    }

    public final boolean d(String str) {
        return ((Boolean) a.b(this.a, true, false, new il01(str, 22))).booleanValue();
    }
}
