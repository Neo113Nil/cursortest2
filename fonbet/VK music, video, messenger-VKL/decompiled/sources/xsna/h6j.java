package xsna;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;

/* compiled from: ConstraintLayout.kt */
/* loaded from: classes11.dex */
public final class h6j implements g6j, huf0 {
    public final c6j b;
    public Handler c;
    public final ibk0 d = new ibk0(new b());
    public boolean e = true;
    public final c f = new c();
    public final ArrayList g = new ArrayList();

    /* compiled from: ConstraintLayout.kt */
    public static final class a extends Lambda implements gzs<s3q0> {
        final /* synthetic */ List<zo10> $measurables;
        final /* synthetic */ ftk0 $state;
        final /* synthetic */ h6j this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends zo10> list, h6j h6jVar, ftk0 ftk0Var) {
            super(0);
            this.$measurables = list;
            this.this$0 = h6jVar;
            this.$state = ftk0Var;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            List<zo10> list = this.$measurables;
            h6j h6jVar = this.this$0;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object c = list.get(i).c();
                b6j b6jVar = c instanceof b6j ? (b6j) c : null;
                if (b6jVar != null) {
                    s5j s5jVar = b6jVar.b;
                    b6jVar.c.invoke(new q5j(s5jVar.b, h6jVar.b.b(s5jVar)));
                }
                h6jVar.g.add(b6jVar);
            }
            this.this$0.b.a(this.$state);
            return s3q0.a;
        }
    }

    /* compiled from: ConstraintLayout.kt */
    public static final class b extends Lambda implements izs<gzs<? extends s3q0>, s3q0> {
        public b() {
            super(1);
        }

        @Override // xsna.izs
        public final s3q0 invoke(gzs<? extends s3q0> gzsVar) {
            gzs<? extends s3q0> gzsVar2 = gzsVar;
            if (epx.f(Looper.myLooper(), Looper.getMainLooper())) {
                gzsVar2.invoke();
            } else {
                Handler handler = h6j.this.c;
                if (handler == null) {
                    handler = new Handler(Looper.getMainLooper());
                    h6j.this.c = handler;
                }
                handler.post(new p76(1, gzsVar2));
            }
            return s3q0.a;
        }
    }

    /* compiled from: ConstraintLayout.kt */
    public static final class c extends Lambda implements izs<s3q0, s3q0> {
        public c() {
            super(1);
        }

        @Override // xsna.izs
        public final s3q0 invoke(s3q0 s3q0Var) {
            h6j.this.e = true;
            return s3q0.a;
        }
    }

    public h6j(c6j c6jVar) {
        this.b = c6jVar;
    }

    @Override // xsna.g6j
    public final boolean a(List<? extends zo10> list) {
        if (this.e) {
            return true;
        }
        int size = list.size();
        ArrayList arrayList = this.g;
        if (size != arrayList.size()) {
            return true;
        }
        int size2 = list.size();
        for (int i = 0; i < size2; i++) {
            Object c2 = list.get(i).c();
            if (!epx.f(c2 instanceof b6j ? (b6j) c2 : null, arrayList.get(i))) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.g6j
    public final void b(ftk0 ftk0Var, List<? extends zo10> list) {
        this.g.clear();
        this.d.d(s3q0.a, this.f, new a(list, this, ftk0Var));
        this.e = false;
    }

    @Override // xsna.huf0
    public final void e() {
        this.d.e();
    }

    @Override // xsna.huf0
    public final void f() {
        ibk0 ibk0Var = this.d;
        cak0 cak0Var = ibk0Var.h;
        if (cak0Var != null) {
            cak0Var.dispose();
        }
        ibk0Var.a();
    }

    @Override // xsna.huf0
    public final void d() {
    }
}
