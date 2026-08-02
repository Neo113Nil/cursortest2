package com.yandex.go.scooters.data.mapper;

import com.yandex.go.scooters.data.model.ScootersSubscriptionUpsaleWindowDto;
import defpackage.a0p0;
import defpackage.fef;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.xzo0;
import defpackage.yzo0;
import defpackage.zy11;
import defpackage.zzo0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "La0p0;", "<anonymous>", "(Ltse;)La0p0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.data.mapper.ScootersSubscriptionMapper$mapSubscriptionUpsaleWindow$2", f = "ScootersSubscriptionMapper.kt", l = {HProv.PP_HANDLE_COUNT, 164, 165, 166, MSException.ERROR_BUSY}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersSubscriptionMapper$mapSubscriptionUpsaleWindow$2 extends SuspendLambda implements wls {
    final /* synthetic */ fef $currencyRules;
    final /* synthetic */ ScootersSubscriptionUpsaleWindowDto $this_mapSubscriptionUpsaleWindow;
    final /* synthetic */ yzo0 $windowConfirmButton;
    final /* synthetic */ yzo0 $windowRejectButton;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
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
    public ScootersSubscriptionMapper$mapSubscriptionUpsaleWindow$2(ScootersSubscriptionUpsaleWindowDto scootersSubscriptionUpsaleWindowDto, yzo0 yzo0Var, yzo0 yzo0Var2, e eVar, fef fefVar, Continuation continuation) {
        super(2, continuation);
        this.$this_mapSubscriptionUpsaleWindow = scootersSubscriptionUpsaleWindowDto;
        this.$windowConfirmButton = yzo0Var;
        this.$windowRejectButton = yzo0Var2;
        this.this$0 = eVar;
        this.$currencyRules = fefVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersSubscriptionMapper$mapSubscriptionUpsaleWindow$2 scootersSubscriptionMapper$mapSubscriptionUpsaleWindow$2 = new ScootersSubscriptionMapper$mapSubscriptionUpsaleWindow$2(this.$this_mapSubscriptionUpsaleWindow, this.$windowConfirmButton, this.$windowRejectButton, this.this$0, this.$currencyRules, continuation);
        scootersSubscriptionMapper$mapSubscriptionUpsaleWindow$2.L$0 = obj;
        return scootersSubscriptionMapper$mapSubscriptionUpsaleWindow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersSubscriptionMapper$mapSubscriptionUpsaleWindow$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0167, code lost:
    
        if (r7 == r2) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01a8  */
    /* JADX WARN: Type inference failed for: r3v10, types: [noh] */
    /* JADX WARN: Type inference failed for: r7v10, types: [noh] */
    /* JADX WARN: Type inference failed for: r7v13, types: [noh] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        qoh h2;
        noh h3;
        Object s;
        noh nohVar;
        CharSequence charSequence;
        Object k;
        Object k2;
        noh nohVar2;
        CharSequence charSequence2;
        Object k3;
        CharSequence charSequence3;
        CharSequence charSequence4;
        Object k4;
        xzo0 xzo0Var;
        CharSequence charSequence5;
        yzo0 yzo0Var;
        CharSequence charSequence6;
        yzo0 yzo0Var2;
        String str;
        CharSequence charSequence7;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            qoh h4 = tje.h(tseVar, null, null, new ScootersSubscriptionMapper$mapSubscriptionUpsaleWindow$2$titleAsync$1(this.$currencyRules, this.this$0, this.$this_mapSubscriptionUpsaleWindow, null), 3);
            h = tje.h(tseVar, null, null, new ScootersSubscriptionMapper$mapSubscriptionUpsaleWindow$2$subtitleAsync$1(this.$currencyRules, this.this$0, this.$this_mapSubscriptionUpsaleWindow, null), 3);
            qoh h5 = tje.h(tseVar, null, null, new ScootersSubscriptionMapper$mapSubscriptionUpsaleWindow$2$priceTitleAsync$1(this.$currencyRules, this.this$0, this.$this_mapSubscriptionUpsaleWindow, null), 3);
            ScootersSubscriptionUpsaleWindowDto scootersSubscriptionUpsaleWindowDto = this.$this_mapSubscriptionUpsaleWindow;
            h2 = tje.h(tseVar, null, null, new ScootersSubscriptionMapper$mapSubscriptionUpsaleWindow$2$badgeAsync$1(this.$currencyRules, this.this$0, scootersSubscriptionUpsaleWindowDto, null), 3);
            h3 = tje.h(tseVar, null, null, new ScootersSubscriptionMapper$mapSubscriptionUpsaleWindow$2$legalInfoAsync$1(this.$this_mapSubscriptionUpsaleWindow, this.this$0, null), 3);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h;
            this.L$3 = h5;
            this.L$4 = h2;
            this.L$5 = h3;
            this.label = 1;
            s = h4.s(this);
            if (s != coroutineSingletons) {
                nohVar = h5;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                CharSequence charSequence8 = (CharSequence) this.L$6;
                noh nohVar3 = (noh) this.L$5;
                ?? r7 = (noh) this.L$4;
                nohVar = (noh) this.L$3;
                kotlin.b.b(obj);
                charSequence = charSequence8;
                h3 = nohVar3;
                h2 = r7;
                k = obj;
                CharSequence charSequence9 = (CharSequence) k;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = h2;
                this.L$5 = h3;
                this.L$6 = charSequence;
                this.L$7 = charSequence9;
                this.label = 3;
                k2 = nohVar.k(this);
                if (k2 != coroutineSingletons) {
                    nohVar2 = h3;
                    charSequence2 = charSequence9;
                    CharSequence charSequence10 = (CharSequence) k2;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = nohVar2;
                    this.L$6 = charSequence;
                    this.L$7 = charSequence2;
                    this.L$8 = charSequence10;
                    this.label = 4;
                    k3 = h2.k(this);
                    if (k3 != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
            if (i == 3) {
                charSequence2 = (CharSequence) this.L$7;
                charSequence = (CharSequence) this.L$6;
                noh nohVar4 = (noh) this.L$5;
                ?? r72 = (noh) this.L$4;
                kotlin.b.b(obj);
                h2 = r72;
                nohVar2 = nohVar4;
                k2 = obj;
                CharSequence charSequence102 = (CharSequence) k2;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = nohVar2;
                this.L$6 = charSequence;
                this.L$7 = charSequence2;
                this.L$8 = charSequence102;
                this.label = 4;
                k3 = h2.k(this);
                if (k3 != coroutineSingletons) {
                    charSequence3 = charSequence2;
                    charSequence4 = charSequence102;
                    xzo0 xzo0Var2 = (xzo0) k3;
                    String str2 = this.$this_mapSubscriptionUpsaleWindow.e;
                    yzo0 yzo0Var3 = this.$windowConfirmButton;
                    yzo0 yzo0Var4 = this.$windowRejectButton;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = charSequence;
                    this.L$7 = charSequence3;
                    this.L$8 = charSequence4;
                    this.L$9 = xzo0Var2;
                    this.L$10 = str2;
                    this.L$11 = yzo0Var3;
                    this.L$12 = yzo0Var4;
                    this.label = 5;
                    k4 = nohVar2.k(this);
                    if (k4 != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
            if (i != 4) {
                if (i != 5) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                yzo0 yzo0Var5 = (yzo0) this.L$12;
                yzo0 yzo0Var6 = (yzo0) this.L$11;
                String str3 = (String) this.L$10;
                xzo0 xzo0Var3 = (xzo0) this.L$9;
                CharSequence charSequence11 = (CharSequence) this.L$8;
                CharSequence charSequence12 = (CharSequence) this.L$7;
                CharSequence charSequence13 = (CharSequence) this.L$6;
                kotlin.b.b(obj);
                charSequence5 = charSequence12;
                charSequence6 = charSequence13;
                yzo0Var = yzo0Var5;
                yzo0Var2 = yzo0Var6;
                str = str3;
                xzo0Var = xzo0Var3;
                charSequence7 = charSequence11;
                k4 = obj;
                return new a0p0(charSequence6, charSequence5, charSequence7, xzo0Var, str, yzo0Var2, yzo0Var, (zzo0) k4, this.$this_mapSubscriptionUpsaleWindow.i);
            }
            charSequence4 = (CharSequence) this.L$8;
            CharSequence charSequence14 = (CharSequence) this.L$7;
            CharSequence charSequence15 = (CharSequence) this.L$6;
            noh nohVar5 = (noh) this.L$5;
            kotlin.b.b(obj);
            nohVar2 = nohVar5;
            charSequence3 = charSequence14;
            charSequence = charSequence15;
            k3 = obj;
            xzo0 xzo0Var22 = (xzo0) k3;
            String str22 = this.$this_mapSubscriptionUpsaleWindow.e;
            yzo0 yzo0Var32 = this.$windowConfirmButton;
            yzo0 yzo0Var42 = this.$windowRejectButton;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = charSequence;
            this.L$7 = charSequence3;
            this.L$8 = charSequence4;
            this.L$9 = xzo0Var22;
            this.L$10 = str22;
            this.L$11 = yzo0Var32;
            this.L$12 = yzo0Var42;
            this.label = 5;
            k4 = nohVar2.k(this);
            if (k4 != coroutineSingletons) {
                xzo0Var = xzo0Var22;
                charSequence5 = charSequence3;
                yzo0Var = yzo0Var42;
                charSequence6 = charSequence;
                yzo0Var2 = yzo0Var32;
                str = str22;
                charSequence7 = charSequence4;
                return new a0p0(charSequence6, charSequence5, charSequence7, xzo0Var, str, yzo0Var2, yzo0Var, (zzo0) k4, this.$this_mapSubscriptionUpsaleWindow.i);
            }
            return coroutineSingletons;
        }
        h3 = (noh) this.L$5;
        ?? r3 = (noh) this.L$4;
        nohVar = (noh) this.L$3;
        h = (noh) this.L$2;
        kotlin.b.b(obj);
        h2 = r3;
        s = obj;
        charSequence = (CharSequence) s;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = nohVar;
        this.L$4 = h2;
        this.L$5 = h3;
        this.L$6 = charSequence;
        this.label = 2;
        k = h.k(this);
    }
}
