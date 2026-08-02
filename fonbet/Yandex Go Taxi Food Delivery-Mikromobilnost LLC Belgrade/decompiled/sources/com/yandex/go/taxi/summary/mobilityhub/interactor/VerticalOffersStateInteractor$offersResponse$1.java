package com.yandex.go.taxi.summary.mobilityhub.interactor;

import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.taxi.summary.mobilityhub.model.OffersErrorReason;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubFilterDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubFooterDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.MobilityHubScreenResponse;
import com.yandex.go.zone.model.Zone;
import defpackage.a201;
import defpackage.c611;
import defpackage.d0l0;
import defpackage.dbl0;
import defpackage.h2v;
import defpackage.jl40;
import defpackage.jst;
import defpackage.lu60;
import defpackage.mu60;
import defpackage.mvg;
import defpackage.nu60;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.ybl0;
import defpackage.zt60;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lou60;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.interactor.VerticalOffersStateInteractor$offersResponse$1", f = "VerticalOffersStateInteractor.kt", l = {HProv.PP_SAME_MEDIA, HProv.PP_CONTAINER_EXTENSION, 143, 154}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class VerticalOffersStateInteractor$offersResponse$1 extends SuspendLambda implements wls {
    final /* synthetic */ zt60 $data;
    final /* synthetic */ MobilityHubScreenResponse $lastResponse;
    final /* synthetic */ List<c611> $mtRoutes;
    final /* synthetic */ d0l0 $route;
    final /* synthetic */ dbl0 $routeStatsInfo;
    long J$0;
    long J$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ z this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalOffersStateInteractor$offersResponse$1(MobilityHubScreenResponse mobilityHubScreenResponse, z zVar, List list, zt60 zt60Var, d0l0 d0l0Var, dbl0 dbl0Var, Continuation continuation) {
        super(2, continuation);
        this.$lastResponse = mobilityHubScreenResponse;
        this.this$0 = zVar;
        this.$mtRoutes = list;
        this.$data = zt60Var;
        this.$route = d0l0Var;
        this.$routeStatsInfo = dbl0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        VerticalOffersStateInteractor$offersResponse$1 verticalOffersStateInteractor$offersResponse$1 = new VerticalOffersStateInteractor$offersResponse$1(this.$lastResponse, this.this$0, this.$mtRoutes, this.$data, this.$route, this.$routeStatsInfo, continuation);
        verticalOffersStateInteractor$offersResponse$1.L$0 = obj;
        return verticalOffersStateInteractor$offersResponse$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((VerticalOffersStateInteractor$offersResponse$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:(1:2)|(1:(1:(1:(1:(3:8|9|10)(2:12|13))(9:14|15|16|(5:20|(3:23|(3:25|26|(5:28|(1:30)(1:36)|31|32|33))(1:37)|21)|38|39|40)|41|(0)(0)|31|32|33))(12:42|43|44|45|(2:47|(2:49|35))|16|(6:18|20|(1:21)|38|39|40)|41|(0)(0)|31|32|33))(1:50))(3:98|(1:100)(1:103)|101)|51|52|53|(3:92|93|(15:95|(1:57)|58|(2:59|(2:61|(1:64)(1:63))(2:90|91))|65|(1:89)|69|70|(2:72|(1:74))|79|80|81|82|(10:84|45|(0)|16|(0)|41|(0)(0)|31|32|33)|35))|55|(0)|58|(3:59|(0)(0)|63)|65|(1:67)|89|69|70|(0)|79|80|81|82|(0)|35) */
    /* JADX WARN: Can't wrap try/catch for region: R(22:2|(1:(1:(1:(1:(3:8|9|10)(2:12|13))(9:14|15|16|(5:20|(3:23|(3:25|26|(5:28|(1:30)(1:36)|31|32|33))(1:37)|21)|38|39|40)|41|(0)(0)|31|32|33))(12:42|43|44|45|(2:47|(2:49|35))|16|(6:18|20|(1:21)|38|39|40)|41|(0)(0)|31|32|33))(1:50))(3:98|(1:100)(1:103)|101)|51|52|53|(3:92|93|(15:95|(1:57)|58|(2:59|(2:61|(1:64)(1:63))(2:90|91))|65|(1:89)|69|70|(2:72|(1:74))|79|80|81|82|(10:84|45|(0)|16|(0)|41|(0)(0)|31|32|33)|35))|55|(0)|58|(3:59|(0)(0)|63)|65|(1:67)|89|69|70|(0)|79|80|81|82|(0)|35) */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0080, code lost:
    
        if (r9.emit(r0, r21) == r10) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x01b0, code lost:
    
        if (r9.emit(r4, r21) == r10) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0186, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0187, code lost:
    
        r1 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0189, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x018a, code lost:
    
        r12 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x014b A[Catch: all -> 0x0046, CancellationException -> 0x01b6, TryCatch #2 {all -> 0x0046, blocks: (B:15:0x0041, B:16:0x0147, B:18:0x014b, B:20:0x014f, B:21:0x0155, B:23:0x015b, B:26:0x0166, B:28:0x016a, B:31:0x017a, B:39:0x016d, B:40:0x0174, B:43:0x005b, B:45:0x011d, B:47:0x012b), top: B:2:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x015b A[Catch: all -> 0x0046, CancellationException -> 0x01b6, TryCatch #2 {all -> 0x0046, blocks: (B:15:0x0041, B:16:0x0147, B:18:0x014b, B:20:0x014f, B:21:0x0155, B:23:0x015b, B:26:0x0166, B:28:0x016a, B:31:0x017a, B:39:0x016d, B:40:0x0174, B:43:0x005b, B:45:0x011d, B:47:0x012b), top: B:2:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012b A[Catch: all -> 0x0046, CancellationException -> 0x01b6, TryCatch #2 {all -> 0x0046, blocks: (B:15:0x0041, B:16:0x0147, B:18:0x014b, B:20:0x014f, B:21:0x0155, B:23:0x015b, B:26:0x0166, B:28:0x016a, B:31:0x017a, B:39:0x016d, B:40:0x0174, B:43:0x005b, B:45:0x011d, B:47:0x012b), top: B:2:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bb A[Catch: all -> 0x00a3, CancellationException -> 0x01b6, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00a3, blocks: (B:93:0x009c, B:95:0x00a0, B:61:0x00bb, B:67:0x00db, B:72:0x00e7), top: B:92:0x009c }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e7 A[Catch: all -> 0x00a3, CancellationException -> 0x01b6, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00a3, blocks: (B:93:0x009c, B:95:0x00a0, B:61:0x00bb, B:67:0x00db, B:72:0x00e7), top: B:92:0x009c }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object nu60Var;
        long j;
        Zone zone;
        String str;
        Iterator it;
        Object obj2;
        ybl0 ybl0Var;
        h2v h2vVar;
        Object t;
        List list;
        long j2;
        z zVar;
        MobilityHubScreenResponse mobilityHubScreenResponse;
        long j3;
        long j4;
        HubFooterDto hubFooterDto;
        String str2;
        List list2;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        String str3 = "";
        ?? r1 = 2;
        try {
            try {
            } catch (Throwable th) {
                th = th;
            }
            if (i == 0) {
                kotlin.b.b(obj);
                MobilityHubScreenResponse mobilityHubScreenResponse2 = this.$lastResponse;
                mu60 mu60Var = new mu60(mobilityHubScreenResponse2 != null ? mobilityHubScreenResponse2.d : null);
                this.L$0 = vprVar;
                this.label = 1;
            } else if (i == 1) {
                kotlin.b.b(obj);
            } else if (i == 2) {
                long j5 = this.J$0;
                List list3 = (List) this.L$2;
                z zVar2 = (z) this.L$1;
                kotlin.b.b(obj);
                zVar = zVar2;
                list = list3;
                t = obj;
                j2 = j5;
                mobilityHubScreenResponse = (MobilityHubScreenResponse) t;
                long currentTimeMillis = System.currentTimeMillis();
                j3 = currentTimeMillis - j2;
                j4 = j2;
                if (j3 <= 1000) {
                    this.L$0 = vprVar;
                    this.L$1 = zVar;
                    this.L$2 = list;
                    this.L$3 = null;
                    this.L$4 = mobilityHubScreenResponse;
                    this.L$5 = null;
                    this.J$0 = j2;
                    this.J$1 = currentTimeMillis;
                    this.label = 3;
                    j4 = j2;
                    if (kotlinx.coroutines.a.i(j3, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                hubFooterDto = mobilityHubScreenResponse.d;
                if (hubFooterDto != null) {
                    while (r5.hasNext()) {
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                str2 = null;
                if (str2 == null) {
                }
                zVar.d.a(str3, true);
                nu60Var = new lu60(mobilityHubScreenResponse, list);
                j = j4;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.J$0 = j;
                this.label = 4;
            } else {
                if (i != 3) {
                    if (i != 4) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                long j6 = this.J$0;
                mobilityHubScreenResponse = (MobilityHubScreenResponse) this.L$4;
                list = (List) this.L$2;
                zVar = (z) this.L$1;
                kotlin.b.b(obj);
                j4 = j6;
                hubFooterDto = mobilityHubScreenResponse.d;
                if (hubFooterDto != null && (list2 = hubFooterDto.b) != null) {
                    for (Object obj3 : list2) {
                        if (((HubFilterDto) obj3).f) {
                            HubFilterDto hubFilterDto = (HubFilterDto) obj3;
                            if (hubFilterDto != null) {
                                str2 = hubFilterDto.a;
                                if (str2 == null) {
                                    str3 = str2;
                                }
                                zVar.d.a(str3, true);
                                nu60Var = new lu60(mobilityHubScreenResponse, list);
                                j = j4;
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.L$4 = null;
                                this.L$5 = null;
                                this.J$0 = j;
                                this.label = 4;
                            }
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                str2 = null;
                if (str2 == null) {
                }
                zVar.d.a(str3, true);
                nu60Var = new lu60(mobilityHubScreenResponse, list);
                j = j4;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.J$0 = j;
                this.label = 4;
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            z zVar3 = this.this$0;
            List<c611> list4 = this.$mtRoutes;
            zt60 zt60Var = this.$data;
            d0l0 d0l0Var = this.$route;
            dbl0 dbl0Var = this.$routeStatsInfo;
            List a = z.a(zVar3, list4, zt60Var.d);
            ZoneAddress zoneAddress = d0l0Var.a;
            if (zoneAddress != null) {
                try {
                    zone = zoneAddress.b;
                } catch (Throwable th2) {
                    th = th2;
                    r1 = currentTimeMillis2;
                    jst.e.k(th, "Mobility hub loading error");
                    nu60Var = new nu60(OffersErrorReason.HubLoadingError);
                    j = r1;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.J$0 = j;
                    this.label = 4;
                }
                if (zone != null) {
                    str = zone.a;
                    if (str == null) {
                        str = "";
                    }
                    it = dbl0Var.a.k.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (jl40.l(((ybl0) obj2).a, zVar3.a)) {
                            break;
                        }
                    }
                    ybl0Var = (ybl0) obj2;
                    a201 a201Var = zVar3.j;
                    if (ybl0Var != null || (r1 = ybl0Var.f) == null) {
                        List list5 = EmptyList.a;
                    }
                    h2vVar = zt60Var.d;
                    boolean z = false;
                    if (h2vVar != null) {
                        if (h2vVar.a.e) {
                            z = true;
                        }
                    }
                    List list6 = zt60Var.g;
                    this.L$0 = vprVar;
                    this.L$1 = zVar3;
                    this.L$2 = a;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.J$0 = currentTimeMillis2;
                    this.label = 2;
                    String str4 = str;
                    long j7 = currentTimeMillis2;
                    t = a201Var.t(d0l0Var, a, dbl0Var, list5, str4, z, list6, this);
                    if (t != coroutineSingletons) {
                        list = a;
                        j2 = j7;
                        zVar = zVar3;
                        mobilityHubScreenResponse = (MobilityHubScreenResponse) t;
                        long currentTimeMillis3 = System.currentTimeMillis();
                        j3 = currentTimeMillis3 - j2;
                        j4 = j2;
                        if (j3 <= 1000) {
                        }
                        hubFooterDto = mobilityHubScreenResponse.d;
                        if (hubFooterDto != null) {
                        }
                        str2 = null;
                        if (str2 == null) {
                        }
                        zVar.d.a(str3, true);
                        nu60Var = new lu60(mobilityHubScreenResponse, list);
                        j = j4;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.J$0 = j;
                        this.label = 4;
                    }
                    return coroutineSingletons;
                }
            }
            str = null;
            if (str == null) {
            }
            it = dbl0Var.a.k.iterator();
            while (true) {
                if (it.hasNext()) {
                }
            }
            ybl0Var = (ybl0) obj2;
            a201 a201Var2 = zVar3.j;
            if (ybl0Var != null) {
            }
            List list52 = EmptyList.a;
            h2vVar = zt60Var.d;
            boolean z2 = false;
            if (h2vVar != null) {
            }
            List list62 = zt60Var.g;
            this.L$0 = vprVar;
            this.L$1 = zVar3;
            this.L$2 = a;
            this.L$3 = null;
            this.L$4 = null;
            this.J$0 = currentTimeMillis2;
            this.label = 2;
            String str42 = str;
            long j72 = currentTimeMillis2;
            t = a201Var2.t(d0l0Var, a, dbl0Var, list52, str42, z2, list62, this);
            if (t != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
