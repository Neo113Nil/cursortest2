package defpackage;

import com.yandex.go.payments.domain.l0;
import com.yandex.go.payments.lpm.navigation.d;

/* loaded from: classes8.dex */
public final class dy90 implements by90 {
    public final ey90 a;
    public final String b;
    public final a30 c;

    public dy90(ey90 ey90Var, String str, a30 a30Var) {
        this.a = ey90Var;
        this.b = str;
        this.c = a30Var;
    }

    @Override // defpackage.by90
    public final d a() {
        return this.a.a();
    }

    @Override // defpackage.by90
    public final l0 b() {
        return this.a.b();
    }

    @Override // defpackage.by90
    public final bia0 c() {
        return this.a.c();
    }

    @Override // defpackage.by90
    public final z0a0 d() {
        return this.a.d();
    }

    @Override // defpackage.by90
    public final void dispose() {
        this.c.a.remove(this.b);
        this.a.dispose();
    }
}
