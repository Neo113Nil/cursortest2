package com.yandex.go.places.impl.domain.interactors.organizations;

import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.request.FiltersAndSortingRequestDto;
import com.yandex.go.places.impl.data.mappers.organizations.h;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;
import defpackage.cp80;
import defpackage.ep80;
import defpackage.h0w;
import defpackage.kk80;
import defpackage.l65;
import defpackage.lg80;
import defpackage.lk80;
import defpackage.mk80;
import defpackage.mvg;
import defpackage.nk80;
import defpackage.ny61;
import defpackage.svj;
import defpackage.tls;
import defpackage.tse;
import defpackage.uc4;
import defpackage.v95;
import defpackage.w511;
import defpackage.wls;
import defpackage.ym80;
import defpackage.zy11;
import defpackage.zzs;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lip80;", "<anonymous>", "(Ltse;)Lip80;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.domain.interactors.organizations.OrganizationsInteractor$loadStartPageOrganizations$2", f = "OrganizationsDiscoveryInteractor.kt", l = {54, SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE, CalendarDayView.DISABLED_DAY_ALPHA}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class OrganizationsInteractor$loadStartPageOrganizations$2 extends SuspendLambda implements wls {
    final /* synthetic */ uc4 $bbox;
    final /* synthetic */ String $context;
    final /* synthetic */ List<v95> $currentFiltersAndSorting;
    final /* synthetic */ tls $onBboxReceived;
    final /* synthetic */ String $queryParams;
    final /* synthetic */ String $suggestReqId;
    final /* synthetic */ Float $zoom;
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrganizationsInteractor$loadStartPageOrganizations$2(a aVar, String str, String str2, String str3, List list, uc4 uc4Var, Float f, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$queryParams = str;
        this.$suggestReqId = str2;
        this.$context = str3;
        this.$currentFiltersAndSorting = list;
        this.$bbox = uc4Var;
        this.$zoom = f;
        this.$onBboxReceived = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrganizationsInteractor$loadStartPageOrganizations$2(this.this$0, this.$queryParams, this.$suggestReqId, this.$context, this.$currentFiltersAndSorting, this.$bbox, this.$zoom, this.$onBboxReceived, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrganizationsInteractor$loadStartPageOrganizations$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c9, code lost:
    
        if (r0 == r14) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a2, code lost:
    
        if (r0 == r14) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        com.yandex.go.places.impl.data.repositories.organizations.a aVar;
        int i;
        Object a;
        String str;
        Object obj2;
        Object a2;
        Object n;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            a aVar2 = this.this$0;
            aVar = aVar2.a;
            String str2 = this.$queryParams;
            this.L$0 = aVar;
            this.L$1 = str2;
            i = 0;
            this.I$0 = 0;
            this.label = 1;
            a = a.a(aVar2, this);
            if (a != coroutineSingletons) {
                str = str2;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            int i3 = this.I$0;
            str = (String) this.L$1;
            aVar = (com.yandex.go.places.impl.data.repositories.organizations.a) this.L$0;
            kotlin.b.b(obj);
            i = i3;
            a = obj;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                n = obj;
                ym80 ym80Var = (ym80) n;
                if (ym80Var != null) {
                    return new cp80(ym80Var);
                }
                return ep80.a;
            }
            kotlin.b.b(obj);
            a2 = obj;
            obj2 = null;
            nk80 nk80Var = (nk80) a2;
            if (!(nk80Var instanceof kk80)) {
                if (!(nk80Var instanceof lk80) && !(nk80Var instanceof mk80)) {
                    w511.b();
                    return obj2;
                }
                return ep80.a;
            }
            com.yandex.go.places.impl.data.repositories.organizations.b bVar = this.this$0.f;
            l65 l65Var = (l65) ((kk80) nk80Var).a;
            bVar.c(l65Var.getF());
            h0w h0wVar = this.this$0.c;
            this.L$0 = obj2;
            this.label = 3;
            n = h0wVar.n(l65Var, this);
        }
        zzs zzsVar = (zzs) a;
        com.yandex.go.places.impl.data.repositories.organizations.a aVar3 = aVar;
        String str3 = this.$suggestReqId;
        int i4 = i;
        String str4 = this.$context;
        h hVar = this.this$0.e;
        List<v95> list = this.$currentFiltersAndSorting;
        hVar.getClass();
        FiltersAndSortingRequestDto a3 = h.a(list);
        uc4 uc4Var = this.$bbox;
        Float f = this.$zoom;
        lg80 a4 = this.this$0.g.a();
        svj a5 = this.this$0.h.a();
        OrganizationsInteractor$loadStartPageOrganizations$2$responseState$1 organizationsInteractor$loadStartPageOrganizations$2$responseState$1 = new OrganizationsInteractor$loadStartPageOrganizations$2$responseState$1(this.this$0, this.$onBboxReceived, null);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        obj2 = null;
        a2 = aVar3.a(i4, str, zzsVar, str3, null, str4, a3, uc4Var, f, a4, a5, organizationsInteractor$loadStartPageOrganizations$2$responseState$1, this);
    }
}
