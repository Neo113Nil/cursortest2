package com.yandex.go.chargers.tariff_item_info;

import com.yandex.go.chargers.tariff_item_info.api.data.model.ChargersTariffBlockDto;
import com.yandex.go.chargers.tariff_item_info.api.data.model.ChargersTariffDetailHeaderDto;
import com.yandex.go.chargers.tariff_item_info.api.data.model.ChargersTariffDetailItemDto;
import com.yandex.go.chargers.tariff_item_info.api.data.model.ChargersTariffDto;
import defpackage.axa;
import defpackage.bvf0;
import defpackage.bxa;
import defpackage.cxa;
import defpackage.dxa;
import defpackage.exa;
import defpackage.fxa;
import defpackage.hwa;
import defpackage.iya;
import defpackage.jl40;
import defpackage.jya;
import defpackage.ny61;
import defpackage.scc;
import defpackage.tcc;
import defpackage.twa;
import defpackage.uwa;
import defpackage.vwa;
import defpackage.w511;
import defpackage.wwa;
import defpackage.ywa;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.c;

/* loaded from: classes12.dex */
public final class b implements iya {
    public final c a;
    public final com.yandex.go.chargers.domain.mapper.a b;

    public b(c cVar, com.yandex.go.chargers.domain.mapper.a aVar) {
        this.a = cVar;
        this.b = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02c9  */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r15v9, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v92, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r34v0, types: [com.yandex.go.chargers.tariff_item_info.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0514 -> B:12:0x0526). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0543 -> B:13:0x053a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x026a -> B:79:0x05d4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, List list, hwa hwaVar, ContinuationImpl continuationImpl) {
        ChargersTariffsMapperImpl$toDomain$1 chargersTariffsMapperImpl$toDomain$1;
        ArrayList arrayList;
        ChargersTariffsMapperImpl$toDomain$1 chargersTariffsMapperImpl$toDomain$12;
        Iterator it;
        hwa hwaVar2;
        ChargersTariffBlockDto chargersTariffBlockDto;
        Iterator it2;
        hwa hwaVar3;
        Map map;
        ChargersTariffDetailHeaderDto chargersTariffDetailHeaderDto;
        Object obj;
        ArrayList arrayList2;
        Iterator it3;
        ChargersTariffBlockDto chargersTariffBlockDto2;
        CharSequence charSequence;
        Object obj2;
        int i;
        hwa hwaVar4;
        String str;
        Iterator it4;
        ChargersTariffDetailItemDto chargersTariffDetailItemDto;
        uwa uwaVar;
        Collection collection;
        ArrayList arrayList3;
        Object obj3;
        Map map2;
        Iterator it5;
        ChargersTariffBlockDto chargersTariffBlockDto3;
        Collection collection2;
        int i2;
        CharSequence charSequence2;
        Iterator it6;
        int i3;
        hwa hwaVar5;
        CoroutineSingletons coroutineSingletons;
        Object obj4;
        Object obj5;
        CharSequence charSequence3;
        String str2;
        Collection collection3;
        uwa uwaVar2;
        ChargersTariffsMapperImpl$toDomain$1 chargersTariffsMapperImpl$toDomain$13;
        CoroutineSingletons coroutineSingletons2;
        ChargersTariffBlockDto chargersTariffBlockDto4;
        Object obj6;
        Collection collection4;
        Iterator it7;
        ArrayList arrayList4;
        Iterator it8;
        ChargersTariffDetailItemDto chargersTariffDetailItemDto2;
        hwa hwaVar6;
        CharSequence charSequence4;
        ChargersTariffBlockDto chargersTariffBlockDto5;
        CharSequence charSequence5;
        uwa uwaVar3;
        Collection arrayList5;
        Iterator it9;
        ArrayList arrayList6;
        FormattedText formattedText;
        c cVar;
        CoroutineSingletons coroutineSingletons3;
        twa twaVar;
        CoroutineSingletons coroutineSingletons4;
        c cVar2;
        ArrayList arrayList7;
        ChargersTariffBlockDto chargersTariffBlockDto6;
        Collection collection5;
        Iterator it10;
        ChargersTariffDetailItemDto chargersTariffDetailItemDto3;
        CharSequence charSequence6;
        Collection collection6;
        String str3;
        uwa uwaVar4;
        Iterator it11;
        Object obj7;
        CharSequence charSequence7;
        int i4;
        cxa cxaVar;
        fxa fxaVar;
        ChargersTariffDetailItemDto.Hint hint;
        CoroutineSingletons coroutineSingletons5;
        CharSequence charSequence8;
        ?? r26;
        int i5;
        int i6;
        fxa fxaVar2;
        vwa vwaVar;
        Object c;
        Object obj8;
        int i7;
        int i8;
        Iterator it12;
        CharSequence charSequence9;
        fxa fxaVar3;
        hwa hwaVar7;
        Object obj9;
        Iterator it13;
        CoroutineSingletons coroutineSingletons6;
        ArrayList arrayList8;
        ChargersTariffDetailItemDto chargersTariffDetailItemDto4;
        FormattedText formattedText2;
        ArrayList arrayList9;
        FormattedText formattedText3;
        ArrayList arrayList10;
        int i9;
        int i10;
        ArrayList arrayList11;
        bVar.getClass();
        c cVar3 = bVar.a;
        if (continuationImpl instanceof ChargersTariffsMapperImpl$toDomain$1) {
            chargersTariffsMapperImpl$toDomain$1 = (ChargersTariffsMapperImpl$toDomain$1) continuationImpl;
            int i11 = chargersTariffsMapperImpl$toDomain$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                chargersTariffsMapperImpl$toDomain$1.label = i11 - Integer.MIN_VALUE;
                Object obj10 = chargersTariffsMapperImpl$toDomain$1.result;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (chargersTariffsMapperImpl$toDomain$1.label) {
                    case 0:
                        kotlin.b.b(obj10);
                        arrayList = new ArrayList();
                        chargersTariffsMapperImpl$toDomain$12 = chargersTariffsMapperImpl$toDomain$1;
                        it = list.iterator();
                        hwaVar2 = hwaVar;
                        if (it.hasNext()) {
                            chargersTariffBlockDto5 = (ChargersTariffBlockDto) it.next();
                            if (chargersTariffBlockDto5.b.isEmpty()) {
                                cVar = cVar3;
                                coroutineSingletons3 = coroutineSingletons7;
                                twaVar = null;
                                if (twaVar != null) {
                                }
                                coroutineSingletons7 = coroutineSingletons3;
                                cVar3 = cVar;
                                if (it.hasNext()) {
                                }
                            } else {
                                chargersTariffDetailHeaderDto = chargersTariffBlockDto5.a;
                                if (chargersTariffDetailHeaderDto != null) {
                                    FormattedText formattedText4 = chargersTariffDetailHeaderDto.a;
                                    map = null;
                                    chargersTariffsMapperImpl$toDomain$12.L$0 = null;
                                    chargersTariffsMapperImpl$toDomain$12.L$1 = hwaVar2;
                                    chargersTariffsMapperImpl$toDomain$12.L$2 = null;
                                    chargersTariffsMapperImpl$toDomain$12.L$3 = null;
                                    chargersTariffsMapperImpl$toDomain$12.L$4 = arrayList;
                                    chargersTariffsMapperImpl$toDomain$12.L$5 = null;
                                    chargersTariffsMapperImpl$toDomain$12.L$6 = it;
                                    chargersTariffsMapperImpl$toDomain$12.L$7 = null;
                                    chargersTariffsMapperImpl$toDomain$12.L$8 = null;
                                    chargersTariffsMapperImpl$toDomain$12.L$9 = chargersTariffBlockDto5;
                                    chargersTariffsMapperImpl$toDomain$12.L$10 = chargersTariffDetailHeaderDto;
                                    chargersTariffsMapperImpl$toDomain$12.L$11 = null;
                                    chargersTariffsMapperImpl$toDomain$12.L$12 = null;
                                    chargersTariffsMapperImpl$toDomain$12.L$13 = null;
                                    chargersTariffsMapperImpl$toDomain$12.L$14 = null;
                                    chargersTariffsMapperImpl$toDomain$12.L$15 = null;
                                    chargersTariffsMapperImpl$toDomain$12.L$16 = null;
                                    chargersTariffsMapperImpl$toDomain$12.L$17 = null;
                                    chargersTariffsMapperImpl$toDomain$12.L$18 = null;
                                    chargersTariffsMapperImpl$toDomain$12.L$19 = null;
                                    chargersTariffsMapperImpl$toDomain$12.L$20 = null;
                                    chargersTariffsMapperImpl$toDomain$12.L$21 = null;
                                    chargersTariffsMapperImpl$toDomain$12.L$22 = null;
                                    chargersTariffsMapperImpl$toDomain$12.label = 1;
                                    Object i12 = c.i(cVar3, formattedText4, null, chargersTariffsMapperImpl$toDomain$12, 30);
                                    if (i12 != coroutineSingletons7) {
                                        hwaVar3 = hwaVar2;
                                        obj = i12;
                                        ArrayList arrayList12 = arrayList;
                                        it2 = it;
                                        chargersTariffsMapperImpl$toDomain$1 = chargersTariffsMapperImpl$toDomain$12;
                                        chargersTariffBlockDto = chargersTariffBlockDto5;
                                        arrayList6 = arrayList12;
                                        charSequence5 = (CharSequence) obj;
                                        formattedText = chargersTariffDetailHeaderDto.b;
                                        if (formattedText == null) {
                                            chargersTariffsMapperImpl$toDomain$1.L$0 = map;
                                            chargersTariffsMapperImpl$toDomain$1.L$1 = hwaVar3;
                                            chargersTariffsMapperImpl$toDomain$1.L$2 = map;
                                            chargersTariffsMapperImpl$toDomain$1.L$3 = map;
                                            chargersTariffsMapperImpl$toDomain$1.L$4 = arrayList6;
                                            chargersTariffsMapperImpl$toDomain$1.L$5 = map;
                                            chargersTariffsMapperImpl$toDomain$1.L$6 = it2;
                                            chargersTariffsMapperImpl$toDomain$1.L$7 = map;
                                            chargersTariffsMapperImpl$toDomain$1.L$8 = map;
                                            chargersTariffsMapperImpl$toDomain$1.L$9 = chargersTariffBlockDto;
                                            chargersTariffsMapperImpl$toDomain$1.L$10 = map;
                                            chargersTariffsMapperImpl$toDomain$1.L$11 = charSequence5;
                                            chargersTariffsMapperImpl$toDomain$1.L$12 = map;
                                            chargersTariffsMapperImpl$toDomain$1.label = 2;
                                            Object i13 = c.i(cVar3, formattedText, map, chargersTariffsMapperImpl$toDomain$1, 30);
                                            if (i13 != coroutineSingletons7) {
                                                ChargersTariffsMapperImpl$toDomain$1 chargersTariffsMapperImpl$toDomain$14 = chargersTariffsMapperImpl$toDomain$1;
                                                charSequence = charSequence5;
                                                obj2 = i13;
                                                arrayList2 = arrayList6;
                                                it3 = it2;
                                                chargersTariffBlockDto2 = chargersTariffBlockDto;
                                                chargersTariffsMapperImpl$toDomain$12 = chargersTariffsMapperImpl$toDomain$14;
                                                ArrayList arrayList13 = arrayList2;
                                                charSequence4 = (CharSequence) obj2;
                                                charSequence5 = charSequence;
                                                it = it3;
                                                chargersTariffBlockDto5 = chargersTariffBlockDto2;
                                                arrayList = arrayList13;
                                                uwaVar3 = new uwa(charSequence5, charSequence4);
                                                hwaVar2 = hwaVar3;
                                                List list2 = chargersTariffBlockDto5.b;
                                                arrayList5 = new ArrayList(tcc.n(list2, 10));
                                                it9 = list2.iterator();
                                                i2 = 0;
                                                if (!it9.hasNext()) {
                                                    Object next = it9.next();
                                                    int i14 = i2 + 1;
                                                    if (i2 < 0) {
                                                        scc.m();
                                                        throw null;
                                                    }
                                                    ChargersTariffDetailItemDto chargersTariffDetailItemDto5 = (ChargersTariffDetailItemDto) next;
                                                    String str4 = chargersTariffDetailItemDto5.a;
                                                    FormattedText formattedText5 = chargersTariffDetailItemDto5.b;
                                                    map2 = null;
                                                    chargersTariffsMapperImpl$toDomain$12.L$0 = null;
                                                    chargersTariffsMapperImpl$toDomain$12.L$1 = hwaVar2;
                                                    chargersTariffsMapperImpl$toDomain$12.L$2 = null;
                                                    chargersTariffsMapperImpl$toDomain$12.L$3 = null;
                                                    chargersTariffsMapperImpl$toDomain$12.L$4 = arrayList;
                                                    chargersTariffsMapperImpl$toDomain$12.L$5 = null;
                                                    chargersTariffsMapperImpl$toDomain$12.L$6 = it;
                                                    chargersTariffsMapperImpl$toDomain$12.L$7 = null;
                                                    chargersTariffsMapperImpl$toDomain$12.L$8 = null;
                                                    chargersTariffsMapperImpl$toDomain$12.L$9 = chargersTariffBlockDto5;
                                                    chargersTariffsMapperImpl$toDomain$12.L$10 = null;
                                                    chargersTariffsMapperImpl$toDomain$12.L$11 = null;
                                                    chargersTariffsMapperImpl$toDomain$12.L$12 = arrayList5;
                                                    chargersTariffsMapperImpl$toDomain$12.L$13 = it9;
                                                    chargersTariffsMapperImpl$toDomain$12.L$14 = null;
                                                    chargersTariffsMapperImpl$toDomain$12.L$15 = chargersTariffDetailItemDto5;
                                                    chargersTariffsMapperImpl$toDomain$12.L$16 = uwaVar3;
                                                    chargersTariffsMapperImpl$toDomain$12.L$17 = arrayList5;
                                                    chargersTariffsMapperImpl$toDomain$12.L$18 = str4;
                                                    chargersTariffsMapperImpl$toDomain$12.L$19 = null;
                                                    chargersTariffsMapperImpl$toDomain$12.L$20 = null;
                                                    chargersTariffsMapperImpl$toDomain$12.L$21 = null;
                                                    chargersTariffsMapperImpl$toDomain$12.L$22 = null;
                                                    chargersTariffsMapperImpl$toDomain$12.I$0 = i14;
                                                    chargersTariffsMapperImpl$toDomain$12.I$1 = i2;
                                                    hwa hwaVar8 = hwaVar2;
                                                    chargersTariffsMapperImpl$toDomain$12.label = 3;
                                                    Object i15 = c.i(cVar3, formattedText5, null, chargersTariffsMapperImpl$toDomain$12, 30);
                                                    if (i15 != coroutineSingletons7) {
                                                        it5 = it;
                                                        chargersTariffsMapperImpl$toDomain$1 = chargersTariffsMapperImpl$toDomain$12;
                                                        i = i14;
                                                        chargersTariffBlockDto3 = chargersTariffBlockDto5;
                                                        str = str4;
                                                        arrayList3 = arrayList;
                                                        it4 = it9;
                                                        collection = arrayList5;
                                                        obj3 = i15;
                                                        hwaVar4 = hwaVar8;
                                                        uwaVar = uwaVar3;
                                                        chargersTariffDetailItemDto = chargersTariffDetailItemDto5;
                                                        collection2 = collection;
                                                        CharSequence charSequence10 = (CharSequence) obj3;
                                                        coroutineSingletons6 = coroutineSingletons7;
                                                        formattedText3 = chargersTariffDetailItemDto.c;
                                                        if (formattedText3 == null) {
                                                            chargersTariffsMapperImpl$toDomain$1.L$0 = map2;
                                                            chargersTariffsMapperImpl$toDomain$1.L$1 = hwaVar4;
                                                            chargersTariffsMapperImpl$toDomain$1.L$2 = map2;
                                                            chargersTariffsMapperImpl$toDomain$1.L$3 = map2;
                                                            hwaVar5 = hwaVar4;
                                                            ArrayList arrayList14 = arrayList3;
                                                            chargersTariffsMapperImpl$toDomain$1.L$4 = arrayList14;
                                                            chargersTariffsMapperImpl$toDomain$1.L$5 = map2;
                                                            chargersTariffsMapperImpl$toDomain$1.L$6 = it5;
                                                            chargersTariffsMapperImpl$toDomain$1.L$7 = map2;
                                                            chargersTariffsMapperImpl$toDomain$1.L$8 = map2;
                                                            chargersTariffsMapperImpl$toDomain$1.L$9 = chargersTariffBlockDto3;
                                                            chargersTariffsMapperImpl$toDomain$1.L$10 = map2;
                                                            chargersTariffsMapperImpl$toDomain$1.L$11 = map2;
                                                            chargersTariffsMapperImpl$toDomain$1.L$12 = collection2;
                                                            chargersTariffsMapperImpl$toDomain$1.L$13 = it4;
                                                            chargersTariffsMapperImpl$toDomain$1.L$14 = map2;
                                                            chargersTariffsMapperImpl$toDomain$1.L$15 = chargersTariffDetailItemDto;
                                                            chargersTariffsMapperImpl$toDomain$1.L$16 = uwaVar;
                                                            chargersTariffsMapperImpl$toDomain$1.L$17 = collection;
                                                            chargersTariffsMapperImpl$toDomain$1.L$18 = str;
                                                            chargersTariffsMapperImpl$toDomain$1.L$19 = charSequence10;
                                                            chargersTariffsMapperImpl$toDomain$1.L$20 = map2;
                                                            chargersTariffsMapperImpl$toDomain$1.I$0 = i;
                                                            chargersTariffsMapperImpl$toDomain$1.I$1 = i2;
                                                            chargersTariffsMapperImpl$toDomain$1.label = 4;
                                                            obj4 = c.i(cVar3, formattedText3, map2, chargersTariffsMapperImpl$toDomain$1, 30);
                                                            coroutineSingletons = coroutineSingletons6;
                                                            if (obj4 == coroutineSingletons) {
                                                                return coroutineSingletons;
                                                            }
                                                            i3 = i2;
                                                            it6 = it4;
                                                            charSequence2 = charSequence10;
                                                            arrayList9 = arrayList14;
                                                            String str5 = str;
                                                            charSequence3 = charSequence2;
                                                            chargersTariffDetailItemDto4 = chargersTariffDetailItemDto;
                                                            uwaVar2 = uwaVar;
                                                            collection3 = collection;
                                                            str2 = str5;
                                                            coroutineSingletons6 = coroutineSingletons;
                                                            obj9 = (CharSequence) obj4;
                                                            it13 = it5;
                                                            chargersTariffBlockDto6 = chargersTariffBlockDto3;
                                                            collection5 = collection2;
                                                            it10 = it6;
                                                            i2 = i3;
                                                            arrayList8 = arrayList9;
                                                            chargersTariffsMapperImpl$toDomain$13 = chargersTariffsMapperImpl$toDomain$1;
                                                            hwa hwaVar9 = hwaVar5;
                                                            formattedText2 = chargersTariffDetailItemDto4.d;
                                                            if (formattedText2 != null) {
                                                                chargersTariffsMapperImpl$toDomain$13.L$0 = map2;
                                                                chargersTariffsMapperImpl$toDomain$13.L$1 = hwaVar9;
                                                                chargersTariffsMapperImpl$toDomain$13.L$2 = map2;
                                                                chargersTariffsMapperImpl$toDomain$13.L$3 = map2;
                                                                chargersTariffsMapperImpl$toDomain$13.L$4 = arrayList8;
                                                                chargersTariffsMapperImpl$toDomain$13.L$5 = map2;
                                                                hwaVar6 = hwaVar9;
                                                                Iterator it14 = it13;
                                                                chargersTariffsMapperImpl$toDomain$13.L$6 = it14;
                                                                chargersTariffsMapperImpl$toDomain$13.L$7 = map2;
                                                                chargersTariffsMapperImpl$toDomain$13.L$8 = map2;
                                                                chargersTariffsMapperImpl$toDomain$13.L$9 = chargersTariffBlockDto6;
                                                                chargersTariffsMapperImpl$toDomain$13.L$10 = map2;
                                                                chargersTariffsMapperImpl$toDomain$13.L$11 = map2;
                                                                chargersTariffsMapperImpl$toDomain$13.L$12 = collection5;
                                                                chargersTariffsMapperImpl$toDomain$13.L$13 = it10;
                                                                chargersTariffsMapperImpl$toDomain$13.L$14 = map2;
                                                                chargersTariffsMapperImpl$toDomain$13.L$15 = chargersTariffDetailItemDto4;
                                                                chargersTariffsMapperImpl$toDomain$13.L$16 = uwaVar2;
                                                                chargersTariffsMapperImpl$toDomain$13.L$17 = collection3;
                                                                chargersTariffsMapperImpl$toDomain$13.L$18 = str2;
                                                                chargersTariffsMapperImpl$toDomain$13.L$19 = charSequence3;
                                                                chargersTariffsMapperImpl$toDomain$13.L$20 = map2;
                                                                Object obj11 = obj9;
                                                                chargersTariffsMapperImpl$toDomain$13.L$21 = obj11;
                                                                chargersTariffsMapperImpl$toDomain$13.I$0 = i;
                                                                chargersTariffsMapperImpl$toDomain$13.I$1 = i2;
                                                                chargersTariffsMapperImpl$toDomain$13.label = 5;
                                                                obj6 = c.i(cVar3, formattedText2, null, chargersTariffsMapperImpl$toDomain$13, 30);
                                                                coroutineSingletons2 = coroutineSingletons6;
                                                                if (obj6 == coroutineSingletons2) {
                                                                    return coroutineSingletons2;
                                                                }
                                                                it7 = it14;
                                                                chargersTariffBlockDto4 = chargersTariffBlockDto6;
                                                                collection4 = collection5;
                                                                it8 = it10;
                                                                chargersTariffDetailItemDto2 = chargersTariffDetailItemDto4;
                                                                obj5 = obj11;
                                                                arrayList4 = arrayList8;
                                                                Collection collection7 = collection3;
                                                                charSequence6 = charSequence3;
                                                                str3 = str2;
                                                                collection6 = collection7;
                                                                i4 = i;
                                                                chargersTariffsMapperImpl$toDomain$12 = chargersTariffsMapperImpl$toDomain$13;
                                                                it11 = it7;
                                                                cVar2 = cVar3;
                                                                charSequence7 = (CharSequence) obj6;
                                                                hwaVar2 = hwaVar6;
                                                                coroutineSingletons4 = coroutineSingletons2;
                                                                obj7 = obj5;
                                                                uwaVar4 = uwaVar2;
                                                                chargersTariffDetailItemDto3 = chargersTariffDetailItemDto2;
                                                                it10 = it8;
                                                                collection5 = collection4;
                                                                chargersTariffBlockDto6 = chargersTariffBlockDto4;
                                                                arrayList7 = arrayList4;
                                                                int i16 = i2;
                                                                cxaVar = chargersTariffDetailItemDto3.e;
                                                                int i17 = i4;
                                                                if (jl40.l(cxaVar, ywa.INSTANCE)) {
                                                                    if (hwaVar2 != null) {
                                                                        fxaVar = new dxa(hwaVar2);
                                                                        hint = chargersTariffDetailItemDto3.f;
                                                                        if (hint == null) {
                                                                        }
                                                                    }
                                                                    fxaVar = null;
                                                                    hint = chargersTariffDetailItemDto3.f;
                                                                    if (hint == null) {
                                                                    }
                                                                } else if (jl40.l(cxaVar, axa.INSTANCE)) {
                                                                    fxaVar = exa.a;
                                                                    hint = chargersTariffDetailItemDto3.f;
                                                                    if (hint == null) {
                                                                    }
                                                                } else {
                                                                    if (!jl40.l(cxaVar, bxa.INSTANCE)) {
                                                                        w511.b();
                                                                        return null;
                                                                    }
                                                                    fxaVar = null;
                                                                    hint = chargersTariffDetailItemDto3.f;
                                                                    if (hint == null) {
                                                                        chargersTariffsMapperImpl$toDomain$12.L$0 = null;
                                                                        chargersTariffsMapperImpl$toDomain$12.L$1 = hwaVar2;
                                                                        chargersTariffsMapperImpl$toDomain$12.L$2 = null;
                                                                        chargersTariffsMapperImpl$toDomain$12.L$3 = null;
                                                                        chargersTariffsMapperImpl$toDomain$12.L$4 = arrayList7;
                                                                        chargersTariffsMapperImpl$toDomain$12.L$5 = null;
                                                                        chargersTariffsMapperImpl$toDomain$12.L$6 = it11;
                                                                        chargersTariffsMapperImpl$toDomain$12.L$7 = null;
                                                                        chargersTariffsMapperImpl$toDomain$12.L$8 = null;
                                                                        chargersTariffsMapperImpl$toDomain$12.L$9 = chargersTariffBlockDto6;
                                                                        chargersTariffsMapperImpl$toDomain$12.L$10 = null;
                                                                        chargersTariffsMapperImpl$toDomain$12.L$11 = null;
                                                                        chargersTariffsMapperImpl$toDomain$12.L$12 = collection5;
                                                                        chargersTariffsMapperImpl$toDomain$12.L$13 = it10;
                                                                        chargersTariffsMapperImpl$toDomain$12.L$14 = null;
                                                                        chargersTariffsMapperImpl$toDomain$12.L$15 = chargersTariffDetailItemDto3;
                                                                        chargersTariffsMapperImpl$toDomain$12.L$16 = uwaVar4;
                                                                        chargersTariffsMapperImpl$toDomain$12.L$17 = collection6;
                                                                        chargersTariffsMapperImpl$toDomain$12.L$18 = str3;
                                                                        chargersTariffsMapperImpl$toDomain$12.L$19 = charSequence6;
                                                                        chargersTariffsMapperImpl$toDomain$12.L$20 = obj7;
                                                                        chargersTariffsMapperImpl$toDomain$12.L$21 = charSequence7;
                                                                        chargersTariffsMapperImpl$toDomain$12.L$22 = fxaVar;
                                                                        chargersTariffsMapperImpl$toDomain$12.I$0 = i17;
                                                                        fxa fxaVar4 = fxaVar;
                                                                        chargersTariffsMapperImpl$toDomain$12.I$1 = i16;
                                                                        chargersTariffsMapperImpl$toDomain$12.label = 6;
                                                                        hwa hwaVar10 = hwaVar2;
                                                                        c = bVar.c(hint, chargersTariffsMapperImpl$toDomain$12);
                                                                        coroutineSingletons5 = coroutineSingletons4;
                                                                        if (c == coroutineSingletons5) {
                                                                            return coroutineSingletons5;
                                                                        }
                                                                        obj8 = obj7;
                                                                        chargersTariffsMapperImpl$toDomain$1 = chargersTariffsMapperImpl$toDomain$12;
                                                                        i7 = i16;
                                                                        Iterator it15 = it10;
                                                                        i8 = i17;
                                                                        it12 = it15;
                                                                        charSequence9 = charSequence7;
                                                                        fxaVar3 = fxaVar4;
                                                                        hwaVar7 = hwaVar10;
                                                                        arrayList11 = arrayList7;
                                                                        int i18 = i7;
                                                                        chargersTariffsMapperImpl$toDomain$12 = chargersTariffsMapperImpl$toDomain$1;
                                                                        it = it11;
                                                                        i5 = i8;
                                                                        it10 = it12;
                                                                        i6 = i18;
                                                                        vwaVar = (vwa) c;
                                                                        fxaVar2 = fxaVar3;
                                                                        charSequence8 = charSequence9;
                                                                        r26 = obj8;
                                                                        hwaVar2 = hwaVar7;
                                                                        arrayList10 = arrayList11;
                                                                        uwa uwaVar5 = uwaVar4;
                                                                        String str6 = str3;
                                                                        CharSequence charSequence11 = charSequence6;
                                                                        arrayList5 = collection5;
                                                                        chargersTariffBlockDto5 = chargersTariffBlockDto6;
                                                                        arrayList = arrayList10;
                                                                        boolean z = chargersTariffDetailItemDto3.h == ChargersTariffDetailItemDto.Type.TARIFF_DETAIL_WITH_TOP_DIVIDER;
                                                                        ChargersTariffDetailItemDto chargersTariffDetailItemDto6 = (ChargersTariffDetailItemDto) kotlin.collections.a.S(i6 + 1, chargersTariffBlockDto5.b);
                                                                        ChargersTariffDetailItemDto.Type type = chargersTariffDetailItemDto6 != null ? chargersTariffDetailItemDto6.h : null;
                                                                        i9 = type == null ? -1 : jya.a[type.ordinal()];
                                                                        if (i9 != -1) {
                                                                            if (i9 == 1) {
                                                                                i10 = 4;
                                                                                collection6.add(new wwa(str6, charSequence11, r26, charSequence8, fxaVar2, vwaVar, z, i10, chargersTariffDetailItemDto3.g));
                                                                                uwaVar3 = uwaVar5;
                                                                                i2 = i5;
                                                                                it9 = it10;
                                                                                cVar3 = cVar2;
                                                                                coroutineSingletons7 = coroutineSingletons5;
                                                                            } else if (i9 != 2) {
                                                                                w511.b();
                                                                                return null;
                                                                            }
                                                                        }
                                                                        i10 = 0;
                                                                        collection6.add(new wwa(str6, charSequence11, r26, charSequence8, fxaVar2, vwaVar, z, i10, chargersTariffDetailItemDto3.g));
                                                                        uwaVar3 = uwaVar5;
                                                                        i2 = i5;
                                                                        it9 = it10;
                                                                        cVar3 = cVar2;
                                                                        coroutineSingletons7 = coroutineSingletons5;
                                                                    } else {
                                                                        fxa fxaVar5 = fxaVar;
                                                                        coroutineSingletons5 = coroutineSingletons4;
                                                                        charSequence8 = charSequence7;
                                                                        r26 = obj7;
                                                                        it = it11;
                                                                        i5 = i17;
                                                                        i6 = i16;
                                                                        fxaVar2 = fxaVar5;
                                                                        vwaVar = null;
                                                                        arrayList10 = arrayList7;
                                                                        uwa uwaVar52 = uwaVar4;
                                                                        String str62 = str3;
                                                                        CharSequence charSequence112 = charSequence6;
                                                                        arrayList5 = collection5;
                                                                        chargersTariffBlockDto5 = chargersTariffBlockDto6;
                                                                        arrayList = arrayList10;
                                                                        if (chargersTariffDetailItemDto3.h == ChargersTariffDetailItemDto.Type.TARIFF_DETAIL_WITH_TOP_DIVIDER) {
                                                                        }
                                                                        ChargersTariffDetailItemDto chargersTariffDetailItemDto62 = (ChargersTariffDetailItemDto) kotlin.collections.a.S(i6 + 1, chargersTariffBlockDto5.b);
                                                                        if (chargersTariffDetailItemDto62 != null) {
                                                                        }
                                                                        if (type == null) {
                                                                        }
                                                                        if (i9 != -1) {
                                                                        }
                                                                        i10 = 0;
                                                                        collection6.add(new wwa(str62, charSequence112, r26, charSequence8, fxaVar2, vwaVar, z, i10, chargersTariffDetailItemDto3.g));
                                                                        uwaVar3 = uwaVar52;
                                                                        i2 = i5;
                                                                        it9 = it10;
                                                                        cVar3 = cVar2;
                                                                        coroutineSingletons7 = coroutineSingletons5;
                                                                    }
                                                                }
                                                                if (!it9.hasNext()) {
                                                                    cVar = cVar3;
                                                                    coroutineSingletons3 = coroutineSingletons7;
                                                                    twaVar = new twa(uwaVar3, (List) arrayList5);
                                                                    hwaVar2 = hwaVar2;
                                                                    if (twaVar != null) {
                                                                        arrayList.add(twaVar);
                                                                    }
                                                                    coroutineSingletons7 = coroutineSingletons3;
                                                                    cVar3 = cVar;
                                                                    if (it.hasNext()) {
                                                                        return arrayList;
                                                                    }
                                                                }
                                                            } else {
                                                                uwa uwaVar6 = uwaVar2;
                                                                chargersTariffDetailItemDto3 = chargersTariffDetailItemDto4;
                                                                uwaVar4 = uwaVar6;
                                                                Collection collection8 = collection3;
                                                                charSequence6 = charSequence3;
                                                                str3 = str2;
                                                                collection6 = collection8;
                                                                i4 = i;
                                                                hwaVar2 = hwaVar9;
                                                                obj7 = obj9;
                                                                chargersTariffsMapperImpl$toDomain$12 = chargersTariffsMapperImpl$toDomain$13;
                                                                it11 = it13;
                                                                coroutineSingletons4 = coroutineSingletons6;
                                                                cVar2 = cVar3;
                                                                charSequence7 = null;
                                                                arrayList7 = arrayList8;
                                                                int i162 = i2;
                                                                cxaVar = chargersTariffDetailItemDto3.e;
                                                                int i172 = i4;
                                                                if (jl40.l(cxaVar, ywa.INSTANCE)) {
                                                                }
                                                                if (!it9.hasNext()) {
                                                                }
                                                            }
                                                        } else {
                                                            hwaVar5 = hwaVar4;
                                                            arrayList8 = arrayList3;
                                                            obj9 = map2;
                                                            it13 = it5;
                                                            chargersTariffBlockDto6 = chargersTariffBlockDto3;
                                                            collection5 = collection2;
                                                            it10 = it4;
                                                            chargersTariffDetailItemDto4 = chargersTariffDetailItemDto;
                                                            uwaVar2 = uwaVar;
                                                            collection3 = collection;
                                                            str2 = str;
                                                            charSequence3 = charSequence10;
                                                            chargersTariffsMapperImpl$toDomain$13 = chargersTariffsMapperImpl$toDomain$1;
                                                            hwa hwaVar92 = hwaVar5;
                                                            formattedText2 = chargersTariffDetailItemDto4.d;
                                                            if (formattedText2 != null) {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            ChargersTariffBlockDto chargersTariffBlockDto7 = chargersTariffBlockDto;
                                            chargersTariffsMapperImpl$toDomain$12 = chargersTariffsMapperImpl$toDomain$1;
                                            it = it2;
                                            arrayList = arrayList6;
                                            chargersTariffBlockDto5 = chargersTariffBlockDto7;
                                            charSequence4 = null;
                                            uwaVar3 = new uwa(charSequence5, charSequence4);
                                            hwaVar2 = hwaVar3;
                                            List list22 = chargersTariffBlockDto5.b;
                                            arrayList5 = new ArrayList(tcc.n(list22, 10));
                                            it9 = list22.iterator();
                                            i2 = 0;
                                            if (!it9.hasNext()) {
                                            }
                                        }
                                    }
                                    return coroutineSingletons7;
                                }
                                uwaVar3 = null;
                                List list3 = chargersTariffBlockDto5.b;
                                arrayList5 = new ArrayList(tcc.n(list3, 10));
                                it9 = list3.iterator();
                                i2 = 0;
                                if (!it9.hasNext()) {
                                }
                            }
                        }
                    case 1:
                        ChargersTariffDetailHeaderDto chargersTariffDetailHeaderDto2 = (ChargersTariffDetailHeaderDto) chargersTariffsMapperImpl$toDomain$1.L$10;
                        chargersTariffBlockDto = (ChargersTariffBlockDto) chargersTariffsMapperImpl$toDomain$1.L$9;
                        it2 = (Iterator) chargersTariffsMapperImpl$toDomain$1.L$6;
                        ?? r7 = (Collection) chargersTariffsMapperImpl$toDomain$1.L$4;
                        hwa hwaVar11 = (hwa) chargersTariffsMapperImpl$toDomain$1.L$1;
                        kotlin.b.b(obj10);
                        hwaVar3 = hwaVar11;
                        map = null;
                        chargersTariffDetailHeaderDto = chargersTariffDetailHeaderDto2;
                        obj = obj10;
                        arrayList6 = r7;
                        charSequence5 = (CharSequence) obj;
                        formattedText = chargersTariffDetailHeaderDto.b;
                        if (formattedText == null) {
                        }
                        break;
                    case 2:
                        CharSequence charSequence12 = (CharSequence) chargersTariffsMapperImpl$toDomain$1.L$11;
                        ChargersTariffBlockDto chargersTariffBlockDto8 = (ChargersTariffBlockDto) chargersTariffsMapperImpl$toDomain$1.L$9;
                        Iterator it16 = (Iterator) chargersTariffsMapperImpl$toDomain$1.L$6;
                        ?? r72 = (Collection) chargersTariffsMapperImpl$toDomain$1.L$4;
                        hwa hwaVar12 = (hwa) chargersTariffsMapperImpl$toDomain$1.L$1;
                        kotlin.b.b(obj10);
                        hwaVar3 = hwaVar12;
                        arrayList2 = r72;
                        it3 = it16;
                        chargersTariffBlockDto2 = chargersTariffBlockDto8;
                        chargersTariffsMapperImpl$toDomain$12 = chargersTariffsMapperImpl$toDomain$1;
                        charSequence = charSequence12;
                        obj2 = obj10;
                        ArrayList arrayList132 = arrayList2;
                        charSequence4 = (CharSequence) obj2;
                        charSequence5 = charSequence;
                        it = it3;
                        chargersTariffBlockDto5 = chargersTariffBlockDto2;
                        arrayList = arrayList132;
                        uwaVar3 = new uwa(charSequence5, charSequence4);
                        hwaVar2 = hwaVar3;
                        List list222 = chargersTariffBlockDto5.b;
                        arrayList5 = new ArrayList(tcc.n(list222, 10));
                        it9 = list222.iterator();
                        i2 = 0;
                        if (!it9.hasNext()) {
                        }
                        break;
                    case 3:
                        int i19 = chargersTariffsMapperImpl$toDomain$1.I$1;
                        i = chargersTariffsMapperImpl$toDomain$1.I$0;
                        String str7 = (String) chargersTariffsMapperImpl$toDomain$1.L$18;
                        Collection collection9 = (Collection) chargersTariffsMapperImpl$toDomain$1.L$17;
                        uwa uwaVar7 = (uwa) chargersTariffsMapperImpl$toDomain$1.L$16;
                        ChargersTariffDetailItemDto chargersTariffDetailItemDto7 = (ChargersTariffDetailItemDto) chargersTariffsMapperImpl$toDomain$1.L$15;
                        Iterator it17 = (Iterator) chargersTariffsMapperImpl$toDomain$1.L$13;
                        Collection collection10 = (Collection) chargersTariffsMapperImpl$toDomain$1.L$12;
                        ChargersTariffBlockDto chargersTariffBlockDto9 = (ChargersTariffBlockDto) chargersTariffsMapperImpl$toDomain$1.L$9;
                        Iterator it18 = (Iterator) chargersTariffsMapperImpl$toDomain$1.L$6;
                        ?? r14 = (Collection) chargersTariffsMapperImpl$toDomain$1.L$4;
                        hwaVar4 = (hwa) chargersTariffsMapperImpl$toDomain$1.L$1;
                        kotlin.b.b(obj10);
                        str = str7;
                        it4 = it17;
                        chargersTariffDetailItemDto = chargersTariffDetailItemDto7;
                        uwaVar = uwaVar7;
                        collection = collection9;
                        arrayList3 = r14;
                        obj3 = obj10;
                        map2 = null;
                        it5 = it18;
                        chargersTariffBlockDto3 = chargersTariffBlockDto9;
                        collection2 = collection10;
                        i2 = i19;
                        CharSequence charSequence102 = (CharSequence) obj3;
                        coroutineSingletons6 = coroutineSingletons7;
                        formattedText3 = chargersTariffDetailItemDto.c;
                        if (formattedText3 == null) {
                        }
                        break;
                    case 4:
                        int i20 = chargersTariffsMapperImpl$toDomain$1.I$1;
                        i = chargersTariffsMapperImpl$toDomain$1.I$0;
                        charSequence2 = (CharSequence) chargersTariffsMapperImpl$toDomain$1.L$19;
                        str = (String) chargersTariffsMapperImpl$toDomain$1.L$18;
                        collection = (Collection) chargersTariffsMapperImpl$toDomain$1.L$17;
                        uwaVar = (uwa) chargersTariffsMapperImpl$toDomain$1.L$16;
                        chargersTariffDetailItemDto = (ChargersTariffDetailItemDto) chargersTariffsMapperImpl$toDomain$1.L$15;
                        it6 = (Iterator) chargersTariffsMapperImpl$toDomain$1.L$13;
                        collection2 = (Collection) chargersTariffsMapperImpl$toDomain$1.L$12;
                        chargersTariffBlockDto3 = (ChargersTariffBlockDto) chargersTariffsMapperImpl$toDomain$1.L$9;
                        it5 = (Iterator) chargersTariffsMapperImpl$toDomain$1.L$6;
                        ?? r15 = (Collection) chargersTariffsMapperImpl$toDomain$1.L$4;
                        i3 = i20;
                        hwa hwaVar13 = (hwa) chargersTariffsMapperImpl$toDomain$1.L$1;
                        kotlin.b.b(obj10);
                        hwaVar5 = hwaVar13;
                        coroutineSingletons = coroutineSingletons7;
                        obj4 = obj10;
                        map2 = null;
                        arrayList9 = r15;
                        String str52 = str;
                        charSequence3 = charSequence2;
                        chargersTariffDetailItemDto4 = chargersTariffDetailItemDto;
                        uwaVar2 = uwaVar;
                        collection3 = collection;
                        str2 = str52;
                        coroutineSingletons6 = coroutineSingletons;
                        obj9 = (CharSequence) obj4;
                        it13 = it5;
                        chargersTariffBlockDto6 = chargersTariffBlockDto3;
                        collection5 = collection2;
                        it10 = it6;
                        i2 = i3;
                        arrayList8 = arrayList9;
                        chargersTariffsMapperImpl$toDomain$13 = chargersTariffsMapperImpl$toDomain$1;
                        hwa hwaVar922 = hwaVar5;
                        formattedText2 = chargersTariffDetailItemDto4.d;
                        if (formattedText2 != null) {
                        }
                        break;
                    case 5:
                        int i21 = chargersTariffsMapperImpl$toDomain$1.I$1;
                        i = chargersTariffsMapperImpl$toDomain$1.I$0;
                        obj5 = (CharSequence) chargersTariffsMapperImpl$toDomain$1.L$21;
                        charSequence3 = (CharSequence) chargersTariffsMapperImpl$toDomain$1.L$19;
                        str2 = (String) chargersTariffsMapperImpl$toDomain$1.L$18;
                        collection3 = (Collection) chargersTariffsMapperImpl$toDomain$1.L$17;
                        uwaVar2 = (uwa) chargersTariffsMapperImpl$toDomain$1.L$16;
                        ChargersTariffDetailItemDto chargersTariffDetailItemDto8 = (ChargersTariffDetailItemDto) chargersTariffsMapperImpl$toDomain$1.L$15;
                        Iterator it19 = (Iterator) chargersTariffsMapperImpl$toDomain$1.L$13;
                        Collection collection11 = (Collection) chargersTariffsMapperImpl$toDomain$1.L$12;
                        ChargersTariffBlockDto chargersTariffBlockDto10 = (ChargersTariffBlockDto) chargersTariffsMapperImpl$toDomain$1.L$9;
                        Iterator it20 = (Iterator) chargersTariffsMapperImpl$toDomain$1.L$6;
                        ?? r1 = (Collection) chargersTariffsMapperImpl$toDomain$1.L$4;
                        hwa hwaVar14 = (hwa) chargersTariffsMapperImpl$toDomain$1.L$1;
                        kotlin.b.b(obj10);
                        chargersTariffsMapperImpl$toDomain$13 = chargersTariffsMapperImpl$toDomain$1;
                        coroutineSingletons2 = coroutineSingletons7;
                        chargersTariffBlockDto4 = chargersTariffBlockDto10;
                        obj6 = obj10;
                        collection4 = collection11;
                        it7 = it20;
                        arrayList4 = r1;
                        it8 = it19;
                        chargersTariffDetailItemDto2 = chargersTariffDetailItemDto8;
                        i2 = i21;
                        hwaVar6 = hwaVar14;
                        Collection collection72 = collection3;
                        charSequence6 = charSequence3;
                        str3 = str2;
                        collection6 = collection72;
                        i4 = i;
                        chargersTariffsMapperImpl$toDomain$12 = chargersTariffsMapperImpl$toDomain$13;
                        it11 = it7;
                        cVar2 = cVar3;
                        charSequence7 = (CharSequence) obj6;
                        hwaVar2 = hwaVar6;
                        coroutineSingletons4 = coroutineSingletons2;
                        obj7 = obj5;
                        uwaVar4 = uwaVar2;
                        chargersTariffDetailItemDto3 = chargersTariffDetailItemDto2;
                        it10 = it8;
                        collection5 = collection4;
                        chargersTariffBlockDto6 = chargersTariffBlockDto4;
                        arrayList7 = arrayList4;
                        int i1622 = i2;
                        cxaVar = chargersTariffDetailItemDto3.e;
                        int i1722 = i4;
                        if (jl40.l(cxaVar, ywa.INSTANCE)) {
                        }
                        if (!it9.hasNext()) {
                        }
                        break;
                    case 6:
                        i7 = chargersTariffsMapperImpl$toDomain$1.I$1;
                        i8 = chargersTariffsMapperImpl$toDomain$1.I$0;
                        fxa fxaVar6 = (fxa) chargersTariffsMapperImpl$toDomain$1.L$22;
                        CharSequence charSequence13 = (CharSequence) chargersTariffsMapperImpl$toDomain$1.L$21;
                        Object obj12 = (CharSequence) chargersTariffsMapperImpl$toDomain$1.L$20;
                        charSequence6 = (CharSequence) chargersTariffsMapperImpl$toDomain$1.L$19;
                        str3 = (String) chargersTariffsMapperImpl$toDomain$1.L$18;
                        collection6 = (Collection) chargersTariffsMapperImpl$toDomain$1.L$17;
                        uwaVar4 = (uwa) chargersTariffsMapperImpl$toDomain$1.L$16;
                        chargersTariffDetailItemDto3 = (ChargersTariffDetailItemDto) chargersTariffsMapperImpl$toDomain$1.L$15;
                        it12 = (Iterator) chargersTariffsMapperImpl$toDomain$1.L$13;
                        Collection collection12 = (Collection) chargersTariffsMapperImpl$toDomain$1.L$12;
                        ChargersTariffBlockDto chargersTariffBlockDto11 = (ChargersTariffBlockDto) chargersTariffsMapperImpl$toDomain$1.L$9;
                        Iterator it21 = (Iterator) chargersTariffsMapperImpl$toDomain$1.L$6;
                        ?? r12 = (Collection) chargersTariffsMapperImpl$toDomain$1.L$4;
                        hwaVar7 = (hwa) chargersTariffsMapperImpl$toDomain$1.L$1;
                        kotlin.b.b(obj10);
                        obj8 = obj12;
                        arrayList11 = r12;
                        coroutineSingletons5 = coroutineSingletons7;
                        c = obj10;
                        it11 = it21;
                        cVar2 = cVar3;
                        fxaVar3 = fxaVar6;
                        charSequence9 = charSequence13;
                        collection5 = collection12;
                        chargersTariffBlockDto6 = chargersTariffBlockDto11;
                        int i182 = i7;
                        chargersTariffsMapperImpl$toDomain$12 = chargersTariffsMapperImpl$toDomain$1;
                        it = it11;
                        i5 = i8;
                        it10 = it12;
                        i6 = i182;
                        vwaVar = (vwa) c;
                        fxaVar2 = fxaVar3;
                        charSequence8 = charSequence9;
                        r26 = obj8;
                        hwaVar2 = hwaVar7;
                        arrayList10 = arrayList11;
                        uwa uwaVar522 = uwaVar4;
                        String str622 = str3;
                        CharSequence charSequence1122 = charSequence6;
                        arrayList5 = collection5;
                        chargersTariffBlockDto5 = chargersTariffBlockDto6;
                        arrayList = arrayList10;
                        if (chargersTariffDetailItemDto3.h == ChargersTariffDetailItemDto.Type.TARIFF_DETAIL_WITH_TOP_DIVIDER) {
                        }
                        ChargersTariffDetailItemDto chargersTariffDetailItemDto622 = (ChargersTariffDetailItemDto) kotlin.collections.a.S(i6 + 1, chargersTariffBlockDto5.b);
                        if (chargersTariffDetailItemDto622 != null) {
                        }
                        if (type == null) {
                        }
                        if (i9 != -1) {
                        }
                        i10 = 0;
                        collection6.add(new wwa(str622, charSequence1122, r26, charSequence8, fxaVar2, vwaVar, z, i10, chargersTariffDetailItemDto3.g));
                        uwaVar3 = uwaVar522;
                        i2 = i5;
                        it9 = it10;
                        cVar3 = cVar2;
                        coroutineSingletons7 = coroutineSingletons5;
                        if (!it9.hasNext()) {
                        }
                        break;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        chargersTariffsMapperImpl$toDomain$1 = new ChargersTariffsMapperImpl$toDomain$1(bVar, continuationImpl);
        Object obj102 = chargersTariffsMapperImpl$toDomain$1.result;
        CoroutineSingletons coroutineSingletons72 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (chargersTariffsMapperImpl$toDomain$1.label) {
        }
    }

    public final Object b(ChargersTariffDto chargersTariffDto, hwa hwaVar, ChargersTariffDto chargersTariffDto2, ContinuationImpl continuationImpl) {
        return bvf0.n(new ChargersTariffsMapperImpl$map$2(chargersTariffDto2, chargersTariffDto, this, hwaVar, null), continuationImpl);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        if (r10 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ChargersTariffDetailItemDto.Hint hint, ContinuationImpl continuationImpl) {
        ChargersTariffsMapperImpl$toUi$1 chargersTariffsMapperImpl$toUi$1;
        int i;
        CharSequence charSequence;
        FormattedText formattedText;
        CharSequence charSequence2;
        if (continuationImpl instanceof ChargersTariffsMapperImpl$toUi$1) {
            chargersTariffsMapperImpl$toUi$1 = (ChargersTariffsMapperImpl$toUi$1) continuationImpl;
            int i2 = chargersTariffsMapperImpl$toUi$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersTariffsMapperImpl$toUi$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersTariffsMapperImpl$toUi$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersTariffsMapperImpl$toUi$1.label;
                c cVar = this.a;
                CharSequence charSequence3 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    FormattedText formattedText2 = hint.a;
                    chargersTariffsMapperImpl$toUi$1.L$0 = hint;
                    chargersTariffsMapperImpl$toUi$1.label = 1;
                    obj = c.i(cVar, formattedText2, null, chargersTariffsMapperImpl$toUi$1, 30);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        charSequence2 = (CharSequence) chargersTariffsMapperImpl$toUi$1.L$2;
                        kotlin.b.b(obj);
                        charSequence3 = (CharSequence) obj;
                        charSequence = charSequence2;
                        return new vwa(charSequence, charSequence3);
                    }
                    hint = (ChargersTariffDetailItemDto.Hint) chargersTariffsMapperImpl$toUi$1.L$0;
                    kotlin.b.b(obj);
                }
                charSequence = (CharSequence) obj;
                formattedText = hint.b;
                if (formattedText != null) {
                    chargersTariffsMapperImpl$toUi$1.L$0 = null;
                    chargersTariffsMapperImpl$toUi$1.L$1 = null;
                    chargersTariffsMapperImpl$toUi$1.L$2 = charSequence;
                    chargersTariffsMapperImpl$toUi$1.label = 2;
                    Object i3 = c.i(cVar, formattedText, null, chargersTariffsMapperImpl$toUi$1, 30);
                    if (i3 != coroutineSingletons) {
                        obj = i3;
                        charSequence2 = charSequence;
                        charSequence3 = (CharSequence) obj;
                        charSequence = charSequence2;
                    }
                    return coroutineSingletons;
                }
                return new vwa(charSequence, charSequence3);
            }
        }
        chargersTariffsMapperImpl$toUi$1 = new ChargersTariffsMapperImpl$toUi$1(this, continuationImpl);
        Object obj2 = chargersTariffsMapperImpl$toUi$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersTariffsMapperImpl$toUi$1.label;
        c cVar2 = this.a;
        CharSequence charSequence32 = null;
        if (i != 0) {
        }
        charSequence = (CharSequence) obj2;
        formattedText = hint.b;
        if (formattedText != null) {
        }
        return new vwa(charSequence, charSequence32);
    }
}
