package com.yandex.go.location.provider;

import defpackage.bvf0;
import defpackage.iwc;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.x6f0;
import defpackage.y6f0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.location.provider.CompassProviderImpl$interpolateForUi$1$1$1", f = "CompassProviderImpl.kt", l = {496, 506, 518, 519}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class CompassProviderImpl$interpolateForUi$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ y6f0 $$this$channelFlow;
    final /* synthetic */ Ref$LongRef $currentAzimuth;
    final /* synthetic */ long $targetAzimuth;
    float F$0;
    float F$1;
    float F$2;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompassProviderImpl$interpolateForUi$1$1$1(Ref$LongRef ref$LongRef, long j, y6f0 y6f0Var, Continuation continuation) {
        super(2, continuation);
        this.$currentAzimuth = ref$LongRef;
        this.$targetAzimuth = j;
        this.$$this$channelFlow = y6f0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CompassProviderImpl$interpolateForUi$1$1$1 compassProviderImpl$interpolateForUi$1$1$1 = new CompassProviderImpl$interpolateForUi$1$1$1(this.$currentAzimuth, this.$targetAzimuth, this.$$this$channelFlow, continuation);
        compassProviderImpl$interpolateForUi$1$1$1.L$0 = obj;
        return compassProviderImpl$interpolateForUi$1$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CompassProviderImpl$interpolateForUi$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x013c, code lost:
    
        if (((defpackage.x6f0) r5).y.o(r6, r24) == r2) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x014f, code lost:
    
        if (kotlinx.coroutines.a.i(20, r24) == r2) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0068, code lost:
    
        if (((r12 & 4611686018427387904L) != 0) != ((r24.$targetAzimuth & 4611686018427387904L) != 0)) goto L64;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x014f -> B:8:0x0152). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        long j2;
        float f;
        float f2;
        float f3;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        Object obj2 = null;
        long j3 = 0;
        boolean z = true;
        if (i == 0) {
            kotlin.b.b(obj);
            Ref$LongRef ref$LongRef = this.$currentAzimuth;
            j = 4611686018427387904L;
            long j4 = ref$LongRef.element;
            if ((j4 & Long.MIN_VALUE) != 0) {
            }
            long j5 = this.$targetAzimuth;
            ref$LongRef.element = j5;
            y6f0 y6f0Var = this.$$this$channelFlow;
            iwc iwcVar = new iwc(j5);
            this.L$0 = null;
            this.label = 1;
            return ((x6f0) y6f0Var).y.o(iwcVar, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
        }
        if (i == 1) {
            kotlin.b.b(obj);
            return zy11Var;
        }
        if (i == 2) {
            kotlin.b.b(obj);
            return zy11Var;
        }
        if (i != 3) {
            if (i != 4) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            j2 = 0;
            j = 4611686018427387904L;
            j3 = j2;
            obj2 = null;
            z = true;
            if (bvf0.D(tseVar)) {
                f = Float.intBitsToFloat((int) (this.$targetAzimuth & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - Float.intBitsToFloat((int) (this.$currentAzimuth.element & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                if (Math.abs(f) < 0.25f) {
                    Ref$LongRef ref$LongRef2 = this.$currentAzimuth;
                    long j6 = this.$targetAzimuth;
                    ref$LongRef2.element = j6;
                    y6f0 y6f0Var2 = this.$$this$channelFlow;
                    iwc iwcVar2 = new iwc(j6);
                    this.L$0 = obj2;
                    this.F$0 = f;
                    this.label = 2;
                    if (((x6f0) y6f0Var2).y.o(iwcVar2, this) == coroutineSingletons) {
                    }
                } else {
                    float f4 = (f + 180.0f) % 360.0f;
                    if (f4 != 0.0f && Math.signum(f4) != Math.signum(360.0f)) {
                        f4 += 360.0f;
                    }
                    f2 = f4 - 180.0f;
                    f3 = Float.intBitsToFloat((int) (this.$currentAzimuth.element & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) + (0.15f * f2);
                    Ref$LongRef ref$LongRef3 = this.$currentAzimuth;
                    float f5 = f3 % 360.0f;
                    if (f5 != 0.0f && Math.signum(f5) != Math.signum(360.0f)) {
                        f5 += 360.0f;
                    }
                    j2 = j3;
                    ref$LongRef3.element = (Float.floatToRawIntBits(f5) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (((this.$targetAzimuth & j) > j2 ? 1 : ((this.$targetAzimuth & j) == j2 ? 0 : -1)) != 0 ? z : false ? j : j2) | Long.MIN_VALUE;
                    y6f0 y6f0Var3 = this.$$this$channelFlow;
                    iwc iwcVar3 = new iwc(this.$currentAzimuth.element);
                    this.L$0 = tseVar;
                    this.F$0 = f;
                    this.F$1 = f2;
                    this.F$2 = f3;
                    this.label = 3;
                }
            }
        }
        f3 = this.F$2;
        f2 = this.F$1;
        f = this.F$0;
        kotlin.b.b(obj);
        j2 = 0;
        j = 4611686018427387904L;
        this.L$0 = tseVar;
        this.F$0 = f;
        this.F$1 = f2;
        this.F$2 = f3;
        this.label = 4;
    }
}
