package xsna;

import com.vk.dto.music.Thumb;
import com.vk.dto.music.reactions.Reaction;
import com.vkontakte.android.R;
import java.util.UUID;

/* compiled from: TrackData.kt */
/* loaded from: classes3.dex */
public interface gfp0 {

    /* compiled from: TrackData.kt */
    public static final class a implements gfp0 {
        public static final a g = new a(UUID.randomUUID().toString(), lso0.a, "", "", false, false);
        public final String a;
        public final Thumb b;
        public final String c;
        public final String d;
        public final boolean e;
        public final boolean f;

        public a(String str, Thumb thumb, String str2, String str3, boolean z, boolean z2) {
            this.a = str;
            this.b = thumb;
            this.c = str2;
            this.d = str3;
            this.e = z;
            this.f = z2;
        }

        public final boolean a() {
            return this == g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && this.e == aVar.e && this.f == aVar.f;
        }

        @Override // xsna.gfp0
        public final Thumb getImage() {
            throw null;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f) + qoy.b(urd0.a(urd0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e);
        }

        @Override // xsna.gfp0
        public final String m() {
            throw null;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AudioBook(uniqueId=");
            sb.append(this.a);
            sb.append(", image=");
            sb.append(this.b);
            sb.append(", title=");
            sb.append(this.c);
            sb.append(", author=");
            sb.append(this.d);
            sb.append(", isExplicit=");
            sb.append(this.e);
            sb.append(", hasKidsContext=");
            return defpackage.q0.a(sb, this.f, ')');
        }
    }

    /* compiled from: TrackData.kt */
    public interface b extends gfp0 {

        /* compiled from: TrackData.kt */
        public static final class a implements b {
            public final Thumb a;
            public final String b;
            public final boolean c;
            public final boolean d;

            public a(Thumb thumb, String str, boolean z, boolean z2) {
                this.a = thumb;
                this.b = str;
                this.c = z;
                this.d = z2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                aVar.getClass();
                return this.a.equals(aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d;
            }

            @Override // xsna.gfp0
            public final Thumb getImage() {
                return this.a;
            }

            public final int hashCode() {
                int hashCode = (this.a.hashCode() + 295177483) * 31;
                String str = this.b;
                return Boolean.hashCode(this.d) + qoy.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
            }

            @Override // xsna.gfp0
            public final String m() {
                return "advertisement_id";
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Advertisement(uniqueId=advertisement_id, image=");
                sb.append(this.a);
                sb.append(", url=");
                sb.append(this.b);
                sb.append(", isCoverClickable=");
                sb.append(this.c);
                sb.append(", gotoEnabled=");
                return defpackage.q0.a(sb, this.d, ')');
            }
        }

        /* compiled from: TrackData.kt */
        /* renamed from: xsna.gfp0$b$b, reason: collision with other inner class name */
        public static final class C2940b implements b {
            public static final C2940b a = new C2940b();
            public static final String b = UUID.randomUUID().toString();
            public static final Thumb c = lso0.a;

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C2940b);
            }

            @Override // xsna.gfp0
            public final Thumb getImage() {
                return c;
            }

            public final int hashCode() {
                return 373747344;
            }

            @Override // xsna.gfp0
            public final String m() {
                return b;
            }

            public final String toString() {
                return "Empty";
            }
        }

        /* compiled from: TrackData.kt */
        public static final class c implements b {
            public final String a;
            public final Thumb b;
            public final String c;
            public final String d;
            public final boolean e;
            public final Reaction f;
            public final boolean g;
            public final boolean h;

            public c(String str, Thumb thumb, String str2, String str3, boolean z, Reaction reaction, boolean z2, boolean z3) {
                this.a = str;
                this.b = thumb;
                this.c = str2;
                this.d = str3;
                this.e = z;
                this.f = reaction;
                this.g = z2;
                this.h = z3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d) && this.e == cVar.e && epx.f(this.f, cVar.f) && this.g == cVar.g && this.h == cVar.h;
            }

            @Override // xsna.gfp0
            public final Thumb getImage() {
                return this.b;
            }

            public final int hashCode() {
                int b = qoy.b(urd0.a(urd0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e);
                Reaction reaction = this.f;
                return Boolean.hashCode(this.h) + qoy.b((b + (reaction == null ? 0 : reaction.hashCode())) * 31, 31, this.g);
            }

            @Override // xsna.gfp0
            public final String m() {
                return this.a;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Track(uniqueId=");
                sb.append(this.a);
                sb.append(", image=");
                sb.append(this.b);
                sb.append(", title=");
                sb.append(this.c);
                sb.append(", artist=");
                sb.append(this.d);
                sb.append(", isExplicit=");
                sb.append(this.e);
                sb.append(", reaction=");
                sb.append(this.f);
                sb.append(", isDisableSaveAsPlaylistButton=");
                sb.append(this.g);
                sb.append(", hasKidsContext=");
                return defpackage.q0.a(sb, this.h, ')');
            }
        }
    }

    /* compiled from: TrackData.kt */
    public static final class c implements gfp0 {
        public static final c g = new c(UUID.randomUUID().toString(), lso0.a, "", "", false, false);
        public final String a;
        public final Thumb b;
        public final String c;
        public final String d;
        public final boolean e;
        public final boolean f;

        public c(String str, Thumb thumb, String str2, String str3, boolean z, boolean z2) {
            this.a = str;
            this.b = thumb;
            this.c = str2;
            this.d = str3;
            this.e = z;
            this.f = z2;
        }

        public final boolean a() {
            return this == g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d) && this.e == cVar.e && this.f == cVar.f;
        }

        @Override // xsna.gfp0
        public final Thumb getImage() {
            throw null;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f) + qoy.b(urd0.a(urd0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e);
        }

        @Override // xsna.gfp0
        public final String m() {
            throw null;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Podcast(uniqueId=");
            sb.append(this.a);
            sb.append(", image=");
            sb.append(this.b);
            sb.append(", title=");
            sb.append(this.c);
            sb.append(", subtitle=");
            sb.append(this.d);
            sb.append(", isExplicit=");
            sb.append(this.e);
            sb.append(", hasKidsContext=");
            return defpackage.q0.a(sb, this.f, ')');
        }
    }

    /* compiled from: TrackData.kt */
    public static final class d implements gfp0 {
        public static final d d = new d(UUID.randomUUID().toString(), lso0.a, "");
        public final String a;
        public final Thumb b;
        public final String c;

        public d(String str, Thumb thumb, String str2) {
            this.a = str;
            this.b = thumb;
            this.c = str2;
        }

        public final boolean a() {
            return this == d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b) && this.c.equals(dVar.c);
        }

        @Override // xsna.gfp0
        public final Thumb getImage() {
            throw null;
        }

        public final int hashCode() {
            return Integer.hashCode(R.string.music_player_radio_station) + urd0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        }

        @Override // xsna.gfp0
        public final String m() {
            throw null;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Radio(uniqueId=");
            sb.append(this.a);
            sb.append(", image=");
            sb.append(this.b);
            sb.append(", title=");
            return i5s.a(sb, this.c, ", subtitleRes=2131959823)");
        }
    }

    Thumb getImage();

    String m();
}
