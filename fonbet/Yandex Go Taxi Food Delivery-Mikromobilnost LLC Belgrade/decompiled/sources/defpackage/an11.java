package defpackage;

import java.util.List;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class an11 implements mgx {
    public final g0c a;
    public final List b;
    public final int c;

    public an11(g0c g0cVar, List list, boolean z) {
        this.a = g0cVar;
        this.b = list;
        this.c = z ? 1 : 0;
    }

    public final String a(boolean z) {
        g0c g0cVar = this.a;
        Class a = g0cVar.a();
        String name = a.isArray() ? a.equals(boolean[].class) ? "kotlin.BooleanArray" : a.equals(char[].class) ? "kotlin.CharArray" : a.equals(byte[].class) ? "kotlin.ByteArray" : a.equals(short[].class) ? "kotlin.ShortArray" : a.equals(int[].class) ? "kotlin.IntArray" : a.equals(float[].class) ? "kotlin.FloatArray" : a.equals(long[].class) ? "kotlin.LongArray" : a.equals(double[].class) ? "kotlin.DoubleArray" : "kotlin.Array" : (z && a.isPrimitive()) ? ffx.N(g0cVar).getName() : a.getName();
        List list = this.b;
        return g8e.p(name, list.isEmpty() ? "" : a.X(list, Extension.FIX_SPACE, "<", ">", new of11(this), 24), b() ? "?" : "");
    }

    @Override // defpackage.mgx
    public final boolean b() {
        return (this.c & 1) != 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof an11)) {
            return false;
        }
        an11 an11Var = (an11) obj;
        return this.a.equals(an11Var.a) && jl40.l(this.b, an11Var.b) && this.c == an11Var.c;
    }

    @Override // defpackage.mgx
    public final lfx f() {
        return this.a;
    }

    @Override // defpackage.mgx
    public final List g() {
        return this.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + unr0.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return a(false).concat(" (Kotlin reflection is not available)");
    }
}
