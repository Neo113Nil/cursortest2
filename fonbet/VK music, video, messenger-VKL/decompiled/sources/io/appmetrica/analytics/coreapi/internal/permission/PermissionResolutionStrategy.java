package io.appmetrica.analytics.coreapi.internal.permission;

import android.content.Context;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public interface PermissionResolutionStrategy {
    boolean hasNecessaryPermissions(@NonNull Context context);
}
