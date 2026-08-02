package com.yandex.alicekit.core.permissions;

import defpackage.jl40;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/yandex/alicekit/core/permissions/Permission;", "it", "", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
final class PermissionManager$ActualRequestResult$getBlockedPermissions$2 extends Lambda implements tls {
    public static final PermissionManager$ActualRequestResult$getBlockedPermissions$2 w = new PermissionManager$ActualRequestResult$getBlockedPermissions$2(1);

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String str = (String) obj;
        Permission.Companion.getClass();
        for (Permission permission : Permission.values()) {
            if (jl40.l(permission.getPermissionString(), str)) {
                return permission;
            }
        }
        return null;
    }
}
