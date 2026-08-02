package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import retrofit2.Call;

/* loaded from: classes8.dex */
public final class h6d0 extends zf7 {
    @Override // defpackage.zf7
    public final ag7 a(Type type, Annotation[] annotationArr, t0k0 t0k0Var) {
        if (Call.class.equals(udq0.y(type))) {
            if (!(type instanceof ParameterizedType)) {
                vg10.o(type, "Return type must be parameterized as Call<PlusNetworkResponse<out Any>> or be suspend, but was ");
                return null;
            }
            Type x = udq0.x(0, (ParameterizedType) type);
            if (e6d0.class.equals(udq0.y(x))) {
                if (x instanceof ParameterizedType) {
                    return new au50(27, udq0.x(0, (ParameterizedType) x));
                }
                vg10.o(x, "Response must be parameterized as PlusNetworkResponse<out Any>, but was ");
                return null;
            }
        }
        return null;
    }
}
