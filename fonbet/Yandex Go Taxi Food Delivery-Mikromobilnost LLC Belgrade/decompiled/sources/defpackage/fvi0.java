package defpackage;

import androidx.room.RoomDatabase;
import androidx.room.util.a;
import java.util.List;

/* loaded from: classes15.dex */
public final class fvi0 extends dvi0 {
    public final RoomDatabase a;
    public final x7b0 b = new x7b0(4);
    public final jcb c = new jcb(3);

    public fvi0(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    @Override // defpackage.dvi0
    public final int a() {
        return ((Number) a.b(this.a, false, true, new nqi0(3))).intValue();
    }

    @Override // defpackage.dvi0
    public final int b(String str) {
        return ((Number) a.b(this.a, false, true, new dcc0(str, 14))).intValue();
    }

    @Override // defpackage.dvi0
    public final List c() {
        return (List) a.b(this.a, true, false, new nqi0(2));
    }

    @Override // defpackage.dvi0
    public final List d() {
        return (List) a.b(this.a, true, false, new nqi0(1));
    }

    @Override // defpackage.dvi0
    public final cvi0 e(String str) {
        return (cvi0) a.b(this.a, true, false, new dcc0(str, 15));
    }

    @Override // defpackage.dvi0
    public final String f(String str, String str2) {
        return (String) a.b(this.a, true, false, new r(str, str2, 24));
    }

    @Override // defpackage.dvi0
    public final Long g(String str) {
        return (Long) a.b(this.a, true, false, new dcc0(str, 13));
    }

    @Override // defpackage.dvi0
    public final long h(cvi0 cvi0Var) {
        return ((Number) a.b(this.a, false, true, new evi0(this, cvi0Var, 0))).longValue();
    }

    @Override // defpackage.dvi0
    public final int i(cvi0 cvi0Var) {
        return ((Number) a.b(this.a, false, true, new evi0(this, cvi0Var, 1))).intValue();
    }
}
