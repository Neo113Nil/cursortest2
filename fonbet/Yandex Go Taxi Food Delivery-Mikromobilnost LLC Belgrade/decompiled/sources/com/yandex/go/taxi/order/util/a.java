package com.yandex.go.taxi.order.util;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import defpackage.g92;
import defpackage.tpr;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n;

/* loaded from: classes14.dex */
public abstract class a {
    public static final tpr a(Context context) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService(AccessibilityManager.class);
        return accessibilityManager == null ? new g92(2, Boolean.FALSE) : new n(e.g(new ContextExtensionsKt$isTouchExplorationEnabledFlow$1(accessibilityManager, null)), new ContextExtensionsKt$isTouchExplorationEnabledFlow$2(accessibilityManager, null));
    }
}
