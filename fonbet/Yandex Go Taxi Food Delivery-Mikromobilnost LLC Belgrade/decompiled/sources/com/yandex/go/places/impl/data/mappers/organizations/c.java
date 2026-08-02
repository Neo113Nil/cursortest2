package com.yandex.go.places.impl.data.mappers.organizations;

import com.yandex.go.places.impl.data.entities.network.organizations.OrganizationPreviewCardButtonDto;
import com.yandex.go.places.impl.data.entities.network.organizations.OrganizationPreviewCardButtonTypeDto;
import com.yandex.go.places.impl.domain.entities.organizations.OrganizationPreviewCardButtonType;
import defpackage.fr;
import defpackage.il6;
import defpackage.k7v;
import defpackage.k7x0;
import defpackage.m7x0;
import defpackage.ny61;
import defpackage.pdc;
import defpackage.sj80;
import defpackage.ufu;
import defpackage.w511;
import defpackage.zo80;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class c {
    public final k7x0 a;
    public final pdc b;
    public final com.yandex.go.places.models.data.mappers.a c;

    public c(k7x0 k7x0Var, pdc pdcVar, com.yandex.go.places.models.data.mappers.a aVar) {
        this.a = k7x0Var;
        this.b = pdcVar;
        this.c = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(OrganizationPreviewCardButtonDto organizationPreviewCardButtonDto, il6 il6Var, ContinuationImpl continuationImpl) {
        OrganizationsPreviewCardButtonMapper$mapModel$1 organizationsPreviewCardButtonMapper$mapModel$1;
        int i;
        fr frVar;
        OrganizationPreviewCardButtonType organizationPreviewCardButtonType;
        OrganizationPreviewCardButtonType organizationPreviewCardButtonType2;
        OrganizationPreviewCardButtonDto organizationPreviewCardButtonDto2 = organizationPreviewCardButtonDto;
        if (continuationImpl instanceof OrganizationsPreviewCardButtonMapper$mapModel$1) {
            organizationsPreviewCardButtonMapper$mapModel$1 = (OrganizationsPreviewCardButtonMapper$mapModel$1) continuationImpl;
            int i2 = organizationsPreviewCardButtonMapper$mapModel$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                organizationsPreviewCardButtonMapper$mapModel$1.label = i2 - Integer.MIN_VALUE;
                Object obj = organizationsPreviewCardButtonMapper$mapModel$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = organizationsPreviewCardButtonMapper$mapModel$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List list = organizationPreviewCardButtonDto2.g;
                    organizationsPreviewCardButtonMapper$mapModel$1.L$0 = organizationPreviewCardButtonDto2;
                    organizationsPreviewCardButtonMapper$mapModel$1.L$1 = null;
                    organizationsPreviewCardButtonMapper$mapModel$1.label = 1;
                    obj = this.c.b(list, il6Var, organizationsPreviewCardButtonMapper$mapModel$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    organizationPreviewCardButtonDto2 = (OrganizationPreviewCardButtonDto) organizationsPreviewCardButtonMapper$mapModel$1.L$0;
                    kotlin.b.b(obj);
                }
                frVar = (fr) obj;
                if (frVar != null) {
                    OrganizationPreviewCardButtonTypeDto organizationPreviewCardButtonTypeDto = organizationPreviewCardButtonDto2.e;
                    int i3 = organizationPreviewCardButtonTypeDto == null ? -1 : zo80.a[organizationPreviewCardButtonTypeDto.ordinal()];
                    if (i3 != -1) {
                        if (i3 == 1) {
                            organizationPreviewCardButtonType2 = OrganizationPreviewCardButtonType.LEAD;
                        } else {
                            if (i3 != 2) {
                                w511.b();
                                return null;
                            }
                            organizationPreviewCardButtonType2 = OrganizationPreviewCardButtonType.SECONDARY;
                        }
                        organizationPreviewCardButtonType = organizationPreviewCardButtonType2;
                    } else {
                        organizationPreviewCardButtonType = null;
                    }
                    if (organizationPreviewCardButtonType != null) {
                        String str = organizationPreviewCardButtonDto2.a;
                        String str2 = organizationPreviewCardButtonDto2.b;
                        return new sj80(str, str2 != null ? new k7v(((m7x0) this.a).a(str2), 2) : null, ((ufu) this.b).b(organizationPreviewCardButtonDto2.c), organizationPreviewCardButtonDto2.f, organizationPreviewCardButtonDto2.d, organizationPreviewCardButtonType, frVar);
                    }
                }
                return null;
            }
        }
        organizationsPreviewCardButtonMapper$mapModel$1 = new OrganizationsPreviewCardButtonMapper$mapModel$1(this, continuationImpl);
        Object obj2 = organizationsPreviewCardButtonMapper$mapModel$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = organizationsPreviewCardButtonMapper$mapModel$1.label;
        if (i != 0) {
        }
        frVar = (fr) obj2;
        if (frVar != null) {
        }
        return null;
    }
}
