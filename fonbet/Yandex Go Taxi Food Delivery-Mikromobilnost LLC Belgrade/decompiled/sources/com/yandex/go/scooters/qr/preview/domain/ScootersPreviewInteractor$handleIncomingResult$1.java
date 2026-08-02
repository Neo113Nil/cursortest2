package com.yandex.go.scooters.qr.preview.domain;

import defpackage.hmo0;
import defpackage.imo0;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r7p0;
import defpackage.rol0;
import defpackage.vpr;
import defpackage.wls;
import defpackage.xsn0;
import defpackage.zy11;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Ljmo0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.qr.preview.domain.ScootersPreviewInteractor$handleIncomingResult$1", f = "ScootersPreviewInteractor.kt", l = {HProv.ALG_SID_GR3410_12_256, 80, 83, 85}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPreviewInteractor$handleIncomingResult$1 extends SuspendLambda implements wls {
    final /* synthetic */ Set<r7p0> $addedNumbers;
    final /* synthetic */ xsn0 $current;
    final /* synthetic */ xsn0 $previous;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPreviewInteractor$handleIncomingResult$1(xsn0 xsn0Var, Set set, xsn0 xsn0Var2, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$previous = xsn0Var;
        this.$addedNumbers = set;
        this.$current = xsn0Var2;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersPreviewInteractor$handleIncomingResult$1 scootersPreviewInteractor$handleIncomingResult$1 = new ScootersPreviewInteractor$handleIncomingResult$1(this.$previous, this.$addedNumbers, this.$current, this.this$0, continuation);
        scootersPreviewInteractor$handleIncomingResult$1.L$0 = obj;
        return scootersPreviewInteractor$handleIncomingResult$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPreviewInteractor$handleIncomingResult$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0097, code lost:
    
        if (r1.emit(r3, r15) == r2) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b8, code lost:
    
        if (r1.emit(r3, r15) == r2) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d5 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            if (this.$previous != null || !kotlin.collections.a.G(this.$addedNumbers, this.$current.a())) {
                boolean l = jl40.l(this.$previous, this.$current);
                a aVar = this.this$0;
                if (l) {
                    xsn0 xsn0Var = this.$previous;
                    xsn0 xsn0Var2 = this.$current;
                    aVar.getClass();
                    if (xsn0Var2.b - xsn0Var.b > (xsn0Var.c ? 5000L : 1000L)) {
                        a aVar2 = this.this$0;
                        xsn0 xsn0Var3 = this.$current;
                        Set<r7p0> set = this.$addedNumbers;
                        aVar2.getClass();
                        imo0 imo0Var = new imo0(new rol0(new ScootersPreviewInteractor$getScootersPreviewStateFlow$1(aVar2, xsn0Var3, set, null)));
                        this.L$0 = vprVar;
                        this.label = 2;
                    }
                } else {
                    xsn0 xsn0Var4 = this.$current;
                    Set<r7p0> set2 = this.$addedNumbers;
                    aVar.getClass();
                    imo0 imo0Var2 = new imo0(new rol0(new ScootersPreviewInteractor$getScootersPreviewStateFlow$1(aVar, xsn0Var4, set2, null)));
                    this.L$0 = vprVar;
                    this.label = 3;
                }
                return zy11Var;
            }
            this.L$0 = null;
            this.label = 1;
            if (vprVar.emit(hmo0.a, this) != coroutineSingletons) {
                return zy11Var;
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            kotlin.b.b(obj);
            return zy11Var;
        }
        if (i != 2 && i != 3) {
            if (i == 4) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        a aVar3 = this.this$0;
        xsn0 xsn0Var5 = this.$current;
        aVar3.getClass();
        long j = xsn0Var5.c ? 5000L : 1000L;
        this.L$0 = null;
        this.label = 4;
        if (a.a(aVar3, vprVar, j, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
    }
}
