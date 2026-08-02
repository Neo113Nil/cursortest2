package com.yandex.go.scooters.offers.v2.surge.info;

import com.yandex.passport.sloth.ui.dependencies.m;
import defpackage.b3p0;
import defpackage.m7x0;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.q5z;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.y2p0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lb3p0;", "<anonymous>", "(Ltse;)Lb3p0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.offers.v2.surge.info.ScootersSurgeInfoContentItemMapper$mapHeaderItem$2", f = "ScootersSurgeInfoContentItemMapper.kt", l = {29, 30}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersSurgeInfoContentItemMapper$mapHeaderItem$2 extends SuspendLambda implements wls {
    final /* synthetic */ y2p0 $scootersSurge;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersSurgeInfoContentItemMapper$mapHeaderItem$2(e eVar, y2p0 y2p0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$scootersSurge = y2p0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersSurgeInfoContentItemMapper$mapHeaderItem$2 scootersSurgeInfoContentItemMapper$mapHeaderItem$2 = new ScootersSurgeInfoContentItemMapper$mapHeaderItem$2(this.this$0, this.$scootersSurge, continuation);
        scootersSurgeInfoContentItemMapper$mapHeaderItem$2.L$0 = obj;
        return scootersSurgeInfoContentItemMapper$mapHeaderItem$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersSurgeInfoContentItemMapper$mapHeaderItem$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String a;
        noh nohVar;
        Integer num;
        CharSequence charSequence;
        String str;
        Integer num2;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            qoh h = tje.h(tseVar, null, null, new ScootersSurgeInfoContentItemMapper$mapHeaderItem$2$title$1(this.this$0, this.$scootersSurge, null), 3);
            qoh h2 = tje.h(tseVar, null, null, new ScootersSurgeInfoContentItemMapper$mapHeaderItem$2$description$1(this.this$0, this.$scootersSurge, null), 3);
            a = ((m7x0) this.this$0.a).a((String) this.$scootersSurge.g.a);
            Integer S = q5z.S((String) this.$scootersSurge.g.b);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h2;
            this.L$3 = a;
            this.L$4 = S;
            this.label = 1;
            obj = h.s(this);
            if (obj != coroutineSingletons) {
                nohVar = h2;
                num = S;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            CharSequence charSequence2 = (CharSequence) this.L$5;
            Integer num3 = (Integer) this.L$4;
            String str2 = (String) this.L$3;
            kotlin.b.b(obj);
            num2 = num3;
            str = str2;
            charSequence = charSequence2;
            m mVar = this.$scootersSurge.g;
            return new b3p0(str, num2, charSequence, (CharSequence) obj, (String) mVar.g, (String) mVar.h);
        }
        num = (Integer) this.L$4;
        a = (String) this.L$3;
        nohVar = (noh) this.L$2;
        kotlin.b.b(obj);
        CharSequence charSequence3 = (CharSequence) obj;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = a;
        this.L$4 = num;
        this.L$5 = charSequence3;
        this.label = 2;
        Object k = nohVar.k(this);
        if (k != coroutineSingletons) {
            charSequence = charSequence3;
            obj = k;
            str = a;
            num2 = num;
            m mVar2 = this.$scootersSurge.g;
            return new b3p0(str, num2, charSequence, (CharSequence) obj, (String) mVar2.g, (String) mVar2.h);
        }
        return coroutineSingletons;
    }
}
