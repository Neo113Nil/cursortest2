package xsna;

import com.vk.geo.impl.model.CameraBounds;
import com.vk.geo.impl.model.Coordinate;
import com.vk.geo.impl.model.MutableCameraBounds;
import com.vk.log.L;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.tkt;

/* compiled from: GeoFeature.kt */
@b6l(c = "com.vk.geo.impl.presentation.GeoFeature$loadDataFromExternalSource$1", f = "GeoFeature.kt", l = {748}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ikt extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ CameraBounds $bbox;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ com.vk.geo.impl.presentation.b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ikt(CameraBounds cameraBounds, com.vk.geo.impl.presentation.b bVar, spj<? super ikt> spjVar) {
        super(2, spjVar);
        this.$bbox = cameraBounds;
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ikt(this.$bbox, this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ikt) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            kotlin.a.a(obj);
            CameraBounds cameraBounds = this.$bbox;
            if (cameraBounds == null) {
                return s3q0.a;
            }
            xf9.e.getClass();
            MutableCameraBounds mutableCameraBounds = cameraBounds instanceof MutableCameraBounds ? (MutableCameraBounds) cameraBounds : null;
            fh50<Object> d = mutableCameraBounds != null ? xf9.f.d(mutableCameraBounds) : null;
            if (d == null || d.f()) {
                L.E(new IllegalStateException("bbox is released! " + this.$bbox), new Object[0]);
            } else if (!Coordinate.g(this.$bbox.M())) {
                L.E(new IllegalStateException("bbox cleared " + this.$bbox), new Object[0]);
            }
            fkt fktVar = (fkt) this.this$0.k.getValue();
            if (fktVar == null) {
                return s3q0.a;
            }
            long C = this.$bbox.C();
            tkt.a aVar = fktVar.a;
            double G = this.$bbox.G();
            double Z = this.$bbox.Z();
            double R = this.$bbox.R();
            double D = this.$bbox.D();
            float e = Coordinate.e(C);
            float f = Coordinate.f(C);
            CameraBounds cameraBounds2 = this.$bbox;
            float max = Math.max(cameraBounds2.a0(), cameraBounds2.F());
            this.L$0 = null;
            this.L$1 = null;
            this.J$0 = C;
            this.label = 1;
            z = true;
            a = aVar.a(G, Z, R, D, e, f, max, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            a = obj;
        }
        com.vk.geo.impl.presentation.b bVar = this.this$0;
        CameraBounds cameraBounds3 = this.$bbox;
        qcy<Object>[] qcyVarArr = com.vk.geo.impl.presentation.b.H;
        bVar.Y(cameraBounds3, (List) a, z);
        return s3q0.a;
    }
}
