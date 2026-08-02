package com.yandex.alicekit.core.permissions;

import android.content.Context;
import androidx.fragment.app.Fragment;
import defpackage.wpu;
import defpackage.xpu;
import kotlin.Metadata;

@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u000e\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"com/yandex/alicekit/core/permissions/HookPermissionManager$PermissionHookFragment", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/content/Context;", "context", "Lzy11;", "onAttach", "(Landroid/content/Context;)V", "", "requestCode", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "Lxpu;", "permissionManager", "Lxpu;", "getPermissionManager", "()Lxpu;", "setPermissionManager", "(Lxpu;)V", "Companion", "wpu", "com.yandex.alicekit.core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class HookPermissionManager$PermissionHookFragment extends Fragment {
    public static final wpu Companion = new wpu();
    public static final String FRAGMENT_TAG = "permission_hook_fragment";
    public xpu permissionManager;

    public final xpu getPermissionManager() {
        xpu xpuVar = this.permissionManager;
        if (xpuVar != null) {
            return xpuVar;
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        setPermissionManager(new xpu(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        getPermissionManager().c(requestCode, permissions, grantResults);
    }

    public final void setPermissionManager(xpu xpuVar) {
        this.permissionManager = xpuVar;
    }
}
