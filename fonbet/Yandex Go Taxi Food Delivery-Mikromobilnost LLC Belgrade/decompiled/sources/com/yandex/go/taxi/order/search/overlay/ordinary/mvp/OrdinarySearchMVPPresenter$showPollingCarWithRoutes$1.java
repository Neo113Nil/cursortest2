package com.yandex.go.taxi.order.search.overlay.ordinary.mvp;

import com.yandex.go.taxi.order.domain.repositories.n;
import com.yandex.go.taxi.order.state.search.SearchState;
import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.geometry.Polyline;
import defpackage.a3y0;
import defpackage.b64;
import defpackage.cl7;
import defpackage.cx60;
import defpackage.dvw;
import defpackage.dx60;
import defpackage.fr30;
import defpackage.hst;
import defpackage.ii30;
import defpackage.j18;
import defpackage.jst;
import defpackage.m58;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.tcc;
import defpackage.tse;
import defpackage.u8w;
import defpackage.ud80;
import defpackage.wd80;
import defpackage.wls;
import defpackage.z1e0;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.map_common.map.o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.search.overlay.ordinary.mvp.OrdinarySearchMVPPresenter$showPollingCarWithRoutes$1", f = "OrdinarySearchMVPPresenter.kt", l = {200, 372}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrdinarySearchMVPPresenter$showPollingCarWithRoutes$1 extends SuspendLambda implements wls {
    final /* synthetic */ m58 $carInfo;
    final /* synthetic */ List<List<zzs>> $drivingRoutes;
    final /* synthetic */ boolean $shouldAnimateAppearing;
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrdinarySearchMVPPresenter$showPollingCarWithRoutes$1(List list, b bVar, m58 m58Var, boolean z, Continuation continuation) {
        super(2, continuation);
        this.$drivingRoutes = list;
        this.this$0 = bVar;
        this.$carInfo = m58Var;
        this.$shouldAnimateAppearing = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrdinarySearchMVPPresenter$showPollingCarWithRoutes$1(this.$drivingRoutes, this.this$0, this.$carInfo, this.$shouldAnimateAppearing, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrdinarySearchMVPPresenter$showPollingCarWithRoutes$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0102, code lost:
    
        if (r4 == r1) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x01cf  */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [T, ii30] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x01be -> B:6:0x01c3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0102 -> B:33:0x0106). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        b bVar;
        Collection collection;
        ArrayList arrayList;
        int i;
        z1e0 z1e0Var;
        b bVar2;
        Ref$BooleanRef ref$BooleanRef;
        long currentTimeMillis;
        Ref$IntRef ref$IntRef;
        Object Kg;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        zy11 zy11Var = zy11.a;
        if (i2 == 0) {
            kotlin.b.b(obj);
            List<List<zzs>> list = this.$drivingRoutes;
            b bVar3 = this.this$0;
            ArrayList arrayList2 = new ArrayList();
            it = list.iterator();
            bVar = bVar3;
            collection = arrayList2;
            if (it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                currentTimeMillis = this.J$0;
                i = this.I$0;
                ref$BooleanRef = (Ref$BooleanRef) this.L$8;
                Ref$IntRef ref$IntRef2 = (Ref$IntRef) this.L$7;
                Ref$BooleanRef ref$BooleanRef2 = (Ref$BooleanRef) this.L$6;
                ?? r12 = (List) this.L$5;
                b bVar4 = (b) this.L$4;
                z1e0 z1e0Var2 = (z1e0) this.L$2;
                kotlin.b.b(obj);
                z1e0 z1e0Var3 = z1e0Var2;
                b bVar5 = bVar4;
                ArrayList arrayList3 = r12;
                Ref$IntRef ref$IntRef3 = ref$IntRef2;
                Ref$BooleanRef ref$BooleanRef3 = ref$BooleanRef2;
                Kg = obj;
                ref$BooleanRef.element = ((Boolean) Kg).booleanValue();
                if (!ref$BooleanRef3.element) {
                    int i3 = ref$IntRef3.element;
                    ref$IntRef3.element = i3 + 1;
                    if (i3 < i) {
                        ref$BooleanRef = ref$BooleanRef3;
                        ref$IntRef = ref$IntRef3;
                        arrayList = arrayList3;
                        bVar2 = bVar5;
                        z1e0Var = z1e0Var3;
                        kotlinx.coroutines.a.k(get_context());
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = z1e0Var;
                        this.L$3 = null;
                        this.L$4 = bVar2;
                        this.L$5 = arrayList;
                        this.L$6 = ref$BooleanRef;
                        this.L$7 = ref$IntRef;
                        this.L$8 = ref$BooleanRef;
                        this.I$0 = i;
                        this.J$0 = currentTimeMillis;
                        this.label = 2;
                        Kg = b.Kg(bVar2, arrayList, this);
                        if (Kg != coroutineSingletons) {
                            z1e0Var3 = z1e0Var;
                            bVar5 = bVar2;
                            arrayList3 = arrayList;
                            ref$IntRef3 = ref$IntRef;
                            ref$BooleanRef3 = ref$BooleanRef;
                            ref$BooleanRef.element = ((Boolean) Kg).booleanValue();
                            if (!ref$BooleanRef3.element) {
                            }
                        }
                        return coroutineSingletons;
                    }
                }
                Pair pair = new Pair(Boolean.valueOf(ref$BooleanRef3.element), new Long(System.currentTimeMillis() - currentTimeMillis));
                Boolean bool = (Boolean) pair.getFirst();
                bool.booleanValue();
                long longValue = ((Number) pair.getSecond()).longValue();
                b bVar6 = this.this$0;
                ud80 ud80Var = bVar6.B;
                SearchState k = ((n) ud80Var.d).k(bVar6.x.b().a);
                if (k != null) {
                    ud80Var.f.getClass();
                    a3y0.h(new String[]{"onScreenRectFocusAdjustPolling"});
                    hst hstVar = jst.e;
                    u8w u8wVar = ud80Var.e;
                    String Hg = ud80Var.c.b.Hg();
                    String str = k.a;
                    String str2 = k.b;
                    String format = ud80Var.g.format(new Date());
                    Long valueOf = Long.valueOf(longValue);
                    u8wVar.getClass();
                    HashMap hashMap = new HashMap();
                    if (Hg != null) {
                        hashMap.put("user_phone_id", Hg);
                    }
                    if (str != null) {
                        hashMap.put("order_id", str);
                    }
                    if (str2 != null) {
                        hashMap.put("tariff_zone", str2);
                    }
                    if (format != null) {
                        hashMap.put(ClidProvider.TIMESTAMP, format);
                    }
                    hashMap.put("completed", bool);
                    hashMap.put("millis", valueOf);
                    u8wVar.a.a("SearchAnimation.ScreenRectAdjustPolling", hashMap, 1, new HashMap());
                }
                b bVar7 = this.this$0;
                bVar7.H = z1e0Var3;
                ((wd80) bVar7.Dg()).D0(z1e0Var3);
                return zy11Var;
            }
            it = (Iterator) this.L$5;
            collection = (Collection) this.L$3;
            bVar = (b) this.L$1;
            kotlin.b.b(obj);
            Object s = obj;
            DrivingRoute drivingRoute = (DrivingRoute) s;
            if (drivingRoute != null) {
                collection.add(drivingRoute);
            }
            if (it.hasNext()) {
                List list2 = (List) collection;
                if (list2.isEmpty()) {
                    return zy11Var;
                }
                b bVar8 = this.this$0;
                pzt0 pzt0Var = bVar8.G;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                bVar8.G = null;
                List list3 = list2;
                ArrayList arrayList4 = new ArrayList(tcc.n(list3, 10));
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(((DrivingRoute) it2.next()).getGeometry());
                }
                z1e0 z1e0Var4 = new z1e0(this.$carInfo, arrayList4);
                z1e0Var4.c = this.$shouldAnimateAppearing;
                ArrayList arrayList5 = new ArrayList(tcc.n(arrayList4, 10));
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    arrayList5.add(((Polyline) it3.next()).getPoints());
                }
                ArrayList o = tcc.o(arrayList5);
                b bVar9 = this.this$0;
                Ref$BooleanRef ref$BooleanRef4 = new Ref$BooleanRef();
                Ref$IntRef ref$IntRef4 = new Ref$IntRef();
                arrayList = o;
                i = 3;
                z1e0Var = z1e0Var4;
                bVar2 = bVar9;
                ref$BooleanRef = ref$BooleanRef4;
                currentTimeMillis = System.currentTimeMillis();
                ref$IntRef = ref$IntRef4;
                kotlinx.coroutines.a.k(get_context());
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = z1e0Var;
                this.L$3 = null;
                this.L$4 = bVar2;
                this.L$5 = arrayList;
                this.L$6 = ref$BooleanRef;
                this.L$7 = ref$IntRef;
                this.L$8 = ref$BooleanRef;
                this.I$0 = i;
                this.J$0 = currentTimeMillis;
                this.label = 2;
                Kg = b.Kg(bVar2, arrayList, this);
                if (Kg != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            List list4 = (List) it.next();
            this.L$0 = null;
            this.L$1 = bVar;
            this.L$2 = null;
            this.L$3 = collection;
            this.L$4 = null;
            this.L$5 = it;
            this.L$6 = null;
            this.L$7 = null;
            this.L$8 = null;
            this.label = 1;
            o oVar = (o) bVar.z;
            oVar.d();
            j18 j18Var = new j18(1, dvw.b(this));
            Ref$ObjectRef y = b64.y(j18Var);
            cx60 cx60Var = new cx60(1, y);
            cl7 cl7Var = new cl7(j18Var, cx60Var);
            oVar.g(list4, null, new fr30(new OrdinarySearchMVPPresenter$queryRoute$$inlined$suspendCallbackApi$2(1, cl7Var, cl7.class, "success", "success(Ljava/lang/Object;)V", 0), bVar, 1), null);
            y.element = new ii30(10, bVar);
            if (cl7Var.c()) {
                cx60Var.invoke();
            } else {
                j18Var.w(new dx60(cl7Var, 1));
            }
            s = j18Var.s();
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        }
    }
}
