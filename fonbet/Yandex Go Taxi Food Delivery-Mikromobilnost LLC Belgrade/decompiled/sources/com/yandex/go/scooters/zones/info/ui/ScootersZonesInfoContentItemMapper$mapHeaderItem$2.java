package com.yandex.go.scooters.zones.info.ui;

import defpackage.m7x0;
import defpackage.m9p0;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lm9p0;", "<anonymous>", "(Ltse;)Lm9p0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.zones.info.ui.ScootersZonesInfoContentItemMapper$mapHeaderItem$2", f = "ScootersZonesInfoContentItemMapper.kt", l = {35, 36}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersZonesInfoContentItemMapper$mapHeaderItem$2 extends SuspendLambda implements wls {
    final /* synthetic */ x9p0 $scootersZonesInfoScreen;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersZonesInfoContentItemMapper$mapHeaderItem$2(x9p0 x9p0Var, c cVar, Continuation continuation) {
        super(2, continuation);
        this.$scootersZonesInfoScreen = x9p0Var;
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersZonesInfoContentItemMapper$mapHeaderItem$2 scootersZonesInfoContentItemMapper$mapHeaderItem$2 = new ScootersZonesInfoContentItemMapper$mapHeaderItem$2(this.$scootersZonesInfoScreen, this.this$0, continuation);
        scootersZonesInfoContentItemMapper$mapHeaderItem$2.L$0 = obj;
        return scootersZonesInfoContentItemMapper$mapHeaderItem$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersZonesInfoContentItemMapper$mapHeaderItem$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0083, code lost:
    
        if (r10 == r1) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        String str;
        String str2;
        CharSequence charSequence;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            qoh h2 = tje.h(tseVar, null, null, new ScootersZonesInfoContentItemMapper$mapHeaderItem$2$nameAsync$1(this.$scootersZonesInfoScreen, this.this$0, null), 3);
            h = tje.h(tseVar, null, null, new ScootersZonesInfoContentItemMapper$mapHeaderItem$2$descriptionAsync$1(this.$scootersZonesInfoScreen, this.this$0, null), 3);
            if (this.$scootersZonesInfoScreen.c.length() > 0) {
                str = ((m7x0) this.this$0.a).a(this.$scootersZonesInfoScreen.c);
            } else {
                str = "";
            }
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h;
            this.L$3 = str;
            this.label = 1;
            obj = h2.s(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                charSequence = (CharSequence) this.L$4;
                str2 = (String) this.L$3;
                kotlin.b.b(obj);
                return new m9p0(charSequence, (CharSequence) obj, str2);
            }
            str = (String) this.L$3;
            h = (noh) this.L$2;
            kotlin.b.b(obj);
        }
        CharSequence charSequence2 = (CharSequence) obj;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = str;
        this.L$4 = charSequence2;
        this.label = 2;
        Object k = h.k(this);
        if (k != coroutineSingletons) {
            str2 = str;
            charSequence = charSequence2;
            obj = k;
            return new m9p0(charSequence, (CharSequence) obj, str2);
        }
        return coroutineSingletons;
    }
}
