package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.presale;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPayLegalInfo;
import com.yandex.plus.pay.internal.model.PlusPayPresale;
import com.yandex.plus.pay.internal.model.PlusPayRichText;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.PlusTarifficatorPurchase;
import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;
import defpackage.dio;
import defpackage.eu90;
import defpackage.hue0;
import defpackage.ind0;
import defpackage.mvg;
import defpackage.n4u0;
import defpackage.nue0;
import defpackage.ny61;
import defpackage.oue0;
import defpackage.pz40;
import defpackage.tcc;
import defpackage.tse;
import defpackage.wbt;
import defpackage.wls;
import defpackage.wod0;
import defpackage.xvz;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.presale.PresaleViewModel$fetchAndShowPresale$1", f = "PresaleViewModel.kt", l = {CalendarDayView.DISABLED_DAY_ALPHA, 80, 83, 85, MSException.ERROR_INVALID_PASSWORD, MSException.ERROR_INVALID_PARAMETER, HProv.ALG_SID_KECCAK_256}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PresaleViewModel$fetchAndShowPresale$1 extends SuspendLambda implements wls {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PresaleViewModel$fetchAndShowPresale$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PresaleViewModel$fetchAndShowPresale$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PresaleViewModel$fetchAndShowPresale$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0146, code lost:
    
        if (r12 == r1) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x03ca A[LOOP:0: B:14:0x03c4->B:16:0x03ca, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x041d A[LOOP:1: B:24:0x0417->B:26:0x041d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e3 A[LOOP:2: B:65:0x01dd->B:67:0x01e3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x023a A[LOOP:3: B:75:0x0234->B:77:0x023a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b1  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ind0 a;
        Object a2;
        n4u0 n4u0Var;
        a aVar;
        ind0 ind0Var;
        PlusPayPresale plusPayPresale;
        int i;
        String str;
        Iterator<T> it;
        String id;
        Iterator<T> it2;
        String c;
        Object obj2;
        long loadingDelayMillis;
        PresaleViewModel$fetchAndShowPresale$1 presaleViewModel$fetchAndShowPresale$1;
        PlusPayPresale plusPayPresale2;
        int i2;
        CoroutineSingletons coroutineSingletons;
        a aVar2;
        ind0 ind0Var2;
        PlusPayRichText fromLegalInfo;
        Object Y;
        a aVar3;
        pz40 pz40Var;
        String str2;
        Object W;
        PlusPayPresale plusPayPresale3;
        CharSequence charSequence;
        Object obj3;
        Object Y2;
        pz40 pz40Var2;
        CharSequence charSequence2;
        hue0 hue0Var;
        CharSequence charSequence3;
        Object obj4;
        PlusPayLegalInfo legalInfo;
        Object obj5;
        a aVar4;
        pz40 pz40Var3;
        CharSequence charSequence4;
        Object Y3;
        CharSequence charSequence5;
        ind0 ind0Var3;
        a aVar5;
        hue0 hue0Var2;
        PlusPayPresale plusPayPresale4;
        String id2;
        Iterator<T> it3;
        String id3;
        Iterator<T> it4;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        String str3 = "_meta";
        switch (this.label) {
            case 0:
                b.b(obj);
                a = this.this$0.b.a.a();
                wbt wbtVar = this.this$0.c;
                this.L$0 = a;
                this.label = 1;
                a2 = ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.presale.a) wbtVar).a(a, this);
                break;
            case 1:
                a = (ind0) this.L$0;
                b.b(obj);
                a2 = obj;
                PlusPayPresale plusPayPresale5 = (PlusPayPresale) a2;
                a aVar6 = this.this$0;
                if (plusPayPresale5 == null) {
                    aVar6.X();
                    return zy11.a;
                }
                aVar6.B = plusPayPresale5;
                n4u0Var = aVar6.C;
                PlusPayRichText loadingText = plusPayPresale5.getAssets().getLoadingText();
                this.L$0 = a;
                this.L$1 = aVar6;
                this.L$2 = plusPayPresale5;
                this.L$3 = n4u0Var;
                ind0 ind0Var4 = a;
                this.I$0 = 0;
                this.label = 2;
                Object Y4 = aVar6.Y(loadingText, this);
                if (Y4 != coroutineSingletons2) {
                    obj = Y4;
                    aVar = aVar6;
                    ind0Var = ind0Var4;
                    plusPayPresale = plusPayPresale5;
                    i = 0;
                    str = "no_value";
                    CharSequence charSequence6 = (CharSequence) obj;
                    n4u0 n4u0Var2 = n4u0Var;
                    oue0 oue0Var = new oue0(charSequence6);
                    r0 r0Var = (r0) n4u0Var2;
                    r0Var.getClass();
                    r0Var.m(null, oue0Var);
                    eu90 eu90Var = ((wod0) aVar.x).b;
                    String d = dio.d(ind0Var.a);
                    PlusTarifficatorPurchase plusTarifficatorPurchase = ind0Var.b;
                    PlusPayCompositeOffers.Offer.Tariff tariffOffer = plusTarifficatorPurchase.getOffer().getTariffOffer();
                    String id4 = tariffOffer == null ? tariffOffer.getId() : null;
                    String str4 = id4 != null ? str : id4;
                    int i3 = i;
                    List<PlusPayCompositeOffers.Offer.Option> optionOffers = plusTarifficatorPurchase.getOffer().getOptionOffers();
                    PlusPayPresale plusPayPresale6 = plusPayPresale;
                    a aVar7 = aVar;
                    ArrayList arrayList = new ArrayList(tcc.n(optionOffers, 10));
                    it = optionOffers.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((PlusPayCompositeOffers.Offer.Option) it.next()).getId());
                    }
                    String productTarget = plusPayPresale6.getSuggestedOffer().getMeta().getProductTarget();
                    long loadingDelayMillis2 = plusPayPresale6.getLoadingDelayMillis();
                    PlusPayCompositeOffers.Offer.Tariff tariffOffer2 = plusPayPresale6.getSuggestedOffer().getTariffOffer();
                    id = tariffOffer2 == null ? tariffOffer2.getId() : null;
                    if (id == null) {
                        id = str;
                    }
                    List<PlusPayCompositeOffers.Offer.Option> optionOffers2 = plusPayPresale6.getSuggestedOffer().getOptionOffers();
                    ind0 ind0Var5 = ind0Var;
                    ArrayList arrayList2 = new ArrayList(tcc.n(optionOffers2, 10));
                    it2 = optionOffers2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((PlusPayCompositeOffers.Offer.Option) it2.next()).getId());
                    }
                    PlusPayLegalInfo legalInfo2 = plusPayPresale6.getSuggestedOffer().getLegalInfo();
                    c = (legalInfo2 != null || (fromLegalInfo = PlusPayRichText.INSTANCE.fromLegalInfo(legalInfo2)) == null) ? null : com.yandex.plus.pay.ui.common.api.utils.a.c(fromLegalInfo);
                    if (c == null) {
                        c = str;
                    }
                    LinkedHashMap t = xvz.t(eu90Var, "purchase_session_id", d, "product_id", str4);
                    t.put("options_id", arrayList);
                    t.put("target", productTarget);
                    t.put("loading_duration_millis", String.valueOf(loadingDelayMillis2));
                    t.put("presale_product_id", id);
                    obj2 = "presale_options_id";
                    t.put(obj2, arrayList2);
                    t.put("presale_legal_text", c);
                    str3 = "_meta";
                    t.put(str3, eu90.c(new HashMap()));
                    eu90Var.f("Presale.Screen.Shown", t);
                    loadingDelayMillis = plusPayPresale6.getLoadingDelayMillis();
                    presaleViewModel$fetchAndShowPresale$1 = this;
                    presaleViewModel$fetchAndShowPresale$1.L$0 = ind0Var5;
                    presaleViewModel$fetchAndShowPresale$1.L$1 = aVar7;
                    plusPayPresale2 = plusPayPresale6;
                    presaleViewModel$fetchAndShowPresale$1.L$2 = plusPayPresale2;
                    presaleViewModel$fetchAndShowPresale$1.L$3 = null;
                    i2 = i3;
                    presaleViewModel$fetchAndShowPresale$1.I$0 = i2;
                    presaleViewModel$fetchAndShowPresale$1.label = 3;
                    coroutineSingletons = coroutineSingletons2;
                    if (kotlinx.coroutines.a.i(loadingDelayMillis, presaleViewModel$fetchAndShowPresale$1) != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    aVar2 = aVar7;
                    ind0Var2 = ind0Var5;
                    r0 r0Var2 = aVar2.C;
                    PlusPayRichText loadingText2 = plusPayPresale2.getAssets().getLoadingText();
                    presaleViewModel$fetchAndShowPresale$1.L$0 = ind0Var2;
                    presaleViewModel$fetchAndShowPresale$1.L$1 = aVar2;
                    presaleViewModel$fetchAndShowPresale$1.L$2 = plusPayPresale2;
                    presaleViewModel$fetchAndShowPresale$1.L$3 = r0Var2;
                    presaleViewModel$fetchAndShowPresale$1.I$0 = i2;
                    presaleViewModel$fetchAndShowPresale$1.label = 4;
                    Y = aVar2.Y(loadingText2, presaleViewModel$fetchAndShowPresale$1);
                    if (Y != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    aVar3 = aVar2;
                    pz40Var = r0Var2;
                    CharSequence charSequence7 = (CharSequence) Y;
                    str2 = str3;
                    PlusPayPresale.Assets assets = plusPayPresale2.getAssets();
                    presaleViewModel$fetchAndShowPresale$1.L$0 = ind0Var2;
                    presaleViewModel$fetchAndShowPresale$1.L$1 = aVar3;
                    presaleViewModel$fetchAndShowPresale$1.L$2 = plusPayPresale2;
                    presaleViewModel$fetchAndShowPresale$1.L$3 = pz40Var;
                    presaleViewModel$fetchAndShowPresale$1.L$4 = charSequence7;
                    presaleViewModel$fetchAndShowPresale$1.I$0 = i2;
                    presaleViewModel$fetchAndShowPresale$1.label = 5;
                    W = a.W(aVar3, assets, presaleViewModel$fetchAndShowPresale$1);
                    if (W != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    plusPayPresale3 = plusPayPresale2;
                    charSequence = charSequence7;
                    hue0 hue0Var3 = (hue0) W;
                    obj3 = obj2;
                    PlusPayRichText originalOfferButtonText = plusPayPresale3.getAssets().getOriginalOfferButtonText();
                    presaleViewModel$fetchAndShowPresale$1.L$0 = ind0Var2;
                    presaleViewModel$fetchAndShowPresale$1.L$1 = aVar3;
                    presaleViewModel$fetchAndShowPresale$1.L$2 = plusPayPresale3;
                    presaleViewModel$fetchAndShowPresale$1.L$3 = pz40Var;
                    presaleViewModel$fetchAndShowPresale$1.L$4 = charSequence;
                    presaleViewModel$fetchAndShowPresale$1.L$5 = hue0Var3;
                    presaleViewModel$fetchAndShowPresale$1.I$0 = i2;
                    presaleViewModel$fetchAndShowPresale$1.label = 6;
                    Y2 = aVar3.Y(originalOfferButtonText, presaleViewModel$fetchAndShowPresale$1);
                    if (Y2 != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    pz40Var2 = pz40Var;
                    charSequence2 = charSequence;
                    hue0Var = hue0Var3;
                    charSequence3 = (CharSequence) Y2;
                    obj4 = "presale_product_id";
                    legalInfo = plusPayPresale3.getSuggestedOffer().getLegalInfo();
                    obj5 = "loading_duration_millis";
                    if (legalInfo != null) {
                        aVar4 = aVar3;
                        pz40Var3 = pz40Var2;
                        charSequence4 = null;
                        nue0 nue0Var = new nue0(charSequence2, hue0Var, charSequence3, charSequence4);
                        r0 r0Var3 = (r0) pz40Var3;
                        r0Var3.getClass();
                        r0Var3.m(null, nue0Var);
                        wod0 wod0Var = (wod0) aVar4.x;
                        eu90 eu90Var2 = wod0Var.b;
                        String d2 = dio.d(ind0Var2.a);
                        PlusTarifficatorPurchase plusTarifficatorPurchase2 = ind0Var2.b;
                        PlusPayCompositeOffers.Offer.Tariff tariffOffer3 = plusTarifficatorPurchase2.getOffer().getTariffOffer();
                        if (tariffOffer3 != null) {
                        }
                        if (id2 == null) {
                        }
                        List<PlusPayCompositeOffers.Offer.Option> optionOffers3 = plusTarifficatorPurchase2.getOffer().getOptionOffers();
                        ArrayList arrayList3 = new ArrayList(tcc.n(optionOffers3, 10));
                        it3 = optionOffers3.iterator();
                        while (it3.hasNext()) {
                        }
                        String productTarget2 = plusPayPresale3.getSuggestedOffer().getMeta().getProductTarget();
                        long loadingDelayMillis3 = plusPayPresale3.getLoadingDelayMillis();
                        PlusPayCompositeOffers.Offer.Tariff tariffOffer4 = plusPayPresale3.getSuggestedOffer().getTariffOffer();
                        if (tariffOffer4 != null) {
                        }
                        if (id3 == null) {
                        }
                        List<PlusPayCompositeOffers.Offer.Option> optionOffers4 = plusPayPresale3.getSuggestedOffer().getOptionOffers();
                        PlusPayPresale plusPayPresale7 = plusPayPresale3;
                        ArrayList arrayList4 = new ArrayList(tcc.n(optionOffers4, 10));
                        it4 = optionOffers4.iterator();
                        while (it4.hasNext()) {
                        }
                        LinkedHashMap t2 = xvz.t(eu90Var2, "purchase_session_id", d2, "product_id", id2);
                        t2.put("options_id", arrayList3);
                        t2.put("target", productTarget2);
                        t2.put(obj5, String.valueOf(loadingDelayMillis3));
                        t2.put(obj4, id3);
                        t2.put(obj3, arrayList4);
                        t2.put(str2, eu90.c(new HashMap()));
                        eu90Var2.f("Presale.Offer.Shown", t2);
                        wod0Var.c.a(plusPayPresale7.getSuggestedOffer(), 0, "presale_offer", "checkout_presale_page", wod0Var.a.getClientPage(), kotlin.collections.b.f());
                        return zy11.a;
                    }
                    PlusPayRichText fromLegalInfo2 = PlusPayRichText.INSTANCE.fromLegalInfo(legalInfo);
                    presaleViewModel$fetchAndShowPresale$1.L$0 = ind0Var2;
                    presaleViewModel$fetchAndShowPresale$1.L$1 = aVar3;
                    presaleViewModel$fetchAndShowPresale$1.L$2 = plusPayPresale3;
                    presaleViewModel$fetchAndShowPresale$1.L$3 = pz40Var2;
                    presaleViewModel$fetchAndShowPresale$1.L$4 = charSequence2;
                    presaleViewModel$fetchAndShowPresale$1.L$5 = hue0Var;
                    presaleViewModel$fetchAndShowPresale$1.L$6 = charSequence3;
                    presaleViewModel$fetchAndShowPresale$1.L$7 = null;
                    presaleViewModel$fetchAndShowPresale$1.I$0 = i2;
                    presaleViewModel$fetchAndShowPresale$1.I$1 = 0;
                    presaleViewModel$fetchAndShowPresale$1.label = 7;
                    Y3 = aVar3.Y(fromLegalInfo2, presaleViewModel$fetchAndShowPresale$1);
                    if (Y3 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    pz40 pz40Var4 = pz40Var2;
                    charSequence5 = charSequence3;
                    ind0Var3 = ind0Var2;
                    aVar5 = aVar3;
                    pz40Var3 = pz40Var4;
                    hue0Var2 = hue0Var;
                    plusPayPresale4 = plusPayPresale3;
                    a aVar8 = aVar5;
                    ind0Var2 = ind0Var3;
                    charSequence3 = charSequence5;
                    charSequence4 = (CharSequence) Y3;
                    plusPayPresale3 = plusPayPresale4;
                    hue0Var = hue0Var2;
                    aVar4 = aVar8;
                    nue0 nue0Var2 = new nue0(charSequence2, hue0Var, charSequence3, charSequence4);
                    r0 r0Var32 = (r0) pz40Var3;
                    r0Var32.getClass();
                    r0Var32.m(null, nue0Var2);
                    wod0 wod0Var2 = (wod0) aVar4.x;
                    eu90 eu90Var22 = wod0Var2.b;
                    String d22 = dio.d(ind0Var2.a);
                    PlusTarifficatorPurchase plusTarifficatorPurchase22 = ind0Var2.b;
                    PlusPayCompositeOffers.Offer.Tariff tariffOffer32 = plusTarifficatorPurchase22.getOffer().getTariffOffer();
                    id2 = tariffOffer32 != null ? tariffOffer32.getId() : null;
                    if (id2 == null) {
                        id2 = str;
                    }
                    List<PlusPayCompositeOffers.Offer.Option> optionOffers32 = plusTarifficatorPurchase22.getOffer().getOptionOffers();
                    ArrayList arrayList32 = new ArrayList(tcc.n(optionOffers32, 10));
                    it3 = optionOffers32.iterator();
                    while (it3.hasNext()) {
                        arrayList32.add(((PlusPayCompositeOffers.Offer.Option) it3.next()).getId());
                    }
                    String productTarget22 = plusPayPresale3.getSuggestedOffer().getMeta().getProductTarget();
                    long loadingDelayMillis32 = plusPayPresale3.getLoadingDelayMillis();
                    PlusPayCompositeOffers.Offer.Tariff tariffOffer42 = plusPayPresale3.getSuggestedOffer().getTariffOffer();
                    id3 = tariffOffer42 != null ? tariffOffer42.getId() : null;
                    if (id3 == null) {
                        id3 = str;
                    }
                    List<PlusPayCompositeOffers.Offer.Option> optionOffers42 = plusPayPresale3.getSuggestedOffer().getOptionOffers();
                    PlusPayPresale plusPayPresale72 = plusPayPresale3;
                    ArrayList arrayList42 = new ArrayList(tcc.n(optionOffers42, 10));
                    it4 = optionOffers42.iterator();
                    while (it4.hasNext()) {
                        arrayList42.add(((PlusPayCompositeOffers.Offer.Option) it4.next()).getId());
                    }
                    LinkedHashMap t22 = xvz.t(eu90Var22, "purchase_session_id", d22, "product_id", id2);
                    t22.put("options_id", arrayList32);
                    t22.put("target", productTarget22);
                    t22.put(obj5, String.valueOf(loadingDelayMillis32));
                    t22.put(obj4, id3);
                    t22.put(obj3, arrayList42);
                    t22.put(str2, eu90.c(new HashMap()));
                    eu90Var22.f("Presale.Offer.Shown", t22);
                    wod0Var2.c.a(plusPayPresale72.getSuggestedOffer(), 0, "presale_offer", "checkout_presale_page", wod0Var2.a.getClientPage(), kotlin.collections.b.f());
                    return zy11.a;
                }
                return coroutineSingletons2;
            case 2:
                int i4 = this.I$0;
                n4u0 n4u0Var3 = (pz40) this.L$3;
                plusPayPresale = (PlusPayPresale) this.L$2;
                a aVar9 = (a) this.L$1;
                ind0 ind0Var6 = (ind0) this.L$0;
                b.b(obj);
                i = i4;
                ind0Var = ind0Var6;
                aVar = aVar9;
                n4u0Var = n4u0Var3;
                str = "no_value";
                CharSequence charSequence62 = (CharSequence) obj;
                n4u0 n4u0Var22 = n4u0Var;
                oue0 oue0Var2 = new oue0(charSequence62);
                r0 r0Var4 = (r0) n4u0Var22;
                r0Var4.getClass();
                r0Var4.m(null, oue0Var2);
                eu90 eu90Var3 = ((wod0) aVar.x).b;
                String d3 = dio.d(ind0Var.a);
                PlusTarifficatorPurchase plusTarifficatorPurchase3 = ind0Var.b;
                PlusPayCompositeOffers.Offer.Tariff tariffOffer5 = plusTarifficatorPurchase3.getOffer().getTariffOffer();
                if (tariffOffer5 == null) {
                }
                if (id4 != null) {
                }
                int i32 = i;
                List<PlusPayCompositeOffers.Offer.Option> optionOffers5 = plusTarifficatorPurchase3.getOffer().getOptionOffers();
                PlusPayPresale plusPayPresale62 = plusPayPresale;
                a aVar72 = aVar;
                ArrayList arrayList5 = new ArrayList(tcc.n(optionOffers5, 10));
                it = optionOffers5.iterator();
                while (it.hasNext()) {
                }
                String productTarget3 = plusPayPresale62.getSuggestedOffer().getMeta().getProductTarget();
                long loadingDelayMillis22 = plusPayPresale62.getLoadingDelayMillis();
                PlusPayCompositeOffers.Offer.Tariff tariffOffer22 = plusPayPresale62.getSuggestedOffer().getTariffOffer();
                if (tariffOffer22 == null) {
                }
                if (id == null) {
                }
                List<PlusPayCompositeOffers.Offer.Option> optionOffers22 = plusPayPresale62.getSuggestedOffer().getOptionOffers();
                ind0 ind0Var52 = ind0Var;
                ArrayList arrayList22 = new ArrayList(tcc.n(optionOffers22, 10));
                it2 = optionOffers22.iterator();
                while (it2.hasNext()) {
                }
                PlusPayLegalInfo legalInfo22 = plusPayPresale62.getSuggestedOffer().getLegalInfo();
                if (legalInfo22 != null) {
                    break;
                }
                if (c == null) {
                }
                LinkedHashMap t3 = xvz.t(eu90Var3, "purchase_session_id", d3, "product_id", str4);
                t3.put("options_id", arrayList5);
                t3.put("target", productTarget3);
                t3.put("loading_duration_millis", String.valueOf(loadingDelayMillis22));
                t3.put("presale_product_id", id);
                obj2 = "presale_options_id";
                t3.put(obj2, arrayList22);
                t3.put("presale_legal_text", c);
                str3 = "_meta";
                t3.put(str3, eu90.c(new HashMap()));
                eu90Var3.f("Presale.Screen.Shown", t3);
                loadingDelayMillis = plusPayPresale62.getLoadingDelayMillis();
                presaleViewModel$fetchAndShowPresale$1 = this;
                presaleViewModel$fetchAndShowPresale$1.L$0 = ind0Var52;
                presaleViewModel$fetchAndShowPresale$1.L$1 = aVar72;
                plusPayPresale2 = plusPayPresale62;
                presaleViewModel$fetchAndShowPresale$1.L$2 = plusPayPresale2;
                presaleViewModel$fetchAndShowPresale$1.L$3 = null;
                i2 = i32;
                presaleViewModel$fetchAndShowPresale$1.I$0 = i2;
                presaleViewModel$fetchAndShowPresale$1.label = 3;
                coroutineSingletons = coroutineSingletons2;
                if (kotlinx.coroutines.a.i(loadingDelayMillis, presaleViewModel$fetchAndShowPresale$1) != coroutineSingletons) {
                }
                break;
            case 3:
                int i5 = this.I$0;
                plusPayPresale2 = (PlusPayPresale) this.L$2;
                aVar2 = (a) this.L$1;
                ind0Var2 = (ind0) this.L$0;
                b.b(obj);
                presaleViewModel$fetchAndShowPresale$1 = this;
                obj2 = "presale_options_id";
                str = "no_value";
                i2 = i5;
                coroutineSingletons = coroutineSingletons2;
                r0 r0Var22 = aVar2.C;
                PlusPayRichText loadingText22 = plusPayPresale2.getAssets().getLoadingText();
                presaleViewModel$fetchAndShowPresale$1.L$0 = ind0Var2;
                presaleViewModel$fetchAndShowPresale$1.L$1 = aVar2;
                presaleViewModel$fetchAndShowPresale$1.L$2 = plusPayPresale2;
                presaleViewModel$fetchAndShowPresale$1.L$3 = r0Var22;
                presaleViewModel$fetchAndShowPresale$1.I$0 = i2;
                presaleViewModel$fetchAndShowPresale$1.label = 4;
                Y = aVar2.Y(loadingText22, presaleViewModel$fetchAndShowPresale$1);
                if (Y != coroutineSingletons) {
                }
                break;
            case 4:
                int i6 = this.I$0;
                pz40 pz40Var5 = (pz40) this.L$3;
                PlusPayPresale plusPayPresale8 = (PlusPayPresale) this.L$2;
                a aVar10 = (a) this.L$1;
                ind0 ind0Var7 = (ind0) this.L$0;
                b.b(obj);
                presaleViewModel$fetchAndShowPresale$1 = this;
                obj2 = "presale_options_id";
                pz40Var = pz40Var5;
                plusPayPresale2 = plusPayPresale8;
                aVar3 = aVar10;
                ind0Var2 = ind0Var7;
                str = "no_value";
                i2 = i6;
                coroutineSingletons = coroutineSingletons2;
                Y = obj;
                CharSequence charSequence72 = (CharSequence) Y;
                str2 = str3;
                PlusPayPresale.Assets assets2 = plusPayPresale2.getAssets();
                presaleViewModel$fetchAndShowPresale$1.L$0 = ind0Var2;
                presaleViewModel$fetchAndShowPresale$1.L$1 = aVar3;
                presaleViewModel$fetchAndShowPresale$1.L$2 = plusPayPresale2;
                presaleViewModel$fetchAndShowPresale$1.L$3 = pz40Var;
                presaleViewModel$fetchAndShowPresale$1.L$4 = charSequence72;
                presaleViewModel$fetchAndShowPresale$1.I$0 = i2;
                presaleViewModel$fetchAndShowPresale$1.label = 5;
                W = a.W(aVar3, assets2, presaleViewModel$fetchAndShowPresale$1);
                if (W != coroutineSingletons) {
                }
                break;
            case 5:
                int i7 = this.I$0;
                charSequence = (CharSequence) this.L$4;
                pz40Var = (pz40) this.L$3;
                PlusPayPresale plusPayPresale9 = (PlusPayPresale) this.L$2;
                aVar3 = (a) this.L$1;
                ind0 ind0Var8 = (ind0) this.L$0;
                b.b(obj);
                presaleViewModel$fetchAndShowPresale$1 = this;
                obj2 = "presale_options_id";
                str = "no_value";
                i2 = i7;
                str2 = "_meta";
                plusPayPresale3 = plusPayPresale9;
                ind0Var2 = ind0Var8;
                coroutineSingletons = coroutineSingletons2;
                W = obj;
                hue0 hue0Var32 = (hue0) W;
                obj3 = obj2;
                PlusPayRichText originalOfferButtonText2 = plusPayPresale3.getAssets().getOriginalOfferButtonText();
                presaleViewModel$fetchAndShowPresale$1.L$0 = ind0Var2;
                presaleViewModel$fetchAndShowPresale$1.L$1 = aVar3;
                presaleViewModel$fetchAndShowPresale$1.L$2 = plusPayPresale3;
                presaleViewModel$fetchAndShowPresale$1.L$3 = pz40Var;
                presaleViewModel$fetchAndShowPresale$1.L$4 = charSequence;
                presaleViewModel$fetchAndShowPresale$1.L$5 = hue0Var32;
                presaleViewModel$fetchAndShowPresale$1.I$0 = i2;
                presaleViewModel$fetchAndShowPresale$1.label = 6;
                Y2 = aVar3.Y(originalOfferButtonText2, presaleViewModel$fetchAndShowPresale$1);
                if (Y2 != coroutineSingletons) {
                }
                break;
            case 6:
                int i8 = this.I$0;
                hue0Var = (hue0) this.L$5;
                CharSequence charSequence8 = (CharSequence) this.L$4;
                pz40 pz40Var6 = (pz40) this.L$3;
                PlusPayPresale plusPayPresale10 = (PlusPayPresale) this.L$2;
                a aVar11 = (a) this.L$1;
                ind0 ind0Var9 = (ind0) this.L$0;
                b.b(obj);
                str = "no_value";
                i2 = i8;
                str2 = "_meta";
                obj3 = "presale_options_id";
                plusPayPresale3 = plusPayPresale10;
                charSequence2 = charSequence8;
                presaleViewModel$fetchAndShowPresale$1 = this;
                ind0Var2 = ind0Var9;
                Y2 = obj;
                coroutineSingletons = coroutineSingletons2;
                pz40Var2 = pz40Var6;
                aVar3 = aVar11;
                charSequence3 = (CharSequence) Y2;
                obj4 = "presale_product_id";
                legalInfo = plusPayPresale3.getSuggestedOffer().getLegalInfo();
                obj5 = "loading_duration_millis";
                if (legalInfo != null) {
                }
                break;
            case 7:
                charSequence5 = (CharSequence) this.L$6;
                hue0Var2 = (hue0) this.L$5;
                charSequence2 = (CharSequence) this.L$4;
                pz40Var3 = (pz40) this.L$3;
                plusPayPresale4 = (PlusPayPresale) this.L$2;
                aVar5 = (a) this.L$1;
                ind0Var3 = (ind0) this.L$0;
                b.b(obj);
                str2 = "_meta";
                obj3 = "presale_options_id";
                obj4 = "presale_product_id";
                obj5 = "loading_duration_millis";
                str = "no_value";
                Y3 = obj;
                a aVar82 = aVar5;
                ind0Var2 = ind0Var3;
                charSequence3 = charSequence5;
                charSequence4 = (CharSequence) Y3;
                plusPayPresale3 = plusPayPresale4;
                hue0Var = hue0Var2;
                aVar4 = aVar82;
                nue0 nue0Var22 = new nue0(charSequence2, hue0Var, charSequence3, charSequence4);
                r0 r0Var322 = (r0) pz40Var3;
                r0Var322.getClass();
                r0Var322.m(null, nue0Var22);
                wod0 wod0Var22 = (wod0) aVar4.x;
                eu90 eu90Var222 = wod0Var22.b;
                String d222 = dio.d(ind0Var2.a);
                PlusTarifficatorPurchase plusTarifficatorPurchase222 = ind0Var2.b;
                PlusPayCompositeOffers.Offer.Tariff tariffOffer322 = plusTarifficatorPurchase222.getOffer().getTariffOffer();
                if (tariffOffer322 != null) {
                }
                if (id2 == null) {
                }
                List<PlusPayCompositeOffers.Offer.Option> optionOffers322 = plusTarifficatorPurchase222.getOffer().getOptionOffers();
                ArrayList arrayList322 = new ArrayList(tcc.n(optionOffers322, 10));
                it3 = optionOffers322.iterator();
                while (it3.hasNext()) {
                }
                String productTarget222 = plusPayPresale3.getSuggestedOffer().getMeta().getProductTarget();
                long loadingDelayMillis322 = plusPayPresale3.getLoadingDelayMillis();
                PlusPayCompositeOffers.Offer.Tariff tariffOffer422 = plusPayPresale3.getSuggestedOffer().getTariffOffer();
                if (tariffOffer422 != null) {
                }
                if (id3 == null) {
                }
                List<PlusPayCompositeOffers.Offer.Option> optionOffers422 = plusPayPresale3.getSuggestedOffer().getOptionOffers();
                PlusPayPresale plusPayPresale722 = plusPayPresale3;
                ArrayList arrayList422 = new ArrayList(tcc.n(optionOffers422, 10));
                it4 = optionOffers422.iterator();
                while (it4.hasNext()) {
                }
                LinkedHashMap t222 = xvz.t(eu90Var222, "purchase_session_id", d222, "product_id", id2);
                t222.put("options_id", arrayList322);
                t222.put("target", productTarget222);
                t222.put(obj5, String.valueOf(loadingDelayMillis322));
                t222.put(obj4, id3);
                t222.put(obj3, arrayList422);
                t222.put(str2, eu90.c(new HashMap()));
                eu90Var222.f("Presale.Offer.Shown", t222);
                wod0Var22.c.a(plusPayPresale722.getSuggestedOffer(), 0, "presale_offer", "checkout_presale_page", wod0Var22.a.getClientPage(), kotlin.collections.b.f());
                return zy11.a;
            default:
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
