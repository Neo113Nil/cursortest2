package defpackage;

import com.yandex.go.places.impl.domain.entities.payments.PlacesPaymentsResultRequestParams;
import java.util.Map;
import kotlin.collections.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class goa0 implements k8c0 {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public Object c;

    public goa0(hoa0 hoa0Var, String str) {
        this.b = hoa0Var;
        this.c = str;
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
                return ((xnt) ((hoa0) obj).B.a).f(new PlacesPaymentsResultRequestParams((String) this.c), PlacesPaymentsResultRequestParams.Companion.serializer());
            default:
                ne80 ne80Var = (ne80) this.c;
                if (ne80Var == null) {
                    return null;
                }
                Object a = ((com.yandex.go.places.organization.card.impl.domain.interactors.flex.b) obj).a(ne80Var.a, ne80Var.b, ne80Var.c, ne80Var.d, ne80Var.e, ne80Var.f, ne80Var.g, ne80Var.h, continuationImpl);
                return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : (Map) a;
        }
    }

    public goa0(com.yandex.go.places.organization.card.impl.domain.interactors.flex.b bVar) {
        this.b = bVar;
    }
}
