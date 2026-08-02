package com.yandex.go.taxi.order.details.v1.elements.user_requirements;

import android.graphics.drawable.Drawable;
import com.yandex.go.taxi.order.details.v1.ui.DetailsCardListItem;
import com.yandex.go.taxi.order.details.v1.ui.f;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$CardElement$UserRequirementElement;
import com.yandex.go.taxi.order.models.api.response.i1;
import defpackage.ny61;
import defpackage.pkf;
import defpackage.scc;
import defpackage.tcc;
import defpackage.us21;
import defpackage.vs21;
import defpackage.yun;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes14.dex */
public final class c {
    public final e a;
    public final a b;
    public final ru.yandex.taxi.widget.c c;

    public c(e eVar, a aVar, ru.yandex.taxi.widget.c cVar) {
        this.a = eVar;
        this.b = aVar;
        this.c = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x025d, code lost:
    
        if (r14 == r3) goto L78;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Type inference failed for: r11v22, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v26, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v29, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v21, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v50, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x02c6 -> B:13:0x0089). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(TaxiOrder taxiOrder, ContinuationImpl continuationImpl) {
        DetailsCardUserRequirementsStateMapper$map$1 detailsCardUserRequirementsStateMapper$map$1;
        int i;
        Object obj;
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it;
        int i2;
        ArrayList arrayList3;
        Collection collection;
        Iterator it2;
        OrderDetailsCardResponse$CardElement$UserRequirementElement orderDetailsCardResponse$CardElement$UserRequirementElement;
        Collection collection2;
        int i3;
        ArrayList arrayList4;
        ?? r12;
        Iterator it3;
        OrderDetailsCardResponse$CardElement$UserRequirementElement orderDetailsCardResponse$CardElement$UserRequirementElement2;
        f fVar;
        int i4;
        CharSequence charSequence;
        int i5;
        ArrayList arrayList5;
        CharSequence charSequence2;
        ArrayList arrayList6;
        Iterator it4;
        f fVar2;
        Collection collection3;
        OrderDetailsCardResponse$CardElement$UserRequirementElement orderDetailsCardResponse$CardElement$UserRequirementElement3;
        CharSequence charSequence3;
        ArrayList arrayList7;
        int i6;
        String str;
        ru.yandex.taxi.widget.c cVar;
        ThemeType themeType;
        Object f;
        Object obj2;
        ArrayList arrayList8;
        FormattedText formattedText;
        ArrayList arrayList9;
        Object obj3;
        CharSequence charSequence4;
        Object obj4;
        FormattedText formattedText2;
        c cVar2 = this;
        if (continuationImpl instanceof DetailsCardUserRequirementsStateMapper$map$1) {
            detailsCardUserRequirementsStateMapper$map$1 = (DetailsCardUserRequirementsStateMapper$map$1) continuationImpl;
            int i7 = detailsCardUserRequirementsStateMapper$map$1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                detailsCardUserRequirementsStateMapper$map$1.label = i7 - Integer.MIN_VALUE;
                Object obj5 = detailsCardUserRequirementsStateMapper$map$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = detailsCardUserRequirementsStateMapper$map$1.label;
                ru.yandex.taxi.widget.c cVar3 = cVar2.c;
                if (i != 0) {
                    obj = null;
                    kotlin.b.b(obj5);
                    OrderDetailsCardResponse orderDetailsCardResponse = taxiOrder.V().n0;
                    List list = orderDetailsCardResponse != null ? orderDetailsCardResponse.a : null;
                    if (list == null) {
                        list = EmptyList.a;
                    }
                    arrayList = new ArrayList();
                    for (Object obj6 : list) {
                        if (obj6 instanceof OrderDetailsCardResponse$CardElement$UserRequirementElement) {
                            arrayList.add(obj6);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return yun.a;
                    }
                    arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                    it = arrayList.iterator();
                    i2 = 0;
                    if (it.hasNext()) {
                    }
                } else if (i == 1) {
                    int i8 = detailsCardUserRequirementsStateMapper$map$1.I$1;
                    i3 = detailsCardUserRequirementsStateMapper$map$1.I$0;
                    collection2 = (Collection) detailsCardUserRequirementsStateMapper$map$1.L$8;
                    OrderDetailsCardResponse$CardElement$UserRequirementElement orderDetailsCardResponse$CardElement$UserRequirementElement4 = (OrderDetailsCardResponse$CardElement$UserRequirementElement) detailsCardUserRequirementsStateMapper$map$1.L$7;
                    Iterator it5 = (Iterator) detailsCardUserRequirementsStateMapper$map$1.L$5;
                    Collection collection4 = (Collection) detailsCardUserRequirementsStateMapper$map$1.L$4;
                    ?? r11 = (List) detailsCardUserRequirementsStateMapper$map$1.L$1;
                    kotlin.b.b(obj5);
                    arrayList3 = r11;
                    collection = collection4;
                    it2 = it5;
                    orderDetailsCardResponse$CardElement$UserRequirementElement = orderDetailsCardResponse$CardElement$UserRequirementElement4;
                    i2 = i8;
                    obj4 = obj5;
                    f fVar3 = (f) obj4;
                    formattedText2 = orderDetailsCardResponse$CardElement$UserRequirementElement.d;
                    if (formattedText2 != null) {
                    }
                    arrayList4 = arrayList3;
                    r12 = collection;
                    it3 = it2;
                    orderDetailsCardResponse$CardElement$UserRequirementElement2 = orderDetailsCardResponse$CardElement$UserRequirementElement;
                    fVar = fVar3;
                    i4 = i2;
                    charSequence = "";
                    formattedText = orderDetailsCardResponse$CardElement$UserRequirementElement2.e;
                    if (formattedText != null) {
                    }
                } else if (i == 2) {
                    int i9 = detailsCardUserRequirementsStateMapper$map$1.I$1;
                    i3 = detailsCardUserRequirementsStateMapper$map$1.I$0;
                    collection2 = (Collection) detailsCardUserRequirementsStateMapper$map$1.L$10;
                    f fVar4 = (f) detailsCardUserRequirementsStateMapper$map$1.L$8;
                    OrderDetailsCardResponse$CardElement$UserRequirementElement orderDetailsCardResponse$CardElement$UserRequirementElement5 = (OrderDetailsCardResponse$CardElement$UserRequirementElement) detailsCardUserRequirementsStateMapper$map$1.L$7;
                    Iterator it6 = (Iterator) detailsCardUserRequirementsStateMapper$map$1.L$5;
                    Collection collection5 = (Collection) detailsCardUserRequirementsStateMapper$map$1.L$4;
                    ?? r122 = (List) detailsCardUserRequirementsStateMapper$map$1.L$1;
                    kotlin.b.b(obj5);
                    arrayList9 = r122;
                    r12 = collection5;
                    it3 = it6;
                    orderDetailsCardResponse$CardElement$UserRequirementElement2 = orderDetailsCardResponse$CardElement$UserRequirementElement5;
                    fVar = fVar4;
                    i2 = i9;
                    obj3 = obj5;
                    charSequence4 = (CharSequence) obj3;
                    if (charSequence4 != null) {
                    }
                } else {
                    if (i == 3) {
                        int i10 = detailsCardUserRequirementsStateMapper$map$1.I$1;
                        i3 = detailsCardUserRequirementsStateMapper$map$1.I$0;
                        collection2 = (Collection) detailsCardUserRequirementsStateMapper$map$1.L$11;
                        charSequence = (CharSequence) detailsCardUserRequirementsStateMapper$map$1.L$10;
                        fVar = (f) detailsCardUserRequirementsStateMapper$map$1.L$8;
                        orderDetailsCardResponse$CardElement$UserRequirementElement2 = (OrderDetailsCardResponse$CardElement$UserRequirementElement) detailsCardUserRequirementsStateMapper$map$1.L$7;
                        it3 = (Iterator) detailsCardUserRequirementsStateMapper$map$1.L$5;
                        r12 = (Collection) detailsCardUserRequirementsStateMapper$map$1.L$4;
                        ?? r13 = (List) detailsCardUserRequirementsStateMapper$map$1.L$1;
                        kotlin.b.b(obj5);
                        obj2 = obj5;
                        i5 = i10;
                        arrayList8 = r13;
                        CharSequence charSequence5 = (CharSequence) obj2;
                        arrayList5 = arrayList8;
                        if (charSequence5 != null) {
                            f fVar5 = fVar;
                            charSequence2 = charSequence;
                            arrayList6 = r12;
                            it4 = it3;
                            fVar2 = fVar5;
                            collection3 = collection2;
                            orderDetailsCardResponse$CardElement$UserRequirementElement3 = orderDetailsCardResponse$CardElement$UserRequirementElement2;
                            charSequence3 = charSequence5;
                            arrayList7 = arrayList8;
                            i6 = i3;
                            int i11 = i5;
                            OrderDetailsCardResponse.CardIcon cardIcon = orderDetailsCardResponse$CardElement$UserRequirementElement3.b;
                            if (cardIcon != null) {
                            }
                            str = orderDetailsCardResponse$CardElement$UserRequirementElement3.a;
                            if (str == null) {
                            }
                            cVar = cVar3;
                            detailsCardUserRequirementsStateMapper$map$1.L$0 = null;
                            detailsCardUserRequirementsStateMapper$map$1.L$1 = arrayList7;
                            detailsCardUserRequirementsStateMapper$map$1.L$2 = null;
                            detailsCardUserRequirementsStateMapper$map$1.L$3 = null;
                            detailsCardUserRequirementsStateMapper$map$1.L$4 = arrayList6;
                            detailsCardUserRequirementsStateMapper$map$1.L$5 = it4;
                            detailsCardUserRequirementsStateMapper$map$1.L$6 = null;
                            detailsCardUserRequirementsStateMapper$map$1.L$7 = null;
                            detailsCardUserRequirementsStateMapper$map$1.L$8 = fVar2;
                            detailsCardUserRequirementsStateMapper$map$1.L$9 = null;
                            detailsCardUserRequirementsStateMapper$map$1.L$10 = r1;
                            detailsCardUserRequirementsStateMapper$map$1.L$11 = null;
                            detailsCardUserRequirementsStateMapper$map$1.L$12 = charSequence3;
                            detailsCardUserRequirementsStateMapper$map$1.L$13 = charSequence2;
                            detailsCardUserRequirementsStateMapper$map$1.L$14 = str;
                            detailsCardUserRequirementsStateMapper$map$1.L$15 = collection3;
                            detailsCardUserRequirementsStateMapper$map$1.I$0 = i6;
                            detailsCardUserRequirementsStateMapper$map$1.I$1 = i11;
                            detailsCardUserRequirementsStateMapper$map$1.label = 4;
                            themeType = null;
                            f = e.f(cVar2.a, r1, null, detailsCardUserRequirementsStateMapper$map$1, 6);
                            if (f != coroutineSingletons) {
                            }
                            return coroutineSingletons;
                        }
                        f fVar6 = fVar;
                        charSequence2 = charSequence;
                        arrayList6 = r12;
                        it4 = it3;
                        fVar2 = fVar6;
                        collection3 = collection2;
                        orderDetailsCardResponse$CardElement$UserRequirementElement3 = orderDetailsCardResponse$CardElement$UserRequirementElement2;
                        charSequence3 = "";
                        arrayList7 = arrayList5;
                        i6 = i3;
                        int i112 = i5;
                        OrderDetailsCardResponse.CardIcon cardIcon2 = orderDetailsCardResponse$CardElement$UserRequirementElement3.b;
                        if (cardIcon2 != null) {
                        }
                        str = orderDetailsCardResponse$CardElement$UserRequirementElement3.a;
                        if (str == null) {
                        }
                        cVar = cVar3;
                        detailsCardUserRequirementsStateMapper$map$1.L$0 = null;
                        detailsCardUserRequirementsStateMapper$map$1.L$1 = arrayList7;
                        detailsCardUserRequirementsStateMapper$map$1.L$2 = null;
                        detailsCardUserRequirementsStateMapper$map$1.L$3 = null;
                        detailsCardUserRequirementsStateMapper$map$1.L$4 = arrayList6;
                        detailsCardUserRequirementsStateMapper$map$1.L$5 = it4;
                        detailsCardUserRequirementsStateMapper$map$1.L$6 = null;
                        detailsCardUserRequirementsStateMapper$map$1.L$7 = null;
                        detailsCardUserRequirementsStateMapper$map$1.L$8 = fVar2;
                        detailsCardUserRequirementsStateMapper$map$1.L$9 = null;
                        detailsCardUserRequirementsStateMapper$map$1.L$10 = r1;
                        detailsCardUserRequirementsStateMapper$map$1.L$11 = null;
                        detailsCardUserRequirementsStateMapper$map$1.L$12 = charSequence3;
                        detailsCardUserRequirementsStateMapper$map$1.L$13 = charSequence2;
                        detailsCardUserRequirementsStateMapper$map$1.L$14 = str;
                        detailsCardUserRequirementsStateMapper$map$1.L$15 = collection3;
                        detailsCardUserRequirementsStateMapper$map$1.I$0 = i6;
                        detailsCardUserRequirementsStateMapper$map$1.I$1 = i112;
                        detailsCardUserRequirementsStateMapper$map$1.label = 4;
                        themeType = null;
                        f = e.f(cVar2.a, r1, null, detailsCardUserRequirementsStateMapper$map$1, 6);
                        if (f != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    }
                    if (i != 4) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i12 = detailsCardUserRequirementsStateMapper$map$1.I$1;
                    i6 = detailsCardUserRequirementsStateMapper$map$1.I$0;
                    collection3 = (Collection) detailsCardUserRequirementsStateMapper$map$1.L$15;
                    String str2 = (String) detailsCardUserRequirementsStateMapper$map$1.L$14;
                    charSequence2 = (CharSequence) detailsCardUserRequirementsStateMapper$map$1.L$13;
                    charSequence3 = (CharSequence) detailsCardUserRequirementsStateMapper$map$1.L$12;
                    String str3 = (String) detailsCardUserRequirementsStateMapper$map$1.L$10;
                    fVar2 = (f) detailsCardUserRequirementsStateMapper$map$1.L$8;
                    it4 = (Iterator) detailsCardUserRequirementsStateMapper$map$1.L$5;
                    ?? r132 = (Collection) detailsCardUserRequirementsStateMapper$map$1.L$4;
                    ?? r1 = (List) detailsCardUserRequirementsStateMapper$map$1.L$1;
                    kotlin.b.b(obj5);
                    ArrayList arrayList10 = r1;
                    String str4 = str2;
                    Object obj7 = obj5;
                    cVar = cVar3;
                    String str5 = str3;
                    int i13 = i12;
                    themeType = null;
                    ArrayList arrayList11 = r132;
                    CharSequence charSequence6 = charSequence2;
                    CharSequence charSequence7 = charSequence3;
                    f fVar7 = fVar2;
                    i2 = i6;
                    Drawable drawable = (Drawable) obj7;
                    if (str5 == null) {
                        str5 = "";
                    }
                    collection3.add(new us21(str4, charSequence6, charSequence7, pkf.g(drawable, str5, themeType), new DetailsCardListItem.a(0, 0, false, false, fVar7, 31), i13 >= arrayList10.size() + (-1)));
                    arrayList = arrayList10;
                    it = it4;
                    arrayList2 = arrayList11;
                    cVar3 = cVar;
                    obj = null;
                    cVar2 = this;
                    if (it.hasNext()) {
                        Object next = it.next();
                        int i14 = i2 + 1;
                        if (i2 < 0) {
                            scc.m();
                            throw null;
                        }
                        orderDetailsCardResponse$CardElement$UserRequirementElement = (OrderDetailsCardResponse$CardElement$UserRequirementElement) next;
                        i1 i1Var = orderDetailsCardResponse$CardElement$UserRequirementElement.c;
                        Object obj8 = obj;
                        detailsCardUserRequirementsStateMapper$map$1.L$0 = obj8;
                        detailsCardUserRequirementsStateMapper$map$1.L$1 = arrayList;
                        detailsCardUserRequirementsStateMapper$map$1.L$2 = obj8;
                        detailsCardUserRequirementsStateMapper$map$1.L$3 = obj8;
                        detailsCardUserRequirementsStateMapper$map$1.L$4 = arrayList2;
                        detailsCardUserRequirementsStateMapper$map$1.L$5 = it;
                        detailsCardUserRequirementsStateMapper$map$1.L$6 = obj8;
                        detailsCardUserRequirementsStateMapper$map$1.L$7 = orderDetailsCardResponse$CardElement$UserRequirementElement;
                        detailsCardUserRequirementsStateMapper$map$1.L$8 = arrayList2;
                        detailsCardUserRequirementsStateMapper$map$1.L$9 = obj8;
                        detailsCardUserRequirementsStateMapper$map$1.L$10 = obj8;
                        detailsCardUserRequirementsStateMapper$map$1.L$11 = obj8;
                        detailsCardUserRequirementsStateMapper$map$1.L$12 = obj8;
                        detailsCardUserRequirementsStateMapper$map$1.L$13 = obj8;
                        detailsCardUserRequirementsStateMapper$map$1.L$14 = obj8;
                        detailsCardUserRequirementsStateMapper$map$1.L$15 = obj8;
                        detailsCardUserRequirementsStateMapper$map$1.I$0 = i14;
                        detailsCardUserRequirementsStateMapper$map$1.I$1 = i2;
                        detailsCardUserRequirementsStateMapper$map$1.label = 1;
                        Object a = cVar2.b.a(i1Var, detailsCardUserRequirementsStateMapper$map$1);
                        if (a != coroutineSingletons) {
                            arrayList3 = arrayList;
                            i3 = i14;
                            it2 = it;
                            collection2 = arrayList2;
                            obj4 = a;
                            collection = collection2;
                            f fVar32 = (f) obj4;
                            formattedText2 = orderDetailsCardResponse$CardElement$UserRequirementElement.d;
                            if (formattedText2 != null) {
                                detailsCardUserRequirementsStateMapper$map$1.L$0 = null;
                                detailsCardUserRequirementsStateMapper$map$1.L$1 = arrayList3;
                                detailsCardUserRequirementsStateMapper$map$1.L$2 = null;
                                detailsCardUserRequirementsStateMapper$map$1.L$3 = null;
                                detailsCardUserRequirementsStateMapper$map$1.L$4 = collection;
                                detailsCardUserRequirementsStateMapper$map$1.L$5 = it2;
                                detailsCardUserRequirementsStateMapper$map$1.L$6 = null;
                                detailsCardUserRequirementsStateMapper$map$1.L$7 = orderDetailsCardResponse$CardElement$UserRequirementElement;
                                detailsCardUserRequirementsStateMapper$map$1.L$8 = fVar32;
                                detailsCardUserRequirementsStateMapper$map$1.L$9 = null;
                                detailsCardUserRequirementsStateMapper$map$1.L$10 = collection2;
                                detailsCardUserRequirementsStateMapper$map$1.I$0 = i3;
                                detailsCardUserRequirementsStateMapper$map$1.I$1 = i2;
                                detailsCardUserRequirementsStateMapper$map$1.label = 2;
                                Object i15 = ru.yandex.taxi.widget.c.i(cVar3, formattedText2, null, detailsCardUserRequirementsStateMapper$map$1, 30);
                                if (i15 != coroutineSingletons) {
                                    OrderDetailsCardResponse$CardElement$UserRequirementElement orderDetailsCardResponse$CardElement$UserRequirementElement6 = orderDetailsCardResponse$CardElement$UserRequirementElement;
                                    fVar = fVar32;
                                    obj3 = i15;
                                    arrayList9 = arrayList3;
                                    r12 = collection;
                                    it3 = it2;
                                    orderDetailsCardResponse$CardElement$UserRequirementElement2 = orderDetailsCardResponse$CardElement$UserRequirementElement6;
                                    charSequence4 = (CharSequence) obj3;
                                    if (charSequence4 != null) {
                                        fVar32 = fVar;
                                        orderDetailsCardResponse$CardElement$UserRequirementElement = orderDetailsCardResponse$CardElement$UserRequirementElement2;
                                        it2 = it3;
                                        collection = r12;
                                        arrayList3 = arrayList9;
                                    } else {
                                        int i16 = i2;
                                        charSequence = charSequence4;
                                        i4 = i16;
                                        arrayList4 = arrayList9;
                                        formattedText = orderDetailsCardResponse$CardElement$UserRequirementElement2.e;
                                        if (formattedText != null) {
                                            detailsCardUserRequirementsStateMapper$map$1.L$0 = null;
                                            detailsCardUserRequirementsStateMapper$map$1.L$1 = arrayList4;
                                            detailsCardUserRequirementsStateMapper$map$1.L$2 = null;
                                            detailsCardUserRequirementsStateMapper$map$1.L$3 = null;
                                            detailsCardUserRequirementsStateMapper$map$1.L$4 = r12;
                                            detailsCardUserRequirementsStateMapper$map$1.L$5 = it3;
                                            detailsCardUserRequirementsStateMapper$map$1.L$6 = null;
                                            detailsCardUserRequirementsStateMapper$map$1.L$7 = orderDetailsCardResponse$CardElement$UserRequirementElement2;
                                            detailsCardUserRequirementsStateMapper$map$1.L$8 = fVar;
                                            detailsCardUserRequirementsStateMapper$map$1.L$9 = null;
                                            detailsCardUserRequirementsStateMapper$map$1.L$10 = charSequence;
                                            detailsCardUserRequirementsStateMapper$map$1.L$11 = collection2;
                                            detailsCardUserRequirementsStateMapper$map$1.I$0 = i3;
                                            detailsCardUserRequirementsStateMapper$map$1.I$1 = i4;
                                            i5 = i4;
                                            detailsCardUserRequirementsStateMapper$map$1.label = 3;
                                            obj2 = ru.yandex.taxi.widget.c.i(cVar3, formattedText, null, detailsCardUserRequirementsStateMapper$map$1, 30);
                                            arrayList8 = arrayList4;
                                        } else {
                                            i5 = i4;
                                            arrayList5 = arrayList4;
                                            f fVar62 = fVar;
                                            charSequence2 = charSequence;
                                            arrayList6 = r12;
                                            it4 = it3;
                                            fVar2 = fVar62;
                                            collection3 = collection2;
                                            orderDetailsCardResponse$CardElement$UserRequirementElement3 = orderDetailsCardResponse$CardElement$UserRequirementElement2;
                                            charSequence3 = "";
                                            arrayList7 = arrayList5;
                                            i6 = i3;
                                            int i1122 = i5;
                                            OrderDetailsCardResponse.CardIcon cardIcon22 = orderDetailsCardResponse$CardElement$UserRequirementElement3.b;
                                            String str6 = cardIcon22 != null ? cardIcon22.b : null;
                                            str = orderDetailsCardResponse$CardElement$UserRequirementElement3.a;
                                            if (str == null) {
                                                str = charSequence2.toString();
                                            }
                                            cVar = cVar3;
                                            detailsCardUserRequirementsStateMapper$map$1.L$0 = null;
                                            detailsCardUserRequirementsStateMapper$map$1.L$1 = arrayList7;
                                            detailsCardUserRequirementsStateMapper$map$1.L$2 = null;
                                            detailsCardUserRequirementsStateMapper$map$1.L$3 = null;
                                            detailsCardUserRequirementsStateMapper$map$1.L$4 = arrayList6;
                                            detailsCardUserRequirementsStateMapper$map$1.L$5 = it4;
                                            detailsCardUserRequirementsStateMapper$map$1.L$6 = null;
                                            detailsCardUserRequirementsStateMapper$map$1.L$7 = null;
                                            detailsCardUserRequirementsStateMapper$map$1.L$8 = fVar2;
                                            detailsCardUserRequirementsStateMapper$map$1.L$9 = null;
                                            detailsCardUserRequirementsStateMapper$map$1.L$10 = str6;
                                            detailsCardUserRequirementsStateMapper$map$1.L$11 = null;
                                            detailsCardUserRequirementsStateMapper$map$1.L$12 = charSequence3;
                                            detailsCardUserRequirementsStateMapper$map$1.L$13 = charSequence2;
                                            detailsCardUserRequirementsStateMapper$map$1.L$14 = str;
                                            detailsCardUserRequirementsStateMapper$map$1.L$15 = collection3;
                                            detailsCardUserRequirementsStateMapper$map$1.I$0 = i6;
                                            detailsCardUserRequirementsStateMapper$map$1.I$1 = i1122;
                                            detailsCardUserRequirementsStateMapper$map$1.label = 4;
                                            themeType = null;
                                            f = e.f(cVar2.a, str6, null, detailsCardUserRequirementsStateMapper$map$1, 6);
                                            if (f != coroutineSingletons) {
                                                str5 = str6;
                                                str4 = str;
                                                i13 = i1122;
                                                obj7 = f;
                                                arrayList10 = arrayList7;
                                                arrayList11 = arrayList6;
                                                CharSequence charSequence62 = charSequence2;
                                                CharSequence charSequence72 = charSequence3;
                                                f fVar72 = fVar2;
                                                i2 = i6;
                                                Drawable drawable2 = (Drawable) obj7;
                                                if (str5 == null) {
                                                }
                                                collection3.add(new us21(str4, charSequence62, charSequence72, pkf.g(drawable2, str5, themeType), new DetailsCardListItem.a(0, 0, false, false, fVar72, 31), i13 >= arrayList10.size() + (-1)));
                                                arrayList = arrayList10;
                                                it = it4;
                                                arrayList2 = arrayList11;
                                                cVar3 = cVar;
                                                obj = null;
                                                cVar2 = this;
                                                if (it.hasNext()) {
                                                    return new vs21(arrayList2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            arrayList4 = arrayList3;
                            r12 = collection;
                            it3 = it2;
                            orderDetailsCardResponse$CardElement$UserRequirementElement2 = orderDetailsCardResponse$CardElement$UserRequirementElement;
                            fVar = fVar32;
                            i4 = i2;
                            charSequence = "";
                            formattedText = orderDetailsCardResponse$CardElement$UserRequirementElement2.e;
                            if (formattedText != null) {
                            }
                        }
                        return coroutineSingletons;
                    }
                }
            }
        }
        detailsCardUserRequirementsStateMapper$map$1 = new DetailsCardUserRequirementsStateMapper$map$1(cVar2, continuationImpl);
        Object obj52 = detailsCardUserRequirementsStateMapper$map$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailsCardUserRequirementsStateMapper$map$1.label;
        ru.yandex.taxi.widget.c cVar32 = cVar2.c;
        if (i != 0) {
        }
    }
}
