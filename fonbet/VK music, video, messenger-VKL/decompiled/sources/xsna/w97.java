package xsna;

import android.util.Log;
import androidx.fragment.app.FragmentManager;
import com.vk.core.exceptions.DisposableException;
import com.vk.photos.ui.editalbum.domain.e;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class w97 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w97(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                FragmentManager fragmentManager = ((e57) this.c).a;
                if (fragmentManager != null) {
                    q47 q47Var = (q47) fragmentManager.H("androidx.biometric.BiometricFragment");
                    if (q47Var != null) {
                        q47Var.tn(3);
                        break;
                    } else {
                        Log.e("BiometricPromptCompat", "Unable to cancel authentication. BiometricFragment not found.");
                        break;
                    }
                } else {
                    Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
                    break;
                }
            case 1:
                ((com.vk.photos.ui.editalbum.domain.c) this.c).T(e.b.b);
                break;
            case 2:
                iq50 iq50Var = (iq50) this.c;
                iq50Var.f = false;
                iq50Var.a.i0.c1(false);
                break;
            case 3:
                yp80 yp80Var = (yp80) this.c;
                if (yp80Var != null) {
                    yp80Var.onError(new DisposableException());
                    break;
                }
                break;
            default:
                p1m0 p1m0Var = (p1m0) this.c;
                p1m0Var.d();
                p1m0Var.a();
                break;
        }
    }
}
