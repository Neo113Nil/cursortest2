package xsna;

import com.vk.api.generated.audio.dto.AudioGetStreamMixSettingsResponseDto;
import com.vk.api.generated.audio.dto.AudioStreamMixSettingsDto;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: VkMixSettingsRepositoryImpl.kt */
/* loaded from: classes.dex */
public final class v4v0 implements t4v0 {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.t4v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        u4v0 u4v0Var;
        int i;
        AudioStreamMixSettingsDto d;
        if (continuationImpl instanceof u4v0) {
            u4v0Var = (u4v0) continuationImpl;
            int i2 = u4v0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u4v0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = u4v0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = u4v0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    iz2 A = yfb.A(k840.b.D(Boolean.FALSE, str));
                    u4v0Var.L$0 = null;
                    u4v0Var.Z$0 = false;
                    u4v0Var.label = 1;
                    obj = evj.p(A, u4v0Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                d = ((AudioGetStreamMixSettingsResponseDto) obj).d();
                if (d == null) {
                    return p4v0.a(d);
                }
                throw new NullPointerException("AudioStreamMixSettingsDto is null");
            }
        }
        u4v0Var = new u4v0(this, continuationImpl);
        Object obj2 = u4v0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = u4v0Var.label;
        if (i != 0) {
        }
        d = ((AudioGetStreamMixSettingsResponseDto) obj2).d();
        if (d == null) {
        }
    }

    @Override // xsna.t4v0
    public final io.reactivex.rxjava3.internal.operators.single.y b(String str, boolean z) {
        return rsg0.w0(yfb.x(k840.b.D(Boolean.valueOf(z), str))).l(new hkc0(new wss0(this, 4), 11));
    }
}
