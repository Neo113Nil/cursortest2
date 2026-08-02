package ru.ok.android.api.methods.batch.execute;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import ru.ok.android.api.core.ApiExecutableRequest;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.core.ApiRequest;
import ru.ok.android.api.json.JsonParser;
import xsna.epx;

/* compiled from: BatchApiResult.kt */
/* loaded from: classes9.dex */
public final class BatchApiResult {
    private final ApiResultRecord<?>[] records;

    public BatchApiResult(ApiResultRecord<?>[] apiResultRecordArr) {
        this.records = apiResultRecordArr;
    }

    public final boolean contains(ApiRequest apiRequest) {
        for (ApiResultRecord<?> apiResultRecord : this.records) {
            if (apiResultRecord.handle == apiRequest) {
                return true;
            }
        }
        return false;
    }

    public final boolean containsMethodName(String str) {
        for (ApiResultRecord<?> apiResultRecord : this.records) {
            if (epx.f(apiResultRecord.method, str)) {
                return true;
            }
        }
        return false;
    }

    public final <T> T get(ApiExecutableRequest<T> apiExecutableRequest) {
        for (ApiResultRecord<?> apiResultRecord : this.records) {
            if (apiResultRecord.handle == apiExecutableRequest) {
                return (T) apiResultRecord.getOrNull();
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public final Object getByMethodName(String str) {
        for (ApiResultRecord<?> apiResultRecord : this.records) {
            if (epx.f(apiResultRecord.method, str)) {
                return apiResultRecord.getOrNull();
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public final ApiInvocationException getException(ApiRequest apiRequest) {
        for (ApiResultRecord<?> apiResultRecord : this.records) {
            if (apiResultRecord.handle == apiRequest) {
                return apiResultRecord.getExceptionOrNull();
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public final <T> T getOrNull(ApiExecutableRequest<T> apiExecutableRequest) {
        ApiResultRecord<?> apiResultRecord;
        ApiResultRecord<?>[] apiResultRecordArr = this.records;
        int length = apiResultRecordArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                apiResultRecord = null;
                break;
            }
            apiResultRecord = apiResultRecordArr[i];
            if (apiResultRecord.handle == apiExecutableRequest) {
                break;
            }
            i++;
        }
        if (apiResultRecord != null) {
            return (T) apiResultRecord.getOrNull();
        }
        return null;
    }

    public final <T> T getOrThrow(ApiExecutableRequest<T> apiExecutableRequest) {
        for (ApiResultRecord<?> apiResultRecord : this.records) {
            if (apiResultRecord.handle == apiExecutableRequest) {
                return (T) apiResultRecord.getOrThrow();
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public final Object getRaw(ApiRequest apiRequest) {
        for (ApiResultRecord<?> apiResultRecord : this.records) {
            if (apiResultRecord.handle == apiRequest) {
                return apiResultRecord.getOrNull();
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public final Object getRawOrThrow(ApiRequest apiRequest) throws ApiInvocationException {
        for (ApiResultRecord<?> apiResultRecord : this.records) {
            if (apiResultRecord.handle == apiRequest) {
                return apiResultRecord.getOrThrow();
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public final ApiResultRecord<?>[] getRecords$odnoklassniki_android_api_release() {
        return this.records;
    }

    public final BatchApiResult retain(BatchApiRequest batchApiRequest) {
        ApiResultRecord<?>[] apiResultRecordArr = this.records;
        ArrayList arrayList = new ArrayList();
        for (ApiResultRecord<?> apiResultRecord : apiResultRecordArr) {
            if (batchApiRequest.contains$odnoklassniki_android_api_release(apiResultRecord.handle)) {
                arrayList.add(apiResultRecord);
            }
        }
        return new BatchApiResult((ApiResultRecord[]) arrayList.toArray(new ApiResultRecord[0]));
    }

    public final <T, R extends ApiRequest & JsonParser<T>> T getOrNull(R r) {
        ApiResultRecord<?> apiResultRecord;
        ApiResultRecord<?>[] apiResultRecordArr = this.records;
        int length = apiResultRecordArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                apiResultRecord = null;
                break;
            }
            apiResultRecord = apiResultRecordArr[i];
            if (apiResultRecord.handle == r) {
                break;
            }
            i++;
        }
        if (apiResultRecord != null) {
            return (T) apiResultRecord.getOrNull();
        }
        return null;
    }

    public final <T, R extends ApiRequest & JsonParser<T>> T get(R r) {
        for (ApiResultRecord<?> apiResultRecord : this.records) {
            if (apiResultRecord.handle == r) {
                return (T) apiResultRecord.getOrNull();
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public final <T, R extends ApiRequest & JsonParser<T>> T getOrThrow(R r) {
        for (ApiResultRecord<?> apiResultRecord : this.records) {
            if (apiResultRecord.handle == r) {
                return (T) apiResultRecord.getOrThrow();
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
}
