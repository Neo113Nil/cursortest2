package org.chromium.base;

import java.util.HashMap;
import java.util.Iterator;
import xsna.hod;

/* loaded from: classes8.dex */
public abstract class Flag {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static HashMap<String, Flag> sFlagsCreatedForTesting = new HashMap<>();
    protected final FeatureMap mFeatureMap;
    protected final String mFeatureName;

    public Flag(FeatureMap featureMap, String str) {
        this.mFeatureMap = featureMap;
        this.mFeatureName = str;
    }

    public static void resetAllInMemoryCachedValuesForTesting() {
        Iterator<Flag> it = sFlagsCreatedForTesting.values().iterator();
        while (it.hasNext()) {
            it.next().clearInMemoryCachedValueForTesting();
        }
    }

    public static void useTemporaryFlagsCreatedForTesting() {
        HashMap<String, Flag> hashMap = sFlagsCreatedForTesting;
        sFlagsCreatedForTesting = new HashMap<>();
        ResettersForTesting.register(new hod(hashMap, 3));
    }

    public abstract void clearInMemoryCachedValueForTesting();

    public FeatureMap getFeatureMapForTesting() {
        return this.mFeatureMap;
    }

    public String getFeatureName() {
        return this.mFeatureName;
    }

    public abstract boolean isEnabled();
}
