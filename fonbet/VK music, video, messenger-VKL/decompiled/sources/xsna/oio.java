package xsna;

import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.Lambda;
import xsna.er9;

/* compiled from: DrawScope.kt */
/* loaded from: classes11.dex */
public interface oio extends azl {

    /* compiled from: DrawScope.kt */
    public static final class a extends Lambda implements izs<oio, s3q0> {
        final /* synthetic */ izs<oio, s3q0> $block;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(izs<? super oio, s3q0> izsVar) {
            super(1);
            this.$block = izsVar;
        }

        @Override // xsna.izs
        public final s3q0 invoke(oio oioVar) {
            oio oioVar2 = oioVar;
            oio oioVar3 = oio.this;
            azl b = oioVar2.a0().b();
            LayoutDirection c = oioVar2.a0().c();
            yq9 a = oioVar2.a0().a();
            long d = oioVar2.a0().d();
            mdu mduVar = oioVar2.a0().b;
            izs<oio, s3q0> izsVar = this.$block;
            azl b2 = oioVar3.a0().b();
            LayoutDirection c2 = oioVar3.a0().c();
            yq9 a2 = oioVar3.a0().a();
            long d2 = oioVar3.a0().d();
            mdu mduVar2 = oioVar3.a0().b;
            er9.b a0 = oioVar3.a0();
            a0.f(b);
            a0.g(c);
            a0.e(a);
            a0.h(d);
            a0.b = mduVar;
            a.e();
            try {
                izsVar.invoke(oioVar3);
                a.a();
                er9.b a02 = oioVar3.a0();
                a02.f(b2);
                a02.g(c2);
                a02.e(a2);
                a02.h(d2);
                a02.b = mduVar2;
                return s3q0.a;
            } catch (Throwable th) {
                a.a();
                er9.b a03 = oioVar3.a0();
                a03.f(b2);
                a03.g(c2);
                a03.e(a2);
                a03.h(d2);
                a03.b = mduVar2;
                throw th;
            }
        }
    }

    static void B0(oio oioVar, agw agwVar, long j, long j2, long j3, long j4, float f, qio qioVar, d6g d6gVar, int i, int i2, int i3) {
        long j5;
        long j6 = (i3 & 2) != 0 ? 0L : j;
        if ((i3 & 4) != 0) {
            j5 = (agwVar.getHeight() & 4294967295L) | (agwVar.getWidth() << 32);
        } else {
            j5 = j2;
        }
        oioVar.M1(agwVar, j6, j5, (i3 & 8) != 0 ? 0L : j3, (i3 & 16) != 0 ? j5 : j4, (i3 & 32) != 0 ? 1.0f : f, (i3 & 64) != 0 ? qbr.a : qioVar, (i3 & 128) != 0 ? null : d6gVar, (i3 & 256) != 0 ? 3 : i, (i3 & 512) != 0 ? 1 : i2);
    }

    static /* synthetic */ void C0(oio oioVar, Path path, long j, float f, qio qioVar, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i & 8) != 0) {
            qioVar = qbr.a;
        }
        oioVar.V(path, j, f2, qioVar);
    }

    static /* synthetic */ void C1(oio oioVar, long j, long j2, long j3, long j4, frm0 frm0Var, int i) {
        long j5 = (i & 2) != 0 ? 0L : j2;
        oioVar.w0(j, j5, (i & 4) != 0 ? G0(oioVar.d(), j5) : j3, j4, (i & 16) != 0 ? qbr.a : frm0Var, (i & 128) != 0 ? 3 : 0);
    }

    static long G0(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    static void G1(toy toyVar, mdu mduVar, izs izsVar) {
        toyVar.N1(pli.t(toyVar.b.d()), izsVar, mduVar);
    }

    static /* synthetic */ void P(oio oioVar, long j, long j2, long j3, float f, d6g d6gVar, int i, int i2) {
        long j4 = (i2 & 2) != 0 ? 0L : j2;
        oioVar.d0(j, j4, (i2 & 4) != 0 ? G0(oioVar.d(), j4) : j3, (i2 & 8) != 0 ? 1.0f : f, qbr.a, (i2 & 32) != 0 ? null : d6gVar, (i2 & 64) != 0 ? 3 : i);
    }

    static /* synthetic */ void R(oio oioVar, agw agwVar, long j, float f, d6g d6gVar, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        qbr qbrVar = qbr.a;
        if ((i & 16) != 0) {
            d6gVar = null;
        }
        oioVar.e0(agwVar, j2, f2, qbrVar, d6gVar, (i & 32) != 0 ? 3 : 0);
    }

    static /* synthetic */ void V1(oio oioVar, long j, float f, long j2, float f2, d6g d6gVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            f = mxj0.c(oioVar.d()) / 2.0f;
        }
        oioVar.U1(j, f, (i2 & 4) != 0 ? oioVar.n1() : j2, (i2 & 8) != 0 ? 1.0f : f2, qbr.a, (i2 & 32) != 0 ? null : d6gVar, (i2 & 64) != 0 ? 3 : i);
    }

    static /* synthetic */ void X0(oio oioVar, long j, float f, float f2, long j2, long j3, float f3, qio qioVar, int i) {
        long j4 = (i & 16) != 0 ? 0L : j2;
        oioVar.D0(j, f, f2, j4, (i & 32) != 0 ? G0(oioVar.d(), j4) : j3, (i & 64) != 0 ? 1.0f : f3, qioVar);
    }

    static /* synthetic */ void r1(oio oioVar, yk8 yk8Var, long j, long j2, long j3, float f, qio qioVar, d6g d6gVar, int i) {
        long j4 = (i & 2) != 0 ? 0L : j;
        oioVar.T0(yk8Var, j4, (i & 4) != 0 ? G0(oioVar.d(), j4) : j2, j3, (i & 16) != 0 ? 1.0f : f, (i & 32) != 0 ? qbr.a : qioVar, (i & 64) != 0 ? null : d6gVar, (i & 128) != 0 ? 3 : 0);
    }

    static /* synthetic */ void u1(oio oioVar, Path path, yk8 yk8Var, float f, qio qioVar, d6g d6gVar, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i & 8) != 0) {
            qioVar = qbr.a;
        }
        qio qioVar2 = qioVar;
        if ((i & 16) != 0) {
            d6gVar = null;
        }
        oioVar.B1(path, yk8Var, f2, qioVar2, d6gVar, (i & 32) != 0 ? 3 : 0);
    }

    static /* synthetic */ void x1(oio oioVar, yk8 yk8Var, long j, long j2, float f, qio qioVar, d6g d6gVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        oioVar.t0(yk8Var, j3, (i2 & 4) != 0 ? G0(oioVar.d(), j3) : j2, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? qbr.a : qioVar, (i2 & 32) != 0 ? null : d6gVar, (i2 & 64) != 0 ? 3 : i);
    }

    void B1(Path path, yk8 yk8Var, float f, qio qioVar, d6g d6gVar, int i);

    void C(yk8 yk8Var, float f, long j, long j2, frm0 frm0Var);

    void D0(long j, float f, float f2, long j2, long j3, float f3, qio qioVar);

    void G(long j, long j2, qio qioVar);

    default void M1(agw agwVar, long j, long j2, long j3, long j4, float f, qio qioVar, d6g d6gVar, int i, int i2) {
        B0(this, agwVar, j, j2, j3, j4, f, qioVar, d6gVar, i, 0, 512);
    }

    default void N1(long j, izs izsVar, mdu mduVar) {
        mduVar.e(this, getLayoutDirection(), j, new a(izsVar));
    }

    void T0(yk8 yk8Var, long j, long j2, long j3, float f, qio qioVar, d6g d6gVar, int i);

    void U1(long j, float f, long j2, float f2, qio qioVar, d6g d6gVar, int i);

    void V(Path path, long j, float f, qio qioVar);

    void V0(yk8 yk8Var, long j, long j2, float f, float f2);

    er9.b a0();

    void b1(float f, int i, int i2, long j, long j2, long j3);

    default long d() {
        return a0().d();
    }

    void d0(long j, long j2, long j3, float f, qio qioVar, d6g d6gVar, int i);

    void e0(agw agwVar, long j, float f, qio qioVar, d6g d6gVar, int i);

    LayoutDirection getLayoutDirection();

    default long n1() {
        return egi.j(a0().d());
    }

    void t0(yk8 yk8Var, long j, long j2, float f, qio qioVar, d6g d6gVar, int i);

    void w0(long j, long j2, long j3, long j4, qio qioVar, int i);
}
