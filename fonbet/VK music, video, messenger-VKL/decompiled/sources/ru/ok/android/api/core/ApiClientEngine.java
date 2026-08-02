package ru.ok.android.api.core;

import java.io.IOException;

/* compiled from: ApiClientEngine.kt */
/* loaded from: classes11.dex */
public interface ApiClientEngine {
    <T> T execute(ApiExecutableRequest<T> apiExecutableRequest, ApiConfig apiConfig) throws IOException, ApiException;
}
