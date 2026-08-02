package com.yandex.go.places.impl.data.mappers.organizations;

import com.yandex.go.places.impl.data.entities.network.organizations.OrganizationItemV2Dto$OrganizationPreviewItemV2Dto;
import com.yandex.go.places.impl.data.entities.network.organizations.OrganizationPreviewCardButtonDto;
import com.yandex.go.places.impl.data.entities.network.organizations.OrganizationPreviewRatingDto;
import com.yandex.go.places.impl.data.entities.network.organizations.OrganizationPreviewTagDto;
import com.yandex.go.places.models.data.entities.network.BrowserInfoAttributesDto;
import com.yandex.go.places.models.data.entities.network.CompressionResistantAttributedTextContainerDto;
import com.yandex.go.places.models.data.entities.network.CompressionResistantAttributedTextDto;
import defpackage.b65;
import defpackage.dbv;
import defpackage.evu0;
import defpackage.fr;
import defpackage.gk80;
import defpackage.hk80;
import defpackage.il6;
import defpackage.jwd;
import defpackage.k7v;
import defpackage.me11;
import defpackage.ny61;
import defpackage.pdc;
import defpackage.sj80;
import defpackage.tcc;
import defpackage.ufu;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class e {
    public final c a;
    public final pdc b;
    public final com.yandex.go.places.models.data.mappers.e c;
    public final b d;
    public final dbv e;
    public final com.yandex.go.places.models.data.mappers.f f;

    public e(c cVar, pdc pdcVar, com.yandex.go.places.models.data.mappers.e eVar, b bVar, dbv dbvVar, com.yandex.go.places.models.data.mappers.f fVar) {
        this.a = cVar;
        this.b = pdcVar;
        this.c = eVar;
        this.d = bVar;
        this.e = dbvVar;
        this.f = fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0299, code lost:
    
        if (r2 == r4) goto L74;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Type inference failed for: r13v20, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.CharSequence] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0299 -> B:13:0x029c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x01b0 -> B:28:0x01b1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(OrganizationItemV2Dto$OrganizationPreviewItemV2Dto organizationItemV2Dto$OrganizationPreviewItemV2Dto, ContinuationImpl continuationImpl) {
        OrganizationsPreviewItemV2Mapper$mapModel$1 organizationsPreviewItemV2Mapper$mapModel$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object obj;
        k7v a;
        il6 il6Var;
        fr frVar;
        Object b;
        fr frVar2;
        OrganizationItemV2Dto$OrganizationPreviewItemV2Dto organizationItemV2Dto$OrganizationPreviewItemV2Dto2;
        String str;
        List list;
        String str2;
        CompressionResistantAttributedTextContainerDto compressionResistantAttributedTextContainerDto;
        List list2;
        List list3;
        fr frVar3;
        il6 il6Var2;
        OrganizationItemV2Dto$OrganizationPreviewItemV2Dto organizationItemV2Dto$OrganizationPreviewItemV2Dto3;
        String str3;
        List list4;
        Collection arrayList;
        fr frVar4;
        String str4;
        Iterator it;
        List list5;
        ArrayList arrayList2;
        List list6;
        String str5;
        List list7;
        fr frVar5;
        gk80 gk80Var;
        fr frVar6;
        String str6;
        List list8;
        List list9;
        List list10;
        Iterator it2;
        gk80 gk80Var2;
        List list11;
        ArrayList arrayList3;
        String str7;
        fr frVar7;
        List list12;
        String str8;
        fr frVar8;
        il6 il6Var3;
        List list13;
        OrganizationItemV2Dto$OrganizationPreviewItemV2Dto organizationItemV2Dto$OrganizationPreviewItemV2Dto4 = organizationItemV2Dto$OrganizationPreviewItemV2Dto;
        if (continuationImpl instanceof OrganizationsPreviewItemV2Mapper$mapModel$1) {
            organizationsPreviewItemV2Mapper$mapModel$1 = (OrganizationsPreviewItemV2Mapper$mapModel$1) continuationImpl;
            int i2 = organizationsPreviewItemV2Mapper$mapModel$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                organizationsPreviewItemV2Mapper$mapModel$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = organizationsPreviewItemV2Mapper$mapModel$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = organizationsPreviewItemV2Mapper$mapModel$1.label;
                dbv dbvVar = this.e;
                if (i != 0) {
                    obj = null;
                    kotlin.b.b(obj2);
                    a = dbvVar.a(organizationItemV2Dto$OrganizationPreviewItemV2Dto4.e);
                    BrowserInfoAttributesDto browserInfoAttributesDto = organizationItemV2Dto$OrganizationPreviewItemV2Dto4.j;
                    il6 il6Var4 = browserInfoAttributesDto != null ? new il6(browserInfoAttributesDto.a, browserInfoAttributesDto.b) : null;
                    List list14 = organizationItemV2Dto$OrganizationPreviewItemV2Dto4.i;
                    organizationsPreviewItemV2Mapper$mapModel$1.L$0 = organizationItemV2Dto$OrganizationPreviewItemV2Dto4;
                    organizationsPreviewItemV2Mapper$mapModel$1.L$1 = a;
                    organizationsPreviewItemV2Mapper$mapModel$1.L$2 = il6Var4;
                    organizationsPreviewItemV2Mapper$mapModel$1.label = 1;
                    obj2 = this.f.a(list14, il6Var4, organizationsPreviewItemV2Mapper$mapModel$1);
                    if (obj2 != coroutineSingletons) {
                        il6Var = il6Var4;
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    obj = null;
                    il6 il6Var5 = (il6) organizationsPreviewItemV2Mapper$mapModel$1.L$2;
                    a = (k7v) organizationsPreviewItemV2Mapper$mapModel$1.L$1;
                    OrganizationItemV2Dto$OrganizationPreviewItemV2Dto organizationItemV2Dto$OrganizationPreviewItemV2Dto5 = (OrganizationItemV2Dto$OrganizationPreviewItemV2Dto) organizationsPreviewItemV2Mapper$mapModel$1.L$0;
                    kotlin.b.b(obj2);
                    il6Var = il6Var5;
                    organizationItemV2Dto$OrganizationPreviewItemV2Dto4 = organizationItemV2Dto$OrganizationPreviewItemV2Dto5;
                } else if (i == 2) {
                    str = (String) organizationsPreviewItemV2Mapper$mapModel$1.L$5;
                    frVar2 = (fr) organizationsPreviewItemV2Mapper$mapModel$1.L$4;
                    frVar = (fr) organizationsPreviewItemV2Mapper$mapModel$1.L$3;
                    il6Var = (il6) organizationsPreviewItemV2Mapper$mapModel$1.L$2;
                    organizationItemV2Dto$OrganizationPreviewItemV2Dto2 = (OrganizationItemV2Dto$OrganizationPreviewItemV2Dto) organizationsPreviewItemV2Mapper$mapModel$1.L$0;
                    kotlin.b.b(obj2);
                    list = (List) obj2;
                    str2 = organizationItemV2Dto$OrganizationPreviewItemV2Dto2.c;
                    compressionResistantAttributedTextContainerDto = organizationItemV2Dto$OrganizationPreviewItemV2Dto2.d;
                    if (compressionResistantAttributedTextContainerDto != null || (list3 = compressionResistantAttributedTextContainerDto.a) == null) {
                        list2 = null;
                        list5 = organizationItemV2Dto$OrganizationPreviewItemV2Dto2.f;
                        if (list5 != null) {
                        }
                        String str9 = str;
                        List list15 = arrayList2;
                        if (arrayList2 == null) {
                        }
                        OrganizationPreviewRatingDto organizationPreviewRatingDto = organizationItemV2Dto$OrganizationPreviewItemV2Dto2.g;
                        Double d = organizationPreviewRatingDto.a;
                        String str10 = organizationPreviewRatingDto.b;
                        if ((d != null ? d.doubleValue() : 0.0d) <= 0.0d) {
                            list6 = organizationItemV2Dto$OrganizationPreviewItemV2Dto2.h;
                            if (list6 != null) {
                            }
                        }
                        list6 = organizationItemV2Dto$OrganizationPreviewItemV2Dto2.h;
                        if (list6 != null) {
                        }
                    } else {
                        List list16 = list3;
                        frVar3 = frVar;
                        il6Var2 = il6Var;
                        organizationItemV2Dto$OrganizationPreviewItemV2Dto3 = organizationItemV2Dto$OrganizationPreviewItemV2Dto2;
                        str3 = str;
                        list4 = list;
                        arrayList = new ArrayList(tcc.n(list16, 10));
                        frVar4 = frVar2;
                        str4 = str2;
                        it = list16.iterator();
                        if (it.hasNext()) {
                        }
                    }
                } else if (i == 3) {
                    arrayList = (Collection) organizationsPreviewItemV2Mapper$mapModel$1.L$14;
                    ?? r5 = (CharSequence) organizationsPreviewItemV2Mapper$mapModel$1.L$13;
                    list4 = (List) organizationsPreviewItemV2Mapper$mapModel$1.L$12;
                    str3 = (String) organizationsPreviewItemV2Mapper$mapModel$1.L$11;
                    it = (Iterator) organizationsPreviewItemV2Mapper$mapModel$1.L$8;
                    Collection collection = (Collection) organizationsPreviewItemV2Mapper$mapModel$1.L$7;
                    frVar4 = (fr) organizationsPreviewItemV2Mapper$mapModel$1.L$4;
                    frVar3 = (fr) organizationsPreviewItemV2Mapper$mapModel$1.L$3;
                    il6Var2 = (il6) organizationsPreviewItemV2Mapper$mapModel$1.L$2;
                    organizationItemV2Dto$OrganizationPreviewItemV2Dto3 = (OrganizationItemV2Dto$OrganizationPreviewItemV2Dto) organizationsPreviewItemV2Mapper$mapModel$1.L$0;
                    kotlin.b.b(obj2);
                    String str11 = r5;
                    arrayList.add((jwd) obj2);
                    arrayList = collection;
                    str4 = str11;
                    if (it.hasNext()) {
                        CompressionResistantAttributedTextDto compressionResistantAttributedTextDto = (CompressionResistantAttributedTextDto) it.next();
                        organizationsPreviewItemV2Mapper$mapModel$1.L$0 = organizationItemV2Dto$OrganizationPreviewItemV2Dto3;
                        organizationsPreviewItemV2Mapper$mapModel$1.L$1 = null;
                        organizationsPreviewItemV2Mapper$mapModel$1.L$2 = il6Var2;
                        organizationsPreviewItemV2Mapper$mapModel$1.L$3 = frVar3;
                        organizationsPreviewItemV2Mapper$mapModel$1.L$4 = frVar4;
                        organizationsPreviewItemV2Mapper$mapModel$1.L$5 = null;
                        organizationsPreviewItemV2Mapper$mapModel$1.L$6 = null;
                        organizationsPreviewItemV2Mapper$mapModel$1.L$7 = arrayList;
                        organizationsPreviewItemV2Mapper$mapModel$1.L$8 = it;
                        organizationsPreviewItemV2Mapper$mapModel$1.L$9 = null;
                        organizationsPreviewItemV2Mapper$mapModel$1.L$10 = null;
                        organizationsPreviewItemV2Mapper$mapModel$1.L$11 = str3;
                        organizationsPreviewItemV2Mapper$mapModel$1.L$12 = list4;
                        organizationsPreviewItemV2Mapper$mapModel$1.L$13 = str4;
                        organizationsPreviewItemV2Mapper$mapModel$1.L$14 = arrayList;
                        organizationsPreviewItemV2Mapper$mapModel$1.label = 3;
                        obj2 = this.c.a(compressionResistantAttributedTextDto, organizationsPreviewItemV2Mapper$mapModel$1);
                        if (obj2 != coroutineSingletons) {
                            collection = arrayList;
                            str11 = str4;
                            arrayList.add((jwd) obj2);
                            arrayList = collection;
                            str4 = str11;
                            if (it.hasNext()) {
                                str2 = str4;
                                list = list4;
                                frVar2 = frVar4;
                                frVar = frVar3;
                                list2 = (List) arrayList;
                                str = str3;
                                organizationItemV2Dto$OrganizationPreviewItemV2Dto2 = organizationItemV2Dto$OrganizationPreviewItemV2Dto3;
                                il6Var = il6Var2;
                                list5 = organizationItemV2Dto$OrganizationPreviewItemV2Dto2.f;
                                if (list5 != null) {
                                    List<OrganizationPreviewTagDto> list17 = list5;
                                    arrayList2 = new ArrayList(tcc.n(list17, 10));
                                    for (OrganizationPreviewTagDto organizationPreviewTagDto : list17) {
                                        arrayList2.add(new hk80(organizationPreviewTagDto.a, organizationPreviewTagDto.b, organizationPreviewTagDto.c, dbvVar.a(organizationPreviewTagDto.d), organizationPreviewTagDto.e, ((ufu) this.b).i(organizationPreviewTagDto.f)));
                                        str = str;
                                    }
                                } else {
                                    arrayList2 = null;
                                }
                                String str92 = str;
                                List list152 = arrayList2;
                                if (arrayList2 == null) {
                                    list152 = EmptyList.a;
                                }
                                OrganizationPreviewRatingDto organizationPreviewRatingDto2 = organizationItemV2Dto$OrganizationPreviewItemV2Dto2.g;
                                Double d2 = organizationPreviewRatingDto2.a;
                                String str102 = organizationPreviewRatingDto2.b;
                                gk80 gk80Var3 = ((d2 != null ? d2.doubleValue() : 0.0d) <= 0.0d && evu0.J(str102)) ? null : new gk80(organizationPreviewRatingDto2.a, str102);
                                list6 = organizationItemV2Dto$OrganizationPreviewItemV2Dto2.h;
                                if (list6 != null) {
                                    str5 = str92;
                                    list7 = list;
                                    frVar5 = frVar2;
                                    gk80Var = gk80Var3;
                                    frVar6 = frVar;
                                    str6 = str2;
                                    list8 = list2;
                                    list9 = list152;
                                    list10 = null;
                                    return new b65(str5, list7, str6, list8, list9, gk80Var, list10, frVar6, frVar5, false);
                                }
                                ArrayList arrayList4 = new ArrayList();
                                String str12 = str2;
                                it2 = list6.iterator();
                                gk80Var2 = gk80Var3;
                                list11 = list2;
                                arrayList3 = arrayList4;
                                str7 = str12;
                                List list18 = list152;
                                frVar7 = frVar2;
                                list12 = list18;
                                str8 = str92;
                                frVar8 = frVar;
                                il6Var3 = il6Var;
                                list13 = list;
                                if (it2.hasNext()) {
                                }
                            }
                        }
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 4) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    gk80Var2 = (gk80) organizationsPreviewItemV2Mapper$mapModel$1.L$18;
                    list12 = (List) organizationsPreviewItemV2Mapper$mapModel$1.L$17;
                    list11 = (List) organizationsPreviewItemV2Mapper$mapModel$1.L$16;
                    ?? r7 = (CharSequence) organizationsPreviewItemV2Mapper$mapModel$1.L$15;
                    list13 = (List) organizationsPreviewItemV2Mapper$mapModel$1.L$14;
                    str8 = (String) organizationsPreviewItemV2Mapper$mapModel$1.L$13;
                    it2 = (Iterator) organizationsPreviewItemV2Mapper$mapModel$1.L$9;
                    ?? r13 = (Collection) organizationsPreviewItemV2Mapper$mapModel$1.L$7;
                    frVar7 = (fr) organizationsPreviewItemV2Mapper$mapModel$1.L$4;
                    frVar8 = (fr) organizationsPreviewItemV2Mapper$mapModel$1.L$3;
                    il6Var3 = (il6) organizationsPreviewItemV2Mapper$mapModel$1.L$2;
                    kotlin.b.b(obj2);
                    String str13 = r7;
                    ArrayList arrayList5 = r13;
                    sj80 sj80Var = (sj80) obj2;
                    str7 = str13;
                    arrayList3 = arrayList5;
                    if (sj80Var != null) {
                        arrayList5.add(sj80Var);
                        str7 = str13;
                        arrayList3 = arrayList5;
                    }
                    if (it2.hasNext()) {
                        gk80Var = gk80Var2;
                        list9 = list12;
                        list8 = list11;
                        str6 = str7;
                        list7 = list13;
                        str5 = str8;
                        list10 = arrayList3;
                        frVar5 = frVar7;
                        frVar6 = frVar8;
                        return new b65(str5, list7, str6, list8, list9, gk80Var, list10, frVar6, frVar5, false);
                    }
                    OrganizationPreviewCardButtonDto organizationPreviewCardButtonDto = (OrganizationPreviewCardButtonDto) it2.next();
                    organizationsPreviewItemV2Mapper$mapModel$1.L$0 = null;
                    organizationsPreviewItemV2Mapper$mapModel$1.L$1 = null;
                    organizationsPreviewItemV2Mapper$mapModel$1.L$2 = il6Var3;
                    organizationsPreviewItemV2Mapper$mapModel$1.L$3 = frVar8;
                    organizationsPreviewItemV2Mapper$mapModel$1.L$4 = frVar7;
                    organizationsPreviewItemV2Mapper$mapModel$1.L$5 = null;
                    organizationsPreviewItemV2Mapper$mapModel$1.L$6 = null;
                    organizationsPreviewItemV2Mapper$mapModel$1.L$7 = arrayList3;
                    organizationsPreviewItemV2Mapper$mapModel$1.L$8 = null;
                    organizationsPreviewItemV2Mapper$mapModel$1.L$9 = it2;
                    organizationsPreviewItemV2Mapper$mapModel$1.L$10 = null;
                    organizationsPreviewItemV2Mapper$mapModel$1.L$11 = null;
                    organizationsPreviewItemV2Mapper$mapModel$1.L$12 = null;
                    organizationsPreviewItemV2Mapper$mapModel$1.L$13 = str8;
                    organizationsPreviewItemV2Mapper$mapModel$1.L$14 = list13;
                    organizationsPreviewItemV2Mapper$mapModel$1.L$15 = str7;
                    organizationsPreviewItemV2Mapper$mapModel$1.L$16 = list11;
                    organizationsPreviewItemV2Mapper$mapModel$1.L$17 = list12;
                    organizationsPreviewItemV2Mapper$mapModel$1.L$18 = gk80Var2;
                    organizationsPreviewItemV2Mapper$mapModel$1.label = 4;
                    obj2 = this.a.a(organizationPreviewCardButtonDto, il6Var3, organizationsPreviewItemV2Mapper$mapModel$1);
                    str13 = str7;
                    arrayList5 = arrayList3;
                }
                me11 me11Var = (me11) obj2;
                frVar = me11Var.a;
                fr frVar9 = me11Var.b;
                String str14 = organizationItemV2Dto$OrganizationPreviewItemV2Dto4.a;
                List list19 = organizationItemV2Dto$OrganizationPreviewItemV2Dto4.b;
                organizationsPreviewItemV2Mapper$mapModel$1.L$0 = organizationItemV2Dto$OrganizationPreviewItemV2Dto4;
                organizationsPreviewItemV2Mapper$mapModel$1.L$1 = obj;
                organizationsPreviewItemV2Mapper$mapModel$1.L$2 = il6Var;
                organizationsPreviewItemV2Mapper$mapModel$1.L$3 = frVar;
                organizationsPreviewItemV2Mapper$mapModel$1.L$4 = frVar9;
                organizationsPreviewItemV2Mapper$mapModel$1.L$5 = str14;
                organizationsPreviewItemV2Mapper$mapModel$1.label = 2;
                b = this.d.b(list19, frVar9, a, organizationsPreviewItemV2Mapper$mapModel$1);
                if (b != coroutineSingletons) {
                    frVar2 = frVar9;
                    obj2 = b;
                    organizationItemV2Dto$OrganizationPreviewItemV2Dto2 = organizationItemV2Dto$OrganizationPreviewItemV2Dto4;
                    str = str14;
                    list = (List) obj2;
                    str2 = organizationItemV2Dto$OrganizationPreviewItemV2Dto2.c;
                    compressionResistantAttributedTextContainerDto = organizationItemV2Dto$OrganizationPreviewItemV2Dto2.d;
                    if (compressionResistantAttributedTextContainerDto != null) {
                    }
                    list2 = null;
                    list5 = organizationItemV2Dto$OrganizationPreviewItemV2Dto2.f;
                    if (list5 != null) {
                    }
                    String str922 = str;
                    List list1522 = arrayList2;
                    if (arrayList2 == null) {
                    }
                    OrganizationPreviewRatingDto organizationPreviewRatingDto22 = organizationItemV2Dto$OrganizationPreviewItemV2Dto2.g;
                    Double d22 = organizationPreviewRatingDto22.a;
                    String str1022 = organizationPreviewRatingDto22.b;
                    if ((d22 != null ? d22.doubleValue() : 0.0d) <= 0.0d) {
                    }
                    list6 = organizationItemV2Dto$OrganizationPreviewItemV2Dto2.h;
                    if (list6 != null) {
                    }
                }
                return coroutineSingletons;
            }
        }
        organizationsPreviewItemV2Mapper$mapModel$1 = new OrganizationsPreviewItemV2Mapper$mapModel$1(this, continuationImpl);
        Object obj22 = organizationsPreviewItemV2Mapper$mapModel$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = organizationsPreviewItemV2Mapper$mapModel$1.label;
        dbv dbvVar2 = this.e;
        if (i != 0) {
        }
        me11 me11Var2 = (me11) obj22;
        frVar = me11Var2.a;
        fr frVar92 = me11Var2.b;
        String str142 = organizationItemV2Dto$OrganizationPreviewItemV2Dto4.a;
        List list192 = organizationItemV2Dto$OrganizationPreviewItemV2Dto4.b;
        organizationsPreviewItemV2Mapper$mapModel$1.L$0 = organizationItemV2Dto$OrganizationPreviewItemV2Dto4;
        organizationsPreviewItemV2Mapper$mapModel$1.L$1 = obj;
        organizationsPreviewItemV2Mapper$mapModel$1.L$2 = il6Var;
        organizationsPreviewItemV2Mapper$mapModel$1.L$3 = frVar;
        organizationsPreviewItemV2Mapper$mapModel$1.L$4 = frVar92;
        organizationsPreviewItemV2Mapper$mapModel$1.L$5 = str142;
        organizationsPreviewItemV2Mapper$mapModel$1.label = 2;
        b = this.d.b(list192, frVar92, a, organizationsPreviewItemV2Mapper$mapModel$1);
        if (b != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
