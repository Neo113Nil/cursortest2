package defpackage;

import androidx.room.RoomDatabase;
import androidx.room.util.a;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes15.dex */
public final class ngu extends lgu {
    public final RoomDatabase a;

    public ngu(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    public static void e(ngu nguVar, HashSet hashSet) {
        super.d(hashSet);
    }

    @Override // defpackage.lgu
    public final int a() {
        return ((Number) a.b(this.a, false, true, new iws(26))).intValue();
    }

    @Override // defpackage.lgu
    public final List b() {
        return (List) a.b(this.a, true, false, new iws(25));
    }

    @Override // defpackage.lgu
    public final long c(int i) {
        return ((Number) a.b(this.a, false, true, new ii8(i, 7))).longValue();
    }

    @Override // defpackage.lgu
    public final void d(HashSet hashSet) {
        a.b(this.a, false, true, new mgu(0, this, hashSet));
    }
}
