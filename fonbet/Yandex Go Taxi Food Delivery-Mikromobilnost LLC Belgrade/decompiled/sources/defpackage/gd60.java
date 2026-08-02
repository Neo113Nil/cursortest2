package defpackage;

import androidx.room.RoomDatabase;
import androidx.room.util.a;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes15.dex */
public final class gd60 extends ed60 {
    public final RoomDatabase a;

    public gd60(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    public static void f(gd60 gd60Var, HashSet hashSet) {
        super.e(hashSet);
    }

    @Override // defpackage.ed60
    public final int a() {
        return ((Number) a.b(this.a, false, true, new ej40(29))).intValue();
    }

    @Override // defpackage.ed60
    public final boolean b(int i) {
        return ((Boolean) a.b(this.a, true, false, new ii8(i, 12))).booleanValue();
    }

    @Override // defpackage.ed60
    public final List c() {
        return (List) a.b(this.a, true, false, new fd60(0));
    }

    @Override // defpackage.ed60
    public final long d(int i) {
        return ((Number) a.b(this.a, false, true, new ii8(i, 11))).longValue();
    }

    @Override // defpackage.ed60
    public final void e(HashSet hashSet) {
        a.b(this.a, false, true, new zl50(5, this, hashSet));
    }
}
