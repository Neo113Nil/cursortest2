package org.chromium.base;

/* loaded from: classes8.dex */
public abstract class MutableParamWithSafeDefault<T> extends FeatureParam<T> {
    public MutableParamWithSafeDefault(FeatureMap featureMap, String str, String str2, T t) {
        super(featureMap, str, str2, t);
    }

    public T getValueBoxed() {
        if (this.mInMemoryCachedValue != null) {
            return (T) this.mInMemoryCachedValue;
        }
        if (FeatureOverrides.hasTestParam(this.mFeatureName, this.mParamName)) {
            return readValueFromFeatureMap();
        }
        if (!FeatureList.isNativeInitialized()) {
            return (T) this.mDefaultValue;
        }
        this.mInMemoryCachedValue = readValueFromFeatureMap();
        return (T) this.mInMemoryCachedValue;
    }

    public abstract T readValueFromFeatureMap();
}
