package org.chromium.net;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import xsna.lhg;

/* loaded from: classes8.dex */
public final class Proxy {
    public static final int HTTP = 0;
    public static final int HTTPS = 1;

    @NonNull
    private final Callback mCallback;

    @NonNull
    private final String mHost;
    private final int mPort;
    private final int mScheme;

    public static abstract class Callback {
        @Nullable
        public abstract List<Map.Entry<String, String>> onBeforeTunnelRequest();

        public abstract boolean onTunnelHeadersReceived(@NonNull List<Map.Entry<String, String>> list, int i);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Scheme {
    }

    public Proxy(int i, @NonNull String str, int i2, @NonNull Callback callback) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(lhg.a(i, "Unknown scheme "));
        }
        this.mScheme = i;
        Objects.requireNonNull(str);
        this.mHost = str;
        this.mPort = i2;
        Objects.requireNonNull(callback);
        this.mCallback = callback;
    }

    @NonNull
    public Callback getCallback() {
        return this.mCallback;
    }

    @NonNull
    public String getHost() {
        return this.mHost;
    }

    public int getPort() {
        return this.mPort;
    }

    public int getScheme() {
        return this.mScheme;
    }
}
