package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.model.PlusPayCounterOffers;
import com.yandex.plus.pay.internal.model.PlusPayCounterOffersReason;
import com.yandex.plus.pay.internal.model.PlusPayRichText;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.PlusTarifficatorPurchase;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.c;
import defpackage.bvf0;
import defpackage.cpd0;
import defpackage.d6w;
import defpackage.dio;
import defpackage.ds31;
import defpackage.eu90;
import defpackage.ftb;
import defpackage.g7t;
import defpackage.h7t;
import defpackage.i0f;
import defpackage.ind0;
import defpackage.j0f;
import defpackage.j5t;
import defpackage.jnd0;
import defpackage.k0f;
import defpackage.l5t;
import defpackage.ny61;
import defpackage.nze;
import defpackage.oz90;
import defpackage.rze;
import defpackage.scc;
import defpackage.tbb;
import defpackage.tcc;
import defpackage.tje;
import defpackage.w511;
import defpackage.xvz;
import defpackage.yr31;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

/* loaded from: classes2.dex */
public final class a extends yr31 {
    public final c A;
    public final c B;
    public final i0f C;
    public final LinkedHashSet D = new LinkedHashSet();
    public PlusPayCounterOffersReason E = PlusPayCounterOffersReason.UNEXPECTED;
    public PlusPayCounterOffers F;
    public final r0 G;
    public final r0 H;
    public final ftb b;
    public final jnd0 c;
    public final l5t w;
    public final j5t x;
    public final g7t y;
    public final cpd0 z;

    public a(ftb ftbVar, jnd0 jnd0Var, l5t l5tVar, j5t j5tVar, g7t g7tVar, cpd0 cpd0Var, c cVar, c cVar2, i0f i0fVar) {
        this.b = ftbVar;
        this.c = jnd0Var;
        this.w = l5tVar;
        this.x = j5tVar;
        this.y = g7tVar;
        this.z = cpd0Var;
        this.A = cVar;
        this.B = cVar2;
        this.C = i0fVar;
        r0 c = bvf0.c(k0f.a);
        this.G = c;
        this.H = c;
        tje.N(ds31.a(this), null, null, new CounterOffersViewModel$fetchAndShowCounterOffers$1(this, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r15v16, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v53, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v67, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r32v0, types: [com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0303 -> B:26:0x0319). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object W(a aVar, PlusPayCounterOffers plusPayCounterOffers, ContinuationImpl continuationImpl) {
        CounterOffersViewModel$createContent$1 counterOffersViewModel$createContent$1;
        oz90 a;
        PlusPayCounterOffers plusPayCounterOffers2;
        CharSequence charSequence;
        oz90 oz90Var;
        Object obj;
        PlusPayRichText subtitle;
        CharSequence charSequence2;
        oz90 oz90Var2;
        CharSequence charSequence3;
        PlusPayCounterOffers plusPayCounterOffers3;
        Object obj2;
        PlusPayCounterOffers plusPayCounterOffers4;
        Iterator it;
        CharSequence charSequence4;
        CharSequence charSequence5;
        CharSequence charSequence6;
        PlusPayCounterOffers.CounterOffer counterOffer;
        Iterator it2;
        List list;
        int i;
        PlusPayCounterOffers plusPayCounterOffers5;
        Iterator it3;
        CounterOffersViewModel$createContent$1 counterOffersViewModel$createContent$12;
        int i2;
        int i3;
        int i4;
        ArrayList arrayList;
        int i5;
        ArrayList arrayList2;
        CoroutineSingletons coroutineSingletons;
        ArrayList arrayList3;
        oz90 oz90Var3;
        int i6;
        CharSequence charSequence7;
        int i7;
        CoroutineSingletons coroutineSingletons2;
        ArrayList arrayList4;
        List list2;
        CharSequence charSequence8;
        oz90 oz90Var4;
        CharSequence charSequence9;
        CharSequence charSequence10;
        CharSequence charSequence11;
        PlusPayCounterOffers plusPayCounterOffers6;
        oz90 oz90Var5;
        int i8;
        Object Y;
        CoroutineSingletons coroutineSingletons3;
        int i9;
        List list3;
        int i10;
        int i11;
        oz90 oz90Var6;
        int i12;
        int i13;
        int i14;
        ArrayList arrayList5;
        CounterOffersViewModel$createContent$1 counterOffersViewModel$createContent$13;
        Collection collection;
        PlusPayRichText supportText;
        CharSequence charSequence12;
        CharSequence charSequence13;
        CharSequence charSequence14;
        aVar.getClass();
        if (continuationImpl instanceof CounterOffersViewModel$createContent$1) {
            counterOffersViewModel$createContent$1 = (CounterOffersViewModel$createContent$1) continuationImpl;
            int i15 = counterOffersViewModel$createContent$1.label;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                counterOffersViewModel$createContent$1.label = i15 - Integer.MIN_VALUE;
                Object obj3 = counterOffersViewModel$createContent$1.result;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (counterOffersViewModel$createContent$1.label) {
                    case 0:
                        b.b(obj3);
                        a = ((h7t) aVar.y).a(aVar.c.a.a());
                        PlusPayRichText title = plusPayCounterOffers.getTitle();
                        if (title != null) {
                            PlusPayRichText X = aVar.X(title);
                            counterOffersViewModel$createContent$1.L$0 = plusPayCounterOffers;
                            counterOffersViewModel$createContent$1.L$1 = a;
                            counterOffersViewModel$createContent$1.label = 1;
                            Object Y2 = aVar.Y(X, counterOffersViewModel$createContent$1);
                            if (Y2 != coroutineSingletons4) {
                                oz90Var = a;
                                obj = Y2;
                                plusPayCounterOffers2 = plusPayCounterOffers;
                                oz90 oz90Var7 = oz90Var;
                                charSequence = (CharSequence) obj;
                                a = oz90Var7;
                                subtitle = plusPayCounterOffers2.getSubtitle();
                                if (subtitle != null) {
                                    PlusPayRichText X2 = aVar.X(subtitle);
                                    counterOffersViewModel$createContent$1.L$0 = plusPayCounterOffers2;
                                    counterOffersViewModel$createContent$1.L$1 = a;
                                    counterOffersViewModel$createContent$1.L$2 = charSequence;
                                    counterOffersViewModel$createContent$1.label = 2;
                                    Object Y3 = aVar.Y(X2, counterOffersViewModel$createContent$1);
                                    if (Y3 != coroutineSingletons4) {
                                        PlusPayCounterOffers plusPayCounterOffers7 = plusPayCounterOffers2;
                                        oz90Var2 = a;
                                        charSequence3 = charSequence;
                                        plusPayCounterOffers3 = plusPayCounterOffers7;
                                        obj2 = Y3;
                                        charSequence2 = (CharSequence) obj2;
                                        PlusPayCounterOffers plusPayCounterOffers8 = plusPayCounterOffers3;
                                        charSequence = charSequence3;
                                        a = oz90Var2;
                                        plusPayCounterOffers2 = plusPayCounterOffers8;
                                        List<PlusPayCounterOffers.CounterOffer> offers = plusPayCounterOffers2.getOffers();
                                        ArrayList arrayList6 = new ArrayList(tcc.n(offers, 10));
                                        plusPayCounterOffers4 = plusPayCounterOffers2;
                                        it = offers.iterator();
                                        ArrayList arrayList7 = arrayList6;
                                        int i16 = 0;
                                        int i17 = 0;
                                        oz90 oz90Var8 = a;
                                        CharSequence charSequence15 = charSequence;
                                        charSequence4 = charSequence2;
                                        int i18 = 0;
                                        if (!it.hasNext()) {
                                            Object next = it.next();
                                            int i19 = i16 + 1;
                                            if (i16 < 0) {
                                                scc.m();
                                                throw null;
                                            }
                                            counterOffer = (PlusPayCounterOffers.CounterOffer) next;
                                            List singletonList = Collections.singletonList(counterOffer.getIcon());
                                            PlusPayRichText X3 = aVar.X(counterOffer.getTitle());
                                            counterOffersViewModel$createContent$1.L$0 = plusPayCounterOffers4;
                                            counterOffersViewModel$createContent$1.L$1 = oz90Var8;
                                            oz90 oz90Var9 = oz90Var8;
                                            counterOffersViewModel$createContent$1.L$2 = null;
                                            counterOffersViewModel$createContent$1.L$3 = null;
                                            counterOffersViewModel$createContent$1.L$4 = arrayList7;
                                            counterOffersViewModel$createContent$1.L$5 = it;
                                            counterOffersViewModel$createContent$1.L$6 = null;
                                            counterOffersViewModel$createContent$1.L$7 = counterOffer;
                                            counterOffersViewModel$createContent$1.L$8 = singletonList;
                                            counterOffersViewModel$createContent$1.L$9 = charSequence15;
                                            counterOffersViewModel$createContent$1.L$10 = charSequence4;
                                            counterOffersViewModel$createContent$1.L$11 = arrayList7;
                                            counterOffersViewModel$createContent$1.L$12 = null;
                                            counterOffersViewModel$createContent$1.L$13 = null;
                                            counterOffersViewModel$createContent$1.L$14 = null;
                                            counterOffersViewModel$createContent$1.L$15 = null;
                                            counterOffersViewModel$createContent$1.L$16 = null;
                                            counterOffersViewModel$createContent$1.L$17 = null;
                                            counterOffersViewModel$createContent$1.L$18 = null;
                                            counterOffersViewModel$createContent$1.L$19 = null;
                                            counterOffersViewModel$createContent$1.I$0 = i17;
                                            counterOffersViewModel$createContent$1.I$1 = i18;
                                            counterOffersViewModel$createContent$1.I$2 = i19;
                                            counterOffersViewModel$createContent$1.I$3 = i16;
                                            counterOffersViewModel$createContent$1.I$4 = 0;
                                            counterOffersViewModel$createContent$1.label = 3;
                                            Object Y4 = aVar.Y(X3, counterOffersViewModel$createContent$1);
                                            if (Y4 != coroutineSingletons4) {
                                                ArrayList arrayList8 = arrayList7;
                                                charSequence6 = charSequence15;
                                                int i20 = i18;
                                                int i21 = i17;
                                                charSequence5 = charSequence4;
                                                CharSequence charSequence16 = (CharSequence) Y4;
                                                List<PlusPayRichText> benefits = counterOffer.getBenefits();
                                                CounterOffersViewModel$createContent$1 counterOffersViewModel$createContent$14 = counterOffersViewModel$createContent$1;
                                                int i22 = i16;
                                                ArrayList arrayList9 = new ArrayList(tcc.n(benefits, 10));
                                                PlusPayCounterOffers plusPayCounterOffers9 = plusPayCounterOffers4;
                                                it2 = benefits.iterator();
                                                list = singletonList;
                                                i = i21;
                                                plusPayCounterOffers5 = plusPayCounterOffers9;
                                                it3 = it;
                                                counterOffersViewModel$createContent$12 = counterOffersViewModel$createContent$14;
                                                i2 = i22;
                                                i3 = 0;
                                                i4 = i20;
                                                arrayList = arrayList8;
                                                i5 = 0;
                                                arrayList2 = arrayList9;
                                                coroutineSingletons = coroutineSingletons4;
                                                arrayList3 = arrayList8;
                                                oz90Var3 = oz90Var9;
                                                i6 = 0;
                                                charSequence7 = charSequence16;
                                                i7 = i19;
                                                if (!it2.hasNext()) {
                                                    int i23 = i4;
                                                    PlusPayRichText X4 = aVar.X((PlusPayRichText) it2.next());
                                                    counterOffersViewModel$createContent$12.L$0 = plusPayCounterOffers5;
                                                    counterOffersViewModel$createContent$12.L$1 = oz90Var3;
                                                    PlusPayCounterOffers plusPayCounterOffers10 = plusPayCounterOffers5;
                                                    counterOffersViewModel$createContent$12.L$2 = null;
                                                    counterOffersViewModel$createContent$12.L$3 = null;
                                                    counterOffersViewModel$createContent$12.L$4 = arrayList3;
                                                    counterOffersViewModel$createContent$12.L$5 = it3;
                                                    counterOffersViewModel$createContent$12.L$6 = null;
                                                    counterOffersViewModel$createContent$12.L$7 = counterOffer;
                                                    counterOffersViewModel$createContent$12.L$8 = list;
                                                    counterOffersViewModel$createContent$12.L$9 = charSequence7;
                                                    counterOffersViewModel$createContent$12.L$10 = null;
                                                    counterOffersViewModel$createContent$12.L$11 = null;
                                                    counterOffersViewModel$createContent$12.L$12 = arrayList2;
                                                    counterOffersViewModel$createContent$12.L$13 = it2;
                                                    counterOffersViewModel$createContent$12.L$14 = null;
                                                    counterOffersViewModel$createContent$12.L$15 = null;
                                                    counterOffersViewModel$createContent$12.L$16 = arrayList2;
                                                    counterOffersViewModel$createContent$12.L$17 = charSequence6;
                                                    counterOffersViewModel$createContent$12.L$18 = charSequence5;
                                                    counterOffersViewModel$createContent$12.L$19 = arrayList;
                                                    counterOffersViewModel$createContent$12.I$0 = i;
                                                    counterOffersViewModel$createContent$12.I$1 = i23;
                                                    List list4 = list;
                                                    int i24 = i7;
                                                    counterOffersViewModel$createContent$12.I$2 = i24;
                                                    i8 = i24;
                                                    counterOffersViewModel$createContent$12.I$3 = i2;
                                                    counterOffersViewModel$createContent$12.I$4 = i5;
                                                    counterOffersViewModel$createContent$12.I$5 = i3;
                                                    counterOffersViewModel$createContent$12.I$6 = i6;
                                                    counterOffersViewModel$createContent$12.I$7 = 0;
                                                    counterOffersViewModel$createContent$12.label = 4;
                                                    Y = aVar.Y(X4, counterOffersViewModel$createContent$12);
                                                    coroutineSingletons3 = coroutineSingletons;
                                                    if (Y == coroutineSingletons3) {
                                                        return coroutineSingletons3;
                                                    }
                                                    int i25 = i5;
                                                    i9 = i3;
                                                    list3 = list4;
                                                    i10 = i2;
                                                    i11 = i25;
                                                    oz90Var6 = oz90Var3;
                                                    i12 = i6;
                                                    i13 = i23;
                                                    i14 = i;
                                                    plusPayCounterOffers5 = plusPayCounterOffers10;
                                                    arrayList5 = arrayList;
                                                    counterOffersViewModel$createContent$13 = counterOffersViewModel$createContent$12;
                                                    collection = arrayList2;
                                                    collection.add((CharSequence) Y);
                                                    counterOffersViewModel$createContent$12 = counterOffersViewModel$createContent$13;
                                                    arrayList = arrayList5;
                                                    i = i14;
                                                    i6 = i12;
                                                    list = list3;
                                                    i3 = i9;
                                                    i5 = i11;
                                                    i2 = i10;
                                                    i7 = i8;
                                                    coroutineSingletons = coroutineSingletons3;
                                                    i4 = i13;
                                                    oz90Var3 = oz90Var6;
                                                    if (!it2.hasNext()) {
                                                        int i26 = i7;
                                                        PlusPayCounterOffers plusPayCounterOffers11 = plusPayCounterOffers5;
                                                        i18 = i4;
                                                        CoroutineSingletons coroutineSingletons5 = coroutineSingletons;
                                                        arrayList.add(new nze(list, charSequence7, arrayList2, counterOffer.getButtonText(), counterOffer.getAdditionalButtonText(), i2 == 0));
                                                        counterOffersViewModel$createContent$1 = counterOffersViewModel$createContent$12;
                                                        charSequence4 = charSequence5;
                                                        charSequence15 = charSequence6;
                                                        oz90Var8 = oz90Var3;
                                                        i17 = i;
                                                        plusPayCounterOffers4 = plusPayCounterOffers11;
                                                        arrayList7 = arrayList3;
                                                        coroutineSingletons4 = coroutineSingletons5;
                                                        it = it3;
                                                        i16 = i26;
                                                        if (!it.hasNext()) {
                                                            coroutineSingletons2 = coroutineSingletons4;
                                                            oz90 oz90Var10 = oz90Var8;
                                                            arrayList4 = arrayList7;
                                                            PlusPayRichText alternativeActionText = plusPayCounterOffers4.getAlternativeActionText();
                                                            if (alternativeActionText != null) {
                                                                PlusPayRichText X5 = aVar.X(alternativeActionText);
                                                                counterOffersViewModel$createContent$1.L$0 = plusPayCounterOffers4;
                                                                counterOffersViewModel$createContent$1.L$1 = oz90Var10;
                                                                counterOffersViewModel$createContent$1.L$2 = charSequence15;
                                                                counterOffersViewModel$createContent$1.L$3 = charSequence4;
                                                                counterOffersViewModel$createContent$1.L$4 = arrayList4;
                                                                counterOffersViewModel$createContent$1.L$5 = null;
                                                                counterOffersViewModel$createContent$1.L$6 = null;
                                                                counterOffersViewModel$createContent$1.L$7 = null;
                                                                counterOffersViewModel$createContent$1.L$8 = null;
                                                                counterOffersViewModel$createContent$1.L$9 = null;
                                                                counterOffersViewModel$createContent$1.L$10 = null;
                                                                counterOffersViewModel$createContent$1.L$11 = null;
                                                                counterOffersViewModel$createContent$1.L$12 = null;
                                                                counterOffersViewModel$createContent$1.L$13 = null;
                                                                counterOffersViewModel$createContent$1.L$14 = null;
                                                                counterOffersViewModel$createContent$1.L$15 = null;
                                                                counterOffersViewModel$createContent$1.L$16 = null;
                                                                counterOffersViewModel$createContent$1.L$17 = null;
                                                                counterOffersViewModel$createContent$1.L$18 = null;
                                                                counterOffersViewModel$createContent$1.L$19 = null;
                                                                counterOffersViewModel$createContent$1.label = 5;
                                                                Object Y5 = aVar.Y(X5, counterOffersViewModel$createContent$1);
                                                                if (Y5 == coroutineSingletons2) {
                                                                    return coroutineSingletons2;
                                                                }
                                                                charSequence11 = charSequence15;
                                                                obj3 = Y5;
                                                                plusPayCounterOffers6 = plusPayCounterOffers4;
                                                                oz90Var5 = oz90Var10;
                                                                charSequence10 = (CharSequence) obj3;
                                                                list2 = arrayList4;
                                                                charSequence8 = charSequence4;
                                                                charSequence9 = charSequence11;
                                                                oz90Var4 = oz90Var5;
                                                                plusPayCounterOffers4 = plusPayCounterOffers6;
                                                                supportText = plusPayCounterOffers4.getSupportText();
                                                                if (supportText == null) {
                                                                    charSequence12 = null;
                                                                    charSequence13 = charSequence10;
                                                                    return new rze(charSequence9, charSequence8, list2, charSequence13, charSequence12, oz90Var4.c, oz90Var4.d);
                                                                }
                                                                PlusPayRichText X6 = aVar.X(supportText);
                                                                counterOffersViewModel$createContent$1.L$0 = null;
                                                                counterOffersViewModel$createContent$1.L$1 = oz90Var4;
                                                                counterOffersViewModel$createContent$1.L$2 = charSequence9;
                                                                counterOffersViewModel$createContent$1.L$3 = charSequence8;
                                                                counterOffersViewModel$createContent$1.L$4 = list2;
                                                                counterOffersViewModel$createContent$1.L$5 = charSequence10;
                                                                counterOffersViewModel$createContent$1.L$6 = null;
                                                                counterOffersViewModel$createContent$1.L$7 = null;
                                                                counterOffersViewModel$createContent$1.L$8 = null;
                                                                counterOffersViewModel$createContent$1.L$9 = null;
                                                                counterOffersViewModel$createContent$1.L$10 = null;
                                                                counterOffersViewModel$createContent$1.L$11 = null;
                                                                counterOffersViewModel$createContent$1.L$12 = null;
                                                                counterOffersViewModel$createContent$1.L$13 = null;
                                                                counterOffersViewModel$createContent$1.L$14 = null;
                                                                counterOffersViewModel$createContent$1.L$15 = null;
                                                                counterOffersViewModel$createContent$1.L$16 = null;
                                                                counterOffersViewModel$createContent$1.L$17 = null;
                                                                counterOffersViewModel$createContent$1.L$18 = null;
                                                                counterOffersViewModel$createContent$1.L$19 = null;
                                                                counterOffersViewModel$createContent$1.label = 6;
                                                                Object Y6 = aVar.Y(X6, counterOffersViewModel$createContent$1);
                                                                if (Y6 == coroutineSingletons2) {
                                                                    return coroutineSingletons2;
                                                                }
                                                                CharSequence charSequence17 = charSequence10;
                                                                obj3 = Y6;
                                                                charSequence14 = charSequence17;
                                                                charSequence12 = (CharSequence) obj3;
                                                                charSequence13 = charSequence14;
                                                                return new rze(charSequence9, charSequence8, list2, charSequence13, charSequence12, oz90Var4.c, oz90Var4.d);
                                                            }
                                                            list2 = arrayList4;
                                                            charSequence8 = charSequence4;
                                                            oz90Var4 = oz90Var10;
                                                            charSequence9 = charSequence15;
                                                            charSequence10 = null;
                                                            supportText = plusPayCounterOffers4.getSupportText();
                                                            if (supportText == null) {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    charSequence2 = null;
                                    List<PlusPayCounterOffers.CounterOffer> offers2 = plusPayCounterOffers2.getOffers();
                                    ArrayList arrayList62 = new ArrayList(tcc.n(offers2, 10));
                                    plusPayCounterOffers4 = plusPayCounterOffers2;
                                    it = offers2.iterator();
                                    ArrayList arrayList72 = arrayList62;
                                    int i162 = 0;
                                    int i172 = 0;
                                    oz90 oz90Var82 = a;
                                    CharSequence charSequence152 = charSequence;
                                    charSequence4 = charSequence2;
                                    int i182 = 0;
                                    if (!it.hasNext()) {
                                    }
                                }
                            }
                            return coroutineSingletons4;
                        }
                        plusPayCounterOffers2 = plusPayCounterOffers;
                        charSequence = null;
                        subtitle = plusPayCounterOffers2.getSubtitle();
                        if (subtitle != null) {
                        }
                    case 1:
                        oz90 oz90Var11 = (oz90) counterOffersViewModel$createContent$1.L$1;
                        plusPayCounterOffers2 = (PlusPayCounterOffers) counterOffersViewModel$createContent$1.L$0;
                        b.b(obj3);
                        oz90Var = oz90Var11;
                        obj = obj3;
                        oz90 oz90Var72 = oz90Var;
                        charSequence = (CharSequence) obj;
                        a = oz90Var72;
                        subtitle = plusPayCounterOffers2.getSubtitle();
                        if (subtitle != null) {
                        }
                        break;
                    case 2:
                        obj2 = obj3;
                        charSequence3 = (CharSequence) counterOffersViewModel$createContent$1.L$2;
                        oz90Var2 = (oz90) counterOffersViewModel$createContent$1.L$1;
                        plusPayCounterOffers3 = (PlusPayCounterOffers) counterOffersViewModel$createContent$1.L$0;
                        b.b(obj2);
                        charSequence2 = (CharSequence) obj2;
                        PlusPayCounterOffers plusPayCounterOffers82 = plusPayCounterOffers3;
                        charSequence = charSequence3;
                        a = oz90Var2;
                        plusPayCounterOffers2 = plusPayCounterOffers82;
                        List<PlusPayCounterOffers.CounterOffer> offers22 = plusPayCounterOffers2.getOffers();
                        ArrayList arrayList622 = new ArrayList(tcc.n(offers22, 10));
                        plusPayCounterOffers4 = plusPayCounterOffers2;
                        it = offers22.iterator();
                        ArrayList arrayList722 = arrayList622;
                        int i1622 = 0;
                        int i1722 = 0;
                        oz90 oz90Var822 = a;
                        CharSequence charSequence1522 = charSequence;
                        charSequence4 = charSequence2;
                        int i1822 = 0;
                        if (!it.hasNext()) {
                        }
                        break;
                    case 3:
                        int i27 = counterOffersViewModel$createContent$1.I$4;
                        int i28 = counterOffersViewModel$createContent$1.I$3;
                        int i29 = counterOffersViewModel$createContent$1.I$2;
                        int i30 = counterOffersViewModel$createContent$1.I$1;
                        int i31 = counterOffersViewModel$createContent$1.I$0;
                        ?? r8 = (Collection) counterOffersViewModel$createContent$1.L$11;
                        charSequence5 = (CharSequence) counterOffersViewModel$createContent$1.L$10;
                        charSequence6 = (CharSequence) counterOffersViewModel$createContent$1.L$9;
                        List list5 = (List) counterOffersViewModel$createContent$1.L$8;
                        counterOffer = (PlusPayCounterOffers.CounterOffer) counterOffersViewModel$createContent$1.L$7;
                        Iterator it4 = (Iterator) counterOffersViewModel$createContent$1.L$5;
                        ?? r14 = (Collection) counterOffersViewModel$createContent$1.L$4;
                        oz90 oz90Var12 = (oz90) counterOffersViewModel$createContent$1.L$1;
                        PlusPayCounterOffers plusPayCounterOffers12 = (PlusPayCounterOffers) counterOffersViewModel$createContent$1.L$0;
                        b.b(obj3);
                        CharSequence charSequence18 = (CharSequence) obj3;
                        List<PlusPayRichText> benefits2 = counterOffer.getBenefits();
                        CounterOffersViewModel$createContent$1 counterOffersViewModel$createContent$15 = counterOffersViewModel$createContent$1;
                        ArrayList arrayList10 = new ArrayList(tcc.n(benefits2, 10));
                        it2 = benefits2.iterator();
                        list = list5;
                        i = i31;
                        plusPayCounterOffers5 = plusPayCounterOffers12;
                        it3 = it4;
                        counterOffersViewModel$createContent$12 = counterOffersViewModel$createContent$15;
                        i2 = i28;
                        i3 = 0;
                        i4 = i30;
                        arrayList = r8;
                        i5 = i27;
                        arrayList2 = arrayList10;
                        coroutineSingletons = coroutineSingletons4;
                        arrayList3 = r14;
                        oz90Var3 = oz90Var12;
                        i6 = 0;
                        charSequence7 = charSequence18;
                        i7 = i29;
                        if (!it2.hasNext()) {
                        }
                        break;
                    case 4:
                        int i32 = counterOffersViewModel$createContent$1.I$6;
                        int i33 = counterOffersViewModel$createContent$1.I$5;
                        int i34 = counterOffersViewModel$createContent$1.I$4;
                        int i35 = counterOffersViewModel$createContent$1.I$3;
                        int i36 = counterOffersViewModel$createContent$1.I$2;
                        int i37 = counterOffersViewModel$createContent$1.I$1;
                        int i38 = counterOffersViewModel$createContent$1.I$0;
                        ?? r15 = (Collection) counterOffersViewModel$createContent$1.L$19;
                        CharSequence charSequence19 = (CharSequence) counterOffersViewModel$createContent$1.L$18;
                        CharSequence charSequence20 = (CharSequence) counterOffersViewModel$createContent$1.L$17;
                        collection = (Collection) counterOffersViewModel$createContent$1.L$16;
                        Iterator it5 = (Iterator) counterOffersViewModel$createContent$1.L$13;
                        ?? r1 = (Collection) counterOffersViewModel$createContent$1.L$12;
                        CharSequence charSequence21 = (CharSequence) counterOffersViewModel$createContent$1.L$9;
                        list3 = (List) counterOffersViewModel$createContent$1.L$8;
                        PlusPayCounterOffers.CounterOffer counterOffer2 = (PlusPayCounterOffers.CounterOffer) counterOffersViewModel$createContent$1.L$7;
                        Iterator it6 = (Iterator) counterOffersViewModel$createContent$1.L$5;
                        ?? r12 = (Collection) counterOffersViewModel$createContent$1.L$4;
                        oz90Var6 = (oz90) counterOffersViewModel$createContent$1.L$1;
                        PlusPayCounterOffers plusPayCounterOffers13 = (PlusPayCounterOffers) counterOffersViewModel$createContent$1.L$0;
                        b.b(obj3);
                        i8 = i36;
                        counterOffer = counterOffer2;
                        i9 = i33;
                        charSequence5 = charSequence19;
                        plusPayCounterOffers5 = plusPayCounterOffers13;
                        Y = obj3;
                        i14 = i38;
                        i13 = i37;
                        coroutineSingletons3 = coroutineSingletons4;
                        arrayList3 = r12;
                        i10 = i35;
                        it2 = it5;
                        counterOffersViewModel$createContent$13 = counterOffersViewModel$createContent$1;
                        charSequence7 = charSequence21;
                        i12 = i32;
                        it3 = it6;
                        i11 = i34;
                        charSequence6 = charSequence20;
                        arrayList2 = r1;
                        arrayList5 = r15;
                        collection.add((CharSequence) Y);
                        counterOffersViewModel$createContent$12 = counterOffersViewModel$createContent$13;
                        arrayList = arrayList5;
                        i = i14;
                        i6 = i12;
                        list = list3;
                        i3 = i9;
                        i5 = i11;
                        i2 = i10;
                        i7 = i8;
                        coroutineSingletons = coroutineSingletons3;
                        i4 = i13;
                        oz90Var3 = oz90Var6;
                        if (!it2.hasNext()) {
                        }
                        break;
                    case 5:
                        arrayList4 = (List) counterOffersViewModel$createContent$1.L$4;
                        charSequence4 = (CharSequence) counterOffersViewModel$createContent$1.L$3;
                        charSequence11 = (CharSequence) counterOffersViewModel$createContent$1.L$2;
                        oz90Var5 = (oz90) counterOffersViewModel$createContent$1.L$1;
                        plusPayCounterOffers6 = (PlusPayCounterOffers) counterOffersViewModel$createContent$1.L$0;
                        b.b(obj3);
                        coroutineSingletons2 = coroutineSingletons4;
                        charSequence10 = (CharSequence) obj3;
                        list2 = arrayList4;
                        charSequence8 = charSequence4;
                        charSequence9 = charSequence11;
                        oz90Var4 = oz90Var5;
                        plusPayCounterOffers4 = plusPayCounterOffers6;
                        supportText = plusPayCounterOffers4.getSupportText();
                        if (supportText == null) {
                        }
                        break;
                    case 6:
                        charSequence14 = (CharSequence) counterOffersViewModel$createContent$1.L$5;
                        list2 = (List) counterOffersViewModel$createContent$1.L$4;
                        charSequence8 = (CharSequence) counterOffersViewModel$createContent$1.L$3;
                        charSequence9 = (CharSequence) counterOffersViewModel$createContent$1.L$2;
                        oz90Var4 = (oz90) counterOffersViewModel$createContent$1.L$1;
                        b.b(obj3);
                        charSequence12 = (CharSequence) obj3;
                        charSequence13 = charSequence14;
                        return new rze(charSequence9, charSequence8, list2, charSequence13, charSequence12, oz90Var4.c, oz90Var4.d);
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        counterOffersViewModel$createContent$1 = new CounterOffersViewModel$createContent$1(aVar, continuationImpl);
        Object obj32 = counterOffersViewModel$createContent$1.result;
        CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (counterOffersViewModel$createContent$1.label) {
        }
    }

    @Override // defpackage.yr31
    public final void V() {
        PlusPayCounterOffers plusPayCounterOffers = this.F;
        if (plusPayCounterOffers != null) {
            ind0 a = this.c.a.a();
            PlusPayCounterOffersReason plusPayCounterOffersReason = this.E;
            eu90 eu90Var = ((j0f) this.C).a;
            String d = dio.d(a.a);
            PlusTarifficatorPurchase plusTarifficatorPurchase = a.b;
            PlusPayCompositeOffers.Offer.Tariff tariffOffer = plusTarifficatorPurchase.getOffer().getTariffOffer();
            String id = tariffOffer != null ? tariffOffer.getId() : null;
            if (id == null) {
                id = "no_value";
            }
            List<PlusPayCompositeOffers.Offer.Option> optionOffers = plusTarifficatorPurchase.getOffer().getOptionOffers();
            ArrayList arrayList = new ArrayList(tcc.n(optionOffers, 10));
            Iterator<T> it = optionOffers.iterator();
            while (it.hasNext()) {
                arrayList.add(((PlusPayCompositeOffers.Offer.Option) it.next()).getId());
            }
            String a2 = j0f.a(plusPayCounterOffers);
            String code = plusPayCounterOffersReason.getCode();
            LinkedHashMap t = xvz.t(eu90Var, "purchase_session_id", d, "product_id", id);
            t.put("options_id", arrayList);
            t.put("target", a2);
            t.put(CRLReasonCodeExtension.REASON, code);
            t.put("_meta", eu90.c(new HashMap()));
            eu90Var.f("CounterOffers.Screen.Closed", t);
        }
    }

    public final PlusPayRichText X(PlusPayRichText plusPayRichText) {
        CounterOffersViewModel$filterUnsupportedLinks$1 counterOffersViewModel$filterUnsupportedLinks$1 = new CounterOffersViewModel$filterUnsupportedLinks$1(1, this.A, c.class, "isLinkSupported", "isLinkSupported(Ljava/lang/String;)Z", 0);
        StringBuilder sb = new StringBuilder(plusPayRichText.getText());
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : com.yandex.plus.pay.ui.common.api.utils.a.b(plusPayRichText).entrySet()) {
            String str = (String) entry.getKey();
            PlusPayRichText.Item item = (PlusPayRichText.Item) entry.getValue();
            if (item instanceof PlusPayRichText.Item.Link) {
                PlusPayRichText.Item.Link link = (PlusPayRichText.Item.Link) item;
                if (((Boolean) counterOffersViewModel$filterUnsupportedLinks$1.invoke(link.getLink())).booleanValue()) {
                    arrayList.add(item);
                } else {
                    List<d6w> a = com.yandex.plus.pay.ui.common.api.utils.a.a(sb, str);
                    String data = link.getData();
                    for (d6w d6wVar : a) {
                        sb.replace(d6wVar.a, d6wVar.b + 1, data);
                    }
                }
            } else {
                if (!(item instanceof PlusPayRichText.Item.Icon) && !(item instanceof PlusPayRichText.Item.TextColor) && !(item instanceof PlusPayRichText.Item.Highlight) && !(item instanceof PlusPayRichText.Item.Strikethrough) && !(item instanceof PlusPayRichText.Item.Text)) {
                    w511.b();
                    return null;
                }
                arrayList.add(item);
            }
        }
        return new PlusPayRichText(sb.toString(), arrayList);
    }

    public final Object Y(PlusPayRichText plusPayRichText, Continuation continuation) {
        return ((com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.a) this.z).a(plusPayRichText, new tbb(11, this), (ContinuationImpl) continuation);
    }
}
