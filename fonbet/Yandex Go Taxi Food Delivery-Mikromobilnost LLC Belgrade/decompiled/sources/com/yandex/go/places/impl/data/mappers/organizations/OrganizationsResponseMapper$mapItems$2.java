package com.yandex.go.places.impl.data.mappers.organizations;

import com.yandex.go.places.impl.data.entities.network.organizations.OrganizationItemDto$OrganizationBannerItemDto;
import com.yandex.go.places.impl.data.entities.network.organizations.OrganizationItemDto$OrganizationPreviewItemDto;
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
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "Lnoh;", "", "", "<anonymous>", "(Ltse;)Lnoh;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.data.mappers.organizations.OrganizationsResponseMapper$mapItems$2", f = "OrganizationsResponseMapper.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class OrganizationsResponseMapper$mapItems$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<com.yandex.go.places.impl.data.entities.network.organizations.f> $dtoItems;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ f this$0;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.places.impl.data.mappers.organizations.OrganizationsResponseMapper$mapItems$2$1", f = "OrganizationsResponseMapper.kt", l = {HProv.ALG_SID_SHA3_224}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.places.impl.data.mappers.organizations.OrganizationsResponseMapper$mapItems$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ List<com.yandex.go.places.impl.data.entities.network.organizations.f> $dtoItems;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ f this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List list, f fVar, Continuation continuation) {
            super(2, continuation);
            this.$dtoItems = list;
            this.this$0 = fVar;
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

        /* JADX WARN: Removed duplicated region for block: B:16:0x005a A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x002e A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            qoh h;
            tse tseVar = (tse) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return obj;
            }
            kotlin.b.b(obj);
            List<com.yandex.go.places.impl.data.entities.network.organizations.f> list = this.$dtoItems;
            f fVar = this.this$0;
            ArrayList arrayList = new ArrayList();
            for (com.yandex.go.places.impl.data.entities.network.organizations.f fVar2 : list) {
                if (!(fVar2 instanceof OrganizationItemDto$OrganizationBannerItemDto)) {
                    if (fVar2 instanceof OrganizationItemDto$OrganizationPreviewItemDto) {
                        h = tje.h(tseVar, null, null, new OrganizationsResponseMapper$mapItems$2$1$result$1$1(fVar, fVar2, null), 3);
                        if (h == null) {
                            arrayList.add(h);
                        }
                    } else if (!jl40.l(fVar2, com.yandex.go.places.impl.data.entities.network.organizations.e.INSTANCE)) {
                        w511.b();
                        return null;
                    }
                }
                h = null;
                if (h == null) {
                }
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            Object b = kotlinx.coroutines.a.b(arrayList, this);
            return b == coroutineSingletons ? coroutineSingletons : b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrganizationsResponseMapper$mapItems$2(List list, f fVar, Continuation continuation) {
        super(2, continuation);
        this.$dtoItems = list;
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OrganizationsResponseMapper$mapItems$2 organizationsResponseMapper$mapItems$2 = new OrganizationsResponseMapper$mapItems$2(this.$dtoItems, this.this$0, continuation);
        organizationsResponseMapper$mapItems$2.L$0 = obj;
        return organizationsResponseMapper$mapItems$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrganizationsResponseMapper$mapItems$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
