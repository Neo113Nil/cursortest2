package defpackage;

import android.app.Application;
import android.content.Context;
import com.fluttercandies.photo_manager.core.entity.PermissionResult;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class iya0 extends lya0 {
    @Override // defpackage.lya0
    public final PermissionResult a(Application application, int i) {
        boolean z = false;
        boolean z2 = (i & 2) == 2;
        boolean z3 = (i & 1) == 1;
        boolean z4 = (i & 4) == 4;
        boolean d = z3 ? lya0.d(application, "android.permission.READ_MEDIA_IMAGES") : true;
        if (z2) {
            d = d && lya0.d(application, "android.permission.READ_MEDIA_VIDEO");
        }
        if (!z4) {
            z = d;
        } else if (d && lya0.d(application, "android.permission.READ_MEDIA_AUDIO")) {
            z = true;
        }
        return z ? PermissionResult.Authorized : PermissionResult.Denied;
    }

    @Override // defpackage.lya0
    public final boolean c(Context context) {
        return lya0.d(context, "android.permission.ACCESS_MEDIA_LOCATION");
    }

    @Override // defpackage.lya0
    public final void g(t0b0 t0b0Var, Context context, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        boolean z2 = (i & 1) == 1;
        boolean z3 = (i & 2) == 2;
        boolean z4 = (i & 4) == 4;
        if (z2 || z3) {
            arrayList.add("android.permission.READ_MEDIA_IMAGES");
            arrayList.add("android.permission.READ_MEDIA_VIDEO");
        }
        if (z4) {
            arrayList.add("android.permission.READ_MEDIA_AUDIO");
        }
        if (z) {
            arrayList.add("android.permission.ACCESS_MEDIA_LOCATION");
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        if (!e(context, (String[]) Arrays.copyOf(strArr, strArr.length))) {
            lya0.h(t0b0Var, arrayList, 3001);
            return;
        }
        m0b0 m0b0Var = t0b0Var.g;
        if (m0b0Var != null) {
            m0b0Var.f();
        }
    }
}
