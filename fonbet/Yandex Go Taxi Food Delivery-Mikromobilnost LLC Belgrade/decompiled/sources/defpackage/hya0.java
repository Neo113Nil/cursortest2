package defpackage;

import android.app.Application;
import android.content.Context;
import com.fluttercandies.photo_manager.core.entity.PermissionResult;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class hya0 extends lya0 {
    @Override // defpackage.lya0
    public final PermissionResult a(Application application, int i) {
        return e(application, "android.permission.READ_EXTERNAL_STORAGE") ? PermissionResult.Authorized : PermissionResult.Denied;
    }

    @Override // defpackage.lya0
    public final boolean c(Context context) {
        return lya0.d(context, "android.permission.ACCESS_MEDIA_LOCATION");
    }

    @Override // defpackage.lya0
    public final void g(t0b0 t0b0Var, Context context, int i, boolean z) {
        ArrayList i2 = scc.i("android.permission.READ_EXTERNAL_STORAGE");
        if (z) {
            i2.add("android.permission.ACCESS_MEDIA_LOCATION");
        }
        String[] strArr = (String[]) i2.toArray(new String[0]);
        if (!e(context, (String[]) Arrays.copyOf(strArr, strArr.length))) {
            lya0.h(t0b0Var, i2, 3001);
            return;
        }
        m0b0 m0b0Var = t0b0Var.g;
        if (m0b0Var != null) {
            m0b0Var.f();
        }
    }
}
