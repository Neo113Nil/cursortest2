package xsna;

/* compiled from: PlayerSettingsMenuState.kt */
/* loaded from: classes3.dex */
public final class l3b0 implements km50 {
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final ztp e;
    public final float f;
    public final Long g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;

    public l3b0(boolean z, boolean z2, boolean z3, ztp ztpVar, float f, Long l, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = ztpVar;
        this.f = f;
        this.g = l;
        this.h = z4;
        this.i = z5;
        this.j = z6;
        this.k = z7;
    }

    public static l3b0 a(l3b0 l3b0Var, boolean z, boolean z2, boolean z3, ztp ztpVar, float f, Long l, boolean z4, boolean z5, boolean z6, boolean z7, int i) {
        if ((i & 1) != 0) {
            z = l3b0Var.b;
        }
        boolean z8 = z;
        if ((i & 2) != 0) {
            z2 = l3b0Var.c;
        }
        boolean z9 = z2;
        if ((i & 4) != 0) {
            z3 = l3b0Var.d;
        }
        boolean z10 = z3;
        if ((i & 8) != 0) {
            ztpVar = l3b0Var.e;
        }
        ztp ztpVar2 = ztpVar;
        float f2 = (i & 16) != 0 ? l3b0Var.f : f;
        Long l2 = (i & 32) != 0 ? l3b0Var.g : l;
        boolean z11 = (i & 64) != 0 ? l3b0Var.h : z4;
        boolean z12 = (i & 128) != 0 ? l3b0Var.i : z5;
        boolean z13 = (i & 256) != 0 ? l3b0Var.j : z6;
        boolean z14 = (i & 512) != 0 ? l3b0Var.k : z7;
        l3b0Var.getClass();
        return new l3b0(z8, z9, z10, ztpVar2, f2, l2, z11, z12, z13, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3b0)) {
            return false;
        }
        l3b0 l3b0Var = (l3b0) obj;
        return this.b == l3b0Var.b && this.c == l3b0Var.c && this.d == l3b0Var.d && epx.f(this.e, l3b0Var.e) && Float.compare(this.f, l3b0Var.f) == 0 && epx.f(this.g, l3b0Var.g) && this.h == l3b0Var.h && this.i == l3b0Var.i && this.j == l3b0Var.j && this.k == l3b0Var.k;
    }

    public final int hashCode() {
        int a = io.reactivex.rxjava3.subjects.b.a(this.f, (this.e.hashCode() + qoy.b(qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d)) * 31, 31);
        Long l = this.g;
        return Boolean.hashCode(this.k) + qoy.b(qoy.b(qoy.b((a + (l == null ? 0 : l.hashCode())) * 31, 31, this.h), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerSettingsMenuState(isPlayerUp=");
        sb.append(this.b);
        sb.append(", isEqualizerEnabled=");
        sb.append(this.c);
        sb.append(", isEqualizerAlive=");
        sb.append(this.d);
        sb.append(", activeEqualizerPreset=");
        sb.append(this.e);
        sb.append(", volumePosition=");
        sb.append(this.f);
        sb.append(", sleepTimerRemainingTimeMs=");
        sb.append(this.g);
        sb.append(", crossfadeState=");
        sb.append(this.h);
        sb.append(", isLoudnessNormalizationAvailable=");
        sb.append(this.i);
        sb.append(", isLoudnessNormalizationEnabled=");
        sb.append(this.j);
        sb.append(", isMusic=");
        return defpackage.q0.a(sb, this.k, ')');
    }
}
