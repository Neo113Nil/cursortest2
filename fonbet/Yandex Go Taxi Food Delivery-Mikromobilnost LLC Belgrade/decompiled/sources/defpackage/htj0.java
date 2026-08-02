package defpackage;

import ru.yandex.taxi.search.presenter.e;

/* loaded from: classes6.dex */
public final class htj0 implements jtj0 {
    public final String a;

    public htj0(String str) {
        this.a = str;
    }

    @Override // defpackage.jtj0
    public final void a(e eVar) {
        eVar.Pg(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (htj0.class.equals(obj != null ? obj.getClass() : null)) {
            return this.a.equals(((htj0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
