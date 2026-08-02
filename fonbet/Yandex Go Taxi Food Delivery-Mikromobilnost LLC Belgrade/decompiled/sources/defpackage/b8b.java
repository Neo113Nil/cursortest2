package defpackage;

import androidx.room.RoomDatabase;
import androidx.room.util.a;

/* loaded from: classes15.dex */
public final class b8b extends a8b {
    public final RoomDatabase a;

    public b8b(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    @Override // defpackage.a8b
    public final long a(String str, boolean z) {
        return ((Number) a.b(this.a, false, true, new lo1(str, z, 3))).longValue();
    }

    @Override // defpackage.a8b
    public final boolean b(String str) {
        return ((Boolean) a.b(this.a, true, false, new b5a(str, 10))).booleanValue();
    }
}
