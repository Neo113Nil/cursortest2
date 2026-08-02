package xsna;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes.dex */
public final class ofx {
    public static vj00 a;

    @Nullable
    public static Object a(@NonNull Context context) {
        try {
            Class.forName(zix.class.getName());
            uay0 uay0Var = new uay0();
            if (!xr50.a.get()) {
                xr50.a(context);
            }
            return zix.class.cast(uay0Var);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final void b() {
        vj00 vj00Var = a;
        if (vj00Var == null) {
            vj00Var = null;
        }
        boolean booleanValue = ((Boolean) vj00Var.a.invoke()).booleanValue();
        UiTracker uiTracker = UiTracker.a;
        SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem = new SchemeStat$TypeDevNullItem(DevNullEventKey.MAP_STAT.h(), null, UiTracker.c().name(), 0, null, Integer.valueOf(booleanValue ? 1 : 0), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -46, 3, null);
        l5m l5mVar = new l5m(null, null, 3);
        l5mVar.g = schemeStat$TypeDevNullItem;
        l5mVar.q();
    }
}
