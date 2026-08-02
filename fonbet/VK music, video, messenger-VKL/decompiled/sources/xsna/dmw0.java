package xsna;

import com.vk.voip.ui.change_name.ui.result.VoipChangeNameResult;

/* compiled from: VoipChangeNameResultEvent.kt */
/* loaded from: classes7.dex */
public abstract class dmw0 {

    /* compiled from: VoipChangeNameResultEvent.kt */
    public static final class a extends dmw0 {
        public final String a;
        public final VoipChangeNameResult b;

        public a(String str, VoipChangeNameResult voipChangeNameResult) {
            this.a = str;
            this.b = voipChangeNameResult;
        }

        @Override // xsna.dmw0
        public final String a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "AnonymSelected(requestKey=" + this.a + ", changeNameResult=" + this.b + ')';
        }
    }

    /* compiled from: VoipChangeNameResultEvent.kt */
    public static final class b extends dmw0 {
        public final String a;
        public final VoipChangeNameResult b;

        public b(String str, VoipChangeNameResult voipChangeNameResult) {
            this.a = str;
            this.b = voipChangeNameResult;
        }

        @Override // xsna.dmw0
        public final String a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "CurrentUserSelected(requestKey=" + this.a + ", changeNameResult=" + this.b + ')';
        }
    }

    /* compiled from: VoipChangeNameResultEvent.kt */
    public static final class c extends dmw0 {
        public final String a;
        public final VoipChangeNameResult b;

        public c(String str, VoipChangeNameResult voipChangeNameResult) {
            this.a = str;
            this.b = voipChangeNameResult;
        }

        @Override // xsna.dmw0
        public final String a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b);
        }

        public final int hashCode() {
            return this.b.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "GroupSelected(requestKey=" + this.a + ", changeNameResult=" + this.b + ')';
        }
    }

    public abstract String a();
}
