package xsna;

import android.content.Intent;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* compiled from: BiometricsLockRouterImpl.kt */
@b6l(c = "com.vk.biometrics.lock.impl.router.BiometricsLockRouterImpl$getFingerprintEnrollIntent$1", f = "BiometricsLockRouterImpl.kt", l = {62, 63}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class c87 extends RestrictedSuspendLambda implements wzs<ali0<? super Intent>, spj<? super s3q0>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    public c87() {
        super(2, null);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        c87 c87Var = new c87(2, spjVar);
        c87Var.L$0 = obj;
        return c87Var;
    }

    @Override // xsna.wzs
    public final Object invoke(ali0<? super Intent> ali0Var, spj<? super s3q0> spjVar) {
        return ((c87) create(ali0Var, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        if (r0.a(r6, r5) == r1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (r0.a(r6, r5) == r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ali0 ali0Var = (ali0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            Intent intent = new Intent("android.settings.FINGERPRINT_ENROLL");
            this.L$0 = ali0Var;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return s3q0.a;
            }
            kotlin.a.a(obj);
        }
        Intent intent2 = new Intent("com.android.settings.fingerprint.FingerprintMainSettings");
        this.L$0 = null;
        this.label = 2;
    }
}
