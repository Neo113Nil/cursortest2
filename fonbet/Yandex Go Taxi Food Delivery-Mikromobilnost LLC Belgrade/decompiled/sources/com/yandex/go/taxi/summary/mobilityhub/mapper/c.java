package com.yandex.go.taxi.summary.mobilityhub.mapper;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.TransportSelectorOptionDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.TransportSelectorPayloadDto;
import defpackage.mja1;
import defpackage.ny61;
import defpackage.qa11;
import defpackage.ra11;
import defpackage.tcc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes14.dex */
public final class c {
    public final ru.yandex.taxi.widget.c a;

    public c(ru.yandex.taxi.widget.c cVar) {
        this.a = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(TransportSelectorOptionDto transportSelectorOptionDto, ContinuationImpl continuationImpl) {
        TransportTypeSelectorRawStateMapper$mapTransportTypeOption$1 transportTypeSelectorRawStateMapper$mapTransportTypeOption$1;
        int i;
        String str;
        if (continuationImpl instanceof TransportTypeSelectorRawStateMapper$mapTransportTypeOption$1) {
            transportTypeSelectorRawStateMapper$mapTransportTypeOption$1 = (TransportTypeSelectorRawStateMapper$mapTransportTypeOption$1) continuationImpl;
            int i2 = transportTypeSelectorRawStateMapper$mapTransportTypeOption$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transportTypeSelectorRawStateMapper$mapTransportTypeOption$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transportTypeSelectorRawStateMapper$mapTransportTypeOption$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transportTypeSelectorRawStateMapper$mapTransportTypeOption$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str2 = transportSelectorOptionDto.a;
                    FormattedText formattedText = transportSelectorOptionDto.b;
                    transportTypeSelectorRawStateMapper$mapTransportTypeOption$1.L$0 = transportSelectorOptionDto;
                    transportTypeSelectorRawStateMapper$mapTransportTypeOption$1.L$1 = str2;
                    transportTypeSelectorRawStateMapper$mapTransportTypeOption$1.label = 1;
                    Object i3 = ru.yandex.taxi.widget.c.i(this.a, formattedText, null, transportTypeSelectorRawStateMapper$mapTransportTypeOption$1, 30);
                    if (i3 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = i3;
                    str = str2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) transportTypeSelectorRawStateMapper$mapTransportTypeOption$1.L$1;
                    transportSelectorOptionDto = (TransportSelectorOptionDto) transportTypeSelectorRawStateMapper$mapTransportTypeOption$1.L$0;
                    kotlin.b.b(obj);
                }
                return new qa11(str, (CharSequence) obj, mja1.a(transportSelectorOptionDto.c, null, 6), transportSelectorOptionDto.d);
            }
        }
        transportTypeSelectorRawStateMapper$mapTransportTypeOption$1 = new TransportTypeSelectorRawStateMapper$mapTransportTypeOption$1(this, continuationImpl);
        Object obj2 = transportTypeSelectorRawStateMapper$mapTransportTypeOption$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transportTypeSelectorRawStateMapper$mapTransportTypeOption$1.label;
        if (i != 0) {
        }
        return new qa11(str, (CharSequence) obj2, mja1.a(transportSelectorOptionDto.c, null, 6), transportSelectorOptionDto.d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bd, code lost:
    
        if (r2 == r4) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0155 -> B:14:0x0156). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(TransportSelectorPayloadDto transportSelectorPayloadDto, ContinuationImpl continuationImpl) {
        TransportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1 transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1;
        Object obj;
        int i;
        Object i2;
        TransportSelectorPayloadDto transportSelectorPayloadDto2;
        CharSequence charSequence;
        Object i3;
        CharSequence charSequence2;
        TransportSelectorPayloadDto transportSelectorPayloadDto3;
        Object i4;
        CharSequence charSequence3;
        CharSequence charSequence4;
        TransportSelectorPayloadDto transportSelectorPayloadDto4;
        CharSequence charSequence5;
        Iterator it;
        CharSequence charSequence6;
        CharSequence charSequence7;
        Collection collection;
        CharSequence charSequence8;
        TransportSelectorPayloadDto transportSelectorPayloadDto5 = transportSelectorPayloadDto;
        if (continuationImpl instanceof TransportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1) {
            transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1 = (TransportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1) continuationImpl;
            int i5 = transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1.label = i5 - Integer.MIN_VALUE;
                Object obj2 = transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1.label;
                ru.yandex.taxi.widget.c cVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    FormattedText formattedText = transportSelectorPayloadDto5.a;
                    transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1.L$0 = transportSelectorPayloadDto5;
                    transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1.label = 1;
                    obj2 = ru.yandex.taxi.widget.c.i(cVar, formattedText, null, transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1, 30);
                } else if (i == 1) {
                    transportSelectorPayloadDto5 = (TransportSelectorPayloadDto) transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1.L$0;
                    kotlin.b.b(obj2);
                } else {
                    if (i == 2) {
                        charSequence = (CharSequence) transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1.L$1;
                        transportSelectorPayloadDto2 = (TransportSelectorPayloadDto) transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1.L$0;
                        kotlin.b.b(obj2);
                        CharSequence charSequence9 = (CharSequence) obj2;
                        FormattedText formattedText2 = transportSelectorPayloadDto2.d;
                        transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1.L$0 = transportSelectorPayloadDto2;
                        transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1.L$1 = charSequence;
                        transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1.L$2 = charSequence9;
                        transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1.label = 3;
                        i3 = ru.yandex.taxi.widget.c.i(cVar, formattedText2, null, transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1, 30);
                        if (i3 != obj) {
                            TransportSelectorPayloadDto transportSelectorPayloadDto6 = transportSelectorPayloadDto2;
                            charSequence2 = charSequence9;
                            obj2 = i3;
                            transportSelectorPayloadDto3 = transportSelectorPayloadDto6;
                            CharSequence charSequence10 = (CharSequence) obj2;
                            FormattedText formattedText3 = transportSelectorPayloadDto3.c;
                            transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1.L$0 = transportSelectorPayloadDto3;
                            transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1.L$1 = charSequence;
                            transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1.L$2 = charSequence2;
                            transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1.L$3 = charSequence10;
                            transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1.label = 4;
                            i4 = ru.yandex.taxi.widget.c.i(cVar, formattedText3, null, transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1, 30);
                            if (i4 != obj) {
                            }
                        }
                        return obj;
                    }
                    if (i == 3) {
                        CharSequence charSequence11 = (CharSequence) transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1.L$2;
                        CharSequence charSequence12 = (CharSequence) transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1.L$1;
                        transportSelectorPayloadDto3 = (TransportSelectorPayloadDto) transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1.L$0;
                        kotlin.b.b(obj2);
                        charSequence2 = charSequence11;
                        charSequence = charSequence12;
                        CharSequence charSequence102 = (CharSequence) obj2;
                        FormattedText formattedText32 = transportSelectorPayloadDto3.c;
                        transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1.L$0 = transportSelectorPayloadDto3;
                        transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1.L$1 = charSequence;
                        transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1.L$2 = charSequence2;
                        transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1.L$3 = charSequence102;
                        transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1.label = 4;
                        i4 = ru.yandex.taxi.widget.c.i(cVar, formattedText32, null, transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1, 30);
                        if (i4 != obj) {
                            charSequence3 = charSequence;
                            charSequence4 = charSequence102;
                            obj2 = i4;
                            transportSelectorPayloadDto4 = transportSelectorPayloadDto3;
                            List list = transportSelectorPayloadDto4.e;
                            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                            charSequence5 = charSequence3;
                            it = list.iterator();
                            charSequence6 = charSequence4;
                            charSequence7 = charSequence2;
                            collection = arrayList;
                            charSequence8 = (CharSequence) obj2;
                            if (!it.hasNext()) {
                            }
                        }
                        return obj;
                    }
                    if (i == 4) {
                        charSequence4 = (CharSequence) transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1.L$3;
                        charSequence2 = (CharSequence) transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1.L$2;
                        charSequence3 = (CharSequence) transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1.L$1;
                        transportSelectorPayloadDto4 = (TransportSelectorPayloadDto) transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1.L$0;
                        kotlin.b.b(obj2);
                        List list2 = transportSelectorPayloadDto4.e;
                        ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
                        charSequence5 = charSequence3;
                        it = list2.iterator();
                        charSequence6 = charSequence4;
                        charSequence7 = charSequence2;
                        collection = arrayList2;
                        charSequence8 = (CharSequence) obj2;
                        if (!it.hasNext()) {
                        }
                    } else {
                        if (i != 5) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        collection = (Collection) transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1.L$11;
                        charSequence8 = (CharSequence) transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1.L$10;
                        charSequence6 = (CharSequence) transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1.L$9;
                        charSequence7 = (CharSequence) transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1.L$8;
                        CharSequence charSequence13 = (CharSequence) transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1.L$7;
                        it = (Iterator) transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1.L$4;
                        Collection collection2 = (Collection) transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1.L$3;
                        kotlin.b.b(obj2);
                        charSequence5 = charSequence13;
                        collection.add((qa11) obj2);
                        collection = collection2;
                        if (!it.hasNext()) {
                            TransportSelectorOptionDto transportSelectorOptionDto = (TransportSelectorOptionDto) it.next();
                            transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1.L$0 = null;
                            transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1.L$1 = null;
                            transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1.L$2 = null;
                            transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1.L$3 = collection;
                            transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1.L$4 = it;
                            transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1.L$5 = null;
                            transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1.L$6 = null;
                            transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1.L$7 = charSequence5;
                            transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1.L$8 = charSequence7;
                            transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1.L$9 = charSequence6;
                            transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1.L$10 = charSequence8;
                            transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1.L$11 = collection;
                            transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1.label = 5;
                            obj2 = a(transportSelectorOptionDto, transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1);
                            if (obj2 != obj) {
                                collection2 = collection;
                                collection.add((qa11) obj2);
                                collection = collection2;
                                if (!it.hasNext()) {
                                    return new ra11(charSequence5, charSequence7, charSequence6, charSequence8, (List) collection);
                                }
                            }
                            return obj;
                        }
                    }
                }
                CharSequence charSequence14 = (CharSequence) obj2;
                FormattedText formattedText4 = transportSelectorPayloadDto5.b;
                transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1.L$0 = transportSelectorPayloadDto5;
                transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1.L$1 = charSequence14;
                transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1.label = 2;
                i2 = ru.yandex.taxi.widget.c.i(cVar, formattedText4, null, transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1, 30);
                if (i2 != obj) {
                    transportSelectorPayloadDto2 = transportSelectorPayloadDto5;
                    charSequence = charSequence14;
                    obj2 = i2;
                    CharSequence charSequence92 = (CharSequence) obj2;
                    FormattedText formattedText22 = transportSelectorPayloadDto2.d;
                    transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1.L$0 = transportSelectorPayloadDto2;
                    transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1.L$1 = charSequence;
                    transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1.L$2 = charSequence92;
                    transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1.label = 3;
                    i3 = ru.yandex.taxi.widget.c.i(cVar, formattedText22, null, transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1, 30);
                    if (i3 != obj) {
                    }
                }
                return obj;
            }
        }
        transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1 = new TransportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1(this, continuationImpl);
        Object obj22 = transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1.label;
        ru.yandex.taxi.widget.c cVar2 = this.a;
        if (i != 0) {
        }
        CharSequence charSequence142 = (CharSequence) obj22;
        FormattedText formattedText42 = transportSelectorPayloadDto5.b;
        transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1.L$0 = transportSelectorPayloadDto5;
        transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1.L$1 = charSequence142;
        transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1.label = 2;
        i2 = ru.yandex.taxi.widget.c.i(cVar2, formattedText42, null, transportTypeSelectorRawStateMapper$mapTransportTypeSelectorRawState$1, 30);
        if (i2 != obj) {
        }
        return obj;
    }
}
