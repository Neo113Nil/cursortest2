package com.yandex.go.scooters.qr.unavailable_scooter.ui;

import com.yandex.go.scooters.qr.unavailable_scooter.data.model.ScootersQrUnavailableScooterExperiment;
import defpackage.c6z;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.qqo0;
import defpackage.scc;
import defpackage.tje;
import defpackage.tqo0;
import defpackage.tse;
import defpackage.uqo0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Luqo0;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.qr.unavailable_scooter.ui.ScootersQrUnavailableScooterContentItemMapper$mapTitleAndDescriptionItemsFromExperiment$2", f = "ScootersQrUnavailableScooterContentItemMapper.kt", l = {60, 61}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersQrUnavailableScooterContentItemMapper$mapTitleAndDescriptionItemsFromExperiment$2 extends SuspendLambda implements wls {
    final /* synthetic */ ScootersQrUnavailableScooterExperiment.Content $content;
    final /* synthetic */ c6z $localizedExperiment;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersQrUnavailableScooterContentItemMapper$mapTitleAndDescriptionItemsFromExperiment$2(d dVar, ScootersQrUnavailableScooterExperiment.Content content, c6z c6zVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$content = content;
        this.$localizedExperiment = c6zVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersQrUnavailableScooterContentItemMapper$mapTitleAndDescriptionItemsFromExperiment$2 scootersQrUnavailableScooterContentItemMapper$mapTitleAndDescriptionItemsFromExperiment$2 = new ScootersQrUnavailableScooterContentItemMapper$mapTitleAndDescriptionItemsFromExperiment$2(this.this$0, this.$content, this.$localizedExperiment, continuation);
        scootersQrUnavailableScooterContentItemMapper$mapTitleAndDescriptionItemsFromExperiment$2.L$0 = obj;
        return scootersQrUnavailableScooterContentItemMapper$mapTitleAndDescriptionItemsFromExperiment$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersQrUnavailableScooterContentItemMapper$mapTitleAndDescriptionItemsFromExperiment$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        noh h;
        uqo0[] uqo0VarArr;
        int i;
        uqo0[] uqo0VarArr2;
        uqo0[] uqo0VarArr3;
        uqo0[] uqo0VarArr4;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        int i3 = 1;
        if (i2 == 0) {
            kotlin.b.b(obj);
            qoh h2 = tje.h(tseVar, null, null, new ScootersQrUnavailableScooterContentItemMapper$mapTitleAndDescriptionItemsFromExperiment$2$titleAsync$1(this.this$0, this.$content, this.$localizedExperiment, null), 3);
            h = tje.h(tseVar, null, null, new ScootersQrUnavailableScooterContentItemMapper$mapTitleAndDescriptionItemsFromExperiment$2$descriptionAsync$1(this.this$0, this.$content, this.$localizedExperiment, null), 3);
            uqo0VarArr = new uqo0[2];
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h;
            this.L$3 = uqo0VarArr;
            this.L$4 = uqo0VarArr;
            i = 0;
            this.I$0 = 0;
            this.label = 1;
            obj = h2.s(this);
            if (obj != coroutineSingletons) {
                uqo0VarArr2 = uqo0VarArr;
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i3 = this.I$0;
            uqo0VarArr3 = (uqo0[]) this.L$4;
            uqo0VarArr4 = (uqo0[]) this.L$3;
            kotlin.b.b(obj);
            uqo0VarArr3[i3] = new qqo0((CharSequence) obj);
            return scc.g(uqo0VarArr4);
        }
        i = this.I$0;
        uqo0[] uqo0VarArr5 = (uqo0[]) this.L$4;
        uqo0[] uqo0VarArr6 = (uqo0[]) this.L$3;
        h = (noh) this.L$2;
        kotlin.b.b(obj);
        uqo0VarArr2 = uqo0VarArr5;
        uqo0VarArr = uqo0VarArr6;
        uqo0VarArr2[i] = new tqo0((CharSequence) obj);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = uqo0VarArr;
        this.L$4 = uqo0VarArr;
        this.I$0 = 1;
        this.label = 2;
        obj = h.k(this);
        if (obj != coroutineSingletons) {
            uqo0VarArr3 = uqo0VarArr;
            uqo0VarArr4 = uqo0VarArr3;
            uqo0VarArr3[i3] = new qqo0((CharSequence) obj);
            return scc.g(uqo0VarArr4);
        }
        return coroutineSingletons;
    }
}
