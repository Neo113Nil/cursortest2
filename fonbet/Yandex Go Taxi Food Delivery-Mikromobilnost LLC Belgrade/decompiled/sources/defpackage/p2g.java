package defpackage;

import android.content.Context;
import com.yandex.delivery.live.location.impl.repository.b;
import ru.yandex.taxi.logistics.sdk.management.f;
import ru.yandex.taxi.logistics.sdk.ui.AppVisibilitySubscriptionImpl;

/* loaded from: classes.dex */
public final class p2g implements xvf0 {
    public final /* synthetic */ int a;
    public final n1d b;

    public /* synthetic */ p2g(n1d n1dVar, int i) {
        this.a = i;
        this.b = n1dVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        n1d n1dVar = this.b;
        switch (i) {
            case 0:
                jwh jwhVar = (jwh) n1dVar.f;
                q5z.h(jwhVar);
                return jwhVar;
            case 1:
                st2 st2Var = (st2) n1dVar.a;
                q5z.h(st2Var);
                return st2Var;
            case 2:
                AppVisibilitySubscriptionImpl appVisibilitySubscriptionImpl = (AppVisibilitySubscriptionImpl) n1dVar.b;
                q5z.h(appVisibilitySubscriptionImpl);
                return appVisibilitySubscriptionImpl;
            case 3:
                Context context = (Context) n1dVar.g;
                q5z.h(context);
                return context;
            case 4:
                f fVar = (f) n1dVar.e;
                q5z.h(fVar);
                return fVar;
            case 5:
                b bVar = (b) n1dVar.d;
                q5z.h(bVar);
                return bVar;
            default:
                t0k0 t0k0Var = (t0k0) n1dVar.c;
                q5z.h(t0k0Var);
                return t0k0Var;
        }
    }
}
