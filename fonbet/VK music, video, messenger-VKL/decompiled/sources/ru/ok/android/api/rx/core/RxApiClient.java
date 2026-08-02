package ru.ok.android.api.rx.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.internal.operators.single.v;
import io.reactivex.rxjava3.internal.schedulers.d;
import io.reactivex.rxjava3.schedulers.a;
import java.io.IOException;
import java.util.concurrent.Executor;
import ru.ok.android.api.core.ApiClient;
import ru.ok.android.api.core.ApiException;
import ru.ok.android.api.core.ApiExecutableRequest;
import ru.ok.android.api.core.ApiRequest;
import ru.ok.android.api.core.ApiRequests;
import ru.ok.android.api.json.JsonParser;
import ru.ok.android.api.json.JsonParsers;
import ru.ok.android.commons.util.Optional;
import xsna.fca0;
import xsna.qsg0;
import xsna.yxo;

/* loaded from: classes9.dex */
public final class RxApiClient {
    private final ApiClient delegate;
    private final w scheduler;

    public RxApiClient(@NonNull ApiClient apiClient) {
        this.delegate = apiClient;
        this.scheduler = a.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    /* renamed from: executeNonNull, reason: merged with bridge method [inline-methods] */
    public <T> T lambda$execute$0(@NonNull ApiExecutableRequest<T> apiExecutableRequest) throws IOException, ApiException {
        T t = (T) this.delegate.execute((ApiExecutableRequest) apiExecutableRequest);
        if (t != null) {
            return t;
        }
        throw new NullPointerException("Parsed api value was null. Request: " + apiExecutableRequest + ", method: " + ApiRequests.extractLogTag(apiExecutableRequest) + ", parser: " + apiExecutableRequest.getOkParser());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$executeCompletable$2(ApiExecutableRequest apiExecutableRequest) throws Throwable {
        this.delegate.execute(apiExecutableRequest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Optional lambda$executeOptional$1(ApiExecutableRequest apiExecutableRequest) throws Exception {
        return Optional.ofNullable(this.delegate.execute(apiExecutableRequest));
    }

    @NonNull
    @Deprecated
    public <T, R extends ApiRequest & JsonParser<T>> x<T> execute(@NonNull R r) {
        return execute((ApiExecutableRequest) ApiExecutableRequest.from(r, (JsonParser) r));
    }

    public <T> T executeBlocking(@NonNull ApiExecutableRequest<T> apiExecutableRequest) throws IOException, ApiException {
        return (T) this.delegate.execute((ApiExecutableRequest) apiExecutableRequest);
    }

    @NonNull
    public io.reactivex.rxjava3.core.a executeCompletable(@NonNull ApiRequest apiRequest) {
        return io.reactivex.rxjava3.core.a.l(new fca0(1, this, ApiExecutableRequest.from(apiRequest, JsonParsers.voidParser()))).q(this.scheduler);
    }

    @NonNull
    public <T> x<Optional<T>> executeOptional(@NonNull ApiExecutableRequest<T> apiExecutableRequest) {
        return new v(new yxo(1, this, apiExecutableRequest)).q(this.scheduler);
    }

    @NonNull
    @Deprecated
    public <T> x<T> execute(@NonNull ApiRequest apiRequest, @NonNull JsonParser<T> jsonParser) {
        return execute((ApiExecutableRequest) ApiExecutableRequest.from(apiRequest, jsonParser));
    }

    public <T, R extends ApiRequest & JsonParser<T>> T executeBlocking(@NonNull R r) throws IOException, ApiException {
        return (T) this.delegate.execute((ApiExecutableRequest) ApiExecutableRequest.from(r, (JsonParser) r));
    }

    @NonNull
    public <T> x<T> execute(@NonNull ApiExecutableRequest<T> apiExecutableRequest) {
        return new v(new qsg0(0, this, apiExecutableRequest)).q(this.scheduler);
    }

    public RxApiClient(@NonNull ApiClient apiClient, @Nullable w wVar) {
        this.delegate = apiClient;
        this.scheduler = wVar == null ? a.b() : wVar;
    }

    public RxApiClient(@NonNull ApiClient apiClient, @Nullable Executor executor) {
        w b;
        this.delegate = apiClient;
        if (executor != null) {
            w wVar = a.a;
            b = new d(executor, false);
        } else {
            b = a.b();
        }
        this.scheduler = b;
    }
}
