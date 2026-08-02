package com.yandex.div.core.util;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import xsna.zcl;

/* compiled from: AccessibilityStateProvider.kt */
/* loaded from: classes7.dex */
public final class AccessibilityStateProvider {
    public static final Companion Companion = new Companion(null);
    private static Boolean touchExplorationEnabled;
    private final boolean a11yConfigurationEnabled;

    /* compiled from: AccessibilityStateProvider.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final void evaluateTouchModeEnabled(Context context) {
            if (getTouchExplorationEnabled() != null) {
                return;
            }
            Object systemService = context.getSystemService("accessibility");
            AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
            setTouchExplorationEnabled(accessibilityManager != null ? Boolean.valueOf(accessibilityManager.isTouchExplorationEnabled()) : Boolean.FALSE);
        }

        public final Boolean getTouchExplorationEnabled() {
            return AccessibilityStateProvider.touchExplorationEnabled;
        }

        public final void setTouchExplorationEnabled(Boolean bool) {
            AccessibilityStateProvider.touchExplorationEnabled = bool;
        }

        private Companion() {
        }
    }

    public AccessibilityStateProvider(boolean z) {
        this.a11yConfigurationEnabled = z;
    }

    public final boolean isAccessibilityEnabled(Context context) {
        if (!this.a11yConfigurationEnabled) {
            return false;
        }
        Boolean bool = touchExplorationEnabled;
        if (bool != null) {
            return bool.booleanValue();
        }
        Companion.evaluateTouchModeEnabled(context);
        return touchExplorationEnabled.booleanValue();
    }
}
