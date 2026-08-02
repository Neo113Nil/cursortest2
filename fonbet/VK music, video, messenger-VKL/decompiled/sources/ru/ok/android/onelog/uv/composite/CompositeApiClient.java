package ru.ok.android.onelog.uv.composite;

import android.net.Uri;
import ru.ok.android.api.core.ApiClient;
import ru.ok.android.api.core.ApiExecutableRequest;
import ru.ok.android.onelog.uv.UVApiClient;
import ru.ok.android.utils.Logger;
import xsna.go9;
import xsna.zcl;

/* compiled from: CompositeApiClient.kt */
/* loaded from: classes9.dex */
public final class CompositeApiClient implements ApiClient {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String TAG = "CompositeApiClient";
    private final ApiClient okApiClient;
    private final OneLogRoutingPolicy routingPolicy;
    private final UVApiClient uvApiClient;

    /* compiled from: CompositeApiClient.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public CompositeApiClient(ApiClient apiClient, UVApiClient uVApiClient, OneLogRoutingPolicy oneLogRoutingPolicy) {
        this.okApiClient = apiClient;
        this.uvApiClient = uVApiClient;
        this.routingPolicy = oneLogRoutingPolicy;
    }

    @Override // ru.ok.android.api.core.ApiClient
    public <T> T execute(ApiExecutableRequest<T> apiExecutableRequest) {
        ApiClient apiClient;
        Uri uri = apiExecutableRequest.getUri();
        if (this.routingPolicy.shouldSendToOk(uri) && (apiClient = this.okApiClient) != null) {
            apiClient.execute((ApiExecutableRequest) apiExecutableRequest);
        }
        if (!this.routingPolicy.shouldSendToUv(uri)) {
            return null;
        }
        try {
            UriOverridingRequest uriOverridingRequest = new UriOverridingRequest(apiExecutableRequest, this.routingPolicy.resolveUvUri(uri));
            UVApiClient uVApiClient = this.uvApiClient;
            if (uVApiClient == null) {
                return null;
            }
            uVApiClient.execute(uriOverridingRequest);
            return null;
        } catch (Exception e) {
            Logger.e(TAG, go9.b("UV send failed for ", uri.getLastPathSegment()), e);
            return null;
        }
    }
}
