package defpackage;

import com.yandex.go.places.api.navigation.OpenNavigatorActionSubtype;
import com.yandex.go.places.impl.domain.interactors.a;
import com.yandex.go.places.impl.navigation.common.navigator.internal.b;

/* loaded from: classes13.dex */
public final class esj implements h3h {
    public final /* synthetic */ a a;

    public esj(a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.h3h
    public final void a(zzs zzsVar, String str) {
        a aVar = this.a;
        b bVar = aVar.c;
        lg80 a = aVar.f.a();
        if (!a.equals(eg80.b) && !a.equals(fg80.b) && !a.equals(gg80.b)) {
            bVar.b(zzsVar);
        } else {
            bVar.m.a.d0(OpenNavigatorActionSubtype.GO_TO_ACTION, str);
        }
    }

    @Override // defpackage.h3h
    public final void b(w411 w411Var) {
        this.a.c.j(w411Var);
    }

    @Override // defpackage.h3h
    public final void c(pv0 pv0Var) {
        this.a.c.i(pv0Var.a);
    }
}
