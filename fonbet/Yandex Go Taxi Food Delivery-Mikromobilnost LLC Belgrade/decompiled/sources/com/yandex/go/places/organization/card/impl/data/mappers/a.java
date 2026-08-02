package com.yandex.go.places.organization.card.impl.data.mappers;

import com.yandex.go.places.models.data.entities.network.BadgeDto;
import com.yandex.go.places.models.data.entities.network.ImageDto;
import com.yandex.go.places.models.data.entities.network.s;
import com.yandex.go.places.models.data.mappers.b;
import com.yandex.go.places.organization.card.api.domain.entities.OrganizationGalleryItemState;
import com.yandex.go.places.organization.card.impl.data.entities.network.card.OrganizationGalleryContentItemDto$OrganizationImageDto;
import com.yandex.go.places.organization.card.impl.data.entities.network.card.OrganizationGalleryContentItemDto$OrganizationImagePlaceholderDto;
import com.yandex.go.places.organization.card.impl.data.entities.network.card.OrganizationGalleryDto;
import com.yandex.go.places.organization.card.impl.data.entities.network.card.OrganizationGalleryItemDto;
import com.yandex.go.places.organization.card.impl.data.entities.network.card.h;
import com.yandex.go.places.organization.card.impl.data.entities.network.card.i;
import defpackage.dbv;
import defpackage.fr;
import defpackage.hi80;
import defpackage.k7v;
import defpackage.kdc;
import defpackage.ki80;
import defpackage.li80;
import defpackage.mi80;
import defpackage.nj4;
import defpackage.ny61;
import defpackage.pdc;
import defpackage.ufu;
import defpackage.w511;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.c;

/* loaded from: classes13.dex */
public final class a {
    public final pdc a;
    public final c b;
    public final dbv c;
    public final com.yandex.go.places.models.data.mappers.a d;
    public final b e;

    public a(pdc pdcVar, c cVar, dbv dbvVar, com.yandex.go.places.models.data.mappers.a aVar, b bVar) {
        this.a = pdcVar;
        this.b = cVar;
        this.c = dbvVar;
        this.d = aVar;
        this.e = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0092, code lost:
    
        if (r13 == r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c2, code lost:
    
        if (r2 == r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(OrganizationGalleryItemDto organizationGalleryItemDto, ContinuationImpl continuationImpl) {
        OrganizationGalleryMapper$convertOrganizationPicture$1 organizationGalleryMapper$convertOrganizationPicture$1;
        int i;
        kdc b;
        kdc kdcVar;
        OrganizationGalleryItemDto organizationGalleryItemDto2;
        fr frVar;
        Object a;
        k7v a2;
        kdc kdcVar2;
        k7v k7vVar;
        if (continuationImpl instanceof OrganizationGalleryMapper$convertOrganizationPicture$1) {
            organizationGalleryMapper$convertOrganizationPicture$1 = (OrganizationGalleryMapper$convertOrganizationPicture$1) continuationImpl;
            int i2 = organizationGalleryMapper$convertOrganizationPicture$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                organizationGalleryMapper$convertOrganizationPicture$1.label = i2 - Integer.MIN_VALUE;
                Object obj = organizationGalleryMapper$convertOrganizationPicture$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = organizationGalleryMapper$convertOrganizationPicture$1.label;
                dbv dbvVar = this.c;
                fr frVar2 = null;
                if (i == 0) {
                    if (i == 1) {
                        a2 = (k7v) organizationGalleryMapper$convertOrganizationPicture$1.L$1;
                        kotlin.b.b(obj);
                        frVar2 = (fr) obj;
                        return new ki80(a2, frVar2, OrganizationGalleryItemState.CONTENT);
                    }
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        k7vVar = (k7v) organizationGalleryMapper$convertOrganizationPicture$1.L$3;
                        frVar = (fr) organizationGalleryMapper$convertOrganizationPicture$1.L$2;
                        kdcVar2 = (kdc) organizationGalleryMapper$convertOrganizationPicture$1.L$1;
                        kotlin.b.b(obj);
                        return new li80((CharSequence) obj, kdcVar2, k7vVar, frVar);
                    }
                    kdc kdcVar3 = (kdc) organizationGalleryMapper$convertOrganizationPicture$1.L$1;
                    OrganizationGalleryItemDto organizationGalleryItemDto3 = (OrganizationGalleryItemDto) organizationGalleryMapper$convertOrganizationPicture$1.L$0;
                    kotlin.b.b(obj);
                    b = kdcVar3;
                    organizationGalleryItemDto = organizationGalleryItemDto3;
                    a = obj;
                    kdc kdcVar4 = b;
                    organizationGalleryItemDto2 = organizationGalleryItemDto;
                    frVar = (fr) a;
                    kdcVar = kdcVar4;
                    ImageDto imageDto = ((OrganizationGalleryContentItemDto$OrganizationImagePlaceholderDto) organizationGalleryItemDto2.a).c;
                    k7v a3 = imageDto == null ? dbvVar.a(imageDto) : null;
                    FormattedText formattedText = ((OrganizationGalleryContentItemDto$OrganizationImagePlaceholderDto) organizationGalleryItemDto2.a).a;
                    organizationGalleryMapper$convertOrganizationPicture$1.L$0 = null;
                    organizationGalleryMapper$convertOrganizationPicture$1.L$1 = kdcVar;
                    organizationGalleryMapper$convertOrganizationPicture$1.L$2 = frVar;
                    organizationGalleryMapper$convertOrganizationPicture$1.L$3 = a3;
                    organizationGalleryMapper$convertOrganizationPicture$1.label = 3;
                    obj = c.i(this.b, formattedText, null, organizationGalleryMapper$convertOrganizationPicture$1, 30);
                    if (obj != coroutineSingletons) {
                        kdcVar2 = kdcVar;
                        k7vVar = a3;
                        return new li80((CharSequence) obj, kdcVar2, k7vVar, frVar);
                    }
                    return coroutineSingletons;
                }
                kotlin.b.b(obj);
                i iVar = organizationGalleryItemDto.a;
                s sVar = organizationGalleryItemDto.b;
                boolean z = iVar instanceof OrganizationGalleryContentItemDto$OrganizationImageDto;
                com.yandex.go.places.models.data.mappers.a aVar = this.d;
                if (z) {
                    a2 = dbvVar.a(((OrganizationGalleryContentItemDto$OrganizationImageDto) iVar).a);
                    if (a2 != null) {
                        if (sVar != null) {
                            organizationGalleryMapper$convertOrganizationPicture$1.L$0 = null;
                            organizationGalleryMapper$convertOrganizationPicture$1.L$1 = a2;
                            organizationGalleryMapper$convertOrganizationPicture$1.L$2 = null;
                            organizationGalleryMapper$convertOrganizationPicture$1.label = 1;
                            obj = aVar.a(sVar, null, organizationGalleryMapper$convertOrganizationPicture$1);
                        }
                        return new ki80(a2, frVar2, OrganizationGalleryItemState.CONTENT);
                    }
                    return null;
                }
                if (iVar instanceof OrganizationGalleryContentItemDto$OrganizationImagePlaceholderDto) {
                    b = ((ufu) this.a).b(((OrganizationGalleryContentItemDto$OrganizationImagePlaceholderDto) iVar).b);
                    if (b != null) {
                        if (sVar == null) {
                            kdcVar = b;
                            organizationGalleryItemDto2 = organizationGalleryItemDto;
                            frVar = null;
                            ImageDto imageDto2 = ((OrganizationGalleryContentItemDto$OrganizationImagePlaceholderDto) organizationGalleryItemDto2.a).c;
                            if (imageDto2 == null) {
                            }
                            FormattedText formattedText2 = ((OrganizationGalleryContentItemDto$OrganizationImagePlaceholderDto) organizationGalleryItemDto2.a).a;
                            organizationGalleryMapper$convertOrganizationPicture$1.L$0 = null;
                            organizationGalleryMapper$convertOrganizationPicture$1.L$1 = kdcVar;
                            organizationGalleryMapper$convertOrganizationPicture$1.L$2 = frVar;
                            organizationGalleryMapper$convertOrganizationPicture$1.L$3 = a3;
                            organizationGalleryMapper$convertOrganizationPicture$1.label = 3;
                            obj = c.i(this.b, formattedText2, null, organizationGalleryMapper$convertOrganizationPicture$1, 30);
                            if (obj != coroutineSingletons) {
                            }
                            return coroutineSingletons;
                        }
                        organizationGalleryMapper$convertOrganizationPicture$1.L$0 = organizationGalleryItemDto;
                        organizationGalleryMapper$convertOrganizationPicture$1.L$1 = b;
                        organizationGalleryMapper$convertOrganizationPicture$1.L$2 = null;
                        organizationGalleryMapper$convertOrganizationPicture$1.label = 2;
                        a = aVar.a(sVar, null, organizationGalleryMapper$convertOrganizationPicture$1);
                    }
                } else if (!(iVar instanceof h)) {
                    w511.b();
                    return null;
                }
                return null;
            }
        }
        organizationGalleryMapper$convertOrganizationPicture$1 = new OrganizationGalleryMapper$convertOrganizationPicture$1(this, continuationImpl);
        Object obj2 = organizationGalleryMapper$convertOrganizationPicture$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = organizationGalleryMapper$convertOrganizationPicture$1.label;
        dbv dbvVar2 = this.c;
        fr frVar22 = null;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0094 -> B:17:0x0097). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(OrganizationGalleryDto organizationGalleryDto, ContinuationImpl continuationImpl) {
        OrganizationGalleryMapper$mapModel$1 organizationGalleryMapper$mapModel$1;
        int i;
        Collection arrayList;
        OrganizationGalleryDto organizationGalleryDto2;
        Iterator it;
        List list;
        if (continuationImpl instanceof OrganizationGalleryMapper$mapModel$1) {
            organizationGalleryMapper$mapModel$1 = (OrganizationGalleryMapper$mapModel$1) continuationImpl;
            int i2 = organizationGalleryMapper$mapModel$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                organizationGalleryMapper$mapModel$1.label = i2 - Integer.MIN_VALUE;
                Object obj = organizationGalleryMapper$mapModel$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = organizationGalleryMapper$mapModel$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List list2 = organizationGalleryDto.a;
                    arrayList = new ArrayList();
                    Iterator it2 = list2.iterator();
                    organizationGalleryDto2 = organizationGalleryDto;
                    it = it2;
                    if (it.hasNext()) {
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = (List) organizationGalleryMapper$mapModel$1.L$1;
                    kotlin.b.b(obj);
                    return new hi80(list, (nj4) obj);
                }
                it = (Iterator) organizationGalleryMapper$mapModel$1.L$5;
                arrayList = (Collection) organizationGalleryMapper$mapModel$1.L$3;
                OrganizationGalleryDto organizationGalleryDto3 = (OrganizationGalleryDto) organizationGalleryMapper$mapModel$1.L$0;
                kotlin.b.b(obj);
                mi80 mi80Var = (mi80) obj;
                if (mi80Var != null) {
                    arrayList.add(mi80Var);
                }
                organizationGalleryDto2 = organizationGalleryDto3;
                if (it.hasNext()) {
                    OrganizationGalleryItemDto organizationGalleryItemDto = (OrganizationGalleryItemDto) it.next();
                    organizationGalleryMapper$mapModel$1.L$0 = organizationGalleryDto2;
                    organizationGalleryMapper$mapModel$1.L$1 = null;
                    organizationGalleryMapper$mapModel$1.L$2 = null;
                    organizationGalleryMapper$mapModel$1.L$3 = arrayList;
                    organizationGalleryMapper$mapModel$1.L$4 = null;
                    organizationGalleryMapper$mapModel$1.L$5 = it;
                    organizationGalleryMapper$mapModel$1.L$6 = null;
                    organizationGalleryMapper$mapModel$1.L$7 = null;
                    organizationGalleryMapper$mapModel$1.L$8 = null;
                    organizationGalleryMapper$mapModel$1.label = 1;
                    Object a = a(organizationGalleryItemDto, organizationGalleryMapper$mapModel$1);
                    if (a != obj2) {
                        organizationGalleryDto3 = organizationGalleryDto2;
                        obj = a;
                        mi80 mi80Var2 = (mi80) obj;
                        if (mi80Var2 != null) {
                        }
                        organizationGalleryDto2 = organizationGalleryDto3;
                        if (it.hasNext()) {
                            List list3 = (List) arrayList;
                            BadgeDto badgeDto = organizationGalleryDto2.b;
                            organizationGalleryMapper$mapModel$1.L$0 = null;
                            organizationGalleryMapper$mapModel$1.L$1 = list3;
                            organizationGalleryMapper$mapModel$1.L$2 = null;
                            organizationGalleryMapper$mapModel$1.L$3 = null;
                            organizationGalleryMapper$mapModel$1.L$4 = null;
                            organizationGalleryMapper$mapModel$1.L$5 = null;
                            organizationGalleryMapper$mapModel$1.L$6 = null;
                            organizationGalleryMapper$mapModel$1.L$7 = null;
                            organizationGalleryMapper$mapModel$1.L$8 = null;
                            organizationGalleryMapper$mapModel$1.label = 2;
                            obj = this.e.a(badgeDto, organizationGalleryMapper$mapModel$1);
                            if (obj != obj2) {
                                list = list3;
                                return new hi80(list, (nj4) obj);
                            }
                        }
                    }
                }
                return obj2;
            }
        }
        organizationGalleryMapper$mapModel$1 = new OrganizationGalleryMapper$mapModel$1(this, continuationImpl);
        Object obj3 = organizationGalleryMapper$mapModel$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = organizationGalleryMapper$mapModel$1.label;
        if (i != 0) {
        }
    }
}
