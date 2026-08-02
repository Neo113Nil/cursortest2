package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.yandex.go.scooters.c;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.routing.f;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final /* synthetic */ class biw implements vje, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ biw(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.vje
    public final Object a(Intent intent, Continuation continuation) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                f fVar = (f) obj;
                fVar.getClass();
                Uri data = intent.getData();
                if (data == null || !"intercity_main".equalsIgnoreCase(data.getAuthority())) {
                    return n5u.a;
                }
                fVar.F.getClass();
                egw a = dcw.a(data);
                ifw ifwVar = fVar.G;
                hfw hfwVar = new hfw("intercity", a.b, a.d);
                r0 r0Var = ifwVar.a;
                r0Var.getClass();
                r0Var.m(null, hfwVar);
                ynw ynwVar = new ynw(a.c);
                r0 r0Var2 = ifwVar.b;
                r0Var2.getClass();
                r0Var2.m(null, ynwVar);
                return new m5u(false, false);
            case 1:
                return c.Q((c) obj, intent, (ContinuationImpl) continuation);
            default:
                return com.yandex.go.taxi.order.deeplink.c.a((com.yandex.go.taxi.order.deeplink.c) obj, intent, (ContinuationImpl) continuation);
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof vje) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof vje) && (obj instanceof jms)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof vje) && (obj instanceof jms)) {
                    break;
                }
                break;
        }
        return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        switch (this.a) {
            case 0:
                return new AdaptedFunctionReference(2, (f) this.b, f.class, "onNewIntent", "onNewIntent(Landroid/content/Intent;)Lru/yandex/taxi/deeplinks/HandleIntentResult;", 4);
            case 1:
                return new FunctionReferenceImpl(2, (c) this.b, c.class, "processIntent", "processIntent(Landroid/content/Intent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            default:
                return new FunctionReferenceImpl(2, (com.yandex.go.taxi.order.deeplink.c) this.b, com.yandex.go.taxi.order.deeplink.c.class, "handleIntent", "handleIntent(Landroid/content/Intent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
