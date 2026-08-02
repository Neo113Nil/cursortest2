package defpackage;

import com.yandex.go.tariffcard.repository.b;
import com.yandex.go.tariffcard.repository.d;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import kotlinx.coroutines.flow.e;

/* loaded from: classes14.dex */
public final class jix0 implements roj0 {
    public final wiq0 a;
    public final b b;
    public final d c;

    public jix0(wiq0 wiq0Var) {
        this.a = wiq0Var;
        k kVar = (k) wiq0Var;
        this.b = new b(e.t(kVar.j.b()));
        this.c = new d(e.t(kVar.j.b()));
    }

    @Override // defpackage.roj0
    public final pex0 a() {
        return ((k) this.a).m();
    }

    @Override // defpackage.roj0
    public final String b() {
        pex0 pex0Var;
        String str;
        fnx0 n = ((k) this.a).n();
        return (n == null || (pex0Var = n.c) == null || (str = pex0Var.b) == null) ? "" : str;
    }

    @Override // defpackage.roj0
    public final String c() {
        String str;
        fnx0 n = ((k) this.a).n();
        return (n == null || (str = n.d) == null) ? "" : str;
    }

    @Override // defpackage.roj0
    public final tpr d() {
        return this.b;
    }

    @Override // defpackage.roj0
    public final tpr e() {
        return this.c;
    }
}
