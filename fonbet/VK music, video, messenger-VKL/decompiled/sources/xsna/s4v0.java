package xsna;

import com.vk.music.mixsettings.MixSettingsEntity;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.p4v0;

/* compiled from: VkMixSettingsInteractorImpl.kt */
/* loaded from: classes.dex */
public final class s4v0 implements q4v0 {
    public final t4v0 a;

    public s4v0(t4v0 t4v0Var) {
        this.a = t4v0Var;
    }

    @Override // xsna.q4v0
    public final io.reactivex.rxjava3.internal.operators.single.y a(String str, String str2) {
        return this.a.b(str, false).l(new khc0(new l8b0(str2), 14));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // xsna.q4v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, ContinuationImpl continuationImpl) {
        r4v0 r4v0Var;
        int i;
        try {
            if (continuationImpl instanceof r4v0) {
                r4v0Var = (r4v0) continuationImpl;
                int i2 = r4v0Var.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    r4v0Var.label = i2 - Integer.MIN_VALUE;
                    Object obj = r4v0Var.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = r4v0Var.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        t4v0 t4v0Var = this.a;
                        r4v0Var.L$0 = null;
                        r4v0Var.L$1 = str2;
                        r4v0Var.L$2 = null;
                        r4v0Var.I$0 = 0;
                        r4v0Var.label = 1;
                        obj = t4v0Var.a(str, r4v0Var);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str2 = (String) r4v0Var.L$1;
                        kotlin.a.a(obj);
                    }
                    MixSettingsEntity mixSettingsEntity = (MixSettingsEntity) obj;
                    mixSettingsEntity.f();
                    p4v0.a.b(mixSettingsEntity, str2);
                    return mixSettingsEntity;
                }
            }
            if (i != 0) {
            }
            MixSettingsEntity mixSettingsEntity2 = (MixSettingsEntity) obj;
            mixSettingsEntity2.f();
            p4v0.a.b(mixSettingsEntity2, str2);
            return mixSettingsEntity2;
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
        r4v0Var = new r4v0(this, continuationImpl);
        Object obj2 = r4v0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = r4v0Var.label;
    }
}
