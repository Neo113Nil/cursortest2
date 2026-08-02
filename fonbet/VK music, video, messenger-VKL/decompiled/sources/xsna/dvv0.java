package xsna;

import android.content.Intent;
import com.vk.superapp.base.js.bridge.VkUiPermissionsHandler;

/* compiled from: VkUiBaseCommand.kt */
/* loaded from: classes6.dex */
public abstract class dvv0 {
    public r6y b;
    public VkUiPermissionsHandler c;
    public tau0 d;

    public abstract void a(String str);

    public final io.reactivex.rxjava3.disposables.b b() {
        fvv0 M;
        gvv0 view;
        r6y r6yVar = this.b;
        if (r6yVar == null || (M = r6yVar.M()) == null || (view = M.getView()) == null) {
            return null;
        }
        return view.D6();
    }

    public void c(int i, int i2, Intent intent) {
    }
}
