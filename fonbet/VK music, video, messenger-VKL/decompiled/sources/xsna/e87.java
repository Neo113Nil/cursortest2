package xsna;

import android.graphics.Bitmap;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: BiometricsLockSecuritySetupFragment.kt */
/* loaded from: classes15.dex */
public final /* synthetic */ class e87 extends AdaptedFunctionReference implements izs {
    public final /* synthetic */ int b = 1;

    public /* synthetic */ e87(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(i, obj, cls, str, str2, i2);
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((com.vk.biometrics.lock.impl.presentation.base.mvi.setup.b) this.receiver).C((com.vk.biometrics.lock.impl.presentation.base.mvi.setup.a) obj);
                break;
            default:
                lh9.d((lh9) this.receiver, (Bitmap) obj);
                break;
        }
        return s3q0.a;
    }

    public e87(vk50 vk50Var) {
        super(1, vk50Var, com.vk.biometrics.lock.impl.presentation.base.mvi.setup.b.class, "sendAction", "sendAction([Lcom/vk/mvi/core/data/MviAction;)V", 0);
    }
}
