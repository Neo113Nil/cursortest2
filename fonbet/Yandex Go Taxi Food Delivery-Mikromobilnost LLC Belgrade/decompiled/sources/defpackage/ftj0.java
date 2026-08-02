package defpackage;

import ru.yandex.taxi.search.presenter.e;

/* loaded from: classes6.dex */
public final class ftj0 implements jtj0 {
    public final pv0 a;

    public ftj0(pv0 pv0Var) {
        this.a = pv0Var;
    }

    @Override // defpackage.jtj0
    public final void a(e eVar) {
        eVar.Ng(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (ftj0.class.equals(obj != null ? obj.getClass() : null)) {
            return jl40.l(this.a, ((ftj0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
