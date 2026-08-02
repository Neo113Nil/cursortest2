package xsna;

import com.vkontakte.android.R;
import java.util.Objects;

/* compiled from: VoipSelectVideoItem.kt */
/* loaded from: classes7.dex */
public abstract class zzw0 implements hfz {

    /* compiled from: VoipSelectVideoItem.kt */
    public static final class a extends zzw0 {
        public final String b;
        public final String c;

        public a(String str, String str2) {
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            String str = this.b;
            return Integer.hashCode(R.drawable.vk_icon_video_outline_56) + urd0.a((str == null ? 0 : str.hashCode()) * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("EmptyList(title=");
            sb.append(this.b);
            sb.append(", description=");
            return i5s.a(sb, this.c, ", icon=2131239488)");
        }
    }

    /* compiled from: VoipSelectVideoItem.kt */
    public static final class b extends zzw0 {
        public final String b;

        public b(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Error(title="), this.b, ')');
        }
    }

    /* compiled from: VoipSelectVideoItem.kt */
    public static final class c extends zzw0 {
        public final String b;

        public c(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("ListLoading(loadingText="), this.b, ')');
        }
    }

    /* compiled from: VoipSelectVideoItem.kt */
    public static final class d extends zzw0 {
        public final int b;

        public d(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.b == ((d) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("PageError(nextFrom="), this.b, ')');
        }
    }

    /* compiled from: VoipSelectVideoItem.kt */
    public static final class e extends zzw0 {
        public static final e b = new e();
    }

    /* compiled from: VoipSelectVideoItem.kt */
    public static final class f extends zzw0 {
        public final lvw0 b;

        public f(lvw0 lvw0Var) {
            this.b = lvw0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.b, ((f) obj).b);
        }

        @Override // xsna.zzw0, xsna.hfz
        public final Number getItemId() {
            return Integer.valueOf(Objects.hash(Integer.valueOf(this.b.a)));
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Playlist(playlist=" + this.b + ')';
        }
    }

    /* compiled from: VoipSelectVideoItem.kt */
    public static final class g extends zzw0 {
        static {
            new g();
        }
    }

    /* compiled from: VoipSelectVideoItem.kt */
    public static final class h extends zzw0 {
        public final p3x0 b;

        public h(p3x0 p3x0Var) {
            this.b = p3x0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && epx.f(this.b, ((h) obj).b);
        }

        @Override // xsna.zzw0, xsna.hfz
        public final Number getItemId() {
            return Integer.valueOf(Objects.hash(new hl80(this.b.a)));
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Video(video=" + this.b + ')';
        }
    }

    @Override // xsna.hfz
    public Number getItemId() {
        return 0;
    }
}
