package xsna;

import androidx.room.RoomDatabase;
import java.util.List;

/* compiled from: MetaToggleDao_Impl.kt */
/* loaded from: classes11.dex */
public final class ei20 implements ci20 {
    public final RoomDatabase a;

    public ei20(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    @Override // xsna.ci20
    public final void a(String str) {
        u370.f(this.a, false, true, new rqd(str, 4));
    }

    @Override // xsna.z0p0
    public final void b(String str, String str2) {
        u370.f(this.a, false, true, new uf5(str, str2, 1));
    }

    @Override // xsna.z0p0
    public final List<y0p0> c(String str) {
        return (List) u370.f(this.a, true, false, new zl1(str, 4));
    }

    @Override // xsna.z0p0
    public final String d(final String str, final String str2) {
        return (String) u370.f(this.a, true, false, new izs() { // from class: xsna.di20
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                String str3 = str;
                String str4 = str2;
                qyg0 V0 = ((hyg0) obj).V0("SELECT value FROM meta WHERE name = ? AND storage_name = ? LIMIT 1");
                try {
                    V0.D3(1, str3);
                    V0.D3(2, str4);
                    String str5 = null;
                    if (V0.step() && !V0.isNull(0)) {
                        str5 = V0.l2(0);
                    }
                    return str5;
                } finally {
                    V0.close();
                }
            }
        });
    }

    @Override // xsna.z0p0
    public final void e(String str, String str2, String str3) {
        u370.f(this.a, false, true, new xld(str, str2, str3, 2));
    }
}
