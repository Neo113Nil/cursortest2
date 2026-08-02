package io.appmetrica.analytics.coreutils.internal.permission;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;

/* loaded from: classes8.dex */
public final class SinglePermissionStrategy implements PermissionResolutionStrategy {
    private final PermissionExtractor a;
    private final String b;

    public SinglePermissionStrategy(PermissionExtractor permissionExtractor, String str) {
        this.a = permissionExtractor;
        this.b = str;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy
    public boolean hasNecessaryPermissions(Context context) {
        return this.a.hasPermission(context, this.b);
    }
}
