package com.yandex.go.places.impl.data.mappers.organizations;

import com.yandex.go.places.impl.data.entities.network.ButtonDto;
import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.request.FilterOptionRequestDto;
import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.request.FilterRequestDto;
import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.request.FiltersAndSortingRequestDto;
import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.request.SortOptionRequestDto;
import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.request.SortRequestDto;
import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response.ChipAppearanceDto;
import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response.FilterChipDto;
import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response.FilterModalChipBlockDto;
import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response.ModalContentDto$FilterModalDto;
import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response.ModalContentDto$SortModalDto;
import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response.ShortcutChipDto$ShortcutFilterChipDto;
import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response.ShortcutChipDto$ShortcutModalChipDto;
import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response.SortModalItemBlockDto;
import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response.SortOptionItemDto;
import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response.m;
import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response.q;
import defpackage.bdc;
import defpackage.c4r;
import defpackage.c9t0;
import defpackage.dbv;
import defpackage.gvp0;
import defpackage.hvp0;
import defpackage.ivp0;
import defpackage.kdc;
import defpackage.ky6;
import defpackage.ny61;
import defpackage.pdc;
import defpackage.rcc;
import defpackage.s95;
import defpackage.t95;
import defpackage.tcc;
import defpackage.u95;
import defpackage.ufu;
import defpackage.v4r;
import defpackage.v95;
import defpackage.xng0;
import defpackage.xx20;
import defpackage.ypb;
import defpackage.yx20;
import defpackage.zx20;
import defpackage.zxs0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes13.dex */
public final class h {
    public final dbv a;
    public final com.yandex.go.places.models.data.mappers.c b;
    public final pdc c;
    public final ru.yandex.taxi.widget.c d;

    public h(dbv dbvVar, com.yandex.go.places.models.data.mappers.c cVar, pdc pdcVar, ru.yandex.taxi.widget.c cVar2) {
        this.a = dbvVar;
        this.b = cVar;
        this.c = pdcVar;
        this.d = cVar2;
    }

    public static FiltersAndSortingRequestDto a(List list) {
        ListBuilder a = rcc.a();
        List<v95> list2 = list;
        for (v95 v95Var : list2) {
            if (v95Var instanceof u95) {
                u95 u95Var = (u95) v95Var;
                gvp0 gvp0Var = u95Var.b;
                FilterOptionRequestDto filterOptionRequestDto = gvp0Var.b ? new FilterOptionRequestDto(gvp0Var.a, gvp0Var.c) : null;
                if (filterOptionRequestDto != null) {
                    a.add(new FilterRequestDto(u95Var.a, filterOptionRequestDto, FilterRequestDto.FilterTypeDto.TOGGLE));
                }
            } else if (v95Var instanceof s95) {
                s95 s95Var = (s95) v95Var;
                ArrayList arrayList = s95Var.b;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (((gvp0) obj).b) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    gvp0 gvp0Var2 = (gvp0) it.next();
                    FilterOptionRequestDto filterOptionRequestDto2 = gvp0Var2.b ? new FilterOptionRequestDto(gvp0Var2.a, gvp0Var2.c) : null;
                    FilterRequestDto filterRequestDto = filterOptionRequestDto2 != null ? new FilterRequestDto(s95Var.a, filterOptionRequestDto2, FilterRequestDto.FilterTypeDto.SELECTION) : null;
                    if (filterRequestDto != null) {
                        arrayList3.add(filterRequestDto);
                    }
                }
                a.addAll(arrayList3);
            }
        }
        ListBuilder j = a.j();
        ListBuilder a2 = rcc.a();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : list2) {
            if (obj2 instanceof t95) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList(tcc.n(arrayList4, 10));
        Iterator it2 = arrayList4.iterator();
        while (it2.hasNext()) {
            t95 t95Var = (t95) it2.next();
            List list3 = t95Var.b;
            ArrayList arrayList6 = new ArrayList();
            for (Object obj3 : list3) {
                if (((gvp0) obj3).b) {
                    arrayList6.add(obj3);
                }
            }
            Iterator it3 = arrayList6.iterator();
            while (it3.hasNext()) {
                gvp0 gvp0Var3 = (gvp0) it3.next();
                a2.add(new SortRequestDto(t95Var.a, new SortOptionRequestDto(gvp0Var3.a, gvp0Var3.c)));
            }
            arrayList5.add(zy11.a);
        }
        return new FiltersAndSortingRequestDto(j, a2.j());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.yandex.go.places.impl.data.mappers.organizations.h] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x014b -> B:13:0x0196). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x017f -> B:12:0x0182). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0195 -> B:13:0x0196). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ArrayList arrayList, List list, ContinuationImpl continuationImpl) {
        OrganizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1 organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1;
        int i;
        Iterator it;
        Collection collection;
        Object obj;
        ArrayList arrayList2;
        Collection collection2;
        Iterator it2;
        zx20 zx20Var;
        String str;
        ArrayList arrayList3;
        q qVar;
        ArrayList arrayList4;
        if (continuationImpl instanceof OrganizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1) {
            organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1 = (OrganizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1) continuationImpl;
            int i2 = organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ArrayList arrayList5 = new ArrayList();
                    it = list.iterator();
                    collection = arrayList5;
                    if (it.hasNext()) {
                    }
                } else if (i == 1) {
                    q qVar2 = (q) organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.L$9;
                    Iterator it3 = (Iterator) organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.L$6;
                    Collection collection3 = (Collection) organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.L$4;
                    ?? r7 = (List) organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.L$1;
                    kotlin.b.b(obj2);
                    collection2 = collection3;
                    arrayList4 = r7;
                    qVar = qVar2;
                    it2 = it3;
                    zx20Var = (zx20) obj2;
                    if (zx20Var == null) {
                    }
                } else if (i == 2) {
                    str = (String) organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.L$13;
                    zx20Var = (zx20) organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.L$12;
                    qVar = (q) organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.L$9;
                    it2 = (Iterator) organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.L$6;
                    collection2 = (Collection) organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.L$4;
                    ?? r9 = (List) organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.L$1;
                    kotlin.b.b(obj2);
                    arrayList3 = r9;
                    obj = new ivp0(str, zx20Var, (ypb) obj2, ((ShortcutChipDto$ShortcutModalChipDto) qVar).c.g);
                    arrayList2 = arrayList3;
                    it = it2;
                    collection = collection2;
                    arrayList = arrayList2;
                    if (obj != null) {
                    }
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str2 = (String) organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.L$10;
                    q qVar3 = (q) organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.L$9;
                    it = (Iterator) organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.L$6;
                    collection = (Collection) organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.L$4;
                    List list2 = (List) organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.L$1;
                    kotlin.b.b(obj2);
                    ?? r8 = list2;
                    String str3 = ((ShortcutChipDto$ShortcutFilterChipDto) qVar3).a.b;
                    obj = new hvp0(str2, (ypb) obj2, str3, r8.contains(str3));
                    arrayList = r8;
                    if (obj != null) {
                        collection.add(obj);
                    }
                    if (it.hasNext()) {
                        qVar3 = (q) it.next();
                        if (qVar3 instanceof ShortcutChipDto$ShortcutModalChipDto) {
                            m mVar = ((ShortcutChipDto$ShortcutModalChipDto) qVar3).b;
                            organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.L$0 = null;
                            organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.L$1 = arrayList;
                            organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.L$2 = null;
                            organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.L$3 = null;
                            organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.L$4 = collection;
                            organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.L$5 = null;
                            organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.L$6 = it;
                            organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.L$7 = null;
                            organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.L$8 = null;
                            organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.L$9 = qVar3;
                            organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.L$10 = null;
                            organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.L$11 = null;
                            organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.L$12 = null;
                            organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.L$13 = null;
                            organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.label = 1;
                            obj2 = d(mVar, arrayList, organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1);
                            if (obj2 != coroutineSingletons) {
                                arrayList4 = arrayList;
                                collection2 = collection;
                                it2 = it;
                                qVar = qVar3;
                                zx20Var = (zx20) obj2;
                                if (zx20Var == null) {
                                    ShortcutChipDto$ShortcutModalChipDto shortcutChipDto$ShortcutModalChipDto = (ShortcutChipDto$ShortcutModalChipDto) qVar;
                                    String str4 = shortcutChipDto$ShortcutModalChipDto.a;
                                    ChipAppearanceDto chipAppearanceDto = shortcutChipDto$ShortcutModalChipDto.c;
                                    organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.L$0 = null;
                                    organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.L$1 = arrayList4;
                                    organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.L$2 = null;
                                    organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.L$3 = null;
                                    organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.L$4 = collection2;
                                    organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.L$5 = null;
                                    organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.L$6 = it2;
                                    organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.L$7 = null;
                                    organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.L$8 = null;
                                    organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.L$9 = qVar;
                                    organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.L$10 = null;
                                    organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.L$11 = null;
                                    organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.L$12 = zx20Var;
                                    organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.L$13 = str4;
                                    organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.label = 2;
                                    Object c = c(chipAppearanceDto, organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1);
                                    if (c != coroutineSingletons) {
                                        obj2 = c;
                                        str = str4;
                                        arrayList3 = arrayList4;
                                        obj = new ivp0(str, zx20Var, (ypb) obj2, ((ShortcutChipDto$ShortcutModalChipDto) qVar).c.g);
                                        arrayList2 = arrayList3;
                                        it = it2;
                                        collection = collection2;
                                        arrayList = arrayList2;
                                        if (obj != null) {
                                        }
                                        if (it.hasNext()) {
                                        }
                                    }
                                } else {
                                    obj = null;
                                    arrayList2 = arrayList4;
                                    it = it2;
                                    collection = collection2;
                                    arrayList = arrayList2;
                                    if (obj != null) {
                                    }
                                    if (it.hasNext()) {
                                    }
                                }
                            }
                        } else if (qVar3 instanceof ShortcutChipDto$ShortcutFilterChipDto) {
                            FilterChipDto filterChipDto = ((ShortcutChipDto$ShortcutFilterChipDto) qVar3).a;
                            String str5 = filterChipDto.a;
                            ChipAppearanceDto chipAppearanceDto2 = filterChipDto.c;
                            organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.L$0 = null;
                            organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.L$1 = arrayList;
                            organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.L$2 = null;
                            organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.L$3 = null;
                            organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.L$4 = collection;
                            organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.L$5 = null;
                            organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.L$6 = it;
                            organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.L$7 = null;
                            organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.L$8 = null;
                            organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.L$9 = qVar3;
                            organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.L$10 = str5;
                            organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.L$11 = null;
                            organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.L$12 = null;
                            organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.L$13 = null;
                            organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.label = 3;
                            obj2 = c(chipAppearanceDto2, organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1);
                            if (obj2 != coroutineSingletons) {
                                r8 = arrayList;
                                str2 = str5;
                                String str32 = ((ShortcutChipDto$ShortcutFilterChipDto) qVar3).a.b;
                                obj = new hvp0(str2, (ypb) obj2, str32, r8.contains(str32));
                                arrayList = r8;
                                if (obj != null) {
                                }
                                if (it.hasNext()) {
                                    return (List) collection;
                                }
                            }
                        } else {
                            obj = null;
                            if (obj != null) {
                            }
                            if (it.hasNext()) {
                            }
                        }
                        return coroutineSingletons;
                    }
                }
            }
        }
        organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1 = new OrganizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1(this, continuationImpl);
        Object obj22 = organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = organizationsSearchOptionsMapper$mapShortcutChipDtoToSearchOptionChips$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0063, code lost:
    
        if (r14 == r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ChipAppearanceDto chipAppearanceDto, ContinuationImpl continuationImpl) {
        OrganizationsSearchOptionsMapper$toChipAppearance$1 organizationsSearchOptionsMapper$toChipAppearance$1;
        int i;
        FormattedText formattedText;
        CharSequence charSequence;
        CharSequence charSequence2;
        kdc kdcVar;
        boolean z;
        ChipAppearanceDto chipAppearanceDto2;
        kdc kdcVar2;
        boolean z2;
        String str;
        if (continuationImpl instanceof OrganizationsSearchOptionsMapper$toChipAppearance$1) {
            organizationsSearchOptionsMapper$toChipAppearance$1 = (OrganizationsSearchOptionsMapper$toChipAppearance$1) continuationImpl;
            int i2 = organizationsSearchOptionsMapper$toChipAppearance$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                organizationsSearchOptionsMapper$toChipAppearance$1.label = i2 - Integer.MIN_VALUE;
                OrganizationsSearchOptionsMapper$toChipAppearance$1 organizationsSearchOptionsMapper$toChipAppearance$12 = organizationsSearchOptionsMapper$toChipAppearance$1;
                Object obj = organizationsSearchOptionsMapper$toChipAppearance$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = organizationsSearchOptionsMapper$toChipAppearance$12.label;
                pdc pdcVar = this.c;
                kdc kdcVar3 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    FormattedText formattedText2 = chipAppearanceDto.a;
                    organizationsSearchOptionsMapper$toChipAppearance$12.L$0 = chipAppearanceDto;
                    organizationsSearchOptionsMapper$toChipAppearance$12.label = 1;
                    obj = ru.yandex.taxi.widget.c.e(this.d, formattedText2, null, false, organizationsSearchOptionsMapper$toChipAppearance$12, 30);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z2 = organizationsSearchOptionsMapper$toChipAppearance$12.Z$0;
                        kdcVar2 = (kdc) organizationsSearchOptionsMapper$toChipAppearance$12.L$3;
                        charSequence = (CharSequence) organizationsSearchOptionsMapper$toChipAppearance$12.L$2;
                        chipAppearanceDto2 = (ChipAppearanceDto) organizationsSearchOptionsMapper$toChipAppearance$12.L$0;
                        kotlin.b.b(obj);
                        z = z2;
                        charSequence2 = (CharSequence) obj;
                        chipAppearanceDto = chipAppearanceDto2;
                        kdcVar = kdcVar2;
                        str = chipAppearanceDto.e;
                        if (str != null) {
                            kdcVar3 = ((ufu) pdcVar).d(new bdc(xng0.bgInvert), str);
                        }
                        return new ypb(charSequence, kdcVar, z, charSequence2, kdcVar3, this.a.a(chipAppearanceDto.f));
                    }
                    chipAppearanceDto = (ChipAppearanceDto) organizationsSearchOptionsMapper$toChipAppearance$12.L$0;
                    kotlin.b.b(obj);
                }
                CharSequence charSequence3 = (CharSequence) obj;
                kdc d = ((ufu) pdcVar).d(new bdc(xng0.controlMinor), chipAppearanceDto.b);
                boolean z3 = chipAppearanceDto.c;
                formattedText = chipAppearanceDto.d;
                if (formattedText != null) {
                    charSequence = charSequence3;
                    charSequence2 = null;
                    kdcVar = d;
                    z = z3;
                    str = chipAppearanceDto.e;
                    if (str != null) {
                    }
                    return new ypb(charSequence, kdcVar, z, charSequence2, kdcVar3, this.a.a(chipAppearanceDto.f));
                }
                organizationsSearchOptionsMapper$toChipAppearance$12.L$0 = chipAppearanceDto;
                organizationsSearchOptionsMapper$toChipAppearance$12.L$1 = null;
                organizationsSearchOptionsMapper$toChipAppearance$12.L$2 = charSequence3;
                organizationsSearchOptionsMapper$toChipAppearance$12.L$3 = d;
                organizationsSearchOptionsMapper$toChipAppearance$12.Z$0 = z3;
                organizationsSearchOptionsMapper$toChipAppearance$12.label = 2;
                Object e = ru.yandex.taxi.widget.c.e(this.d, formattedText, null, false, organizationsSearchOptionsMapper$toChipAppearance$12, 30);
                if (e != coroutineSingletons) {
                    charSequence = charSequence3;
                    obj = e;
                    chipAppearanceDto2 = chipAppearanceDto;
                    kdcVar2 = d;
                    z2 = z3;
                    z = z2;
                    charSequence2 = (CharSequence) obj;
                    chipAppearanceDto = chipAppearanceDto2;
                    kdcVar = kdcVar2;
                    str = chipAppearanceDto.e;
                    if (str != null) {
                    }
                    return new ypb(charSequence, kdcVar, z, charSequence2, kdcVar3, this.a.a(chipAppearanceDto.f));
                }
                return coroutineSingletons;
            }
        }
        organizationsSearchOptionsMapper$toChipAppearance$1 = new OrganizationsSearchOptionsMapper$toChipAppearance$1(this, continuationImpl);
        OrganizationsSearchOptionsMapper$toChipAppearance$1 organizationsSearchOptionsMapper$toChipAppearance$122 = organizationsSearchOptionsMapper$toChipAppearance$1;
        Object obj2 = organizationsSearchOptionsMapper$toChipAppearance$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = organizationsSearchOptionsMapper$toChipAppearance$122.label;
        pdc pdcVar2 = this.c;
        kdc kdcVar32 = null;
        if (i != 0) {
        }
        CharSequence charSequence32 = (CharSequence) obj2;
        kdc d2 = ((ufu) pdcVar2).d(new bdc(xng0.controlMinor), chipAppearanceDto.b);
        boolean z32 = chipAppearanceDto.c;
        formattedText = chipAppearanceDto.d;
        if (formattedText != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x02fc, code lost:
    
        if (r2 == r3) goto L69;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r18v0, types: [com.yandex.go.places.impl.data.mappers.organizations.h] */
    /* JADX WARN: Type inference failed for: r5v29, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x034d -> B:15:0x034e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x028c -> B:31:0x029a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0196 -> B:52:0x019b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(m mVar, List list, ContinuationImpl continuationImpl) {
        OrganizationsSearchOptionsMapper$toModalContent$1 organizationsSearchOptionsMapper$toModalContent$1;
        int i;
        String valueOf;
        List list2;
        CharSequence charSequence;
        Collection arrayList;
        String str;
        Iterator it;
        List list3;
        List list4;
        Iterator it2;
        Collection collection;
        List list5;
        String str2;
        OrganizationsSearchOptionsMapper$toModalContent$1 organizationsSearchOptionsMapper$toModalContent$12;
        List list6;
        String str3;
        List list7;
        Collection collection2;
        FilterModalChipBlockDto filterModalChipBlockDto;
        String str4;
        String str5;
        CharSequence charSequence2;
        Iterator it3;
        List list8;
        ArrayList arrayList2;
        Iterator it4;
        Iterator it5;
        Collection collection3;
        String str6;
        List list9;
        CharSequence charSequence3;
        m mVar2 = mVar;
        if (continuationImpl instanceof OrganizationsSearchOptionsMapper$toModalContent$1) {
            organizationsSearchOptionsMapper$toModalContent$1 = (OrganizationsSearchOptionsMapper$toModalContent$1) continuationImpl;
            int i2 = organizationsSearchOptionsMapper$toModalContent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                organizationsSearchOptionsMapper$toModalContent$1.label = i2 - Integer.MIN_VALUE;
                OrganizationsSearchOptionsMapper$toModalContent$1 organizationsSearchOptionsMapper$toModalContent$13 = organizationsSearchOptionsMapper$toModalContent$1;
                Object obj = organizationsSearchOptionsMapper$toModalContent$13.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = organizationsSearchOptionsMapper$toModalContent$13.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (mVar2 instanceof ModalContentDto$FilterModalDto) {
                        ModalContentDto$FilterModalDto modalContentDto$FilterModalDto = (ModalContentDto$FilterModalDto) mVar2;
                        String valueOf2 = String.valueOf(modalContentDto$FilterModalDto.hashCode());
                        List list10 = modalContentDto$FilterModalDto.b;
                        arrayList = new ArrayList(tcc.n(list10, 10));
                        str = valueOf2;
                        it = list10.iterator();
                        list3 = list;
                        if (it.hasNext()) {
                        }
                    } else {
                        if (!(mVar2 instanceof ModalContentDto$SortModalDto)) {
                            return null;
                        }
                        SortModalItemBlockDto sortModalItemBlockDto = ((ModalContentDto$SortModalDto) mVar2).a;
                        valueOf = String.valueOf(sortModalItemBlockDto.hashCode());
                        FormattedText formattedText = sortModalItemBlockDto.a;
                        if (formattedText != null) {
                            organizationsSearchOptionsMapper$toModalContent$13.L$0 = mVar2;
                            list2 = list;
                            organizationsSearchOptionsMapper$toModalContent$13.L$1 = list2;
                            organizationsSearchOptionsMapper$toModalContent$13.L$2 = null;
                            organizationsSearchOptionsMapper$toModalContent$13.L$3 = valueOf;
                            organizationsSearchOptionsMapper$toModalContent$13.label = 4;
                            obj = ru.yandex.taxi.widget.c.e(this.d, formattedText, null, false, organizationsSearchOptionsMapper$toModalContent$13, 30);
                        } else {
                            list2 = list;
                            charSequence = null;
                            List list11 = ((ModalContentDto$SortModalDto) mVar2).a.b;
                            ArrayList arrayList3 = new ArrayList(tcc.n(list11, 10));
                            it5 = list11.iterator();
                            collection3 = arrayList3;
                            str6 = valueOf;
                            list9 = list2;
                            charSequence3 = charSequence;
                            if (it5.hasNext()) {
                            }
                        }
                    }
                } else if (i == 1) {
                    Collection collection4 = (Collection) organizationsSearchOptionsMapper$toModalContent$13.L$9;
                    it = (Iterator) organizationsSearchOptionsMapper$toModalContent$13.L$6;
                    arrayList = (Collection) organizationsSearchOptionsMapper$toModalContent$13.L$5;
                    str = (String) organizationsSearchOptionsMapper$toModalContent$13.L$2;
                    List list12 = (List) organizationsSearchOptionsMapper$toModalContent$13.L$1;
                    m mVar3 = (m) organizationsSearchOptionsMapper$toModalContent$13.L$0;
                    kotlin.b.b(obj);
                    collection4.add((ky6) obj);
                    list3 = list12;
                    mVar2 = mVar3;
                    if (it.hasNext()) {
                        ButtonDto buttonDto = (ButtonDto) it.next();
                        organizationsSearchOptionsMapper$toModalContent$13.L$0 = mVar2;
                        organizationsSearchOptionsMapper$toModalContent$13.L$1 = list3;
                        organizationsSearchOptionsMapper$toModalContent$13.L$2 = str;
                        organizationsSearchOptionsMapper$toModalContent$13.L$3 = null;
                        organizationsSearchOptionsMapper$toModalContent$13.L$4 = null;
                        organizationsSearchOptionsMapper$toModalContent$13.L$5 = arrayList;
                        organizationsSearchOptionsMapper$toModalContent$13.L$6 = it;
                        organizationsSearchOptionsMapper$toModalContent$13.L$7 = null;
                        organizationsSearchOptionsMapper$toModalContent$13.L$8 = null;
                        organizationsSearchOptionsMapper$toModalContent$13.L$9 = arrayList;
                        organizationsSearchOptionsMapper$toModalContent$13.label = 1;
                        Object a = this.b.a(buttonDto, organizationsSearchOptionsMapper$toModalContent$13);
                        if (a != coroutineSingletons) {
                            list12 = list3;
                            obj = a;
                            mVar3 = mVar2;
                            collection4 = arrayList;
                            collection4.add((ky6) obj);
                            list3 = list12;
                            mVar2 = mVar3;
                            if (it.hasNext()) {
                                list4 = (List) arrayList;
                                List list13 = ((ModalContentDto$FilterModalDto) mVar2).a;
                                ArrayList arrayList4 = new ArrayList(tcc.n(list13, 10));
                                String str7 = str;
                                it2 = list13.iterator();
                                collection = arrayList4;
                                list5 = list3;
                                str2 = str7;
                                organizationsSearchOptionsMapper$toModalContent$12 = organizationsSearchOptionsMapper$toModalContent$13;
                                if (it2.hasNext()) {
                                }
                            }
                        }
                        return coroutineSingletons;
                    }
                } else if (i == 2) {
                    collection = (Collection) organizationsSearchOptionsMapper$toModalContent$13.L$12;
                    str4 = (String) organizationsSearchOptionsMapper$toModalContent$13.L$11;
                    filterModalChipBlockDto = (FilterModalChipBlockDto) organizationsSearchOptionsMapper$toModalContent$13.L$9;
                    it2 = (Iterator) organizationsSearchOptionsMapper$toModalContent$13.L$7;
                    collection2 = (Collection) organizationsSearchOptionsMapper$toModalContent$13.L$6;
                    list7 = (List) organizationsSearchOptionsMapper$toModalContent$13.L$3;
                    str3 = (String) organizationsSearchOptionsMapper$toModalContent$13.L$2;
                    list6 = (List) organizationsSearchOptionsMapper$toModalContent$13.L$1;
                    kotlin.b.b(obj);
                    CharSequence charSequence4 = (CharSequence) obj;
                    str5 = str4;
                    FilterModalChipBlockDto filterModalChipBlockDto2 = filterModalChipBlockDto;
                    List list14 = list7;
                    list5 = list6;
                    organizationsSearchOptionsMapper$toModalContent$12 = organizationsSearchOptionsMapper$toModalContent$13;
                    str2 = str3;
                    List list15 = filterModalChipBlockDto2.b;
                    charSequence2 = charSequence4;
                    it3 = it2;
                    list8 = list14;
                    arrayList2 = new ArrayList(tcc.n(list15, 10));
                    it4 = list15.iterator();
                    if (it4.hasNext()) {
                    }
                } else if (i == 3) {
                    Collection collection5 = (Collection) organizationsSearchOptionsMapper$toModalContent$13.L$20;
                    String str8 = (String) organizationsSearchOptionsMapper$toModalContent$13.L$19;
                    ?? r5 = (Collection) organizationsSearchOptionsMapper$toModalContent$13.L$18;
                    FilterChipDto filterChipDto = (FilterChipDto) organizationsSearchOptionsMapper$toModalContent$13.L$17;
                    it4 = (Iterator) organizationsSearchOptionsMapper$toModalContent$13.L$15;
                    CharSequence charSequence5 = (CharSequence) organizationsSearchOptionsMapper$toModalContent$13.L$14;
                    ?? r14 = (Collection) organizationsSearchOptionsMapper$toModalContent$13.L$13;
                    String str9 = (String) organizationsSearchOptionsMapper$toModalContent$13.L$12;
                    Iterator it6 = (Iterator) organizationsSearchOptionsMapper$toModalContent$13.L$7;
                    collection2 = (Collection) organizationsSearchOptionsMapper$toModalContent$13.L$6;
                    List list16 = (List) organizationsSearchOptionsMapper$toModalContent$13.L$3;
                    String str10 = (String) organizationsSearchOptionsMapper$toModalContent$13.L$2;
                    List list17 = (List) organizationsSearchOptionsMapper$toModalContent$13.L$1;
                    kotlin.b.b(obj);
                    collection = collection5;
                    String str11 = str9;
                    CharSequence charSequence6 = charSequence5;
                    OrganizationsSearchOptionsMapper$toModalContent$1 organizationsSearchOptionsMapper$toModalContent$14 = organizationsSearchOptionsMapper$toModalContent$13;
                    it3 = it6;
                    ArrayList arrayList5 = r5;
                    List list18 = list17;
                    ArrayList arrayList6 = r14;
                    arrayList5.add(new c4r(str8, (ypb) obj, list18.contains(filterChipDto.b)));
                    collection = collection;
                    list5 = list18;
                    str2 = str10;
                    list8 = list16;
                    organizationsSearchOptionsMapper$toModalContent$12 = organizationsSearchOptionsMapper$toModalContent$14;
                    arrayList2 = arrayList6;
                    charSequence2 = charSequence6;
                    str5 = str11;
                    if (it4.hasNext()) {
                        filterChipDto = (FilterChipDto) it4.next();
                        String str12 = filterChipDto.b;
                        ChipAppearanceDto chipAppearanceDto = filterChipDto.c;
                        organizationsSearchOptionsMapper$toModalContent$12.L$0 = null;
                        organizationsSearchOptionsMapper$toModalContent$12.L$1 = list5;
                        organizationsSearchOptionsMapper$toModalContent$12.L$2 = str2;
                        organizationsSearchOptionsMapper$toModalContent$12.L$3 = list8;
                        organizationsSearchOptionsMapper$toModalContent$12.L$4 = null;
                        organizationsSearchOptionsMapper$toModalContent$12.L$5 = null;
                        organizationsSearchOptionsMapper$toModalContent$12.L$6 = collection2;
                        organizationsSearchOptionsMapper$toModalContent$12.L$7 = it3;
                        organizationsSearchOptionsMapper$toModalContent$12.L$8 = null;
                        organizationsSearchOptionsMapper$toModalContent$12.L$9 = null;
                        organizationsSearchOptionsMapper$toModalContent$12.L$10 = null;
                        organizationsSearchOptionsMapper$toModalContent$12.L$11 = null;
                        organizationsSearchOptionsMapper$toModalContent$12.L$12 = str5;
                        organizationsSearchOptionsMapper$toModalContent$12.L$13 = arrayList2;
                        organizationsSearchOptionsMapper$toModalContent$12.L$14 = charSequence2;
                        organizationsSearchOptionsMapper$toModalContent$12.L$15 = it4;
                        organizationsSearchOptionsMapper$toModalContent$12.L$16 = null;
                        organizationsSearchOptionsMapper$toModalContent$12.L$17 = filterChipDto;
                        organizationsSearchOptionsMapper$toModalContent$12.L$18 = arrayList2;
                        organizationsSearchOptionsMapper$toModalContent$12.L$19 = str12;
                        organizationsSearchOptionsMapper$toModalContent$12.L$20 = collection;
                        organizationsSearchOptionsMapper$toModalContent$12.label = 3;
                        Object c = c(chipAppearanceDto, organizationsSearchOptionsMapper$toModalContent$12);
                        coroutineSingletons = coroutineSingletons;
                        if (c != coroutineSingletons) {
                            OrganizationsSearchOptionsMapper$toModalContent$1 organizationsSearchOptionsMapper$toModalContent$15 = organizationsSearchOptionsMapper$toModalContent$12;
                            str10 = str2;
                            obj = c;
                            charSequence6 = charSequence2;
                            organizationsSearchOptionsMapper$toModalContent$14 = organizationsSearchOptionsMapper$toModalContent$15;
                            str11 = str5;
                            ArrayList arrayList7 = arrayList2;
                            list18 = list5;
                            str8 = str12;
                            list16 = list8;
                            arrayList5 = arrayList7;
                            arrayList6 = arrayList7;
                            arrayList5.add(new c4r(str8, (ypb) obj, list18.contains(filterChipDto.b)));
                            collection = collection;
                            list5 = list18;
                            str2 = str10;
                            list8 = list16;
                            organizationsSearchOptionsMapper$toModalContent$12 = organizationsSearchOptionsMapper$toModalContent$14;
                            arrayList2 = arrayList6;
                            charSequence2 = charSequence6;
                            str5 = str11;
                            if (it4.hasNext()) {
                                collection.add(new v4r(charSequence2, str5, arrayList2));
                                list4 = list8;
                                collection = collection2;
                                it2 = it3;
                                if (it2.hasNext()) {
                                    return new xx20(str2, (List) collection, list4);
                                }
                                FilterModalChipBlockDto filterModalChipBlockDto3 = (FilterModalChipBlockDto) it2.next();
                                str5 = String.valueOf(filterModalChipBlockDto3.hashCode());
                                FormattedText formattedText2 = filterModalChipBlockDto3.a;
                                if (formattedText2 != null) {
                                    organizationsSearchOptionsMapper$toModalContent$12.L$0 = null;
                                    organizationsSearchOptionsMapper$toModalContent$12.L$1 = list5;
                                    organizationsSearchOptionsMapper$toModalContent$12.L$2 = str2;
                                    organizationsSearchOptionsMapper$toModalContent$12.L$3 = list4;
                                    organizationsSearchOptionsMapper$toModalContent$12.L$4 = null;
                                    organizationsSearchOptionsMapper$toModalContent$12.L$5 = null;
                                    organizationsSearchOptionsMapper$toModalContent$12.L$6 = collection;
                                    organizationsSearchOptionsMapper$toModalContent$12.L$7 = it2;
                                    organizationsSearchOptionsMapper$toModalContent$12.L$8 = null;
                                    organizationsSearchOptionsMapper$toModalContent$12.L$9 = filterModalChipBlockDto3;
                                    organizationsSearchOptionsMapper$toModalContent$12.L$10 = null;
                                    organizationsSearchOptionsMapper$toModalContent$12.L$11 = str5;
                                    organizationsSearchOptionsMapper$toModalContent$12.L$12 = collection;
                                    organizationsSearchOptionsMapper$toModalContent$12.L$13 = null;
                                    organizationsSearchOptionsMapper$toModalContent$12.L$14 = null;
                                    organizationsSearchOptionsMapper$toModalContent$12.L$15 = null;
                                    organizationsSearchOptionsMapper$toModalContent$12.L$16 = null;
                                    organizationsSearchOptionsMapper$toModalContent$12.L$17 = null;
                                    organizationsSearchOptionsMapper$toModalContent$12.L$18 = null;
                                    organizationsSearchOptionsMapper$toModalContent$12.L$19 = null;
                                    organizationsSearchOptionsMapper$toModalContent$12.L$20 = null;
                                    organizationsSearchOptionsMapper$toModalContent$12.label = 2;
                                    Object e = ru.yandex.taxi.widget.c.e(this.d, formattedText2, null, false, organizationsSearchOptionsMapper$toModalContent$12, 30);
                                    if (e != coroutineSingletons) {
                                        str3 = str2;
                                        list7 = list4;
                                        obj = e;
                                        organizationsSearchOptionsMapper$toModalContent$13 = organizationsSearchOptionsMapper$toModalContent$12;
                                        filterModalChipBlockDto = filterModalChipBlockDto3;
                                        collection2 = collection;
                                        list6 = list5;
                                        str4 = str5;
                                        CharSequence charSequence42 = (CharSequence) obj;
                                        str5 = str4;
                                        FilterModalChipBlockDto filterModalChipBlockDto22 = filterModalChipBlockDto;
                                        List list142 = list7;
                                        list5 = list6;
                                        organizationsSearchOptionsMapper$toModalContent$12 = organizationsSearchOptionsMapper$toModalContent$13;
                                        str2 = str3;
                                        List list152 = filterModalChipBlockDto22.b;
                                        charSequence2 = charSequence42;
                                        it3 = it2;
                                        list8 = list142;
                                        arrayList2 = new ArrayList(tcc.n(list152, 10));
                                        it4 = list152.iterator();
                                        if (it4.hasNext()) {
                                        }
                                    }
                                } else {
                                    collection2 = collection;
                                    List list19 = filterModalChipBlockDto3.b;
                                    charSequence2 = null;
                                    it3 = it2;
                                    list8 = list4;
                                    arrayList2 = new ArrayList(tcc.n(list19, 10));
                                    it4 = list19.iterator();
                                    if (it4.hasNext()) {
                                    }
                                }
                            }
                        }
                        return coroutineSingletons;
                    }
                } else if (i == 4) {
                    String str13 = (String) organizationsSearchOptionsMapper$toModalContent$13.L$3;
                    List list20 = (List) organizationsSearchOptionsMapper$toModalContent$13.L$1;
                    m mVar4 = (m) organizationsSearchOptionsMapper$toModalContent$13.L$0;
                    kotlin.b.b(obj);
                    valueOf = str13;
                    list2 = list20;
                    mVar2 = mVar4;
                } else {
                    if (i != 5) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    collection3 = (Collection) organizationsSearchOptionsMapper$toModalContent$13.L$10;
                    charSequence3 = (CharSequence) organizationsSearchOptionsMapper$toModalContent$13.L$9;
                    str6 = (String) organizationsSearchOptionsMapper$toModalContent$13.L$8;
                    it5 = (Iterator) organizationsSearchOptionsMapper$toModalContent$13.L$5;
                    Collection collection6 = (Collection) organizationsSearchOptionsMapper$toModalContent$13.L$4;
                    list9 = (List) organizationsSearchOptionsMapper$toModalContent$13.L$1;
                    kotlin.b.b(obj);
                    collection3.add((c9t0) obj);
                    collection3 = collection6;
                    if (it5.hasNext()) {
                        SortOptionItemDto sortOptionItemDto = (SortOptionItemDto) it5.next();
                        organizationsSearchOptionsMapper$toModalContent$13.L$0 = null;
                        organizationsSearchOptionsMapper$toModalContent$13.L$1 = list9;
                        organizationsSearchOptionsMapper$toModalContent$13.L$2 = null;
                        organizationsSearchOptionsMapper$toModalContent$13.L$3 = null;
                        organizationsSearchOptionsMapper$toModalContent$13.L$4 = collection3;
                        organizationsSearchOptionsMapper$toModalContent$13.L$5 = it5;
                        organizationsSearchOptionsMapper$toModalContent$13.L$6 = null;
                        organizationsSearchOptionsMapper$toModalContent$13.L$7 = null;
                        organizationsSearchOptionsMapper$toModalContent$13.L$8 = str6;
                        organizationsSearchOptionsMapper$toModalContent$13.L$9 = charSequence3;
                        organizationsSearchOptionsMapper$toModalContent$13.L$10 = collection3;
                        organizationsSearchOptionsMapper$toModalContent$13.label = 5;
                        obj = e(sortOptionItemDto, list9, organizationsSearchOptionsMapper$toModalContent$13);
                        if (obj != coroutineSingletons) {
                            collection6 = collection3;
                            collection3.add((c9t0) obj);
                            collection3 = collection6;
                            if (it5.hasNext()) {
                                return new yx20(str6, new zxs0(charSequence3, (List) collection3));
                            }
                        }
                        return coroutineSingletons;
                    }
                }
                charSequence = (CharSequence) obj;
                List list112 = ((ModalContentDto$SortModalDto) mVar2).a.b;
                ArrayList arrayList32 = new ArrayList(tcc.n(list112, 10));
                it5 = list112.iterator();
                collection3 = arrayList32;
                str6 = valueOf;
                list9 = list2;
                charSequence3 = charSequence;
                if (it5.hasNext()) {
                }
            }
        }
        organizationsSearchOptionsMapper$toModalContent$1 = new OrganizationsSearchOptionsMapper$toModalContent$1(this, continuationImpl);
        OrganizationsSearchOptionsMapper$toModalContent$1 organizationsSearchOptionsMapper$toModalContent$132 = organizationsSearchOptionsMapper$toModalContent$1;
        Object obj2 = organizationsSearchOptionsMapper$toModalContent$132.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = organizationsSearchOptionsMapper$toModalContent$132.label;
        if (i != 0) {
        }
        charSequence = (CharSequence) obj2;
        List list1122 = ((ModalContentDto$SortModalDto) mVar2).a.b;
        ArrayList arrayList322 = new ArrayList(tcc.n(list1122, 10));
        it5 = list1122.iterator();
        collection3 = arrayList322;
        str6 = valueOf;
        list9 = list2;
        charSequence3 = charSequence;
        if (it5.hasNext()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(SortOptionItemDto sortOptionItemDto, List list, ContinuationImpl continuationImpl) {
        OrganizationsSearchOptionsMapper$toSortOptionItem$1 organizationsSearchOptionsMapper$toSortOptionItem$1;
        int i;
        Object e;
        SortOptionItemDto sortOptionItemDto2;
        String str;
        List list2;
        CharSequence charSequence;
        FormattedText formattedText;
        SortOptionItemDto sortOptionItemDto3;
        List list3;
        CharSequence charSequence2;
        if (continuationImpl instanceof OrganizationsSearchOptionsMapper$toSortOptionItem$1) {
            organizationsSearchOptionsMapper$toSortOptionItem$1 = (OrganizationsSearchOptionsMapper$toSortOptionItem$1) continuationImpl;
            int i2 = organizationsSearchOptionsMapper$toSortOptionItem$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                organizationsSearchOptionsMapper$toSortOptionItem$1.label = i2 - Integer.MIN_VALUE;
                OrganizationsSearchOptionsMapper$toSortOptionItem$1 organizationsSearchOptionsMapper$toSortOptionItem$12 = organizationsSearchOptionsMapper$toSortOptionItem$1;
                Object obj = organizationsSearchOptionsMapper$toSortOptionItem$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = organizationsSearchOptionsMapper$toSortOptionItem$12.label;
                CharSequence charSequence3 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str2 = sortOptionItemDto.a;
                    FormattedText formattedText2 = sortOptionItemDto.b.a;
                    organizationsSearchOptionsMapper$toSortOptionItem$12.L$0 = sortOptionItemDto;
                    organizationsSearchOptionsMapper$toSortOptionItem$12.L$1 = list;
                    organizationsSearchOptionsMapper$toSortOptionItem$12.L$2 = str2;
                    organizationsSearchOptionsMapper$toSortOptionItem$12.label = 1;
                    e = ru.yandex.taxi.widget.c.e(this.d, formattedText2, null, false, organizationsSearchOptionsMapper$toSortOptionItem$12, 30);
                    if (e != coroutineSingletons) {
                        sortOptionItemDto2 = sortOptionItemDto;
                        str = str2;
                        list2 = list;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    charSequence2 = (CharSequence) organizationsSearchOptionsMapper$toSortOptionItem$12.L$4;
                    str = (String) organizationsSearchOptionsMapper$toSortOptionItem$12.L$3;
                    list3 = (List) organizationsSearchOptionsMapper$toSortOptionItem$12.L$1;
                    sortOptionItemDto3 = (SortOptionItemDto) organizationsSearchOptionsMapper$toSortOptionItem$12.L$0;
                    kotlin.b.b(obj);
                    charSequence3 = (CharSequence) obj;
                    charSequence = charSequence2;
                    list2 = list3;
                    sortOptionItemDto2 = sortOptionItemDto3;
                    return new c9t0(charSequence, charSequence3, str, list2.contains(sortOptionItemDto2.a));
                }
                str = (String) organizationsSearchOptionsMapper$toSortOptionItem$12.L$2;
                List list4 = (List) organizationsSearchOptionsMapper$toSortOptionItem$12.L$1;
                SortOptionItemDto sortOptionItemDto4 = (SortOptionItemDto) organizationsSearchOptionsMapper$toSortOptionItem$12.L$0;
                kotlin.b.b(obj);
                list2 = list4;
                sortOptionItemDto2 = sortOptionItemDto4;
                e = obj;
                charSequence = (CharSequence) e;
                formattedText = sortOptionItemDto2.b.b;
                if (formattedText != null) {
                    organizationsSearchOptionsMapper$toSortOptionItem$12.L$0 = sortOptionItemDto2;
                    organizationsSearchOptionsMapper$toSortOptionItem$12.L$1 = list2;
                    organizationsSearchOptionsMapper$toSortOptionItem$12.L$2 = null;
                    organizationsSearchOptionsMapper$toSortOptionItem$12.L$3 = str;
                    organizationsSearchOptionsMapper$toSortOptionItem$12.L$4 = charSequence;
                    organizationsSearchOptionsMapper$toSortOptionItem$12.label = 2;
                    Object e2 = ru.yandex.taxi.widget.c.e(this.d, formattedText, null, false, organizationsSearchOptionsMapper$toSortOptionItem$12, 30);
                    if (e2 != coroutineSingletons) {
                        sortOptionItemDto3 = sortOptionItemDto2;
                        list3 = list2;
                        obj = e2;
                        charSequence2 = charSequence;
                        charSequence3 = (CharSequence) obj;
                        charSequence = charSequence2;
                        list2 = list3;
                        sortOptionItemDto2 = sortOptionItemDto3;
                    }
                    return coroutineSingletons;
                }
                return new c9t0(charSequence, charSequence3, str, list2.contains(sortOptionItemDto2.a));
            }
        }
        organizationsSearchOptionsMapper$toSortOptionItem$1 = new OrganizationsSearchOptionsMapper$toSortOptionItem$1(this, continuationImpl);
        OrganizationsSearchOptionsMapper$toSortOptionItem$1 organizationsSearchOptionsMapper$toSortOptionItem$122 = organizationsSearchOptionsMapper$toSortOptionItem$1;
        Object obj2 = organizationsSearchOptionsMapper$toSortOptionItem$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = organizationsSearchOptionsMapper$toSortOptionItem$122.label;
        CharSequence charSequence32 = null;
        if (i != 0) {
        }
        charSequence = (CharSequence) e;
        formattedText = sortOptionItemDto2.b.b;
        if (formattedText != null) {
        }
        return new c9t0(charSequence, charSequence32, str, list2.contains(sortOptionItemDto2.a));
    }
}
