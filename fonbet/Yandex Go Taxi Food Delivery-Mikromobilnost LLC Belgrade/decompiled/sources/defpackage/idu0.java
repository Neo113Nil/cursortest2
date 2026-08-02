package defpackage;

import androidx.room.RoomDatabase;
import androidx.room.util.a;
import java.util.List;

/* loaded from: classes15.dex */
public final class idu0 extends gdu0 {
    public final RoomDatabase a;
    public final x7b0 b = new x7b0(8);
    public final x7b0 c = new x7b0(9);

    public idu0(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    @Override // defpackage.gdu0
    public final void a(String str) {
        a.b(this.a, false, true, new g8r0(str, 12));
    }

    @Override // defpackage.gdu0
    public final void b(String str) {
        a.b(this.a, false, true, new g8r0(str, 13));
    }

    @Override // defpackage.gdu0
    public final void c() {
        a.b(this.a, false, true, new x8t0(16));
    }

    @Override // defpackage.gdu0
    public final String[] d() {
        return (String[]) a.b(this.a, true, false, new x8t0(15));
    }

    @Override // defpackage.gdu0
    public final gcu0 e(String str) {
        return (gcu0) a.b(this.a, true, false, new g8r0(str, 10));
    }

    @Override // defpackage.gdu0
    public final String f(String str, String str2) {
        return (String) a.b(this.a, true, false, new r(str, str2, 26));
    }

    @Override // defpackage.gdu0
    public final List g(String str) {
        return (List) a.b(this.a, true, false, new g8r0(str, 11));
    }

    @Override // defpackage.gdu0
    public final String[] h() {
        return (String[]) a.b(this.a, true, false, new x8t0(14));
    }

    @Override // defpackage.gdu0
    public final void i(ubu0 ubu0Var) {
        a.b(this.a, false, true, new scs0(20, this, ubu0Var));
    }

    @Override // defpackage.gdu0
    public final void j(gcu0 gcu0Var) {
        a.b(this.a, false, true, new scs0(19, this, gcu0Var));
    }

    @Override // defpackage.gdu0
    public final void k(int i, String str) {
        a.b(this.a, false, true, new hdu0(str, i, 0));
    }
}
