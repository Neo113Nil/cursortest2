package com.yandex.go.chargers.offer.data.mappers;

import android.content.Context;
import com.yandex.go.chargers.data.model.ChargersAttributeDto;
import com.yandex.go.chargers.offer.data.api.ChargersOfferKeyDto;
import com.yandex.go.chargers.offer.data.api.ChargersOfferResponseDto;
import com.yandex.go.chargers.offer.data.api.ChargersOfferTabDto;
import com.yandex.go.chargers.offer.data.api.ChargersOfferToggleDto;
import com.yandex.go.chargers.offer.data.api.ChargersOfferVariantDto;
import com.yandex.go.chargers.offer.data.api.ChargersPromoPlateDto;
import com.yandex.go.chargers.offer.data.api.PopupDto;
import defpackage.a8a;
import defpackage.bvf0;
import defpackage.c29;
import defpackage.c8a;
import defpackage.d7a;
import defpackage.g7a;
import defpackage.h3u;
import defpackage.hfa0;
import defpackage.hh5;
import defpackage.hl3;
import defpackage.iya;
import defpackage.jl40;
import defpackage.k7x0;
import defpackage.m7x0;
import defpackage.mdh;
import defpackage.n9a;
import defpackage.naa;
import defpackage.ny61;
import defpackage.oaa;
import defpackage.oma;
import defpackage.pdc;
import defpackage.rcc;
import defpackage.s6a;
import defpackage.sjh;
import defpackage.sna;
import defpackage.t2a;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tn9;
import defpackage.tna;
import defpackage.tsa;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vna;
import defpackage.w511;
import defpackage.wna;
import defpackage.xdf;
import defpackage.xna;
import defpackage.y6a;
import defpackage.z6a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.c;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes12.dex */
public final class b {
    public final Context a;
    public final pdc b;
    public final tt2 c;
    public final k7x0 d;
    public final xdf e;
    public final e f;
    public final com.yandex.go.chargers.domain.mapper.b g;
    public final com.yandex.go.chargers.surge.domain.a h;
    public final iya i;
    public final c j;
    public final com.yandex.go.chargers.domain.mapper.a k;
    public final com.yandex.go.chargers.error.data.a l;

    public b(Context context, pdc pdcVar, tt2 tt2Var, k7x0 k7x0Var, xdf xdfVar, e eVar, com.yandex.go.chargers.domain.mapper.b bVar, com.yandex.go.chargers.surge.domain.a aVar, iya iyaVar, c cVar, com.yandex.go.chargers.domain.mapper.a aVar2, com.yandex.go.chargers.error.data.a aVar3) {
        this.a = context;
        this.b = pdcVar;
        this.c = tt2Var;
        this.d = k7x0Var;
        this.e = xdfVar;
        this.f = eVar;
        this.g = bVar;
        this.h = aVar;
        this.i = iyaVar;
        this.j = cVar;
        this.k = aVar2;
        this.l = aVar3;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, ChargersPromoPlateDto chargersPromoPlateDto, n9a n9aVar, ContinuationImpl continuationImpl) {
        ChargersOfferUiStateMapper$preparePromoPlate$1 chargersOfferUiStateMapper$preparePromoPlate$1;
        int i;
        String str;
        n9a n9aVar2;
        FormattedText formattedText;
        ChargersPromoPlateDto chargersPromoPlateDto2;
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        String str2;
        ChargersAttributeDto chargersAttributeDto;
        String str3;
        tn9 tn9Var;
        ChargersPromoPlateDto chargersPromoPlateDto3;
        String str4;
        xna xnaVar;
        g7a g7aVar;
        g7a g7aVar2;
        ChargersOfferToggleDto chargersOfferToggleDto;
        ChargersPromoPlateDto chargersPromoPlateDto4 = chargersPromoPlateDto;
        e eVar = bVar.f;
        if (continuationImpl instanceof ChargersOfferUiStateMapper$preparePromoPlate$1) {
            chargersOfferUiStateMapper$preparePromoPlate$1 = (ChargersOfferUiStateMapper$preparePromoPlate$1) continuationImpl;
            int i2 = chargersOfferUiStateMapper$preparePromoPlate$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersOfferUiStateMapper$preparePromoPlate$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersOfferUiStateMapper$preparePromoPlate$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersOfferUiStateMapper$preparePromoPlate$1.label;
                n9a n9aVar3 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (chargersPromoPlateDto4 == null) {
                        return null;
                    }
                    String str5 = chargersPromoPlateDto4.a;
                    FormattedText formattedText2 = chargersPromoPlateDto4.b;
                    chargersOfferUiStateMapper$preparePromoPlate$1.L$0 = chargersPromoPlateDto4;
                    chargersOfferUiStateMapper$preparePromoPlate$1.L$1 = n9aVar;
                    chargersOfferUiStateMapper$preparePromoPlate$1.L$2 = str5;
                    chargersOfferUiStateMapper$preparePromoPlate$1.label = 1;
                    Object t = eVar.t(formattedText2, chargersOfferUiStateMapper$preparePromoPlate$1);
                    if (t != obj2) {
                        str = str5;
                        obj = t;
                        n9aVar2 = n9aVar;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        charSequence2 = (CharSequence) chargersOfferUiStateMapper$preparePromoPlate$1.L$4;
                        charSequence = (CharSequence) chargersOfferUiStateMapper$preparePromoPlate$1.L$3;
                        str4 = (String) chargersOfferUiStateMapper$preparePromoPlate$1.L$2;
                        n9aVar2 = (n9a) chargersOfferUiStateMapper$preparePromoPlate$1.L$1;
                        chargersPromoPlateDto3 = (ChargersPromoPlateDto) chargersOfferUiStateMapper$preparePromoPlate$1.L$0;
                        kotlin.b.b(obj);
                        tn9Var = (tn9) obj;
                        chargersPromoPlateDto2 = chargersPromoPlateDto3;
                        str3 = str4;
                        CharSequence charSequence4 = charSequence2;
                        CharSequence charSequence5 = charSequence;
                        String str6 = chargersPromoPlateDto2.d;
                        String a = str6 != null ? ((m7x0) bVar.d).a(str6) : null;
                        String str7 = chargersPromoPlateDto2.d;
                        xnaVar = chargersPromoPlateDto2.f;
                        String str8 = chargersPromoPlateDto2.a;
                        if (jl40.l(xnaVar, vna.INSTANCE)) {
                            g7aVar2 = new z6a(str8);
                        } else if (jl40.l(xnaVar, sna.INSTANCE)) {
                            g7aVar2 = new y6a(str8);
                        } else {
                            if (!jl40.l(xnaVar, tna.INSTANCE)) {
                                if (!jl40.l(xnaVar, wna.INSTANCE)) {
                                    w511.b();
                                    return null;
                                }
                                g7aVar = null;
                                chargersOfferToggleDto = chargersPromoPlateDto2.g;
                                if (chargersOfferToggleDto != null) {
                                    String str9 = chargersOfferToggleDto.a;
                                    n9aVar3 = jl40.l(n9aVar2 != null ? n9aVar2.a : null, str9) ? n9aVar2 : new n9a(str9, chargersOfferToggleDto.b);
                                }
                                return new a8a(str3, charSequence5, charSequence4, a, str7, tn9Var, g7aVar, n9aVar3);
                            }
                            g7aVar2 = d7a.a;
                        }
                        g7aVar = g7aVar2;
                        chargersOfferToggleDto = chargersPromoPlateDto2.g;
                        if (chargersOfferToggleDto != null) {
                        }
                        return new a8a(str3, charSequence5, charSequence4, a, str7, tn9Var, g7aVar, n9aVar3);
                    }
                    charSequence3 = (CharSequence) chargersOfferUiStateMapper$preparePromoPlate$1.L$3;
                    str2 = (String) chargersOfferUiStateMapper$preparePromoPlate$1.L$2;
                    n9aVar2 = (n9a) chargersOfferUiStateMapper$preparePromoPlate$1.L$1;
                    chargersPromoPlateDto2 = (ChargersPromoPlateDto) chargersOfferUiStateMapper$preparePromoPlate$1.L$0;
                    kotlin.b.b(obj);
                    str = str2;
                    charSequence = charSequence3;
                    charSequence2 = (CharSequence) obj;
                    chargersAttributeDto = (ChargersAttributeDto) kotlin.collections.a.R(chargersPromoPlateDto2.e);
                    if (chargersAttributeDto == null) {
                        str3 = str;
                        tn9Var = null;
                        CharSequence charSequence42 = charSequence2;
                        CharSequence charSequence52 = charSequence;
                        String str62 = chargersPromoPlateDto2.d;
                        if (str62 != null) {
                        }
                        String str72 = chargersPromoPlateDto2.d;
                        xnaVar = chargersPromoPlateDto2.f;
                        String str82 = chargersPromoPlateDto2.a;
                        if (jl40.l(xnaVar, vna.INSTANCE)) {
                        }
                        g7aVar = g7aVar2;
                        chargersOfferToggleDto = chargersPromoPlateDto2.g;
                        if (chargersOfferToggleDto != null) {
                        }
                        return new a8a(str3, charSequence52, charSequence42, a, str72, tn9Var, g7aVar, n9aVar3);
                    }
                    com.yandex.go.chargers.domain.mapper.a aVar = bVar.k;
                    chargersOfferUiStateMapper$preparePromoPlate$1.L$0 = chargersPromoPlateDto2;
                    chargersOfferUiStateMapper$preparePromoPlate$1.L$1 = n9aVar2;
                    chargersOfferUiStateMapper$preparePromoPlate$1.L$2 = str;
                    chargersOfferUiStateMapper$preparePromoPlate$1.L$3 = charSequence;
                    chargersOfferUiStateMapper$preparePromoPlate$1.L$4 = charSequence2;
                    chargersOfferUiStateMapper$preparePromoPlate$1.L$5 = null;
                    chargersOfferUiStateMapper$preparePromoPlate$1.label = 3;
                    obj = aVar.a(chargersAttributeDto, chargersOfferUiStateMapper$preparePromoPlate$1);
                    if (obj != obj2) {
                        chargersPromoPlateDto3 = chargersPromoPlateDto2;
                        str4 = str;
                        tn9Var = (tn9) obj;
                        chargersPromoPlateDto2 = chargersPromoPlateDto3;
                        str3 = str4;
                        CharSequence charSequence422 = charSequence2;
                        CharSequence charSequence522 = charSequence;
                        String str622 = chargersPromoPlateDto2.d;
                        if (str622 != null) {
                        }
                        String str722 = chargersPromoPlateDto2.d;
                        xnaVar = chargersPromoPlateDto2.f;
                        String str822 = chargersPromoPlateDto2.a;
                        if (jl40.l(xnaVar, vna.INSTANCE)) {
                        }
                        g7aVar = g7aVar2;
                        chargersOfferToggleDto = chargersPromoPlateDto2.g;
                        if (chargersOfferToggleDto != null) {
                        }
                        return new a8a(str3, charSequence522, charSequence422, a, str722, tn9Var, g7aVar, n9aVar3);
                    }
                    return obj2;
                }
                String str10 = (String) chargersOfferUiStateMapper$preparePromoPlate$1.L$2;
                n9aVar2 = (n9a) chargersOfferUiStateMapper$preparePromoPlate$1.L$1;
                ChargersPromoPlateDto chargersPromoPlateDto5 = (ChargersPromoPlateDto) chargersOfferUiStateMapper$preparePromoPlate$1.L$0;
                kotlin.b.b(obj);
                str = str10;
                chargersPromoPlateDto4 = chargersPromoPlateDto5;
                CharSequence charSequence6 = (CharSequence) obj;
                formattedText = chargersPromoPlateDto4.c;
                if (formattedText == null) {
                    chargersOfferUiStateMapper$preparePromoPlate$1.L$0 = chargersPromoPlateDto4;
                    chargersOfferUiStateMapper$preparePromoPlate$1.L$1 = n9aVar2;
                    chargersOfferUiStateMapper$preparePromoPlate$1.L$2 = str;
                    chargersOfferUiStateMapper$preparePromoPlate$1.L$3 = charSequence6;
                    chargersOfferUiStateMapper$preparePromoPlate$1.L$4 = null;
                    chargersOfferUiStateMapper$preparePromoPlate$1.label = 2;
                    Object t2 = eVar.t(formattedText, chargersOfferUiStateMapper$preparePromoPlate$1);
                    if (t2 != obj2) {
                        chargersPromoPlateDto2 = chargersPromoPlateDto4;
                        charSequence3 = charSequence6;
                        obj = t2;
                        str2 = str;
                        str = str2;
                        charSequence = charSequence3;
                        charSequence2 = (CharSequence) obj;
                        chargersAttributeDto = (ChargersAttributeDto) kotlin.collections.a.R(chargersPromoPlateDto2.e);
                        if (chargersAttributeDto == null) {
                        }
                    }
                    return obj2;
                }
                chargersPromoPlateDto2 = chargersPromoPlateDto4;
                charSequence = charSequence6;
                charSequence2 = null;
                chargersAttributeDto = (ChargersAttributeDto) kotlin.collections.a.R(chargersPromoPlateDto2.e);
                if (chargersAttributeDto == null) {
                }
            }
        }
        chargersOfferUiStateMapper$preparePromoPlate$1 = new ChargersOfferUiStateMapper$preparePromoPlate$1(bVar, continuationImpl);
        Object obj3 = chargersOfferUiStateMapper$preparePromoPlate$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersOfferUiStateMapper$preparePromoPlate$1.label;
        n9a n9aVar32 = null;
        if (i != 0) {
        }
        CharSequence charSequence62 = (CharSequence) obj3;
        formattedText = chargersPromoPlateDto4.c;
        if (formattedText == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ChargersOfferResponseDto chargersOfferResponseDto, ContinuationImpl continuationImpl) {
        ChargersOfferUiStateMapper$getLegalTerms$1 chargersOfferUiStateMapper$getLegalTerms$1;
        int i;
        if (continuationImpl instanceof ChargersOfferUiStateMapper$getLegalTerms$1) {
            chargersOfferUiStateMapper$getLegalTerms$1 = (ChargersOfferUiStateMapper$getLegalTerms$1) continuationImpl;
            int i2 = chargersOfferUiStateMapper$getLegalTerms$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersOfferUiStateMapper$getLegalTerms$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersOfferUiStateMapper$getLegalTerms$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersOfferUiStateMapper$getLegalTerms$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    FormattedText formattedText = chargersOfferResponseDto.h;
                    if (formattedText == null) {
                        return null;
                    }
                    chargersOfferUiStateMapper$getLegalTerms$1.L$0 = null;
                    chargersOfferUiStateMapper$getLegalTerms$1.label = 1;
                    obj = this.f.t(formattedText, chargersOfferUiStateMapper$getLegalTerms$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return (CharSequence) obj;
            }
        }
        chargersOfferUiStateMapper$getLegalTerms$1 = new ChargersOfferUiStateMapper$getLegalTerms$1(this, continuationImpl);
        Object obj2 = chargersOfferUiStateMapper$getLegalTerms$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersOfferUiStateMapper$getLegalTerms$1.label;
        if (i != 0) {
        }
        return (CharSequence) obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0149, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0153, code lost:
    
        if (r8 == false) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x027f A[LOOP:0: B:21:0x0279->B:23:0x027f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(s6a s6aVar, String str, n9a n9aVar, hfa0 hfa0Var, tsa tsaVar, boolean z, boolean z2, ContinuationImpl continuationImpl) {
        ChargersOfferUiStateMapper$map$1 chargersOfferUiStateMapper$map$1;
        Object obj;
        Object obj2;
        int i;
        Object obj3;
        String str2;
        String str3;
        s6a s6aVar2;
        boolean z3;
        hfa0 hfa0Var2;
        tsa tsaVar2;
        boolean z4;
        Object obj4;
        ChargersOfferToggleDto chargersOfferToggleDto;
        boolean z5;
        String str4;
        boolean z6;
        hfa0 hfa0Var3;
        String str5;
        String str6;
        s6a s6aVar3;
        CharSequence charSequence;
        Object obj5;
        n9a n9aVar2 = n9aVar;
        if (continuationImpl instanceof ChargersOfferUiStateMapper$map$1) {
            chargersOfferUiStateMapper$map$1 = (ChargersOfferUiStateMapper$map$1) continuationImpl;
            int i2 = chargersOfferUiStateMapper$map$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersOfferUiStateMapper$map$1.label = i2 - Integer.MIN_VALUE;
                ChargersOfferUiStateMapper$map$1 chargersOfferUiStateMapper$map$12 = chargersOfferUiStateMapper$map$1;
                obj = chargersOfferUiStateMapper$map$12.result;
                obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersOfferUiStateMapper$map$12.label;
                int i3 = 10;
                if (i != 0) {
                    kotlin.b.b(obj);
                    s6a a = s6a.a(s6aVar, hfa0Var, n9aVar2, null, 57);
                    if (s6aVar.f) {
                        ChargersOfferResponseDto chargersOfferResponseDto = a.d;
                        List list = chargersOfferResponseDto.u;
                        if (list == null) {
                            ny61.g("Multi-offer response does not contain offers");
                            return null;
                        }
                        ListBuilder a2 = rcc.a();
                        if (str != null) {
                            a2.add(new ChargersOfferKeyDto("tab", str, null));
                        }
                        ChargersPromoPlateDto chargersPromoPlateDto = chargersOfferResponseDto.n;
                        if (chargersPromoPlateDto != null && (chargersOfferToggleDto = chargersPromoPlateDto.g) != null) {
                            String str7 = chargersOfferToggleDto.a;
                            if (n9aVar2 != null) {
                                if (!jl40.l(n9aVar2.a, str7)) {
                                    n9aVar2 = null;
                                }
                                if (n9aVar2 != null) {
                                    z5 = n9aVar2.b;
                                    a2.add(new ChargersOfferKeyDto("toggle", str7, Boolean.valueOf(z5)));
                                }
                            }
                            z5 = chargersOfferToggleDto.b;
                            a2.add(new ChargersOfferKeyDto("toggle", str7, Boolean.valueOf(z5)));
                        }
                        ListBuilder j = a2.j();
                        Iterator it = list.iterator();
                        boolean z7 = false;
                        Object obj6 = null;
                        while (true) {
                            if (it.hasNext()) {
                                Object next = it.next();
                                List list2 = ((ChargersOfferVariantDto) next).d;
                                if (list2.size() == j.size()) {
                                    if (jl40.l(h3u.a(new hh5(28, list2)), h3u.a(new c29(i3, j)))) {
                                        if (z7) {
                                            break;
                                        }
                                        obj6 = next;
                                        z7 = true;
                                    }
                                }
                            }
                        }
                        ChargersOfferVariantDto chargersOfferVariantDto = (ChargersOfferVariantDto) obj6;
                        if (chargersOfferVariantDto == null) {
                            ny61.g("No unique offer variant for the current controls state");
                            return null;
                        }
                        obj3 = null;
                        a = s6a.a(a, null, null, new ChargersOfferResponseDto(chargersOfferVariantDto.a, chargersOfferResponseDto.b, chargersOfferResponseDto.c, chargersOfferResponseDto.d, chargersOfferResponseDto.e, chargersOfferResponseDto.f, chargersOfferResponseDto.g, chargersOfferResponseDto.h, chargersOfferResponseDto.i, chargersOfferVariantDto.b, chargersOfferResponseDto.k, chargersOfferVariantDto.c, chargersOfferResponseDto.m, chargersOfferResponseDto.n, chargersOfferResponseDto.o, chargersOfferResponseDto.p, chargersOfferResponseDto.q, chargersOfferResponseDto.r, chargersOfferResponseDto.s, chargersOfferResponseDto.t, chargersOfferResponseDto.u), 55);
                    } else {
                        obj3 = null;
                    }
                    ChargersOfferResponseDto chargersOfferResponseDto2 = a.d;
                    String str8 = chargersOfferResponseDto2.a;
                    if (str8 == null) {
                        str8 = "";
                    }
                    hfa0 hfa0Var4 = a.b;
                    chargersOfferUiStateMapper$map$12.L$0 = obj3;
                    chargersOfferUiStateMapper$map$12.L$1 = str;
                    chargersOfferUiStateMapper$map$12.L$2 = obj3;
                    chargersOfferUiStateMapper$map$12.L$3 = obj3;
                    chargersOfferUiStateMapper$map$12.L$4 = tsaVar;
                    chargersOfferUiStateMapper$map$12.L$5 = obj3;
                    chargersOfferUiStateMapper$map$12.L$6 = a;
                    chargersOfferUiStateMapper$map$12.L$7 = str8;
                    chargersOfferUiStateMapper$map$12.L$8 = hfa0Var4;
                    chargersOfferUiStateMapper$map$12.Z$0 = z;
                    chargersOfferUiStateMapper$map$12.Z$1 = z2;
                    chargersOfferUiStateMapper$map$12.label = 1;
                    Object b = b(chargersOfferResponseDto2, chargersOfferUiStateMapper$map$12);
                    if (b != obj2) {
                        str2 = str;
                        str3 = str8;
                        s6aVar2 = a;
                        z3 = z;
                        hfa0Var2 = hfa0Var4;
                        tsaVar2 = tsaVar;
                        z4 = z2;
                        obj4 = b;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z8 = chargersOfferUiStateMapper$map$12.Z$0;
                    CharSequence charSequence2 = (CharSequence) chargersOfferUiStateMapper$map$12.L$9;
                    hfa0 hfa0Var5 = (hfa0) chargersOfferUiStateMapper$map$12.L$8;
                    String str9 = (String) chargersOfferUiStateMapper$map$12.L$7;
                    s6aVar3 = (s6a) chargersOfferUiStateMapper$map$12.L$6;
                    str5 = (String) chargersOfferUiStateMapper$map$12.L$1;
                    kotlin.b.b(obj);
                    z6 = z8;
                    charSequence = charSequence2;
                    hfa0Var3 = hfa0Var5;
                    str6 = str9;
                    str4 = null;
                    c8a c8aVar = (c8a) obj;
                    String str10 = s6aVar3.e;
                    ChargersOfferResponseDto chargersOfferResponseDto3 = s6aVar3.d;
                    ChargersOfferResponseDto.Banner banner = chargersOfferResponseDto3.e;
                    String str11 = banner == null ? banner.a : str4;
                    boolean z9 = s6aVar3.f;
                    obj5 = !z9 ? chargersOfferResponseDto3.t : str4;
                    if (obj5 == null) {
                        obj5 = EmptyList.a;
                    }
                    Iterable<ChargersOfferTabDto> iterable = (Iterable) obj5;
                    ArrayList arrayList = new ArrayList(tcc.n(iterable, 10));
                    for (ChargersOfferTabDto chargersOfferTabDto : iterable) {
                        String str12 = chargersOfferTabDto.a;
                        arrayList.add(new naa(str12, chargersOfferTabDto.b, jl40.l(str12, str5)));
                    }
                    return new oaa(str6, hfa0Var3, charSequence, c8aVar, str10, str11, z6, z9, arrayList);
                }
                boolean z10 = chargersOfferUiStateMapper$map$12.Z$1;
                boolean z11 = chargersOfferUiStateMapper$map$12.Z$0;
                hfa0 hfa0Var6 = (hfa0) chargersOfferUiStateMapper$map$12.L$8;
                String str13 = (String) chargersOfferUiStateMapper$map$12.L$7;
                s6a s6aVar4 = (s6a) chargersOfferUiStateMapper$map$12.L$6;
                tsa tsaVar3 = (tsa) chargersOfferUiStateMapper$map$12.L$4;
                str2 = (String) chargersOfferUiStateMapper$map$12.L$1;
                kotlin.b.b(obj);
                t2a t2aVar = (t2a) obj;
                if (t2aVar != null) {
                    obj4 = t2aVar.a;
                    z4 = z10;
                    z3 = z11;
                    hfa0Var2 = hfa0Var6;
                    str3 = str13;
                    s6aVar2 = s6aVar4;
                } else {
                    z4 = z10;
                    z3 = z11;
                    str3 = str13;
                    s6aVar2 = s6aVar4;
                    obj4 = null;
                    hfa0Var2 = hfa0Var6;
                }
                tsaVar2 = tsaVar3;
                CharSequence charSequence3 = (CharSequence) obj4;
                hl3 hl3Var = s6aVar2.a;
                ChargersOfferResponseDto chargersOfferResponseDto4 = s6aVar2.d;
                hfa0 hfa0Var7 = s6aVar2.b;
                n9a n9aVar3 = s6aVar2.c;
                chargersOfferUiStateMapper$map$12.L$0 = null;
                chargersOfferUiStateMapper$map$12.L$1 = str2;
                chargersOfferUiStateMapper$map$12.L$2 = null;
                chargersOfferUiStateMapper$map$12.L$3 = null;
                chargersOfferUiStateMapper$map$12.L$4 = null;
                chargersOfferUiStateMapper$map$12.L$5 = null;
                chargersOfferUiStateMapper$map$12.L$6 = s6aVar2;
                chargersOfferUiStateMapper$map$12.L$7 = str3;
                chargersOfferUiStateMapper$map$12.L$8 = hfa0Var2;
                chargersOfferUiStateMapper$map$12.L$9 = charSequence3;
                chargersOfferUiStateMapper$map$12.Z$0 = z3;
                chargersOfferUiStateMapper$map$12.Z$1 = z4;
                chargersOfferUiStateMapper$map$12.label = 2;
                str4 = null;
                obj = bvf0.n(new ChargersOfferUiStateMapper$prepareChargersOfferContent$2(chargersOfferResponseDto4, this, tsaVar2, hl3Var, hfa0Var7, z4, n9aVar3, null), chargersOfferUiStateMapper$map$12);
                if (obj != obj2) {
                    z6 = z3;
                    hfa0Var3 = hfa0Var2;
                    str5 = str2;
                    str6 = str3;
                    s6aVar3 = s6aVar2;
                    charSequence = charSequence3;
                    c8a c8aVar2 = (c8a) obj;
                    String str102 = s6aVar3.e;
                    ChargersOfferResponseDto chargersOfferResponseDto32 = s6aVar3.d;
                    ChargersOfferResponseDto.Banner banner2 = chargersOfferResponseDto32.e;
                    if (banner2 == null) {
                    }
                    boolean z92 = s6aVar3.f;
                    if (!z92) {
                    }
                    if (obj5 == null) {
                    }
                    Iterable<ChargersOfferTabDto> iterable2 = (Iterable) obj5;
                    ArrayList arrayList2 = new ArrayList(tcc.n(iterable2, 10));
                    while (r3.hasNext()) {
                    }
                    return new oaa(str6, hfa0Var3, charSequence, c8aVar2, str102, str11, z6, z92, arrayList2);
                }
                return obj2;
            }
        }
        chargersOfferUiStateMapper$map$1 = new ChargersOfferUiStateMapper$map$1(this, continuationImpl);
        ChargersOfferUiStateMapper$map$1 chargersOfferUiStateMapper$map$122 = chargersOfferUiStateMapper$map$1;
        obj = chargersOfferUiStateMapper$map$122.result;
        obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersOfferUiStateMapper$map$122.label;
        int i32 = 10;
        if (i != 0) {
        }
        CharSequence charSequence32 = (CharSequence) obj4;
        hl3 hl3Var2 = s6aVar2.a;
        ChargersOfferResponseDto chargersOfferResponseDto42 = s6aVar2.d;
        hfa0 hfa0Var72 = s6aVar2.b;
        n9a n9aVar32 = s6aVar2.c;
        chargersOfferUiStateMapper$map$122.L$0 = null;
        chargersOfferUiStateMapper$map$122.L$1 = str2;
        chargersOfferUiStateMapper$map$122.L$2 = null;
        chargersOfferUiStateMapper$map$122.L$3 = null;
        chargersOfferUiStateMapper$map$122.L$4 = null;
        chargersOfferUiStateMapper$map$122.L$5 = null;
        chargersOfferUiStateMapper$map$122.L$6 = s6aVar2;
        chargersOfferUiStateMapper$map$122.L$7 = str3;
        chargersOfferUiStateMapper$map$122.L$8 = hfa0Var2;
        chargersOfferUiStateMapper$map$122.L$9 = charSequence32;
        chargersOfferUiStateMapper$map$122.Z$0 = z3;
        chargersOfferUiStateMapper$map$122.Z$1 = z4;
        chargersOfferUiStateMapper$map$122.label = 2;
        str4 = null;
        obj = bvf0.n(new ChargersOfferUiStateMapper$prepareChargersOfferContent$2(chargersOfferResponseDto42, this, tsaVar2, hl3Var2, hfa0Var72, z4, n9aVar32, null), chargersOfferUiStateMapper$map$122);
        if (obj != obj2) {
        }
        return obj2;
    }

    public final Object d(Throwable th, Continuation continuation) {
        this.c.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new ChargersOfferUiStateMapper$map$5(this, th, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(PopupDto popupDto, ContinuationImpl continuationImpl) {
        ChargersOfferUiStateMapper$preparePopup$1 chargersOfferUiStateMapper$preparePopup$1;
        int i;
        PopupDto popupDto2;
        String str;
        String str2;
        CharSequence charSequence;
        FormattedText formattedText;
        CharSequence charSequence2;
        String str3;
        if (continuationImpl instanceof ChargersOfferUiStateMapper$preparePopup$1) {
            chargersOfferUiStateMapper$preparePopup$1 = (ChargersOfferUiStateMapper$preparePopup$1) continuationImpl;
            int i2 = chargersOfferUiStateMapper$preparePopup$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersOfferUiStateMapper$preparePopup$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersOfferUiStateMapper$preparePopup$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersOfferUiStateMapper$preparePopup$1.label;
                c cVar = this.j;
                CharSequence charSequence3 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str4 = popupDto.a;
                    String str5 = popupDto.b;
                    FormattedText formattedText2 = popupDto.c;
                    chargersOfferUiStateMapper$preparePopup$1.L$0 = popupDto;
                    chargersOfferUiStateMapper$preparePopup$1.L$1 = str4;
                    chargersOfferUiStateMapper$preparePopup$1.L$2 = str5;
                    chargersOfferUiStateMapper$preparePopup$1.label = 1;
                    Object i3 = c.i(cVar, formattedText2, null, chargersOfferUiStateMapper$preparePopup$1, 30);
                    if (i3 != coroutineSingletons) {
                        popupDto2 = popupDto;
                        str = str5;
                        str2 = str4;
                        obj = i3;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    charSequence2 = (CharSequence) chargersOfferUiStateMapper$preparePopup$1.L$4;
                    str = (String) chargersOfferUiStateMapper$preparePopup$1.L$3;
                    str3 = (String) chargersOfferUiStateMapper$preparePopup$1.L$2;
                    kotlin.b.b(obj);
                    charSequence3 = (CharSequence) obj;
                    charSequence = charSequence2;
                    str2 = str3;
                    return new oma(charSequence, charSequence3, str2, str);
                }
                str = (String) chargersOfferUiStateMapper$preparePopup$1.L$2;
                str2 = (String) chargersOfferUiStateMapper$preparePopup$1.L$1;
                popupDto2 = (PopupDto) chargersOfferUiStateMapper$preparePopup$1.L$0;
                kotlin.b.b(obj);
                charSequence = (CharSequence) obj;
                formattedText = popupDto2.d;
                if (formattedText != null) {
                    chargersOfferUiStateMapper$preparePopup$1.L$0 = null;
                    chargersOfferUiStateMapper$preparePopup$1.L$1 = null;
                    chargersOfferUiStateMapper$preparePopup$1.L$2 = str2;
                    chargersOfferUiStateMapper$preparePopup$1.L$3 = str;
                    chargersOfferUiStateMapper$preparePopup$1.L$4 = charSequence;
                    chargersOfferUiStateMapper$preparePopup$1.label = 2;
                    Object i4 = c.i(cVar, formattedText, null, chargersOfferUiStateMapper$preparePopup$1, 30);
                    if (i4 != coroutineSingletons) {
                        obj = i4;
                        charSequence2 = charSequence;
                        str3 = str2;
                        charSequence3 = (CharSequence) obj;
                        charSequence = charSequence2;
                        str2 = str3;
                    }
                    return coroutineSingletons;
                }
                return new oma(charSequence, charSequence3, str2, str);
            }
        }
        chargersOfferUiStateMapper$preparePopup$1 = new ChargersOfferUiStateMapper$preparePopup$1(this, continuationImpl);
        Object obj2 = chargersOfferUiStateMapper$preparePopup$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersOfferUiStateMapper$preparePopup$1.label;
        c cVar2 = this.j;
        CharSequence charSequence32 = null;
        if (i != 0) {
        }
        charSequence = (CharSequence) obj2;
        formattedText = popupDto2.d;
        if (formattedText != null) {
        }
        return new oma(charSequence, charSequence32, str2, str);
    }
}
