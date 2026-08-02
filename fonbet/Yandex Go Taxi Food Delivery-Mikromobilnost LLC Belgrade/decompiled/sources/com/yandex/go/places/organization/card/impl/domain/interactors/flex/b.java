package com.yandex.go.places.organization.card.impl.domain.interactors.flex;

import defpackage.ch80;
import defpackage.e2t;
import defpackage.evu0;
import defpackage.lg80;
import defpackage.mdh;
import defpackage.ne80;
import defpackage.ny61;
import defpackage.oh80;
import defpackage.qi80;
import defpackage.sjh;
import defpackage.svj;
import defpackage.ti80;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uc4;
import defpackage.uyj;
import defpackage.wnt;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class b {
    public final e2t a;
    public final ch80 b;
    public final com.yandex.go.places.organization.card.impl.data.repositories.b c;
    public final oh80 d;
    public final tt2 e;
    public final wnt f;
    public final com.yandex.go.places.impl.domain.interactors.a g;
    public final com.yandex.go.places.impl.navigation.common.navigator.internal.b h;

    public b(e2t e2tVar, ch80 ch80Var, com.yandex.go.places.organization.card.impl.data.repositories.b bVar, oh80 oh80Var, tt2 tt2Var, wnt wntVar, com.yandex.go.places.impl.domain.interactors.a aVar, com.yandex.go.places.impl.navigation.common.navigator.internal.b bVar2) {
        this.a = e2tVar;
        this.b = ch80Var;
        this.c = bVar;
        this.d = oh80Var;
        this.e = tt2Var;
        this.f = wntVar;
        this.g = aVar;
        this.h = bVar2;
    }

    public final Object a(ti80 ti80Var, lg80 lg80Var, String str, String str2, svj svjVar, boolean z, String str3, Boolean bool, ContinuationImpl continuationImpl) {
        this.e.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new OrganizationCardsSliderFlexInteractor$createRequestParams$2(this, ti80Var, lg80Var, svjVar, str3, bool, str, str2, z, null), continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(uc4 uc4Var, String str, boolean z, ContinuationImpl continuationImpl) {
        OrganizationCardsSliderFlexInteractor$loadOrganizations$1 organizationCardsSliderFlexInteractor$loadOrganizations$1;
        int i;
        ne80 ne80Var;
        if (continuationImpl instanceof OrganizationCardsSliderFlexInteractor$loadOrganizations$1) {
            organizationCardsSliderFlexInteractor$loadOrganizations$1 = (OrganizationCardsSliderFlexInteractor$loadOrganizations$1) continuationImpl;
            int i2 = organizationCardsSliderFlexInteractor$loadOrganizations$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                organizationCardsSliderFlexInteractor$loadOrganizations$1.label = i2 - Integer.MIN_VALUE;
                OrganizationCardsSliderFlexInteractor$loadOrganizations$1 organizationCardsSliderFlexInteractor$loadOrganizations$12 = organizationCardsSliderFlexInteractor$loadOrganizations$1;
                Object obj = organizationCardsSliderFlexInteractor$loadOrganizations$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = organizationCardsSliderFlexInteractor$loadOrganizations$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ne80 ne80Var2 = (ne80) kotlin.collections.a.b0(this.d.a.b());
                    if (ne80Var2 == null) {
                        return EmptyList.a;
                    }
                    String b = ne80Var2.b.b();
                    organizationCardsSliderFlexInteractor$loadOrganizations$12.L$0 = null;
                    organizationCardsSliderFlexInteractor$loadOrganizations$12.L$1 = null;
                    organizationCardsSliderFlexInteractor$loadOrganizations$12.L$2 = ne80Var2;
                    organizationCardsSliderFlexInteractor$loadOrganizations$12.Z$0 = z;
                    organizationCardsSliderFlexInteractor$loadOrganizations$12.label = 1;
                    Serializable b2 = this.c.b(uc4Var, str, b, z, organizationCardsSliderFlexInteractor$loadOrganizations$12);
                    if (b2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = b2;
                    ne80Var = ne80Var2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ne80Var = (ne80) organizationCardsSliderFlexInteractor$loadOrganizations$12.L$2;
                    kotlin.b.b(obj);
                }
                ArrayList arrayList = new ArrayList();
                for (String str2 : (Iterable) obj) {
                    qi80 qi80Var = (str2 == null || evu0.J(str2)) ? null : new qi80(str2, ne80Var.a.a());
                    ne80 ne80Var3 = qi80Var != null ? new ne80(qi80Var, ne80Var.b, ne80Var.c, ne80Var.d, ne80Var.e, ne80Var.f) : null;
                    if (ne80Var3 != null) {
                        arrayList.add(ne80Var3);
                    }
                }
                return arrayList;
            }
        }
        organizationCardsSliderFlexInteractor$loadOrganizations$1 = new OrganizationCardsSliderFlexInteractor$loadOrganizations$1(this, continuationImpl);
        OrganizationCardsSliderFlexInteractor$loadOrganizations$1 organizationCardsSliderFlexInteractor$loadOrganizations$122 = organizationCardsSliderFlexInteractor$loadOrganizations$1;
        Object obj2 = organizationCardsSliderFlexInteractor$loadOrganizations$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = organizationCardsSliderFlexInteractor$loadOrganizations$122.label;
        if (i != 0) {
        }
        ArrayList arrayList2 = new ArrayList();
        while (r1.hasNext()) {
        }
        return arrayList2;
    }
}
