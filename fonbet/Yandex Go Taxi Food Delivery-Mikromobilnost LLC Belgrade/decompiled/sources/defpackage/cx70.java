package defpackage;

import com.yandex.go.permission.b;
import defpackage.tje;
import defpackage.tse;
import defpackage.ww70;
import java.util.function.Consumer;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.order.i;

/* loaded from: classes6.dex */
public final /* synthetic */ class cx70 implements jms {
    public final /* synthetic */ i a;

    public cx70(i iVar) {
        this.a = iVar;
    }

    public final void a(final boolean z, final boolean z2, final boolean z3) {
        final i iVar = this.a;
        iVar.D0 = ((b) iVar.E).c(1, new Consumer() { // from class: ru.yandex.taxi.order.h
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                i iVar2 = i.this;
                d dVar = iVar2.C;
                if (!((Boolean) obj).booleanValue()) {
                    ((ww70) iVar2.Dg()).kb();
                    return;
                }
                tse tseVar = dVar.a;
                boolean z4 = z;
                tje.N(tseVar, null, null, new GeoSharingInteractorImpl$onTrySharingActivated$1(dVar, z4, z2, null), 3);
                if (z3) {
                    ru.yandex.taxi.utils.b bVar = dVar.c;
                    bVar.m.u(bVar.g, z4);
                }
            }
        });
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cx70) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new FunctionReferenceImpl(3, this.a, i.class, "addSwitchingLocationSharingSubscription", "addSwitchingLocationSharingSubscription(ZZZ)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
