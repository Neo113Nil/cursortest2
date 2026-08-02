package xsna;

/* compiled from: PlayerSettingsMenuPatch.kt */
/* loaded from: classes3.dex */
public interface j3b0 extends xl50 {

    /* compiled from: PlayerSettingsMenuPatch.kt */
    public static final class a implements j3b0 {
        public final boolean b;

        public a(boolean z) {
            this.b = z;
        }
    }

    /* compiled from: PlayerSettingsMenuPatch.kt */
    public static final class b implements j3b0 {
        public final boolean b;
        public final boolean c;
        public final ztp d;
        public final float e;
        public final boolean f;
        public final boolean g;
        public final boolean h;
        public final boolean i;

        public b(boolean z, boolean z2, ztp ztpVar, float f, boolean z3, boolean z4, boolean z5, boolean z6) {
            this.b = z;
            this.c = z2;
            this.d = ztpVar;
            this.e = f;
            this.f = z3;
            this.g = z4;
            this.h = z5;
            this.i = z6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.b == bVar.b && this.c == bVar.c && epx.f(this.d, bVar.d) && Float.compare(this.e, bVar.e) == 0 && this.f == bVar.f && this.g == bVar.g && this.h == bVar.h && this.i == bVar.i;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.i) + qoy.b(qoy.b(qoy.b(io.reactivex.rxjava3.subjects.b.a(this.e, (this.d.hashCode() + qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c)) * 31, 31), 31, this.f), 31, this.g), 31, this.h);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InitialPatch(isEqualizerEnabled=");
            sb.append(this.b);
            sb.append(", isEqualizerAlive=");
            sb.append(this.c);
            sb.append(", activeEqualizerPreset=");
            sb.append(this.d);
            sb.append(", volume=");
            sb.append(this.e);
            sb.append(", crossfadeState=");
            sb.append(this.f);
            sb.append(", isLoudnessNormalizationAvailable=");
            sb.append(this.g);
            sb.append(", isLoudnessNormalizationEnabled=");
            sb.append(this.h);
            sb.append(", isMusic=");
            return defpackage.q0.a(sb, this.i, ')');
        }
    }

    /* compiled from: PlayerSettingsMenuPatch.kt */
    public static final class c implements j3b0 {
        public final boolean b;

        public c(boolean z) {
            this.b = z;
        }
    }

    /* compiled from: PlayerSettingsMenuPatch.kt */
    public static final class d implements j3b0 {
        public final boolean b;

        public d(boolean z) {
            this.b = z;
        }
    }

    /* compiled from: PlayerSettingsMenuPatch.kt */
    public static final class e implements j3b0 {
        public final Long b;

        public e(Long l) {
            this.b = l;
        }
    }

    /* compiled from: PlayerSettingsMenuPatch.kt */
    public static final class f implements j3b0 {
        public final float b;

        public f(float f) {
            this.b = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && Float.compare(this.b, ((f) obj).b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.b);
        }

        public final String toString() {
            return xq.c(')', this.b, new StringBuilder("VolumePatch(volume="));
        }
    }
}
