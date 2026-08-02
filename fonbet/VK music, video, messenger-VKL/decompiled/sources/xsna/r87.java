package xsna;

import com.vk.biometrics.lock.impl.presentation.base.mvi.settings.BiometricsLockSettingsFragment;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: BiometricsLockSettingsFragment.kt */
@b6l(c = "com.vk.biometrics.lock.impl.presentation.base.mvi.settings.BiometricsLockSettingsFragment$onBindViewState$2$1", f = "BiometricsLockSettingsFragment.kt", l = {184}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class r87 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ String $snackbarText;
    int label;
    final /* synthetic */ BiometricsLockSettingsFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r87(BiometricsLockSettingsFragment biometricsLockSettingsFragment, String str, spj<? super r87> spjVar) {
        super(2, spjVar);
        this.this$0 = biometricsLockSettingsFragment;
        this.$snackbarText = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new r87(this.this$0, this.$snackbarText, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((r87) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            BiometricsLockSettingsFragment biometricsLockSettingsFragment = this.this$0;
            int i2 = BiometricsLockSettingsFragment.Y;
            dlv0 dlv0Var = (dlv0) biometricsLockSettingsFragment.V.getValue();
            String str = this.$snackbarText;
            this.label = 1;
            if (dlv0.d(dlv0Var, str, null, this, 30) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
