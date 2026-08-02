package com.yandex.go.litert.api.error;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/litert/api/error/LiteRtServiceException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "FeatureUnavailable", "FeatureLoadingFailed", "ModelFileMissing", "Lcom/yandex/go/litert/api/error/LiteRtServiceException$FeatureLoadingFailed;", "Lcom/yandex/go/litert/api/error/LiteRtServiceException$FeatureUnavailable;", "Lcom/yandex/go/litert/api/error/LiteRtServiceException$ModelFileMissing;", "go-client-android.features.litert:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class LiteRtServiceException extends RuntimeException {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/litert/api/error/LiteRtServiceException$FeatureUnavailable;", "Lcom/yandex/go/litert/api/error/LiteRtServiceException;", "<init>", "()V", "go-client-android.features.litert:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class FeatureUnavailable extends LiteRtServiceException {
        public FeatureUnavailable() {
            super("LiteRT dynamic feature is unavailable in this application", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/litert/api/error/LiteRtServiceException$ModelFileMissing;", "Lcom/yandex/go/litert/api/error/LiteRtServiceException;", "<init>", "()V", "go-client-android.features.litert:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class ModelFileMissing extends LiteRtServiceException {
        public ModelFileMissing() {
            super("LiteRT model file does not exist", null);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/go/litert/api/error/LiteRtServiceException$FeatureLoadingFailed;", "Lcom/yandex/go/litert/api/error/LiteRtServiceException;", "go-client-android.features.litert:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class FeatureLoadingFailed extends LiteRtServiceException {
        public FeatureLoadingFailed(Throwable th) {
            super("Failed to load LiteRT dynamic feature", th);
        }

        public FeatureLoadingFailed() {
            this(null);
        }
    }
}
