package xsna;

import androidx.compose.ui.unit.LayoutDirection;
import java.util.Map;
import xsna.tra0;

/* compiled from: Layout.kt */
/* loaded from: classes11.dex */
public final class fpx implements ep10, apx {
    public final /* synthetic */ apx b;
    public final LayoutDirection c;

    public fpx(apx apxVar, LayoutDirection layoutDirection) {
        this.b = apxVar;
        this.c = layoutDirection;
    }

    @Override // xsna.azl
    public final long E(long j) {
        return this.b.E(j);
    }

    @Override // xsna.ep10
    public final dp10 F1(int i, int i2, Map<gt1, Integer> map, izs<? super srg0, s3q0> izsVar, izs<? super tra0.a, s3q0> izsVar2) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            uzw.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new a(i, i2, map, izsVar);
    }

    @Override // xsna.azl
    public final long I(int i) {
        return this.b.I(i);
    }

    @Override // xsna.azl
    public final float I0(float f) {
        return this.b.I0(f);
    }

    @Override // xsna.azl
    public final long J(float f) {
        return this.b.J(f);
    }

    @Override // xsna.azl
    public final float O0(long j) {
        return this.b.O0(j);
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
        return this.c;
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
        return this.b.k1(f);
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
        return this.b.z1();
    }

    /* compiled from: Layout.kt */
    public static final class a implements dp10 {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ Map<gt1, Integer> c;
        public final /* synthetic */ izs<srg0, s3q0> d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(int i, int i2, Map<gt1, Integer> map, izs<? super srg0, s3q0> izsVar) {
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
        public final izs<srg0, s3q0> k() {
            return this.d;
        }

        @Override // xsna.dp10
        public final Map<gt1, Integer> q() {
            return this.c;
        }

        @Override // xsna.dp10
        public final void j() {
        }
    }
}
