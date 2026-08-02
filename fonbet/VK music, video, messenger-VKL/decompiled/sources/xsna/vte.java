package xsna;

import com.vk.api.generated.shortVideo.dto.ShortVideoGetPlaylistsResponseDto;
import com.vk.dto.common.id.UserId;
import java.util.Set;
import xsna.kte;

/* compiled from: ClipsPlaylistsFoldersPatch.kt */
/* loaded from: classes16.dex */
public interface vte extends xl50 {

    /* compiled from: ClipsPlaylistsFoldersPatch.kt */
    public static final class a implements vte {
        public static final a b = new a();
    }

    /* compiled from: ClipsPlaylistsFoldersPatch.kt */
    public static final class b implements vte {
        public final int b;
        public final int c;

        public b(int i, int i2) {
            this.b = i;
            this.c = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.b == bVar.b && this.c == bVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ItemMoved(from=");
            sb.append(this.b);
            sb.append(", to=");
            return vu5.b(sb, this.c, ')');
        }
    }

    /* compiled from: ClipsPlaylistsFoldersPatch.kt */
    public static final class c implements vte {
        public final int b;

        public c(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.b == ((c) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("ItemPickChanged(newPickId="), this.b, ')');
        }
    }

    /* compiled from: ClipsPlaylistsFoldersPatch.kt */
    public static final class d implements vte {
        public final Object b;

        public d(kte.b bVar) {
            this.b = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.b.equals(((d) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return k73.c(new StringBuilder("SetError(owners="), this.b, ')');
        }
    }

    /* compiled from: ClipsPlaylistsFoldersPatch.kt */
    public static final class e implements vte {
        public static final e b = new e();
    }

    /* compiled from: ClipsPlaylistsFoldersPatch.kt */
    public static final class f implements vte {
        public final boolean b;

        public f(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.b == ((f) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("ToggleTargetPickerVisibility(isVisible="), this.b, ')');
        }
    }

    /* compiled from: ClipsPlaylistsFoldersPatch.kt */
    public static final class g implements vte {
        public final ShortVideoGetPlaylistsResponseDto b;
        public final Set<Integer> c;

        public g(ShortVideoGetPlaylistsResponseDto shortVideoGetPlaylistsResponseDto, Set<Integer> set) {
            this.b = shortVideoGetPlaylistsResponseDto;
            this.c = set;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return epx.f(this.b, gVar.b) && epx.f(this.c, gVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UpdateData(loadedItems=");
            sb.append(this.b);
            sb.append(", selectedIds=");
            return ur.c(sb, this.c, ')');
        }
    }

    /* compiled from: ClipsPlaylistsFoldersPatch.kt */
    public static final class h implements vte {
        public final ShortVideoGetPlaylistsResponseDto b;
        public final Set<Integer> c;
        public final Object d;
        public final UserId e;

        public h(ShortVideoGetPlaylistsResponseDto shortVideoGetPlaylistsResponseDto, Set<Integer> set, kte.b bVar, UserId userId) {
            this.b = shortVideoGetPlaylistsResponseDto;
            this.c = set;
            this.d = bVar;
            this.e = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return epx.f(this.b, hVar.b) && epx.f(this.c, hVar.c) && this.d.equals(hVar.d) && epx.f(this.e, hVar.e);
        }

        public final int hashCode() {
            return Long.hashCode(this.e.b) + vul0.a(fw3.b(this.b.hashCode() * 31, 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UpdateInit(loadedItems=");
            sb.append(this.b);
            sb.append(", selectedIds=");
            sb.append(this.c);
            sb.append(", availableAuthors=");
            sb.append(this.d);
            sb.append(", selectedAuthor=");
            return gp.b(sb, this.e, ')');
        }
    }
}
