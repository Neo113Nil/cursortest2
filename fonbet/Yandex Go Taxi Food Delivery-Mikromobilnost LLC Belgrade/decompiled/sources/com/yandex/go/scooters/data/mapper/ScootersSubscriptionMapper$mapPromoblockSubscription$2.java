package com.yandex.go.scooters.data.mapper;

import com.yandex.go.scooters.data.model.SubscriptionPromoblock;
import defpackage.cxo0;
import defpackage.evu0;
import defpackage.fef;
import defpackage.fxo0;
import defpackage.gxo0;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.wwo0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lgxo0;", "<anonymous>", "(Ltse;)Lgxo0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.data.mapper.ScootersSubscriptionMapper$mapPromoblockSubscription$2", f = "ScootersSubscriptionMapper.kt", l = {82, 83, HProv.ALG_SID_NO_HASH, 85}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersSubscriptionMapper$mapPromoblockSubscription$2 extends SuspendLambda implements wls {
    final /* synthetic */ fef $currencyRules;
    final /* synthetic */ SubscriptionPromoblock $promoblock;
    final /* synthetic */ wwo0 $scootersSubscriptionDeeplink;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersSubscriptionMapper$mapPromoblockSubscription$2(wwo0 wwo0Var, SubscriptionPromoblock subscriptionPromoblock, e eVar, fef fefVar, Continuation continuation) {
        super(2, continuation);
        this.$scootersSubscriptionDeeplink = wwo0Var;
        this.$promoblock = subscriptionPromoblock;
        this.this$0 = eVar;
        this.$currencyRules = fefVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersSubscriptionMapper$mapPromoblockSubscription$2 scootersSubscriptionMapper$mapPromoblockSubscription$2 = new ScootersSubscriptionMapper$mapPromoblockSubscription$2(this.$scootersSubscriptionDeeplink, this.$promoblock, this.this$0, this.$currencyRules, continuation);
        scootersSubscriptionMapper$mapPromoblockSubscription$2.L$0 = obj;
        return scootersSubscriptionMapper$mapPromoblockSubscription$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersSubscriptionMapper$mapPromoblockSubscription$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x015a  */
    /* JADX WARN: Type inference failed for: r8v9, types: [noh] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        wwo0 wwo0Var;
        noh nohVar;
        qoh qohVar;
        String str;
        CharSequence charSequence;
        wwo0 wwo0Var2;
        noh nohVar2;
        Object k;
        CharSequence charSequence2;
        String str2;
        CharSequence charSequence3;
        Object k2;
        CharSequence charSequence4;
        String str3;
        wwo0 wwo0Var3;
        cxo0 cxo0Var;
        CharSequence charSequence5;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            qoh h2 = tje.h(tseVar, null, null, new ScootersSubscriptionMapper$mapPromoblockSubscription$2$titleAsync$1(this.$currencyRules, this.this$0, this.$promoblock, null), 3);
            h = tje.h(tseVar, null, null, new ScootersSubscriptionMapper$mapPromoblockSubscription$2$subtitleAsync$1(this.$currencyRules, this.this$0, this.$promoblock, null), 3);
            qoh h3 = tje.h(tseVar, null, null, new ScootersSubscriptionMapper$mapPromoblockSubscription$2$badgeAsync$1(this.$currencyRules, this.this$0, this.$promoblock, null), 3);
            qoh h4 = tje.h(tseVar, null, null, new ScootersSubscriptionMapper$mapPromoblockSubscription$2$toggleAsync$1(this.$currencyRules, this.this$0, this.$promoblock, null), 3);
            wwo0Var = this.$scootersSubscriptionDeeplink;
            String str4 = this.$promoblock.a;
            if (str4 == null || evu0.J(str4)) {
                str4 = null;
            }
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h;
            this.L$3 = h3;
            this.L$4 = h4;
            this.L$5 = wwo0Var;
            this.L$6 = str4;
            this.label = 1;
            obj = h2.s(this);
            if (obj != coroutineSingletons) {
                nohVar = h4;
                qohVar = h3;
                str = str4;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                charSequence = (CharSequence) this.L$7;
                str = (String) this.L$6;
                wwo0Var2 = (wwo0) this.L$5;
                nohVar = (noh) this.L$4;
                nohVar2 = (noh) this.L$3;
                kotlin.b.b(obj);
                CharSequence charSequence6 = (CharSequence) obj;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = nohVar;
                this.L$5 = wwo0Var2;
                this.L$6 = str;
                this.L$7 = charSequence;
                this.L$8 = charSequence6;
                this.label = 3;
                k = nohVar2.k(this);
                if (k != coroutineSingletons) {
                    CharSequence charSequence7 = charSequence;
                    charSequence2 = charSequence6;
                    obj = k;
                    str2 = str;
                    charSequence3 = charSequence7;
                    cxo0 cxo0Var2 = (cxo0) obj;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = wwo0Var2;
                    this.L$6 = str2;
                    this.L$7 = charSequence3;
                    this.L$8 = charSequence2;
                    this.L$9 = cxo0Var2;
                    this.label = 4;
                    k2 = nohVar.k(this);
                    if (k2 != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
            if (i != 3) {
                if (i != 4) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cxo0 cxo0Var3 = (cxo0) this.L$9;
                CharSequence charSequence8 = (CharSequence) this.L$8;
                CharSequence charSequence9 = (CharSequence) this.L$7;
                String str5 = (String) this.L$6;
                wwo0 wwo0Var4 = (wwo0) this.L$5;
                kotlin.b.b(obj);
                charSequence5 = charSequence8;
                wwo0Var3 = wwo0Var4;
                charSequence4 = charSequence9;
                str3 = str5;
                cxo0Var = cxo0Var3;
                return new gxo0(wwo0Var3, str3, charSequence4, charSequence5, cxo0Var, (fxo0) obj);
            }
            charSequence2 = (CharSequence) this.L$8;
            charSequence3 = (CharSequence) this.L$7;
            str2 = (String) this.L$6;
            wwo0Var2 = (wwo0) this.L$5;
            nohVar = (noh) this.L$4;
            kotlin.b.b(obj);
            cxo0 cxo0Var22 = (cxo0) obj;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = wwo0Var2;
            this.L$6 = str2;
            this.L$7 = charSequence3;
            this.L$8 = charSequence2;
            this.L$9 = cxo0Var22;
            this.label = 4;
            k2 = nohVar.k(this);
            if (k2 != coroutineSingletons) {
                charSequence4 = charSequence3;
                str3 = str2;
                wwo0Var3 = wwo0Var2;
                cxo0Var = cxo0Var22;
                charSequence5 = charSequence2;
                obj = k2;
                return new gxo0(wwo0Var3, str3, charSequence4, charSequence5, cxo0Var, (fxo0) obj);
            }
            return coroutineSingletons;
        }
        String str6 = (String) this.L$6;
        wwo0 wwo0Var5 = (wwo0) this.L$5;
        nohVar = (noh) this.L$4;
        ?? r8 = (noh) this.L$3;
        h = (noh) this.L$2;
        kotlin.b.b(obj);
        str = str6;
        qohVar = r8;
        wwo0Var = wwo0Var5;
        CharSequence charSequence10 = (CharSequence) obj;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = qohVar;
        this.L$4 = nohVar;
        this.L$5 = wwo0Var;
        this.L$6 = str;
        this.L$7 = charSequence10;
        this.label = 2;
        Object k3 = h.k(this);
        if (k3 != coroutineSingletons) {
            qoh qohVar2 = qohVar;
            charSequence = charSequence10;
            obj = k3;
            wwo0Var2 = wwo0Var;
            nohVar2 = qohVar2;
            CharSequence charSequence62 = (CharSequence) obj;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = nohVar;
            this.L$5 = wwo0Var2;
            this.L$6 = str;
            this.L$7 = charSequence;
            this.L$8 = charSequence62;
            this.label = 3;
            k = nohVar2.k(this);
            if (k != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}
