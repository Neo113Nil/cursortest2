package xsna;

import androidx.compose.ui.unit.LayoutDirection;
import java.util.Map;
import xsna.tra0;

/* compiled from: ApproachMeasureScope.kt */
/* loaded from: classes11.dex */
public final class ud3 implements sd3, ep10 {
    public final androidx.compose.ui.node.d b;
    public td3 c;
    public boolean d;

    /* compiled from: ApproachMeasureScope.kt */
    public static final class a implements dp10 {
        public final int a;
        public final int b;
        public final Map<gt1, Integer> c;
        public final izs<srg0, s3q0> d;
        public final /* synthetic */ izs<tra0.a, s3q0> e;
        public final /* synthetic */ ud3 f;

        /* JADX WARN: Multi-variable type inference failed */
        public a(int i, int i2, Map<gt1, Integer> map, izs<? super srg0, s3q0> izsVar, izs<? super tra0.a, s3q0> izsVar2, ud3 ud3Var) {
            this.e = izsVar2;
            this.f = ud3Var;
            this.a = i;
            this.b = i2;
            this.c = map;
            this.d = izsVar;
        }

        @Override // xsna.dp10
        public final int getHeight() {
            return this.b;
        }

        @Override // xsna.dp10
        public final int getWidth() {
            return this.a;
        }

        @Override // xsna.dp10
        public final void j() {
            this.e.invoke(this.f.b.m);
        }

        @Override // xsna.dp10
        public final izs<srg0, s3q0> k() {
            return this.d;
        }

        @Override // xsna.dp10
        public final Map<gt1, Integer> q() {
            return this.c;
        }
    }

    public ud3(androidx.compose.ui.node.d dVar, td3 td3Var) {
        this.b = dVar;
        this.c = td3Var;
    }

    @Override // xsna.azl
    public final long E(long j) {
        return this.b.E(j);
    }

    @Override // xsna.ep10
    public final dp10 F1(int i, int i2, Map<gt1, Integer> map, izs<? super srg0, s3q0> izsVar, izs<? super tra0.a, s3q0> izsVar2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            uzw.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new a(i, i2, map, izsVar, izsVar2, this);
    }

    @Override // xsna.azl
    public final long I(int i) {
        return this.b.I(i);
    }

    @Override // xsna.azl
    public final float I0(float f) {
        return this.b.getDensity() * f;
    }

    @Override // xsna.azl
    public final long J(float f) {
        return this.b.J(f);
    }

    @Override // xsna.azl
    public final float O0(long j) {
        return this.b.O0(j);
    }

    @Override // xsna.ep10
    public final dp10 Q(int i, int i2, Map<gt1, Integer> map, izs<? super tra0.a, s3q0> izsVar) {
        return this.b.F1(i, i2, map, null, izsVar);
    }

    @Override // xsna.azl
    public final float getDensity() {
        return this.b.getDensity();
    }

    @Override // xsna.azl
    public final float getFontScale() {
        return this.b.getFontScale();
    }

    @Override // xsna.apx
    public final LayoutDirection getLayoutDirection() {
        return this.b.q.A;
    }

    @Override // xsna.azl
    public final long i0(float f) {
        return this.b.i0(f);
    }

    @Override // xsna.azl
    public final float j1(int i) {
        return this.b.j1(i);
    }

    @Override // xsna.azl
    public final float k1(float f) {
        return f / this.b.getDensity();
    }

    @Override // xsna.azl
    public final long p1(long j) {
        return this.b.p1(j);
    }

    @Override // xsna.azl
    public final int r0(float f) {
        return this.b.r0(f);
    }

    @Override // xsna.azl
    public final float u0(long j) {
        return this.b.u0(j);
    }

    @Override // xsna.apx
    public final boolean z1() {
        return false;
    }
}
