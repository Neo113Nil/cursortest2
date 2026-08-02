package org.chromium.net;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes8.dex */
public final class ProxyOptions {

    @NonNull
    private final List<Proxy> mProxyList;

    public @interface Experimental {
    }

    public ProxyOptions(@NonNull List<Proxy> list) {
        Objects.requireNonNull(list);
        if (list.isEmpty()) {
            throw new IllegalArgumentException("ProxyList cannot be empty");
        }
        this.mProxyList = new ArrayList(list);
    }

    @NonNull
    public List<Proxy> getProxyList() {
        return Collections.unmodifiableList(this.mProxyList);
    }
}
