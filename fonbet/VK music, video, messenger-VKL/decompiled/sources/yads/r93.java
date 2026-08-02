package yads;

import android.os.Bundle;
import java.util.Arrays;
import xsna.a690;

/* loaded from: classes10.dex */
public final class r93 implements xq {
    public static final wq g = new a690(13);
    public final int b;
    public final l83 c;
    public final boolean d;
    public final int[] e;
    public final boolean[] f;

    public r93(l83 l83Var, boolean z, int[] iArr, boolean[] zArr) {
        int i = l83Var.b;
        this.b = i;
        boolean z2 = false;
        ni.a(i == iArr.length && i == zArr.length);
        this.c = l83Var;
        if (z && i > 1) {
            z2 = true;
        }
        this.d = z2;
        this.e = (int[]) iArr.clone();
        this.f = (boolean[]) zArr.clone();
    }

    public final int a() {
        return this.c.d;
    }

    public final boolean b() {
        for (boolean z : this.f) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r93.class == obj.getClass()) {
            r93 r93Var = (r93) obj;
            if (this.d == r93Var.d && this.c.equals(r93Var.c) && Arrays.equals(this.e, r93Var.e) && Arrays.equals(this.f, r93Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f) + xsna.dq.d(((this.c.hashCode() * 31) + (this.d ? 1 : 0)) * 31, 31, this.e);
    }

    public static r93 a(Bundle bundle) {
        wq wqVar = l83.g;
        Bundle bundle2 = bundle.getBundle(Integer.toString(0, 36));
        bundle2.getClass();
        l83 l83Var = (l83) wqVar.fromBundle(bundle2);
        int[] intArray = bundle.getIntArray(Integer.toString(1, 36));
        int[] iArr = new int[l83Var.b];
        if (intArray == null) {
            intArray = iArr;
        }
        boolean[] booleanArray = bundle.getBooleanArray(Integer.toString(3, 36));
        boolean[] zArr = new boolean[l83Var.b];
        if (booleanArray == null) {
            booleanArray = zArr;
        }
        return new r93(l83Var, bundle.getBoolean(Integer.toString(4, 36), false), intArray, booleanArray);
    }
}
