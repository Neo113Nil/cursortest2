package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public final class hk2 implements Appendable {
    public final StringBuilder a;
    public final ArrayList b;
    public final ArrayList c;

    public hk2(int i) {
        this.a = new StringBuilder(16);
        this.b = new ArrayList();
        this.c = new ArrayList();
        new ArrayList();
    }

    public final void a(bmt0 bmt0Var, int i, int i2) {
        this.c.add(new gk2(bmt0Var, i, i2, 8));
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof kk2) {
            b((kk2) charSequence);
            return this;
        }
        this.a.append(charSequence);
        return this;
    }

    public final void b(kk2 kk2Var) {
        StringBuilder sb = this.a;
        int length = sb.length();
        sb.append(kk2Var.b);
        List list = kk2Var.a;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ik2 ik2Var = (ik2) list.get(i);
                this.c.add(new gk2(ik2Var.b + length, ik2Var.c + length, ik2Var.a, ik2Var.d));
            }
        }
    }

    public final void c(kk2 kk2Var, int i, int i2) {
        StringBuilder sb = this.a;
        int length = sb.length();
        sb.append((CharSequence) kk2Var.b, i, i2);
        List c = mk2.c(kk2Var, i, i2, null);
        if (c != null) {
            int size = c.size();
            for (int i3 = 0; i3 < size; i3++) {
                ik2 ik2Var = (ik2) c.get(i3);
                this.c.add(new gk2(ik2Var.b + length, ik2Var.c + length, ik2Var.a, ik2Var.d));
            }
        }
    }

    public final void d(String str) {
        this.a.append(str);
    }

    public final void e(tls tlsVar) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ik2 ik2Var = (ik2) tlsVar.invoke(((gk2) arrayList.get(i)).a(Integer.MIN_VALUE));
            arrayList.set(i, new gk2(ik2Var.b, ik2Var.c, ik2Var.a, ik2Var.d));
        }
    }

    public final void f() {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            jxv.c("Nothing to pop.");
        }
        ((gk2) arrayList.remove(arrayList.size() - 1)).c = this.a.length();
    }

    public final void g(int i) {
        ArrayList arrayList = this.b;
        if (i >= arrayList.size()) {
            jxv.c(i + " should be less than " + arrayList.size());
        }
        while (arrayList.size() - 1 >= i) {
            f();
        }
    }

    public final int h(bmt0 bmt0Var) {
        gk2 gk2Var = new gk2(bmt0Var, this.a.length(), 0, 12);
        this.b.add(gk2Var);
        this.c.add(gk2Var);
        return r5.size() - 1;
    }

    public final kk2 i() {
        StringBuilder sb = this.a;
        String sb2 = sb.toString();
        ArrayList arrayList = this.c;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((gk2) arrayList.get(i)).a(sb.length()));
        }
        return new kk2(sb2, arrayList2);
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        if (charSequence instanceof kk2) {
            c((kk2) charSequence, i, i2);
            return this;
        }
        this.a.append(charSequence, i, i2);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        this.a.append(c);
        return this;
    }

    public hk2() {
        this(0);
    }

    public hk2(kk2 kk2Var) {
        this(0);
        b(kk2Var);
    }
}
