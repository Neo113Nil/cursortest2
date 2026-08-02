package defpackage;

import androidx.room.RoomDatabase;
import androidx.room.util.a;

/* loaded from: classes15.dex */
public final class gqr0 extends fqr0 {
    public final RoomDatabase a;
    public final x7b0 b = new x7b0(6);

    public gqr0(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    @Override // defpackage.fqr0
    public final int a(String str) {
        return ((Number) a.b(this.a, false, true, new g8r0(str, 4))).intValue();
    }

    @Override // defpackage.fqr0
    public final int b(String str) {
        return ((Number) a.b(this.a, false, true, new g8r0(str, 3))).intValue();
    }

    @Override // defpackage.fqr0
    public final boolean c(long j, String str) {
        return ((Boolean) a.b(this.a, true, false, new qo6(str, j, 22))).booleanValue();
    }

    @Override // defpackage.fqr0
    public final long d(iqr0 iqr0Var) {
        return ((Number) a.b(this.a, false, true, new a5p0(26, this, iqr0Var))).longValue();
    }

    @Override // defpackage.fqr0
    public final int e(long j, String str, String str2) {
        return ((Number) a.b(this.a, false, true, new ec1(str2, str, j, 11))).intValue();
    }
}
