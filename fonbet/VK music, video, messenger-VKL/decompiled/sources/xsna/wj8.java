package xsna;

/* compiled from: BroadcastState.kt */
/* loaded from: classes7.dex */
public final class wj8 {
    public final tah0 a;
    public final mhf0 b;
    public final ipm0 c;
    public final zcx0 d;
    public final sw3 e;

    public wj8() {
        this(0);
    }

    public static wj8 a(wj8 wj8Var, tah0 tah0Var, mhf0 mhf0Var, ipm0 ipm0Var, zcx0 zcx0Var, sw3 sw3Var, int i) {
        if ((i & 1) != 0) {
            tah0Var = wj8Var.a;
        }
        tah0 tah0Var2 = tah0Var;
        if ((i & 2) != 0) {
            mhf0Var = wj8Var.b;
        }
        mhf0 mhf0Var2 = mhf0Var;
        if ((i & 4) != 0) {
            ipm0Var = wj8Var.c;
        }
        ipm0 ipm0Var2 = ipm0Var;
        if ((i & 8) != 0) {
            zcx0Var = wj8Var.d;
        }
        zcx0 zcx0Var2 = zcx0Var;
        if ((i & 16) != 0) {
            sw3Var = wj8Var.e;
        }
        wj8Var.getClass();
        return new wj8(tah0Var2, mhf0Var2, ipm0Var2, zcx0Var2, sw3Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wj8)) {
            return false;
        }
        wj8 wj8Var = (wj8) obj;
        return epx.f(this.a, wj8Var.a) && epx.f(this.b, wj8Var.b) && epx.f(this.c, wj8Var.c) && epx.f(this.d, wj8Var.d) && epx.f(this.e, wj8Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "BroadcastState(screenCastState=" + this.a + ", recordState=" + this.b + ", streamingState=" + this.c + ", watchTogetherState=" + this.d + ", asrRecordState=" + this.e + ')';
    }

    public wj8(tah0 tah0Var, mhf0 mhf0Var, ipm0 ipm0Var, zcx0 zcx0Var, sw3 sw3Var) {
        this.a = tah0Var;
        this.b = mhf0Var;
        this.c = ipm0Var;
        this.d = zcx0Var;
        this.e = sw3Var;
    }

    public /* synthetic */ wj8(int i) {
        this(new tah0(false, false), new mhf0(false, false, false, false), new ipm0(false, false, false, false), new zcx0(0), new sw3(false, false, false));
    }
}
