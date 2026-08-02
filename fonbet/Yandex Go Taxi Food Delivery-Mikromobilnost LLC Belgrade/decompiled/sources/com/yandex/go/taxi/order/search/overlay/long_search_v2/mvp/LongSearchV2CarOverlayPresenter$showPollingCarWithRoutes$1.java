package com.yandex.go.taxi.order.search.overlay.long_search_v2.mvp;

import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.geometry.Polyline;
import defpackage.b64;
import defpackage.cl7;
import defpackage.dvw;
import defpackage.i8m;
import defpackage.j18;
import defpackage.m58;
import defpackage.mvg;
import defpackage.mx0;
import defpackage.nnz;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tse;
import defpackage.vj;
import defpackage.wj;
import defpackage.wls;
import defpackage.ycc;
import defpackage.z1e0;
import defpackage.zmz;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.map_common.map.o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.search.overlay.long_search_v2.mvp.LongSearchV2CarOverlayPresenter$showPollingCarWithRoutes$1", f = "LongSearchV2CarOverlayPresenter.kt", l = {393, 408}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class LongSearchV2CarOverlayPresenter$showPollingCarWithRoutes$1 extends SuspendLambda implements wls {
    final /* synthetic */ m58 $carInfo;
    final /* synthetic */ List<List<zzs>> $drivingRoutes;
    final /* synthetic */ boolean $shouldAnimateAppearing;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LongSearchV2CarOverlayPresenter$showPollingCarWithRoutes$1(List list, m58 m58Var, boolean z, c cVar, Continuation continuation) {
        super(2, continuation);
        this.$drivingRoutes = list;
        this.$carInfo = m58Var;
        this.$shouldAnimateAppearing = z;
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LongSearchV2CarOverlayPresenter$showPollingCarWithRoutes$1(this.$drivingRoutes, this.$carInfo, this.$shouldAnimateAppearing, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LongSearchV2CarOverlayPresenter$showPollingCarWithRoutes$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ed, code lost:
    
        if (r4 == r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00fc  */
    /* JADX WARN: Type inference failed for: r4v8, types: [T, i8m] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00ed -> B:11:0x00f1). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        m58 m58Var;
        Iterator it;
        c cVar;
        Collection collection;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        int i2 = 1;
        if (i == 0) {
            kotlin.b.b(obj);
            List<List<zzs>> list = this.$drivingRoutes;
            c cVar2 = this.this$0;
            m58Var = this.$carInfo;
            ArrayList arrayList = new ArrayList();
            it = list.iterator();
            cVar = cVar2;
            collection = arrayList;
            if (it.hasNext()) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return zy11Var;
        }
        it = (Iterator) this.L$6;
        collection = (Collection) this.L$4;
        m58Var = (m58) this.L$2;
        cVar = (c) this.L$1;
        kotlin.b.b(obj);
        Object s = obj;
        DrivingRoute drivingRoute = (DrivingRoute) s;
        if (drivingRoute != null) {
            collection.add(drivingRoute);
        }
        i2 = 1;
        if (it.hasNext()) {
            List list2 = (List) collection;
            if (!list2.isEmpty()) {
                List list3 = list2;
                ArrayList arrayList2 = new ArrayList(tcc.n(list3, 10));
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((DrivingRoute) it2.next()).getGeometry());
                }
                z1e0 z1e0Var = new z1e0(this.$carInfo, arrayList2);
                z1e0Var.c = this.$shouldAnimateAppearing;
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    ycc.r(((Polyline) it3.next()).getPoints(), arrayList3);
                }
                if (!z1e0Var.equals(this.this$0.Q) && !arrayList3.isEmpty()) {
                    c cVar3 = this.this$0;
                    cVar3.Q = z1e0Var;
                    nnz nnzVar = (nnz) cVar3.Dg();
                    zzs Lg = this.this$0.Lg();
                    mx0 mx0Var = new mx0(5, this.this$0);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.L$8 = null;
                    this.L$9 = null;
                    this.label = 2;
                    if (nnzVar.u9(arrayList3, Lg, mx0Var, this) == coroutineSingletons) {
                    }
                }
            }
            return zy11Var;
        }
        List list4 = (List) it.next();
        this.L$0 = null;
        this.L$1 = cVar;
        this.L$2 = m58Var;
        this.L$3 = null;
        this.L$4 = collection;
        this.L$5 = null;
        this.L$6 = it;
        this.L$7 = null;
        this.L$8 = null;
        this.L$9 = null;
        this.label = i2;
        o oVar = (o) cVar.y;
        oVar.d();
        j18 j18Var = new j18(i2, dvw.b(this));
        Ref$ObjectRef y = b64.y(j18Var);
        vj vjVar = new vj(15, y);
        cl7 cl7Var = new cl7(j18Var, vjVar);
        oVar.g(list4, null, new zmz(cVar, new LongSearchV2CarOverlayPresenter$queryRoute$$inlined$suspendCallbackApi$2(1, cl7Var, cl7.class, "success", "success(Ljava/lang/Object;)V", 0), m58Var), null);
        y.element = new i8m(24, cVar);
        if (cl7Var.c()) {
            vjVar.invoke();
        } else {
            j18Var.w(new wj(cl7Var, 15));
        }
        s = j18Var.s();
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        return coroutineSingletons;
    }
}
