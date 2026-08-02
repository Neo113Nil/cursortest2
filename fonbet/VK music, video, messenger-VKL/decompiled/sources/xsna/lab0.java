package xsna;

import com.vk.music.playlist.framework.presentation.PlaylistScreenContentType;
import com.vk.music.playlist.framework.presentation.track.MusicTrackPlayState;

/* compiled from: PlaylistItem.kt */
/* loaded from: classes3.dex */
public interface lab0 {

    /* compiled from: PlaylistItem.kt */
    public static final class a implements lab0 {
        public final String a;
        public final Object b;
        public final String c;
        public final String d;
        public final String e;
        public final boolean f;
        public final boolean g;
        public final MusicTrackPlayState h;
        public final bi40 i;
        public final long j;
        public final boolean k;
        public final int l;
        public final PlaylistScreenContentType m = PlaylistScreenContentType.TRACK_ITEM;

        public a(String str, Object obj, String str2, String str3, String str4, boolean z, boolean z2, MusicTrackPlayState musicTrackPlayState, bi40 bi40Var, long j, boolean z3, int i) {
            this.a = str;
            this.b = obj;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = z;
            this.g = z2;
            this.h = musicTrackPlayState;
            this.i = bi40Var;
            this.j = j;
            this.k = z3;
            this.l = i;
        }

        public static a a(a aVar, MusicTrackPlayState musicTrackPlayState, bi40 bi40Var, int i) {
            return new a(aVar.a, aVar.b, aVar.c, aVar.d, aVar.e, aVar.f, aVar.g, (i & 128) != 0 ? aVar.h : musicTrackPlayState, (i & 256) != 0 ? aVar.i : bi40Var, aVar.j, aVar.k, aVar.l);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && this.f == aVar.f && this.g == aVar.g && this.h == aVar.h && epx.f(this.i, aVar.i) && this.j == aVar.j && this.k == aVar.k && this.l == aVar.l;
        }

        @Override // xsna.lab0
        public final PlaylistScreenContentType getContentType() {
            return this.m;
        }

        @Override // xsna.lab0
        public final String getKey() {
            return this.a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.l) + qoy.b(bh10.a((this.i.hashCode() + ((this.h.hashCode() + qoy.b(qoy.b(urd0.a(urd0.a(urd0.a((qow.a(this.b) + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g)) * 31)) * 31, 31, this.j), 31, this.k);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MusicTrackData(mid=");
            sb.append(this.a);
            sb.append(", image=");
            sb.append((Object) qow.b(this.b));
            sb.append(", artist=");
            sb.append(this.c);
            sb.append(", title=");
            sb.append(this.d);
            sb.append(", subtitle=");
            sb.append(this.e);
            sb.append(", isExplicit=");
            sb.append(this.f);
            sb.append(", isEnabled=");
            sb.append(this.g);
            sb.append(", playState=");
            sb.append(this.h);
            sb.append(", downloadingState=");
            sb.append(this.i);
            sb.append(", duration=");
            sb.append(this.j);
            sb.append(", isFocusTrack=");
            sb.append(this.k);
            sb.append(", trackIndex=");
            return vu5.b(sb, this.l, ')');
        }
    }

    /* compiled from: PlaylistItem.kt */
    public static final class b implements lab0 {
        public final String a;
        public final PlaylistScreenContentType b = PlaylistScreenContentType.PART_ITEM;

        public b(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        @Override // xsna.lab0
        public final PlaylistScreenContentType getContentType() {
            return this.b;
        }

        @Override // xsna.lab0
        public final String getKey() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("PartData(part="), this.a, ')');
        }
    }

    PlaylistScreenContentType getContentType();

    String getKey();
}
