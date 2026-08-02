package ru.ok.media;

import xsna.tdj;
import xsna.xy6;

/* compiled from: OkmpConnectionConfig.kt */
/* loaded from: classes9.dex */
public final class OkmpConnectionConfig {
    private final String appName;
    private final String host;
    private final int port;
    private final String streamName;

    public OkmpConnectionConfig(String str, int i, String str2, String str3) {
        this.host = str;
        this.port = i;
        this.streamName = str2;
        this.appName = str3;
    }

    public final String getAppName() {
        return this.appName;
    }

    public final String getHost() {
        return this.host;
    }

    public final int getPort() {
        return this.port;
    }

    public final String getStreamName() {
        return this.streamName;
    }

    public String toString() {
        String str = this.host;
        int i = this.port;
        return tdj.a(xy6.b(i, "{host: \"", str, "\", port: ", ", streamName: "), this.streamName, ", appName: ", this.appName);
    }
}
