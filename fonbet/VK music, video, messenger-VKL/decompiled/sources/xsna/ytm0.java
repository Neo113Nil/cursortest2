package xsna;

import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.internal.Lambda;

/* compiled from: SubcomposeLayout.kt */
/* loaded from: classes11.dex */
public final class ytm0 {
    public final aum0 a;
    public woy b;
    public final e c;
    public final c d;
    public final d e;

    /* compiled from: SubcomposeLayout.kt */
    public interface a {
        boolean a();

        b apply();

        boolean b(eal ealVar);

        void cancel();
    }

    /* compiled from: SubcomposeLayout.kt */
    public static final class c extends Lambda implements wzs<LayoutNode, cvi, s3q0> {
        public c() {
            super(2);
        }

        @Override // xsna.wzs
        public final s3q0 invoke(LayoutNode layoutNode, cvi cviVar) {
            ytm0.this.a().c = cviVar;
            return s3q0.a;
        }
    }

    /* compiled from: SubcomposeLayout.kt */
    public static final class d extends Lambda implements wzs<LayoutNode, wzs<? super ztm0, ? super o6j, ? extends dp10>, s3q0> {
        public d() {
            super(2);
        }

        @Override // xsna.wzs
        public final s3q0 invoke(LayoutNode layoutNode, wzs<? super ztm0, ? super o6j, ? extends dp10> wzsVar) {
            woy a = ytm0.this.a();
            layoutNode.n(new xoy(a, wzsVar, a.q));
            return s3q0.a;
        }
    }

    /* compiled from: SubcomposeLayout.kt */
    public static final class e extends Lambda implements wzs<LayoutNode, ytm0, s3q0> {
        public e() {
            super(2);
        }

        @Override // xsna.wzs
        public final s3q0 invoke(LayoutNode layoutNode, ytm0 ytm0Var) {
            LayoutNode layoutNode2 = layoutNode;
            ytm0 ytm0Var2 = ytm0.this;
            woy woyVar = layoutNode2.I;
            if (woyVar == null) {
                woyVar = new woy(layoutNode2, ytm0Var2.a);
                layoutNode2.I = woyVar;
            }
            ytm0Var2.b = woyVar;
            ytm0.this.a().h();
            woy a = ytm0.this.a();
            aum0 aum0Var = ytm0.this.a;
            if (a.d != aum0Var) {
                a.d = aum0Var;
                a.i(false);
                LayoutNode.f0(a.b, false, 7);
            }
            return s3q0.a;
        }
    }

    public ytm0(aum0 aum0Var) {
        this.a = aum0Var;
        this.c = new e();
        this.d = new c();
        this.e = new d();
    }

    public final woy a() {
        woy woyVar = this.b;
        if (woyVar != null) {
            return woyVar;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }

    public ytm0() {
        this(x370.a);
    }

    /* compiled from: SubcomposeLayout.kt */
    public interface b {
        default long a(int i) {
            return 0L;
        }

        default int b() {
            return 0;
        }

        void dispose();

        default void d(uzc0 uzc0Var) {
        }

        default void c(int i, long j) {
        }
    }
}
