package xsna;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PlayerEqualizerSettingsPatch.kt */
/* loaded from: classes3.dex */
public interface j1b0 extends xl50 {

    /* compiled from: PlayerEqualizerSettingsPatch.kt */
    public static final class a implements j1b0 {
        public final boolean b;
        public final short c;
        public final short d;
        public final ztp e;
        public final List<Short> f;
        public final ArrayList g;

        public a(boolean z, short s, short s2, ztp ztpVar, List list, ArrayList arrayList) {
            this.b = z;
            this.c = s;
            this.d = s2;
            this.e = ztpVar;
            this.f = list;
            this.g = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && this.g.equals(aVar.g);
        }

        public final int hashCode() {
            return this.g.hashCode() + fw3.a((this.e.hashCode() + ((Short.hashCode(this.d) + ((Short.hashCode(this.c) + (Boolean.hashCode(this.b) * 31)) * 31)) * 31)) * 31, 31, this.f);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InitialPatch(isEqualizerEnabled=");
            sb.append(this.b);
            sb.append(", minBandLevel=");
            sb.append((int) this.c);
            sb.append(", maxBandLevel=");
            sb.append((int) this.d);
            sb.append(", activePreset=");
            sb.append(this.e);
            sb.append(", bandValues=");
            sb.append(this.f);
            sb.append(", centerFreqList=");
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.g);
        }
    }

    /* compiled from: PlayerEqualizerSettingsPatch.kt */
    public static final class b implements j1b0 {
        public final boolean b;

        public b(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.b == ((b) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("IsEnabledPatch(isEnabled="), this.b, ')');
        }
    }

    /* compiled from: PlayerEqualizerSettingsPatch.kt */
    public static final class c implements j1b0 {
        public final ztp b;
        public final boolean c;
        public final List<Short> d;

        public c(ztp ztpVar, boolean z, List<Short> list) {
            this.b = ztpVar;
            this.c = z;
            this.d = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.b, cVar.b) && this.c == cVar.c && epx.f(this.d, cVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + qoy.b(this.b.hashCode() * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PresetPatch(preset=");
            sb.append(this.b);
            sb.append(", isEnabled=");
            sb.append(this.c);
            sb.append(", bandValues=");
            return ms9.a(')', sb, this.d);
        }
    }
}
