package defpackage;

import android.net.Uri;
import com.yandex.go.places.impl.domain.entities.payments.PlacesPaymentsCheckoutRequestParams;
import com.yandex.go.places.models.data.entities.network.actions.OpenCatalogFlexAction;
import com.yandex.go.places.organization.card.impl.ui.card.flex.v1.c;
import java.util.Map;
import kotlin.collections.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class f470 implements k8c0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f470(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.k8c0
    public final Object a() {
        switch (this.a) {
        }
        return b.f();
    }

    @Override // defpackage.k8c0
    public final Object b(ContinuationImpl continuationImpl) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                String str = ((OpenCatalogFlexAction) obj).a;
                String queryParameter = str != null ? Uri.parse(str).getQueryParameter("query") : null;
                if (queryParameter != null) {
                    return g8e.z("query", queryParameter);
                }
                return null;
            case 1:
                c cVar = (c) obj;
                ne80 ne80Var = (ne80) cVar.J.a.getValue();
                if (ne80Var == null) {
                    return null;
                }
                Object a = cVar.N.a(ne80Var.a, ne80Var.b, ne80Var.c, ne80Var.d, ne80Var.e, ne80Var.f, ne80Var.g, ne80Var.h, continuationImpl);
                return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : (Map) a;
            default:
                pma0 pma0Var = (pma0) obj;
                return ((xnt) pma0Var.C.a).f(new PlacesPaymentsCheckoutRequestParams(pma0Var.x), PlacesPaymentsCheckoutRequestParams.Companion.serializer());
        }
    }
}
