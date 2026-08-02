package org.chromium.base;

/* loaded from: classes8.dex */
public class MutableBooleanParamWithSafeDefault extends MutableParamWithSafeDefault<Boolean> {
    public MutableBooleanParamWithSafeDefault(FeatureMap featureMap, String str, String str2, boolean z) {
        super(featureMap, str, str2, Boolean.valueOf(z));
    }

    public boolean getValue() {
        return getValueBoxed().booleanValue();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.chromium.base.MutableParamWithSafeDefault
    public Boolean readValueFromFeatureMap() {
        return Boolean.valueOf(this.mFeatureMap.getFieldTrialParamByFeatureAsBoolean(this.mFeatureName, this.mParamName, ((Boolean) this.mDefaultValue).booleanValue()));
    }
}
