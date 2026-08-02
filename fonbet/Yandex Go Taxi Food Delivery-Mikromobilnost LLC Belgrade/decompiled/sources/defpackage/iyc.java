package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import retrofit2.Response;

/* loaded from: classes9.dex */
public final class iyc extends zf7 {
    @Override // defpackage.zf7
    public final ag7 a(Type type, Annotation[] annotationArr, t0k0 t0k0Var) {
        if (udq0.y(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            ny61.r("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
            return null;
        }
        Type x = udq0.x(0, (ParameterizedType) type);
        if (udq0.y(x) != Response.class) {
            return new io9(x);
        }
        if (x instanceof ParameterizedType) {
            return new gyc(udq0.x(0, (ParameterizedType) x));
        }
        ny61.r("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        return null;
    }
}
