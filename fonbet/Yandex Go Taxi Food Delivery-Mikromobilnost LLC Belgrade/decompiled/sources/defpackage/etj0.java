package defpackage;

import ru.yandex.taxi.search.presenter.e;

/* loaded from: classes12.dex */
public final class etj0 implements jtj0 {
    public final qpc a;

    public etj0(qpc qpcVar) {
        this.a = qpcVar;
    }

    @Override // defpackage.jtj0
    public final void a(e eVar) {
        eVar.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (etj0.class.equals(obj != null ? obj.getClass() : null)) {
            return this.a.equals(((etj0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
