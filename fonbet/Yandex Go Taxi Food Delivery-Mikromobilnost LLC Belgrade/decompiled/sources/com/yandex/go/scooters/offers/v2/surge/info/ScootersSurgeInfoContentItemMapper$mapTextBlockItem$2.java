package com.yandex.go.scooters.offers.v2.surge.info;

import defpackage.d3p0;
import defpackage.m7x0;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.w2p0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ld3p0;", "<anonymous>", "(Ltse;)Ld3p0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.offers.v2.surge.info.ScootersSurgeInfoContentItemMapper$mapTextBlockItem$2", f = "ScootersSurgeInfoContentItemMapper.kt", l = {80, 81}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersSurgeInfoContentItemMapper$mapTextBlockItem$2 extends SuspendLambda implements wls {
    final /* synthetic */ w2p0 $item;
    final /* synthetic */ boolean $lastSectionItem;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersSurgeInfoContentItemMapper$mapTextBlockItem$2(e eVar, w2p0 w2p0Var, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$item = w2p0Var;
        this.$lastSectionItem = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersSurgeInfoContentItemMapper$mapTextBlockItem$2 scootersSurgeInfoContentItemMapper$mapTextBlockItem$2 = new ScootersSurgeInfoContentItemMapper$mapTextBlockItem$2(this.this$0, this.$item, this.$lastSectionItem, continuation);
        scootersSurgeInfoContentItemMapper$mapTextBlockItem$2.L$0 = obj;
        return scootersSurgeInfoContentItemMapper$mapTextBlockItem$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersSurgeInfoContentItemMapper$mapTextBlockItem$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0075, code lost:
    
        if (r10 == r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        String a;
        String str;
        CharSequence charSequence;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            qoh h2 = tje.h(tseVar, null, null, new ScootersSurgeInfoContentItemMapper$mapTextBlockItem$2$title$1(this.$item, this.this$0, null), 3);
            h = tje.h(tseVar, null, null, new ScootersSurgeInfoContentItemMapper$mapTextBlockItem$2$subtitle$1(this.$item, this.this$0, null), 3);
            a = ((m7x0) this.this$0.a).a(this.$item.a);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h;
            this.L$3 = a;
            this.label = 1;
            obj = h2.s(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                charSequence = (CharSequence) this.L$4;
                str = (String) this.L$3;
                kotlin.b.b(obj);
                return new d3p0(charSequence, (CharSequence) obj, str, !this.$lastSectionItem);
            }
            a = (String) this.L$3;
            h = (noh) this.L$2;
            kotlin.b.b(obj);
        }
        CharSequence charSequence2 = (CharSequence) obj;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = a;
        this.L$4 = charSequence2;
        this.label = 2;
        Object k = h.k(this);
        if (k != coroutineSingletons) {
            str = a;
            charSequence = charSequence2;
            obj = k;
            return new d3p0(charSequence, (CharSequence) obj, str, !this.$lastSectionItem);
        }
        return coroutineSingletons;
    }
}
