package com.yandex.go.navigator.favorites.building_card;

import com.yandex.go.address.models.Address;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.bt6;
import defpackage.ct6;
import defpackage.mdh;
import defpackage.ms6;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lms6;", "<anonymous>", "(Ltse;)Lms6;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.favorites.building_card.BuildingCardUiStateInteractor$createContentState$2", f = "BuildingCardUiStateInteractor.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE, 56}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class BuildingCardUiStateInteractor$createContentState$2 extends SuspendLambda implements wls {
    final /* synthetic */ ct6 $buildingInfo;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ bt6 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuildingCardUiStateInteractor$createContentState$2(bt6 bt6Var, ct6 ct6Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bt6Var;
        this.$buildingInfo = ct6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BuildingCardUiStateInteractor$createContentState$2 buildingCardUiStateInteractor$createContentState$2 = new BuildingCardUiStateInteractor$createContentState$2(this.this$0, this.$buildingInfo, continuation);
        buildingCardUiStateInteractor$createContentState$2.L$0 = obj;
        return buildingCardUiStateInteractor$createContentState$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BuildingCardUiStateInteractor$createContentState$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0076, code lost:
    
        if (r10 == r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        String str;
        String str2;
        String str3;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            qoh h2 = tje.h(tseVar, null, null, new BuildingCardUiStateInteractor$createContentState$2$etaAndDistanceDeferred$1(this.this$0, this.$buildingInfo, null), 3);
            this.this$0.e.getClass();
            sjh sjhVar = uyj.a;
            h = tje.h(tseVar, mdh.b, null, new BuildingCardUiStateInteractor$createContentState$2$addressDeferred$1(this.this$0, this.$buildingInfo, null), 2);
            str = this.$buildingInfo.b;
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
                str3 = (String) this.L$4;
                str2 = (String) this.L$3;
                b.b(obj);
                return new ms6(str2, str3, (Address) obj);
            }
            str = (String) this.L$3;
            h = (noh) this.L$2;
            b.b(obj);
        }
        String str4 = (String) obj;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = str;
        this.L$4 = str4;
        this.label = 2;
        Object k = h.k(this);
        if (k != coroutineSingletons) {
            str2 = str;
            str3 = str4;
            obj = k;
            return new ms6(str2, str3, (Address) obj);
        }
        return coroutineSingletons;
    }
}
