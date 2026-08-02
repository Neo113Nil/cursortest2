package defpackage;

import com.yandex.go.dynamic.api.DynamicFeature;
import com.yandex.go.dynamic.impl.a;
import com.yandex.go.dynamic.impl.b;
import com.yandex.go.dynamic.impl.exceptions.DynamicFeatureException;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class j7n implements Runnable {
    public final /* synthetic */ b a;
    public final /* synthetic */ a b;
    public final /* synthetic */ DynamicFeature c;
    public final /* synthetic */ Ref$IntRef w;
    public final /* synthetic */ pz40 x;

    public j7n(b bVar, a aVar, DynamicFeature dynamicFeature, Ref$IntRef ref$IntRef, pz40 pz40Var) {
        this.a = bVar;
        this.b = aVar;
        this.c = dynamicFeature;
        this.w = ref$IntRef;
        this.x = pz40Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b bVar = this.a;
        bVar.m().d(this.b);
        if (bVar.m().g().contains(this.c.getId())) {
            return;
        }
        bVar.m().e(this.w.element);
        y7n y7nVar = new y7n(new DynamicFeatureException.DynamicFeatureCanceledException());
        r0 r0Var = (r0) this.x;
        r0Var.getClass();
        r0Var.m(null, y7nVar);
    }
}
