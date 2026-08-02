package defpackage;

import android.graphics.Matrix;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes10.dex */
public abstract class cml0 extends xml0 implements eml0, uml0 {
    public HashSet i = null;
    public String j = null;
    public HashSet k = null;
    public HashSet l = null;
    public HashSet m = null;
    public Matrix n;

    @Override // defpackage.uml0
    public final String a() {
        return this.j;
    }

    @Override // defpackage.uml0
    public final void c(HashSet hashSet) {
        this.l = hashSet;
    }

    @Override // defpackage.uml0
    public final Set d() {
        return this.l;
    }

    @Override // defpackage.uml0
    public final Set e() {
        return this.k;
    }

    @Override // defpackage.uml0
    public final void f(HashSet hashSet) {
        this.i = hashSet;
    }

    @Override // defpackage.uml0
    public final Set g() {
        return this.i;
    }

    @Override // defpackage.uml0
    public final void h(HashSet hashSet) {
        this.k = hashSet;
    }

    @Override // defpackage.uml0
    public final void j(HashSet hashSet) {
        this.m = hashSet;
    }

    @Override // defpackage.uml0
    public final void k(String str) {
        this.j = str;
    }

    @Override // defpackage.eml0
    public final void l(Matrix matrix) {
        this.n = matrix;
    }

    @Override // defpackage.uml0
    public final Set m() {
        return this.m;
    }
}
