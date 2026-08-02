package ru.ok.android.api.http;

import android.net.Uri;
import ru.ok.android.api.core.ApiUris;

/* compiled from: HttpApiEndpointProvider.kt */
/* loaded from: classes11.dex */
public interface HttpApiEndpointProvider {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final HttpApiEndpointProvider DEFAULT = new HttpApiEndpointProvider() { // from class: ru.ok.android.api.http.HttpApiEndpointProvider$Companion$DEFAULT$1
        @Override // ru.ok.android.api.http.HttpApiEndpointProvider
        public Uri getApiEndpoint(String str) throws NoHttpApiEndpointException {
            if (str.equals("api")) {
                return ApiUris.INSTANCE.getHTTP_URI_API_DEFAULT();
            }
            throw new NoHttpApiEndpointException(str);
        }
    };

    /* compiled from: HttpApiEndpointProvider.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    Uri getApiEndpoint(String str) throws NoHttpApiEndpointException;
}
