package com.yandex.varioqub.analyticadapter.data;

/* loaded from: classes8.dex */
public final class ConfigData {
    private final String a;
    private final String b;
    private final long c;

    public ConfigData(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public final long getConfigLoadTimestamp() {
        return this.c;
    }

    public final String getNewConfigVersion() {
        return this.b;
    }

    public final String getOldConfigVersion() {
        return this.a;
    }
}
