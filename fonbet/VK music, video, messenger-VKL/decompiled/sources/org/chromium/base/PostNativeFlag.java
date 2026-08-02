package org.chromium.base;

/* loaded from: classes8.dex */
public class PostNativeFlag extends Flag {
    private Boolean mInMemoryCachedValue;

    public PostNativeFlag(FeatureMap featureMap, String str) {
        super(featureMap, str);
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
        Boolean valueOf = Boolean.valueOf(this.mFeatureMap.isEnabledInNative(this.mFeatureName));
        this.mInMemoryCachedValue = valueOf;
        return valueOf.booleanValue();
    }
}
