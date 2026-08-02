package com.yandex.go.chargers.domain.mapper;

import com.yandex.go.chargers.data.model.ChargersActionAttributeDto;
import com.yandex.go.chargers.data.model.ChargersActionAttributeDto$Action$ShowPopupById;
import com.yandex.go.chargers.data.model.f;
import com.yandex.go.chargers.data.model.h;
import com.yandex.go.chargers.data.model.i;
import com.yandex.go.chargers.data.model.j;
import defpackage.bdc;
import defpackage.hwa;
import defpackage.jl40;
import defpackage.kdc;
import defpackage.ny61;
import defpackage.oma;
import defpackage.pdc;
import defpackage.qo9;
import defpackage.ro9;
import defpackage.so9;
import defpackage.tcc;
import defpackage.tj9;
import defpackage.ufu;
import defpackage.uj9;
import defpackage.w511;
import defpackage.xng0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.c;

/* loaded from: classes12.dex */
public final class b {
    public final pdc a;
    public final c b;

    public b(pdc pdcVar, c cVar) {
        this.a = pdcVar;
        this.b = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [oma] */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1, types: [kdc] */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00bd -> B:10:0x00c2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(List list, hwa hwaVar, oma omaVar, List list2, ContinuationImpl continuationImpl) {
        ChargersBadgeMapper$map$1 chargersBadgeMapper$map$1;
        int i;
        Iterator it;
        ChargersBadgeMapper$map$1 chargersBadgeMapper$map$12;
        ArrayList arrayList;
        hwa hwaVar2;
        oma omaVar2;
        List list3;
        Map map;
        ?? r12;
        Object obj;
        if (continuationImpl instanceof ChargersBadgeMapper$map$1) {
            chargersBadgeMapper$map$1 = (ChargersBadgeMapper$map$1) continuationImpl;
            int i2 = chargersBadgeMapper$map$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersBadgeMapper$map$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = chargersBadgeMapper$map$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersBadgeMapper$map$1.label;
                int i3 = 1;
                Map map2 = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (list != null) {
                        List list4 = list;
                        ArrayList arrayList2 = new ArrayList(tcc.n(list4, 10));
                        it = list4.iterator();
                        chargersBadgeMapper$map$12 = chargersBadgeMapper$map$1;
                        arrayList = arrayList2;
                        hwaVar2 = hwaVar;
                        omaVar2 = omaVar;
                        list3 = list2;
                        if (it.hasNext()) {
                        }
                    }
                    return EmptyList.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ?? r4 = (Collection) chargersBadgeMapper$map$1.L$11;
                String str = (String) chargersBadgeMapper$map$1.L$10;
                ChargersActionAttributeDto chargersActionAttributeDto = (ChargersActionAttributeDto) chargersBadgeMapper$map$1.L$9;
                Iterator it2 = (Iterator) chargersBadgeMapper$map$1.L$7;
                ?? r10 = (Collection) chargersBadgeMapper$map$1.L$6;
                List list5 = (List) chargersBadgeMapper$map$1.L$3;
                oma omaVar3 = (oma) chargersBadgeMapper$map$1.L$2;
                hwa hwaVar3 = (hwa) chargersBadgeMapper$map$1.L$1;
                kotlin.b.b(obj2);
                arrayList = r4;
                list3 = list5;
                Iterator it3 = it2;
                ArrayList arrayList3 = r10;
                ChargersActionAttributeDto chargersActionAttributeDto2 = chargersActionAttributeDto;
                String str2 = str;
                chargersBadgeMapper$map$12 = chargersBadgeMapper$map$1;
                omaVar2 = omaVar3;
                CharSequence charSequence = (CharSequence) obj2;
                String str3 = chargersActionAttributeDto2.c;
                bdc bdcVar = new bdc(xng0.bgMinor);
                ufu ufuVar = (ufu) this.a;
                kdc a = ufuVar.a(bdcVar, str3);
                String str4 = chargersActionAttributeDto2.d;
                ?? a2 = str4 == null ? ufuVar.a(new bdc(xng0.bgMinor), str4) : map2;
                j jVar = chargersActionAttributeDto2.e;
                boolean z = jVar instanceof f;
                uj9 uj9Var = tj9.a;
                if (z) {
                    if (omaVar2 != null) {
                        uj9Var = new so9(omaVar2);
                    }
                    map = map2;
                } else if (jVar instanceof ChargersActionAttributeDto$Action$ShowPopupById) {
                    if (list3 != null) {
                        Iterator it4 = list3.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                map = map2;
                                obj = map;
                                break;
                            }
                            obj = it4.next();
                            map = map2;
                            if (jl40.l(((oma) obj).a, ((ChargersActionAttributeDto$Action$ShowPopupById) jVar).a)) {
                                break;
                            }
                            map2 = map;
                        }
                        r12 = (oma) obj;
                    } else {
                        map = map2;
                        r12 = map;
                    }
                    if (r12 != 0) {
                        uj9Var = new so9(r12);
                    }
                } else {
                    map = map2;
                    if (jVar instanceof h) {
                        if (hwaVar3 != null) {
                            uj9Var = new ro9(hwaVar3);
                        }
                    } else if (!(jVar instanceof i) && jVar != null) {
                        w511.b();
                        return map;
                    }
                }
                arrayList.add(new qo9(str2, charSequence, a, a2, uj9Var));
                arrayList = arrayList3;
                it = it3;
                hwaVar2 = hwaVar3;
                map2 = map;
                i3 = 1;
                if (it.hasNext()) {
                    chargersActionAttributeDto2 = (ChargersActionAttributeDto) it.next();
                    String str5 = chargersActionAttributeDto2.a;
                    FormattedText formattedText = chargersActionAttributeDto2.b;
                    chargersBadgeMapper$map$12.L$0 = map2;
                    chargersBadgeMapper$map$12.L$1 = hwaVar2;
                    chargersBadgeMapper$map$12.L$2 = omaVar2;
                    chargersBadgeMapper$map$12.L$3 = list3;
                    chargersBadgeMapper$map$12.L$4 = map2;
                    chargersBadgeMapper$map$12.L$5 = map2;
                    chargersBadgeMapper$map$12.L$6 = arrayList;
                    chargersBadgeMapper$map$12.L$7 = it;
                    chargersBadgeMapper$map$12.L$8 = map2;
                    chargersBadgeMapper$map$12.L$9 = chargersActionAttributeDto2;
                    chargersBadgeMapper$map$12.L$10 = str5;
                    chargersBadgeMapper$map$12.L$11 = arrayList;
                    chargersBadgeMapper$map$12.label = i3;
                    Object i4 = c.i(this.b, formattedText, map2, chargersBadgeMapper$map$12, 30);
                    if (i4 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    hwaVar3 = hwaVar2;
                    str2 = str5;
                    obj2 = i4;
                    it3 = it;
                    arrayList3 = arrayList;
                    CharSequence charSequence2 = (CharSequence) obj2;
                    String str32 = chargersActionAttributeDto2.c;
                    bdc bdcVar2 = new bdc(xng0.bgMinor);
                    ufu ufuVar2 = (ufu) this.a;
                    kdc a3 = ufuVar2.a(bdcVar2, str32);
                    String str42 = chargersActionAttributeDto2.d;
                    if (str42 == null) {
                    }
                    j jVar2 = chargersActionAttributeDto2.e;
                    boolean z2 = jVar2 instanceof f;
                    uj9 uj9Var2 = tj9.a;
                    if (z2) {
                    }
                    arrayList.add(new qo9(str2, charSequence2, a3, a2, uj9Var2));
                    arrayList = arrayList3;
                    it = it3;
                    hwaVar2 = hwaVar3;
                    map2 = map;
                    i3 = 1;
                    if (it.hasNext()) {
                        ArrayList arrayList4 = arrayList;
                        if (arrayList4 != null) {
                            return arrayList4;
                        }
                        return EmptyList.a;
                    }
                }
            }
        }
        chargersBadgeMapper$map$1 = new ChargersBadgeMapper$map$1(this, continuationImpl);
        Object obj22 = chargersBadgeMapper$map$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersBadgeMapper$map$1.label;
        int i32 = 1;
        Map map22 = null;
        if (i != 0) {
        }
    }
}
