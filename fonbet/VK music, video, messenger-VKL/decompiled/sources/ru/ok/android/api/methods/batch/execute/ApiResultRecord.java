package ru.ok.android.api.methods.batch.execute;

import ru.ok.android.api.core.ApiConfig;
import ru.ok.android.api.core.ApiExecutableRequest;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.zcl;

/* compiled from: ApiResultRecord.kt */
/* loaded from: classes9.dex */
public final class ApiResultRecord<T> {
    public static final Companion Companion = new Companion(null);
    public final Object handle;
    public final String method;
    public final ApiExecutableRequest<T> request;
    private final Object result;

    /* compiled from: ApiResultRecord.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final <T> ApiResultRecord<T> fail(ApiRequestRecord<T> apiRequestRecord, ApiInvocationException apiInvocationException) {
            return new ApiResultRecord<>(apiRequestRecord, new Fail(apiInvocationException), null);
        }

        public final <T> ApiResultRecord<T> ok(ApiRequestRecord<T> apiRequestRecord, Object obj) {
            return new ApiResultRecord<>(apiRequestRecord, obj, null);
        }

        private Companion() {
        }
    }

    /* compiled from: ApiResultRecord.kt */
    public static final class Fail {
        public final ApiInvocationException error;

        public Fail(ApiInvocationException apiInvocationException) {
            this.error = apiInvocationException;
        }
    }

    public /* synthetic */ ApiResultRecord(ApiRequestRecord apiRequestRecord, Object obj, zcl zclVar) {
        this(apiRequestRecord, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ApiConfig extractApiConfig(ApiConfig apiConfig) {
        Object obj = this.result;
        return obj instanceof Fail ? apiConfig : this.request.getConfigExtractor().extractApiConfig(apiConfig, obj);
    }

    public final ApiInvocationException getExceptionOrNull() {
        Object obj = this.result;
        if (obj instanceof Fail) {
            return ((Fail) obj).error;
        }
        return null;
    }

    public final T getOrNull() {
        T t = (T) this.result;
        if (t instanceof Fail) {
            return null;
        }
        return t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final T getOrThrow() {
        T t = (T) this.result;
        if (t instanceof Fail) {
            throw ((Fail) t).error;
        }
        return t;
    }

    private ApiResultRecord(ApiRequestRecord<T> apiRequestRecord, Object obj) {
        this.result = obj;
        this.handle = apiRequestRecord.handle;
        this.request = apiRequestRecord.request;
        this.method = apiRequestRecord.method;
    }
}
