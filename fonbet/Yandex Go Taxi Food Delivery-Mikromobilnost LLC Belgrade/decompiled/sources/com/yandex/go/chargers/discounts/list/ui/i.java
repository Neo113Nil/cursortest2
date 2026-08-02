package com.yandex.go.chargers.discounts.list.ui;

import com.yandex.go.chargers.discounts.api.data.model.ChargersDiscountDto;
import com.yandex.go.chargers.discounts.data.models.ChargersDiscountNotificationDto;
import com.yandex.go.chargers.discounts.data.models.ChargersDiscountsButtonDto;
import com.yandex.go.chargers.discounts.data.models.ChargersDiscountsButtonDto$ChargersPromocodesAction$DeeplinkAction;
import com.yandex.go.chargers.discounts.data.models.ChargersDiscountsEmptyStateDto;
import com.yandex.go.chargers.discounts.data.models.ChargersDiscountsItemDto$ProgressDiscountItemDto;
import com.yandex.go.chargers.discounts.data.models.ChargersDiscountsListResponse;
import com.yandex.go.chargers.discounts.data.models.ChargersDiscountsTabDto;
import com.yandex.go.chargers.discounts.data.models.ChargersDiscountsTypeDto;
import com.yandex.go.chargers.discounts.data.models.a0;
import com.yandex.go.chargers.discounts.data.models.n;
import com.yandex.go.chargers.discounts.data.models.q;
import defpackage.aw9;
import defpackage.gw9;
import defpackage.ir9;
import defpackage.jl40;
import defpackage.kr9;
import defpackage.lr9;
import defpackage.mja1;
import defpackage.nvi0;
import defpackage.ny61;
import defpackage.ovi0;
import defpackage.ow9;
import defpackage.tcc;
import defpackage.tj9;
import defpackage.tu9;
import defpackage.uo9;
import defpackage.vv9;
import defpackage.wv9;
import defpackage.xng0;
import defpackage.xv9;
import defpackage.ycc;
import defpackage.yu9;
import defpackage.yv9;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes12.dex */
public final class i {
    public final ru.yandex.taxi.widget.utils.e a;
    public final ru.yandex.taxi.widget.c b;
    public final com.yandex.go.chargers.discounts.data.mappers.b c;

    public i(ru.yandex.taxi.widget.utils.e eVar, ru.yandex.taxi.widget.c cVar, com.yandex.go.chargers.discounts.data.mappers.b bVar) {
        this.a = eVar;
        this.b = cVar;
        this.c = bVar;
    }

    public static ChargersDiscountsListUiState$Content$DiscountsTabType b(ChargersDiscountsTabDto chargersDiscountsTabDto) {
        ChargersDiscountsTypeDto chargersDiscountsTypeDto = chargersDiscountsTabDto.a;
        int i = chargersDiscountsTypeDto == null ? -1 : gw9.a[chargersDiscountsTypeDto.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? ChargersDiscountsListUiState$Content$DiscountsTabType.RENTAL_PROMO : ChargersDiscountsListUiState$Content$DiscountsTabType.TASKS : ChargersDiscountsListUiState$Content$DiscountsTabType.PARTNER_PROMO : ChargersDiscountsListUiState$Content$DiscountsTabType.RENTAL_PROMO;
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x016b, code lost:
    
        if (r2 == r3) goto L109;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0370 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[LOOP:0: B:16:0x0333->B:42:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x036f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Type inference failed for: r1v40, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v58, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r23v0, types: [com.yandex.go.chargers.discounts.list.ui.i] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(yu9 yu9Var, ChargersDiscountsListUiState$Content$DiscountsTabType chargersDiscountsListUiState$Content$DiscountsTabType, Set set, ow9 ow9Var, ContinuationImpl continuationImpl) {
        ChargersDiscountsListUiStateMapper$map$1 chargersDiscountsListUiStateMapper$map$1;
        int i;
        Object obj;
        ChargersDiscountsListUiState$Content$DiscountsTabType chargersDiscountsListUiState$Content$DiscountsTabType2;
        Set set2;
        yu9 yu9Var2;
        CharSequence charSequence;
        nvi0 nvi0Var;
        CharSequence charSequence2;
        FormattedText formattedText;
        String str;
        ChargersDiscountsButtonDto chargersDiscountsButtonDto;
        CharSequence charSequence3;
        CharSequence charSequence4;
        yu9 yu9Var3;
        Object e;
        yu9 yu9Var4;
        ChargersDiscountsListUiState$Content$DiscountsTabType chargersDiscountsListUiState$Content$DiscountsTabType3;
        Set set3;
        List list;
        Iterator it;
        ChargersDiscountsButtonDto chargersDiscountsButtonDto2;
        CharSequence charSequence5;
        uo9 uo9Var;
        ArrayList arrayList;
        ChargersDiscountNotificationDto chargersDiscountNotificationDto;
        uo9 uo9Var2;
        CharSequence charSequence6;
        vv9 vv9Var;
        uo9 uo9Var3;
        CharSequence charSequence7;
        yu9 yu9Var5;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Iterator it2;
        ChargersDiscountDto chargersDiscountDto;
        ArrayList arrayList4;
        yu9 yu9Var6 = yu9Var;
        if (continuationImpl instanceof ChargersDiscountsListUiStateMapper$map$1) {
            chargersDiscountsListUiStateMapper$map$1 = (ChargersDiscountsListUiStateMapper$map$1) continuationImpl;
            int i2 = chargersDiscountsListUiStateMapper$map$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersDiscountsListUiStateMapper$map$1.label = i2 - Integer.MIN_VALUE;
                ChargersDiscountsListUiStateMapper$map$1 chargersDiscountsListUiStateMapper$map$12 = chargersDiscountsListUiStateMapper$map$1;
                Object obj2 = chargersDiscountsListUiStateMapper$map$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersDiscountsListUiStateMapper$map$12.label;
                EmptyList emptyList = EmptyList.a;
                uo9 uo9Var4 = null;
                switch (i) {
                    case 0:
                        kotlin.b.b(obj2);
                        ChargersDiscountsListResponse chargersDiscountsListResponse = yu9Var6.a;
                        List list2 = chargersDiscountsListResponse.c;
                        ArrayList arrayList5 = new ArrayList();
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            List list3 = ((ChargersDiscountsTabDto) it3.next()).d;
                            if (list3 == null) {
                                list3 = emptyList;
                            }
                            ycc.r(list3, arrayList5);
                        }
                        if (arrayList5.isEmpty()) {
                            FormattedText formattedText2 = chargersDiscountsListResponse.a;
                            chargersDiscountsListUiStateMapper$map$12.L$0 = yu9Var6;
                            chargersDiscountsListUiStateMapper$map$12.L$1 = null;
                            chargersDiscountsListUiStateMapper$map$12.L$2 = null;
                            chargersDiscountsListUiStateMapper$map$12.L$3 = null;
                            chargersDiscountsListUiStateMapper$map$12.L$4 = null;
                            chargersDiscountsListUiStateMapper$map$12.label = 1;
                            obj2 = ru.yandex.taxi.widget.c.e(this.b, formattedText2, null, false, chargersDiscountsListUiStateMapper$map$12, 30);
                            break;
                        } else {
                            List list4 = chargersDiscountsListResponse.c;
                            chargersDiscountsListUiStateMapper$map$12.L$0 = yu9Var6;
                            chargersDiscountsListUiStateMapper$map$12.L$1 = chargersDiscountsListUiState$Content$DiscountsTabType;
                            chargersDiscountsListUiStateMapper$map$12.L$2 = set;
                            chargersDiscountsListUiStateMapper$map$12.L$3 = null;
                            chargersDiscountsListUiStateMapper$map$12.L$4 = null;
                            chargersDiscountsListUiStateMapper$map$12.label = 4;
                            Object e2 = e(list4, ow9Var, chargersDiscountsListUiStateMapper$map$12);
                            if (e2 != coroutineSingletons) {
                                obj = e2;
                                chargersDiscountsListUiState$Content$DiscountsTabType2 = chargersDiscountsListUiState$Content$DiscountsTabType;
                                set2 = set;
                                List list5 = (List) obj;
                                FormattedText formattedText3 = yu9Var6.a.a;
                                chargersDiscountsListUiStateMapper$map$12.L$0 = yu9Var6;
                                chargersDiscountsListUiStateMapper$map$12.L$1 = chargersDiscountsListUiState$Content$DiscountsTabType2;
                                chargersDiscountsListUiStateMapper$map$12.L$2 = set2;
                                chargersDiscountsListUiStateMapper$map$12.L$3 = null;
                                chargersDiscountsListUiStateMapper$map$12.L$4 = null;
                                chargersDiscountsListUiStateMapper$map$12.L$5 = list5;
                                chargersDiscountsListUiStateMapper$map$12.label = 5;
                                e = ru.yandex.taxi.widget.c.e(this.b, formattedText3, null, false, chargersDiscountsListUiStateMapper$map$12, 30);
                                if (e != coroutineSingletons) {
                                    yu9Var4 = yu9Var6;
                                    chargersDiscountsListUiState$Content$DiscountsTabType3 = chargersDiscountsListUiState$Content$DiscountsTabType2;
                                    obj2 = e;
                                    set3 = set2;
                                    list = list5;
                                    CharSequence charSequence8 = (CharSequence) obj2;
                                    ArrayList arrayList6 = new ArrayList();
                                    for (Object obj3 : list) {
                                        List list6 = ((xv9) obj3).d;
                                        if (list6 != null && !list6.isEmpty()) {
                                            arrayList6.add(obj3);
                                        }
                                    }
                                    ArrayList arrayList7 = new ArrayList(tcc.n(arrayList6, 10));
                                    it = arrayList6.iterator();
                                    while (it.hasNext()) {
                                        xv9 xv9Var = (xv9) it.next();
                                        ChargersDiscountsListUiState$Content$DiscountsTabType chargersDiscountsListUiState$Content$DiscountsTabType4 = xv9Var.a;
                                        CharSequence charSequence9 = xv9Var.b;
                                        boolean z = chargersDiscountsListUiState$Content$DiscountsTabType3 == chargersDiscountsListUiState$Content$DiscountsTabType4;
                                        boolean z2 = !set3.contains(chargersDiscountsListUiState$Content$DiscountsTabType4) && xv9Var.c > 0;
                                        int i3 = xv9Var.c;
                                        ?? r9 = xv9Var.d;
                                        arrayList7.add(new wv9(chargersDiscountsListUiState$Content$DiscountsTabType4, charSequence9, z, z2, i3, r9 == 0 ? emptyList : r9));
                                    }
                                    chargersDiscountsButtonDto2 = yu9Var4.a.e;
                                    if (chargersDiscountsButtonDto2 == null) {
                                        chargersDiscountsListUiStateMapper$map$12.L$0 = yu9Var4;
                                        chargersDiscountsListUiStateMapper$map$12.L$1 = null;
                                        chargersDiscountsListUiStateMapper$map$12.L$2 = null;
                                        chargersDiscountsListUiStateMapper$map$12.L$3 = null;
                                        chargersDiscountsListUiStateMapper$map$12.L$4 = null;
                                        chargersDiscountsListUiStateMapper$map$12.L$5 = null;
                                        chargersDiscountsListUiStateMapper$map$12.L$6 = charSequence8;
                                        chargersDiscountsListUiStateMapper$map$12.L$7 = arrayList7;
                                        chargersDiscountsListUiStateMapper$map$12.label = 6;
                                        Object c = c(chargersDiscountsButtonDto2, chargersDiscountsListUiStateMapper$map$12);
                                        if (c != coroutineSingletons) {
                                            charSequence5 = charSequence8;
                                            obj2 = c;
                                            arrayList2 = arrayList7;
                                            uo9Var = (uo9) obj2;
                                            arrayList = arrayList2;
                                            chargersDiscountNotificationDto = yu9Var4.a.b;
                                            if (chargersDiscountNotificationDto == null) {
                                                uo9Var2 = uo9Var;
                                                charSequence6 = charSequence5;
                                                vv9Var = null;
                                                arrayList3 = arrayList;
                                                ArrayList arrayList8 = arrayList3;
                                                it2 = yu9Var4.a.c.iterator();
                                                while (true) {
                                                    if (it2.hasNext()) {
                                                    }
                                                }
                                                return new yv9(yu9Var4.b, charSequence6, arrayList8, uo9Var2, vv9Var, chargersDiscountDto != null ? new ir9(chargersDiscountDto.a, chargersDiscountDto.b, null) : null);
                                            }
                                            chargersDiscountsListUiStateMapper$map$12.L$0 = yu9Var4;
                                            chargersDiscountsListUiStateMapper$map$12.L$1 = null;
                                            chargersDiscountsListUiStateMapper$map$12.L$2 = null;
                                            chargersDiscountsListUiStateMapper$map$12.L$3 = null;
                                            chargersDiscountsListUiStateMapper$map$12.L$4 = null;
                                            chargersDiscountsListUiStateMapper$map$12.L$5 = null;
                                            chargersDiscountsListUiStateMapper$map$12.L$6 = charSequence5;
                                            chargersDiscountsListUiStateMapper$map$12.L$7 = arrayList;
                                            chargersDiscountsListUiStateMapper$map$12.L$8 = uo9Var;
                                            chargersDiscountsListUiStateMapper$map$12.label = 7;
                                            Object d = d(chargersDiscountNotificationDto, chargersDiscountsListUiStateMapper$map$12);
                                            if (d != coroutineSingletons) {
                                                uo9 uo9Var5 = uo9Var;
                                                obj2 = d;
                                                uo9Var3 = uo9Var5;
                                                charSequence7 = charSequence5;
                                                yu9Var5 = yu9Var4;
                                                arrayList4 = arrayList;
                                                uo9Var2 = uo9Var3;
                                                vv9Var = (vv9) obj2;
                                                charSequence6 = charSequence7;
                                                yu9Var4 = yu9Var5;
                                                arrayList3 = arrayList4;
                                                ArrayList arrayList82 = arrayList3;
                                                it2 = yu9Var4.a.c.iterator();
                                                while (true) {
                                                    if (it2.hasNext()) {
                                                        List list7 = ((ChargersDiscountsTabDto) it2.next()).d;
                                                        if (list7 != null) {
                                                            ArrayList arrayList9 = new ArrayList();
                                                            for (Object obj4 : list7) {
                                                                if (obj4 instanceof ChargersDiscountsItemDto$ProgressDiscountItemDto) {
                                                                    arrayList9.add(obj4);
                                                                }
                                                            }
                                                            ChargersDiscountsItemDto$ProgressDiscountItemDto chargersDiscountsItemDto$ProgressDiscountItemDto = (ChargersDiscountsItemDto$ProgressDiscountItemDto) kotlin.collections.a.R(arrayList9);
                                                            if (chargersDiscountsItemDto$ProgressDiscountItemDto != null) {
                                                                chargersDiscountDto = chargersDiscountsItemDto$ProgressDiscountItemDto.a;
                                                                if (chargersDiscountDto == null) {
                                                                }
                                                            }
                                                        }
                                                        chargersDiscountDto = null;
                                                        if (chargersDiscountDto == null) {
                                                        }
                                                    } else {
                                                        chargersDiscountDto = null;
                                                    }
                                                }
                                                return new yv9(yu9Var4.b, charSequence6, arrayList82, uo9Var2, vv9Var, chargersDiscountDto != null ? new ir9(chargersDiscountDto.a, chargersDiscountDto.b, null) : null);
                                            }
                                        }
                                    } else {
                                        charSequence5 = charSequence8;
                                        uo9Var = null;
                                        arrayList = arrayList7;
                                        chargersDiscountNotificationDto = yu9Var4.a.b;
                                        if (chargersDiscountNotificationDto == null) {
                                        }
                                    }
                                }
                            }
                        }
                        return coroutineSingletons;
                    case 1:
                        yu9Var6 = (yu9) chargersDiscountsListUiStateMapper$map$12.L$0;
                        kotlin.b.b(obj2);
                        CharSequence charSequence10 = (CharSequence) obj2;
                        ChargersDiscountsEmptyStateDto chargersDiscountsEmptyStateDto = yu9Var6.a.d;
                        ovi0 a = (chargersDiscountsEmptyStateDto == null || (str = chargersDiscountsEmptyStateDto.a) == null) ? null : mja1.a(str, null, 6);
                        ChargersDiscountsEmptyStateDto chargersDiscountsEmptyStateDto2 = yu9Var6.a.d;
                        if (chargersDiscountsEmptyStateDto2 != null && (formattedText = chargersDiscountsEmptyStateDto2.b) != null) {
                            chargersDiscountsListUiStateMapper$map$12.L$0 = yu9Var6;
                            chargersDiscountsListUiStateMapper$map$12.L$1 = null;
                            chargersDiscountsListUiStateMapper$map$12.L$2 = null;
                            chargersDiscountsListUiStateMapper$map$12.L$3 = null;
                            chargersDiscountsListUiStateMapper$map$12.L$4 = null;
                            chargersDiscountsListUiStateMapper$map$12.L$5 = null;
                            chargersDiscountsListUiStateMapper$map$12.L$6 = charSequence10;
                            chargersDiscountsListUiStateMapper$map$12.L$7 = a;
                            chargersDiscountsListUiStateMapper$map$12.label = 2;
                            Object e3 = ru.yandex.taxi.widget.c.e(this.b, formattedText, null, false, chargersDiscountsListUiStateMapper$map$12, 30);
                            if (e3 != coroutineSingletons) {
                                charSequence = charSequence10;
                                obj2 = e3;
                                yu9Var2 = yu9Var6;
                                nvi0Var = a;
                                charSequence2 = (CharSequence) obj2;
                                chargersDiscountsButtonDto = yu9Var2.a.e;
                                if (chargersDiscountsButtonDto != null) {
                                }
                                return new aw9(charSequence, nvi0Var, charSequence2, uo9Var4, yu9Var2.a.b == null);
                            }
                            return coroutineSingletons;
                        }
                        yu9Var2 = yu9Var6;
                        charSequence = charSequence10;
                        nvi0Var = a;
                        charSequence2 = null;
                        chargersDiscountsButtonDto = yu9Var2.a.e;
                        if (chargersDiscountsButtonDto != null) {
                            chargersDiscountsListUiStateMapper$map$12.L$0 = yu9Var2;
                            chargersDiscountsListUiStateMapper$map$12.L$1 = null;
                            chargersDiscountsListUiStateMapper$map$12.L$2 = null;
                            chargersDiscountsListUiStateMapper$map$12.L$3 = null;
                            chargersDiscountsListUiStateMapper$map$12.L$4 = null;
                            chargersDiscountsListUiStateMapper$map$12.L$5 = charSequence;
                            chargersDiscountsListUiStateMapper$map$12.L$6 = nvi0Var;
                            chargersDiscountsListUiStateMapper$map$12.L$7 = charSequence2;
                            chargersDiscountsListUiStateMapper$map$12.label = 3;
                            Object c2 = c(chargersDiscountsButtonDto, chargersDiscountsListUiStateMapper$map$12);
                            if (c2 != coroutineSingletons) {
                                CharSequence charSequence11 = charSequence2;
                                obj2 = c2;
                                charSequence3 = charSequence11;
                                charSequence4 = charSequence;
                                yu9Var3 = yu9Var2;
                                uo9Var4 = (uo9) obj2;
                                charSequence2 = charSequence3;
                                yu9Var2 = yu9Var3;
                                charSequence = charSequence4;
                            }
                            return coroutineSingletons;
                        }
                        return new aw9(charSequence, nvi0Var, charSequence2, uo9Var4, yu9Var2.a.b == null);
                    case 2:
                        nvi0Var = (nvi0) chargersDiscountsListUiStateMapper$map$12.L$7;
                        charSequence = (CharSequence) chargersDiscountsListUiStateMapper$map$12.L$6;
                        yu9Var2 = (yu9) chargersDiscountsListUiStateMapper$map$12.L$0;
                        kotlin.b.b(obj2);
                        charSequence2 = (CharSequence) obj2;
                        chargersDiscountsButtonDto = yu9Var2.a.e;
                        if (chargersDiscountsButtonDto != null) {
                        }
                        return new aw9(charSequence, nvi0Var, charSequence2, uo9Var4, yu9Var2.a.b == null);
                    case 3:
                        charSequence3 = (CharSequence) chargersDiscountsListUiStateMapper$map$12.L$7;
                        nvi0Var = (nvi0) chargersDiscountsListUiStateMapper$map$12.L$6;
                        charSequence4 = (CharSequence) chargersDiscountsListUiStateMapper$map$12.L$5;
                        yu9Var3 = (yu9) chargersDiscountsListUiStateMapper$map$12.L$0;
                        kotlin.b.b(obj2);
                        uo9Var4 = (uo9) obj2;
                        charSequence2 = charSequence3;
                        yu9Var2 = yu9Var3;
                        charSequence = charSequence4;
                        return new aw9(charSequence, nvi0Var, charSequence2, uo9Var4, yu9Var2.a.b == null);
                    case 4:
                        Set set4 = (Set) chargersDiscountsListUiStateMapper$map$12.L$2;
                        ChargersDiscountsListUiState$Content$DiscountsTabType chargersDiscountsListUiState$Content$DiscountsTabType5 = (ChargersDiscountsListUiState$Content$DiscountsTabType) chargersDiscountsListUiStateMapper$map$12.L$1;
                        yu9 yu9Var7 = (yu9) chargersDiscountsListUiStateMapper$map$12.L$0;
                        kotlin.b.b(obj2);
                        obj = obj2;
                        chargersDiscountsListUiState$Content$DiscountsTabType2 = chargersDiscountsListUiState$Content$DiscountsTabType5;
                        set2 = set4;
                        yu9Var6 = yu9Var7;
                        List list52 = (List) obj;
                        FormattedText formattedText32 = yu9Var6.a.a;
                        chargersDiscountsListUiStateMapper$map$12.L$0 = yu9Var6;
                        chargersDiscountsListUiStateMapper$map$12.L$1 = chargersDiscountsListUiState$Content$DiscountsTabType2;
                        chargersDiscountsListUiStateMapper$map$12.L$2 = set2;
                        chargersDiscountsListUiStateMapper$map$12.L$3 = null;
                        chargersDiscountsListUiStateMapper$map$12.L$4 = null;
                        chargersDiscountsListUiStateMapper$map$12.L$5 = list52;
                        chargersDiscountsListUiStateMapper$map$12.label = 5;
                        e = ru.yandex.taxi.widget.c.e(this.b, formattedText32, null, false, chargersDiscountsListUiStateMapper$map$12, 30);
                        if (e != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 5:
                        list = (List) chargersDiscountsListUiStateMapper$map$12.L$5;
                        set3 = (Set) chargersDiscountsListUiStateMapper$map$12.L$2;
                        ChargersDiscountsListUiState$Content$DiscountsTabType chargersDiscountsListUiState$Content$DiscountsTabType6 = (ChargersDiscountsListUiState$Content$DiscountsTabType) chargersDiscountsListUiStateMapper$map$12.L$1;
                        yu9 yu9Var8 = (yu9) chargersDiscountsListUiStateMapper$map$12.L$0;
                        kotlin.b.b(obj2);
                        chargersDiscountsListUiState$Content$DiscountsTabType3 = chargersDiscountsListUiState$Content$DiscountsTabType6;
                        yu9Var4 = yu9Var8;
                        CharSequence charSequence82 = (CharSequence) obj2;
                        ArrayList arrayList62 = new ArrayList();
                        while (r1.hasNext()) {
                        }
                        ArrayList arrayList72 = new ArrayList(tcc.n(arrayList62, 10));
                        it = arrayList62.iterator();
                        while (it.hasNext()) {
                        }
                        chargersDiscountsButtonDto2 = yu9Var4.a.e;
                        if (chargersDiscountsButtonDto2 == null) {
                        }
                        break;
                    case 6:
                        ?? r1 = (List) chargersDiscountsListUiStateMapper$map$12.L$7;
                        charSequence5 = (CharSequence) chargersDiscountsListUiStateMapper$map$12.L$6;
                        yu9Var4 = (yu9) chargersDiscountsListUiStateMapper$map$12.L$0;
                        kotlin.b.b(obj2);
                        arrayList2 = r1;
                        uo9Var = (uo9) obj2;
                        arrayList = arrayList2;
                        chargersDiscountNotificationDto = yu9Var4.a.b;
                        if (chargersDiscountNotificationDto == null) {
                        }
                        break;
                    case 7:
                        uo9Var3 = (uo9) chargersDiscountsListUiStateMapper$map$12.L$8;
                        ?? r12 = (List) chargersDiscountsListUiStateMapper$map$12.L$7;
                        charSequence7 = (CharSequence) chargersDiscountsListUiStateMapper$map$12.L$6;
                        yu9Var5 = (yu9) chargersDiscountsListUiStateMapper$map$12.L$0;
                        kotlin.b.b(obj2);
                        arrayList4 = r12;
                        uo9Var2 = uo9Var3;
                        vv9Var = (vv9) obj2;
                        charSequence6 = charSequence7;
                        yu9Var4 = yu9Var5;
                        arrayList3 = arrayList4;
                        ArrayList arrayList822 = arrayList3;
                        it2 = yu9Var4.a.c.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                            }
                        }
                        return new yv9(yu9Var4.b, charSequence6, arrayList822, uo9Var2, vv9Var, chargersDiscountDto != null ? new ir9(chargersDiscountDto.a, chargersDiscountDto.b, null) : null);
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        chargersDiscountsListUiStateMapper$map$1 = new ChargersDiscountsListUiStateMapper$map$1(this, continuationImpl);
        ChargersDiscountsListUiStateMapper$map$1 chargersDiscountsListUiStateMapper$map$122 = chargersDiscountsListUiStateMapper$map$1;
        Object obj22 = chargersDiscountsListUiStateMapper$map$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersDiscountsListUiStateMapper$map$122.label;
        EmptyList emptyList2 = EmptyList.a;
        uo9 uo9Var42 = null;
        switch (i) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0057, code lost:
    
        if (r13 == r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ChargersDiscountsButtonDto chargersDiscountsButtonDto, ContinuationImpl continuationImpl) {
        ChargersDiscountsListUiStateMapper$mapToChargersButton$1 chargersDiscountsListUiStateMapper$mapToChargersButton$1;
        int i;
        CharSequence charSequence;
        CharSequence charSequence2;
        if (continuationImpl instanceof ChargersDiscountsListUiStateMapper$mapToChargersButton$1) {
            chargersDiscountsListUiStateMapper$mapToChargersButton$1 = (ChargersDiscountsListUiStateMapper$mapToChargersButton$1) continuationImpl;
            int i2 = chargersDiscountsListUiStateMapper$mapToChargersButton$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersDiscountsListUiStateMapper$mapToChargersButton$1.label = i2 - Integer.MIN_VALUE;
                ChargersDiscountsListUiStateMapper$mapToChargersButton$1 chargersDiscountsListUiStateMapper$mapToChargersButton$12 = chargersDiscountsListUiStateMapper$mapToChargersButton$1;
                Object obj = chargersDiscountsListUiStateMapper$mapToChargersButton$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersDiscountsListUiStateMapper$mapToChargersButton$12.label;
                CharSequence charSequence3 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    FormattedText formattedText = chargersDiscountsButtonDto.a;
                    chargersDiscountsListUiStateMapper$mapToChargersButton$12.L$0 = chargersDiscountsButtonDto;
                    chargersDiscountsListUiStateMapper$mapToChargersButton$12.label = 1;
                    obj = ru.yandex.taxi.widget.c.e(this.b, formattedText, null, false, chargersDiscountsListUiStateMapper$mapToChargersButton$12, 30);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        charSequence2 = (CharSequence) chargersDiscountsListUiStateMapper$mapToChargersButton$12.L$1;
                        chargersDiscountsButtonDto = (ChargersDiscountsButtonDto) chargersDiscountsListUiStateMapper$mapToChargersButton$12.L$0;
                        kotlin.b.b(obj);
                        charSequence3 = (CharSequence) obj;
                        charSequence = charSequence2;
                        CharSequence charSequence4 = charSequence3;
                        boolean z = chargersDiscountsButtonDto.c;
                        q qVar = chargersDiscountsButtonDto.d;
                        return new uo9(charSequence, charSequence4, z, qVar instanceof ChargersDiscountsButtonDto$ChargersPromocodesAction$DeeplinkAction ? new kr9(((ChargersDiscountsButtonDto$ChargersPromocodesAction$DeeplinkAction) qVar).a) : jl40.l(qVar, n.INSTANCE) ? lr9.a : tj9.a, true, null, false, false, 224);
                    }
                    chargersDiscountsButtonDto = (ChargersDiscountsButtonDto) chargersDiscountsListUiStateMapper$mapToChargersButton$12.L$0;
                    kotlin.b.b(obj);
                }
                CharSequence charSequence5 = (CharSequence) obj;
                if (chargersDiscountsButtonDto.b.d()) {
                    charSequence = charSequence5;
                    CharSequence charSequence42 = charSequence3;
                    boolean z2 = chargersDiscountsButtonDto.c;
                    q qVar2 = chargersDiscountsButtonDto.d;
                    return new uo9(charSequence, charSequence42, z2, qVar2 instanceof ChargersDiscountsButtonDto$ChargersPromocodesAction$DeeplinkAction ? new kr9(((ChargersDiscountsButtonDto$ChargersPromocodesAction$DeeplinkAction) qVar2).a) : jl40.l(qVar2, n.INSTANCE) ? lr9.a : tj9.a, true, null, false, false, 224);
                }
                FormattedText formattedText2 = chargersDiscountsButtonDto.b;
                chargersDiscountsListUiStateMapper$mapToChargersButton$12.L$0 = chargersDiscountsButtonDto;
                chargersDiscountsListUiStateMapper$mapToChargersButton$12.L$1 = charSequence5;
                chargersDiscountsListUiStateMapper$mapToChargersButton$12.label = 2;
                Object e = ru.yandex.taxi.widget.c.e(this.b, formattedText2, null, false, chargersDiscountsListUiStateMapper$mapToChargersButton$12, 30);
                if (e != coroutineSingletons) {
                    obj = e;
                    charSequence2 = charSequence5;
                    charSequence3 = (CharSequence) obj;
                    charSequence = charSequence2;
                    CharSequence charSequence422 = charSequence3;
                    boolean z22 = chargersDiscountsButtonDto.c;
                    q qVar22 = chargersDiscountsButtonDto.d;
                    return new uo9(charSequence, charSequence422, z22, qVar22 instanceof ChargersDiscountsButtonDto$ChargersPromocodesAction$DeeplinkAction ? new kr9(((ChargersDiscountsButtonDto$ChargersPromocodesAction$DeeplinkAction) qVar22).a) : jl40.l(qVar22, n.INSTANCE) ? lr9.a : tj9.a, true, null, false, false, 224);
                }
                return coroutineSingletons;
            }
        }
        chargersDiscountsListUiStateMapper$mapToChargersButton$1 = new ChargersDiscountsListUiStateMapper$mapToChargersButton$1(this, continuationImpl);
        ChargersDiscountsListUiStateMapper$mapToChargersButton$1 chargersDiscountsListUiStateMapper$mapToChargersButton$122 = chargersDiscountsListUiStateMapper$mapToChargersButton$1;
        Object obj2 = chargersDiscountsListUiStateMapper$mapToChargersButton$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersDiscountsListUiStateMapper$mapToChargersButton$122.label;
        CharSequence charSequence32 = null;
        if (i != 0) {
        }
        CharSequence charSequence52 = (CharSequence) obj2;
        if (chargersDiscountsButtonDto.b.d()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
    
        if (r11 == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ChargersDiscountNotificationDto chargersDiscountNotificationDto, ContinuationImpl continuationImpl) {
        ChargersDiscountsListUiStateMapper$mapToDiscountNotification$1 chargersDiscountsListUiStateMapper$mapToDiscountNotification$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object e;
        ChargersDiscountNotificationDto chargersDiscountNotificationDto2;
        CharSequence charSequence;
        if (continuationImpl instanceof ChargersDiscountsListUiStateMapper$mapToDiscountNotification$1) {
            chargersDiscountsListUiStateMapper$mapToDiscountNotification$1 = (ChargersDiscountsListUiStateMapper$mapToDiscountNotification$1) continuationImpl;
            int i2 = chargersDiscountsListUiStateMapper$mapToDiscountNotification$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersDiscountsListUiStateMapper$mapToDiscountNotification$1.label = i2 - Integer.MIN_VALUE;
                ChargersDiscountsListUiStateMapper$mapToDiscountNotification$1 chargersDiscountsListUiStateMapper$mapToDiscountNotification$12 = chargersDiscountsListUiStateMapper$mapToDiscountNotification$1;
                Object obj = chargersDiscountsListUiStateMapper$mapToDiscountNotification$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersDiscountsListUiStateMapper$mapToDiscountNotification$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    FormattedText formattedText = chargersDiscountNotificationDto.a;
                    chargersDiscountsListUiStateMapper$mapToDiscountNotification$12.L$0 = chargersDiscountNotificationDto;
                    chargersDiscountsListUiStateMapper$mapToDiscountNotification$12.label = 1;
                    obj = ru.yandex.taxi.widget.c.e(this.b, formattedText, null, false, chargersDiscountsListUiStateMapper$mapToDiscountNotification$12, 30);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        charSequence = (CharSequence) chargersDiscountsListUiStateMapper$mapToDiscountNotification$12.L$1;
                        chargersDiscountNotificationDto2 = (ChargersDiscountNotificationDto) chargersDiscountsListUiStateMapper$mapToDiscountNotification$12.L$0;
                        kotlin.b.b(obj);
                        CharSequence charSequence2 = (CharSequence) obj;
                        int b = this.a.b(xng0.bgMinor, chargersDiscountNotificationDto2.d);
                        String str = chargersDiscountNotificationDto2.c;
                        return new vv9(charSequence, charSequence2, str != null ? mja1.a(str, null, 6) : null, b);
                    }
                    chargersDiscountNotificationDto = (ChargersDiscountNotificationDto) chargersDiscountsListUiStateMapper$mapToDiscountNotification$12.L$0;
                    kotlin.b.b(obj);
                }
                CharSequence charSequence3 = (CharSequence) obj;
                FormattedText formattedText2 = chargersDiscountNotificationDto.b;
                chargersDiscountsListUiStateMapper$mapToDiscountNotification$12.L$0 = chargersDiscountNotificationDto;
                chargersDiscountsListUiStateMapper$mapToDiscountNotification$12.L$1 = charSequence3;
                chargersDiscountsListUiStateMapper$mapToDiscountNotification$12.label = 2;
                e = ru.yandex.taxi.widget.c.e(this.b, formattedText2, null, false, chargersDiscountsListUiStateMapper$mapToDiscountNotification$12, 30);
                if (e != coroutineSingletons) {
                    chargersDiscountNotificationDto2 = chargersDiscountNotificationDto;
                    charSequence = charSequence3;
                    obj = e;
                    CharSequence charSequence22 = (CharSequence) obj;
                    int b2 = this.a.b(xng0.bgMinor, chargersDiscountNotificationDto2.d);
                    String str2 = chargersDiscountNotificationDto2.c;
                    return new vv9(charSequence, charSequence22, str2 != null ? mja1.a(str2, null, 6) : null, b2);
                }
                return coroutineSingletons;
            }
        }
        chargersDiscountsListUiStateMapper$mapToDiscountNotification$1 = new ChargersDiscountsListUiStateMapper$mapToDiscountNotification$1(this, continuationImpl);
        ChargersDiscountsListUiStateMapper$mapToDiscountNotification$1 chargersDiscountsListUiStateMapper$mapToDiscountNotification$122 = chargersDiscountsListUiStateMapper$mapToDiscountNotification$1;
        Object obj2 = chargersDiscountsListUiStateMapper$mapToDiscountNotification$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersDiscountsListUiStateMapper$mapToDiscountNotification$122.label;
        if (i != 0) {
        }
        CharSequence charSequence32 = (CharSequence) obj2;
        FormattedText formattedText22 = chargersDiscountNotificationDto.b;
        chargersDiscountsListUiStateMapper$mapToDiscountNotification$122.L$0 = chargersDiscountNotificationDto;
        chargersDiscountsListUiStateMapper$mapToDiscountNotification$122.L$1 = charSequence32;
        chargersDiscountsListUiStateMapper$mapToDiscountNotification$122.label = 2;
        e = ru.yandex.taxi.widget.c.e(this.b, formattedText22, null, false, chargersDiscountsListUiStateMapper$mapToDiscountNotification$122, 30);
        if (e != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0150, code lost:
    
        if (r15 == r1) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0150 -> B:11:0x0153). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0101 -> B:13:0x0114). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0162 -> B:20:0x0165). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(List list, ow9 ow9Var, ContinuationImpl continuationImpl) {
        ChargersDiscountsListUiStateMapper$mapToDiscountsTabs$1 chargersDiscountsListUiStateMapper$mapToDiscountsTabs$1;
        int i;
        ArrayList arrayList;
        Iterator it;
        ChargersDiscountsTabDto chargersDiscountsTabDto;
        ChargersDiscountsListUiState$Content$DiscountsTabType chargersDiscountsListUiState$Content$DiscountsTabType;
        ow9 ow9Var2;
        ArrayList arrayList2;
        CharSequence charSequence;
        List list2;
        if (continuationImpl instanceof ChargersDiscountsListUiStateMapper$mapToDiscountsTabs$1) {
            chargersDiscountsListUiStateMapper$mapToDiscountsTabs$1 = (ChargersDiscountsListUiStateMapper$mapToDiscountsTabs$1) continuationImpl;
            int i2 = chargersDiscountsListUiStateMapper$mapToDiscountsTabs$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersDiscountsListUiStateMapper$mapToDiscountsTabs$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersDiscountsListUiStateMapper$mapToDiscountsTabs$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersDiscountsListUiStateMapper$mapToDiscountsTabs$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    arrayList = new ArrayList();
                    it = list.iterator();
                    ChargersDiscountsListUiStateMapper$mapToDiscountsTabs$1 chargersDiscountsListUiStateMapper$mapToDiscountsTabs$12 = chargersDiscountsListUiStateMapper$mapToDiscountsTabs$1;
                    if (it.hasNext()) {
                    }
                } else if (i == 1) {
                    chargersDiscountsListUiState$Content$DiscountsTabType = (ChargersDiscountsListUiState$Content$DiscountsTabType) chargersDiscountsListUiStateMapper$mapToDiscountsTabs$1.L$10;
                    chargersDiscountsTabDto = (ChargersDiscountsTabDto) chargersDiscountsListUiStateMapper$mapToDiscountsTabs$1.L$9;
                    it = (Iterator) chargersDiscountsListUiStateMapper$mapToDiscountsTabs$1.L$6;
                    ?? r6 = (Collection) chargersDiscountsListUiStateMapper$mapToDiscountsTabs$1.L$4;
                    ow9Var2 = (ow9) chargersDiscountsListUiStateMapper$mapToDiscountsTabs$1.L$1;
                    kotlin.b.b(obj);
                    arrayList2 = r6;
                    charSequence = (CharSequence) obj;
                    list2 = chargersDiscountsTabDto.d;
                    if (list2 == null) {
                    }
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Iterator it2 = (Iterator) chargersDiscountsListUiStateMapper$mapToDiscountsTabs$1.L$16;
                    Collection arrayList3 = (Collection) chargersDiscountsListUiStateMapper$mapToDiscountsTabs$1.L$14;
                    CharSequence charSequence2 = (CharSequence) chargersDiscountsListUiStateMapper$mapToDiscountsTabs$1.L$11;
                    ChargersDiscountsListUiState$Content$DiscountsTabType chargersDiscountsListUiState$Content$DiscountsTabType2 = (ChargersDiscountsListUiState$Content$DiscountsTabType) chargersDiscountsListUiStateMapper$mapToDiscountsTabs$1.L$10;
                    ChargersDiscountsTabDto chargersDiscountsTabDto2 = (ChargersDiscountsTabDto) chargersDiscountsListUiStateMapper$mapToDiscountsTabs$1.L$9;
                    Iterator it3 = (Iterator) chargersDiscountsListUiStateMapper$mapToDiscountsTabs$1.L$6;
                    ?? r9 = (Collection) chargersDiscountsListUiStateMapper$mapToDiscountsTabs$1.L$4;
                    ow9 ow9Var3 = (ow9) chargersDiscountsListUiStateMapper$mapToDiscountsTabs$1.L$1;
                    kotlin.b.b(obj);
                    tu9 tu9Var = (tu9) obj;
                    if (tu9Var != null) {
                        arrayList3.add(tu9Var);
                    }
                    if (it2.hasNext()) {
                        List list3 = (List) arrayList3;
                        charSequence = charSequence2;
                        chargersDiscountsListUiState$Content$DiscountsTabType = chargersDiscountsListUiState$Content$DiscountsTabType2;
                        it = it3;
                        ArrayList arrayList4 = r9;
                        Integer num = chargersDiscountsTabDto2.c;
                        arrayList4.add(new xv9(chargersDiscountsListUiState$Content$DiscountsTabType, charSequence, num == null ? num.intValue() : 0, list3));
                        arrayList = arrayList4;
                        ow9Var = ow9Var3;
                        ChargersDiscountsListUiStateMapper$mapToDiscountsTabs$1 chargersDiscountsListUiStateMapper$mapToDiscountsTabs$122 = chargersDiscountsListUiStateMapper$mapToDiscountsTabs$1;
                        if (it.hasNext()) {
                            ChargersDiscountsTabDto chargersDiscountsTabDto3 = (ChargersDiscountsTabDto) it.next();
                            ChargersDiscountsListUiState$Content$DiscountsTabType b = b(chargersDiscountsTabDto3);
                            FormattedText formattedText = chargersDiscountsTabDto3.b;
                            chargersDiscountsListUiStateMapper$mapToDiscountsTabs$122.L$0 = null;
                            chargersDiscountsListUiStateMapper$mapToDiscountsTabs$122.L$1 = ow9Var;
                            chargersDiscountsListUiStateMapper$mapToDiscountsTabs$122.L$2 = null;
                            chargersDiscountsListUiStateMapper$mapToDiscountsTabs$122.L$3 = null;
                            chargersDiscountsListUiStateMapper$mapToDiscountsTabs$122.L$4 = arrayList;
                            chargersDiscountsListUiStateMapper$mapToDiscountsTabs$122.L$5 = null;
                            chargersDiscountsListUiStateMapper$mapToDiscountsTabs$122.L$6 = it;
                            chargersDiscountsListUiStateMapper$mapToDiscountsTabs$122.L$7 = null;
                            chargersDiscountsListUiStateMapper$mapToDiscountsTabs$122.L$8 = null;
                            chargersDiscountsListUiStateMapper$mapToDiscountsTabs$122.L$9 = chargersDiscountsTabDto3;
                            chargersDiscountsListUiStateMapper$mapToDiscountsTabs$122.L$10 = b;
                            chargersDiscountsListUiStateMapper$mapToDiscountsTabs$122.L$11 = null;
                            chargersDiscountsListUiStateMapper$mapToDiscountsTabs$122.L$12 = null;
                            chargersDiscountsListUiStateMapper$mapToDiscountsTabs$122.L$13 = null;
                            chargersDiscountsListUiStateMapper$mapToDiscountsTabs$122.L$14 = null;
                            chargersDiscountsListUiStateMapper$mapToDiscountsTabs$122.L$15 = null;
                            chargersDiscountsListUiStateMapper$mapToDiscountsTabs$122.L$16 = null;
                            chargersDiscountsListUiStateMapper$mapToDiscountsTabs$122.L$17 = null;
                            chargersDiscountsListUiStateMapper$mapToDiscountsTabs$122.L$18 = null;
                            chargersDiscountsListUiStateMapper$mapToDiscountsTabs$122.L$19 = null;
                            chargersDiscountsListUiStateMapper$mapToDiscountsTabs$122.label = 1;
                            Object e = ru.yandex.taxi.widget.c.e(this.b, formattedText, null, false, chargersDiscountsListUiStateMapper$mapToDiscountsTabs$122, 30);
                            if (e != coroutineSingletons) {
                                arrayList2 = arrayList;
                                obj = e;
                                ow9Var2 = ow9Var;
                                chargersDiscountsTabDto = chargersDiscountsTabDto3;
                                chargersDiscountsListUiState$Content$DiscountsTabType = b;
                                chargersDiscountsListUiStateMapper$mapToDiscountsTabs$1 = chargersDiscountsListUiStateMapper$mapToDiscountsTabs$122;
                                charSequence = (CharSequence) obj;
                                list2 = chargersDiscountsTabDto.d;
                                if (list2 == null) {
                                    ow9Var3 = ow9Var2;
                                    chargersDiscountsTabDto2 = chargersDiscountsTabDto;
                                    arrayList3 = new ArrayList();
                                    r9 = arrayList2;
                                    chargersDiscountsListUiState$Content$DiscountsTabType2 = chargersDiscountsListUiState$Content$DiscountsTabType;
                                    it2 = list2.iterator();
                                    it3 = it;
                                    charSequence2 = charSequence;
                                    if (it2.hasNext()) {
                                    }
                                } else {
                                    ow9Var3 = ow9Var2;
                                    chargersDiscountsTabDto2 = chargersDiscountsTabDto;
                                    list3 = null;
                                    arrayList4 = arrayList2;
                                    Integer num2 = chargersDiscountsTabDto2.c;
                                    arrayList4.add(new xv9(chargersDiscountsListUiState$Content$DiscountsTabType, charSequence, num2 == null ? num2.intValue() : 0, list3));
                                    arrayList = arrayList4;
                                    ow9Var = ow9Var3;
                                    ChargersDiscountsListUiStateMapper$mapToDiscountsTabs$1 chargersDiscountsListUiStateMapper$mapToDiscountsTabs$1222 = chargersDiscountsListUiStateMapper$mapToDiscountsTabs$1;
                                    if (it.hasNext()) {
                                        return arrayList;
                                    }
                                }
                            }
                            return coroutineSingletons;
                        }
                    } else {
                        a0 a0Var = (a0) it2.next();
                        chargersDiscountsListUiStateMapper$mapToDiscountsTabs$1.L$0 = null;
                        chargersDiscountsListUiStateMapper$mapToDiscountsTabs$1.L$1 = ow9Var3;
                        chargersDiscountsListUiStateMapper$mapToDiscountsTabs$1.L$2 = null;
                        chargersDiscountsListUiStateMapper$mapToDiscountsTabs$1.L$3 = null;
                        chargersDiscountsListUiStateMapper$mapToDiscountsTabs$1.L$4 = r9;
                        chargersDiscountsListUiStateMapper$mapToDiscountsTabs$1.L$5 = null;
                        chargersDiscountsListUiStateMapper$mapToDiscountsTabs$1.L$6 = it3;
                        chargersDiscountsListUiStateMapper$mapToDiscountsTabs$1.L$7 = null;
                        chargersDiscountsListUiStateMapper$mapToDiscountsTabs$1.L$8 = null;
                        chargersDiscountsListUiStateMapper$mapToDiscountsTabs$1.L$9 = chargersDiscountsTabDto2;
                        chargersDiscountsListUiStateMapper$mapToDiscountsTabs$1.L$10 = chargersDiscountsListUiState$Content$DiscountsTabType2;
                        chargersDiscountsListUiStateMapper$mapToDiscountsTabs$1.L$11 = charSequence2;
                        chargersDiscountsListUiStateMapper$mapToDiscountsTabs$1.L$12 = null;
                        chargersDiscountsListUiStateMapper$mapToDiscountsTabs$1.L$13 = null;
                        chargersDiscountsListUiStateMapper$mapToDiscountsTabs$1.L$14 = arrayList3;
                        chargersDiscountsListUiStateMapper$mapToDiscountsTabs$1.L$15 = null;
                        chargersDiscountsListUiStateMapper$mapToDiscountsTabs$1.L$16 = it2;
                        chargersDiscountsListUiStateMapper$mapToDiscountsTabs$1.L$17 = null;
                        chargersDiscountsListUiStateMapper$mapToDiscountsTabs$1.L$18 = null;
                        chargersDiscountsListUiStateMapper$mapToDiscountsTabs$1.L$19 = null;
                        chargersDiscountsListUiStateMapper$mapToDiscountsTabs$1.label = 2;
                        obj = this.c.a(a0Var, ow9Var3, chargersDiscountsListUiStateMapper$mapToDiscountsTabs$1);
                    }
                }
            }
        }
        chargersDiscountsListUiStateMapper$mapToDiscountsTabs$1 = new ChargersDiscountsListUiStateMapper$mapToDiscountsTabs$1(this, continuationImpl);
        Object obj2 = chargersDiscountsListUiStateMapper$mapToDiscountsTabs$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersDiscountsListUiStateMapper$mapToDiscountsTabs$1.label;
        if (i != 0) {
        }
    }
}
