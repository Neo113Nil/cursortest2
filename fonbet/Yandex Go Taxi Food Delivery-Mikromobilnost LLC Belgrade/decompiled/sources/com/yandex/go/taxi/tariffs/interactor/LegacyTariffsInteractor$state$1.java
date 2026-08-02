package com.yandex.go.taxi.tariffs.interactor;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.qsx0;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lrsx0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.tariffs.interactor.LegacyTariffsInteractor$state$1", f = "LegacyTariffsInteractor.kt", l = {46, 47}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class LegacyTariffsInteractor$state$1 extends SuspendLambda implements wls {
    final /* synthetic */ zzs $geoPointWithFallback;
    final /* synthetic */ String $zoneNameWithFallback;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ s this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyTariffsInteractor$state$1(s sVar, String str, zzs zzsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = sVar;
        this.$zoneNameWithFallback = str;
        this.$geoPointWithFallback = zzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LegacyTariffsInteractor$state$1 legacyTariffsInteractor$state$1 = new LegacyTariffsInteractor$state$1(this.this$0, this.$zoneNameWithFallback, this.$geoPointWithFallback, continuation);
        legacyTariffsInteractor$state$1.L$0 = obj;
        return legacyTariffsInteractor$state$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LegacyTariffsInteractor$state$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        if (r0.emit(r2, r7) == r1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (r8 == r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            s sVar = this.this$0;
            String str = this.$zoneNameWithFallback;
            zzs zzsVar = this.$geoPointWithFallback;
            this.L$0 = vprVar;
            this.label = 1;
            obj = s.a(sVar, str, zzsVar, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        qsx0 qsx0Var = new qsx0((String) obj);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }
}
