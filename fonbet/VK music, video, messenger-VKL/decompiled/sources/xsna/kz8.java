package xsna;

import android.content.Context;
import android.view.View;
import com.vk.camera.editor.common.cadre.CadreTarget;

/* compiled from: CadreUtil.kt */
/* loaded from: classes16.dex */
public interface kz8 {
    static /* synthetic */ iz8 b(kz8 kz8Var, View view, boolean z, CadreTarget cadreTarget, int i) {
        if ((i & 2) != 0) {
            z = kz8Var.a(view.getContext());
        }
        if ((i & 4) != 0) {
            cadreTarget = CadreTarget.VIEWER;
        }
        return kz8Var.d(view, z, cadreTarget, false);
    }

    boolean a(Context context);

    hz8 c(iz8 iz8Var);

    iz8 d(View view, boolean z, CadreTarget cadreTarget, boolean z2);
}
