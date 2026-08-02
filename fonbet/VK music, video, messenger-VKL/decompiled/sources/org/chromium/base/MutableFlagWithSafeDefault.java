package org.chromium.base;

/* loaded from: classes8.dex */
public class MutableFlagWithSafeDefault extends Flag {
    private final boolean mDefaultValue;
    private Boolean mInMemoryCachedValue;

    public MutableFlagWithSafeDefault(FeatureMap featureMap, String str, boolean z) {
        super(featureMap, str);
        this.mDefaultValue = z;
    }

    @Override // org.chromium.base.Flag
    public void clearInMemoryCachedValueForTesting() {
        this.mInMemoryCachedValue = null;
    }

    @Override // org.chromium.base.Flag
    public boolean isEnabled() {
        Boolean bool = this.mInMemoryCachedValue;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (FeatureOverrides.hasTestFeature(this.mFeatureName)) {
            return this.mFeatureMap.isEnabledInNative(this.mFeatureName);
        }
        if (!FeatureList.isNativeInitialized()) {
            return this.mDefaultValue;
        }
        Boolean valueOf = Boolean.valueOf(this.mFeatureMap.isEnabledInNative(this.mFeatureName));
        this.mInMemoryCachedValue = valueOf;
        return valueOf.booleanValue();
    }

    public MutableBooleanParamWithSafeDefault newBooleanParam(String str, boolean z) {
        return new MutableBooleanParamWithSafeDefault(this.mFeatureMap, this.mFeatureName, str, z);
    }

    public MutableIntParamWithSafeDefault newIntParam(String str, int i) {
        return new MutableIntParamWithSafeDefault(this.mFeatureMap, this.mFeatureName, str, i);
    }
}
