package org.chromium.base;

/* loaded from: classes8.dex */
public class MutableIntParamWithSafeDefault extends MutableParamWithSafeDefault<Integer> {
    public MutableIntParamWithSafeDefault(FeatureMap featureMap, String str, String str2, int i) {
        super(featureMap, str, str2, Integer.valueOf(i));
    }

    public int getValue() {
        return getValueBoxed().intValue();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.chromium.base.MutableParamWithSafeDefault
    public Integer readValueFromFeatureMap() {
        return Integer.valueOf(this.mFeatureMap.getFieldTrialParamByFeatureAsInt(this.mFeatureName, this.mParamName, ((Integer) this.mDefaultValue).intValue()));
    }
}
