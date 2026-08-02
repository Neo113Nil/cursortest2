package defpackage;

import com.yandex.go.payments.shared.family.invites.a;
import com.yandex.go.payments.shared.family.invites.d;
import com.yandex.go.payments.shared.family.invites.ui.FamilyInviteView;
import defpackage.owx;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes13.dex */
public final /* synthetic */ class fbp implements vpr, jms {
    public final /* synthetic */ d a;

    public fbp(d dVar) {
        this.a = dVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        owx.c cVar = (owx.c) obj;
        d dVar = this.a;
        i6r i6rVar = dVar.b;
        cVar.getClass();
        i6rVar.getClass();
        FamilyInviteView familyInviteView = (FamilyInviteView) i5m.b(new cto(new tzf(i6rVar, 28), i5m.b(new cbp(n3w.a(cVar), new wzf(i6rVar, 1), lap.a, dhs0.a(new p9p(new wzf(i6rVar, 0), 2)), new qsn(new p9p(new tzf(i6rVar, 29), 1), 9), new wzf(i6rVar, 3))), new wzf(i6rVar, 2), 17)).get();
        familyInviteView.setOnAppearingListener(new a(dVar, cVar));
        dVar.d.a().k(familyInviteView, 3.0f, true);
        return zy11.a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof vpr) && (obj instanceof jms)) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new AdaptedFunctionReference(2, this.a, d.class, "showInvite", "showInvite(Lru/yandex/taxi/client/response/LaunchResponse$FamilyInvite;)V", 4);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
