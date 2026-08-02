package ru.ok.android.sdk.api.dns.dns;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import ru.ok.android.api.http.HttpApiEndpointProvider;

/* loaded from: classes9.dex */
public class SimpleHttpApiEndpointStore implements HttpApiEndpointStore {
    private final HttpApiEndpointProvider delegate;
    private final HashMap<String, Uri> overrides = new HashMap<>();

    public SimpleHttpApiEndpointStore(@NonNull HttpApiEndpointProvider httpApiEndpointProvider) {
        this.delegate = httpApiEndpointProvider;
    }

    @Override // ru.ok.android.api.http.HttpApiEndpointProvider
    @NonNull
    public synchronized Uri getApiEndpoint(@NonNull String str) {
        Uri uri = this.overrides.get(str);
        if (uri != null) {
            return uri;
        }
        return this.delegate.getApiEndpoint(str);
    }

    @Override // ru.ok.android.sdk.api.dns.dns.HttpApiEndpointStore
    public synchronized void putApiEndpoint(@NonNull String str, @Nullable Uri uri) {
        try {
            if (uri == null) {
                this.overrides.remove(str);
            } else {
                this.overrides.put(str, uri);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
