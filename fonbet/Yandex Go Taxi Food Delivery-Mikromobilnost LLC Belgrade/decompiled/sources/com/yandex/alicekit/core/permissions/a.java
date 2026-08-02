package com.yandex.alicekit.core.permissions;

import android.app.Activity;
import defpackage.bi91;
import defpackage.h73;
import defpackage.nza0;
import defpackage.tls;
import defpackage.w53;
import defpackage.yj70;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes11.dex */
public final class a implements nza0 {
    public final yj70 a;
    public final /* synthetic */ b b;

    public a(b bVar, String[] strArr, int[] iArr) {
        yj70 yj70Var;
        this.b = bVar;
        w53 w53Var = new w53();
        if (strArr.length == 0 || iArr.length == 0 || strArr.length != iArr.length) {
            yj70Var = new yj70(w53Var);
        } else {
            for (int i = 0; i < strArr.length; i++) {
                w53Var.put(strArr[i], Boolean.valueOf(iArr[i] == 0));
            }
            yj70Var = new yj70(w53Var);
        }
        this.a = yj70Var;
    }

    @Override // defpackage.nza0
    public final boolean a() {
        w53 w53Var = (w53) this.a.a;
        if (w53Var.isEmpty()) {
            return false;
        }
        Iterator it = w53Var.values().iterator();
        while (it.hasNext()) {
            if (!((Boolean) it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.nza0
    public final boolean b(Permission permission) {
        Activity activity = this.b.a;
        String permissionString = permission.getPermissionString();
        w53 w53Var = (w53) this.a.a;
        return ((!w53Var.containsKey(permissionString) ? false : ((Boolean) w53Var.get(permissionString)).booleanValue()) || bi91.g(activity, Collections.singleton(permissionString)) || !activity.getSharedPreferences("PermissionUtils.Prefs", 0).getStringSet("prefs_key_answered_permission_set", Collections.EMPTY_SET).contains(permissionString)) ? false : true;
    }

    @Override // defpackage.nza0
    public final Set c() {
        h73 h73Var = new h73(1, ((w53) this.a.a).keySet());
        final b bVar = this.b;
        return kotlin.sequences.b.u(kotlin.sequences.b.o(kotlin.sequences.b.g(h73Var, new tls() { // from class: com.yandex.alicekit.core.permissions.PermissionManager$ActualRequestResult$getBlockedPermissions$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                String str = (String) obj;
                yj70 yj70Var = a.this.a;
                Activity activity = bVar.a;
                w53 w53Var = (w53) yj70Var.a;
                boolean z = false;
                if (!(!w53Var.containsKey(str) ? false : ((Boolean) w53Var.get(str)).booleanValue()) && !bi91.g(activity, Collections.singleton(str)) && activity.getSharedPreferences("PermissionUtils.Prefs", 0).getStringSet("prefs_key_answered_permission_set", Collections.EMPTY_SET).contains(str)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }), PermissionManager$ActualRequestResult$getBlockedPermissions$2.w));
    }

    @Override // defpackage.nza0
    public final boolean d(Permission permission) {
        String permissionString = permission.getPermissionString();
        w53 w53Var = (w53) this.a.a;
        return (!w53Var.containsKey(permissionString) ? false : ((Boolean) w53Var.get(permissionString)).booleanValue()) || this.b.b(permission);
    }
}
