package defpackage;

import com.yandex.delivery.utils.storage.impl.c;
import ru.yandex.taxi.logistics.sdk.management.localstate.e;
import ru.yandex.taxi.logistics.sdk.management.storage.f;
import ru.yandex.taxi.logistics.sdk.ui.AppVisibilitySubscriptionImpl;

/* loaded from: classes12.dex */
public final class ibg implements xvf0 {
    public final /* synthetic */ int a;
    public final c4g b;

    public /* synthetic */ ibg(c4g c4gVar, int i) {
        this.a = i;
        this.b = c4gVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        c4g c4gVar = this.b;
        switch (i) {
            case 0:
                qcp0 qcp0Var = (qcp0) c4gVar.a;
                q5z.h(qcp0Var);
                return qcp0Var;
            case 1:
                c cVar = (c) c4gVar.N;
                q5z.h(cVar);
                return cVar;
            case 2:
                l7x0 l7x0Var = (l7x0) c4gVar.b;
                q5z.h(l7x0Var);
                return l7x0Var;
            case 3:
                hwy0 hwy0Var = (hwy0) c4gVar.q;
                q5z.h(hwy0Var);
                return hwy0Var;
            case 4:
                z501 z501Var = (z501) c4gVar.s;
                q5z.h(z501Var);
                return z501Var;
            case 5:
                f fVar = (f) c4gVar.K;
                q5z.h(fVar);
                return fVar;
            case 6:
                s701 s701Var = (s701) c4gVar.r;
                q5z.h(s701Var);
                return s701Var;
            case 7:
                AppVisibilitySubscriptionImpl appVisibilitySubscriptionImpl = (AppVisibilitySubscriptionImpl) c4gVar.G;
                q5z.h(appVisibilitySubscriptionImpl);
                return appVisibilitySubscriptionImpl;
            case 8:
                ru.yandex.taxi.logistics.sdk.voiceforwarding.impl.c cVar2 = (ru.yandex.taxi.logistics.sdk.voiceforwarding.impl.c) c4gVar.j;
                q5z.h(cVar2);
                return cVar2;
            default:
                e eVar = (e) c4gVar.f;
                q5z.h(eVar);
                return eVar;
        }
    }
}
