package com.yandex.go.taxi.summary.mobilityhub.interactor;

import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.taxi.summary.mobilityhub.model.OffersErrorReason;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubFooterDtoV2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubScreenResponseV2;
import com.yandex.go.zone.model.Zone;
import defpackage.au60;
import defpackage.bvf0;
import defpackage.d0l0;
import defpackage.dbl0;
import defpackage.h2v;
import defpackage.jl40;
import defpackage.jst;
import defpackage.kcz0;
import defpackage.khq0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.qu60;
import defpackage.ru60;
import defpackage.su60;
import defpackage.vpr;
import defpackage.wiq0;
import defpackage.wls;
import defpackage.x1v;
import defpackage.ybl0;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Ltu60;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.interactor.VerticalOffersStateInteractorV2$offersResponse$1", f = "VerticalOffersStateInteractorV2.kt", l = {164, 178, 191, 192, 195, 205}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class VerticalOffersStateInteractorV2$offersResponse$1 extends SuspendLambda implements wls {
    final /* synthetic */ au60 $data;
    final /* synthetic */ HubScreenResponseV2 $lastResponse;
    final /* synthetic */ d0l0 $route;
    final /* synthetic */ dbl0 $routeStatsInfo;
    final /* synthetic */ khq0 $selectedOfferData;
    long J$0;
    long J$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ i0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalOffersStateInteractorV2$offersResponse$1(HubScreenResponseV2 hubScreenResponseV2, khq0 khq0Var, d0l0 d0l0Var, dbl0 dbl0Var, i0 i0Var, au60 au60Var, Continuation continuation) {
        super(2, continuation);
        this.$lastResponse = hubScreenResponseV2;
        this.$selectedOfferData = khq0Var;
        this.$route = d0l0Var;
        this.$routeStatsInfo = dbl0Var;
        this.this$0 = i0Var;
        this.$data = au60Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        VerticalOffersStateInteractorV2$offersResponse$1 verticalOffersStateInteractorV2$offersResponse$1 = new VerticalOffersStateInteractorV2$offersResponse$1(this.$lastResponse, this.$selectedOfferData, this.$route, this.$routeStatsInfo, this.this$0, this.$data, continuation);
        verticalOffersStateInteractorV2$offersResponse$1.L$0 = obj;
        return verticalOffersStateInteractorV2$offersResponse$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((VerticalOffersStateInteractorV2$offersResponse$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(34:49|50|(5:51|52|(1:123)(1:56)|(1:58)|59)|(31:62|63|(1:65)|66|67|68|69|(1:71)(1:112)|72|73|(1:111)|77|78|79|(2:81|82)(1:110)|84|85|(1:87)(1:109)|88|89|90|91|92|93|94|95|96|97|(6:99|45|46|(1:48)|38|(1:40)(8:41|30|(2:32|(1:34))|13|(1:15)(1:26)|(1:17)|18|19))|21|60)|120|121|66|67|68|69|(0)(0)|72|73|(1:75)|111|77|78|79|(0)(0)|84|85|(0)(0)|88|89|90|91|92|93|94|95|96|97|(0)|21) */
    /* JADX WARN: Can't wrap try/catch for region: R(38:49|50|51|52|(1:123)(1:56)|(1:58)|59|(31:62|63|(1:65)|66|67|68|69|(1:71)(1:112)|72|73|(1:111)|77|78|79|(2:81|82)(1:110)|84|85|(1:87)(1:109)|88|89|90|91|92|93|94|95|96|97|(6:99|45|46|(1:48)|38|(1:40)(8:41|30|(2:32|(1:34))|13|(1:15)(1:26)|(1:17)|18|19))|21|60)|120|121|66|67|68|69|(0)(0)|72|73|(1:75)|111|77|78|79|(0)(0)|84|85|(0)(0)|88|89|90|91|92|93|94|95|96|97|(0)|21) */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0219, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x021a, code lost:
    
        r3 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0222, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0223, code lost:
    
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0227, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0228, code lost:
    
        r16 = r3;
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x021d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x00ca, code lost:
    
        if (r13.emit(r0, r21) == r14) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0254, code lost:
    
        if (r13.emit(r2, r21) == r14) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0145, code lost:
    
        if (r0.a.e == true) goto L74;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0208 A[Catch: all -> 0x0202, CancellationException -> 0x025a, TryCatch #2 {all -> 0x0202, blocks: (B:13:0x0204, B:15:0x0208, B:18:0x0210, B:30:0x01da, B:32:0x01e6, B:38:0x01b8, B:46:0x0195), top: B:45:0x0195 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01e6 A[Catch: all -> 0x0202, CancellationException -> 0x025a, TryCatch #2 {all -> 0x0202, blocks: (B:13:0x0204, B:15:0x0208, B:18:0x0210, B:30:0x01da, B:32:0x01e6, B:38:0x01b8, B:46:0x0195), top: B:45:0x0195 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0124 A[Catch: all -> 0x0111, CancellationException -> 0x025a, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0111, blocks: (B:63:0x00fc, B:71:0x0124, B:75:0x012e, B:81:0x013e, B:87:0x0154), top: B:62:0x00fc }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x013e A[Catch: all -> 0x0111, CancellationException -> 0x025a, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0111, blocks: (B:63:0x00fc, B:71:0x0124, B:75:0x012e, B:81:0x013e, B:87:0x0154), top: B:62:0x00fc }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0154 A[Catch: all -> 0x0111, CancellationException -> 0x025a, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0111, blocks: (B:63:0x00fc, B:71:0x0124, B:75:0x012e, B:81:0x013e, B:87:0x0154), top: B:62:0x00fc }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0191  */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ?? r15;
        long j;
        Object su60Var;
        String str;
        Iterator it;
        Object obj2;
        ybl0 ybl0Var;
        long j2;
        h2v h2vVar;
        String str2;
        boolean z;
        EmptyList emptyList;
        Object w;
        i0 i0Var;
        Zone zone;
        HubScreenResponseV2 hubScreenResponseV2;
        Object n;
        Map map;
        List list;
        i0 i0Var2;
        HubScreenResponseV2 hubScreenResponseV22;
        Map map2;
        long j3;
        EmptyList emptyList2;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        EmptyList emptyList3 = EmptyList.a;
        try {
            try {
            } catch (Throwable th) {
                th = th;
                r15 = null;
            }
            switch (i) {
                case 0:
                    kotlin.b.b(obj);
                    HubScreenResponseV2 hubScreenResponseV23 = this.$lastResponse;
                    HubFooterDtoV2 hubFooterDtoV2 = hubScreenResponseV23 != null ? hubScreenResponseV23.c : null;
                    khq0 khq0Var = this.$selectedOfferData;
                    ru60 ru60Var = new ru60(hubFooterDtoV2, khq0Var != null ? khq0Var.c : null);
                    this.L$0 = vprVar;
                    this.label = 1;
                    break;
                case 1:
                    kotlin.b.b(obj);
                    j = System.currentTimeMillis();
                    d0l0 d0l0Var = this.$route;
                    dbl0 dbl0Var = this.$routeStatsInfo;
                    i0 i0Var3 = this.this$0;
                    au60 au60Var = this.$data;
                    khq0 khq0Var2 = this.$selectedOfferData;
                    try {
                        ZoneAddress zoneAddress = d0l0Var.a;
                        str = (zoneAddress == null || (zone = zoneAddress.b) == null) ? null : zone.a;
                        if (str == null) {
                            str = "";
                        }
                        it = dbl0Var.a.k.iterator();
                    } catch (Throwable th2) {
                        th = th2;
                        r15 = r2;
                        break;
                    }
                    while (it.hasNext()) {
                        try {
                            obj2 = it.next();
                            r2 = jl40.l(((ybl0) obj2).a, i0Var3.a) ? null : null;
                            ybl0Var = (ybl0) obj2;
                            wiq0 wiq0Var = i0Var3.p;
                            x1v x1vVar = i0Var3.q;
                            pex0 m = ((com.yandex.go.taxi.tariffs.internal.repository.k) wiq0Var).m();
                            String str3 = m == null ? m.b : null;
                            kcz0 kcz0Var = i0Var3.h;
                            if (ybl0Var != null || (r11 = ybl0Var.f) == null) {
                                List list2 = emptyList3;
                            }
                            h2vVar = au60Var.c;
                            if (h2vVar == null) {
                                str2 = str3;
                                z = true;
                                break;
                            } else {
                                str2 = str3;
                            }
                            z = false;
                            List list3 = au60Var.e;
                            Set set = au60Var.f;
                            String str4 = khq0Var2 == null ? khq0Var2.a : null;
                            boolean z2 = z;
                            String a = x1vVar.a();
                            String str5 = x1vVar.c;
                            this.L$0 = vprVar;
                            this.L$1 = i0Var3;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.L$4 = null;
                            this.J$0 = j;
                            this.label = 2;
                            j2 = j;
                            emptyList = emptyList3;
                            r15 = null;
                            w = kcz0Var.w(d0l0Var, dbl0Var, list2, str, z2, list3, set, str4, str2, a, str5, this);
                        } catch (Throwable th3) {
                            th = th3;
                            r15 = null;
                            jst.e.k(th, "Mobility hub loading error");
                            su60Var = new su60(OffersErrorReason.HubLoadingError);
                            this.L$0 = r15;
                            this.L$1 = r15;
                            this.L$2 = r15;
                            this.L$3 = r15;
                            this.L$4 = r15;
                            this.L$5 = r15;
                            this.L$6 = r15;
                            this.J$0 = j;
                            this.label = 6;
                            break;
                        }
                        if (w != coroutineSingletons) {
                            j = j2;
                            i0Var = i0Var3;
                            try {
                                hubScreenResponseV2 = (HubScreenResponseV2) w;
                                this.L$0 = vprVar;
                                this.L$1 = i0Var;
                                this.L$2 = r15;
                                this.L$3 = r15;
                                this.L$4 = r15;
                                this.L$5 = hubScreenResponseV2;
                                this.J$0 = j;
                                this.label = 3;
                                i0Var.getClass();
                                n = bvf0.n(new VerticalOffersStateInteractorV2$resolveAllRouteUris$2(hubScreenResponseV2, i0Var, r15), this);
                                if (n == coroutineSingletons) {
                                }
                                map = (Map) n;
                                list = hubScreenResponseV2.a;
                                this.L$0 = vprVar;
                                this.L$1 = i0Var;
                                this.L$2 = r15;
                                this.L$3 = r15;
                                this.L$4 = r15;
                                this.L$5 = hubScreenResponseV2;
                                this.L$6 = map;
                                this.J$0 = j;
                                this.label = 4;
                            } catch (Throwable th4) {
                                th = th4;
                                jst.e.k(th, "Mobility hub loading error");
                                su60Var = new su60(OffersErrorReason.HubLoadingError);
                                this.L$0 = r15;
                                this.L$1 = r15;
                                this.L$2 = r15;
                                this.L$3 = r15;
                                this.L$4 = r15;
                                this.L$5 = r15;
                                this.L$6 = r15;
                                this.J$0 = j;
                                this.label = 6;
                            }
                            if (i0.c(i0Var, list, map, this) != coroutineSingletons) {
                                i0Var2 = i0Var;
                                hubScreenResponseV22 = hubScreenResponseV2;
                                map2 = map;
                                long currentTimeMillis = System.currentTimeMillis();
                                j3 = currentTimeMillis - j;
                                if (j3 <= 1000) {
                                    this.L$0 = vprVar;
                                    this.L$1 = i0Var2;
                                    this.L$2 = r15;
                                    this.L$3 = r15;
                                    this.L$4 = r15;
                                    this.L$5 = hubScreenResponseV22;
                                    this.L$6 = map2;
                                    this.J$0 = j;
                                    this.J$1 = currentTimeMillis;
                                    this.label = 5;
                                    if (kotlinx.coroutines.a.i(j3, this) == coroutineSingletons) {
                                    }
                                }
                                HubFooterDtoV2 hubFooterDtoV22 = hubScreenResponseV22.c;
                                emptyList2 = hubFooterDtoV22 != null ? hubFooterDtoV22.b : r15;
                                if (emptyList2 == null) {
                                    emptyList2 = emptyList;
                                }
                                i0.b(i0Var2, emptyList2);
                                su60Var = new qu60(hubScreenResponseV22, map2);
                                this.L$0 = r15;
                                this.L$1 = r15;
                                this.L$2 = r15;
                                this.L$3 = r15;
                                this.L$4 = r15;
                                this.L$5 = r15;
                                this.L$6 = r15;
                                this.J$0 = j;
                                this.label = 6;
                            }
                        }
                        return coroutineSingletons;
                        break;
                    }
                    obj2 = null;
                    ybl0Var = (ybl0) obj2;
                    wiq0 wiq0Var2 = i0Var3.p;
                    x1v x1vVar2 = i0Var3.q;
                    pex0 m2 = ((com.yandex.go.taxi.tariffs.internal.repository.k) wiq0Var2).m();
                    if (m2 == null) {
                    }
                    kcz0 kcz0Var2 = i0Var3.h;
                    if (ybl0Var != null) {
                    }
                    List list22 = emptyList3;
                    h2vVar = au60Var.c;
                    if (h2vVar == null) {
                    }
                    z = false;
                    List list32 = au60Var.e;
                    Set set2 = au60Var.f;
                    if (khq0Var2 == null) {
                    }
                    boolean z22 = z;
                    String a2 = x1vVar2.a();
                    String str52 = x1vVar2.c;
                    this.L$0 = vprVar;
                    this.L$1 = i0Var3;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.J$0 = j;
                    this.label = 2;
                    j2 = j;
                    emptyList = emptyList3;
                    r15 = null;
                    w = kcz0Var2.w(d0l0Var, dbl0Var, list22, str, z22, list32, set2, str4, str2, a2, str52, this);
                    if (w != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                case 2:
                    j = this.J$0;
                    i0 i0Var4 = (i0) this.L$1;
                    kotlin.b.b(obj);
                    i0Var = i0Var4;
                    emptyList = emptyList3;
                    w = obj;
                    r15 = null;
                    hubScreenResponseV2 = (HubScreenResponseV2) w;
                    this.L$0 = vprVar;
                    this.L$1 = i0Var;
                    this.L$2 = r15;
                    this.L$3 = r15;
                    this.L$4 = r15;
                    this.L$5 = hubScreenResponseV2;
                    this.J$0 = j;
                    this.label = 3;
                    i0Var.getClass();
                    n = bvf0.n(new VerticalOffersStateInteractorV2$resolveAllRouteUris$2(hubScreenResponseV2, i0Var, r15), this);
                    if (n == coroutineSingletons) {
                    }
                    map = (Map) n;
                    list = hubScreenResponseV2.a;
                    this.L$0 = vprVar;
                    this.L$1 = i0Var;
                    this.L$2 = r15;
                    this.L$3 = r15;
                    this.L$4 = r15;
                    this.L$5 = hubScreenResponseV2;
                    this.L$6 = map;
                    this.J$0 = j;
                    this.label = 4;
                    if (i0.c(i0Var, list, map, this) != coroutineSingletons) {
                    }
                    break;
                case 3:
                    j = this.J$0;
                    hubScreenResponseV2 = (HubScreenResponseV2) this.L$5;
                    i0Var = (i0) this.L$1;
                    kotlin.b.b(obj);
                    emptyList = emptyList3;
                    r15 = null;
                    n = obj;
                    map = (Map) n;
                    list = hubScreenResponseV2.a;
                    this.L$0 = vprVar;
                    this.L$1 = i0Var;
                    this.L$2 = r15;
                    this.L$3 = r15;
                    this.L$4 = r15;
                    this.L$5 = hubScreenResponseV2;
                    this.L$6 = map;
                    this.J$0 = j;
                    this.label = 4;
                    if (i0.c(i0Var, list, map, this) != coroutineSingletons) {
                    }
                    break;
                case 4:
                    j = this.J$0;
                    map2 = (Map) this.L$6;
                    hubScreenResponseV22 = (HubScreenResponseV2) this.L$5;
                    i0Var2 = (i0) this.L$1;
                    kotlin.b.b(obj);
                    emptyList = emptyList3;
                    r15 = null;
                    long currentTimeMillis2 = System.currentTimeMillis();
                    j3 = currentTimeMillis2 - j;
                    if (j3 <= 1000) {
                    }
                    HubFooterDtoV2 hubFooterDtoV222 = hubScreenResponseV22.c;
                    if (hubFooterDtoV222 != null) {
                    }
                    if (emptyList2 == null) {
                    }
                    i0.b(i0Var2, emptyList2);
                    su60Var = new qu60(hubScreenResponseV22, map2);
                    this.L$0 = r15;
                    this.L$1 = r15;
                    this.L$2 = r15;
                    this.L$3 = r15;
                    this.L$4 = r15;
                    this.L$5 = r15;
                    this.L$6 = r15;
                    this.J$0 = j;
                    this.label = 6;
                    break;
                case 5:
                    j = this.J$0;
                    map2 = (Map) this.L$6;
                    hubScreenResponseV22 = (HubScreenResponseV2) this.L$5;
                    i0Var2 = (i0) this.L$1;
                    kotlin.b.b(obj);
                    emptyList = emptyList3;
                    r15 = null;
                    HubFooterDtoV2 hubFooterDtoV2222 = hubScreenResponseV22.c;
                    if (hubFooterDtoV2222 != null) {
                    }
                    if (emptyList2 == null) {
                    }
                    i0.b(i0Var2, emptyList2);
                    su60Var = new qu60(hubScreenResponseV22, map2);
                    this.L$0 = r15;
                    this.L$1 = r15;
                    this.L$2 = r15;
                    this.L$3 = r15;
                    this.L$4 = r15;
                    this.L$5 = r15;
                    this.L$6 = r15;
                    this.J$0 = j;
                    this.label = 6;
                    break;
                case 6:
                    kotlin.b.b(obj);
                    return zy11.a;
                default:
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        } catch (CancellationException e) {
            throw e;
        }
    }
}
