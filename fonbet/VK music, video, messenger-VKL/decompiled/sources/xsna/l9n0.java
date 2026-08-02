package xsna;

import android.app.AlertDialog;
import android.content.Context;
import com.vk.location.common.LocationCommon;
import com.vkontakte.android.R;

/* compiled from: SuperAppLocationImpl.kt */
/* loaded from: classes6.dex */
public final class l9n0 implements k9n0 {
    @Override // xsna.k9n0
    public final void a(Context context, y3l0 y3l0Var, e20 e20Var) {
        new AlertDialog.Builder(context).setTitle(R.string.location_disabled_title).setMessage(R.string.location_disabled).setPositiveButton(R.string.open_settings, new hj7(1, context, y3l0Var)).setNegativeButton(R.string.cancel, new z1z(e20Var, 1)).show();
    }

    @Override // xsna.k9n0
    public final boolean b(Context context) {
        LocationCommon.a.getClass();
        return LocationCommon.a(context);
    }

    @Override // xsna.k9n0
    public final boolean c(Context context) {
        LocationCommon.a.getClass();
        return LocationCommon.b(context);
    }
}
