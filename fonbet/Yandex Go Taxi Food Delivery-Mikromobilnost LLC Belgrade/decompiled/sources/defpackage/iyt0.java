package defpackage;

import androidx.room.RoomDatabase;
import androidx.room.util.a;

/* loaded from: classes15.dex */
public final class iyt0 extends hyt0 {
    public final RoomDatabase a;

    public iyt0(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    @Override // defpackage.hyt0
    public final long a(String str) {
        return ((Number) a.b(this.a, true, false, new g8r0(str, 8))).longValue();
    }

    @Override // defpackage.hyt0
    public final void b(long j, String str) {
        a.b(this.a, false, true, new qo6(str, j, 23));
    }
}
