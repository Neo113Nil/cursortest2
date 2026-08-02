package xsna;

import androidx.constraintlayout.core.state.State;

/* compiled from: BarrierReference.java */
/* loaded from: classes11.dex */
public final class d46 extends androidx.constraintlayout.core.state.c {
    public State.Direction n0;
    public int o0;
    public androidx.constraintlayout.core.widgets.a p0;

    /* compiled from: BarrierReference.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[State.Direction.values().length];
            a = iArr;
            try {
                iArr[State.Direction.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[State.Direction.START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[State.Direction.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[State.Direction.END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[State.Direction.TOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[State.Direction.BOTTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public d46(State state) {
        super(state, State.Helper.BARRIER);
    }

    @Override // androidx.constraintlayout.core.state.c, androidx.constraintlayout.core.state.a, xsna.dpf0
    public final void apply() {
        s();
        int i = a.a[this.n0.ordinal()];
        int i2 = 3;
        if (i == 3 || i == 4) {
            i2 = 1;
        } else if (i == 5) {
            i2 = 2;
        } else if (i != 6) {
            i2 = 0;
        }
        androidx.constraintlayout.core.widgets.a aVar = this.p0;
        aVar.x0 = i2;
        aVar.z0 = this.o0;
    }

    @Override // androidx.constraintlayout.core.state.a
    public final androidx.constraintlayout.core.state.a k(int i) {
        this.o0 = i;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.a
    public final androidx.constraintlayout.core.state.a l(Float f) {
        this.o0 = this.k0.c(f);
        return this;
    }

    @Override // androidx.constraintlayout.core.state.c
    public final e2v s() {
        if (this.p0 == null) {
            this.p0 = new androidx.constraintlayout.core.widgets.a();
        }
        return this.p0;
    }
}
