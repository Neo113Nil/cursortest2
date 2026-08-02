package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.text.Regex;

/* loaded from: classes8.dex */
public final class lgx extends yme {
    public final sbx a;
    public final wg10 b;

    public lgx(sbx sbxVar, int i) {
        sbxVar = (i & 1) != 0 ? sbx.d : sbxVar;
        Regex regex = wg10.e;
        wg10 o = qje.o("application/json");
        this.a = sbxVar;
        this.b = o;
    }

    @Override // defpackage.yme
    public final zme a(Type type, Annotation[] annotationArr) {
        sbx sbxVar = this.a;
        return new jb7(27, this.b, gtq0.I(sbxVar.b, type), sbxVar);
    }

    @Override // defpackage.yme
    public final zme b(Type type, Annotation[] annotationArr, t0k0 t0k0Var) {
        sbx sbxVar = this.a;
        return new lb7(26, gtq0.I(sbxVar.b, type), sbxVar);
    }

    public lgx() {
        this(null, 3);
    }
}
