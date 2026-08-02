package com.yandex.go.places.impl.data.mappers.organizations;

import com.yandex.go.places.impl.data.entities.network.organizations.OrganizationPreviewImageItemDto$OrganizationPreviewImageDto;
import com.yandex.go.places.impl.data.entities.network.organizations.OrganizationPreviewImageItemDto$OrganizationPreviewPlaceholderDto;
import com.yandex.go.places.impl.data.entities.network.organizations.OrganizationPreviewSliderItemDto;
import com.yandex.go.places.impl.data.entities.network.organizations.m;
import com.yandex.go.places.impl.data.entities.network.organizations.n;
import com.yandex.go.places.models.data.entities.network.s;
import defpackage.bvf0;
import defpackage.dbv;
import defpackage.f65;
import defpackage.fr;
import defpackage.h65;
import defpackage.jl40;
import defpackage.k7v;
import defpackage.ny61;
import defpackage.pdc;
import defpackage.scc;
import defpackage.w511;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class b {
    public final pdc a;
    public final dbv b;
    public final com.yandex.go.places.models.data.mappers.a c;

    public b(pdc pdcVar, dbv dbvVar, com.yandex.go.places.models.data.mappers.a aVar) {
        this.a = pdcVar;
        this.b = dbvVar;
        this.c = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b4, code lost:
    
        if (r10 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(OrganizationPreviewSliderItemDto organizationPreviewSliderItemDto, fr frVar, k7v k7vVar, ContinuationImpl continuationImpl) {
        OrganizationsImagesPreviewMapper$mapModel$3 organizationsImagesPreviewMapper$mapModel$3;
        int i;
        k7v a;
        String str;
        k7v k7vVar2;
        String str2;
        fr frVar2;
        if (continuationImpl instanceof OrganizationsImagesPreviewMapper$mapModel$3) {
            organizationsImagesPreviewMapper$mapModel$3 = (OrganizationsImagesPreviewMapper$mapModel$3) continuationImpl;
            int i2 = organizationsImagesPreviewMapper$mapModel$3.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                organizationsImagesPreviewMapper$mapModel$3.label = i2 - Integer.MIN_VALUE;
                Object obj = organizationsImagesPreviewMapper$mapModel$3.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = organizationsImagesPreviewMapper$mapModel$3.label;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return (h65) obj;
                    }
                    str2 = (String) organizationsImagesPreviewMapper$mapModel$3.L$4;
                    k7vVar2 = (k7v) organizationsImagesPreviewMapper$mapModel$3.L$3;
                    k7vVar = (k7v) organizationsImagesPreviewMapper$mapModel$3.L$2;
                    frVar = (fr) organizationsImagesPreviewMapper$mapModel$3.L$1;
                    kotlin.b.b(obj);
                    frVar2 = (fr) obj;
                    if (frVar2 == null) {
                        str = str2;
                        a = k7vVar2;
                        k7vVar2 = a;
                        str2 = str;
                        frVar2 = frVar;
                    }
                    return new f65(k7vVar, str2, k7vVar2, frVar2);
                }
                kotlin.b.b(obj);
                n nVar = organizationPreviewSliderItemDto.c;
                if (nVar instanceof OrganizationPreviewImageItemDto$OrganizationPreviewImageDto) {
                    a = this.b.a(((OrganizationPreviewImageItemDto$OrganizationPreviewImageDto) nVar).a);
                    if (a != null) {
                        str = organizationPreviewSliderItemDto.a;
                        s sVar = organizationPreviewSliderItemDto.b;
                        if (sVar != null) {
                            organizationsImagesPreviewMapper$mapModel$3.L$0 = null;
                            organizationsImagesPreviewMapper$mapModel$3.L$1 = frVar;
                            organizationsImagesPreviewMapper$mapModel$3.L$2 = k7vVar;
                            organizationsImagesPreviewMapper$mapModel$3.L$3 = a;
                            organizationsImagesPreviewMapper$mapModel$3.L$4 = str;
                            organizationsImagesPreviewMapper$mapModel$3.L$5 = null;
                            organizationsImagesPreviewMapper$mapModel$3.label = 1;
                            Object a2 = this.c.a(sVar, null, organizationsImagesPreviewMapper$mapModel$3);
                            if (a2 != coroutineSingletons) {
                                k7vVar2 = a;
                                obj = a2;
                                str2 = str;
                                frVar2 = (fr) obj;
                                if (frVar2 == null) {
                                }
                                return new f65(k7vVar, str2, k7vVar2, frVar2);
                            }
                            return coroutineSingletons;
                        }
                        k7vVar2 = a;
                        str2 = str;
                        frVar2 = frVar;
                        return new f65(k7vVar, str2, k7vVar2, frVar2);
                    }
                    return null;
                }
                if (!(nVar instanceof OrganizationPreviewImageItemDto$OrganizationPreviewPlaceholderDto)) {
                    if (!jl40.l(nVar, m.INSTANCE)) {
                        w511.b();
                        return null;
                    }
                    return null;
                }
                OrganizationsImagesPreviewMapper$mapModel$5 organizationsImagesPreviewMapper$mapModel$5 = new OrganizationsImagesPreviewMapper$mapModel$5(organizationPreviewSliderItemDto, frVar, this, null);
                organizationsImagesPreviewMapper$mapModel$3.L$0 = null;
                organizationsImagesPreviewMapper$mapModel$3.L$1 = null;
                organizationsImagesPreviewMapper$mapModel$3.L$2 = null;
                organizationsImagesPreviewMapper$mapModel$3.label = 2;
                obj = bvf0.n(organizationsImagesPreviewMapper$mapModel$5, organizationsImagesPreviewMapper$mapModel$3);
            }
        }
        organizationsImagesPreviewMapper$mapModel$3 = new OrganizationsImagesPreviewMapper$mapModel$3(this, continuationImpl);
        Object obj2 = organizationsImagesPreviewMapper$mapModel$3.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = organizationsImagesPreviewMapper$mapModel$3.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00b2 -> B:10:0x00b5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(List list, fr frVar, k7v k7vVar, ContinuationImpl continuationImpl) {
        OrganizationsImagesPreviewMapper$mapModel$1 organizationsImagesPreviewMapper$mapModel$1;
        int i;
        int i2;
        Iterator it;
        fr frVar2;
        k7v k7vVar2;
        Collection collection;
        if (continuationImpl instanceof OrganizationsImagesPreviewMapper$mapModel$1) {
            organizationsImagesPreviewMapper$mapModel$1 = (OrganizationsImagesPreviewMapper$mapModel$1) continuationImpl;
            int i3 = organizationsImagesPreviewMapper$mapModel$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                organizationsImagesPreviewMapper$mapModel$1.label = i3 - Integer.MIN_VALUE;
                Object obj = organizationsImagesPreviewMapper$mapModel$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = organizationsImagesPreviewMapper$mapModel$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ArrayList arrayList = new ArrayList();
                    i2 = 0;
                    it = list.iterator();
                    frVar2 = frVar;
                    k7vVar2 = k7vVar;
                    collection = arrayList;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i4 = organizationsImagesPreviewMapper$mapModel$1.I$0;
                    it = (Iterator) organizationsImagesPreviewMapper$mapModel$1.L$7;
                    collection = (Collection) organizationsImagesPreviewMapper$mapModel$1.L$5;
                    k7v k7vVar3 = (k7v) organizationsImagesPreviewMapper$mapModel$1.L$2;
                    fr frVar3 = (fr) organizationsImagesPreviewMapper$mapModel$1.L$1;
                    kotlin.b.b(obj);
                    int i5 = i4;
                    frVar2 = frVar3;
                    h65 h65Var = (h65) obj;
                    if (h65Var != null) {
                        collection.add(h65Var);
                    }
                    k7vVar2 = k7vVar3;
                    i2 = i5;
                    if (it.hasNext()) {
                        Object next = it.next();
                        i5 = i2 + 1;
                        if (i2 < 0) {
                            scc.m();
                            throw null;
                        }
                        OrganizationPreviewSliderItemDto organizationPreviewSliderItemDto = (OrganizationPreviewSliderItemDto) next;
                        k7v k7vVar4 = (i2 == 0 && (organizationPreviewSliderItemDto.c instanceof OrganizationPreviewImageItemDto$OrganizationPreviewImageDto)) ? k7vVar2 : null;
                        organizationsImagesPreviewMapper$mapModel$1.L$0 = null;
                        organizationsImagesPreviewMapper$mapModel$1.L$1 = frVar2;
                        organizationsImagesPreviewMapper$mapModel$1.L$2 = k7vVar2;
                        organizationsImagesPreviewMapper$mapModel$1.L$3 = null;
                        organizationsImagesPreviewMapper$mapModel$1.L$4 = null;
                        organizationsImagesPreviewMapper$mapModel$1.L$5 = collection;
                        organizationsImagesPreviewMapper$mapModel$1.L$6 = null;
                        organizationsImagesPreviewMapper$mapModel$1.L$7 = it;
                        organizationsImagesPreviewMapper$mapModel$1.L$8 = null;
                        organizationsImagesPreviewMapper$mapModel$1.L$9 = null;
                        organizationsImagesPreviewMapper$mapModel$1.L$10 = null;
                        organizationsImagesPreviewMapper$mapModel$1.L$11 = null;
                        organizationsImagesPreviewMapper$mapModel$1.I$0 = i5;
                        organizationsImagesPreviewMapper$mapModel$1.I$1 = i2;
                        organizationsImagesPreviewMapper$mapModel$1.I$2 = i2;
                        organizationsImagesPreviewMapper$mapModel$1.label = 1;
                        Object a = a(organizationPreviewSliderItemDto, frVar2, k7vVar4, organizationsImagesPreviewMapper$mapModel$1);
                        if (a == obj2) {
                            return obj2;
                        }
                        k7vVar3 = k7vVar2;
                        obj = a;
                        h65 h65Var2 = (h65) obj;
                        if (h65Var2 != null) {
                        }
                        k7vVar2 = k7vVar3;
                        i2 = i5;
                        if (it.hasNext()) {
                            return (List) collection;
                        }
                    }
                }
            }
        }
        organizationsImagesPreviewMapper$mapModel$1 = new OrganizationsImagesPreviewMapper$mapModel$1(this, continuationImpl);
        Object obj3 = organizationsImagesPreviewMapper$mapModel$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = organizationsImagesPreviewMapper$mapModel$1.label;
        if (i != 0) {
        }
    }
}
