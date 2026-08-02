package org.chromium.net.impl;

/* loaded from: classes11.dex */
public class ImplVersion {
    private static final int API_LEVEL = 38;
    private static final String CRONET_VERSION = "140.0.7339.52";
    private static final String LAST_CHANGE = "23692c36e520d6f1d8d6e7fd069461458e28da87-refs/branch-heads/7339_35@{#10}";

    private ImplVersion() {
    }

    public static int getApiLevel() {
        return 38;
    }

    public static String getCronetVersion() {
        return "140.0.7339.52";
    }

    public static String getCronetVersionWithLastChange() {
        return "140.0.7339.52@23692c36";
    }

    public static String getLastChange() {
        return LAST_CHANGE;
    }
}
