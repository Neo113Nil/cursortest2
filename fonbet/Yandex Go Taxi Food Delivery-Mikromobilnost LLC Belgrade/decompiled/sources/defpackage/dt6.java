package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;

/* loaded from: classes9.dex */
public final class dt6 extends yme {
    public final /* synthetic */ int a;

    public /* synthetic */ dt6(int i) {
        this.a = i;
    }

    @Override // defpackage.yme
    public zme a(Type type, Annotation[] annotationArr) {
        switch (this.a) {
            case 0:
                if (m5j0.class.isAssignableFrom(udq0.y(type))) {
                    return seu.w;
                }
                return null;
            default:
                return super.a(type, annotationArr);
        }
    }

    @Override // defpackage.yme
    public final zme b(Type type, Annotation[] annotationArr, t0k0 t0k0Var) {
        switch (this.a) {
            case 0:
                if (type == rvj0.class) {
                    return udq0.C(annotationArr, rru0.class) ? qtb1.x : x4c.J;
                }
                if (type == Void.class) {
                    return vvb1.w;
                }
                if (udq0.d && type == zy11.class) {
                    return kl40.c;
                }
                return null;
            default:
                if (udq0.y(type) != Optional.class) {
                    return null;
                }
                return new uk10(t0k0Var.d(udq0.x(0, (ParameterizedType) type), annotationArr));
        }
    }
}
