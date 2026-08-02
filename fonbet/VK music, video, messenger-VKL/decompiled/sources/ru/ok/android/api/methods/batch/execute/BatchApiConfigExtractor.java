package ru.ok.android.api.methods.batch.execute;

import ru.ok.android.api.core.ApiConfig;
import ru.ok.android.api.session.ApiConfigExtractor;

/* compiled from: BatchApiConfigExtractor.kt */
/* loaded from: classes9.dex */
public final class BatchApiConfigExtractor implements ApiConfigExtractor<BatchApiResult> {
    public static final BatchApiConfigExtractor INSTANCE = new BatchApiConfigExtractor();

    private BatchApiConfigExtractor() {
    }

    @Override // ru.ok.android.api.session.ApiConfigExtractor
    public ApiConfig extractApiConfig(ApiConfig apiConfig, BatchApiResult batchApiResult) {
        for (ApiResultRecord<?> apiResultRecord : batchApiResult.getRecords$odnoklassniki_android_api_release()) {
            apiConfig = apiResultRecord.extractApiConfig(apiConfig);
        }
        return apiConfig;
    }
}
