package defpackage;

import ru.yandex.common.network.ErrorResponse;
import ru.yandex.common.network.Request;

/* loaded from: classes4.dex */
public abstract class lvj0 {
    public static final int NOT_MODIFIED = 304;
    public static final int SUCCESS = 200;
    protected final int code;
    protected ErrorResponse error;
    protected Request request;

    public lvj0(int i) {
        this.code = i;
    }

    public int getCode() {
        return this.code;
    }

    public ErrorResponse getError() {
        return this.error;
    }

    public Request getRequest() {
        return this.request;
    }

    public boolean hasError() {
        return this.error != null;
    }

    public void setError(ErrorResponse errorResponse) {
        this.error = errorResponse;
    }

    public void setRequest(Request request) {
        this.request = request;
    }
}
