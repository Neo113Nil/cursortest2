package xsna;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.vk.biometrics.lock.impl.presentation.view.BiometricsPinLockActivity;
import com.vk.toggle.features.CoreFeatures;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: SetupOverlayMenuTaskLogic.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class b4j0 extends FunctionReferenceImpl implements yzs {
    public final /* synthetic */ int b = 0;

    public b4j0(c4j0 c4j0Var) {
        super(3, c4j0Var, c4j0.class, "isButtonVisible", "isButtonVisible(Landroid/app/Activity;ILandroidx/fragment/app/Fragment;)Z", 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
    
        if (xsna.p1p0.a(r4.i(r5)) != false) goto L23;
     */
    @Override // xsna.yzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                Activity activity = (Activity) obj;
                int intValue = ((Number) obj2).intValue();
                Fragment fragment = (Fragment) obj3;
                c4j0 c4j0Var = (c4j0) this.receiver;
                c4j0Var.getClass();
                boolean z = true;
                if ((intValue != 2 || fragment == null || !drm0.D(fragment.getClass().getSimpleName(), "video", true)) && !(activity instanceof BiometricsPinLockActivity) && c4j0Var.e()) {
                    com.vk.toggle.b bVar = com.vk.toggle.b.A;
                    CoreFeatures coreFeatures = CoreFeatures.OVERLAY_MENU;
                    if (bVar.i(coreFeatures) != null) {
                        break;
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            default:
                return Boolean.valueOf(tim0.e((tim0) this.receiver, ((Number) obj).intValue(), ((Number) obj2).intValue(), (CharSequence) obj3));
        }
    }
}
