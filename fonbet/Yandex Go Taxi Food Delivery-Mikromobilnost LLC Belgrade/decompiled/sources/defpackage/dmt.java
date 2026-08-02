package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import retrofit2.Call;

/* loaded from: classes9.dex */
public final class dmt extends zf7 {
    public final sls a;
    public final sls b;
    public final jk7 c;

    public dmt(sls slsVar, sls slsVar2, jk7 jk7Var) {
        this.a = slsVar;
        this.b = slsVar2;
        this.c = jk7Var;
    }

    @Override // defpackage.zf7
    public final ag7 a(Type type, Annotation[] annotationArr, t0k0 t0k0Var) {
        if (Call.class.equals(udq0.y(type)) && (type instanceof ParameterizedType) && jl40.l(udq0.y(udq0.x(0, (ParameterizedType) type)), cmt.class)) {
            ny61.r("Invalid GoApiCall usage. Please remove suspend modifier");
            return null;
        }
        if (!jl40.l(udq0.y(type), cmt.class)) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            ny61.r("GoApiCall missing generic type!");
            return null;
        }
        return new oo2(t0k0Var.b, udq0.x(0, (ParameterizedType) type), this.a, this.b, this.c);
    }
}
