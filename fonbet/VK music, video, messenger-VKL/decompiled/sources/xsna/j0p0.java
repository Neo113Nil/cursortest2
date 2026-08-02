package xsna;

import android.database.sqlite.SQLiteException;
import com.vk.toggle.internal.storage.database.FeatureDatabase;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* compiled from: ToggleDataSource.kt */
/* loaded from: classes11.dex */
public final class j0p0 implements xuq {
    public final FeatureDatabase a;
    public final db3 b;
    public final ci20 c;
    public final e0r0 d;
    public final da3 e;

    public j0p0(FeatureDatabase featureDatabase, db3 db3Var) {
        this.a = featureDatabase;
        this.b = db3Var;
        this.c = featureDatabase.z();
        this.d = featureDatabase.A();
        this.e = featureDatabase.y();
    }

    @Override // xsna.xuq
    public final String a(String str, String str2, boolean z) {
        try {
            return (z ? this.d : this.e).d(str, str2);
        } catch (SQLiteException e) {
            this.b.invoke(e);
            return null;
        }
    }

    @Override // xsna.xuq
    public final String b(String str, String str2) {
        try {
            return this.c.d(str, str2);
        } catch (SQLiteException e) {
            this.b.invoke(e);
            return null;
        }
    }

    @Override // xsna.xuq
    public final void c(String str, String str2, String str3, boolean z) {
        (z ? this.d : this.e).e(str, str2, str3);
    }

    @Override // xsna.xuq
    public final void d(String str) {
        this.a.v(new c0(7, this, str));
    }

    @Override // xsna.xuq
    public final void e(String str, String str2, boolean z) {
        (z ? this.d : this.e).b(str, str2);
    }

    @Override // xsna.xuq
    public final List f(String str, boolean z) {
        try {
            List<y0p0> c = (z ? this.d : this.e).c(str);
            ArrayList arrayList = new ArrayList(c5g.u(c, 10));
            for (y0p0 y0p0Var : c) {
                arrayList.add(new Pair(y0p0Var.a(), y0p0Var.b()));
            }
            return arrayList;
        } catch (SQLiteException e) {
            this.b.invoke(e);
            return EmptyList.b;
        }
    }

    @Override // xsna.xuq
    public final void g(String str, String str2) {
        this.a.v(new u970(this, str, str2, 2));
    }

    @Override // xsna.xuq
    public final void h(String str, String str2, String str3) {
        this.c.e(str, str2, str3);
    }
}
