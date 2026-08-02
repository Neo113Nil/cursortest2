package com.yandex.go.taxi.tariffs.interactor;

import defpackage.al50;
import defpackage.avj0;
import defpackage.evu0;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.psx0;
import defpackage.s8o;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zuj0;
import defpackage.zy11;
import defpackage.zzs;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Lrsx0;", "", "error", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.tariffs.interactor.LegacyTariffsInteractor$state$2", f = "LegacyTariffsInteractor.kt", l = {52, 59}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class LegacyTariffsInteractor$state$2 extends SuspendLambda implements zls {
    final /* synthetic */ zzs $geoPointWithFallback;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ s this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyTariffsInteractor$state$2(s sVar, zzs zzsVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = sVar;
        this.$geoPointWithFallback = zzsVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LegacyTariffsInteractor$state$2 legacyTariffsInteractor$state$2 = new LegacyTariffsInteractor$state$2(this.this$0, this.$geoPointWithFallback, (Continuation) obj3);
        legacyTariffsInteractor$state$2.L$0 = (vpr) obj;
        legacyTariffsInteractor$state$2.L$1 = (Throwable) obj2;
        return legacyTariffsInteractor$state$2.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0092, code lost:
    
        if (r0.emit(r1, r7) != r2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0094, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0041, code lost:
    
        if (r8 == r2) goto L28;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String h;
        vpr vprVar = (vpr) this.L$0;
        Throwable th = (Throwable) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            boolean C = s8o.C(th);
            s sVar = this.this$0;
            if (C) {
                com.yandex.go.taxi.tariffs.repository.d dVar = sVar.d;
                zzs zzsVar = this.$geoPointWithFallback;
                this.L$0 = vprVar;
                this.L$1 = null;
                this.label = 1;
                obj = dVar.a(zzsVar, this);
            } else {
                h = ((avj0) sVar.e).h(kyh0.common_server_error);
                psx0 psx0Var = new psx0(h);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 2;
            }
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
        al50 al50Var = (al50) obj;
        zuj0 zuj0Var = this.this$0.e;
        String str = al50Var != null ? al50Var.a : null;
        h = (str == null || evu0.J(str)) ? ((avj0) zuj0Var).h(kyh0.error_occurred) : String.format(((avj0) zuj0Var).h(kyh0.address_region_not_supported), Arrays.copyOf(new Object[]{str}, 1));
        psx0 psx0Var2 = new psx0(h);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 2;
    }
}
