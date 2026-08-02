package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.net.URI;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.text.Regex;
import retrofit2.Call;
import retrofit2.Response;

/* loaded from: classes9.dex */
public abstract class fwu {
    public final m6j0 a;
    public final xf7 b;
    public final zme c;

    public fwu(m6j0 m6j0Var, xf7 xf7Var, zme zmeVar) {
        this.a = m6j0Var;
        this.b = xf7Var;
        this.c = zmeVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x0945  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0949 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static fwu b(t0k0 t0k0Var, Class cls, Method method) {
        Type genericReturnType;
        boolean z;
        boolean z2;
        Type type;
        d6z d6zVar;
        Annotation[][] annotationArr;
        int i;
        int i2;
        int i3;
        String str;
        Annotation[] annotationArr2;
        Type type2;
        int i4;
        Method method2;
        d6z d6zVar2;
        d6z kc90Var;
        String str2;
        Method method3 = method;
        l6j0 l6j0Var = new l6j0(t0k0Var, cls, method3);
        Annotation[] annotationArr3 = l6j0Var.d;
        int length = annotationArr3.length;
        int i5 = 0;
        int i6 = 0;
        loop0: while (true) {
            String str3 = "HEAD";
            boolean z3 = true;
            d6z d6zVar3 = null;
            if (i6 >= length) {
                if (l6j0Var.o == null) {
                    throw udq0.H(method3, null, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
                }
                if (!l6j0Var.p) {
                    if (l6j0Var.r) {
                        throw udq0.H(method3, null, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                    if (l6j0Var.q) {
                        throw udq0.H(method3, null, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                Annotation[][] annotationArr4 = l6j0Var.e;
                int length2 = annotationArr4.length;
                l6j0Var.w = new d6z[length2];
                int i7 = length2 - 1;
                int i8 = 0;
                while (i8 < length2) {
                    d6z[] d6zVarArr = l6j0Var.w;
                    Type type3 = l6j0Var.f[i8];
                    Annotation[] annotationArr5 = annotationArr4[i8];
                    int i9 = i8 == i7 ? 1 : i5;
                    if (annotationArr5 != null) {
                        int length3 = annotationArr5.length;
                        int i10 = i5;
                        d6zVar = d6zVar3;
                        while (i10 < length3) {
                            Annotation annotation = annotationArr5[i10];
                            tc90 tc90Var = tc90.f;
                            d6z[] d6zVarArr2 = d6zVarArr;
                            int i11 = length3;
                            if (annotation instanceof qg21) {
                                l6j0Var.c(i8, type3);
                                if (l6j0Var.n) {
                                    throw udq0.J(method3, i8, "Multiple @Url method annotations found.", new Object[0]);
                                }
                                if (l6j0Var.j) {
                                    throw udq0.J(method3, i8, "@Path parameters may not be used with @Url.", new Object[0]);
                                }
                                if (l6j0Var.k) {
                                    throw udq0.J(method3, i8, "A @Url parameter must not come after a @Query.", new Object[0]);
                                }
                                if (l6j0Var.l) {
                                    throw udq0.J(method3, i8, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                                }
                                if (l6j0Var.m) {
                                    throw udq0.J(method3, i8, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                                }
                                if (l6j0Var.s != null) {
                                    throw udq0.J(method3, i8, "@Url cannot be used with @%s URL", l6j0Var.o);
                                }
                                l6j0Var.n = true;
                                if (type3 != kwu.class && type3 != String.class && type3 != URI.class && (!(type3 instanceof Class) || !"android.net.Uri".equals(((Class) type3).getName()))) {
                                    throw udq0.J(method3, i8, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                                }
                                d6zVar2 = new pc90(method3, i8, 1);
                                str = str3;
                                annotationArr = annotationArr4;
                                i2 = length2;
                                i3 = i7;
                                i = i10;
                            } else {
                                annotationArr = annotationArr4;
                                boolean z4 = annotation instanceof pq90;
                                t0k0 t0k0Var2 = l6j0Var.a;
                                if (z4) {
                                    l6j0Var.c(i8, type3);
                                    if (l6j0Var.k) {
                                        throw udq0.J(method3, i8, "A @Path parameter must not come after a @Query.", new Object[0]);
                                    }
                                    if (l6j0Var.l) {
                                        throw udq0.J(method3, i8, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                                    }
                                    if (l6j0Var.m) {
                                        throw udq0.J(method3, i8, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                                    }
                                    if (l6j0Var.n) {
                                        throw udq0.J(method3, i8, "@Path parameters may not be used with @Url.", new Object[0]);
                                    }
                                    if (l6j0Var.s == null) {
                                        throw udq0.J(method3, i8, "@Path can only be used with relative url on @%s", l6j0Var.o);
                                    }
                                    l6j0Var.j = true;
                                    pq90 pq90Var = (pq90) annotation;
                                    String value = pq90Var.value();
                                    if (!l6j0.z.matcher(value).matches()) {
                                        throw udq0.J(method3, i8, "@Path parameter name must match %s. Found: %s", l6j0.y.pattern(), value);
                                    }
                                    if (!l6j0Var.v.contains(value)) {
                                        throw udq0.J(method3, i8, "URL \"%s\" does not contain \"{%s}\".", l6j0Var.s, value);
                                    }
                                    int i12 = i8;
                                    i = i10;
                                    method2 = method3;
                                    str = str3;
                                    i3 = i7;
                                    d6zVar2 = new rc90(l6j0Var.c, i12, value, t0k0Var2.e(type3, annotationArr5), pq90Var.encoded());
                                    annotationArr2 = annotationArr5;
                                    type2 = type3;
                                    i4 = i12;
                                    i2 = length2;
                                } else {
                                    i = i10;
                                    i2 = length2;
                                    if (annotation instanceof djg0) {
                                        l6j0Var.c(i8, type3);
                                        djg0 djg0Var = (djg0) annotation;
                                        String value2 = djg0Var.value();
                                        boolean encoded = djg0Var.encoded();
                                        Class y = udq0.y(type3);
                                        i3 = i7;
                                        l6j0Var.k = true;
                                        if (Iterable.class.isAssignableFrom(y)) {
                                            if (!(type3 instanceof ParameterizedType)) {
                                                throw udq0.J(method3, i8, y.getSimpleName() + " must include generic type (e.g., " + y.getSimpleName() + "<String>)", new Object[0]);
                                            }
                                            d6zVar2 = new kc90(new oc90(value2, t0k0Var2.e(udq0.x(0, (ParameterizedType) type3), annotationArr5), encoded, 1), 0);
                                        } else if (y.isArray()) {
                                            d6zVar2 = new kc90(new oc90(value2, t0k0Var2.e(l6j0.a(y.getComponentType()), annotationArr5), encoded, 1), 1);
                                        } else {
                                            str = str3;
                                            d6zVar2 = new oc90(value2, t0k0Var2.e(type3, annotationArr5), encoded, 1);
                                        }
                                    } else {
                                        i3 = i7;
                                        if (annotation instanceof hjg0) {
                                            l6j0Var.c(i8, type3);
                                            boolean encoded2 = ((hjg0) annotation).encoded();
                                            Class y2 = udq0.y(type3);
                                            l6j0Var.l = true;
                                            if (!Iterable.class.isAssignableFrom(y2)) {
                                                d6zVar2 = y2.isArray() ? new kc90(new sc90(t0k0Var2.e(l6j0.a(y2.getComponentType()), annotationArr5), encoded2), 1) : new sc90(t0k0Var2.e(type3, annotationArr5), encoded2);
                                            } else {
                                                if (!(type3 instanceof ParameterizedType)) {
                                                    throw udq0.J(method3, i8, y2.getSimpleName() + " must include generic type (e.g., " + y2.getSimpleName() + "<String>)", new Object[0]);
                                                }
                                                d6zVar2 = new kc90(new sc90(t0k0Var2.e(udq0.x(0, (ParameterizedType) type3), annotationArr5), encoded2), 0);
                                            }
                                        } else {
                                            if (annotation instanceof gjg0) {
                                                l6j0Var.c(i8, type3);
                                                Class y3 = udq0.y(type3);
                                                l6j0Var.m = true;
                                                if (!Map.class.isAssignableFrom(y3)) {
                                                    throw udq0.J(method, i8, "@QueryMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type z5 = udq0.z(type3, y3);
                                                if (!(z5 instanceof ParameterizedType)) {
                                                    throw udq0.J(method, i8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType = (ParameterizedType) z5;
                                                Type x = udq0.x(0, parameterizedType);
                                                if (String.class != x) {
                                                    throw udq0.J(method, i8, "@QueryMap keys must be of type String: " + x, new Object[0]);
                                                }
                                                Type type4 = type3;
                                                Annotation[] annotationArr6 = annotationArr5;
                                                method3 = method;
                                                d6zVar2 = new nc90(method3, i8, t0k0Var2.e(udq0.x(1, parameterizedType), annotationArr5), ((gjg0) annotation).encoded(), 2);
                                                i4 = i8;
                                                type2 = type4;
                                                str = str3;
                                                annotationArr2 = annotationArr6;
                                            } else {
                                                str = str3;
                                                annotationArr2 = annotationArr5;
                                                type2 = type3;
                                                i4 = i8;
                                                method2 = method;
                                                if (annotation instanceof z8u) {
                                                    l6j0Var.c(i4, type2);
                                                    z8u z8uVar = (z8u) annotation;
                                                    String value3 = z8uVar.value();
                                                    Class y4 = udq0.y(type2);
                                                    if (Iterable.class.isAssignableFrom(y4)) {
                                                        if (!(type2 instanceof ParameterizedType)) {
                                                            throw udq0.J(method2, i4, y4.getSimpleName() + " must include generic type (e.g., " + y4.getSimpleName() + "<String>)", new Object[0]);
                                                        }
                                                        kc90Var = new kc90(new oc90(value3, t0k0Var2.e(udq0.x(0, (ParameterizedType) type2), annotationArr2), z8uVar.allowUnsafeNonAsciiValues(), 0), 0);
                                                    } else if (y4.isArray()) {
                                                        kc90Var = new kc90(new oc90(value3, t0k0Var2.e(l6j0.a(y4.getComponentType()), annotationArr2), z8uVar.allowUnsafeNonAsciiValues(), 0), 1);
                                                    } else {
                                                        d6zVar2 = new oc90(value3, t0k0Var2.e(type2, annotationArr2), z8uVar.allowUnsafeNonAsciiValues(), 0);
                                                    }
                                                    d6zVar2 = kc90Var;
                                                } else {
                                                    if (annotation instanceof uau) {
                                                        if (type2 == meu.class) {
                                                            kc90Var = new pc90(method2, i4, 0);
                                                        } else {
                                                            l6j0Var.c(i4, type2);
                                                            Class y5 = udq0.y(type2);
                                                            if (!Map.class.isAssignableFrom(y5)) {
                                                                throw udq0.J(method2, i4, "@HeaderMap parameter type must be Map or Headers.", new Object[0]);
                                                            }
                                                            Type z6 = udq0.z(type2, y5);
                                                            if (!(z6 instanceof ParameterizedType)) {
                                                                throw udq0.J(method2, i4, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                            }
                                                            ParameterizedType parameterizedType2 = (ParameterizedType) z6;
                                                            Type x2 = udq0.x(0, parameterizedType2);
                                                            if (String.class != x2) {
                                                                throw udq0.J(method2, i4, "@HeaderMap keys must be of type String: " + x2, new Object[0]);
                                                            }
                                                            method3 = method2;
                                                            d6zVar2 = new nc90(method3, i4, t0k0Var2.e(udq0.x(1, parameterizedType2), annotationArr2), ((uau) annotation).allowUnsafeNonAsciiValues(), 1);
                                                            i4 = i4;
                                                            type2 = type2;
                                                        }
                                                    } else if (annotation instanceof dxq) {
                                                        l6j0Var.c(i4, type2);
                                                        if (!l6j0Var.q) {
                                                            throw udq0.J(method2, i4, "@Field parameters can only be used with form encoding.", new Object[0]);
                                                        }
                                                        dxq dxqVar = (dxq) annotation;
                                                        String value4 = dxqVar.value();
                                                        boolean encoded3 = dxqVar.encoded();
                                                        l6j0Var.g = true;
                                                        Class y6 = udq0.y(type2);
                                                        if (Iterable.class.isAssignableFrom(y6)) {
                                                            if (!(type2 instanceof ParameterizedType)) {
                                                                throw udq0.J(method2, i4, y6.getSimpleName() + " must include generic type (e.g., " + y6.getSimpleName() + "<String>)", new Object[0]);
                                                            }
                                                            kc90Var = new kc90(new mc90(value4, t0k0Var2.e(udq0.x(0, (ParameterizedType) type2), annotationArr2), encoded3), 0);
                                                        } else if (y6.isArray()) {
                                                            kc90Var = new kc90(new mc90(value4, t0k0Var2.e(l6j0.a(y6.getComponentType()), annotationArr2), encoded3), 1);
                                                        } else {
                                                            d6zVar2 = new mc90(value4, t0k0Var2.e(type2, annotationArr2), encoded3);
                                                        }
                                                    } else if (annotation instanceof sxq) {
                                                        l6j0Var.c(i4, type2);
                                                        if (!l6j0Var.q) {
                                                            throw udq0.J(method2, i4, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                                                        }
                                                        Class y7 = udq0.y(type2);
                                                        if (!Map.class.isAssignableFrom(y7)) {
                                                            throw udq0.J(method2, i4, "@FieldMap parameter type must be Map.", new Object[0]);
                                                        }
                                                        Type z7 = udq0.z(type2, y7);
                                                        if (!(z7 instanceof ParameterizedType)) {
                                                            throw udq0.J(method2, i4, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                        }
                                                        ParameterizedType parameterizedType3 = (ParameterizedType) z7;
                                                        Type x3 = udq0.x(0, parameterizedType3);
                                                        if (String.class != x3) {
                                                            throw udq0.J(method2, i4, "@FieldMap keys must be of type String: " + x3, new Object[0]);
                                                        }
                                                        zme e = t0k0Var2.e(udq0.x(1, parameterizedType3), annotationArr2);
                                                        l6j0Var.g = true;
                                                        d6zVar2 = new nc90(method2, i4, e, ((sxq) annotation).encoded(), 0);
                                                        i4 = i4;
                                                        method2 = method2;
                                                        type2 = type2;
                                                    } else if (annotation instanceof mg90) {
                                                        l6j0Var.c(i4, type2);
                                                        if (!l6j0Var.r) {
                                                            throw udq0.J(method2, i4, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                                                        }
                                                        mg90 mg90Var = (mg90) annotation;
                                                        l6j0Var.h = true;
                                                        String value5 = mg90Var.value();
                                                        Class y8 = udq0.y(type2);
                                                        if (!value5.isEmpty()) {
                                                            meu z8 = wwg.z("Content-Disposition", oyr.p("form-data; name=\"", value5, "\""), "Content-Transfer-Encoding", mg90Var.encoding());
                                                            if (Iterable.class.isAssignableFrom(y8)) {
                                                                if (!(type2 instanceof ParameterizedType)) {
                                                                    throw udq0.J(method2, i4, y8.getSimpleName() + " must include generic type (e.g., " + y8.getSimpleName() + "<String>)", new Object[0]);
                                                                }
                                                                Type x4 = udq0.x(0, (ParameterizedType) type2);
                                                                if (zw40.class.isAssignableFrom(udq0.y(x4))) {
                                                                    throw udq0.J(method2, i4, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                                }
                                                                kc90Var = new kc90(new qc90(method2, i4, z8, t0k0Var2.c(x4, annotationArr2, annotationArr3)), 0);
                                                            } else if (y8.isArray()) {
                                                                Class a = l6j0.a(y8.getComponentType());
                                                                if (zw40.class.isAssignableFrom(a)) {
                                                                    throw udq0.J(method2, i4, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                                }
                                                                kc90Var = new kc90(new qc90(method2, i4, z8, t0k0Var2.c(a, annotationArr2, annotationArr3)), 1);
                                                            } else {
                                                                if (zw40.class.isAssignableFrom(y8)) {
                                                                    throw udq0.J(method2, i4, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                                }
                                                                d6zVar2 = new qc90(method2, i4, z8, t0k0Var2.c(type2, annotationArr2, annotationArr3));
                                                            }
                                                        } else if (Iterable.class.isAssignableFrom(y8)) {
                                                            if (!(type2 instanceof ParameterizedType)) {
                                                                throw udq0.J(method2, i4, y8.getSimpleName() + " must include generic type (e.g., " + y8.getSimpleName() + "<String>)", new Object[0]);
                                                            }
                                                            if (!zw40.class.isAssignableFrom(udq0.y(udq0.x(0, (ParameterizedType) type2)))) {
                                                                throw udq0.J(method2, i4, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                            }
                                                            kc90Var = new kc90(tc90Var, 0);
                                                        } else if (y8.isArray()) {
                                                            if (!zw40.class.isAssignableFrom(y8.getComponentType())) {
                                                                throw udq0.J(method2, i4, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                            }
                                                            kc90Var = new kc90(tc90Var, 1);
                                                        } else {
                                                            if (!zw40.class.isAssignableFrom(y8)) {
                                                                throw udq0.J(method2, i4, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                            }
                                                            d6zVar2 = tc90Var;
                                                        }
                                                    } else if (annotation instanceof pg90) {
                                                        l6j0Var.c(i4, type2);
                                                        if (!l6j0Var.r) {
                                                            throw udq0.J(method2, i4, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                                                        }
                                                        l6j0Var.h = true;
                                                        Class y9 = udq0.y(type2);
                                                        if (!Map.class.isAssignableFrom(y9)) {
                                                            throw udq0.J(method2, i4, "@PartMap parameter type must be Map.", new Object[0]);
                                                        }
                                                        Type z9 = udq0.z(type2, y9);
                                                        if (!(z9 instanceof ParameterizedType)) {
                                                            throw udq0.J(method2, i4, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                        }
                                                        ParameterizedType parameterizedType4 = (ParameterizedType) z9;
                                                        Type x5 = udq0.x(0, parameterizedType4);
                                                        if (String.class != x5) {
                                                            throw udq0.J(method2, i4, "@PartMap keys must be of type String: " + x5, new Object[0]);
                                                        }
                                                        Type x6 = udq0.x(1, parameterizedType4);
                                                        if (zw40.class.isAssignableFrom(udq0.y(x6))) {
                                                            throw udq0.J(method2, i4, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                                        }
                                                        d6zVar2 = new qc90(method2, i4, t0k0Var2.c(x6, annotationArr2, annotationArr3), ((pg90) annotation).encoding());
                                                    } else if (annotation instanceof q76) {
                                                        l6j0Var.c(i4, type2);
                                                        if (l6j0Var.q || l6j0Var.r) {
                                                            throw udq0.J(method2, i4, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                                                        }
                                                        if (l6j0Var.i) {
                                                            throw udq0.J(method2, i4, "Multiple @Body method annotations found.", new Object[0]);
                                                        }
                                                        try {
                                                            zme c = t0k0Var2.c(type2, annotationArr2, annotationArr3);
                                                            l6j0Var.i = true;
                                                            d6zVar2 = new lc90(method2, i4, c);
                                                        } catch (RuntimeException e2) {
                                                            throw udq0.K(method2, e2, i4, "Unable to create @Body converter for %s", type2);
                                                        }
                                                    } else if (annotation instanceof m6x0) {
                                                        l6j0Var.c(i4, type2);
                                                        Class a2 = l6j0.a(udq0.y(type2));
                                                        for (int i13 = i4 - 1; i13 >= 0; i13--) {
                                                            d6z d6zVar4 = l6j0Var.w[i13];
                                                            if ((d6zVar4 instanceof uc90) && ((uc90) d6zVar4).f.equals(a2)) {
                                                                throw udq0.J(method2, i4, "@Tag type " + a2.getName() + " is duplicate of " + cvc0.b.f(i13, method2) + " and would always overwrite its value.", new Object[0]);
                                                            }
                                                        }
                                                        d6zVar2 = new uc90(a2);
                                                    } else {
                                                        d6zVar2 = null;
                                                    }
                                                    d6zVar2 = kc90Var;
                                                }
                                            }
                                            method2 = method3;
                                        }
                                    }
                                    str = str3;
                                }
                                if (d6zVar2 != null) {
                                    if (d6zVar != null) {
                                        throw udq0.J(method2, i4, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                    }
                                    d6zVar = d6zVar2;
                                }
                                i10 = i + 1;
                                method3 = method2;
                                i8 = i4;
                                type3 = type2;
                                annotationArr5 = annotationArr2;
                                i7 = i3;
                                length2 = i2;
                                str3 = str;
                                d6zVarArr = d6zVarArr2;
                                length3 = i11;
                                annotationArr4 = annotationArr;
                            }
                            annotationArr2 = annotationArr5;
                            type2 = type3;
                            i4 = i8;
                            method2 = method3;
                            if (d6zVar2 != null) {
                            }
                            i10 = i + 1;
                            method3 = method2;
                            i8 = i4;
                            type3 = type2;
                            annotationArr5 = annotationArr2;
                            i7 = i3;
                            length2 = i2;
                            str3 = str;
                            d6zVarArr = d6zVarArr2;
                            length3 = i11;
                            annotationArr4 = annotationArr;
                        }
                    } else {
                        d6zVar = null;
                    }
                    d6z[] d6zVarArr3 = d6zVarArr;
                    Type type5 = type3;
                    String str4 = str3;
                    Annotation[][] annotationArr7 = annotationArr4;
                    int i14 = length2;
                    int i15 = i7;
                    int i16 = i8;
                    Method method4 = method3;
                    if (d6zVar == null) {
                        if (i9 != 0) {
                            try {
                                if (udq0.y(type5) == Continuation.class) {
                                    l6j0Var.x = true;
                                    d6zVar = null;
                                }
                            } catch (NoClassDefFoundError unused) {
                            }
                        }
                        throw udq0.J(method4, i16, "No Retrofit annotation found.", new Object[0]);
                    }
                    d6zVarArr3[i16] = d6zVar;
                    method3 = method4;
                    i7 = i15;
                    length2 = i14;
                    str3 = str4;
                    annotationArr4 = annotationArr7;
                    i5 = 0;
                    d6zVar3 = null;
                    i8 = i16 + 1;
                }
                Method method5 = method3;
                String str5 = str3;
                if (l6j0Var.s == null && !l6j0Var.n) {
                    throw udq0.H(method5, null, "Missing either @%s URL or @Url parameter.", l6j0Var.o);
                }
                boolean z10 = l6j0Var.q;
                if (!z10 && !l6j0Var.r && !l6j0Var.p && l6j0Var.i) {
                    throw udq0.H(method5, null, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                }
                if (z10 && !l6j0Var.g) {
                    throw udq0.H(method5, null, "Form-encoded method must contain at least one @Field.", new Object[0]);
                }
                if (l6j0Var.r && !l6j0Var.h) {
                    throw udq0.H(method5, null, "Multipart method must contain at least one @Part.", new Object[0]);
                }
                m6j0 m6j0Var = new m6j0(l6j0Var);
                Type genericReturnType2 = method5.getGenericReturnType();
                if (udq0.A(genericReturnType2)) {
                    throw udq0.H(method5, null, "Method return type must not include a type variable or wildcard: %s", genericReturnType2);
                }
                if (genericReturnType2 == Void.TYPE) {
                    throw udq0.H(method5, null, "Service methods cannot return void.", new Object[0]);
                }
                Annotation[] annotations = method5.getAnnotations();
                boolean z11 = m6j0Var.l;
                if (z11) {
                    Type[] genericParameterTypes = method5.getGenericParameterTypes();
                    Type type6 = ((ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]).getActualTypeArguments()[0];
                    if (type6 instanceof WildcardType) {
                        type6 = ((WildcardType) type6).getLowerBounds()[0];
                    }
                    if (udq0.y(type6) == Response.class && (type6 instanceof ParameterizedType)) {
                        type = udq0.x(0, (ParameterizedType) type6);
                        z = true;
                        z2 = false;
                    } else {
                        if (udq0.y(type6) == Call.class) {
                            throw udq0.H(method5, null, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s", udq0.x(0, (ParameterizedType) type6));
                        }
                        z2 = udq0.d && type6 == zy11.class;
                        type = type6;
                        z = false;
                    }
                    genericReturnType = new yw21(null, Call.class, type);
                    if (!udq0.C(annotations, xms0.class)) {
                        Annotation[] annotationArr8 = new Annotation[annotations.length + 1];
                        annotationArr8[0] = yms0.b;
                        System.arraycopy(annotations, 0, annotationArr8, 1, annotations.length);
                        annotations = annotationArr8;
                    }
                } else {
                    genericReturnType = method5.getGenericReturnType();
                    z = false;
                    z2 = false;
                }
                try {
                    ag7 a3 = t0k0Var.a(genericReturnType, annotations);
                    Type n = a3.n();
                    if (n == kvj0.class) {
                        throw udq0.H(method5, null, "'" + udq0.y(n).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
                    }
                    if (n == Response.class) {
                        throw udq0.H(method5, null, "Response must include generic type (e.g., Response<String>)", new Object[0]);
                    }
                    if (m6j0Var.d.equals(str5) && !Void.class.equals(n) && (!udq0.d || n != zy11.class)) {
                        throw udq0.H(method5, null, "HEAD method must use Void or Unit as response type.", new Object[0]);
                    }
                    try {
                        zme d = t0k0Var.d(n, method5.getAnnotations());
                        xf7 xf7Var = t0k0Var.b;
                        return !z11 ? new cwu(m6j0Var, xf7Var, d, a3) : z ? new ewu(m6j0Var, xf7Var, d, a3) : new dwu(m6j0Var, xf7Var, d, a3, z2);
                    } catch (RuntimeException e3) {
                        throw udq0.H(method5, e3, "Unable to create converter for %s", n);
                    }
                } catch (RuntimeException e4) {
                    throw udq0.H(method5, e4, "Unable to create call adapter for %s", genericReturnType);
                }
            }
            Annotation annotation2 = annotationArr3[i6];
            if (annotation2 instanceof ipf) {
                l6j0Var.b("DELETE", ((ipf) annotation2).value(), false);
            } else if (annotation2 instanceof wqs) {
                l6j0Var.b("GET", ((wqs) annotation2).value(), false);
            } else if (annotation2 instanceof e5u) {
                l6j0Var.b("HEAD", ((e5u) annotation2).value(), false);
            } else if (annotation2 instanceof p390) {
                l6j0Var.b("PATCH", ((p390) annotation2).value(), true);
            } else if (annotation2 instanceof s490) {
                l6j0Var.b("POST", ((s490) annotation2).value(), true);
            } else if (annotation2 instanceof t490) {
                l6j0Var.b("PUT", ((t490) annotation2).value(), true);
            } else if (annotation2 instanceof ap60) {
                l6j0Var.b("OPTIONS", ((ap60) annotation2).value(), false);
            } else if (annotation2 instanceof g5u) {
                g5u g5uVar = (g5u) annotation2;
                l6j0Var.b(g5uVar.method(), g5uVar.path(), g5uVar.hasBody());
            } else if (annotation2 instanceof neu) {
                neu neuVar = (neu) annotation2;
                String[] value6 = neuVar.value();
                if (value6.length == 0) {
                    throw udq0.H(method3, null, "@Headers annotation is empty.", new Object[0]);
                }
                boolean allowUnsafeNonAsciiValues = neuVar.allowUnsafeNonAsciiValues();
                keu keuVar = new keu();
                int length4 = value6.length;
                int i17 = 0;
                while (i17 < length4) {
                    str2 = value6[i17];
                    int indexOf = str2.indexOf(58);
                    boolean z12 = z3;
                    if (indexOf == -1 || indexOf == 0 || indexOf == str2.length() - 1) {
                        break loop0;
                    }
                    String substring = str2.substring(0, indexOf);
                    String trim = str2.substring(indexOf + 1).trim();
                    if ("Content-Type".equalsIgnoreCase(substring)) {
                        try {
                            Regex regex = wg10.e;
                            l6j0Var.u = qje.o(trim);
                        } catch (IllegalArgumentException e5) {
                            throw udq0.H(method3, e5, "Malformed content type: %s", trim);
                        }
                    } else if (allowUnsafeNonAsciiValues) {
                        keuVar.c(substring, trim);
                    } else {
                        keuVar.a(substring, trim);
                    }
                    i17++;
                    z3 = z12;
                }
                l6j0Var.t = keuVar.d();
            } else if (annotation2 instanceof xw40) {
                if (l6j0Var.q) {
                    throw udq0.H(method3, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                l6j0Var.r = true;
            } else if (!(annotation2 instanceof a7s)) {
                continue;
            } else {
                if (l6j0Var.r) {
                    throw udq0.H(method3, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                l6j0Var.q = true;
            }
            i6++;
        }
        throw udq0.H(method3, null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str2);
    }

    public abstract Object a(yv60 yv60Var, Object[] objArr);
}
