package ru.ok.android.sdk.api.dns.dns;

import android.net.Uri;
import ru.ok.android.api.http.HttpApiEndpointProvider;
import ru.ok.android.api.http.NoHttpApiEndpointException;
import ru.ok.android.sdk.api.ExternApiConfigProvider;

/* loaded from: classes9.dex */
public class ConfigurationUriProvider implements HttpApiEndpointProvider {
    private final ExternApiConfigProvider apiConfigProvider;

    public ConfigurationUriProvider(ExternApiConfigProvider externApiConfigProvider) {
        this.apiConfigProvider = externApiConfigProvider;
    }

    @Override // ru.ok.android.api.http.HttpApiEndpointProvider
    public Uri getApiEndpoint(String str) {
        str.getClass();
        if (str.equals("api")) {
            return this.apiConfigProvider.getApiConfig().getApiAddressUri();
        }
        throw new NoHttpApiEndpointException(str);
    }
}
