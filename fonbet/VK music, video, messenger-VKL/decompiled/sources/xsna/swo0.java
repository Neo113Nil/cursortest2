package xsna;

/* compiled from: TimelineMode.kt */
/* loaded from: classes18.dex */
public interface swo0 {

    /* compiled from: TimelineMode.kt */
    public static final class a implements swo0 {
        public static final a a = new a();
    }

    /* compiled from: TimelineMode.kt */
    public static final class b implements swo0 {
        public final String a;

        public b(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("EditingAudio(audioId="), this.a, ')');
        }
    }

    /* compiled from: TimelineMode.kt */
    public static final class c implements swo0 {
        public final String a;
        public final boolean b;

        public c(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && this.b == cVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VoiceOver(audioId=");
            sb.append(this.a);
            sb.append(", isRecording=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }
}
