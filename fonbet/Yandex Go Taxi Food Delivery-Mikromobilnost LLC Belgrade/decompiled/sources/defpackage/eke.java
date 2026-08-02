package defpackage;

import android.content.Context;
import com.yandex.alicekit.core.permissions.Permission;
import com.yandex.messaging.contacts.PermissionState;
import java.util.Collections;

/* loaded from: classes15.dex */
public final class eke {
    public final Context a;
    public final x22 b;
    public final tls c;

    public eke(Context context, x22 x22Var) {
        tls quVar;
        this.a = context;
        this.b = x22Var;
        try {
            quVar = new dke(0, context.getPackageManager().getClass().getMethod("shouldShowRequestPermissionRationale", String.class), this);
        } catch (Exception e) {
            this.b.reportError("cannot_get_rationale_function_from_context", e);
            quVar = new qu(17);
        }
        this.c = quVar;
    }

    public final PermissionState a(Permission permission) {
        String permissionString = permission.getPermissionString();
        Context context = this.a;
        return (qke.h(context, permissionString) == 0 || ((Boolean) this.c.invoke(permissionString)).booleanValue() || !context.getSharedPreferences("PermissionUtils.Prefs", 0).getStringSet("prefs_key_answered_permission_set", Collections.EMPTY_SET).contains(permissionString)) ? qke.h(context, permission.getPermissionString()) == 0 ? PermissionState.GRANTED : PermissionState.DENIED : PermissionState.NEVER_ASK;
    }
}
