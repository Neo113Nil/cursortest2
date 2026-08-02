package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.interactor;

import com.yandex.go.taxi.summary.mobilityhub.analytics.TransitRoutesHubAnalytics$HubGeneration;
import com.yandex.go.taxi.summary.mobilityhub.analytics.TransitRoutesHubAnalytics$RouteSelectorErrorReasonV2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubAnalyticsPayload;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubFilterDtoV2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubFooterDtoV2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubOfferType;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubScreenResponseV2;
import defpackage.a2v;
import defpackage.btj0;
import defpackage.dxu;
import defpackage.fyu;
import defpackage.g0v;
import defpackage.hzu;
import defpackage.jl40;
import defpackage.jym;
import defpackage.khq0;
import defpackage.kz6;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o7r0;
import defpackage.pzu;
import defpackage.qrq0;
import defpackage.qu60;
import defpackage.rnb1;
import defpackage.tcc;
import defpackage.vpr;
import defpackage.w511;
import defpackage.xfh;
import defpackage.yzu;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.interactor.VerticalHubV2UiStateInteractor$mapLoadedState$$inlined$flatMapLatest$1", f = "VerticalHubV2UiStateInteractor.kt", l = {215, 189}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class VerticalHubV2UiStateInteractor$mapLoadedState$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ qu60 $state$inlined;
    final /* synthetic */ qrq0 $tariffs$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalHubV2UiStateInteractor$mapLoadedState$$inlined$flatMapLatest$1(Continuation continuation, q qVar, qu60 qu60Var, qrq0 qrq0Var) {
        super(3, continuation);
        this.this$0 = qVar;
        this.$state$inlined = qu60Var;
        this.$tariffs$inlined = qrq0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        VerticalHubV2UiStateInteractor$mapLoadedState$$inlined$flatMapLatest$1 verticalHubV2UiStateInteractor$mapLoadedState$$inlined$flatMapLatest$1 = new VerticalHubV2UiStateInteractor$mapLoadedState$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0, this.$state$inlined, this.$tariffs$inlined);
        verticalHubV2UiStateInteractor$mapLoadedState$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        verticalHubV2UiStateInteractor$mapLoadedState$$inlined$flatMapLatest$1.L$1 = obj2;
        return verticalHubV2UiStateInteractor$mapLoadedState$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x02c5, code lost:
    
        if (kotlinx.coroutines.flow.e.u(r0, r7, r39) == r8) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0228, code lost:
    
        if (r0 == com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubOfferType.TRANSPORT) goto L96;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0179  */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v25, types: [com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubOfferType] */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v5, types: [com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubLeadingItemKind, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r4v13, types: [kotlinx.coroutines.c, pzt0] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.util.concurrent.CancellationException, pzt0] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        q qVar;
        Object q;
        khq0 khq0Var;
        CharSequence charSequence;
        List list;
        Iterator it;
        CharSequence charSequence2;
        Collection collection;
        int i;
        boolean z;
        boolean z2;
        kz6 kz6Var;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        CharSequence charSequence3 = null;
        if (i2 == 0) {
            kotlin.b.b(obj);
            khq0 khq0Var2 = (khq0) obj2;
            qVar = this.this$0;
            com.yandex.go.taxi.summary.mobilityhub.mapper.e eVar = qVar.e;
            qu60 qu60Var = this.$state$inlined;
            HubScreenResponseV2 hubScreenResponseV2 = qu60Var.a;
            List list2 = hubScreenResponseV2.a;
            qrq0 qrq0Var = this.$tariffs$inlined;
            Map map = qu60Var.b;
            HubAnalyticsPayload hubAnalyticsPayload = hubScreenResponseV2.b;
            if (hubAnalyticsPayload == null) {
                hubAnalyticsPayload = new HubAnalyticsPayload(0);
            }
            String a = qVar.c.a();
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = vprVar;
            this.L$3 = null;
            this.L$4 = khq0Var2;
            this.L$5 = qVar;
            this.label = 1;
            q = eVar.q(list2, qrq0Var, map, hubAnalyticsPayload, a, this);
            if (q != coroutineSingletons) {
                khq0Var = khq0Var2;
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                kotlin.b.b(obj);
                return zy11.a;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        q qVar2 = (q) this.L$5;
        khq0Var = (khq0) this.L$4;
        vprVar = (vpr) this.L$2;
        kotlin.b.b(obj);
        qVar = qVar2;
        q = obj;
        List list3 = (List) q;
        qVar.getClass();
        if ((khq0Var != null ? khq0Var.c : null) == HubOfferType.PEDESTRIAN) {
            List list4 = khq0Var.g;
            btj0 btj0Var = khq0Var.f;
            List list5 = list4;
            if (list5 != null && !list5.isEmpty()) {
                List list6 = list3;
                ArrayList arrayList = new ArrayList(tcc.n(list6, 10));
                Iterator it2 = list6.iterator();
                while (it2.hasNext()) {
                    g0v g0vVar = (g0v) it2.next();
                    boolean z3 = g0vVar instanceof yzu;
                    g0v g0vVar2 = g0vVar;
                    if (z3) {
                        yzu yzuVar = (yzu) g0vVar;
                        pzu pzuVar = yzuVar.e;
                        g0vVar2 = yzuVar;
                        if (pzuVar instanceof hzu) {
                            g0vVar2 = yzuVar;
                            if (jl40.l(((hzu) pzuVar).a, khq0Var.a)) {
                                String str = yzuVar.a;
                                xfh xfhVar = yzuVar.b;
                                charSequence2 = charSequence3;
                                it = it2;
                                g0vVar2 = new yzu(str, new xfh(xfhVar.a, xfhVar.b, btj0Var != null ? btj0Var.c : charSequence2, btj0Var != null ? btj0Var.d : charSequence2, btj0Var != null ? btj0Var.e : charSequence2, xfhVar.f, xfhVar.g, xfhVar.h, xfhVar.i, xfhVar.j, xfhVar.k), btj0Var != null ? btj0Var.f : charSequence2, yzuVar.d, yzuVar.e, yzuVar.f, yzuVar.g, yzuVar.h, yzuVar.i, yzuVar.j, yzuVar.k, yzuVar.l, null, null);
                                arrayList.add(g0vVar2);
                                it2 = it;
                                charSequence3 = charSequence2;
                            }
                        }
                    }
                    it = it2;
                    charSequence2 = charSequence3;
                    arrayList.add(g0vVar2);
                    it2 = it;
                    charSequence3 = charSequence2;
                }
                charSequence = charSequence3;
                list = arrayList;
                HubFooterDtoV2 hubFooterDtoV2 = this.$state$inlined.a.c;
                collection = hubFooterDtoV2 == null ? hubFooterDtoV2.b : charSequence;
                if (list.isEmpty()) {
                    q qVar3 = this.this$0;
                    fyu fyuVar = qVar3.c;
                    o7r0 o7r0Var = qVar3.b;
                    String a2 = fyuVar.a();
                    HubAnalyticsPayload hubAnalyticsPayload2 = this.$state$inlined.a.b;
                    int i3 = hubAnalyticsPayload2 != null ? hubAnalyticsPayload2.a : 0;
                    a2v a2vVar = qVar3.v;
                    dxu dxuVar = qVar3.r;
                    jym jymVar = qVar3.q;
                    fyu fyuVar2 = qVar3.c;
                    Collection collection2 = collection;
                    if (collection2 == null || collection2.isEmpty()) {
                        o7r0Var.b(TransitRoutesHubAnalytics$RouteSelectorErrorReasonV2.MissingRoutes, TransitRoutesHubAnalytics$HubGeneration.Second, dxuVar.a.a(), rnb1.a(a2vVar), a2, kotlin.collections.a.J0(fyuVar2.b()), jymVar.a, Integer.valueOf(i3));
                    } else {
                        o7r0Var.b(TransitRoutesHubAnalytics$RouteSelectorErrorReasonV2.MissingRoutesByFilter, TransitRoutesHubAnalytics$HubGeneration.Second, dxuVar.a.a(), rnb1.a(a2vVar), a2, kotlin.collections.a.J0(fyuVar2.b()), jymVar.a, Integer.valueOf(i3));
                    }
                }
                HubOfferType hubOfferType = khq0Var == null ? khq0Var.c : charSequence;
                ?? r20 = (khq0Var != null || (kz6Var = khq0Var.h) == null) ? charSequence : kz6Var.d;
                i = r20 != 0 ? -1 : a.b[r20.ordinal()];
                if (i == -1) {
                    z = true;
                    if (i != 1) {
                        if (i != 2) {
                            w511.b();
                            return charSequence;
                        }
                        q qVar4 = this.this$0;
                        qVar4.n.a(new e(qVar4.o.k()));
                    }
                    ru.yandex.taxi.masstransit.paymentcards.d dVar = this.this$0.n;
                    ?? r4 = dVar.k;
                    ?? r5 = charSequence;
                    if (r4 != 0) {
                        r4.a(r5);
                    }
                    dVar.k = r5;
                } else {
                    z = true;
                }
                if (collection != 0) {
                    Iterable iterable = collection;
                    if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                        Iterator it3 = iterable.iterator();
                        while (it3.hasNext()) {
                            if (((HubFilterDtoV2) it3.next()).e) {
                                break;
                            }
                        }
                    }
                }
                if (this.this$0.c.b().isEmpty()) {
                    z2 = false;
                    kotlinx.coroutines.flow.internal.g X = kotlinx.coroutines.flow.e.X(this.this$0.h.a(this.$state$inlined.a.c, khq0Var != null ? khq0Var.h : null), new VerticalHubV2UiStateInteractor$mapLoadedState$lambda$2$$inlined$flatMapLatest$1(null, list, hubOfferType, this.this$0, r20, collection, z2, khq0Var));
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.label = 2;
                }
                z2 = z;
                kotlinx.coroutines.flow.internal.g X2 = kotlinx.coroutines.flow.e.X(this.this$0.h.a(this.$state$inlined.a.c, khq0Var != null ? khq0Var.h : null), new VerticalHubV2UiStateInteractor$mapLoadedState$lambda$2$$inlined$flatMapLatest$1(null, list, hubOfferType, this.this$0, r20, collection, z2, khq0Var));
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.label = 2;
            }
        }
        charSequence = null;
        list = list3;
        HubFooterDtoV2 hubFooterDtoV22 = this.$state$inlined.a.c;
        if (hubFooterDtoV22 == null) {
        }
        if (list.isEmpty()) {
        }
        if (khq0Var == null) {
        }
        if (khq0Var != null) {
        }
        if (r20 != 0) {
        }
        if (i == -1) {
        }
        if (collection != 0) {
        }
        if (this.this$0.c.b().isEmpty()) {
        }
        z2 = z;
        kotlinx.coroutines.flow.internal.g X22 = kotlinx.coroutines.flow.e.X(this.this$0.h.a(this.$state$inlined.a.c, khq0Var != null ? khq0Var.h : null), new VerticalHubV2UiStateInteractor$mapLoadedState$lambda$2$$inlined$flatMapLatest$1(null, list, hubOfferType, this.this$0, r20, collection, z2, khq0Var));
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.L$5 = null;
        this.label = 2;
    }
}
