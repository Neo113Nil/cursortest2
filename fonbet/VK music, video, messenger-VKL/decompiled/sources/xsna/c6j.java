package xsna;

import java.util.ArrayList;

/* compiled from: ConstraintLayout.kt */
/* loaded from: classes11.dex */
public final class c6j extends y5j {
    public b e;
    public int f;
    public final ArrayList<s5j> g;

    /* compiled from: ConstraintLayout.kt */
    public static final class a extends of6 implements li90 {
        public final s5j b;
        public final izs<q5j, s3q0> c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(s5j s5jVar, izs<? super q5j, s3q0> izsVar) {
            super(a5x.a);
            this.b = s5jVar;
            this.c = izsVar;
        }

        public final boolean equals(Object obj) {
            a aVar = obj instanceof a ? (a) obj : null;
            return this.c == (aVar != null ? aVar.c : null);
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        @Override // xsna.li90
        public final Object n() {
            return new b6j(this.b, this.c);
        }
    }

    /* compiled from: ConstraintLayout.kt */
    public final class b {
        public b() {
        }
    }

    public c6j() {
        super(null);
        this.f = 0;
        this.g = new ArrayList<>();
    }

    public static q630 i(q630 q630Var, s5j s5jVar, izs izsVar) {
        return q630Var.g(new a(s5jVar, izsVar));
    }

    public final s5j j() {
        int i = this.f;
        this.f = i + 1;
        ArrayList<s5j> arrayList = this.g;
        s5j s5jVar = (s5j) j5g.b0(i, arrayList);
        if (s5jVar != null) {
            return s5jVar;
        }
        s5j s5jVar2 = new s5j(Integer.valueOf(this.f));
        arrayList.add(s5jVar2);
        return s5jVar2;
    }

    public final b k() {
        b bVar = this.e;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b();
        this.e = bVar2;
        return bVar2;
    }

    public final void l() {
        this.a.f.clear();
        this.d = this.c;
        this.b = 0;
        this.f = 0;
    }
}
