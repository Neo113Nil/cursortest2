package com.yandex.go.chargers.passes.ui;

import com.yandex.go.chargers.passes.data.ChargersPassButtonDto;
import com.yandex.go.chargers.passes.data.ChargersPassCardDto$Active;
import com.yandex.go.chargers.passes.data.ChargersPassCardDto$Expired;
import com.yandex.go.chargers.passes.data.ChargersPassCardDto$FailedRenewal;
import com.yandex.go.chargers.passes.data.ChargersPassDto;
import com.yandex.go.chargers.passes.data.ChargersPassInfoBadgeDto;
import com.yandex.go.chargers.passes.data.ChargersPassOfferBenefitDto;
import com.yandex.go.chargers.passes.data.ChargersPassOfferSelectorDto;
import com.yandex.go.chargers.passes.data.ChargersPassOfferSelectorOptionDto;
import com.yandex.go.chargers.passes.data.ChargersPassProgressDto;
import com.yandex.go.chargers.passes.data.ChargersPassesOfferResponseScreenDto$Offer;
import com.yandex.go.chargers.passes.data.k;
import com.yandex.go.chargers.passes.data.q;
import com.yandex.go.chargers.passes.data.r;
import com.yandex.go.chargers.passes.domain.ChargersPassType;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import defpackage.cfa;
import defpackage.dfa;
import defpackage.dka;
import defpackage.efa;
import defpackage.eka;
import defpackage.evu0;
import defpackage.ffa;
import defpackage.gfa;
import defpackage.hfa;
import defpackage.hfa0;
import defpackage.jl40;
import defpackage.kyh0;
import defpackage.lla;
import defpackage.ly3;
import defpackage.mla;
import defpackage.nga;
import defpackage.nla;
import defpackage.ny61;
import defpackage.ola;
import defpackage.pla;
import defpackage.rla;
import defpackage.rzo;
import defpackage.sla;
import defpackage.tcc;
import defpackage.w511;
import defpackage.wj90;
import defpackage.wp2;
import defpackage.y6i0;
import defpackage.yka;
import defpackage.yp2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes12.dex */
public final class e {
    public final yp2 a;
    public final ru.yandex.taxi.widget.utils.e b;
    public final ru.yandex.taxi.widget.c c;
    public final k d;

    public e(yp2 yp2Var, ru.yandex.taxi.widget.utils.e eVar, ru.yandex.taxi.widget.c cVar, k kVar) {
        this.a = yp2Var;
        this.b = eVar;
        this.c = cVar;
        this.d = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ChargersPassInfoBadgeDto chargersPassInfoBadgeDto, ContinuationImpl continuationImpl) {
        ChargersPassesUiStateMapper$mapBadge$1 chargersPassesUiStateMapper$mapBadge$1;
        int i;
        if (continuationImpl instanceof ChargersPassesUiStateMapper$mapBadge$1) {
            chargersPassesUiStateMapper$mapBadge$1 = (ChargersPassesUiStateMapper$mapBadge$1) continuationImpl;
            int i2 = chargersPassesUiStateMapper$mapBadge$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersPassesUiStateMapper$mapBadge$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersPassesUiStateMapper$mapBadge$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersPassesUiStateMapper$mapBadge$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    FormattedText formattedText = chargersPassInfoBadgeDto.a;
                    chargersPassesUiStateMapper$mapBadge$1.L$0 = chargersPassInfoBadgeDto;
                    chargersPassesUiStateMapper$mapBadge$1.label = 1;
                    obj = ru.yandex.taxi.widget.c.i(this.c, formattedText, null, chargersPassesUiStateMapper$mapBadge$1, 30);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    chargersPassInfoBadgeDto = (ChargersPassInfoBadgeDto) chargersPassesUiStateMapper$mapBadge$1.L$0;
                    kotlin.b.b(obj);
                }
                return new efa((CharSequence) obj, ly3.g(sla.a, this.a, chargersPassInfoBadgeDto.b));
            }
        }
        chargersPassesUiStateMapper$mapBadge$1 = new ChargersPassesUiStateMapper$mapBadge$1(this, continuationImpl);
        Object obj2 = chargersPassesUiStateMapper$mapBadge$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersPassesUiStateMapper$mapBadge$1.label;
        if (i != 0) {
        }
        return new efa((CharSequence) obj2, ly3.g(sla.a, this.a, chargersPassInfoBadgeDto.b));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ChargersPassOfferBenefitDto chargersPassOfferBenefitDto, ContinuationImpl continuationImpl) {
        ChargersPassesUiStateMapper$mapBenefit$1 chargersPassesUiStateMapper$mapBenefit$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        ChargersPassOfferBenefitDto chargersPassOfferBenefitDto2;
        String str;
        Object i2;
        CharSequence charSequence;
        if (continuationImpl instanceof ChargersPassesUiStateMapper$mapBenefit$1) {
            chargersPassesUiStateMapper$mapBenefit$1 = (ChargersPassesUiStateMapper$mapBenefit$1) continuationImpl;
            int i3 = chargersPassesUiStateMapper$mapBenefit$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                chargersPassesUiStateMapper$mapBenefit$1.label = i3 - Integer.MIN_VALUE;
                Object obj = chargersPassesUiStateMapper$mapBenefit$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersPassesUiStateMapper$mapBenefit$1.label;
                ru.yandex.taxi.widget.c cVar = this.c;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str2 = chargersPassOfferBenefitDto.c;
                    if (evu0.J(str2)) {
                        str2 = null;
                    }
                    FormattedText formattedText = chargersPassOfferBenefitDto.a;
                    chargersPassesUiStateMapper$mapBenefit$1.L$0 = chargersPassOfferBenefitDto;
                    chargersPassesUiStateMapper$mapBenefit$1.L$1 = str2;
                    chargersPassesUiStateMapper$mapBenefit$1.label = 1;
                    Object i4 = ru.yandex.taxi.widget.c.i(cVar, formattedText, null, chargersPassesUiStateMapper$mapBenefit$1, 30);
                    if (i4 != coroutineSingletons) {
                        chargersPassOfferBenefitDto2 = chargersPassOfferBenefitDto;
                        str = str2;
                        obj = i4;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    charSequence = (CharSequence) chargersPassesUiStateMapper$mapBenefit$1.L$2;
                    str = (String) chargersPassesUiStateMapper$mapBenefit$1.L$1;
                    kotlin.b.b(obj);
                    return new lla(charSequence, (CharSequence) obj, str);
                }
                str = (String) chargersPassesUiStateMapper$mapBenefit$1.L$1;
                chargersPassOfferBenefitDto2 = (ChargersPassOfferBenefitDto) chargersPassesUiStateMapper$mapBenefit$1.L$0;
                kotlin.b.b(obj);
                CharSequence charSequence2 = (CharSequence) obj;
                FormattedText formattedText2 = chargersPassOfferBenefitDto2.b;
                chargersPassesUiStateMapper$mapBenefit$1.L$0 = null;
                chargersPassesUiStateMapper$mapBenefit$1.L$1 = str;
                chargersPassesUiStateMapper$mapBenefit$1.L$2 = charSequence2;
                chargersPassesUiStateMapper$mapBenefit$1.label = 2;
                i2 = ru.yandex.taxi.widget.c.i(cVar, formattedText2, null, chargersPassesUiStateMapper$mapBenefit$1, 30);
                if (i2 != coroutineSingletons) {
                    obj = i2;
                    charSequence = charSequence2;
                    return new lla(charSequence, (CharSequence) obj, str);
                }
                return coroutineSingletons;
            }
        }
        chargersPassesUiStateMapper$mapBenefit$1 = new ChargersPassesUiStateMapper$mapBenefit$1(this, continuationImpl);
        Object obj2 = chargersPassesUiStateMapper$mapBenefit$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersPassesUiStateMapper$mapBenefit$1.label;
        ru.yandex.taxi.widget.c cVar2 = this.c;
        if (i != 0) {
        }
        CharSequence charSequence22 = (CharSequence) obj2;
        FormattedText formattedText22 = chargersPassOfferBenefitDto2.b;
        chargersPassesUiStateMapper$mapBenefit$1.L$0 = null;
        chargersPassesUiStateMapper$mapBenefit$1.L$1 = str;
        chargersPassesUiStateMapper$mapBenefit$1.L$2 = charSequence22;
        chargersPassesUiStateMapper$mapBenefit$1.label = 2;
        i2 = ru.yandex.taxi.widget.c.i(cVar2, formattedText22, null, chargersPassesUiStateMapper$mapBenefit$1, 30);
        if (i2 != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0116, code lost:
    
        if (r2 == r4) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ChargersPassDto chargersPassDto, ContinuationImpl continuationImpl) {
        ChargersPassesUiStateMapper$mapCard$1 chargersPassesUiStateMapper$mapCard$1;
        int i;
        ChargersPassDto chargersPassDto2;
        CharSequence charSequence;
        r rVar;
        CharSequence charSequence2;
        String str;
        CharSequence charSequence3;
        String str2;
        CharSequence charSequence4;
        r rVar2;
        CharSequence charSequence5;
        String str3;
        ChargersPassButtonDto chargersPassButtonDto;
        String str4;
        CharSequence charSequence6;
        CharSequence charSequence7;
        ffa ffaVar;
        wj90 wj90Var;
        r rVar3;
        ffa ffaVar2;
        ChargersPassInfoBadgeDto chargersPassInfoBadgeDto;
        wj90 wj90Var2;
        ffa ffaVar3;
        CharSequence charSequence8;
        CharSequence charSequence9;
        String str5;
        wj90 wj90Var3;
        ffa ffaVar4;
        CharSequence charSequence10;
        CharSequence charSequence11;
        String str6;
        ChargersPassDto chargersPassDto3 = chargersPassDto;
        if (continuationImpl instanceof ChargersPassesUiStateMapper$mapCard$1) {
            chargersPassesUiStateMapper$mapCard$1 = (ChargersPassesUiStateMapper$mapCard$1) continuationImpl;
            int i2 = chargersPassesUiStateMapper$mapCard$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersPassesUiStateMapper$mapCard$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersPassesUiStateMapper$mapCard$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersPassesUiStateMapper$mapCard$1.label;
                ru.yandex.taxi.widget.c cVar = this.c;
                k kVar = this.d;
                efa efaVar = null;
                switch (i) {
                    case 0:
                        kotlin.b.b(obj);
                        FormattedText formattedText = chargersPassDto3.c;
                        chargersPassesUiStateMapper$mapCard$1.L$0 = chargersPassDto3;
                        chargersPassesUiStateMapper$mapCard$1.label = 1;
                        obj = ru.yandex.taxi.widget.c.i(cVar, formattedText, null, chargersPassesUiStateMapper$mapCard$1, 30);
                        break;
                    case 1:
                        chargersPassDto3 = (ChargersPassDto) chargersPassesUiStateMapper$mapCard$1.L$0;
                        kotlin.b.b(obj);
                        CharSequence charSequence12 = (CharSequence) obj;
                        FormattedText formattedText2 = chargersPassDto3.d;
                        chargersPassesUiStateMapper$mapCard$1.L$0 = chargersPassDto3;
                        chargersPassesUiStateMapper$mapCard$1.L$1 = charSequence12;
                        chargersPassesUiStateMapper$mapCard$1.label = 2;
                        Object i3 = ru.yandex.taxi.widget.c.i(cVar, formattedText2, null, chargersPassesUiStateMapper$mapCard$1, 30);
                        if (i3 != obj2) {
                            chargersPassDto2 = chargersPassDto3;
                            charSequence = charSequence12;
                            obj = i3;
                            CharSequence charSequence13 = (CharSequence) obj;
                            rVar = chargersPassDto2.e;
                            String str7 = chargersPassDto2.a;
                            if (!(rVar instanceof ChargersPassCardDto$Active)) {
                                ChargersPassProgressDto chargersPassProgressDto = ((ChargersPassCardDto$Active) rVar).b;
                                chargersPassesUiStateMapper$mapCard$1.L$0 = null;
                                chargersPassesUiStateMapper$mapCard$1.L$1 = null;
                                chargersPassesUiStateMapper$mapCard$1.L$2 = null;
                                chargersPassesUiStateMapper$mapCard$1.L$3 = rVar;
                                chargersPassesUiStateMapper$mapCard$1.L$4 = str7;
                                chargersPassesUiStateMapper$mapCard$1.L$5 = charSequence;
                                chargersPassesUiStateMapper$mapCard$1.L$6 = charSequence13;
                                chargersPassesUiStateMapper$mapCard$1.label = 3;
                                Object g = g(chargersPassProgressDto, chargersPassesUiStateMapper$mapCard$1);
                                if (g != obj2) {
                                    charSequence4 = charSequence;
                                    rVar2 = rVar;
                                    charSequence5 = charSequence13;
                                    obj = g;
                                    str3 = str7;
                                    ffa ffaVar5 = (ffa) obj;
                                    chargersPassButtonDto = ((ChargersPassCardDto$Active) rVar2).c;
                                    if (chargersPassButtonDto == null) {
                                        chargersPassesUiStateMapper$mapCard$1.L$0 = null;
                                        chargersPassesUiStateMapper$mapCard$1.L$1 = null;
                                        chargersPassesUiStateMapper$mapCard$1.L$2 = null;
                                        chargersPassesUiStateMapper$mapCard$1.L$3 = rVar2;
                                        chargersPassesUiStateMapper$mapCard$1.L$4 = null;
                                        chargersPassesUiStateMapper$mapCard$1.L$5 = str3;
                                        chargersPassesUiStateMapper$mapCard$1.L$6 = charSequence4;
                                        chargersPassesUiStateMapper$mapCard$1.L$7 = charSequence5;
                                        chargersPassesUiStateMapper$mapCard$1.L$8 = ffaVar5;
                                        chargersPassesUiStateMapper$mapCard$1.label = 4;
                                        Object b = kVar.b(chargersPassButtonDto, chargersPassesUiStateMapper$mapCard$1);
                                        if (b != obj2) {
                                            rVar3 = rVar2;
                                            ffaVar2 = ffaVar5;
                                            obj = b;
                                            wj90Var = (wj90) obj;
                                            CharSequence charSequence14 = charSequence5;
                                            ffaVar = ffaVar2;
                                            rVar2 = rVar3;
                                            str4 = str3;
                                            charSequence6 = charSequence4;
                                            charSequence7 = charSequence14;
                                            chargersPassInfoBadgeDto = ((ChargersPassCardDto$Active) rVar2).d;
                                            if (chargersPassInfoBadgeDto == null) {
                                                wj90Var2 = wj90Var;
                                                ffaVar3 = ffaVar;
                                                charSequence8 = charSequence7;
                                                charSequence9 = charSequence6;
                                                str5 = str4;
                                                return new gfa(str5, charSequence9, charSequence8, ffaVar3, wj90Var2, efaVar);
                                            }
                                            chargersPassesUiStateMapper$mapCard$1.L$0 = null;
                                            chargersPassesUiStateMapper$mapCard$1.L$1 = null;
                                            chargersPassesUiStateMapper$mapCard$1.L$2 = null;
                                            chargersPassesUiStateMapper$mapCard$1.L$3 = null;
                                            chargersPassesUiStateMapper$mapCard$1.L$4 = null;
                                            chargersPassesUiStateMapper$mapCard$1.L$5 = str4;
                                            chargersPassesUiStateMapper$mapCard$1.L$6 = charSequence6;
                                            chargersPassesUiStateMapper$mapCard$1.L$7 = charSequence7;
                                            chargersPassesUiStateMapper$mapCard$1.L$8 = ffaVar;
                                            chargersPassesUiStateMapper$mapCard$1.L$9 = wj90Var;
                                            chargersPassesUiStateMapper$mapCard$1.label = 5;
                                            Object a = a(chargersPassInfoBadgeDto, chargersPassesUiStateMapper$mapCard$1);
                                            if (a != obj2) {
                                                wj90 wj90Var4 = wj90Var;
                                                obj = a;
                                                wj90Var3 = wj90Var4;
                                                ffaVar4 = ffaVar;
                                                charSequence10 = charSequence7;
                                                charSequence11 = charSequence6;
                                                str6 = str4;
                                                efaVar = (efa) obj;
                                                wj90Var2 = wj90Var3;
                                                ffaVar3 = ffaVar4;
                                                charSequence8 = charSequence10;
                                                charSequence9 = charSequence11;
                                                str5 = str6;
                                                return new gfa(str5, charSequence9, charSequence8, ffaVar3, wj90Var2, efaVar);
                                            }
                                        }
                                    } else {
                                        str4 = str3;
                                        charSequence6 = charSequence4;
                                        charSequence7 = charSequence5;
                                        ffaVar = ffaVar5;
                                        wj90Var = null;
                                        chargersPassInfoBadgeDto = ((ChargersPassCardDto$Active) rVar2).d;
                                        if (chargersPassInfoBadgeDto == null) {
                                        }
                                    }
                                }
                            } else if (rVar instanceof ChargersPassCardDto$FailedRenewal) {
                                ChargersPassButtonDto chargersPassButtonDto2 = ((ChargersPassCardDto$FailedRenewal) rVar).b;
                                chargersPassesUiStateMapper$mapCard$1.L$0 = null;
                                chargersPassesUiStateMapper$mapCard$1.L$1 = null;
                                chargersPassesUiStateMapper$mapCard$1.L$2 = null;
                                chargersPassesUiStateMapper$mapCard$1.L$3 = null;
                                chargersPassesUiStateMapper$mapCard$1.L$4 = str7;
                                chargersPassesUiStateMapper$mapCard$1.L$5 = charSequence;
                                chargersPassesUiStateMapper$mapCard$1.L$6 = charSequence13;
                                chargersPassesUiStateMapper$mapCard$1.label = 6;
                                Object b2 = kVar.b(chargersPassButtonDto2, chargersPassesUiStateMapper$mapCard$1);
                                if (b2 != obj2) {
                                    obj = b2;
                                    charSequence3 = charSequence13;
                                    str2 = str7;
                                    return new dfa(str2, charSequence, charSequence3, (wj90) obj);
                                }
                            } else {
                                if (!(rVar instanceof ChargersPassCardDto$Expired)) {
                                    if (rVar instanceof q) {
                                        return null;
                                    }
                                    w511.b();
                                    return null;
                                }
                                ChargersPassButtonDto chargersPassButtonDto3 = ((ChargersPassCardDto$Expired) rVar).b;
                                chargersPassesUiStateMapper$mapCard$1.L$0 = null;
                                chargersPassesUiStateMapper$mapCard$1.L$1 = null;
                                chargersPassesUiStateMapper$mapCard$1.L$2 = null;
                                chargersPassesUiStateMapper$mapCard$1.L$3 = null;
                                chargersPassesUiStateMapper$mapCard$1.L$4 = str7;
                                chargersPassesUiStateMapper$mapCard$1.L$5 = charSequence;
                                chargersPassesUiStateMapper$mapCard$1.L$6 = charSequence13;
                                chargersPassesUiStateMapper$mapCard$1.label = 7;
                                Object b3 = kVar.b(chargersPassButtonDto3, chargersPassesUiStateMapper$mapCard$1);
                                if (b3 != obj2) {
                                    obj = b3;
                                    charSequence2 = charSequence13;
                                    str = str7;
                                    return new cfa(str, charSequence, charSequence2, (wj90) obj);
                                }
                            }
                        }
                        return obj2;
                    case 2:
                        charSequence = (CharSequence) chargersPassesUiStateMapper$mapCard$1.L$1;
                        chargersPassDto2 = (ChargersPassDto) chargersPassesUiStateMapper$mapCard$1.L$0;
                        kotlin.b.b(obj);
                        CharSequence charSequence132 = (CharSequence) obj;
                        rVar = chargersPassDto2.e;
                        String str72 = chargersPassDto2.a;
                        if (!(rVar instanceof ChargersPassCardDto$Active)) {
                        }
                        return obj2;
                    case 3:
                        CharSequence charSequence15 = (CharSequence) chargersPassesUiStateMapper$mapCard$1.L$6;
                        CharSequence charSequence16 = (CharSequence) chargersPassesUiStateMapper$mapCard$1.L$5;
                        String str8 = (String) chargersPassesUiStateMapper$mapCard$1.L$4;
                        r rVar4 = (r) chargersPassesUiStateMapper$mapCard$1.L$3;
                        kotlin.b.b(obj);
                        charSequence5 = charSequence15;
                        rVar2 = rVar4;
                        str3 = str8;
                        charSequence4 = charSequence16;
                        ffa ffaVar52 = (ffa) obj;
                        chargersPassButtonDto = ((ChargersPassCardDto$Active) rVar2).c;
                        if (chargersPassButtonDto == null) {
                        }
                        break;
                    case 4:
                        ffaVar2 = (ffa) chargersPassesUiStateMapper$mapCard$1.L$8;
                        charSequence5 = (CharSequence) chargersPassesUiStateMapper$mapCard$1.L$7;
                        charSequence4 = (CharSequence) chargersPassesUiStateMapper$mapCard$1.L$6;
                        str3 = (String) chargersPassesUiStateMapper$mapCard$1.L$5;
                        rVar3 = (r) chargersPassesUiStateMapper$mapCard$1.L$3;
                        kotlin.b.b(obj);
                        wj90Var = (wj90) obj;
                        CharSequence charSequence142 = charSequence5;
                        ffaVar = ffaVar2;
                        rVar2 = rVar3;
                        str4 = str3;
                        charSequence6 = charSequence4;
                        charSequence7 = charSequence142;
                        chargersPassInfoBadgeDto = ((ChargersPassCardDto$Active) rVar2).d;
                        if (chargersPassInfoBadgeDto == null) {
                        }
                        break;
                    case 5:
                        wj90Var3 = (wj90) chargersPassesUiStateMapper$mapCard$1.L$9;
                        ffaVar4 = (ffa) chargersPassesUiStateMapper$mapCard$1.L$8;
                        charSequence10 = (CharSequence) chargersPassesUiStateMapper$mapCard$1.L$7;
                        charSequence11 = (CharSequence) chargersPassesUiStateMapper$mapCard$1.L$6;
                        str6 = (String) chargersPassesUiStateMapper$mapCard$1.L$5;
                        kotlin.b.b(obj);
                        efaVar = (efa) obj;
                        wj90Var2 = wj90Var3;
                        ffaVar3 = ffaVar4;
                        charSequence8 = charSequence10;
                        charSequence9 = charSequence11;
                        str5 = str6;
                        return new gfa(str5, charSequence9, charSequence8, ffaVar3, wj90Var2, efaVar);
                    case 6:
                        charSequence3 = (CharSequence) chargersPassesUiStateMapper$mapCard$1.L$6;
                        charSequence = (CharSequence) chargersPassesUiStateMapper$mapCard$1.L$5;
                        str2 = (String) chargersPassesUiStateMapper$mapCard$1.L$4;
                        kotlin.b.b(obj);
                        return new dfa(str2, charSequence, charSequence3, (wj90) obj);
                    case 7:
                        charSequence2 = (CharSequence) chargersPassesUiStateMapper$mapCard$1.L$6;
                        charSequence = (CharSequence) chargersPassesUiStateMapper$mapCard$1.L$5;
                        str = (String) chargersPassesUiStateMapper$mapCard$1.L$4;
                        kotlin.b.b(obj);
                        return new cfa(str, charSequence, charSequence2, (wj90) obj);
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        chargersPassesUiStateMapper$mapCard$1 = new ChargersPassesUiStateMapper$mapCard$1(this, continuationImpl);
        Object obj3 = chargersPassesUiStateMapper$mapCard$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersPassesUiStateMapper$mapCard$1.label;
        ru.yandex.taxi.widget.c cVar2 = this.c;
        k kVar2 = this.d;
        efa efaVar2 = null;
        switch (i) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Type inference failed for: r12v37, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r28v0, types: [com.yandex.go.chargers.passes.ui.e] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0456 -> B:16:0x0463). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x036e -> B:29:0x0375). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(dka dkaVar, hfa0 hfa0Var, String str, boolean z, ContinuationImpl continuationImpl) {
        ChargersPassesUiStateMapper$mapOffer$1 chargersPassesUiStateMapper$mapOffer$1;
        int i;
        String str2;
        ChargersPassOfferSelectorOptionDto chargersPassOfferSelectorOptionDto;
        Object obj;
        hfa0 hfa0Var2;
        List list;
        ChargersPassOfferSelectorOptionDto chargersPassOfferSelectorOptionDto2;
        int i2;
        Map map;
        ChargersPassType chargersPassType;
        Object i3;
        dka dkaVar2;
        boolean z2;
        mla mlaVar;
        ChargersPassType chargersPassType2;
        String str3;
        hfa0 hfa0Var3;
        String str4;
        CharSequence charSequence;
        FormattedText formattedText;
        CharSequence charSequence2;
        mla mlaVar2;
        CharSequence charSequence3;
        String str5;
        hfa0 hfa0Var4;
        dka dkaVar3;
        CharSequence charSequence4;
        ChargersPassType chargersPassType3;
        CharSequence charSequence5;
        hfa0 hfa0Var5;
        dka dkaVar4;
        Iterator it;
        mla mlaVar3;
        Collection collection;
        boolean z3;
        String str6;
        String str7;
        wp2 wp2Var;
        ru.yandex.taxi.widget.c cVar;
        Object i4;
        hfa0 hfa0Var6;
        boolean z4;
        ChargersPassType chargersPassType4;
        List list2;
        ru.yandex.taxi.widget.c cVar2;
        hfa0 hfa0Var7;
        ChargersPassType chargersPassType5;
        String str8;
        String str9;
        mla mlaVar4;
        Collection collection2;
        ArrayList arrayList;
        CoroutineSingletons coroutineSingletons;
        mla mlaVar5;
        hfa0 hfa0Var8;
        boolean z5;
        String str10;
        ChargersPassType chargersPassType6;
        Iterator it2;
        CharSequence charSequence6;
        List list3;
        CharSequence charSequence7;
        ChargersPassesUiStateMapper$mapOffer$1 chargersPassesUiStateMapper$mapOffer$12;
        mla mlaVar6;
        nla nlaVar;
        hfa0 hfa0Var9;
        wp2 wp2Var2;
        CharSequence charSequence8;
        CharSequence charSequence9;
        String str11;
        ChargersPassType chargersPassType7;
        hfa0 hfa0Var10;
        ArrayList arrayList2;
        ru.yandex.taxi.widget.c cVar3;
        CoroutineSingletons coroutineSingletons2;
        String str12;
        ChargersPassType chargersPassType8;
        Iterator it3;
        String str13;
        CharSequence charSequence10;
        wp2 wp2Var3;
        boolean z6;
        Collection collection3;
        dka dkaVar5 = dkaVar;
        boolean z7 = z;
        if (continuationImpl instanceof ChargersPassesUiStateMapper$mapOffer$1) {
            chargersPassesUiStateMapper$mapOffer$1 = (ChargersPassesUiStateMapper$mapOffer$1) continuationImpl;
            int i5 = chargersPassesUiStateMapper$mapOffer$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                chargersPassesUiStateMapper$mapOffer$1.label = i5 - Integer.MIN_VALUE;
                Object obj2 = chargersPassesUiStateMapper$mapOffer$1.result;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersPassesUiStateMapper$mapOffer$1.label;
                ru.yandex.taxi.widget.c cVar4 = this.c;
                switch (i) {
                    case 0:
                        kotlin.b.b(obj2);
                        if (str == null) {
                            ChargersPassOfferSelectorDto chargersPassOfferSelectorDto = dkaVar5.a.j;
                            str2 = chargersPassOfferSelectorDto != null ? chargersPassOfferSelectorDto.a : null;
                        } else {
                            str2 = str;
                        }
                        ChargersPassOfferSelectorDto chargersPassOfferSelectorDto2 = dkaVar5.a.j;
                        if (chargersPassOfferSelectorDto2 == null || (list = chargersPassOfferSelectorDto2.b) == null) {
                            chargersPassOfferSelectorOptionDto = null;
                        } else {
                            Iterator it4 = list.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    chargersPassOfferSelectorOptionDto2 = it4.next();
                                    if (jl40.l(((ChargersPassOfferSelectorOptionDto) chargersPassOfferSelectorOptionDto2).a, str2)) {
                                    }
                                } else {
                                    chargersPassOfferSelectorOptionDto2 = 0;
                                }
                            }
                            chargersPassOfferSelectorOptionDto = chargersPassOfferSelectorOptionDto2;
                        }
                        chargersPassesUiStateMapper$mapOffer$1.L$0 = dkaVar5;
                        chargersPassesUiStateMapper$mapOffer$1.L$1 = hfa0Var;
                        chargersPassesUiStateMapper$mapOffer$1.L$2 = null;
                        chargersPassesUiStateMapper$mapOffer$1.L$3 = str2;
                        chargersPassesUiStateMapper$mapOffer$1.L$4 = null;
                        chargersPassesUiStateMapper$mapOffer$1.Z$0 = z7;
                        chargersPassesUiStateMapper$mapOffer$1.label = 1;
                        Object e = e(z7, dkaVar5, chargersPassOfferSelectorOptionDto, chargersPassesUiStateMapper$mapOffer$1);
                        if (e != coroutineSingletons3) {
                            obj = e;
                            hfa0Var2 = hfa0Var;
                            mla mlaVar7 = (mla) obj;
                            i2 = rla.a[dkaVar5.a.c.ordinal()];
                            if (i2 != 1) {
                                map = null;
                                chargersPassType = ChargersPassType.RENTAL_PACKAGE;
                            } else if (i2 == 2) {
                                map = null;
                                chargersPassType = ChargersPassType.SUBSCRIPTION;
                            } else {
                                if (i2 != 3) {
                                    w511.b();
                                    return null;
                                }
                                chargersPassType = ChargersPassType.UNKNOWN;
                                map = null;
                            }
                            ChargersPassesOfferResponseScreenDto$Offer chargersPassesOfferResponseScreenDto$Offer = dkaVar5.a;
                            String str14 = chargersPassesOfferResponseScreenDto$Offer.b;
                            FormattedText formattedText2 = chargersPassesOfferResponseScreenDto$Offer.d;
                            chargersPassesUiStateMapper$mapOffer$1.L$0 = dkaVar5;
                            chargersPassesUiStateMapper$mapOffer$1.L$1 = hfa0Var2;
                            chargersPassesUiStateMapper$mapOffer$1.L$2 = map;
                            chargersPassesUiStateMapper$mapOffer$1.L$3 = str2;
                            chargersPassesUiStateMapper$mapOffer$1.L$4 = map;
                            chargersPassesUiStateMapper$mapOffer$1.L$5 = mlaVar7;
                            chargersPassesUiStateMapper$mapOffer$1.L$6 = chargersPassType;
                            chargersPassesUiStateMapper$mapOffer$1.L$7 = str14;
                            chargersPassesUiStateMapper$mapOffer$1.Z$0 = z7;
                            chargersPassesUiStateMapper$mapOffer$1.label = 2;
                            i3 = ru.yandex.taxi.widget.c.i(cVar4, formattedText2, map, chargersPassesUiStateMapper$mapOffer$1, 30);
                            if (i3 != coroutineSingletons3) {
                                dkaVar2 = dkaVar5;
                                z2 = z7;
                                mlaVar = mlaVar7;
                                chargersPassType2 = chargersPassType;
                                str3 = str2;
                                obj2 = i3;
                                hfa0Var3 = hfa0Var2;
                                str4 = str14;
                                charSequence = (CharSequence) obj2;
                                formattedText = dkaVar2.a.e;
                                if (formattedText == null) {
                                    chargersPassesUiStateMapper$mapOffer$1.L$0 = dkaVar2;
                                    chargersPassesUiStateMapper$mapOffer$1.L$1 = hfa0Var3;
                                    chargersPassesUiStateMapper$mapOffer$1.L$2 = map;
                                    chargersPassesUiStateMapper$mapOffer$1.L$3 = str3;
                                    chargersPassesUiStateMapper$mapOffer$1.L$4 = map;
                                    chargersPassesUiStateMapper$mapOffer$1.L$5 = mlaVar;
                                    chargersPassesUiStateMapper$mapOffer$1.L$6 = map;
                                    chargersPassesUiStateMapper$mapOffer$1.L$7 = chargersPassType2;
                                    chargersPassesUiStateMapper$mapOffer$1.L$8 = str4;
                                    chargersPassesUiStateMapper$mapOffer$1.L$9 = charSequence;
                                    chargersPassesUiStateMapper$mapOffer$1.Z$0 = z2;
                                    chargersPassesUiStateMapper$mapOffer$1.label = 3;
                                    Object i6 = ru.yandex.taxi.widget.c.i(cVar4, formattedText, map, chargersPassesUiStateMapper$mapOffer$1, 30);
                                    if (i6 != coroutineSingletons3) {
                                        mlaVar2 = mlaVar;
                                        charSequence3 = charSequence;
                                        str5 = str3;
                                        hfa0Var4 = hfa0Var3;
                                        dkaVar3 = dkaVar2;
                                        obj2 = i6;
                                        CharSequence charSequence11 = (CharSequence) obj2;
                                        charSequence = charSequence3;
                                        mlaVar = mlaVar2;
                                        charSequence2 = charSequence11;
                                        dkaVar2 = dkaVar3;
                                        hfa0Var3 = hfa0Var4;
                                        str3 = str5;
                                        boolean z8 = z2;
                                        wp2 g = ly3.g(rzo.e(0, 173, 255, 255), this.a, dkaVar2.a.f);
                                        List list4 = dkaVar2.a.g;
                                        ArrayList arrayList3 = new ArrayList(tcc.n(list4, 10));
                                        Iterator it5 = list4.iterator();
                                        charSequence4 = charSequence;
                                        chargersPassType3 = chargersPassType2;
                                        charSequence5 = charSequence2;
                                        hfa0Var5 = hfa0Var3;
                                        dkaVar4 = dkaVar2;
                                        it = it5;
                                        mlaVar3 = mlaVar;
                                        collection = arrayList3;
                                        z3 = z8;
                                        str6 = str3;
                                        str7 = str4;
                                        wp2Var = g;
                                        if (it.hasNext()) {
                                            cVar2 = cVar4;
                                            ChargersPassOfferBenefitDto chargersPassOfferBenefitDto = (ChargersPassOfferBenefitDto) it.next();
                                            chargersPassesUiStateMapper$mapOffer$1.L$0 = dkaVar4;
                                            chargersPassesUiStateMapper$mapOffer$1.L$1 = hfa0Var5;
                                            hfa0Var7 = hfa0Var5;
                                            chargersPassesUiStateMapper$mapOffer$1.L$2 = null;
                                            chargersPassesUiStateMapper$mapOffer$1.L$3 = str6;
                                            chargersPassesUiStateMapper$mapOffer$1.L$4 = null;
                                            chargersPassesUiStateMapper$mapOffer$1.L$5 = mlaVar3;
                                            chargersPassesUiStateMapper$mapOffer$1.L$6 = null;
                                            chargersPassesUiStateMapper$mapOffer$1.L$7 = null;
                                            chargersPassesUiStateMapper$mapOffer$1.L$8 = collection;
                                            chargersPassesUiStateMapper$mapOffer$1.L$9 = it;
                                            chargersPassesUiStateMapper$mapOffer$1.L$10 = null;
                                            chargersPassesUiStateMapper$mapOffer$1.L$11 = null;
                                            chargersPassesUiStateMapper$mapOffer$1.L$12 = chargersPassType3;
                                            chargersPassesUiStateMapper$mapOffer$1.L$13 = str7;
                                            chargersPassesUiStateMapper$mapOffer$1.L$14 = charSequence4;
                                            chargersPassesUiStateMapper$mapOffer$1.L$15 = charSequence5;
                                            chargersPassesUiStateMapper$mapOffer$1.L$16 = wp2Var;
                                            chargersPassesUiStateMapper$mapOffer$1.L$17 = collection;
                                            chargersPassesUiStateMapper$mapOffer$1.Z$0 = z3;
                                            chargersPassesUiStateMapper$mapOffer$1.label = 4;
                                            Object b = b(chargersPassOfferBenefitDto, chargersPassesUiStateMapper$mapOffer$1);
                                            if (b != coroutineSingletons3) {
                                                String str15 = str7;
                                                chargersPassType5 = chargersPassType3;
                                                obj2 = b;
                                                str8 = str15;
                                                str9 = str6;
                                                mlaVar4 = mlaVar3;
                                                collection2 = collection;
                                                collection.add((lla) obj2);
                                                chargersPassType3 = chargersPassType5;
                                                collection = collection2;
                                                mlaVar3 = mlaVar4;
                                                str6 = str9;
                                                hfa0Var5 = hfa0Var7;
                                                str7 = str8;
                                                cVar4 = cVar2;
                                                if (it.hasNext()) {
                                                    ru.yandex.taxi.widget.c cVar5 = cVar4;
                                                    hfa0 hfa0Var11 = hfa0Var5;
                                                    List list5 = (List) collection;
                                                    FormattedText formattedText3 = dkaVar4.a.h.a;
                                                    chargersPassesUiStateMapper$mapOffer$1.L$0 = dkaVar4;
                                                    chargersPassesUiStateMapper$mapOffer$1.L$1 = hfa0Var11;
                                                    chargersPassesUiStateMapper$mapOffer$1.L$2 = null;
                                                    chargersPassesUiStateMapper$mapOffer$1.L$3 = str6;
                                                    chargersPassesUiStateMapper$mapOffer$1.L$4 = null;
                                                    chargersPassesUiStateMapper$mapOffer$1.L$5 = mlaVar3;
                                                    chargersPassesUiStateMapper$mapOffer$1.L$6 = chargersPassType3;
                                                    chargersPassesUiStateMapper$mapOffer$1.L$7 = str7;
                                                    chargersPassesUiStateMapper$mapOffer$1.L$8 = charSequence4;
                                                    chargersPassesUiStateMapper$mapOffer$1.L$9 = charSequence5;
                                                    chargersPassesUiStateMapper$mapOffer$1.L$10 = wp2Var;
                                                    chargersPassesUiStateMapper$mapOffer$1.L$11 = list5;
                                                    chargersPassesUiStateMapper$mapOffer$1.L$12 = null;
                                                    chargersPassesUiStateMapper$mapOffer$1.L$13 = null;
                                                    chargersPassesUiStateMapper$mapOffer$1.L$14 = null;
                                                    chargersPassesUiStateMapper$mapOffer$1.L$15 = null;
                                                    chargersPassesUiStateMapper$mapOffer$1.L$16 = null;
                                                    chargersPassesUiStateMapper$mapOffer$1.L$17 = null;
                                                    chargersPassesUiStateMapper$mapOffer$1.Z$0 = z3;
                                                    boolean z9 = z3;
                                                    chargersPassesUiStateMapper$mapOffer$1.label = 5;
                                                    cVar = cVar5;
                                                    i4 = ru.yandex.taxi.widget.c.i(cVar, formattedText3, null, chargersPassesUiStateMapper$mapOffer$1, 30);
                                                    if (i4 != coroutineSingletons3) {
                                                        hfa0Var6 = hfa0Var11;
                                                        z4 = z9;
                                                        chargersPassType4 = chargersPassType3;
                                                        list2 = list5;
                                                        boolean z10 = z4;
                                                        List list6 = dkaVar4.a.h.b;
                                                        List list7 = list2;
                                                        ChargersPassesUiStateMapper$mapOffer$1 chargersPassesUiStateMapper$mapOffer$13 = chargersPassesUiStateMapper$mapOffer$1;
                                                        arrayList = new ArrayList(tcc.n(list6, 10));
                                                        coroutineSingletons = coroutineSingletons3;
                                                        mlaVar5 = mlaVar3;
                                                        hfa0Var8 = hfa0Var6;
                                                        z5 = z10;
                                                        str10 = str7;
                                                        chargersPassType6 = chargersPassType4;
                                                        it2 = list6.iterator();
                                                        charSequence6 = (CharSequence) i4;
                                                        list3 = list7;
                                                        charSequence7 = charSequence5;
                                                        chargersPassesUiStateMapper$mapOffer$12 = chargersPassesUiStateMapper$mapOffer$13;
                                                        if (!it2.hasNext()) {
                                                            ru.yandex.taxi.widget.c cVar6 = cVar;
                                                            FormattedText formattedText4 = (FormattedText) it2.next();
                                                            chargersPassesUiStateMapper$mapOffer$12.L$0 = dkaVar4;
                                                            chargersPassesUiStateMapper$mapOffer$12.L$1 = hfa0Var8;
                                                            hfa0Var10 = hfa0Var8;
                                                            chargersPassesUiStateMapper$mapOffer$12.L$2 = null;
                                                            chargersPassesUiStateMapper$mapOffer$12.L$3 = str6;
                                                            chargersPassesUiStateMapper$mapOffer$12.L$4 = null;
                                                            chargersPassesUiStateMapper$mapOffer$12.L$5 = mlaVar5;
                                                            chargersPassesUiStateMapper$mapOffer$12.L$6 = null;
                                                            chargersPassesUiStateMapper$mapOffer$12.L$7 = null;
                                                            chargersPassesUiStateMapper$mapOffer$12.L$8 = arrayList;
                                                            chargersPassesUiStateMapper$mapOffer$12.L$9 = it2;
                                                            chargersPassesUiStateMapper$mapOffer$12.L$10 = null;
                                                            chargersPassesUiStateMapper$mapOffer$12.L$11 = null;
                                                            chargersPassesUiStateMapper$mapOffer$12.L$12 = chargersPassType6;
                                                            chargersPassesUiStateMapper$mapOffer$12.L$13 = str10;
                                                            chargersPassesUiStateMapper$mapOffer$12.L$14 = charSequence4;
                                                            chargersPassesUiStateMapper$mapOffer$12.L$15 = charSequence7;
                                                            chargersPassesUiStateMapper$mapOffer$12.L$16 = wp2Var;
                                                            chargersPassesUiStateMapper$mapOffer$12.L$17 = list3;
                                                            chargersPassesUiStateMapper$mapOffer$12.L$18 = charSequence6;
                                                            chargersPassesUiStateMapper$mapOffer$12.L$19 = arrayList;
                                                            chargersPassesUiStateMapper$mapOffer$12.Z$0 = z5;
                                                            chargersPassesUiStateMapper$mapOffer$12.label = 6;
                                                            arrayList2 = arrayList;
                                                            cVar3 = cVar6;
                                                            Iterator it6 = it2;
                                                            Object i7 = ru.yandex.taxi.widget.c.i(cVar3, formattedText4, null, chargersPassesUiStateMapper$mapOffer$12, 30);
                                                            coroutineSingletons2 = coroutineSingletons;
                                                            if (i7 == coroutineSingletons2) {
                                                                return coroutineSingletons2;
                                                            }
                                                            str12 = str6;
                                                            chargersPassType8 = chargersPassType6;
                                                            it3 = it6;
                                                            str13 = str10;
                                                            charSequence10 = charSequence4;
                                                            wp2Var3 = wp2Var;
                                                            z6 = z5;
                                                            obj2 = i7;
                                                            collection3 = arrayList2;
                                                            collection3.add((CharSequence) obj2);
                                                            String str16 = str12;
                                                            coroutineSingletons = coroutineSingletons2;
                                                            it2 = it3;
                                                            str6 = str16;
                                                            cVar = cVar3;
                                                            z5 = z6;
                                                            wp2Var = wp2Var3;
                                                            charSequence4 = charSequence10;
                                                            str10 = str13;
                                                            hfa0Var8 = hfa0Var10;
                                                            arrayList = arrayList2;
                                                            chargersPassType6 = chargersPassType8;
                                                            if (!it2.hasNext()) {
                                                                CoroutineSingletons coroutineSingletons4 = coroutineSingletons;
                                                                nla nlaVar2 = new nla(charSequence6, arrayList);
                                                                ChargersPassOfferSelectorDto chargersPassOfferSelectorDto3 = dkaVar4.a.j;
                                                                chargersPassesUiStateMapper$mapOffer$12.L$0 = null;
                                                                chargersPassesUiStateMapper$mapOffer$12.L$1 = hfa0Var8;
                                                                chargersPassesUiStateMapper$mapOffer$12.L$2 = null;
                                                                chargersPassesUiStateMapper$mapOffer$12.L$3 = null;
                                                                chargersPassesUiStateMapper$mapOffer$12.L$4 = null;
                                                                chargersPassesUiStateMapper$mapOffer$12.L$5 = mlaVar5;
                                                                chargersPassesUiStateMapper$mapOffer$12.L$6 = chargersPassType6;
                                                                chargersPassesUiStateMapper$mapOffer$12.L$7 = str10;
                                                                chargersPassesUiStateMapper$mapOffer$12.L$8 = charSequence4;
                                                                chargersPassesUiStateMapper$mapOffer$12.L$9 = charSequence7;
                                                                chargersPassesUiStateMapper$mapOffer$12.L$10 = wp2Var;
                                                                chargersPassesUiStateMapper$mapOffer$12.L$11 = list3;
                                                                chargersPassesUiStateMapper$mapOffer$12.L$12 = nlaVar2;
                                                                chargersPassesUiStateMapper$mapOffer$12.L$13 = null;
                                                                chargersPassesUiStateMapper$mapOffer$12.L$14 = null;
                                                                chargersPassesUiStateMapper$mapOffer$12.L$15 = null;
                                                                chargersPassesUiStateMapper$mapOffer$12.L$16 = null;
                                                                chargersPassesUiStateMapper$mapOffer$12.L$17 = null;
                                                                chargersPassesUiStateMapper$mapOffer$12.L$18 = null;
                                                                chargersPassesUiStateMapper$mapOffer$12.L$19 = null;
                                                                chargersPassesUiStateMapper$mapOffer$12.Z$0 = z5;
                                                                chargersPassesUiStateMapper$mapOffer$12.label = 7;
                                                                obj2 = f(chargersPassOfferSelectorDto3, str6, chargersPassesUiStateMapper$mapOffer$12);
                                                                if (obj2 == coroutineSingletons4) {
                                                                    return coroutineSingletons4;
                                                                }
                                                                mlaVar6 = mlaVar5;
                                                                nlaVar = nlaVar2;
                                                                hfa0Var9 = hfa0Var8;
                                                                wp2Var2 = wp2Var;
                                                                charSequence8 = charSequence7;
                                                                charSequence9 = charSequence4;
                                                                str11 = str10;
                                                                chargersPassType7 = chargersPassType6;
                                                                return new ola(chargersPassType7, str11, charSequence9, charSequence8, wp2Var2, list3, nlaVar, (List) obj2, mlaVar6, hfa0Var9);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    charSequence2 = null;
                                    boolean z82 = z2;
                                    wp2 g2 = ly3.g(rzo.e(0, 173, 255, 255), this.a, dkaVar2.a.f);
                                    List list42 = dkaVar2.a.g;
                                    ArrayList arrayList32 = new ArrayList(tcc.n(list42, 10));
                                    Iterator it52 = list42.iterator();
                                    charSequence4 = charSequence;
                                    chargersPassType3 = chargersPassType2;
                                    charSequence5 = charSequence2;
                                    hfa0Var5 = hfa0Var3;
                                    dkaVar4 = dkaVar2;
                                    it = it52;
                                    mlaVar3 = mlaVar;
                                    collection = arrayList32;
                                    z3 = z82;
                                    str6 = str3;
                                    str7 = str4;
                                    wp2Var = g2;
                                    if (it.hasNext()) {
                                    }
                                }
                            }
                        }
                        return coroutineSingletons3;
                    case 1:
                        boolean z11 = chargersPassesUiStateMapper$mapOffer$1.Z$0;
                        String str17 = (String) chargersPassesUiStateMapper$mapOffer$1.L$3;
                        hfa0Var2 = (hfa0) chargersPassesUiStateMapper$mapOffer$1.L$1;
                        dka dkaVar6 = (dka) chargersPassesUiStateMapper$mapOffer$1.L$0;
                        kotlin.b.b(obj2);
                        z7 = z11;
                        dkaVar5 = dkaVar6;
                        obj = obj2;
                        str2 = str17;
                        mla mlaVar72 = (mla) obj;
                        i2 = rla.a[dkaVar5.a.c.ordinal()];
                        if (i2 != 1) {
                        }
                        ChargersPassesOfferResponseScreenDto$Offer chargersPassesOfferResponseScreenDto$Offer2 = dkaVar5.a;
                        String str142 = chargersPassesOfferResponseScreenDto$Offer2.b;
                        FormattedText formattedText22 = chargersPassesOfferResponseScreenDto$Offer2.d;
                        chargersPassesUiStateMapper$mapOffer$1.L$0 = dkaVar5;
                        chargersPassesUiStateMapper$mapOffer$1.L$1 = hfa0Var2;
                        chargersPassesUiStateMapper$mapOffer$1.L$2 = map;
                        chargersPassesUiStateMapper$mapOffer$1.L$3 = str2;
                        chargersPassesUiStateMapper$mapOffer$1.L$4 = map;
                        chargersPassesUiStateMapper$mapOffer$1.L$5 = mlaVar72;
                        chargersPassesUiStateMapper$mapOffer$1.L$6 = chargersPassType;
                        chargersPassesUiStateMapper$mapOffer$1.L$7 = str142;
                        chargersPassesUiStateMapper$mapOffer$1.Z$0 = z7;
                        chargersPassesUiStateMapper$mapOffer$1.label = 2;
                        i3 = ru.yandex.taxi.widget.c.i(cVar4, formattedText22, map, chargersPassesUiStateMapper$mapOffer$1, 30);
                        if (i3 != coroutineSingletons3) {
                        }
                        return coroutineSingletons3;
                    case 2:
                        z2 = chargersPassesUiStateMapper$mapOffer$1.Z$0;
                        String str18 = (String) chargersPassesUiStateMapper$mapOffer$1.L$7;
                        ChargersPassType chargersPassType9 = (ChargersPassType) chargersPassesUiStateMapper$mapOffer$1.L$6;
                        mla mlaVar8 = (mla) chargersPassesUiStateMapper$mapOffer$1.L$5;
                        String str19 = (String) chargersPassesUiStateMapper$mapOffer$1.L$3;
                        hfa0 hfa0Var12 = (hfa0) chargersPassesUiStateMapper$mapOffer$1.L$1;
                        dka dkaVar7 = (dka) chargersPassesUiStateMapper$mapOffer$1.L$0;
                        kotlin.b.b(obj2);
                        str4 = str18;
                        mlaVar = mlaVar8;
                        chargersPassType2 = chargersPassType9;
                        dkaVar2 = dkaVar7;
                        hfa0Var3 = hfa0Var12;
                        str3 = str19;
                        map = null;
                        charSequence = (CharSequence) obj2;
                        formattedText = dkaVar2.a.e;
                        if (formattedText == null) {
                        }
                        break;
                    case 3:
                        z2 = chargersPassesUiStateMapper$mapOffer$1.Z$0;
                        charSequence3 = (CharSequence) chargersPassesUiStateMapper$mapOffer$1.L$9;
                        str4 = (String) chargersPassesUiStateMapper$mapOffer$1.L$8;
                        chargersPassType2 = (ChargersPassType) chargersPassesUiStateMapper$mapOffer$1.L$7;
                        mlaVar2 = (mla) chargersPassesUiStateMapper$mapOffer$1.L$5;
                        str5 = (String) chargersPassesUiStateMapper$mapOffer$1.L$3;
                        hfa0Var4 = (hfa0) chargersPassesUiStateMapper$mapOffer$1.L$1;
                        dkaVar3 = (dka) chargersPassesUiStateMapper$mapOffer$1.L$0;
                        kotlin.b.b(obj2);
                        CharSequence charSequence112 = (CharSequence) obj2;
                        charSequence = charSequence3;
                        mlaVar = mlaVar2;
                        charSequence2 = charSequence112;
                        dkaVar2 = dkaVar3;
                        hfa0Var3 = hfa0Var4;
                        str3 = str5;
                        boolean z822 = z2;
                        wp2 g22 = ly3.g(rzo.e(0, 173, 255, 255), this.a, dkaVar2.a.f);
                        List list422 = dkaVar2.a.g;
                        ArrayList arrayList322 = new ArrayList(tcc.n(list422, 10));
                        Iterator it522 = list422.iterator();
                        charSequence4 = charSequence;
                        chargersPassType3 = chargersPassType2;
                        charSequence5 = charSequence2;
                        hfa0Var5 = hfa0Var3;
                        dkaVar4 = dkaVar2;
                        it = it522;
                        mlaVar3 = mlaVar;
                        collection = arrayList322;
                        z3 = z822;
                        str6 = str3;
                        str7 = str4;
                        wp2Var = g22;
                        if (it.hasNext()) {
                        }
                        return coroutineSingletons3;
                    case 4:
                        boolean z12 = chargersPassesUiStateMapper$mapOffer$1.Z$0;
                        collection = (Collection) chargersPassesUiStateMapper$mapOffer$1.L$17;
                        wp2Var = (wp2) chargersPassesUiStateMapper$mapOffer$1.L$16;
                        charSequence5 = (CharSequence) chargersPassesUiStateMapper$mapOffer$1.L$15;
                        CharSequence charSequence12 = (CharSequence) chargersPassesUiStateMapper$mapOffer$1.L$14;
                        String str20 = (String) chargersPassesUiStateMapper$mapOffer$1.L$13;
                        chargersPassType5 = (ChargersPassType) chargersPassesUiStateMapper$mapOffer$1.L$12;
                        it = (Iterator) chargersPassesUiStateMapper$mapOffer$1.L$9;
                        collection2 = (Collection) chargersPassesUiStateMapper$mapOffer$1.L$8;
                        mlaVar4 = (mla) chargersPassesUiStateMapper$mapOffer$1.L$5;
                        str9 = (String) chargersPassesUiStateMapper$mapOffer$1.L$3;
                        hfa0 hfa0Var13 = (hfa0) chargersPassesUiStateMapper$mapOffer$1.L$1;
                        dka dkaVar8 = (dka) chargersPassesUiStateMapper$mapOffer$1.L$0;
                        kotlin.b.b(obj2);
                        hfa0Var7 = hfa0Var13;
                        cVar2 = cVar4;
                        str8 = str20;
                        charSequence4 = charSequence12;
                        dkaVar4 = dkaVar8;
                        z3 = z12;
                        collection.add((lla) obj2);
                        chargersPassType3 = chargersPassType5;
                        collection = collection2;
                        mlaVar3 = mlaVar4;
                        str6 = str9;
                        hfa0Var5 = hfa0Var7;
                        str7 = str8;
                        cVar4 = cVar2;
                        if (it.hasNext()) {
                        }
                        return coroutineSingletons3;
                    case 5:
                        z4 = chargersPassesUiStateMapper$mapOffer$1.Z$0;
                        List list8 = (List) chargersPassesUiStateMapper$mapOffer$1.L$11;
                        wp2Var = (wp2) chargersPassesUiStateMapper$mapOffer$1.L$10;
                        charSequence5 = (CharSequence) chargersPassesUiStateMapper$mapOffer$1.L$9;
                        charSequence4 = (CharSequence) chargersPassesUiStateMapper$mapOffer$1.L$8;
                        str7 = (String) chargersPassesUiStateMapper$mapOffer$1.L$7;
                        chargersPassType4 = (ChargersPassType) chargersPassesUiStateMapper$mapOffer$1.L$6;
                        mlaVar3 = (mla) chargersPassesUiStateMapper$mapOffer$1.L$5;
                        str6 = (String) chargersPassesUiStateMapper$mapOffer$1.L$3;
                        hfa0Var6 = (hfa0) chargersPassesUiStateMapper$mapOffer$1.L$1;
                        dkaVar4 = (dka) chargersPassesUiStateMapper$mapOffer$1.L$0;
                        kotlin.b.b(obj2);
                        list2 = list8;
                        cVar = cVar4;
                        i4 = obj2;
                        boolean z102 = z4;
                        List list62 = dkaVar4.a.h.b;
                        List list72 = list2;
                        ChargersPassesUiStateMapper$mapOffer$1 chargersPassesUiStateMapper$mapOffer$132 = chargersPassesUiStateMapper$mapOffer$1;
                        arrayList = new ArrayList(tcc.n(list62, 10));
                        coroutineSingletons = coroutineSingletons3;
                        mlaVar5 = mlaVar3;
                        hfa0Var8 = hfa0Var6;
                        z5 = z102;
                        str10 = str7;
                        chargersPassType6 = chargersPassType4;
                        it2 = list62.iterator();
                        charSequence6 = (CharSequence) i4;
                        list3 = list72;
                        charSequence7 = charSequence5;
                        chargersPassesUiStateMapper$mapOffer$12 = chargersPassesUiStateMapper$mapOffer$132;
                        if (!it2.hasNext()) {
                        }
                        break;
                    case 6:
                        boolean z13 = chargersPassesUiStateMapper$mapOffer$1.Z$0;
                        collection3 = (Collection) chargersPassesUiStateMapper$mapOffer$1.L$19;
                        CharSequence charSequence13 = (CharSequence) chargersPassesUiStateMapper$mapOffer$1.L$18;
                        List list9 = (List) chargersPassesUiStateMapper$mapOffer$1.L$17;
                        wp2Var3 = (wp2) chargersPassesUiStateMapper$mapOffer$1.L$16;
                        CharSequence charSequence14 = (CharSequence) chargersPassesUiStateMapper$mapOffer$1.L$15;
                        charSequence10 = (CharSequence) chargersPassesUiStateMapper$mapOffer$1.L$14;
                        String str21 = (String) chargersPassesUiStateMapper$mapOffer$1.L$13;
                        ChargersPassType chargersPassType10 = (ChargersPassType) chargersPassesUiStateMapper$mapOffer$1.L$12;
                        Iterator it7 = (Iterator) chargersPassesUiStateMapper$mapOffer$1.L$9;
                        ?? r12 = (Collection) chargersPassesUiStateMapper$mapOffer$1.L$8;
                        mla mlaVar9 = (mla) chargersPassesUiStateMapper$mapOffer$1.L$5;
                        String str22 = (String) chargersPassesUiStateMapper$mapOffer$1.L$3;
                        hfa0 hfa0Var14 = (hfa0) chargersPassesUiStateMapper$mapOffer$1.L$1;
                        dka dkaVar9 = (dka) chargersPassesUiStateMapper$mapOffer$1.L$0;
                        kotlin.b.b(obj2);
                        dkaVar4 = dkaVar9;
                        list3 = list9;
                        mlaVar5 = mlaVar9;
                        str12 = str22;
                        hfa0Var10 = hfa0Var14;
                        arrayList2 = r12;
                        chargersPassType8 = chargersPassType10;
                        coroutineSingletons2 = coroutineSingletons3;
                        str13 = str21;
                        it3 = it7;
                        chargersPassesUiStateMapper$mapOffer$12 = chargersPassesUiStateMapper$mapOffer$1;
                        cVar3 = cVar4;
                        charSequence7 = charSequence14;
                        charSequence6 = charSequence13;
                        z6 = z13;
                        collection3.add((CharSequence) obj2);
                        String str162 = str12;
                        coroutineSingletons = coroutineSingletons2;
                        it2 = it3;
                        str6 = str162;
                        cVar = cVar3;
                        z5 = z6;
                        wp2Var = wp2Var3;
                        charSequence4 = charSequence10;
                        str10 = str13;
                        hfa0Var8 = hfa0Var10;
                        arrayList = arrayList2;
                        chargersPassType6 = chargersPassType8;
                        if (!it2.hasNext()) {
                        }
                        break;
                    case 7:
                        nla nlaVar3 = (nla) chargersPassesUiStateMapper$mapOffer$1.L$12;
                        list3 = (List) chargersPassesUiStateMapper$mapOffer$1.L$11;
                        wp2 wp2Var4 = (wp2) chargersPassesUiStateMapper$mapOffer$1.L$10;
                        CharSequence charSequence15 = (CharSequence) chargersPassesUiStateMapper$mapOffer$1.L$9;
                        CharSequence charSequence16 = (CharSequence) chargersPassesUiStateMapper$mapOffer$1.L$8;
                        String str23 = (String) chargersPassesUiStateMapper$mapOffer$1.L$7;
                        ChargersPassType chargersPassType11 = (ChargersPassType) chargersPassesUiStateMapper$mapOffer$1.L$6;
                        mla mlaVar10 = (mla) chargersPassesUiStateMapper$mapOffer$1.L$5;
                        hfa0 hfa0Var15 = (hfa0) chargersPassesUiStateMapper$mapOffer$1.L$1;
                        kotlin.b.b(obj2);
                        nlaVar = nlaVar3;
                        wp2Var2 = wp2Var4;
                        charSequence8 = charSequence15;
                        charSequence9 = charSequence16;
                        str11 = str23;
                        chargersPassType7 = chargersPassType11;
                        mlaVar6 = mlaVar10;
                        hfa0Var9 = hfa0Var15;
                        return new ola(chargersPassType7, str11, charSequence9, charSequence8, wp2Var2, list3, nlaVar, (List) obj2, mlaVar6, hfa0Var9);
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        chargersPassesUiStateMapper$mapOffer$1 = new ChargersPassesUiStateMapper$mapOffer$1(this, continuationImpl);
        Object obj22 = chargersPassesUiStateMapper$mapOffer$1.result;
        CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersPassesUiStateMapper$mapOffer$1.label;
        ru.yandex.taxi.widget.c cVar42 = this.c;
        switch (i) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x016d, code lost:
    
        if (r15 == r1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0136, code lost:
    
        if (r15 != r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x011a, code lost:
    
        if (r15 == r1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0153, code lost:
    
        if (r15 == r1) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(boolean z, dka dkaVar, ChargersPassOfferSelectorOptionDto chargersPassOfferSelectorOptionDto, ContinuationImpl continuationImpl) {
        ChargersPassesUiStateMapper$mapOfferBottom$1 chargersPassesUiStateMapper$mapOfferBottom$1;
        int i;
        wj90 wj90Var;
        ChargersPassButtonDto chargersPassButtonDto;
        wj90 wj90Var2;
        ChargersPassButtonDto chargersPassButtonDto2;
        wj90 wj90Var3;
        if (continuationImpl instanceof ChargersPassesUiStateMapper$mapOfferBottom$1) {
            chargersPassesUiStateMapper$mapOfferBottom$1 = (ChargersPassesUiStateMapper$mapOfferBottom$1) continuationImpl;
            int i2 = chargersPassesUiStateMapper$mapOfferBottom$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersPassesUiStateMapper$mapOfferBottom$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersPassesUiStateMapper$mapOfferBottom$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersPassesUiStateMapper$mapOfferBottom$1.label;
                ru.yandex.taxi.widget.c cVar = this.c;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (z) {
                        int i3 = rla.a[dkaVar.a.c.ordinal()];
                        k kVar = this.d;
                        if (i3 != 1) {
                            ChargersPassButtonDto chargersPassButtonDto3 = dkaVar.a.i.a;
                            chargersPassesUiStateMapper$mapOfferBottom$1.L$0 = dkaVar;
                            chargersPassesUiStateMapper$mapOfferBottom$1.L$1 = null;
                            chargersPassesUiStateMapper$mapOfferBottom$1.Z$0 = z;
                            chargersPassesUiStateMapper$mapOfferBottom$1.label = 4;
                            obj = kVar.b(chargersPassButtonDto3, chargersPassesUiStateMapper$mapOfferBottom$1);
                        } else if (chargersPassOfferSelectorOptionDto == null || (chargersPassButtonDto = chargersPassOfferSelectorOptionDto.f) == null) {
                            wj90Var = null;
                            FormattedText formattedText = dkaVar.a.i.b;
                            chargersPassesUiStateMapper$mapOfferBottom$1.L$0 = null;
                            chargersPassesUiStateMapper$mapOfferBottom$1.L$1 = null;
                            chargersPassesUiStateMapper$mapOfferBottom$1.L$2 = wj90Var;
                            chargersPassesUiStateMapper$mapOfferBottom$1.Z$0 = z;
                            chargersPassesUiStateMapper$mapOfferBottom$1.label = 3;
                            obj = ru.yandex.taxi.widget.c.i(cVar, formattedText, null, chargersPassesUiStateMapper$mapOfferBottom$1, 30);
                        } else {
                            chargersPassesUiStateMapper$mapOfferBottom$1.L$0 = dkaVar;
                            chargersPassesUiStateMapper$mapOfferBottom$1.L$1 = null;
                            chargersPassesUiStateMapper$mapOfferBottom$1.L$2 = null;
                            chargersPassesUiStateMapper$mapOfferBottom$1.Z$0 = z;
                            chargersPassesUiStateMapper$mapOfferBottom$1.label = 2;
                            obj = kVar.b(chargersPassButtonDto, chargersPassesUiStateMapper$mapOfferBottom$1);
                        }
                    } else {
                        int i4 = rla.a[dkaVar.a.c.ordinal()];
                        ru.yandex.taxi.widget.utils.e eVar = this.b;
                        wj90 wj90Var4 = new wj90(i4 == 1 ? eVar.a.getString(kyh0.chargers_passes_login_in_account_first_and_buy_package) : eVar.a.getString(kyh0.chargers_passes_login_in_account_first_and_buy_subscription), this.a.a((chargersPassOfferSelectorOptionDto == null || (chargersPassButtonDto2 = chargersPassOfferSelectorOptionDto.f) == null) ? null : chargersPassButtonDto2.b, AppColor$Palette.Control), yka.a);
                        FormattedText formattedText2 = dkaVar.a.i.b;
                        chargersPassesUiStateMapper$mapOfferBottom$1.L$0 = null;
                        chargersPassesUiStateMapper$mapOfferBottom$1.L$1 = null;
                        chargersPassesUiStateMapper$mapOfferBottom$1.L$2 = null;
                        chargersPassesUiStateMapper$mapOfferBottom$1.L$3 = wj90Var4;
                        chargersPassesUiStateMapper$mapOfferBottom$1.Z$0 = z;
                        chargersPassesUiStateMapper$mapOfferBottom$1.label = 1;
                        obj = ru.yandex.taxi.widget.c.i(cVar, formattedText2, null, chargersPassesUiStateMapper$mapOfferBottom$1, 30);
                        if (obj != coroutineSingletons) {
                            wj90Var2 = wj90Var4;
                            return new mla(wj90Var2, (CharSequence) obj);
                        }
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    wj90Var2 = (wj90) chargersPassesUiStateMapper$mapOfferBottom$1.L$3;
                    kotlin.b.b(obj);
                    return new mla(wj90Var2, (CharSequence) obj);
                }
                if (i == 2) {
                    z = chargersPassesUiStateMapper$mapOfferBottom$1.Z$0;
                    dkaVar = (dka) chargersPassesUiStateMapper$mapOfferBottom$1.L$0;
                    kotlin.b.b(obj);
                    wj90Var = (wj90) obj;
                    FormattedText formattedText3 = dkaVar.a.i.b;
                    chargersPassesUiStateMapper$mapOfferBottom$1.L$0 = null;
                    chargersPassesUiStateMapper$mapOfferBottom$1.L$1 = null;
                    chargersPassesUiStateMapper$mapOfferBottom$1.L$2 = wj90Var;
                    chargersPassesUiStateMapper$mapOfferBottom$1.Z$0 = z;
                    chargersPassesUiStateMapper$mapOfferBottom$1.label = 3;
                    obj = ru.yandex.taxi.widget.c.i(cVar, formattedText3, null, chargersPassesUiStateMapper$mapOfferBottom$1, 30);
                } else {
                    if (i == 3) {
                        wj90Var = (wj90) chargersPassesUiStateMapper$mapOfferBottom$1.L$2;
                        kotlin.b.b(obj);
                        return new mla(wj90Var, (CharSequence) obj);
                    }
                    if (i != 4) {
                        if (i != 5) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        wj90Var3 = (wj90) chargersPassesUiStateMapper$mapOfferBottom$1.L$2;
                        kotlin.b.b(obj);
                        return new mla(wj90Var3, (CharSequence) obj);
                    }
                    z = chargersPassesUiStateMapper$mapOfferBottom$1.Z$0;
                    dkaVar = (dka) chargersPassesUiStateMapper$mapOfferBottom$1.L$0;
                    kotlin.b.b(obj);
                    wj90Var3 = (wj90) obj;
                    FormattedText formattedText4 = dkaVar.a.i.b;
                    chargersPassesUiStateMapper$mapOfferBottom$1.L$0 = null;
                    chargersPassesUiStateMapper$mapOfferBottom$1.L$1 = null;
                    chargersPassesUiStateMapper$mapOfferBottom$1.L$2 = wj90Var3;
                    chargersPassesUiStateMapper$mapOfferBottom$1.Z$0 = z;
                    chargersPassesUiStateMapper$mapOfferBottom$1.label = 5;
                    obj = ru.yandex.taxi.widget.c.i(cVar, formattedText4, null, chargersPassesUiStateMapper$mapOfferBottom$1, 30);
                }
            }
        }
        chargersPassesUiStateMapper$mapOfferBottom$1 = new ChargersPassesUiStateMapper$mapOfferBottom$1(this, continuationImpl);
        Object obj2 = chargersPassesUiStateMapper$mapOfferBottom$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersPassesUiStateMapper$mapOfferBottom$1.label;
        ru.yandex.taxi.widget.c cVar2 = this.c;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x015a, code lost:
    
        if (r2 == r4) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r15v6, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0192 -> B:12:0x0069). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(ChargersPassOfferSelectorDto chargersPassOfferSelectorDto, String str, ContinuationImpl continuationImpl) {
        ChargersPassesUiStateMapper$mapPackages$1 chargersPassesUiStateMapper$mapPackages$1;
        int i;
        ChargersPassesUiStateMapper$mapPackages$1 chargersPassesUiStateMapper$mapPackages$12;
        ArrayList arrayList;
        Iterator it;
        String str2;
        ArrayList arrayList2;
        String str3;
        String str4;
        CharSequence charSequence;
        ChargersPassOfferSelectorOptionDto chargersPassOfferSelectorOptionDto;
        Iterator it2;
        CharSequence charSequence2;
        Collection collection;
        ChargersPassOfferSelectorOptionDto chargersPassOfferSelectorOptionDto2;
        Object i2;
        ?? r12;
        Iterator it3;
        String str5;
        CharSequence charSequence3;
        FormattedText formattedText;
        if (continuationImpl instanceof ChargersPassesUiStateMapper$mapPackages$1) {
            chargersPassesUiStateMapper$mapPackages$1 = (ChargersPassesUiStateMapper$mapPackages$1) continuationImpl;
            int i3 = chargersPassesUiStateMapper$mapPackages$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                chargersPassesUiStateMapper$mapPackages$1.label = i3 - Integer.MIN_VALUE;
                Object obj = chargersPassesUiStateMapper$mapPackages$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersPassesUiStateMapper$mapPackages$1.label;
                ru.yandex.taxi.widget.c cVar = this.c;
                int i4 = 1;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (chargersPassOfferSelectorDto == null) {
                        return EmptyList.a;
                    }
                    List list = chargersPassOfferSelectorDto.b;
                    chargersPassesUiStateMapper$mapPackages$12 = chargersPassesUiStateMapper$mapPackages$1;
                    arrayList = new ArrayList(tcc.n(list, 10));
                    it = list.iterator();
                    str2 = str;
                    if (it.hasNext()) {
                    }
                } else if (i == 1) {
                    collection = (Collection) chargersPassesUiStateMapper$mapPackages$1.L$9;
                    String str6 = (String) chargersPassesUiStateMapper$mapPackages$1.L$8;
                    ChargersPassOfferSelectorOptionDto chargersPassOfferSelectorOptionDto3 = (ChargersPassOfferSelectorOptionDto) chargersPassesUiStateMapper$mapPackages$1.L$7;
                    Iterator it4 = (Iterator) chargersPassesUiStateMapper$mapPackages$1.L$5;
                    Collection collection2 = (Collection) chargersPassesUiStateMapper$mapPackages$1.L$4;
                    String str7 = (String) chargersPassesUiStateMapper$mapPackages$1.L$1;
                    kotlin.b.b(obj);
                    str3 = str7;
                    r12 = collection2;
                    it3 = it4;
                    chargersPassOfferSelectorOptionDto = chargersPassOfferSelectorOptionDto3;
                    str5 = str6;
                    charSequence3 = (CharSequence) obj;
                    formattedText = chargersPassOfferSelectorOptionDto.e;
                    if (formattedText == null) {
                    }
                } else {
                    if (i == 2) {
                        collection = (Collection) chargersPassesUiStateMapper$mapPackages$1.L$11;
                        charSequence3 = (CharSequence) chargersPassesUiStateMapper$mapPackages$1.L$9;
                        str5 = (String) chargersPassesUiStateMapper$mapPackages$1.L$8;
                        chargersPassOfferSelectorOptionDto = (ChargersPassOfferSelectorOptionDto) chargersPassesUiStateMapper$mapPackages$1.L$7;
                        it3 = (Iterator) chargersPassesUiStateMapper$mapPackages$1.L$5;
                        r12 = (Collection) chargersPassesUiStateMapper$mapPackages$1.L$4;
                        str3 = (String) chargersPassesUiStateMapper$mapPackages$1.L$1;
                        kotlin.b.b(obj);
                        arrayList2 = r12;
                        str4 = str5;
                        it2 = it3;
                        charSequence = charSequence3;
                        charSequence2 = (CharSequence) obj;
                        String str8 = str3;
                        chargersPassOfferSelectorOptionDto2 = chargersPassOfferSelectorOptionDto;
                        FormattedText formattedText2 = chargersPassOfferSelectorOptionDto2.d;
                        chargersPassesUiStateMapper$mapPackages$1.L$0 = null;
                        chargersPassesUiStateMapper$mapPackages$1.L$1 = str8;
                        chargersPassesUiStateMapper$mapPackages$1.L$2 = null;
                        chargersPassesUiStateMapper$mapPackages$1.L$3 = null;
                        chargersPassesUiStateMapper$mapPackages$1.L$4 = arrayList2;
                        chargersPassesUiStateMapper$mapPackages$1.L$5 = it2;
                        chargersPassesUiStateMapper$mapPackages$1.L$6 = null;
                        chargersPassesUiStateMapper$mapPackages$1.L$7 = chargersPassOfferSelectorOptionDto2;
                        chargersPassesUiStateMapper$mapPackages$1.L$8 = str4;
                        chargersPassesUiStateMapper$mapPackages$1.L$9 = charSequence;
                        chargersPassesUiStateMapper$mapPackages$1.L$10 = charSequence2;
                        chargersPassesUiStateMapper$mapPackages$1.L$11 = collection;
                        chargersPassesUiStateMapper$mapPackages$1.label = 3;
                        i2 = ru.yandex.taxi.widget.c.i(cVar, formattedText2, null, chargersPassesUiStateMapper$mapPackages$1, 30);
                        if (i2 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    }
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Collection collection3 = (Collection) chargersPassesUiStateMapper$mapPackages$1.L$11;
                    charSequence2 = (CharSequence) chargersPassesUiStateMapper$mapPackages$1.L$10;
                    charSequence = (CharSequence) chargersPassesUiStateMapper$mapPackages$1.L$9;
                    str4 = (String) chargersPassesUiStateMapper$mapPackages$1.L$8;
                    chargersPassOfferSelectorOptionDto2 = (ChargersPassOfferSelectorOptionDto) chargersPassesUiStateMapper$mapPackages$1.L$7;
                    Iterator it5 = (Iterator) chargersPassesUiStateMapper$mapPackages$1.L$5;
                    ?? r15 = (Collection) chargersPassesUiStateMapper$mapPackages$1.L$4;
                    String str9 = (String) chargersPassesUiStateMapper$mapPackages$1.L$1;
                    kotlin.b.b(obj);
                    i2 = obj;
                    Collection collection4 = collection3;
                    str2 = str9;
                    it2 = it5;
                    ArrayList arrayList3 = r15;
                    CharSequence charSequence4 = charSequence2;
                    chargersPassesUiStateMapper$mapPackages$12 = chargersPassesUiStateMapper$mapPackages$1;
                    arrayList = arrayList3;
                    collection4.add(new nga(str4, charSequence, charSequence4, (CharSequence) i2, jl40.l(chargersPassOfferSelectorOptionDto2.a, str2)));
                    it = it2;
                    i4 = 1;
                    if (it.hasNext()) {
                        ChargersPassOfferSelectorOptionDto chargersPassOfferSelectorOptionDto4 = (ChargersPassOfferSelectorOptionDto) it.next();
                        String str10 = chargersPassOfferSelectorOptionDto4.a;
                        FormattedText formattedText3 = chargersPassOfferSelectorOptionDto4.c;
                        chargersPassesUiStateMapper$mapPackages$12.L$0 = null;
                        chargersPassesUiStateMapper$mapPackages$12.L$1 = str2;
                        chargersPassesUiStateMapper$mapPackages$12.L$2 = null;
                        chargersPassesUiStateMapper$mapPackages$12.L$3 = null;
                        chargersPassesUiStateMapper$mapPackages$12.L$4 = arrayList;
                        chargersPassesUiStateMapper$mapPackages$12.L$5 = it;
                        chargersPassesUiStateMapper$mapPackages$12.L$6 = null;
                        chargersPassesUiStateMapper$mapPackages$12.L$7 = chargersPassOfferSelectorOptionDto4;
                        chargersPassesUiStateMapper$mapPackages$12.L$8 = str10;
                        chargersPassesUiStateMapper$mapPackages$12.L$9 = arrayList;
                        chargersPassesUiStateMapper$mapPackages$12.L$10 = null;
                        chargersPassesUiStateMapper$mapPackages$12.L$11 = null;
                        chargersPassesUiStateMapper$mapPackages$12.label = i4;
                        Object i5 = ru.yandex.taxi.widget.c.i(cVar, formattedText3, null, chargersPassesUiStateMapper$mapPackages$12, 30);
                        if (i5 != coroutineSingletons) {
                            it3 = it;
                            obj = i5;
                            chargersPassOfferSelectorOptionDto = chargersPassOfferSelectorOptionDto4;
                            str5 = str10;
                            str3 = str2;
                            collection = arrayList;
                            r12 = collection;
                            chargersPassesUiStateMapper$mapPackages$1 = chargersPassesUiStateMapper$mapPackages$12;
                            charSequence3 = (CharSequence) obj;
                            formattedText = chargersPassOfferSelectorOptionDto.e;
                            if (formattedText == null) {
                                chargersPassesUiStateMapper$mapPackages$1.L$0 = null;
                                chargersPassesUiStateMapper$mapPackages$1.L$1 = str3;
                                chargersPassesUiStateMapper$mapPackages$1.L$2 = null;
                                chargersPassesUiStateMapper$mapPackages$1.L$3 = null;
                                chargersPassesUiStateMapper$mapPackages$1.L$4 = r12;
                                chargersPassesUiStateMapper$mapPackages$1.L$5 = it3;
                                chargersPassesUiStateMapper$mapPackages$1.L$6 = null;
                                chargersPassesUiStateMapper$mapPackages$1.L$7 = chargersPassOfferSelectorOptionDto;
                                chargersPassesUiStateMapper$mapPackages$1.L$8 = str5;
                                chargersPassesUiStateMapper$mapPackages$1.L$9 = charSequence3;
                                chargersPassesUiStateMapper$mapPackages$1.L$10 = null;
                                chargersPassesUiStateMapper$mapPackages$1.L$11 = collection;
                                chargersPassesUiStateMapper$mapPackages$1.label = 2;
                                obj = ru.yandex.taxi.widget.c.i(cVar, formattedText, null, chargersPassesUiStateMapper$mapPackages$1, 30);
                            } else {
                                arrayList2 = r12;
                                str4 = str5;
                                it2 = it3;
                                charSequence = charSequence3;
                                charSequence2 = null;
                                String str82 = str3;
                                chargersPassOfferSelectorOptionDto2 = chargersPassOfferSelectorOptionDto;
                                FormattedText formattedText22 = chargersPassOfferSelectorOptionDto2.d;
                                chargersPassesUiStateMapper$mapPackages$1.L$0 = null;
                                chargersPassesUiStateMapper$mapPackages$1.L$1 = str82;
                                chargersPassesUiStateMapper$mapPackages$1.L$2 = null;
                                chargersPassesUiStateMapper$mapPackages$1.L$3 = null;
                                chargersPassesUiStateMapper$mapPackages$1.L$4 = arrayList2;
                                chargersPassesUiStateMapper$mapPackages$1.L$5 = it2;
                                chargersPassesUiStateMapper$mapPackages$1.L$6 = null;
                                chargersPassesUiStateMapper$mapPackages$1.L$7 = chargersPassOfferSelectorOptionDto2;
                                chargersPassesUiStateMapper$mapPackages$1.L$8 = str4;
                                chargersPassesUiStateMapper$mapPackages$1.L$9 = charSequence;
                                chargersPassesUiStateMapper$mapPackages$1.L$10 = charSequence2;
                                chargersPassesUiStateMapper$mapPackages$1.L$11 = collection;
                                chargersPassesUiStateMapper$mapPackages$1.label = 3;
                                i2 = ru.yandex.taxi.widget.c.i(cVar, formattedText22, null, chargersPassesUiStateMapper$mapPackages$1, 30);
                                if (i2 != coroutineSingletons) {
                                    collection4 = collection;
                                    str2 = str82;
                                    arrayList3 = arrayList2;
                                    CharSequence charSequence42 = charSequence2;
                                    chargersPassesUiStateMapper$mapPackages$12 = chargersPassesUiStateMapper$mapPackages$1;
                                    arrayList = arrayList3;
                                    collection4.add(new nga(str4, charSequence, charSequence42, (CharSequence) i2, jl40.l(chargersPassOfferSelectorOptionDto2.a, str2)));
                                    it = it2;
                                    i4 = 1;
                                    if (it.hasNext()) {
                                        return arrayList;
                                    }
                                }
                            }
                        }
                        return coroutineSingletons;
                    }
                }
            }
        }
        chargersPassesUiStateMapper$mapPackages$1 = new ChargersPassesUiStateMapper$mapPackages$1(this, continuationImpl);
        Object obj2 = chargersPassesUiStateMapper$mapPackages$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersPassesUiStateMapper$mapPackages$1.label;
        ru.yandex.taxi.widget.c cVar2 = this.c;
        int i42 = 1;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(ChargersPassProgressDto chargersPassProgressDto, ContinuationImpl continuationImpl) {
        ChargersPassesUiStateMapper$mapProgress$1 chargersPassesUiStateMapper$mapProgress$1;
        int i;
        ChargersPassProgressDto chargersPassProgressDto2;
        float f;
        if (continuationImpl instanceof ChargersPassesUiStateMapper$mapProgress$1) {
            chargersPassesUiStateMapper$mapProgress$1 = (ChargersPassesUiStateMapper$mapProgress$1) continuationImpl;
            int i2 = chargersPassesUiStateMapper$mapProgress$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersPassesUiStateMapper$mapProgress$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersPassesUiStateMapper$mapProgress$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersPassesUiStateMapper$mapProgress$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    int i3 = chargersPassProgressDto.c;
                    if (i3 < 1) {
                        i3 = 1;
                    }
                    int d = y6i0.d(chargersPassProgressDto.b, 0, i3);
                    float f2 = d / i3;
                    FormattedText formattedText = chargersPassProgressDto.a;
                    chargersPassesUiStateMapper$mapProgress$1.L$0 = chargersPassProgressDto;
                    chargersPassesUiStateMapper$mapProgress$1.I$0 = i3;
                    chargersPassesUiStateMapper$mapProgress$1.I$1 = d;
                    chargersPassesUiStateMapper$mapProgress$1.F$0 = f2;
                    chargersPassesUiStateMapper$mapProgress$1.label = 1;
                    obj = ru.yandex.taxi.widget.c.i(this.c, formattedText, null, chargersPassesUiStateMapper$mapProgress$1, 30);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    chargersPassProgressDto2 = chargersPassProgressDto;
                    f = f2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f = chargersPassesUiStateMapper$mapProgress$1.F$0;
                    chargersPassProgressDto2 = (ChargersPassProgressDto) chargersPassesUiStateMapper$mapProgress$1.L$0;
                    kotlin.b.b(obj);
                }
                String str = chargersPassProgressDto2.d;
                AppColor$Palette appColor$Palette = AppColor$Palette.Background;
                yp2 yp2Var = this.a;
                return new ffa(f, (CharSequence) obj, yp2Var.a(str, appColor$Palette), ly3.g(rzo.e(0, 173, 255, 255), yp2Var, chargersPassProgressDto2.e));
            }
        }
        chargersPassesUiStateMapper$mapProgress$1 = new ChargersPassesUiStateMapper$mapProgress$1(this, continuationImpl);
        Object obj2 = chargersPassesUiStateMapper$mapProgress$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersPassesUiStateMapper$mapProgress$1.label;
        if (i != 0) {
        }
        String str2 = chargersPassProgressDto2.d;
        AppColor$Palette appColor$Palette2 = AppColor$Palette.Background;
        yp2 yp2Var2 = this.a;
        return new ffa(f, (CharSequence) obj2, yp2Var2.a(str2, appColor$Palette2), ly3.g(rzo.e(0, 173, 255, 255), yp2Var2, chargersPassProgressDto2.e));
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00dc, code lost:
    
        if (r12 == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009e, code lost:
    
        if (r12 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x012d -> B:12:0x012e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00dc -> B:25:0x00df). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(eka ekaVar, boolean z, ContinuationImpl continuationImpl) {
        ChargersPassesUiStateMapper$mapPurchasedPasses$1 chargersPassesUiStateMapper$mapPurchasedPasses$1;
        int i;
        Collection arrayList;
        Iterator it;
        eka ekaVar2;
        boolean z2;
        CharSequence charSequence;
        CharSequence charSequence2;
        Collection arrayList2;
        List list;
        Iterator it2;
        if (continuationImpl instanceof ChargersPassesUiStateMapper$mapPurchasedPasses$1) {
            chargersPassesUiStateMapper$mapPurchasedPasses$1 = (ChargersPassesUiStateMapper$mapPurchasedPasses$1) continuationImpl;
            int i2 = chargersPassesUiStateMapper$mapPurchasedPasses$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersPassesUiStateMapper$mapPurchasedPasses$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersPassesUiStateMapper$mapPurchasedPasses$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersPassesUiStateMapper$mapPurchasedPasses$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    FormattedText formattedText = ekaVar.a;
                    chargersPassesUiStateMapper$mapPurchasedPasses$1.L$0 = ekaVar;
                    chargersPassesUiStateMapper$mapPurchasedPasses$1.Z$0 = z;
                    chargersPassesUiStateMapper$mapPurchasedPasses$1.label = 1;
                    obj = ru.yandex.taxi.widget.c.i(this.c, formattedText, null, chargersPassesUiStateMapper$mapPurchasedPasses$1, 30);
                } else if (i == 1) {
                    z = chargersPassesUiStateMapper$mapPurchasedPasses$1.Z$0;
                    ekaVar = (eka) chargersPassesUiStateMapper$mapPurchasedPasses$1.L$0;
                    kotlin.b.b(obj);
                } else if (i == 2) {
                    z2 = chargersPassesUiStateMapper$mapPurchasedPasses$1.Z$0;
                    charSequence = (CharSequence) chargersPassesUiStateMapper$mapPurchasedPasses$1.L$9;
                    it = (Iterator) chargersPassesUiStateMapper$mapPurchasedPasses$1.L$5;
                    arrayList = (Collection) chargersPassesUiStateMapper$mapPurchasedPasses$1.L$3;
                    ekaVar2 = (eka) chargersPassesUiStateMapper$mapPurchasedPasses$1.L$0;
                    kotlin.b.b(obj);
                    hfa hfaVar = (hfa) obj;
                    if (hfaVar != null) {
                        arrayList.add(hfaVar);
                    }
                    if (it.hasNext()) {
                        ChargersPassDto chargersPassDto = (ChargersPassDto) it.next();
                        chargersPassesUiStateMapper$mapPurchasedPasses$1.L$0 = ekaVar2;
                        chargersPassesUiStateMapper$mapPurchasedPasses$1.L$1 = null;
                        chargersPassesUiStateMapper$mapPurchasedPasses$1.L$2 = null;
                        chargersPassesUiStateMapper$mapPurchasedPasses$1.L$3 = arrayList;
                        chargersPassesUiStateMapper$mapPurchasedPasses$1.L$4 = null;
                        chargersPassesUiStateMapper$mapPurchasedPasses$1.L$5 = it;
                        chargersPassesUiStateMapper$mapPurchasedPasses$1.L$6 = null;
                        chargersPassesUiStateMapper$mapPurchasedPasses$1.L$7 = null;
                        chargersPassesUiStateMapper$mapPurchasedPasses$1.L$8 = null;
                        chargersPassesUiStateMapper$mapPurchasedPasses$1.L$9 = charSequence;
                        chargersPassesUiStateMapper$mapPurchasedPasses$1.Z$0 = z2;
                        chargersPassesUiStateMapper$mapPurchasedPasses$1.label = 2;
                        obj = c(chargersPassDto, chargersPassesUiStateMapper$mapPurchasedPasses$1);
                    } else {
                        List list2 = ekaVar2.c;
                        charSequence2 = charSequence;
                        arrayList2 = new ArrayList(tcc.n(list2, 10));
                        list = (List) arrayList;
                        it2 = list2.iterator();
                        if (it2.hasNext()) {
                        }
                    }
                } else {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z2 = chargersPassesUiStateMapper$mapPurchasedPasses$1.Z$0;
                    arrayList2 = (Collection) chargersPassesUiStateMapper$mapPurchasedPasses$1.L$9;
                    list = (List) chargersPassesUiStateMapper$mapPurchasedPasses$1.L$8;
                    charSequence2 = (CharSequence) chargersPassesUiStateMapper$mapPurchasedPasses$1.L$7;
                    it2 = (Iterator) chargersPassesUiStateMapper$mapPurchasedPasses$1.L$4;
                    Collection collection = (Collection) chargersPassesUiStateMapper$mapPurchasedPasses$1.L$3;
                    kotlin.b.b(obj);
                    arrayList2.add((wj90) obj);
                    arrayList2 = collection;
                    if (it2.hasNext()) {
                        ChargersPassButtonDto chargersPassButtonDto = (ChargersPassButtonDto) it2.next();
                        chargersPassesUiStateMapper$mapPurchasedPasses$1.L$0 = null;
                        chargersPassesUiStateMapper$mapPurchasedPasses$1.L$1 = null;
                        chargersPassesUiStateMapper$mapPurchasedPasses$1.L$2 = null;
                        chargersPassesUiStateMapper$mapPurchasedPasses$1.L$3 = arrayList2;
                        chargersPassesUiStateMapper$mapPurchasedPasses$1.L$4 = it2;
                        chargersPassesUiStateMapper$mapPurchasedPasses$1.L$5 = null;
                        chargersPassesUiStateMapper$mapPurchasedPasses$1.L$6 = null;
                        chargersPassesUiStateMapper$mapPurchasedPasses$1.L$7 = charSequence2;
                        chargersPassesUiStateMapper$mapPurchasedPasses$1.L$8 = list;
                        chargersPassesUiStateMapper$mapPurchasedPasses$1.L$9 = arrayList2;
                        chargersPassesUiStateMapper$mapPurchasedPasses$1.Z$0 = z2;
                        chargersPassesUiStateMapper$mapPurchasedPasses$1.label = 3;
                        obj = this.d.b(chargersPassButtonDto, chargersPassesUiStateMapper$mapPurchasedPasses$1);
                        if (obj != obj2) {
                            collection = arrayList2;
                            arrayList2.add((wj90) obj);
                            arrayList2 = collection;
                            if (it2.hasNext()) {
                                return new pla(charSequence2, list, (List) arrayList2, z2);
                            }
                        }
                        return obj2;
                    }
                }
                List list3 = ekaVar.b;
                arrayList = new ArrayList();
                it = list3.iterator();
                ekaVar2 = ekaVar;
                z2 = z;
                charSequence = (CharSequence) obj;
                if (it.hasNext()) {
                }
            }
        }
        chargersPassesUiStateMapper$mapPurchasedPasses$1 = new ChargersPassesUiStateMapper$mapPurchasedPasses$1(this, continuationImpl);
        Object obj3 = chargersPassesUiStateMapper$mapPurchasedPasses$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersPassesUiStateMapper$mapPurchasedPasses$1.label;
        if (i != 0) {
        }
        List list32 = ekaVar.b;
        arrayList = new ArrayList();
        it = list32.iterator();
        ekaVar2 = ekaVar;
        z2 = z;
        charSequence = (CharSequence) obj3;
        if (it.hasNext()) {
        }
    }
}
