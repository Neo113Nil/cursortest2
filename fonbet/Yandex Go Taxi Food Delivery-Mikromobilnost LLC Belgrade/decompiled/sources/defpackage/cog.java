package defpackage;

import com.yandex.go.payments.data.model.response.ApiError;
import com.yandex.go.payments.shared.UnknownException;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import retrofit2.HttpException;
import retrofit2.Response;
import ru.yandex.taxi.exception.ApiException;
import ru.yandex.taxi.exception.GeneralApiException;
import ru.yandex.taxi.exception.UnregisterPhoneException;
import ru.yandex.taxi.network.api.models.GoApiHttpException;

/* loaded from: classes8.dex */
public final class cog {
    public final wnt a;

    public cog(wnt wntVar) {
        this.a = wntVar;
    }

    public static ApiException a(ApiError apiError) {
        String a = apiError.getA();
        return jl40.l(a, "UNREGISTERED_PHONE") ? new UnregisterPhoneException(apiError.getB(), apiError.b()) : jl40.l(a, "GENERAL") ? new GeneralApiException(apiError.getB()) : new GeneralApiException(apiError.getB());
    }

    public final RuntimeException b(Throwable th) {
        UnknownException unknownException;
        rvj0 rvj0Var;
        if (th instanceof HttpException) {
            HttpException httpException = (HttpException) th;
            Response response = httpException.a;
            if (response != null && (rvj0Var = response.c) != null) {
                try {
                    return c(httpException, rvj0Var.string());
                } catch (IOException e) {
                    unknownException = new UnknownException(e);
                }
            }
            return new UnknownException(httpException);
        }
        if (!(th instanceof GoApiHttpException)) {
            return new UnknownException(th);
        }
        GoApiHttpException goApiHttpException = (GoApiHttpException) th;
        BufferedInputStream body = goApiHttpException.getBody();
        if (body == null) {
            return new UnknownException(goApiHttpException);
        }
        try {
            return c(goApiHttpException, cma1.x0(new BufferedReader(new InputStreamReader(body, Charset.defaultCharset()), 8192)));
        } catch (IOException e2) {
            unknownException = new UnknownException(e2);
        }
        return unknownException;
    }

    public final RuntimeException c(RuntimeException runtimeException, String str) {
        try {
            return a((ApiError) ((xnt) this.a).c(str, ApiError.Companion.serializer()));
        } catch (Throwable unused) {
            return new UnknownException(runtimeException);
        }
    }
}
