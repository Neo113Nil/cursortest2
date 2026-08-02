package defpackage;

import com.yandex.go.experiments.api.ExperimentSource;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* loaded from: classes.dex */
public final class clw0 {
    public static final w5w0 f = new w5w0(20);
    public static final w5w0 g = new w5w0(21);
    public final String a;
    public final Class b;
    public final ExperimentSource c;
    public final boolean d;
    public final i3y e;

    public clw0(String str, Class cls, sls slsVar, ExperimentSource experimentSource, boolean z) {
        this.a = str;
        this.b = cls;
        this.c = experimentSource;
        this.d = z;
        this.e = a.b(LazyThreadSafetyMode.PUBLICATION, slsVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (clw0.class.equals(obj != null ? obj.getClass() : null)) {
            return jl40.l(this.a, ((clw0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
