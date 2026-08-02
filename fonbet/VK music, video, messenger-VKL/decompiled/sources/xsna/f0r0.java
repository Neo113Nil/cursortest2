package xsna;

import androidx.room.RoomDatabase;
import java.util.List;

/* compiled from: UserToggleValueDao_Impl.kt */
/* loaded from: classes11.dex */
public final class f0r0 implements e0r0 {
    public final RoomDatabase a;

    public f0r0(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    @Override // xsna.e0r0
    public final void a(String str) {
        u370.f(this.a, false, true, new y2b(str, 3));
    }

    @Override // xsna.z0p0
    public final void b(String str, String str2) {
        u370.f(this.a, false, true, new k8b0(str, str2));
    }

    @Override // xsna.z0p0
    public final List<y0p0> c(String str) {
        return (List) u370.f(this.a, true, false, new eej(str, 2));
    }

    @Override // xsna.z0p0
    public final String d(String str, String str2) {
        return (String) u370.f(this.a, true, false, new il7(23, str, str2));
    }

    @Override // xsna.z0p0
    public final void e(String str, String str2, String str3) {
        u370.f(this.a, false, true, new rte(str, str2, str3, 9));
    }
}
