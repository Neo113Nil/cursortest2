package ru.ok.android.sdk.api.dns.dns;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import ru.ok.android.api.http.HttpApiEndpointProvider;

/* loaded from: classes9.dex */
public interface HttpApiEndpointStore extends HttpApiEndpointProvider {
    void putApiEndpoint(@NonNull String str, @Nullable Uri uri);
}
