package defpackage;

import androidx.room.RoomDatabase;
import androidx.room.util.a;
import java.util.List;

/* loaded from: classes15.dex */
public final class gc1 extends dc1 {
    public final RoomDatabase a;
    public final fc1 b = new fc1(0);

    public gc1(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    public static void e(gc1 gc1Var, long j, String[] strArr) {
        super.d(j, strArr);
    }

    @Override // defpackage.dc1
    public final int a(long j) {
        return ((Number) a.b(this.a, false, true, new cs0(j, 1))).intValue();
    }

    @Override // defpackage.dc1
    public final List b(long j) {
        return (List) a.b(this.a, true, false, new cs0(j, 2));
    }

    @Override // defpackage.dc1
    public final long c(cc1 cc1Var) {
        return ((Number) a.b(this.a, false, true, new v5(11, this, cc1Var))).longValue();
    }

    @Override // defpackage.dc1
    public final void d(long j, String[] strArr) {
        a.b(this.a, false, true, new ec1(this, j, strArr, 0));
    }
}
