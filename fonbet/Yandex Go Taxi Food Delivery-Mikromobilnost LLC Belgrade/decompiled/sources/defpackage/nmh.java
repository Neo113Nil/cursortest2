package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public final class nmh extends q001 {
    public final boolean A;
    public final boolean B;
    public final SparseArray C;
    public final SparseBooleanArray D;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public boolean z;

    public nmh(omh omhVar) {
        c(omhVar);
        this.v = omhVar.w;
        this.w = omhVar.x;
        this.x = omhVar.y;
        this.y = omhVar.z;
        this.z = omhVar.A;
        this.A = omhVar.B;
        this.B = omhVar.C;
        SparseArray sparseArray = omhVar.D;
        SparseArray sparseArray2 = new SparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
        }
        this.C = sparseArray2;
        this.D = omhVar.E.clone();
    }

    @Override // defpackage.q001
    public final r001 a() {
        return new omh(this);
    }

    @Override // defpackage.q001
    public final q001 b(int i) {
        super.b(i);
        return this;
    }

    @Override // defpackage.q001
    public final q001 e() {
        this.r = -3;
        return this;
    }

    @Override // defpackage.q001
    public final q001 f(n001 n001Var) {
        super.f(n001Var);
        return this;
    }

    @Override // defpackage.q001
    public final q001 g(String str) {
        super.g(null);
        return this;
    }

    @Override // defpackage.q001
    public final q001 h(String[] strArr) {
        super.h(strArr);
        return this;
    }

    @Override // defpackage.q001
    public final q001 i() {
        this.q = false;
        return this;
    }

    @Override // defpackage.q001
    public final q001 j(int i) {
        super.j(i);
        return this;
    }

    public final void k(int i) {
        super.b(i);
    }

    public final void l(n001 n001Var) {
        super.f(n001Var);
    }

    public final q001 m(String[] strArr) {
        this.k = q001.d(strArr);
        return this;
    }

    public final void n(String str) {
        super.g(str);
    }

    public final void o(String... strArr) {
        super.h(strArr);
    }

    public final void p(int i, boolean z) {
        SparseBooleanArray sparseBooleanArray = this.D;
        if (sparseBooleanArray.get(i) == z) {
            return;
        }
        if (z) {
            sparseBooleanArray.put(i, true);
        } else {
            sparseBooleanArray.delete(i);
        }
    }

    public final void q(int i) {
        super.j(i);
    }

    public nmh() {
        this.C = new SparseArray();
        this.D = new SparseBooleanArray();
        this.v = true;
        this.w = true;
        this.x = true;
        this.y = true;
        this.z = true;
        this.A = true;
        this.B = true;
    }
}
