package org.chromium.base;

/* loaded from: classes8.dex */
public class BaseFeatureList {
    public static final MutableIntParamWithSafeDefault sMaxDeferredSharedRebindServiceConnection;
    public static final MutableFlagWithSafeDefault sUpdateStateBeforeUnbinding = new MutableFlagWithSafeDefault(BaseFeatureMap.getInstance(), BaseFeatures.UPDATE_STATE_BEFORE_UNBINDING, false);
    public static final MutableFlagWithSafeDefault sUseSharedRebindServiceConnection;

    static {
        MutableFlagWithSafeDefault mutableFlagWithSafeDefault = new MutableFlagWithSafeDefault(BaseFeatureMap.getInstance(), BaseFeatures.USE_SHARED_REBIND_SERVICE_CONNECTION, false);
        sUseSharedRebindServiceConnection = mutableFlagWithSafeDefault;
        sMaxDeferredSharedRebindServiceConnection = mutableFlagWithSafeDefault.newIntParam("max-deferred-bindings", 10);
    }

    private BaseFeatureList() {
    }
}
