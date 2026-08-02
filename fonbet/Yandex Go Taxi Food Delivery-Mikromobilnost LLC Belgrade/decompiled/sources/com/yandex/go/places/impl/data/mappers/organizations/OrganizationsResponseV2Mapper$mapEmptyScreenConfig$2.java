package com.yandex.go.places.impl.data.mappers.organizations;

import com.yandex.go.places.impl.data.entities.network.organizations.OrganizationsEmptyScreenConfigDto;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lnoh;", "Lfm80;", "<anonymous>", "(Ltse;)Lnoh;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.data.mappers.organizations.OrganizationsResponseV2Mapper$mapEmptyScreenConfig$2", f = "OrganizationsResponseV2Mapper.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class OrganizationsResponseV2Mapper$mapEmptyScreenConfig$2 extends SuspendLambda implements wls {
    final /* synthetic */ OrganizationsEmptyScreenConfigDto $configDto;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ g this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lfm80;", "<anonymous>", "(Ltse;)Lfm80;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.places.impl.data.mappers.organizations.OrganizationsResponseV2Mapper$mapEmptyScreenConfig$2$1", f = "OrganizationsResponseV2Mapper.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.places.impl.data.mappers.organizations.OrganizationsResponseV2Mapper$mapEmptyScreenConfig$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ OrganizationsEmptyScreenConfigDto $configDto;
        int label;
        final /* synthetic */ g this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(g gVar, OrganizationsEmptyScreenConfigDto organizationsEmptyScreenConfigDto, Continuation continuation) {
            super(2, continuation);
            this.this$0 = gVar;
            this.$configDto = organizationsEmptyScreenConfigDto;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$configDto, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    kotlin.b.b(obj);
                    return obj;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            a aVar = this.this$0.a;
            OrganizationsEmptyScreenConfigDto organizationsEmptyScreenConfigDto = this.$configDto;
            this.label = 1;
            Object a = aVar.a(organizationsEmptyScreenConfigDto, this);
            return a == coroutineSingletons ? coroutineSingletons : a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrganizationsResponseV2Mapper$mapEmptyScreenConfig$2(g gVar, OrganizationsEmptyScreenConfigDto organizationsEmptyScreenConfigDto, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$configDto = organizationsEmptyScreenConfigDto;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OrganizationsResponseV2Mapper$mapEmptyScreenConfig$2 organizationsResponseV2Mapper$mapEmptyScreenConfig$2 = new OrganizationsResponseV2Mapper$mapEmptyScreenConfig$2(this.this$0, this.$configDto, continuation);
        organizationsResponseV2Mapper$mapEmptyScreenConfig$2.L$0 = obj;
        return organizationsResponseV2Mapper$mapEmptyScreenConfig$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrganizationsResponseV2Mapper$mapEmptyScreenConfig$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return tje.h(tseVar, null, null, new AnonymousClass1(this.this$0, this.$configDto, null), 3);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
