package com.yandex.go.places.impl.data.mappers.organizations;

import com.yandex.go.places.impl.data.entities.network.organizations.OrganizationItemV2Dto$OrganizationPreviewItemV2Dto;
import com.yandex.go.places.impl.data.entities.network.organizations.i;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "Lnoh;", "", "", "<anonymous>", "(Ltse;)Lnoh;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.data.mappers.organizations.OrganizationsResponseV2Mapper$mapItems$2", f = "OrganizationsResponseV2Mapper.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class OrganizationsResponseV2Mapper$mapItems$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<i> $dtoItems;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ g this$0;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.places.impl.data.mappers.organizations.OrganizationsResponseV2Mapper$mapItems$2$1", f = "OrganizationsResponseV2Mapper.kt", l = {71}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.places.impl.data.mappers.organizations.OrganizationsResponseV2Mapper$mapItems$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ List<i> $dtoItems;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ g this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List list, g gVar, Continuation continuation) {
            super(2, continuation);
            this.$dtoItems = list;
            this.this$0 = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$dtoItems, this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            qoh qohVar;
            tse tseVar = (tse) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                List<i> list = this.$dtoItems;
                g gVar = this.this$0;
                ArrayList arrayList = new ArrayList();
                for (i iVar : list) {
                    if (iVar instanceof OrganizationItemV2Dto$OrganizationPreviewItemV2Dto) {
                        qohVar = tje.h(tseVar, null, null, new OrganizationsResponseV2Mapper$mapItems$2$1$result$1$1(gVar, iVar, null), 3);
                    } else {
                        if (!jl40.l(iVar, com.yandex.go.places.impl.data.entities.network.organizations.h.INSTANCE)) {
                            w511.b();
                            return null;
                        }
                        qohVar = null;
                    }
                    if (qohVar != null) {
                        arrayList.add(qohVar);
                    }
                }
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                obj = kotlinx.coroutines.a.b(arrayList, this);
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
            return kotlin.collections.a.M((Iterable) obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrganizationsResponseV2Mapper$mapItems$2(List list, g gVar, Continuation continuation) {
        super(2, continuation);
        this.$dtoItems = list;
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OrganizationsResponseV2Mapper$mapItems$2 organizationsResponseV2Mapper$mapItems$2 = new OrganizationsResponseV2Mapper$mapItems$2(this.$dtoItems, this.this$0, continuation);
        organizationsResponseV2Mapper$mapItems$2.L$0 = obj;
        return organizationsResponseV2Mapper$mapItems$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrganizationsResponseV2Mapper$mapItems$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return tje.h(tseVar, null, null, new AnonymousClass1(this.$dtoItems, this.this$0, null), 3);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
