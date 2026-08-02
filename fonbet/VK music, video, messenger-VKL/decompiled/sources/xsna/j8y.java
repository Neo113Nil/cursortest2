package xsna;

import kotlinx.serialization.json.ClassDiscriminatorMode;
import kotlinx.serialization.json.internal.WriteMode;

/* compiled from: Json.kt */
/* loaded from: classes8.dex */
public abstract class j8y {
    public static final a d = new a(new q8y(false, false, false, false, false, true, "    ", false, "type", true, ClassDiscriminatorMode.POLYMORPHIC), ini0.a);
    public final q8y a;
    public final de b;
    public final z2m c = new z2m();

    /* compiled from: Json.kt */
    public static final class a extends j8y {
    }

    public j8y(q8y q8yVar, de deVar) {
        this.a = q8yVar;
        this.b = deVar;
    }

    public final <T> T a(a3m<? extends T> a3mVar, String str) {
        fqm0 fqm0Var = new fqm0(str);
        T t = (T) new fpm0(this, WriteMode.OBJ, fqm0Var, a3mVar.getDescriptor(), null).h(a3mVar);
        fqm0Var.o();
        return t;
    }

    public final <T> String b(mmi0<? super T> mmi0Var, T t) {
        ywk ywkVar = new ywk(1);
        mlb mlbVar = mlb.c;
        ywkVar.c = mlbVar.e(128);
        try {
            way.a(this, ywkVar, mmi0Var, t);
            String ywkVar2 = ywkVar.toString();
            mlbVar.d((char[]) ywkVar.c);
            return ywkVar2;
        } catch (Throwable th) {
            mlb.c.d((char[]) ywkVar.c);
            throw th;
        }
    }
}
