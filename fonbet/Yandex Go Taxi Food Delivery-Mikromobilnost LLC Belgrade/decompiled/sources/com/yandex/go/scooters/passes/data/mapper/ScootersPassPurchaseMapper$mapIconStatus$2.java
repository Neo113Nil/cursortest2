package com.yandex.go.scooters.passes.data.mapper;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.b0g0;
import defpackage.joo0;
import defpackage.koo0;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lmoo0;", "<anonymous>", "(Ltse;)Lmoo0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.passes.data.mapper.ScootersPassPurchaseMapper$mapIconStatus$2", f = "ScootersPassPurchaseMapper.kt", l = {50, SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE, 52, 53}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPassPurchaseMapper$mapIconStatus$2 extends SuspendLambda implements wls {
    final /* synthetic */ b0g0 $info;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPassPurchaseMapper$mapIconStatus$2(b0g0 b0g0Var, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$info = b0g0Var;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersPassPurchaseMapper$mapIconStatus$2 scootersPassPurchaseMapper$mapIconStatus$2 = new ScootersPassPurchaseMapper$mapIconStatus$2(this.$info, this.this$0, continuation);
        scootersPassPurchaseMapper$mapIconStatus$2.L$0 = obj;
        return scootersPassPurchaseMapper$mapIconStatus$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPassPurchaseMapper$mapIconStatus$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0129  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FormattedText formattedText;
        noh h;
        noh nohVar;
        noh nohVar2;
        CharSequence charSequence;
        noh nohVar3;
        noh nohVar4;
        Object k;
        CharSequence charSequence2;
        noh nohVar5;
        CharSequence charSequence3;
        Object k2;
        CharSequence charSequence4;
        CharSequence charSequence5;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            b0g0 b0g0Var = this.$info;
            if (b0g0Var == null || (formattedText = b0g0Var.a) == null) {
                return joo0.a;
            }
            qoh h2 = tje.h(tseVar, null, null, new ScootersPassPurchaseMapper$mapIconStatus$2$title$1(this.this$0, formattedText, null), 3);
            qoh h3 = tje.h(tseVar, null, null, new ScootersPassPurchaseMapper$mapIconStatus$2$buttonTitle$1(this.$info, this.this$0, null), 3);
            qoh h4 = tje.h(tseVar, null, null, new ScootersPassPurchaseMapper$mapIconStatus$2$expirationStatus$1(this.$info, this.this$0, null), 3);
            h = tje.h(tseVar, null, null, new ScootersPassPurchaseMapper$mapIconStatus$2$description$1(this.$info, this.this$0, null), 3);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = h3;
            this.L$4 = h4;
            this.L$5 = h;
            this.label = 1;
            obj = h2.s(this);
            if (obj != coroutineSingletons) {
                nohVar = h3;
                nohVar2 = h4;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                charSequence = (CharSequence) this.L$6;
                nohVar4 = (noh) this.L$5;
                nohVar3 = (noh) this.L$4;
                b.b(obj);
                CharSequence charSequence6 = (CharSequence) obj;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = nohVar4;
                this.L$6 = charSequence;
                this.L$7 = charSequence6;
                this.label = 3;
                k = nohVar3.k(this);
                if (k != coroutineSingletons) {
                    CharSequence charSequence7 = charSequence;
                    charSequence2 = charSequence6;
                    obj = k;
                    nohVar5 = nohVar4;
                    charSequence3 = charSequence7;
                    CharSequence charSequence8 = (CharSequence) obj;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = charSequence3;
                    this.L$7 = charSequence2;
                    this.L$8 = charSequence8;
                    this.label = 4;
                    k2 = nohVar5.k(this);
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
                CharSequence charSequence9 = (CharSequence) this.L$8;
                CharSequence charSequence10 = (CharSequence) this.L$7;
                charSequence3 = (CharSequence) this.L$6;
                b.b(obj);
                charSequence4 = charSequence9;
                charSequence5 = charSequence10;
                CharSequence charSequence11 = (CharSequence) obj;
                List list = this.$info.d;
                b0g0.a aVar = list == null ? (b0g0.a) list.get(0) : null;
                return new koo0(aVar != null ? aVar.b : null, charSequence3, charSequence5, charSequence4, charSequence11);
            }
            charSequence2 = (CharSequence) this.L$7;
            charSequence3 = (CharSequence) this.L$6;
            nohVar5 = (noh) this.L$5;
            b.b(obj);
            CharSequence charSequence82 = (CharSequence) obj;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = charSequence3;
            this.L$7 = charSequence2;
            this.L$8 = charSequence82;
            this.label = 4;
            k2 = nohVar5.k(this);
            if (k2 != coroutineSingletons) {
                charSequence4 = charSequence82;
                obj = k2;
                charSequence5 = charSequence2;
                CharSequence charSequence112 = (CharSequence) obj;
                List list2 = this.$info.d;
                if (list2 == null) {
                }
                return new koo0(aVar != null ? aVar.b : null, charSequence3, charSequence5, charSequence4, charSequence112);
            }
            return coroutineSingletons;
        }
        h = (noh) this.L$5;
        nohVar2 = (noh) this.L$4;
        nohVar = (noh) this.L$3;
        b.b(obj);
        CharSequence charSequence12 = (CharSequence) obj;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = nohVar2;
        this.L$5 = h;
        this.L$6 = charSequence12;
        this.label = 2;
        Object k3 = nohVar.k(this);
        if (k3 != coroutineSingletons) {
            noh nohVar6 = h;
            charSequence = charSequence12;
            obj = k3;
            nohVar3 = nohVar2;
            nohVar4 = nohVar6;
            CharSequence charSequence62 = (CharSequence) obj;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = nohVar4;
            this.L$6 = charSequence;
            this.L$7 = charSequence62;
            this.label = 3;
            k = nohVar3.k(this);
            if (k != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}
