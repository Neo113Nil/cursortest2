package defpackage;

import androidx.room.RoomDatabase;
import kotlin.a;

/* loaded from: classes15.dex */
public final class gv21 extends cv21 {
    public final RoomDatabase a;
    public final i3y c;
    public final i3y d;
    public final fv21 b = new fv21(this, 0);
    public final fv21 e = new fv21(this, 1);

    public gv21(RoomDatabase roomDatabase) {
        this.c = a.a(new e4r(roomDatabase, 9));
        this.d = a.a(new e4r(roomDatabase, 10));
        this.a = roomDatabase;
    }

    public static void f(gv21 gv21Var, String str) {
        super.d(str);
    }

    @Override // defpackage.cv21
    public final hv21 a(String str) {
        return (hv21) androidx.room.util.a.b(this.a, true, false, new dv21(str, this));
    }

    @Override // defpackage.cv21
    public final long b(hv21 hv21Var) {
        return ((Number) androidx.room.util.a.b(this.a, false, true, new ev21(this, hv21Var, 1))).longValue();
    }

    @Override // defpackage.cv21
    public final void c(hv21 hv21Var) {
        androidx.room.util.a.b(this.a, false, true, new ev21(this, hv21Var, 0));
    }

    @Override // defpackage.cv21
    public final void d(String str) {
        androidx.room.util.a.b(this.a, false, true, new dv21(this, str));
    }

    @Override // defpackage.cv21
    public final void e(String str) {
        androidx.room.util.a.b(this.a, false, true, new il01(str, 27));
    }
}
