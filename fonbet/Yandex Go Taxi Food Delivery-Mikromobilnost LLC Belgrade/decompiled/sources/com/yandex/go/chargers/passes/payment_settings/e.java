package com.yandex.go.chargers.passes.payment_settings;

import com.yandex.go.chargers.passes.data.ChargersPassButtonDto;
import com.yandex.go.chargers.passes.data.ChargersPassPaymentMethodDto;
import com.yandex.go.chargers.passes.data.ChargersPassRenewalDto;
import com.yandex.go.chargers.passes.data.ChargersPassesPaymentSettingsResponseDto;
import com.yandex.go.chargers.passes.data.k;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.wha;
import defpackage.wj90;
import defpackage.xha;
import defpackage.yha;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes12.dex */
public final class e {
    public final ru.yandex.taxi.widget.c a;
    public final k b;

    public e(ru.yandex.taxi.widget.c cVar, k kVar) {
        this.a = cVar;
        this.b = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x01ac -> B:14:0x01ad). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ChargersPassesPaymentSettingsResponseDto chargersPassesPaymentSettingsResponseDto, boolean z, ContinuationImpl continuationImpl) {
        ChargersPassesPaymentSettingsUiStateMapper$map$1 chargersPassesPaymentSettingsUiStateMapper$map$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        boolean z2;
        String str2;
        Object i2;
        ChargersPassesPaymentSettingsResponseDto chargersPassesPaymentSettingsResponseDto2;
        boolean z3;
        String str3;
        CharSequence charSequence;
        String str4;
        String str5;
        ChargersPassesPaymentSettingsResponseDto chargersPassesPaymentSettingsResponseDto3;
        wha whaVar;
        String str6;
        CharSequence charSequence2;
        CharSequence charSequence3;
        String str7;
        Collection arrayList;
        Iterator it;
        wha whaVar2;
        String str8;
        CharSequence charSequence4;
        xha xhaVar;
        ChargersPassesPaymentSettingsResponseDto chargersPassesPaymentSettingsResponseDto4 = chargersPassesPaymentSettingsResponseDto;
        if (continuationImpl instanceof ChargersPassesPaymentSettingsUiStateMapper$map$1) {
            chargersPassesPaymentSettingsUiStateMapper$map$1 = (ChargersPassesPaymentSettingsUiStateMapper$map$1) continuationImpl;
            int i3 = chargersPassesPaymentSettingsUiStateMapper$map$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                chargersPassesPaymentSettingsUiStateMapper$map$1.label = i3 - Integer.MIN_VALUE;
                Object obj = chargersPassesPaymentSettingsUiStateMapper$map$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersPassesPaymentSettingsUiStateMapper$map$1.label;
                ru.yandex.taxi.widget.c cVar = this.a;
                k kVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    FormattedText formattedText = chargersPassesPaymentSettingsResponseDto4.a;
                    chargersPassesPaymentSettingsUiStateMapper$map$1.L$0 = str;
                    chargersPassesPaymentSettingsUiStateMapper$map$1.L$1 = chargersPassesPaymentSettingsResponseDto4;
                    z2 = z;
                    chargersPassesPaymentSettingsUiStateMapper$map$1.Z$0 = z2;
                    chargersPassesPaymentSettingsUiStateMapper$map$1.label = 1;
                    obj = ru.yandex.taxi.widget.c.i(cVar, formattedText, null, chargersPassesPaymentSettingsUiStateMapper$map$1, 30);
                    if (obj != coroutineSingletons) {
                        str2 = str;
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    boolean z4 = chargersPassesPaymentSettingsUiStateMapper$map$1.Z$0;
                    ChargersPassesPaymentSettingsResponseDto chargersPassesPaymentSettingsResponseDto5 = (ChargersPassesPaymentSettingsResponseDto) chargersPassesPaymentSettingsUiStateMapper$map$1.L$1;
                    str2 = (String) chargersPassesPaymentSettingsUiStateMapper$map$1.L$0;
                    kotlin.b.b(obj);
                    z2 = z4;
                    chargersPassesPaymentSettingsResponseDto4 = chargersPassesPaymentSettingsResponseDto5;
                } else {
                    if (i == 2) {
                        z3 = chargersPassesPaymentSettingsUiStateMapper$map$1.Z$0;
                        str4 = (String) chargersPassesPaymentSettingsUiStateMapper$map$1.L$3;
                        charSequence = (CharSequence) chargersPassesPaymentSettingsUiStateMapper$map$1.L$2;
                        chargersPassesPaymentSettingsResponseDto2 = (ChargersPassesPaymentSettingsResponseDto) chargersPassesPaymentSettingsUiStateMapper$map$1.L$1;
                        str3 = (String) chargersPassesPaymentSettingsUiStateMapper$map$1.L$0;
                        kotlin.b.b(obj);
                        wha whaVar3 = new wha((CharSequence) obj, str4);
                        ChargersPassRenewalDto chargersPassRenewalDto = chargersPassesPaymentSettingsResponseDto2.c;
                        str5 = chargersPassRenewalDto.a;
                        FormattedText formattedText2 = chargersPassRenewalDto.b;
                        chargersPassesPaymentSettingsUiStateMapper$map$1.L$0 = str3;
                        chargersPassesPaymentSettingsUiStateMapper$map$1.L$1 = chargersPassesPaymentSettingsResponseDto2;
                        chargersPassesPaymentSettingsUiStateMapper$map$1.L$2 = charSequence;
                        chargersPassesPaymentSettingsUiStateMapper$map$1.L$3 = whaVar3;
                        chargersPassesPaymentSettingsUiStateMapper$map$1.L$4 = str5;
                        chargersPassesPaymentSettingsUiStateMapper$map$1.Z$0 = z3;
                        chargersPassesPaymentSettingsUiStateMapper$map$1.label = 3;
                        obj = ru.yandex.taxi.widget.c.i(cVar, formattedText2, null, chargersPassesPaymentSettingsUiStateMapper$map$1, 30);
                        if (obj != coroutineSingletons) {
                            chargersPassesPaymentSettingsResponseDto3 = chargersPassesPaymentSettingsResponseDto2;
                            whaVar = whaVar3;
                            str6 = str5;
                            charSequence2 = (CharSequence) obj;
                            ChargersPassButtonDto chargersPassButtonDto = chargersPassesPaymentSettingsResponseDto3.c.c;
                            chargersPassesPaymentSettingsUiStateMapper$map$1.L$0 = str3;
                            chargersPassesPaymentSettingsUiStateMapper$map$1.L$1 = chargersPassesPaymentSettingsResponseDto3;
                            chargersPassesPaymentSettingsUiStateMapper$map$1.L$2 = charSequence;
                            chargersPassesPaymentSettingsUiStateMapper$map$1.L$3 = whaVar;
                            chargersPassesPaymentSettingsUiStateMapper$map$1.L$4 = str6;
                            chargersPassesPaymentSettingsUiStateMapper$map$1.L$5 = charSequence2;
                            chargersPassesPaymentSettingsUiStateMapper$map$1.Z$0 = z3;
                            chargersPassesPaymentSettingsUiStateMapper$map$1.label = 4;
                            obj = kVar.b(chargersPassButtonDto, chargersPassesPaymentSettingsUiStateMapper$map$1);
                            if (obj != coroutineSingletons) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    if (i == 3) {
                        z3 = chargersPassesPaymentSettingsUiStateMapper$map$1.Z$0;
                        str5 = (String) chargersPassesPaymentSettingsUiStateMapper$map$1.L$4;
                        wha whaVar4 = (wha) chargersPassesPaymentSettingsUiStateMapper$map$1.L$3;
                        CharSequence charSequence5 = (CharSequence) chargersPassesPaymentSettingsUiStateMapper$map$1.L$2;
                        chargersPassesPaymentSettingsResponseDto3 = (ChargersPassesPaymentSettingsResponseDto) chargersPassesPaymentSettingsUiStateMapper$map$1.L$1;
                        String str9 = (String) chargersPassesPaymentSettingsUiStateMapper$map$1.L$0;
                        kotlin.b.b(obj);
                        str3 = str9;
                        charSequence = charSequence5;
                        whaVar = whaVar4;
                        str6 = str5;
                        charSequence2 = (CharSequence) obj;
                        ChargersPassButtonDto chargersPassButtonDto2 = chargersPassesPaymentSettingsResponseDto3.c.c;
                        chargersPassesPaymentSettingsUiStateMapper$map$1.L$0 = str3;
                        chargersPassesPaymentSettingsUiStateMapper$map$1.L$1 = chargersPassesPaymentSettingsResponseDto3;
                        chargersPassesPaymentSettingsUiStateMapper$map$1.L$2 = charSequence;
                        chargersPassesPaymentSettingsUiStateMapper$map$1.L$3 = whaVar;
                        chargersPassesPaymentSettingsUiStateMapper$map$1.L$4 = str6;
                        chargersPassesPaymentSettingsUiStateMapper$map$1.L$5 = charSequence2;
                        chargersPassesPaymentSettingsUiStateMapper$map$1.Z$0 = z3;
                        chargersPassesPaymentSettingsUiStateMapper$map$1.label = 4;
                        obj = kVar.b(chargersPassButtonDto2, chargersPassesPaymentSettingsUiStateMapper$map$1);
                        if (obj != coroutineSingletons) {
                            charSequence3 = charSequence;
                            str7 = str3;
                            xha xhaVar2 = new xha(str6, charSequence2, (wj90) obj);
                            List list = chargersPassesPaymentSettingsResponseDto3.d;
                            arrayList = new ArrayList(tcc.n(list, 10));
                            it = list.iterator();
                            whaVar2 = whaVar;
                            str8 = str7;
                            charSequence4 = charSequence3;
                            xhaVar = xhaVar2;
                            if (!it.hasNext()) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    if (i == 4) {
                        z3 = chargersPassesPaymentSettingsUiStateMapper$map$1.Z$0;
                        charSequence2 = (CharSequence) chargersPassesPaymentSettingsUiStateMapper$map$1.L$5;
                        str6 = (String) chargersPassesPaymentSettingsUiStateMapper$map$1.L$4;
                        whaVar = (wha) chargersPassesPaymentSettingsUiStateMapper$map$1.L$3;
                        charSequence3 = (CharSequence) chargersPassesPaymentSettingsUiStateMapper$map$1.L$2;
                        chargersPassesPaymentSettingsResponseDto3 = (ChargersPassesPaymentSettingsResponseDto) chargersPassesPaymentSettingsUiStateMapper$map$1.L$1;
                        str7 = (String) chargersPassesPaymentSettingsUiStateMapper$map$1.L$0;
                        kotlin.b.b(obj);
                        xha xhaVar22 = new xha(str6, charSequence2, (wj90) obj);
                        List list2 = chargersPassesPaymentSettingsResponseDto3.d;
                        arrayList = new ArrayList(tcc.n(list2, 10));
                        it = list2.iterator();
                        whaVar2 = whaVar;
                        str8 = str7;
                        charSequence4 = charSequence3;
                        xhaVar = xhaVar22;
                        if (!it.hasNext()) {
                        }
                    } else {
                        if (i != 5) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z3 = chargersPassesPaymentSettingsUiStateMapper$map$1.Z$0;
                        arrayList = (Collection) chargersPassesPaymentSettingsUiStateMapper$map$1.L$11;
                        it = (Iterator) chargersPassesPaymentSettingsUiStateMapper$map$1.L$8;
                        Collection collection = (Collection) chargersPassesPaymentSettingsUiStateMapper$map$1.L$7;
                        xhaVar = (xha) chargersPassesPaymentSettingsUiStateMapper$map$1.L$4;
                        whaVar2 = (wha) chargersPassesPaymentSettingsUiStateMapper$map$1.L$3;
                        charSequence4 = (CharSequence) chargersPassesPaymentSettingsUiStateMapper$map$1.L$2;
                        String str10 = (String) chargersPassesPaymentSettingsUiStateMapper$map$1.L$0;
                        kotlin.b.b(obj);
                        str8 = str10;
                        arrayList.add((wj90) obj);
                        arrayList = collection;
                        if (!it.hasNext()) {
                            ChargersPassButtonDto chargersPassButtonDto3 = (ChargersPassButtonDto) it.next();
                            chargersPassesPaymentSettingsUiStateMapper$map$1.L$0 = str8;
                            chargersPassesPaymentSettingsUiStateMapper$map$1.L$1 = null;
                            chargersPassesPaymentSettingsUiStateMapper$map$1.L$2 = charSequence4;
                            chargersPassesPaymentSettingsUiStateMapper$map$1.L$3 = whaVar2;
                            chargersPassesPaymentSettingsUiStateMapper$map$1.L$4 = xhaVar;
                            chargersPassesPaymentSettingsUiStateMapper$map$1.L$5 = null;
                            chargersPassesPaymentSettingsUiStateMapper$map$1.L$6 = null;
                            chargersPassesPaymentSettingsUiStateMapper$map$1.L$7 = arrayList;
                            chargersPassesPaymentSettingsUiStateMapper$map$1.L$8 = it;
                            chargersPassesPaymentSettingsUiStateMapper$map$1.L$9 = null;
                            chargersPassesPaymentSettingsUiStateMapper$map$1.L$10 = null;
                            chargersPassesPaymentSettingsUiStateMapper$map$1.L$11 = arrayList;
                            chargersPassesPaymentSettingsUiStateMapper$map$1.Z$0 = z3;
                            chargersPassesPaymentSettingsUiStateMapper$map$1.label = 5;
                            obj = kVar.b(chargersPassButtonDto3, chargersPassesPaymentSettingsUiStateMapper$map$1);
                            if (obj != coroutineSingletons) {
                                collection = arrayList;
                                arrayList.add((wj90) obj);
                                arrayList = collection;
                                if (!it.hasNext()) {
                                    return new yha(str8, charSequence4, whaVar2, xhaVar, (List) arrayList, false, z3);
                                }
                            }
                            return coroutineSingletons;
                        }
                    }
                }
                CharSequence charSequence6 = (CharSequence) obj;
                ChargersPassPaymentMethodDto chargersPassPaymentMethodDto = chargersPassesPaymentSettingsResponseDto4.b;
                String str11 = chargersPassPaymentMethodDto.a;
                FormattedText formattedText3 = chargersPassPaymentMethodDto.b;
                chargersPassesPaymentSettingsUiStateMapper$map$1.L$0 = str2;
                chargersPassesPaymentSettingsUiStateMapper$map$1.L$1 = chargersPassesPaymentSettingsResponseDto4;
                chargersPassesPaymentSettingsUiStateMapper$map$1.L$2 = charSequence6;
                chargersPassesPaymentSettingsUiStateMapper$map$1.L$3 = str11;
                chargersPassesPaymentSettingsUiStateMapper$map$1.Z$0 = z2;
                chargersPassesPaymentSettingsUiStateMapper$map$1.label = 2;
                i2 = ru.yandex.taxi.widget.c.i(cVar, formattedText3, null, chargersPassesPaymentSettingsUiStateMapper$map$1, 30);
                if (i2 != coroutineSingletons) {
                    String str12 = str2;
                    chargersPassesPaymentSettingsResponseDto2 = chargersPassesPaymentSettingsResponseDto4;
                    z3 = z2;
                    str3 = str12;
                    charSequence = charSequence6;
                    obj = i2;
                    str4 = str11;
                    wha whaVar32 = new wha((CharSequence) obj, str4);
                    ChargersPassRenewalDto chargersPassRenewalDto2 = chargersPassesPaymentSettingsResponseDto2.c;
                    str5 = chargersPassRenewalDto2.a;
                    FormattedText formattedText22 = chargersPassRenewalDto2.b;
                    chargersPassesPaymentSettingsUiStateMapper$map$1.L$0 = str3;
                    chargersPassesPaymentSettingsUiStateMapper$map$1.L$1 = chargersPassesPaymentSettingsResponseDto2;
                    chargersPassesPaymentSettingsUiStateMapper$map$1.L$2 = charSequence;
                    chargersPassesPaymentSettingsUiStateMapper$map$1.L$3 = whaVar32;
                    chargersPassesPaymentSettingsUiStateMapper$map$1.L$4 = str5;
                    chargersPassesPaymentSettingsUiStateMapper$map$1.Z$0 = z3;
                    chargersPassesPaymentSettingsUiStateMapper$map$1.label = 3;
                    obj = ru.yandex.taxi.widget.c.i(cVar, formattedText22, null, chargersPassesPaymentSettingsUiStateMapper$map$1, 30);
                    if (obj != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        chargersPassesPaymentSettingsUiStateMapper$map$1 = new ChargersPassesPaymentSettingsUiStateMapper$map$1(this, continuationImpl);
        Object obj2 = chargersPassesPaymentSettingsUiStateMapper$map$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersPassesPaymentSettingsUiStateMapper$map$1.label;
        ru.yandex.taxi.widget.c cVar2 = this.a;
        k kVar2 = this.b;
        if (i != 0) {
        }
        CharSequence charSequence62 = (CharSequence) obj2;
        ChargersPassPaymentMethodDto chargersPassPaymentMethodDto2 = chargersPassesPaymentSettingsResponseDto4.b;
        String str112 = chargersPassPaymentMethodDto2.a;
        FormattedText formattedText32 = chargersPassPaymentMethodDto2.b;
        chargersPassesPaymentSettingsUiStateMapper$map$1.L$0 = str2;
        chargersPassesPaymentSettingsUiStateMapper$map$1.L$1 = chargersPassesPaymentSettingsResponseDto4;
        chargersPassesPaymentSettingsUiStateMapper$map$1.L$2 = charSequence62;
        chargersPassesPaymentSettingsUiStateMapper$map$1.L$3 = str112;
        chargersPassesPaymentSettingsUiStateMapper$map$1.Z$0 = z2;
        chargersPassesPaymentSettingsUiStateMapper$map$1.label = 2;
        i2 = ru.yandex.taxi.widget.c.i(cVar2, formattedText32, null, chargersPassesPaymentSettingsUiStateMapper$map$1, 30);
        if (i2 != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
