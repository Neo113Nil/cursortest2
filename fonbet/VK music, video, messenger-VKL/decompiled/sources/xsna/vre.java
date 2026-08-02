package xsna;

import com.vk.clips.playlists.playlist_ui.model.ClipsPlaylistUiLoadingState;
import com.vk.clips.playlists.playlist_ui.model.OverlayViewState;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import java.util.List;

/* compiled from: ClipsPlaylistUiState.kt */
/* loaded from: classes16.dex */
public interface vre extends km50 {

    /* compiled from: ClipsPlaylistUiState.kt */
    public static final class a extends d {
        public final String f;
        public final Integer g;
        public final int h;
        public final UserId i;
        public final String j;
        public final boolean k;

        public a(String str, Integer num, int i, UserId userId, String str2, boolean z) {
            super(userId, i, num, str);
            this.f = str;
            this.g = num;
            this.h = i;
            this.i = userId;
            this.j = str2;
            this.k = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f.equals(aVar.f) && epx.f(this.g, aVar.g) && this.h == aVar.h && epx.f(this.i, aVar.i) && epx.f(this.j, aVar.j) && this.k == aVar.k;
        }

        @Override // xsna.vre.d, xsna.vre
        public final Integer getCount() {
            return this.g;
        }

        @Override // xsna.vre.d, xsna.vre
        public final String getTitle() {
            return this.f;
        }

        public final int hashCode() {
            int hashCode = this.f.hashCode() * 31;
            Integer num = this.g;
            int a = bh10.a(shy.a(this.h, (hashCode + (num == null ? 0 : num.hashCode())) * 31, 31), 31, this.i.b);
            String str = this.j;
            return Boolean.hashCode(this.k) + ((a + (str != null ? str.hashCode() : 0)) * 31);
        }

        @Override // xsna.vre.d, xsna.vre
        public final Integer i() {
            return Integer.valueOf(this.h);
        }

        @Override // xsna.vre.d, xsna.vre
        public final UserId q() {
            return this.i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Error(title=");
            sb.append(this.f);
            sb.append(", count=");
            sb.append(this.g);
            sb.append(", playlistId=");
            sb.append(this.h);
            sb.append(", ownerId=");
            sb.append(this.i);
            sb.append(", highlightedClipId=");
            sb.append(this.j);
            sb.append(", isReloadPlaylist=");
            return defpackage.q0.a(sb, this.k, ')');
        }
    }

    /* compiled from: ClipsPlaylistUiState.kt */
    public static final class b extends d {
        public final List<VideoFile> f;
        public final String g;
        public final String h;
        public final Integer i;
        public final int j;
        public final boolean k;
        public final OverlayViewState l;
        public final String m;
        public final String n;
        public final ClipsPlaylistUiLoadingState o;
        public final boolean p;
        public final UserId q;
        public final tre r;
        public final Integer s;

        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends VideoFile> list, String str, String str2, Integer num, int i, boolean z, OverlayViewState overlayViewState, String str3, String str4, ClipsPlaylistUiLoadingState clipsPlaylistUiLoadingState, boolean z2, UserId userId, tre treVar, Integer num2) {
            super(userId, i, num, str2);
            this.f = list;
            this.g = str;
            this.h = str2;
            this.i = num;
            this.j = i;
            this.k = z;
            this.l = overlayViewState;
            this.m = str3;
            this.n = str4;
            this.o = clipsPlaylistUiLoadingState;
            this.p = z2;
            this.q = userId;
            this.r = treVar;
            this.s = num2;
        }

        public static b a(b bVar, List list, String str, boolean z, OverlayViewState overlayViewState, String str2, ClipsPlaylistUiLoadingState clipsPlaylistUiLoadingState, tre treVar, Integer num, int i) {
            List list2 = (i & 1) != 0 ? bVar.f : list;
            String str3 = (i & 2) != 0 ? bVar.g : str;
            String str4 = bVar.h;
            Integer num2 = bVar.i;
            int i2 = bVar.j;
            boolean z2 = (i & 32) != 0 ? bVar.k : z;
            OverlayViewState overlayViewState2 = (i & 64) != 0 ? bVar.l : overlayViewState;
            String str5 = (i & 128) != 0 ? bVar.m : str2;
            String str6 = (i & 256) != 0 ? bVar.n : null;
            ClipsPlaylistUiLoadingState clipsPlaylistUiLoadingState2 = (i & 512) != 0 ? bVar.o : clipsPlaylistUiLoadingState;
            boolean z3 = bVar.p;
            UserId userId = bVar.q;
            tre treVar2 = (i & 4096) != 0 ? bVar.r : treVar;
            Integer num3 = (i & 8192) != 0 ? bVar.s : num;
            bVar.getClass();
            return new b(list2, str3, str4, num2, i2, z2, overlayViewState2, str5, str6, clipsPlaylistUiLoadingState2, z3, userId, treVar2, num3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.f, bVar.f) && epx.f(this.g, bVar.g) && epx.f(this.h, bVar.h) && epx.f(this.i, bVar.i) && this.j == bVar.j && this.k == bVar.k && this.l == bVar.l && epx.f(this.m, bVar.m) && epx.f(this.n, bVar.n) && this.o == bVar.o && this.p == bVar.p && epx.f(this.q, bVar.q) && epx.f(this.r, bVar.r) && epx.f(this.s, bVar.s);
        }

        @Override // xsna.vre.d, xsna.vre
        public final Integer getCount() {
            return this.i;
        }

        @Override // xsna.vre.d, xsna.vre
        public final String getTitle() {
            return this.h;
        }

        public final int hashCode() {
            int hashCode = this.f.hashCode() * 31;
            String str = this.g;
            int a = urd0.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.h);
            Integer num = this.i;
            int hashCode2 = (this.l.hashCode() + qoy.b(shy.a(this.j, (a + (num == null ? 0 : num.hashCode())) * 31, 31), 31, this.k)) * 31;
            String str2 = this.m;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.n;
            int hashCode4 = (this.r.hashCode() + bh10.a(qoy.b((this.o.hashCode() + ((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31, 31, this.p), 31, this.q.b)) * 31;
            Integer num2 = this.s;
            return hashCode4 + (num2 != null ? num2.hashCode() : 0);
        }

        @Override // xsna.vre.d, xsna.vre
        public final Integer i() {
            return Integer.valueOf(this.j);
        }

        @Override // xsna.vre.d, xsna.vre
        public final UserId q() {
            return this.q;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Loaded(list=");
            sb.append(this.f);
            sb.append(", nextFrom=");
            sb.append(this.g);
            sb.append(", title=");
            sb.append(this.h);
            sb.append(", count=");
            sb.append(this.i);
            sb.append(", playlistId=");
            sb.append(this.j);
            sb.append(", popupVisible=");
            sb.append(this.k);
            sb.append(", overlayViewState=");
            sb.append(this.l);
            sb.append(", prevFrom=");
            sb.append(this.m);
            sb.append(", highlightedClipId=");
            sb.append(this.n);
            sb.append(", loadingState=");
            sb.append(this.o);
            sb.append(", canEdit=");
            sb.append(this.p);
            sb.append(", ownerId=");
            sb.append(this.q);
            sb.append(", reorderState=");
            sb.append(this.r);
            sb.append(", topOffset=");
            return uqi.b(sb, this.s, ')');
        }
    }

    /* compiled from: ClipsPlaylistUiState.kt */
    public static final class c extends d {
        public final String f;
        public final Integer g;
        public final int h;
        public final String i;
        public final UserId j;

        public c(int i, Integer num, UserId userId, String str, String str2) {
            super(userId, i, num, str);
            this.f = str;
            this.g = num;
            this.h = i;
            this.i = str2;
            this.j = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.f, cVar.f) && epx.f(this.g, cVar.g) && this.h == cVar.h && epx.f(this.i, cVar.i) && epx.f(this.j, cVar.j);
        }

        @Override // xsna.vre.d, xsna.vre
        public final Integer getCount() {
            return this.g;
        }

        @Override // xsna.vre.d, xsna.vre
        public final String getTitle() {
            return this.f;
        }

        public final int hashCode() {
            int hashCode = this.f.hashCode() * 31;
            Integer num = this.g;
            int a = shy.a(this.h, (hashCode + (num == null ? 0 : num.hashCode())) * 31, 31);
            String str = this.i;
            return Long.hashCode(this.j.b) + ((a + (str != null ? str.hashCode() : 0)) * 31);
        }

        @Override // xsna.vre.d, xsna.vre
        public final Integer i() {
            return Integer.valueOf(this.h);
        }

        @Override // xsna.vre.d, xsna.vre
        public final UserId q() {
            return this.j;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Loading(title=");
            sb.append(this.f);
            sb.append(", count=");
            sb.append(this.g);
            sb.append(", playlistId=");
            sb.append(this.h);
            sb.append(", highlightedClipId=");
            sb.append(this.i);
            sb.append(", ownerId=");
            return gp.b(sb, this.j, ')');
        }
    }

    /* compiled from: ClipsPlaylistUiState.kt */
    public static abstract class d implements vre {
        public final String b;
        public final Integer c;
        public final int d;
        public final UserId e;

        public d(UserId userId, int i, Integer num, String str) {
            this.b = str;
            this.c = num;
            this.d = i;
            this.e = userId;
        }

        @Override // xsna.vre
        public Integer getCount() {
            return this.c;
        }

        @Override // xsna.vre
        public String getTitle() {
            return this.b;
        }

        @Override // xsna.vre
        public Integer i() {
            return Integer.valueOf(this.d);
        }

        @Override // xsna.vre
        public UserId q() {
            return this.e;
        }
    }

    Integer getCount();

    String getTitle();

    Integer i();

    UserId q();
}
