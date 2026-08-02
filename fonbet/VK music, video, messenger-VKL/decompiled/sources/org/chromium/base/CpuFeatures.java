package org.chromium.base;

/* loaded from: classes8.dex */
public abstract class CpuFeatures {

    public interface Natives {
        int getCoreCount();

        long getCpuFeatures();
    }

    public static int getCount() {
        return CpuFeaturesJni.get().getCoreCount();
    }

    public static long getMask() {
        return CpuFeaturesJni.get().getCpuFeatures();
    }
}
