package org.chromium.net.impl;

import android.os.Build;

/* loaded from: classes8.dex */
public final class AndroidOsBuild {
    private static AndroidOsBuild sOverrideForTesting;
    private final String mType;

    public static final class WithOverrideForTesting implements AutoCloseable {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        public WithOverrideForTesting(AndroidOsBuild androidOsBuild) {
            AndroidOsBuild.sOverrideForTesting = androidOsBuild;
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            AndroidOsBuild.sOverrideForTesting = null;
        }
    }

    public AndroidOsBuild(String str) {
        this.mType = str;
    }

    public static AndroidOsBuild get() {
        AndroidOsBuild androidOsBuild = sOverrideForTesting;
        return androidOsBuild != null ? androidOsBuild : new AndroidOsBuild(Build.TYPE);
    }

    public String getType() {
        return this.mType;
    }
}
