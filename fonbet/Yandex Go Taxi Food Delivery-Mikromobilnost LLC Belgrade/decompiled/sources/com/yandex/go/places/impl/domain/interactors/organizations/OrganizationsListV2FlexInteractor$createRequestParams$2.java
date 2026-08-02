package com.yandex.go.places.impl.domain.interactors.organizations;

import com.yandex.go.places.experiments.map.j;
import com.yandex.go.places.impl.data.entities.network.organizations.OrganizationsStateRequestParam;
import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.request.FiltersAndSortingRequestDto;
import com.yandex.go.places.impl.data.entities.network.organizations.flex.OrganizationsListV2FlexRequestParams;
import com.yandex.go.places.impl.data.mappers.organizations.h;
import com.yandex.go.places.models.domain.entities.map.PlacesMapConfig$PlacesMapScreenName;
import defpackage.bn80;
import defpackage.f2t;
import defpackage.g2t;
import defpackage.m810;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.uc4;
import defpackage.wac0;
import defpackage.wls;
import defpackage.wnt;
import defpackage.xnt;
import defpackage.yac0;
import defpackage.zr00;
import defpackage.zy11;
import defpackage.zzs;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "", "", "", "<anonymous>", "(Ltse;)Ljava/util/Map;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.domain.interactors.organizations.OrganizationsListV2FlexInteractor$createRequestParams$2", f = "OrganizationsListV2FlexInteractor.kt", l = {37, 38, 39}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class OrganizationsListV2FlexInteractor$createRequestParams$2 extends SuspendLambda implements wls {
    final /* synthetic */ Long $containerWidthDp;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrganizationsListV2FlexInteractor$createRequestParams$2(b bVar, Long l, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$containerWidthDp = l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrganizationsListV2FlexInteractor$createRequestParams$2(this.this$0, this.$containerWidthDp, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrganizationsListV2FlexInteractor$createRequestParams$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0068, code lost:
    
        if (r5 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        bn80 bn80Var;
        Object y;
        Object A;
        bn80 bn80Var2;
        zzs zzsVar;
        Object c;
        zr00 zr00Var;
        Float f;
        Float f2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Integer num = null;
        if (i == 0) {
            kotlin.b.b(obj);
            bn80Var = (bn80) this.this$0.a.a.getValue();
            if (bn80Var == null) {
                return null;
            }
            mth mthVar = ((f2t) this.this$0.d).h;
            this.L$0 = bn80Var;
            this.label = 1;
            y = kotlinx.coroutines.flow.e.y(mthVar, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zr00Var = (zr00) this.L$2;
                    zzsVar = (zzs) this.L$1;
                    bn80 bn80Var3 = (bn80) this.L$0;
                    kotlin.b.b(obj);
                    bn80Var2 = bn80Var3;
                    c = obj;
                    zzs zzsVar2 = zzsVar;
                    wac0 a = ((yac0) c).a(PlacesMapConfig$PlacesMapScreenName.PLACES_ORGANIZATIONS_LIST_V2);
                    Double d = (a != null || (f2 = a.e) == null) ? null : new Double(f2.floatValue());
                    b bVar = this.this$0;
                    wnt wntVar = bVar.c;
                    String str = bn80Var2.a;
                    String str2 = bn80Var2.b;
                    String str3 = bn80Var2.c;
                    h hVar = bVar.h;
                    List a2 = bVar.g.a();
                    hVar.getClass();
                    FiltersAndSortingRequestDto a3 = h.a(a2);
                    uc4 uc4Var = zr00Var == null ? zr00Var.a : null;
                    if (zr00Var != null && (f = zr00Var.b) != null) {
                        num = new Integer(m810.b(f.floatValue()));
                    }
                    return ((xnt) wntVar).f(new OrganizationsListV2FlexRequestParams(str, str2, str3, new OrganizationsStateRequestParam(zzsVar2, a3, uc4Var, num, this.this$0.f.a().b(), this.this$0.e.a().a(), this.$containerWidthDp, d), 33), OrganizationsListV2FlexRequestParams.Companion.serializer());
                }
                zzsVar = (zzs) this.L$1;
                bn80 bn80Var4 = (bn80) this.L$0;
                kotlin.b.b(obj);
                bn80Var2 = bn80Var4;
                A = obj;
                zr00 zr00Var2 = (zr00) A;
                j jVar = this.this$0.j;
                this.L$0 = bn80Var2;
                this.L$1 = zzsVar;
                this.L$2 = zr00Var2;
                this.label = 3;
                c = jVar.c(this);
                if (c != coroutineSingletons) {
                    zr00Var = zr00Var2;
                    zzs zzsVar22 = zzsVar;
                    wac0 a4 = ((yac0) c).a(PlacesMapConfig$PlacesMapScreenName.PLACES_ORGANIZATIONS_LIST_V2);
                    if (a4 != null) {
                    }
                    b bVar2 = this.this$0;
                    wnt wntVar2 = bVar2.c;
                    String str4 = bn80Var2.a;
                    String str22 = bn80Var2.b;
                    String str32 = bn80Var2.c;
                    h hVar2 = bVar2.h;
                    List a22 = bVar2.g.a();
                    hVar2.getClass();
                    FiltersAndSortingRequestDto a32 = h.a(a22);
                    if (zr00Var == null) {
                    }
                    if (zr00Var != null) {
                        num = new Integer(m810.b(f.floatValue()));
                    }
                    return ((xnt) wntVar2).f(new OrganizationsListV2FlexRequestParams(str4, str22, str32, new OrganizationsStateRequestParam(zzsVar22, a32, uc4Var, num, this.this$0.f.a().b(), this.this$0.e.a().a(), this.$containerWidthDp, d), 33), OrganizationsListV2FlexRequestParams.Companion.serializer());
                }
                return coroutineSingletons;
            }
            bn80Var = (bn80) this.L$0;
            kotlin.b.b(obj);
            y = obj;
        }
        zzs zzsVar3 = ((g2t) y).b.a;
        r0 r0Var = this.this$0.i.b;
        this.L$0 = bn80Var;
        this.L$1 = zzsVar3;
        this.label = 2;
        A = kotlinx.coroutines.flow.e.A(r0Var, this);
        if (A != coroutineSingletons) {
            bn80Var2 = bn80Var;
            zzsVar = zzsVar3;
            zr00 zr00Var22 = (zr00) A;
            j jVar2 = this.this$0.j;
            this.L$0 = bn80Var2;
            this.L$1 = zzsVar;
            this.L$2 = zr00Var22;
            this.label = 3;
            c = jVar2.c(this);
            if (c != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}
