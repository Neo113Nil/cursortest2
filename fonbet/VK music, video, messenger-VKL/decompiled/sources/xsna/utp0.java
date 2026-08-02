package xsna;

import java.util.List;
import kotlin.reflect.KVariance;

/* compiled from: TypeReference.kt */
/* loaded from: classes8.dex */
public final class utp0 implements vcy {
    public final dcy b;
    public final List<wcy> c;
    public final vcy d;
    public final int e;

    /* compiled from: TypeReference.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                iArr[KVariance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KVariance.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KVariance.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public utp0(dcy dcyVar, List<wcy> list, vcy vcyVar, int i) {
        this.b = dcyVar;
        this.c = list;
        this.d = vcyVar;
        this.e = i;
    }

    public final String a(boolean z) {
        dcy dcyVar = this.b;
        dcy dcyVar2 = dcyVar instanceof dcy ? dcyVar : null;
        Class<?> a2 = dcyVar2 != null ? ((pfc) dcyVar2).a() : null;
        String obj = a2 == null ? dcyVar.toString() : (this.e & 4) != 0 ? "kotlin.Nothing" : a2.isArray() ? a2.equals(boolean[].class) ? "kotlin.BooleanArray" : a2.equals(char[].class) ? "kotlin.CharArray" : a2.equals(byte[].class) ? "kotlin.ByteArray" : a2.equals(short[].class) ? "kotlin.ShortArray" : a2.equals(int[].class) ? "kotlin.IntArray" : a2.equals(float[].class) ? "kotlin.FloatArray" : a2.equals(long[].class) ? "kotlin.LongArray" : a2.equals(double[].class) ? "kotlin.DoubleArray" : "kotlin.Array" : (z && a2.isPrimitive()) ? tby.e(dcyVar).getName() : a2.getName();
        List<wcy> list = this.c;
        String b = pzl.b(obj, list.isEmpty() ? "" : j5g.g0(list, ", ", "<", ">", 0, new mdk0(this, 5), 24), g() ? "?" : "");
        vcy vcyVar = this.d;
        if (!(vcyVar instanceof utp0)) {
            return b;
        }
        String a3 = ((utp0) vcyVar).a(true);
        if (epx.f(a3, b)) {
            return b;
        }
        if (epx.f(a3, b + '?')) {
            return b + '!';
        }
        return "(" + b + ".." + a3 + ')';
    }

    public final int b() {
        return this.e;
    }

    @Override // xsna.vcy
    public final List<wcy> d() {
        return this.c;
    }

    public final vcy e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof utp0)) {
            return false;
        }
        utp0 utp0Var = (utp0) obj;
        return epx.f(this.b, utp0Var.b) && epx.f(this.c, utp0Var.c) && epx.f(this.d, utp0Var.d) && this.e == utp0Var.e;
    }

    @Override // xsna.vcy
    public final boolean g() {
        return (this.e & 1) != 0;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + fw3.a(this.b.hashCode() * 31, 31, this.c);
    }

    @Override // xsna.vcy
    public final dcy k() {
        return this.b;
    }

    public final String toString() {
        return a(false) + " (Kotlin reflection is not available)";
    }

    public utp0(rfc rfcVar, List list, boolean z) {
        this(rfcVar, list, null, z ? 1 : 0);
    }
}
