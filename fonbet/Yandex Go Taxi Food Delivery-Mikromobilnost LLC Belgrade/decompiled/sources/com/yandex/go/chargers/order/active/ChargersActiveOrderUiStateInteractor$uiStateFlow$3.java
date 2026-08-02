package com.yandex.go.chargers.order.active;

import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersActiveOrderCardButtonNameV2;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersActiveOrderCardOpenReason;
import defpackage.bvf0;
import defpackage.e3n;
import defpackage.em9;
import defpackage.ems;
import defpackage.fca;
import defpackage.fl9;
import defpackage.gca;
import defpackage.gl9;
import defpackage.hca;
import defpackage.il9;
import defpackage.jl40;
import defpackage.kca;
import defpackage.kp50;
import defpackage.lca;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.o430;
import defpackage.qoh;
import defpackage.scc;
import defpackage.t7s;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.uda;
import defpackage.wls;
import defpackage.x8y;
import defpackage.xk9;
import defpackage.y8y;
import defpackage.ycc;
import defpackage.z8y;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.DurationUnit;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\n¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Lkotlin/Pair;", "Lz8y;", "", "<destruct>", "", "remainingMs", "Luda;", "selectedMode", "", "totalOrdersNumber", "Lgl9;", "<anonymous>", "(Lru/yandex/taxi/theme/ThemeType;Lkotlin/Pair;JLuda;I)Lgl9;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.order.active.ChargersActiveOrderUiStateInteractor$uiStateFlow$3", f = "ChargersActiveOrderUiStateInteractor.kt", l = {67}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersActiveOrderUiStateInteractor$uiStateFlow$3 extends SuspendLambda implements ems {
    final /* synthetic */ ChargersAnalytics$ChargersActiveOrderCardOpenReason $openReason;
    /* synthetic */ int I$0;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ il9 this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lgl9;", "<anonymous>", "(Ltse;)Lgl9;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.chargers.order.active.ChargersActiveOrderUiStateInteractor$uiStateFlow$3$1", f = "ChargersActiveOrderUiStateInteractor.kt", l = {99, 100, 103, 104}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.chargers.order.active.ChargersActiveOrderUiStateInteractor$uiStateFlow$3$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ ChargersAnalytics$ChargersActiveOrderCardOpenReason $openReason;
        final /* synthetic */ z8y $order;
        final /* synthetic */ Long $remainingMs;
        final /* synthetic */ uda $selectedMode;
        final /* synthetic */ int $totalOrdersNumber;
        final /* synthetic */ String $traceId;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        final /* synthetic */ il9 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(uda udaVar, il9 il9Var, z8y z8yVar, Long l, ChargersAnalytics$ChargersActiveOrderCardOpenReason chargersAnalytics$ChargersActiveOrderCardOpenReason, String str, int i, Continuation continuation) {
            super(2, continuation);
            this.$selectedMode = udaVar;
            this.this$0 = il9Var;
            this.$order = z8yVar;
            this.$remainingMs = l;
            this.$openReason = chargersAnalytics$ChargersActiveOrderCardOpenReason;
            this.$traceId = str;
            this.$totalOrdersNumber = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$selectedMode, this.this$0, this.$order, this.$remainingMs, this.$openReason, this.$traceId, this.$totalOrdersNumber, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:115:0x02c1, code lost:
        
            if (r3 == r2) goto L108;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x035d  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x035f  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0320  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0354  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x02ee  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0313  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x02f1  */
        /* JADX WARN: Type inference failed for: r3v14, types: [noh] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String str;
            String str2;
            Integer num;
            qoh h;
            noh h2;
            Object obj2;
            Object s;
            Object k;
            noh nohVar;
            xk9 xk9Var;
            Integer num2;
            List list;
            boolean z;
            Object k2;
            xk9 xk9Var2;
            int i;
            List list2;
            fl9 fl9Var;
            List list3;
            List list4;
            Object c;
            fl9 fl9Var2;
            List list5;
            tse tseVar = (tse) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                kotlin.b.b(obj);
                qoh h3 = tje.h(tseVar, null, null, new ChargersActiveOrderUiStateInteractor$uiStateFlow$3$1$headerAsync$1(this.this$0, this.$order, null), 3);
                uda udaVar = this.$selectedMode;
                if (udaVar == null || (str = udaVar.a) == null) {
                    lca lcaVar = this.this$0.f;
                    y8y y8yVar = this.$order.n;
                    lcaVar.getClass();
                    if (y8yVar != null) {
                        ArrayList arrayList = y8yVar.b;
                        if (!arrayList.isEmpty()) {
                            String str3 = y8yVar.a;
                            if (str3 == null) {
                                x8y x8yVar = (x8y) kotlin.collections.a.R(arrayList);
                                if (x8yVar != null) {
                                    str = x8yVar.a;
                                }
                            } else {
                                str = str3;
                            }
                        }
                    }
                    str = null;
                }
                lca lcaVar2 = this.this$0.f;
                ArrayList arrayList2 = this.$order.l;
                lcaVar2.getClass();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : arrayList2) {
                    kca kcaVar = (kca) obj3;
                    if (jl40.l(kcaVar.a(), str) || kcaVar.a() == null) {
                        arrayList3.add(obj3);
                    }
                }
                Long l = this.$remainingMs;
                if (l != null) {
                    Pattern pattern = t7s.a;
                    str2 = t7s.j(l.longValue());
                } else {
                    str2 = null;
                }
                Long l2 = this.$remainingMs;
                if (l2 != null) {
                    o430 o430Var = e3n.b;
                    num = new Integer((int) e3n.o(kp50.V(l2.longValue(), DurationUnit.MILLISECONDS), DurationUnit.SECONDS));
                } else {
                    num = null;
                }
                h = tje.h(tseVar, null, null, new ChargersActiveOrderUiStateInteractor$uiStateFlow$3$1$itemsAsync$1(this.this$0, arrayList3, str2, null), 3);
                h2 = tje.h(tseVar, null, null, new ChargersActiveOrderUiStateInteractor$uiStateFlow$3$1$tabsConfigAsync$1(this.this$0, this.$order, str, null), 3);
                il9 il9Var = this.this$0;
                if (il9Var.k) {
                    obj2 = null;
                } else {
                    il9Var.k = true;
                    em9 em9Var = il9Var.b;
                    z8y z8yVar = this.$order;
                    String str4 = z8yVar.a;
                    ChargersAnalytics$ChargersActiveOrderCardOpenReason chargersAnalytics$ChargersActiveOrderCardOpenReason = this.$openReason;
                    uda udaVar2 = this.$selectedMode;
                    String str5 = udaVar2 != null ? udaVar2.a : null;
                    ArrayList<kca> arrayList4 = z8yVar.l;
                    ArrayList arrayList5 = new ArrayList();
                    for (kca kcaVar2 : arrayList4) {
                        boolean z2 = kcaVar2 instanceof hca;
                        Iterable iterable = EmptyList.a;
                        if (z2) {
                            if (str5 == null || jl40.l(((hca) kcaVar2).b, str5)) {
                                iterable = ((hca) kcaVar2).a;
                            }
                            ArrayList arrayList6 = new ArrayList();
                            Iterator it = iterable.iterator();
                            while (it.hasNext()) {
                                ChargersAnalytics$ChargersActiveOrderCardButtonNameV2 a = il9.a(((gca) it.next()).d);
                                if (a != null) {
                                    arrayList6.add(a);
                                }
                            }
                            iterable = arrayList6;
                        } else if (kcaVar2 instanceof gca) {
                            if (str5 == null || jl40.l(((gca) kcaVar2).h, str5)) {
                                iterable = scc.h(il9.a(((gca) kcaVar2).d));
                            }
                        } else if (kcaVar2 instanceof fca) {
                            iterable = scc.h(il9.a(((fca) kcaVar2).d));
                        }
                        ycc.r(iterable, arrayList5);
                    }
                    ArrayList arrayList7 = new ArrayList(arrayList5);
                    arrayList7.add(ChargersAnalytics$ChargersActiveOrderCardButtonNameV2.Geo);
                    arrayList7.add(ChargersAnalytics$ChargersActiveOrderCardButtonNameV2.Back);
                    List J0 = kotlin.collections.a.J0(arrayList7);
                    String str6 = this.$traceId;
                    if (str6 == null) {
                        str6 = "";
                    }
                    em9Var.getClass();
                    HashMap hashMap = new HashMap();
                    hashMap.put("order_id", str4);
                    hashMap.put("open_reason", chargersAnalytics$ChargersActiveOrderCardOpenReason.getEventValue());
                    List list6 = J0;
                    ArrayList arrayList8 = new ArrayList(tcc.n(list6, 10));
                    Iterator it2 = list6.iterator();
                    while (it2.hasNext()) {
                        arrayList8.add(((ChargersAnalytics$ChargersActiveOrderCardButtonNameV2) it2.next()).getEventValue());
                    }
                    hashMap.put("button_names", arrayList8);
                    hashMap.put("trace_id", str6);
                    em9Var.a.a("Chargers.ActiveOrderCard.Shown", hashMap, 2, new HashMap());
                    obj2 = null;
                }
                this.L$0 = obj2;
                this.L$1 = obj2;
                this.L$2 = obj2;
                this.L$3 = obj2;
                this.L$4 = obj2;
                this.L$5 = num;
                this.L$6 = h;
                this.L$7 = h2;
                this.label = 1;
                s = h3.s(this);
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            } else {
                if (i2 != 1) {
                    if (i2 == 2) {
                        xk9Var = (xk9) this.L$8;
                        nohVar = (noh) this.L$7;
                        num2 = (Integer) this.L$5;
                        kotlin.b.b(obj);
                        k = obj;
                        list = (List) k;
                        z = true;
                        int i3 = this.$totalOrdersNumber <= 1 ? 1 : 0;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = num2;
                        this.L$6 = null;
                        this.L$7 = null;
                        this.L$8 = xk9Var;
                        this.L$9 = list;
                        this.I$0 = i3;
                        this.label = 3;
                        k2 = nohVar.k(this);
                        if (k2 != coroutineSingletons) {
                            int i4 = i3;
                            xk9Var2 = xk9Var;
                            i = i4;
                            fl9 fl9Var3 = (fl9) k2;
                            list2 = this.$order.r;
                            if (list2 != null) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    if (i2 != 3) {
                        if (i2 != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i = this.I$0;
                        fl9Var2 = (fl9) this.L$10;
                        list5 = (List) this.L$9;
                        xk9Var2 = (xk9) this.L$8;
                        Integer num3 = (Integer) this.L$5;
                        kotlin.b.b(obj);
                        c = obj;
                        num2 = num3;
                        z = true;
                        fl9Var = fl9Var2;
                        list4 = (List) c;
                        list3 = list5;
                        return new gl9(xk9Var2, list3, i != 0 ? z : false, num2, fl9Var, list4);
                    }
                    i = this.I$0;
                    List list7 = (List) this.L$9;
                    xk9 xk9Var3 = (xk9) this.L$8;
                    num2 = (Integer) this.L$5;
                    kotlin.b.b(obj);
                    list = list7;
                    xk9Var2 = xk9Var3;
                    z = true;
                    k2 = obj;
                    fl9 fl9Var32 = (fl9) k2;
                    list2 = this.$order.r;
                    if (list2 != null) {
                        fl9Var = fl9Var32;
                        list3 = list;
                        list4 = null;
                        return new gl9(xk9Var2, list3, i != 0 ? z : false, num2, fl9Var, list4);
                    }
                    f fVar = this.this$0.d;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = num2;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.L$8 = xk9Var2;
                    this.L$9 = list;
                    this.L$10 = fl9Var32;
                    this.L$11 = null;
                    this.I$0 = i;
                    this.label = 4;
                    c = fVar.c(list2, this);
                    if (c != coroutineSingletons) {
                        fl9Var2 = fl9Var32;
                        list5 = list;
                        fl9Var = fl9Var2;
                        list4 = (List) c;
                        list3 = list5;
                        return new gl9(xk9Var2, list3, i != 0 ? z : false, num2, fl9Var, list4);
                    }
                    return coroutineSingletons;
                }
                h2 = (noh) this.L$7;
                ?? r3 = (noh) this.L$6;
                Integer num4 = (Integer) this.L$5;
                kotlin.b.b(obj);
                h = r3;
                obj2 = null;
                num = num4;
                s = obj;
            }
            xk9 xk9Var4 = (xk9) s;
            this.L$0 = obj2;
            this.L$1 = obj2;
            this.L$2 = obj2;
            this.L$3 = obj2;
            this.L$4 = obj2;
            this.L$5 = num;
            this.L$6 = obj2;
            this.L$7 = h2;
            this.L$8 = xk9Var4;
            this.label = 2;
            k = h.k(this);
            if (k != coroutineSingletons) {
                nohVar = h2;
                xk9Var = xk9Var4;
                num2 = num;
                list = (List) k;
                z = true;
                if (this.$totalOrdersNumber <= 1) {
                }
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = num2;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = xk9Var;
                this.L$9 = list;
                this.I$0 = i3;
                this.label = 3;
                k2 = nohVar.k(this);
                if (k2 != coroutineSingletons) {
                }
            }
            return coroutineSingletons;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersActiveOrderUiStateInteractor$uiStateFlow$3(il9 il9Var, ChargersAnalytics$ChargersActiveOrderCardOpenReason chargersAnalytics$ChargersActiveOrderCardOpenReason, Continuation continuation) {
        super(6, continuation);
        this.this$0 = il9Var;
        this.$openReason = chargersAnalytics$ChargersActiveOrderCardOpenReason;
    }

    @Override // defpackage.ems
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int intValue = ((Number) obj5).intValue();
        ChargersActiveOrderUiStateInteractor$uiStateFlow$3 chargersActiveOrderUiStateInteractor$uiStateFlow$3 = new ChargersActiveOrderUiStateInteractor$uiStateFlow$3(this.this$0, this.$openReason, (Continuation) obj6);
        chargersActiveOrderUiStateInteractor$uiStateFlow$3.L$0 = (Pair) obj2;
        chargersActiveOrderUiStateInteractor$uiStateFlow$3.L$1 = (Long) obj3;
        chargersActiveOrderUiStateInteractor$uiStateFlow$3.L$2 = (uda) obj4;
        chargersActiveOrderUiStateInteractor$uiStateFlow$3.I$0 = intValue;
        return chargersActiveOrderUiStateInteractor$uiStateFlow$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Pair pair = (Pair) this.L$0;
        Long l = (Long) this.L$1;
        uda udaVar = (uda) this.L$2;
        int i = this.I$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 != 0) {
            if (i2 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return obj;
        }
        kotlin.b.b(obj);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(udaVar, this.this$0, (z8y) pair.getFirst(), l, this.$openReason, (String) pair.getSecond(), i, null);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.I$0 = i;
        this.label = 1;
        Object n = bvf0.n(anonymousClass1, this);
        return n == coroutineSingletons ? coroutineSingletons : n;
    }
}
