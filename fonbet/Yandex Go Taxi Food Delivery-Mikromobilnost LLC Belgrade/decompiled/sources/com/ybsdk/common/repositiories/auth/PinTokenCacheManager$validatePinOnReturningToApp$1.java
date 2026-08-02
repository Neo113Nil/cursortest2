package com.ybsdk.common.repositiories.auth;

import android.os.SystemClock;
import com.ybsdk.rconfig.PinConfig;
import defpackage.dnz0;
import defpackage.lzq0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.vp7;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.common.repositiories.auth.PinTokenCacheManager$validatePinOnReturningToApp$1", f = "PinTokenCacheManager.kt", l = {45, 47, 48, 56}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PinTokenCacheManager$validatePinOnReturningToApp$1 extends SuspendLambda implements wls {
    final /* synthetic */ com.ybsdk.common.e $sdkStateDispatcher;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinTokenCacheManager$validatePinOnReturningToApp$1(g gVar, com.ybsdk.common.e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$sdkStateDispatcher = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PinTokenCacheManager$validatePinOnReturningToApp$1(this.this$0, this.$sdkStateDispatcher, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PinTokenCacheManager$validatePinOnReturningToApp$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if (r8.h(r7) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00c0, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        if (r8.emit(r1, r7) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00be, code lost:
    
        if (r8.emit(r1, r7) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003c, code lost:
    
        if (r8 == r0) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Long l;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (!this.this$0.b()) {
                com.ybsdk.feature.pinstorage.internal.data.c cVar = this.this$0.d;
                this.label = 1;
                obj = cVar.l(this);
            }
            l = ((dnz0) this.this$0.f.getAndUpdate(new vp7(6))).b;
            if (l != null) {
                g gVar = this.this$0;
                long longValue = l.longValue();
                com.ybsdk.rconfig.b bVar = gVar.b;
                if (TimeUnit.SECONDS.toMillis(((PinConfig) bVar.d(bVar.i.c).getData()).getValidTimeSeconds()) + longValue <= SystemClock.elapsedRealtime()) {
                    gVar.e.a(false);
                    n0 n0Var = gVar.g;
                    lzq0 lzq0Var = new lzq0(false);
                    this.label = 4;
                }
            }
            return zy11.a;
        }
        if (i == 1) {
            kotlin.b.b(obj);
        } else {
            if (i != 2) {
                if (i == 3 || i == 4) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            com.ybsdk.common.e eVar = this.$sdkStateDispatcher;
            this.label = 3;
        }
        if (((Boolean) obj).booleanValue()) {
            this.this$0.e.a(true);
            n0 n0Var2 = this.this$0.g;
            lzq0 lzq0Var2 = new lzq0(true);
            this.label = 2;
        }
        l = ((dnz0) this.this$0.f.getAndUpdate(new vp7(6))).b;
        if (l != null) {
        }
        return zy11.a;
    }
}
