package com.yandex.go.chargers.feedback.domain;

import com.yandex.go.chargers.data.model.ChargersAttributeDto;
import com.yandex.go.chargers.discounts.api.data.model.ChargersDiscountDto;
import com.yandex.go.chargers.feedback.data.ChargersFeedbackScreenPromoPlateActionDto$OpenDiscountDetails;
import com.yandex.go.chargers.feedback.data.ChargersFeedbackScreenPromoPlateAnimationTag;
import com.yandex.go.chargers.feedback.data.ChargersFeedbackScreenPromoPlateDto;
import com.yandex.go.chargers.feedback.data.m;
import com.yandex.go.chargers.feedback.data.n;
import com.yandex.go.chargers.feedback.data.o;
import defpackage.dz9;
import defpackage.ez9;
import defpackage.fz9;
import defpackage.gz9;
import defpackage.ir9;
import defpackage.mja1;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.ovi0;
import defpackage.oz9;
import defpackage.qoh;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tn9;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.wwh0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ldz9;", "<anonymous>", "(Ltse;)Ldz9;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.feedback.domain.ChargersFeedbackScreenInteractor$mapPromoPlate$2", f = "ChargersFeedbackScreenInteractor.kt", l = {HProv.PP_BIO_STATISTICA_LEN, HProv.PP_REBOOT, 99}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersFeedbackScreenInteractor$mapPromoPlate$2 extends SuspendLambda implements wls {
    final /* synthetic */ ChargersFeedbackScreenPromoPlateDto $promoPlateDto;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$13;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersFeedbackScreenInteractor$mapPromoPlate$2(ChargersFeedbackScreenPromoPlateDto chargersFeedbackScreenPromoPlateDto, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$promoPlateDto = chargersFeedbackScreenPromoPlateDto;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChargersFeedbackScreenInteractor$mapPromoPlate$2 chargersFeedbackScreenInteractor$mapPromoPlate$2 = new ChargersFeedbackScreenInteractor$mapPromoPlate$2(this.$promoPlateDto, this.this$0, continuation);
        chargersFeedbackScreenInteractor$mapPromoPlate$2.L$0 = obj;
        return chargersFeedbackScreenInteractor$mapPromoPlate$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersFeedbackScreenInteractor$mapPromoPlate$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0168  */
    /* JADX WARN: Type inference failed for: r3v13, types: [noh] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0125 -> B:7:0x0128). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object s;
        qoh qohVar;
        String str;
        Object k;
        String str2;
        CharSequence charSequence;
        String str3;
        Iterator it;
        a aVar;
        CharSequence charSequence2;
        Collection collection;
        CharSequence charSequence3;
        Integer num;
        Integer num2;
        o oVar;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        gz9 gz9Var = null;
        if (i == 0) {
            kotlin.b.b(obj);
            qoh h = tje.h(tseVar, null, null, new ChargersFeedbackScreenInteractor$mapPromoPlate$2$titleAsync$1(this.$promoPlateDto, this.this$0, null), 3);
            qoh h2 = tje.h(tseVar, null, null, new ChargersFeedbackScreenInteractor$mapPromoPlate$2$subtitleAsync$1(this.$promoPlateDto, this.this$0, null), 3);
            String str4 = this.$promoPlateDto.a;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h2;
            this.L$3 = str4;
            this.label = 1;
            s = h.s(this);
            if (s != coroutineSingletons) {
                qohVar = h2;
                str = str4;
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            str = (String) this.L$3;
            ?? r3 = (noh) this.L$2;
            kotlin.b.b(obj);
            qohVar = r3;
            s = obj;
        } else if (i == 2) {
            charSequence = (CharSequence) this.L$4;
            str2 = (String) this.L$3;
            kotlin.b.b(obj);
            k = obj;
            List list = this.$promoPlateDto.d;
            a aVar2 = this.this$0;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            Iterator it2 = list.iterator();
            str3 = str2;
            it = it2;
            aVar = aVar2;
            charSequence2 = charSequence;
            collection = arrayList;
            charSequence3 = (CharSequence) k;
            if (!it.hasNext()) {
            }
        } else {
            if (i != 3) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            collection = (Collection) this.L$13;
            CharSequence charSequence4 = (CharSequence) this.L$12;
            CharSequence charSequence5 = (CharSequence) this.L$11;
            str3 = (String) this.L$10;
            Iterator it3 = (Iterator) this.L$7;
            Collection collection2 = (Collection) this.L$6;
            a aVar3 = (a) this.L$4;
            kotlin.b.b(obj);
            a aVar4 = aVar3;
            CharSequence charSequence6 = charSequence4;
            it = it3;
            charSequence2 = charSequence5;
            Object a = obj;
            collection.add((tn9) a);
            collection = collection2;
            charSequence3 = charSequence6;
            aVar = aVar4;
            if (!it.hasNext()) {
                ChargersAttributeDto chargersAttributeDto = (ChargersAttributeDto) it.next();
                com.yandex.go.chargers.domain.mapper.a aVar5 = aVar.b;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = aVar;
                this.L$5 = null;
                this.L$6 = collection;
                this.L$7 = it;
                this.L$8 = null;
                this.L$9 = null;
                this.L$10 = str3;
                this.L$11 = charSequence2;
                this.L$12 = charSequence3;
                this.L$13 = collection;
                this.label = 3;
                a = aVar5.a(chargersAttributeDto, this);
                if (a != coroutineSingletons) {
                    aVar4 = aVar;
                    charSequence6 = charSequence3;
                    collection2 = collection;
                    collection.add((tn9) a);
                    collection = collection2;
                    charSequence3 = charSequence6;
                    aVar = aVar4;
                    if (!it.hasNext()) {
                        List list2 = (List) collection;
                        ChargersFeedbackScreenPromoPlateAnimationTag chargersFeedbackScreenPromoPlateAnimationTag = this.$promoPlateDto.e;
                        int i2 = chargersFeedbackScreenPromoPlateAnimationTag == null ? -1 : oz9.a[chargersFeedbackScreenPromoPlateAnimationTag.ordinal()];
                        if (i2 == 1) {
                            num = new Integer(wwh0.confetti_blue);
                        } else {
                            if (i2 != 2) {
                                num2 = null;
                                String str5 = this.$promoPlateDto.f;
                                ovi0 a2 = str5 == null ? mja1.a(str5, null, 6) : null;
                                oVar = this.$promoPlateDto.g;
                                if (oVar != null) {
                                    if (oVar instanceof ChargersFeedbackScreenPromoPlateActionDto$OpenDiscountDetails) {
                                        ChargersDiscountDto chargersDiscountDto = ((ChargersFeedbackScreenPromoPlateActionDto$OpenDiscountDetails) oVar).a;
                                        gz9Var = new ez9(new ir9(chargersDiscountDto.a, chargersDiscountDto.b, null));
                                    } else if (oVar.equals(m.INSTANCE)) {
                                        gz9Var = fz9.a;
                                    } else if (!oVar.equals(n.INSTANCE)) {
                                        w511.b();
                                        return null;
                                    }
                                }
                                return new dz9(str3, charSequence2, charSequence3, list2, num2, a2, gz9Var);
                            }
                            num = new Integer(wwh0.confetti_green);
                        }
                        num2 = num;
                        String str52 = this.$promoPlateDto.f;
                        if (str52 == null) {
                        }
                        oVar = this.$promoPlateDto.g;
                        if (oVar != null) {
                        }
                        return new dz9(str3, charSequence2, charSequence3, list2, num2, a2, gz9Var);
                    }
                }
                return coroutineSingletons;
            }
        }
        CharSequence charSequence7 = (CharSequence) s;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = str;
        this.L$4 = charSequence7;
        this.label = 2;
        k = qohVar.k(this);
        if (k != coroutineSingletons) {
            str2 = str;
            charSequence = charSequence7;
            List list3 = this.$promoPlateDto.d;
            a aVar22 = this.this$0;
            ArrayList arrayList2 = new ArrayList(tcc.n(list3, 10));
            Iterator it22 = list3.iterator();
            str3 = str2;
            it = it22;
            aVar = aVar22;
            charSequence2 = charSequence;
            collection = arrayList2;
            charSequence3 = (CharSequence) k;
            if (!it.hasNext()) {
            }
        }
        return coroutineSingletons;
    }
}
