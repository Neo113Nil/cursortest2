package org.chromium.base;

/* loaded from: classes8.dex */
public class BaseFeatureMap extends FeatureMap {
    private static final BaseFeatureMap sInstance = new BaseFeatureMap();

    public interface Natives {
        long getNativeMap();
    }

    private BaseFeatureMap() {
    }

    public static BaseFeatureMap getInstance() {
        return sInstance;
    }

    public static boolean isEnabled(String str) {
        return getInstance().isEnabledInNative(str);
    }

    public long getNativeMap() {
        return BaseFeatureMapJni.get().getNativeMap();
    }
}
