package defpackage;

import com.ybsdk.network.retrofit.e;
import com.ybsdk.rconfig.b;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.Result;
import retrofit2.Call;

/* loaded from: classes8.dex */
public final class bg7 extends zf7 {
    public final e a;
    public final b b;

    public bg7(e eVar, b bVar) {
        this.a = eVar;
        this.b = bVar;
    }

    @Override // defpackage.zf7
    public final ag7 a(Type type, Annotation[] annotationArr, t0k0 t0k0Var) {
        if (!jl40.l(udq0.y(type), Call.class)) {
            return null;
        }
        Type x = udq0.x(0, (ParameterizedType) type);
        if (!jl40.l(udq0.y(x), Result.class)) {
            return null;
        }
        Type x2 = udq0.x(0, (ParameterizedType) x);
        boolean l = jl40.l(udq0.y(x2), iyd0.class);
        b bVar = this.b;
        e eVar = this.a;
        return l ? new jyd0(udq0.x(0, (ParameterizedType) x2), eVar, annotationArr, bVar) : new wyj0(x2, eVar, annotationArr, bVar);
    }
}
