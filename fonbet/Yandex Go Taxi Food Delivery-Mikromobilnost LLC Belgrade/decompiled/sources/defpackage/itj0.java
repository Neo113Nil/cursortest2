package defpackage;

import java.util.List;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.search.presenter.e;

/* loaded from: classes12.dex */
public final class itj0 implements jtj0 {
    public final String a;
    public final RoutePointType b;
    public final long c;
    public final List d;
    public final String e;
    public final String f;

    public itj0(String str, RoutePointType routePointType, long j, List list, String str2, String str3) {
        this.a = str;
        this.b = routePointType;
        this.c = j;
        this.d = list;
        this.e = str2;
        this.f = str3;
    }

    @Override // defpackage.jtj0
    public final void a(e eVar) {
        eVar.Qg(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (itj0.class.equals(obj != null ? obj.getClass() : null)) {
            return jl40.l(this.d, ((itj0) obj).d);
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
