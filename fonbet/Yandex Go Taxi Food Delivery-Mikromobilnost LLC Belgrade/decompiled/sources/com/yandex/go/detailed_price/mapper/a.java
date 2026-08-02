package com.yandex.go.detailed_price.mapper;

import com.yandex.go.slot.api.ui.SlotItemUiState$Body$Alignment;
import com.yandex.go.slot.api.ui.SlotItemUiState$Body$Ellipsize;
import com.yandex.go.slot.dto.SlotItemBodyDto;
import com.yandex.go.slot.dto.SlotItemBodyPropertiesDto;
import com.yandex.go.slot.dto.SlotItemLineDto;
import defpackage.ass0;
import defpackage.bss0;
import defpackage.d9s;
import defpackage.fef;
import defpackage.jst;
import defpackage.kdc;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.tcc;
import defpackage.v3j;
import defpackage.w3j;
import defpackage.w511;
import defpackage.x3j;
import defpackage.xby;
import defpackage.xdf;
import defpackage.xrs0;
import defpackage.yrs0;
import defpackage.zrs0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes12.dex */
public final class a implements v3j {
    public final xdf a;
    public final e b;

    public a(xdf xdfVar, e eVar) {
        this.a = xdfVar;
        this.b = eVar;
    }

    public static xrs0 b(Pair pair, Pair pair2) {
        return new xrs0(d((List) pair.f(), (SlotItemBodyPropertiesDto) pair.c()), d((List) pair2.f(), (SlotItemBodyPropertiesDto) pair2.c()));
    }

    public static SlotItemUiState$Body$Ellipsize c(w3j w3jVar) {
        SlotItemLineDto.Ellipsis ellipsis = w3jVar != null ? w3jVar.e : null;
        int i = ellipsis == null ? -1 : x3j.b[ellipsis.ordinal()];
        if (i == -1) {
            return SlotItemUiState$Body$Ellipsize.NONE;
        }
        if (i == 1) {
            return SlotItemUiState$Body$Ellipsize.MIDDLE;
        }
        if (i == 2) {
            return SlotItemUiState$Body$Ellipsize.END;
        }
        w511.b();
        return null;
    }

    public static bss0 d(List list, SlotItemBodyPropertiesDto slotItemBodyPropertiesDto) {
        Pair pair;
        SlotItemUiState$Body$Alignment slotItemUiState$Body$Alignment;
        w3j w3jVar = (w3j) kotlin.collections.a.P(list);
        CharSequence charSequence = w3jVar.a;
        kdc kdcVar = w3jVar.b;
        SlotItemUiState$Body$Ellipsize c = c(w3jVar);
        w3j w3jVar2 = (w3j) kotlin.collections.a.S(1, list);
        CharSequence charSequence2 = w3jVar2 != null ? w3jVar2.a : null;
        kdc kdcVar2 = w3jVar2 != null ? w3jVar2.b : null;
        SlotItemUiState$Body$Ellipsize c2 = c(w3jVar2);
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((w3j) it.next()).d;
        }
        if (i > 3) {
            pair = new Pair(1, 2);
        } else {
            int i2 = w3jVar.d;
            pair = new Pair(Integer.valueOf(i2), Integer.valueOf(i - i2));
        }
        int intValue = ((Number) pair.getFirst()).intValue();
        int intValue2 = ((Number) pair.getSecond()).intValue();
        int i3 = x3j.a[slotItemBodyPropertiesDto.a.ordinal()];
        if (i3 == 1) {
            slotItemUiState$Body$Alignment = SlotItemUiState$Body$Alignment.START;
        } else if (i3 == 2) {
            slotItemUiState$Body$Alignment = SlotItemUiState$Body$Alignment.CENTER;
        } else {
            if (i3 != 3) {
                w511.b();
                return null;
            }
            slotItemUiState$Body$Alignment = SlotItemUiState$Body$Alignment.END;
        }
        return new bss0(charSequence, kdcVar, w3jVar.c, charSequence2, kdcVar2, w3jVar2 != null ? w3jVar2.c : null, new ass0(slotItemUiState$Body$Alignment, intValue, intValue2, c, c2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00e3 -> B:11:0x0146). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x011c -> B:10:0x0123). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00ba -> B:12:0x00d3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(List list, fef fefVar, ContinuationImpl continuationImpl) {
        DetailedPriceSlotMapperImpl$mapBody$1 detailedPriceSlotMapperImpl$mapBody$1;
        int i;
        Iterator it;
        DetailedPriceSlotMapperImpl$mapBody$1 detailedPriceSlotMapperImpl$mapBody$12;
        ArrayList arrayList;
        fef fefVar2;
        if (continuationImpl instanceof DetailedPriceSlotMapperImpl$mapBody$1) {
            detailedPriceSlotMapperImpl$mapBody$1 = (DetailedPriceSlotMapperImpl$mapBody$1) continuationImpl;
            int i2 = detailedPriceSlotMapperImpl$mapBody$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                detailedPriceSlotMapperImpl$mapBody$1.label = i2 - Integer.MIN_VALUE;
                Object obj = detailedPriceSlotMapperImpl$mapBody$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = detailedPriceSlotMapperImpl$mapBody$1.label;
                e eVar = this.b;
                if (i != 0) {
                    b.b(obj);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list) {
                        if (!((SlotItemBodyDto) obj2).a.isEmpty()) {
                            arrayList2.add(obj2);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
                    it = arrayList2.iterator();
                    detailedPriceSlotMapperImpl$mapBody$12 = detailedPriceSlotMapperImpl$mapBody$1;
                    arrayList = arrayList3;
                    fefVar2 = fefVar;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Collection collection = (Collection) detailedPriceSlotMapperImpl$mapBody$1.L$18;
                    FormattedText formattedText = (FormattedText) detailedPriceSlotMapperImpl$mapBody$1.L$17;
                    SlotItemLineDto slotItemLineDto = (SlotItemLineDto) detailedPriceSlotMapperImpl$mapBody$1.L$15;
                    Iterator it2 = (Iterator) detailedPriceSlotMapperImpl$mapBody$1.L$12;
                    Collection arrayList4 = (Collection) detailedPriceSlotMapperImpl$mapBody$1.L$10;
                    SlotItemBodyDto slotItemBodyDto = (SlotItemBodyDto) detailedPriceSlotMapperImpl$mapBody$1.L$7;
                    Iterator it3 = (Iterator) detailedPriceSlotMapperImpl$mapBody$1.L$5;
                    ?? r14 = (Collection) detailedPriceSlotMapperImpl$mapBody$1.L$4;
                    fef fefVar3 = (fef) detailedPriceSlotMapperImpl$mapBody$1.L$1;
                    b.b(obj);
                    ArrayList arrayList5 = r14;
                    w3j w3jVar = new w3j((CharSequence) obj, eVar.v(formattedText.b()), formattedText.c(), slotItemLineDto.b, slotItemLineDto.a);
                    DetailedPriceSlotMapperImpl$mapBody$1 detailedPriceSlotMapperImpl$mapBody$13 = detailedPriceSlotMapperImpl$mapBody$1;
                    Iterator it4 = it3;
                    arrayList = arrayList5;
                    fefVar2 = fefVar3;
                    w3j w3jVar2 = w3jVar;
                    if (w3jVar2 != null) {
                        arrayList4.add(w3jVar2);
                    }
                    if (it2.hasNext()) {
                        collection.add(new Pair(slotItemBodyDto.b, (List) arrayList4));
                        detailedPriceSlotMapperImpl$mapBody$12 = detailedPriceSlotMapperImpl$mapBody$13;
                        it = it4;
                        if (it.hasNext()) {
                            ArrayList arrayList6 = arrayList;
                            int size = arrayList6.size();
                            if (size == 0) {
                                return yrs0.a;
                            }
                            if (size == 1) {
                                Pair pair = (Pair) kotlin.collections.a.P(arrayList6);
                                return new zrs0(d((List) pair.getSecond(), (SlotItemBodyPropertiesDto) pair.getFirst()));
                            }
                            if (size == 2) {
                                Pair pair2 = (Pair) kotlin.collections.a.P(arrayList6);
                                SlotItemBodyPropertiesDto slotItemBodyPropertiesDto = (SlotItemBodyPropertiesDto) pair2.getFirst();
                                List list2 = (List) pair2.getSecond();
                                Pair pair3 = (Pair) arrayList6.get(1);
                                return b(new Pair(slotItemBodyPropertiesDto, list2), new Pair((SlotItemBodyPropertiesDto) pair3.getFirst(), (List) pair3.getSecond()));
                            }
                            xby.t(jst.e, "DetailedPriceSlotMapper", null, oyr.j(arrayList6.size(), "Unexpected body size received, got ", ", max: 2"), 6);
                            Pair pair4 = (Pair) kotlin.collections.a.P(arrayList6);
                            SlotItemBodyPropertiesDto slotItemBodyPropertiesDto2 = (SlotItemBodyPropertiesDto) pair4.getFirst();
                            List list3 = (List) pair4.getSecond();
                            Pair pair5 = (Pair) arrayList6.get(1);
                            return b(new Pair(slotItemBodyPropertiesDto2, list3), new Pair((SlotItemBodyPropertiesDto) pair5.getFirst(), (List) pair5.getSecond()));
                        }
                        SlotItemBodyDto slotItemBodyDto2 = (SlotItemBodyDto) it.next();
                        List list4 = slotItemBodyDto2.a;
                        slotItemBodyDto = slotItemBodyDto2;
                        arrayList4 = new ArrayList();
                        it4 = it;
                        it2 = list4.iterator();
                        detailedPriceSlotMapperImpl$mapBody$13 = detailedPriceSlotMapperImpl$mapBody$12;
                        collection = arrayList;
                        if (it2.hasNext()) {
                            slotItemLineDto = (SlotItemLineDto) it2.next();
                            FormattedText formattedText2 = slotItemLineDto.c;
                            if (formattedText2 == null) {
                                w3jVar2 = null;
                                if (w3jVar2 != null) {
                                }
                                if (it2.hasNext()) {
                                }
                            } else {
                                FormattedText c = d9s.c(formattedText2, this.a, fefVar2, false);
                                detailedPriceSlotMapperImpl$mapBody$13.L$0 = null;
                                detailedPriceSlotMapperImpl$mapBody$13.L$1 = fefVar2;
                                detailedPriceSlotMapperImpl$mapBody$13.L$2 = null;
                                detailedPriceSlotMapperImpl$mapBody$13.L$3 = null;
                                detailedPriceSlotMapperImpl$mapBody$13.L$4 = arrayList;
                                detailedPriceSlotMapperImpl$mapBody$13.L$5 = it4;
                                detailedPriceSlotMapperImpl$mapBody$13.L$6 = null;
                                detailedPriceSlotMapperImpl$mapBody$13.L$7 = slotItemBodyDto;
                                detailedPriceSlotMapperImpl$mapBody$13.L$8 = null;
                                detailedPriceSlotMapperImpl$mapBody$13.L$9 = null;
                                detailedPriceSlotMapperImpl$mapBody$13.L$10 = arrayList4;
                                detailedPriceSlotMapperImpl$mapBody$13.L$11 = null;
                                detailedPriceSlotMapperImpl$mapBody$13.L$12 = it2;
                                detailedPriceSlotMapperImpl$mapBody$13.L$13 = null;
                                detailedPriceSlotMapperImpl$mapBody$13.L$14 = null;
                                detailedPriceSlotMapperImpl$mapBody$13.L$15 = slotItemLineDto;
                                detailedPriceSlotMapperImpl$mapBody$13.L$16 = null;
                                detailedPriceSlotMapperImpl$mapBody$13.L$17 = formattedText2;
                                detailedPriceSlotMapperImpl$mapBody$13.L$18 = collection;
                                detailedPriceSlotMapperImpl$mapBody$13.label = 1;
                                Object t = eVar.t(c, detailedPriceSlotMapperImpl$mapBody$13);
                                if (t == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                it3 = it4;
                                formattedText = formattedText2;
                                fefVar3 = fefVar2;
                                obj = t;
                                arrayList5 = arrayList;
                                detailedPriceSlotMapperImpl$mapBody$1 = detailedPriceSlotMapperImpl$mapBody$13;
                                w3j w3jVar3 = new w3j((CharSequence) obj, eVar.v(formattedText.b()), formattedText.c(), slotItemLineDto.b, slotItemLineDto.a);
                                DetailedPriceSlotMapperImpl$mapBody$1 detailedPriceSlotMapperImpl$mapBody$132 = detailedPriceSlotMapperImpl$mapBody$1;
                                Iterator it42 = it3;
                                arrayList = arrayList5;
                                fefVar2 = fefVar3;
                                w3j w3jVar22 = w3jVar3;
                                if (w3jVar22 != null) {
                                }
                                if (it2.hasNext()) {
                                }
                            }
                        }
                    }
                }
            }
        }
        detailedPriceSlotMapperImpl$mapBody$1 = new DetailedPriceSlotMapperImpl$mapBody$1(this, continuationImpl);
        Object obj3 = detailedPriceSlotMapperImpl$mapBody$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailedPriceSlotMapperImpl$mapBody$1.label;
        e eVar2 = this.b;
        if (i != 0) {
        }
    }
}
