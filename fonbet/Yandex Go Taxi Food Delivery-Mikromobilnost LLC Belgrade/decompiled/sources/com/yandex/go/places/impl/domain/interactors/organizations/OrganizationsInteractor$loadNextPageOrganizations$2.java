package com.yandex.go.places.impl.domain.interactors.organizations;

import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.request.FiltersAndSortingRequestDto;
import com.yandex.go.places.impl.data.mappers.organizations.h;
import com.yandex.go.places.impl.ui.organizations.data.PageRequestState;
import defpackage.cp80;
import defpackage.gp80;
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
import defpackage.tse;
import defpackage.uc4;
import defpackage.v95;
import defpackage.w511;
import defpackage.wls;
import defpackage.wm80;
import defpackage.xm80;
import defpackage.ym80;
import defpackage.zy11;
import defpackage.zzs;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lip80;", "<anonymous>", "(Ltse;)Lip80;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.domain.interactors.organizations.OrganizationsInteractor$loadNextPageOrganizations$2", f = "OrganizationsDiscoveryInteractor.kt", l = {99, HProv.PP_RESERVED1, HProv.PP_CACHE_SIZE}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class OrganizationsInteractor$loadNextPageOrganizations$2 extends SuspendLambda implements wls {
    final /* synthetic */ uc4 $bbox;
    final /* synthetic */ List<v95> $currentFiltersAndSorting;
    final /* synthetic */ ym80 $currentOrganizationsInfo;
    final /* synthetic */ String $listContext;
    final /* synthetic */ int $page;
    final /* synthetic */ String $queryParams;
    final /* synthetic */ String $suggestReqId;
    final /* synthetic */ Float $zoom;
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrganizationsInteractor$loadNextPageOrganizations$2(a aVar, int i, String str, String str2, ym80 ym80Var, String str3, List list, uc4 uc4Var, Float f, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$page = i;
        this.$queryParams = str;
        this.$suggestReqId = str2;
        this.$currentOrganizationsInfo = ym80Var;
        this.$listContext = str3;
        this.$currentFiltersAndSorting = list;
        this.$bbox = uc4Var;
        this.$zoom = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrganizationsInteractor$loadNextPageOrganizations$2(this.this$0, this.$page, this.$queryParams, this.$suggestReqId, this.$currentOrganizationsInfo, this.$listContext, this.$currentFiltersAndSorting, this.$bbox, this.$zoom, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrganizationsInteractor$loadNextPageOrganizations$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c8, code lost:
    
        if (r0 == r13) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009f, code lost:
    
        if (r0 == r13) goto L23;
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
        Object b;
        a aVar2;
        Object n;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            a aVar3 = this.this$0;
            aVar = aVar3.a;
            i = this.$page;
            String str2 = this.$queryParams;
            this.L$0 = aVar;
            this.L$1 = str2;
            this.I$0 = i;
            this.label = 1;
            a = a.a(aVar3, this);
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
                a aVar4 = (a) this.L$1;
                kotlin.b.b(obj);
                aVar2 = aVar4;
                n = obj;
                ym80 ym80Var = (ym80) n;
                ym80 ym80Var2 = this.$currentOrganizationsInfo;
                aVar2.getClass();
                if (!(ym80Var instanceof wm80)) {
                    if (ym80Var instanceof xm80) {
                        return new cp80(ym80Var2);
                    }
                    if (ym80Var == null) {
                        return new gp80(ym80Var2, PageRequestState.ERROR);
                    }
                    w511.b();
                    return null;
                }
                wm80 wm80Var = (wm80) ym80Var;
                if (ym80Var2 instanceof wm80) {
                    wm80Var = new wm80(wm80Var.a, wm80Var.b, wm80Var.c, kotlin.collections.a.m0(wm80Var.d, ((wm80) ym80Var2).d), wm80Var.e);
                } else if (!(ym80Var2 instanceof xm80)) {
                    w511.b();
                    return null;
                }
                return new cp80(wm80Var);
            }
            kotlin.b.b(obj);
            b = obj;
            nk80 nk80Var = (nk80) b;
            if (!(nk80Var instanceof kk80)) {
                if ((nk80Var instanceof lk80) || (nk80Var instanceof mk80)) {
                    return new gp80(this.$currentOrganizationsInfo, PageRequestState.ERROR);
                }
                w511.b();
                return null;
            }
            com.yandex.go.places.impl.data.repositories.organizations.b bVar = this.this$0.f;
            l65 l65Var = (l65) ((kk80) nk80Var).a;
            bVar.c(l65Var.getF());
            aVar2 = this.this$0;
            h0w h0wVar = aVar2.c;
            this.L$0 = null;
            this.L$1 = aVar2;
            this.label = 3;
            n = h0wVar.n(l65Var, this);
        }
        int i4 = i;
        String str3 = this.$suggestReqId;
        String b2 = this.$currentOrganizationsInfo.b();
        String str4 = this.$listContext;
        h hVar = this.this$0.e;
        List<v95> list = this.$currentFiltersAndSorting;
        hVar.getClass();
        FiltersAndSortingRequestDto a2 = h.a(list);
        uc4 uc4Var = this.$bbox;
        Float f = this.$zoom;
        lg80 a3 = this.this$0.g.a();
        svj a4 = this.this$0.h.a();
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        b = com.yandex.go.places.impl.data.repositories.organizations.a.b(aVar, i4, str, (zzs) a, str3, b2, str4, a2, uc4Var, f, a3, a4, this);
    }
}
