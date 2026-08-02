package com.yandex.go.places.impl.data.mappers.organizations;

import com.yandex.go.places.impl.data.entities.network.organizations.OrganizationPreviewSliderItemDto;
import com.yandex.go.places.models.data.entities.network.s;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.fr;
import defpackage.g65;
import defpackage.k7v;
import defpackage.kdc;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lg65;", "<anonymous>", "(Ltse;)Lg65;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.data.mappers.organizations.OrganizationsImagesPreviewMapper$mapModel$5", f = "OrganizationsImagesPreviewMapper.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE, 64, 65}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class OrganizationsImagesPreviewMapper$mapModel$5 extends SuspendLambda implements wls {
    final /* synthetic */ fr $defaultAction;
    final /* synthetic */ OrganizationPreviewSliderItemDto $dto;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrganizationsImagesPreviewMapper$mapModel$5(OrganizationPreviewSliderItemDto organizationPreviewSliderItemDto, fr frVar, b bVar, Continuation continuation) {
        super(2, continuation);
        this.$dto = organizationPreviewSliderItemDto;
        this.$defaultAction = frVar;
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OrganizationsImagesPreviewMapper$mapModel$5 organizationsImagesPreviewMapper$mapModel$5 = new OrganizationsImagesPreviewMapper$mapModel$5(this.$dto, this.$defaultAction, this.this$0, continuation);
        organizationsImagesPreviewMapper$mapModel$5.L$0 = obj;
        return organizationsImagesPreviewMapper$mapModel$5;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrganizationsImagesPreviewMapper$mapModel$5) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00f2  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh nohVar;
        noh nohVar2;
        String str;
        k7v k7vVar;
        noh nohVar3;
        String str2;
        kdc kdcVar;
        k7v k7vVar2;
        kdc kdcVar2;
        fr frVar;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            qoh h = tje.h(tseVar, null, null, new OrganizationsImagesPreviewMapper$mapModel$5$image$1(this.this$0, this.$dto, null), 3);
            qoh h2 = tje.h(tseVar, null, null, new OrganizationsImagesPreviewMapper$mapModel$5$color$1(this.this$0, this.$dto, null), 3);
            s sVar = this.$dto.b;
            qoh h3 = sVar != null ? tje.h(tseVar, null, null, new OrganizationsImagesPreviewMapper$mapModel$5$action$1$1(this.this$0, sVar, null), 3) : null;
            String str3 = this.$dto.a;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h2;
            this.L$3 = h3;
            this.L$4 = str3;
            this.label = 1;
            obj = h.s(this);
            if (obj != coroutineSingletons) {
                nohVar = h2;
                nohVar2 = h3;
                str = str3;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kdcVar2 = (kdc) this.L$6;
                k7vVar2 = (k7v) this.L$5;
                str2 = (String) this.L$4;
                kotlin.b.b(obj);
                frVar = (fr) obj;
                if (frVar == null) {
                    kdcVar = kdcVar2;
                    k7vVar = k7vVar2;
                    k7vVar2 = k7vVar;
                    kdcVar2 = kdcVar;
                    frVar = this.$defaultAction;
                }
                return new g65(kdcVar2, str2, k7vVar2, frVar);
            }
            k7vVar = (k7v) this.L$5;
            str2 = (String) this.L$4;
            nohVar3 = (noh) this.L$3;
            kotlin.b.b(obj);
            kdcVar = (kdc) obj;
            if (kdcVar != null) {
                if (nohVar3 != null) {
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = str2;
                    this.L$5 = k7vVar;
                    this.L$6 = kdcVar;
                    this.label = 3;
                    Object k = nohVar3.k(this);
                    if (k != coroutineSingletons) {
                        k7vVar2 = k7vVar;
                        kdcVar2 = kdcVar;
                        obj = k;
                        frVar = (fr) obj;
                        if (frVar == null) {
                        }
                        return new g65(kdcVar2, str2, k7vVar2, frVar);
                    }
                    return coroutineSingletons;
                }
                k7vVar2 = k7vVar;
                kdcVar2 = kdcVar;
                frVar = this.$defaultAction;
                return new g65(kdcVar2, str2, k7vVar2, frVar);
            }
            return null;
        }
        str = (String) this.L$4;
        nohVar2 = (noh) this.L$3;
        nohVar = (noh) this.L$2;
        kotlin.b.b(obj);
        k7v k7vVar3 = (k7v) obj;
        if (k7vVar3 != null) {
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = nohVar2;
            this.L$4 = str;
            this.L$5 = k7vVar3;
            this.label = 2;
            Object k2 = nohVar.k(this);
            if (k2 != coroutineSingletons) {
                String str4 = str;
                k7vVar = k7vVar3;
                obj = k2;
                nohVar3 = nohVar2;
                str2 = str4;
                kdcVar = (kdc) obj;
                if (kdcVar != null) {
                }
            }
            return coroutineSingletons;
        }
        return null;
    }
}
