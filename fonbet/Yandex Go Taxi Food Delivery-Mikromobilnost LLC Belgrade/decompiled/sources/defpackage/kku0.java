package defpackage;

import androidx.room.RoomDatabase;
import androidx.room.util.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class kku0 extends gku0 {
    public final RoomDatabase a;
    public final ple0 b = new ple0(1);
    public final jku0 c = new jku0(0);

    public kku0(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    public static void l(kku0 kku0Var, String str, Collection collection) {
        super.d(str, collection);
    }

    public static void m(kku0 kku0Var, String str, ArrayList arrayList, long j) {
        super.h(j, str, arrayList);
    }

    public static void n(kku0 kku0Var, ArrayList arrayList) {
        super.e(arrayList);
    }

    public static void o(kku0 kku0Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        super.f(arrayList, arrayList2, arrayList3);
    }

    @Override // defpackage.gku0
    public final void a(String str, Collection collection) {
        StringBuilder t = qv10.t("DELETE FROM stored_experiments WHERE source = ? AND name IN (");
        q5z.b(t, collection.size());
        t.append(Extension.C_BRAKE);
        a.b(this.a, false, true, new ga1(19, t.toString(), str, collection));
    }

    @Override // defpackage.gku0
    public final bku0 b(long j, String str, String str2) {
        return (bku0) a.b(this.a, true, false, new u2j0(str, str2, j));
    }

    @Override // defpackage.gku0
    public final List c(long j, String str) {
        return (List) a.b(this.a, true, false, new hku0(str, j));
    }

    @Override // defpackage.gku0
    public final void d(String str, Collection collection) {
        a.b(this.a, false, true, new ga1(18, this, str, collection));
    }

    @Override // defpackage.gku0
    public final void e(ArrayList arrayList) {
        a.b(this.a, false, true, new iku0(this, arrayList, 0));
    }

    @Override // defpackage.gku0
    public final void f(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        a.b(this.a, false, true, new veu(this, arrayList, arrayList2, arrayList3, 3));
    }

    @Override // defpackage.gku0
    public final int g(long j, String str, ArrayList arrayList) {
        StringBuilder t = qv10.t("UPDATE stored_experiments SET last_update = ? WHERE source = ? AND name IN (");
        q5z.b(t, arrayList.size());
        t.append(Extension.C_BRAKE);
        return ((Number) a.b(this.a, false, true, new sa6(t.toString(), j, str, arrayList, 5))).intValue();
    }

    @Override // defpackage.gku0
    public final void h(long j, String str, ArrayList arrayList) {
        a.b(this.a, false, true, new sa6(this, str, arrayList, j, 6));
    }

    @Override // defpackage.gku0
    public final int i(String str, String str2, String str3, String str4, long j) {
        return ((Number) a.b(this.a, false, true, new mgr0(str3, str4, str, str2, j))).intValue();
    }

    @Override // defpackage.gku0
    public final int j(ArrayList arrayList) {
        return ((Number) a.b(this.a, false, true, new scs0(27, this, arrayList))).intValue();
    }

    @Override // defpackage.gku0
    public final void k(ArrayList arrayList) {
        a.b(this.a, false, true, new iku0(this, arrayList, 1));
    }
}
