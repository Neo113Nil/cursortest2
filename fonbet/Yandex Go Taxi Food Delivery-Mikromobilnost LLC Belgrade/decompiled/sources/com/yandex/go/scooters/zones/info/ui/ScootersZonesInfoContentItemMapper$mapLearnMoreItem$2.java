package com.yandex.go.scooters.zones.info.ui;

import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.o9p0;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.x9p0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lo9p0;", "<anonymous>", "(Ltse;)Lo9p0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.zones.info.ui.ScootersZonesInfoContentItemMapper$mapLearnMoreItem$2", f = "ScootersZonesInfoContentItemMapper.kt", l = {HProv.ALG_SID_SHA3_384, 80}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersZonesInfoContentItemMapper$mapLearnMoreItem$2 extends SuspendLambda implements wls {
    final /* synthetic */ x9p0 $scootersZonesInfoScreen;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersZonesInfoContentItemMapper$mapLearnMoreItem$2(x9p0 x9p0Var, c cVar, Continuation continuation) {
        super(2, continuation);
        this.$scootersZonesInfoScreen = x9p0Var;
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersZonesInfoContentItemMapper$mapLearnMoreItem$2 scootersZonesInfoContentItemMapper$mapLearnMoreItem$2 = new ScootersZonesInfoContentItemMapper$mapLearnMoreItem$2(this.$scootersZonesInfoScreen, this.this$0, continuation);
        scootersZonesInfoContentItemMapper$mapLearnMoreItem$2.L$0 = obj;
        return scootersZonesInfoContentItemMapper$mapLearnMoreItem$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersZonesInfoContentItemMapper$mapLearnMoreItem$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
    
        if (r10 == r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        CharSequence charSequence;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            qoh h2 = tje.h(tseVar, null, null, new ScootersZonesInfoContentItemMapper$mapLearnMoreItem$2$titleAsync$1(this.$scootersZonesInfoScreen, this.this$0, null), 3);
            h = tje.h(tseVar, null, null, new ScootersZonesInfoContentItemMapper$mapLearnMoreItem$2$subtitleAsync$1(this.$scootersZonesInfoScreen, this.this$0, null), 3);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h;
            this.label = 1;
            obj = h2.s(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                charSequence = (CharSequence) this.L$3;
                kotlin.b.b(obj);
                return new o9p0(charSequence, (CharSequence) obj);
            }
            h = (noh) this.L$2;
            kotlin.b.b(obj);
        }
        CharSequence charSequence2 = (CharSequence) obj;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = charSequence2;
        this.label = 2;
        Object k = h.k(this);
        if (k != coroutineSingletons) {
            charSequence = charSequence2;
            obj = k;
            return new o9p0(charSequence, (CharSequence) obj);
        }
        return coroutineSingletons;
    }
}
