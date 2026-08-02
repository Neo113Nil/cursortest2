package com.yandex.go.taxi.order.search.overlay.ordinary.mvp;

import com.yandex.go.taxi.order.domain.repositories.n;
import com.yandex.go.taxi.order.state.search.SearchState;
import defpackage.a3y0;
import defpackage.gci0;
import defpackage.hst;
import defpackage.i350;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.u8w;
import defpackage.ud80;
import defpackage.wls;
import defpackage.zy11;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.search.overlay.ordinary.mvp.OrdinarySearchMVPPresenter$onResume$1", f = "OrdinarySearchMVPPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrdinarySearchMVPPresenter$onResume$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.taxi.order.search.overlay.ordinary.mvp.OrdinarySearchMVPPresenter$onResume$1$1", f = "OrdinarySearchMVPPresenter.kt", l = {67}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.order.search.overlay.ordinary.mvp.OrdinarySearchMVPPresenter$onResume$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(b bVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                b bVar = this.this$0;
                gci0 gci0Var = bVar.A.i;
                i350 i350Var = new i350(27, bVar);
                this.label = 1;
                if (gci0Var.a.collect(i350Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            ny61.A();
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.taxi.order.search.overlay.ordinary.mvp.OrdinarySearchMVPPresenter$onResume$1$2", f = "OrdinarySearchMVPPresenter.kt", l = {HProv.ALG_SID_GR3410_12_256}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.order.search.overlay.ordinary.mvp.OrdinarySearchMVPPresenter$onResume$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(b bVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SearchState k;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                b bVar = this.this$0;
                this.label = 1;
                obj = b.Lg(bVar, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            List list = (List) obj;
            this.this$0.E.addAll(list);
            b bVar2 = this.this$0;
            ud80 ud80Var = bVar2.B;
            String str = bVar2.x.b().a;
            int size = bVar2.E.size();
            ud80Var.f.getClass();
            a3y0.h(new String[]{"onCarsCountDrawn"});
            hst hstVar = jst.e;
            LinkedHashMap linkedHashMap = ud80Var.k;
            Integer num = (Integer) linkedHashMap.get(str);
            if ((num == null || num.intValue() != size) && (k = ((n) ud80Var.d).k(str)) != null) {
                linkedHashMap.put(str, Integer.valueOf(size));
                u8w u8wVar = ud80Var.e;
                Integer valueOf = Integer.valueOf(size);
                String str2 = k.a;
                String str3 = k.b;
                String format = ud80Var.g.format(new Date());
                String Hg = ud80Var.c.b.Hg();
                u8wVar.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("count", valueOf);
                if (str2 != null) {
                    hashMap.put("order_id", str2);
                }
                if (str3 != null) {
                    hashMap.put("tariff_zone", str3);
                }
                if (format != null) {
                    hashMap.put(ClidProvider.TIMESTAMP, format);
                }
                if (Hg != null) {
                    hashMap.put("user_phone_id", Hg);
                }
                u8wVar.a.a("SearchAnimation.CarsCntDrawn", hashMap, 1, new HashMap());
            }
            bVar2.G = tje.N(bVar2.Jg(), null, null, new OrdinarySearchMVPPresenter$displayNearestDrivers$1(bVar2, list, null), 3);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrdinarySearchMVPPresenter$onResume$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OrdinarySearchMVPPresenter$onResume$1 ordinarySearchMVPPresenter$onResume$1 = new OrdinarySearchMVPPresenter$onResume$1(this.this$0, continuation);
        ordinarySearchMVPPresenter$onResume$1.L$0 = obj;
        return ordinarySearchMVPPresenter$onResume$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        OrdinarySearchMVPPresenter$onResume$1 ordinarySearchMVPPresenter$onResume$1 = (OrdinarySearchMVPPresenter$onResume$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        ordinarySearchMVPPresenter$onResume$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        tje.N(tseVar, null, null, new AnonymousClass1(this.this$0, null), 3);
        tje.N(tseVar, null, null, new AnonymousClass2(this.this$0, null), 3);
        return zy11.a;
    }
}
