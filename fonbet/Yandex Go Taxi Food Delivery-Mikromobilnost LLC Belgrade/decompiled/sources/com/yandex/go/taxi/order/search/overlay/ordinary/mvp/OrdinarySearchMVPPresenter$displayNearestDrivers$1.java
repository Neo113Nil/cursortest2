package com.yandex.go.taxi.order.search.overlay.ordinary.mvp;

import com.yandex.go.taxi.order.domain.repositories.n;
import com.yandex.go.taxi.order.state.search.SearchState;
import defpackage.a3y0;
import defpackage.cwa1;
import defpackage.hst;
import defpackage.jst;
import defpackage.m58;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tse;
import defpackage.u8w;
import defpackage.ud80;
import defpackage.wd80;
import defpackage.wls;
import defpackage.ym11;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
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
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.search.overlay.ordinary.mvp.OrdinarySearchMVPPresenter$displayNearestDrivers$1", f = "OrdinarySearchMVPPresenter.kt", l = {358}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrdinarySearchMVPPresenter$displayNearestDrivers$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<m58> $cars;
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrdinarySearchMVPPresenter$displayNearestDrivers$1(b bVar, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$cars = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrdinarySearchMVPPresenter$displayNearestDrivers$1(this.this$0, this.$cars, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrdinarySearchMVPPresenter$displayNearestDrivers$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00f4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00e4 -> B:5:0x00e8). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List list;
        int i;
        b bVar;
        Ref$BooleanRef ref$BooleanRef;
        long currentTimeMillis;
        Ref$IntRef ref$IntRef;
        Object Kg;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        zy11 zy11Var = zy11.a;
        if (i2 == 0) {
            kotlin.b.b(obj);
            ArrayList arrayList = this.this$0.E;
            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((m58) it.next()).c);
            }
            List b = ym11.b(arrayList2);
            if (b.isEmpty()) {
                return zy11Var;
            }
            List i3 = this.this$0.x.b().V().i();
            ArrayList arrayList3 = new ArrayList(tcc.n(i3, 10));
            Iterator it2 = i3.iterator();
            while (it2.hasNext()) {
                arrayList3.add(cwa1.d((zzs) it2.next()));
            }
            b.addAll(arrayList3);
            b bVar2 = this.this$0;
            if (bVar2.H == null) {
                Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                Ref$IntRef ref$IntRef2 = new Ref$IntRef();
                list = b;
                i = 3;
                bVar = bVar2;
                ref$BooleanRef = ref$BooleanRef2;
                currentTimeMillis = System.currentTimeMillis();
                ref$IntRef = ref$IntRef2;
                kotlinx.coroutines.a.k(get_context());
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = bVar;
                this.L$3 = list;
                this.L$4 = ref$BooleanRef;
                this.L$5 = ref$IntRef;
                this.L$6 = ref$BooleanRef;
                this.I$0 = i;
                this.J$0 = currentTimeMillis;
                this.label = 1;
                Kg = b.Kg(bVar, list, this);
                if (Kg != coroutineSingletons) {
                }
            }
            ((wd80) this.this$0.Dg()).E0(this.$cars);
            return zy11Var;
        }
        if (i2 != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        currentTimeMillis = this.J$0;
        i = this.I$0;
        ref$BooleanRef = (Ref$BooleanRef) this.L$6;
        Ref$IntRef ref$IntRef3 = (Ref$IntRef) this.L$5;
        Ref$BooleanRef ref$BooleanRef3 = (Ref$BooleanRef) this.L$4;
        List list2 = (List) this.L$3;
        b bVar3 = (b) this.L$2;
        kotlin.b.b(obj);
        b bVar4 = bVar3;
        List list3 = list2;
        Ref$IntRef ref$IntRef4 = ref$IntRef3;
        Ref$BooleanRef ref$BooleanRef4 = ref$BooleanRef3;
        Kg = obj;
        ref$BooleanRef.element = ((Boolean) Kg).booleanValue();
        if (!ref$BooleanRef4.element) {
            int i4 = ref$IntRef4.element;
            ref$IntRef4.element = i4 + 1;
            if (i4 < i) {
                ref$BooleanRef = ref$BooleanRef4;
                ref$IntRef = ref$IntRef4;
                list = list3;
                bVar = bVar4;
                kotlinx.coroutines.a.k(get_context());
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = bVar;
                this.L$3 = list;
                this.L$4 = ref$BooleanRef;
                this.L$5 = ref$IntRef;
                this.L$6 = ref$BooleanRef;
                this.I$0 = i;
                this.J$0 = currentTimeMillis;
                this.label = 1;
                Kg = b.Kg(bVar, list, this);
                if (Kg != coroutineSingletons) {
                    return coroutineSingletons;
                }
                bVar4 = bVar;
                list3 = list;
                ref$IntRef4 = ref$IntRef;
                ref$BooleanRef4 = ref$BooleanRef;
                ref$BooleanRef.element = ((Boolean) Kg).booleanValue();
                if (!ref$BooleanRef4.element) {
                }
            }
        }
        Pair pair = new Pair(Boolean.valueOf(ref$BooleanRef4.element), new Long(System.currentTimeMillis() - currentTimeMillis));
        Boolean bool = (Boolean) pair.getFirst();
        bool.booleanValue();
        long longValue = ((Number) pair.getSecond()).longValue();
        b bVar5 = this.this$0;
        ud80 ud80Var = bVar5.B;
        SearchState k = ((n) ud80Var.d).k(bVar5.x.b().a);
        if (k != null) {
            ud80Var.f.getClass();
            a3y0.h(new String[]{"onScreenRectFocusAdjustNearestDrivers"});
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
            u8wVar.a.a("SearchAnimation.ScreenRectAdjustNearestDrivers", hashMap, 1, new HashMap());
        }
        ((wd80) this.this$0.Dg()).E0(this.$cars);
        return zy11Var;
    }
}
