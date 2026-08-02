package xsna;

import java.util.List;

/* compiled from: PlayerEqualizerSettingsState.kt */
/* loaded from: classes3.dex */
public final class m1b0 implements km50 {
    public final boolean b;
    public final short c;
    public final short d;
    public final List<Short> e;
    public final List<Integer> f;
    public final ztp g;

    public m1b0(boolean z, short s, short s2, List<Short> list, List<Integer> list2, ztp ztpVar) {
        this.b = z;
        this.c = s;
        this.d = s2;
        this.e = list;
        this.f = list2;
        this.g = ztpVar;
    }

    public static m1b0 a(m1b0 m1b0Var, boolean z, List list, ztp ztpVar, int i) {
        short s = m1b0Var.c;
        short s2 = m1b0Var.d;
        if ((i & 8) != 0) {
            list = m1b0Var.e;
        }
        List list2 = list;
        List<Integer> list3 = m1b0Var.f;
        if ((i & 32) != 0) {
            ztpVar = m1b0Var.g;
        }
        m1b0Var.getClass();
        return new m1b0(z, s, s2, list2, list3, ztpVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1b0)) {
            return false;
        }
        m1b0 m1b0Var = (m1b0) obj;
        return this.b == m1b0Var.b && this.c == m1b0Var.c && this.d == m1b0Var.d && epx.f(this.e, m1b0Var.e) && epx.f(this.f, m1b0Var.f) && epx.f(this.g, m1b0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + fw3.a(fw3.a((Short.hashCode(this.d) + ((Short.hashCode(this.c) + (Boolean.hashCode(this.b) * 31)) * 31)) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        return "PlayerEqualizerSettingsState(isEqualizerEnabled=" + this.b + ", minBandLevel=" + ((int) this.c) + ", maxBandLevel=" + ((int) this.d) + ", bandValues=" + this.e + ", centerFreqList=" + this.f + ", activePreset=" + this.g + ')';
    }
}
