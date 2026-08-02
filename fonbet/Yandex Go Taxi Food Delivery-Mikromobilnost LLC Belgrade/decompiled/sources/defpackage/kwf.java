package defpackage;

import android.content.Context;
import ru.yandex.logistics.cargo_form.async.impl.polling.b;
import ru.yandex.taxi.logistics.sdk.delivery.state.d;
import ru.yandex.taxi.logistics.sdk.management.f;
import ru.yandex.taxi.logistics.sdk.ui.AppVisibilitySubscriptionImpl;

/* loaded from: classes9.dex */
public final class kwf implements xvf0 {
    public final /* synthetic */ int a;
    public final ru2 b;

    public /* synthetic */ kwf(ru2 ru2Var, int i) {
        this.a = i;
        this.b = ru2Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        ru2 ru2Var = this.b;
        switch (i) {
            case 0:
                return (jwh) ru2Var.f;
            case 1:
                st2 st2Var = (st2) ru2Var.a;
                q5z.h(st2Var);
                return st2Var;
            case 2:
                return (AppVisibilitySubscriptionImpl) ru2Var.b;
            case 3:
                Context context = (Context) ru2Var.g;
                q5z.h(context);
                return context;
            case 4:
                f fVar = (f) ru2Var.e;
                q5z.h(fVar);
                return fVar;
            case 5:
                return (d) ru2Var.h;
            case 6:
                return (b) ru2Var.i;
            case 7:
                com.yandex.delivery.live.location.impl.repository.b bVar = (com.yandex.delivery.live.location.impl.repository.b) ru2Var.d;
                q5z.h(bVar);
                return bVar;
            default:
                t0k0 t0k0Var = (t0k0) ru2Var.c;
                q5z.h(t0k0Var);
                return t0k0Var;
        }
    }
}
