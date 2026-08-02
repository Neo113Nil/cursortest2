package xsna;

import com.vk.api.generated.shortVideo.dto.ShortVideoGetPlaylistsResponseDto;
import com.vk.dto.common.id.UserId;

/* compiled from: ClipsPlaylistsSmallFoldersPatch.kt */
/* loaded from: classes16.dex */
public interface cve extends xl50 {

    /* compiled from: ClipsPlaylistsSmallFoldersPatch.kt */
    public static final class a implements cve {
        public static final a b = new a();
    }

    /* compiled from: ClipsPlaylistsSmallFoldersPatch.kt */
    public static final class b implements cve {
        public static final b b = new b();
    }

    /* compiled from: ClipsPlaylistsSmallFoldersPatch.kt */
    public static final class c implements cve {
        public final boolean b;
        public final UserId c;
        public final boolean d;

        public c(boolean z, UserId userId, boolean z2) {
            this.b = z;
            this.c = userId;
            this.d = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.b == cVar.b && epx.f(this.c, cVar.c) && this.d == cVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + bh10.a(Boolean.hashCode(this.b) * 31, 31, this.c.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SetLoading(isOwner=");
            sb.append(this.b);
            sb.append(", ownerId=");
            sb.append(this.c);
            sb.append(", isForNewPage=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: ClipsPlaylistsSmallFoldersPatch.kt */
    public static final class d implements cve {
        public final ShortVideoGetPlaylistsResponseDto b;
        public final boolean c;
        public final UserId d;
        public final boolean e;

        public d(ShortVideoGetPlaylistsResponseDto shortVideoGetPlaylistsResponseDto, boolean z, UserId userId, boolean z2) {
            this.b = shortVideoGetPlaylistsResponseDto;
            this.c = z;
            this.d = userId;
            this.e = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.b, dVar.b) && this.c == dVar.c && epx.f(this.d, dVar.d) && this.e == dVar.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + bh10.a(qoy.b(this.b.hashCode() * 31, 31, this.c), 31, this.d.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UpdateData(loadedItems=");
            sb.append(this.b);
            sb.append(", isOwner=");
            sb.append(this.c);
            sb.append(", ownerId=");
            sb.append(this.d);
            sb.append(", withReset=");
            return defpackage.q0.a(sb, this.e, ')');
        }
    }

    /* compiled from: ClipsPlaylistsSmallFoldersPatch.kt */
    public static final class e implements cve {
        public final boolean b;

        public e(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.b == ((e) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("UpdateTopPadding(hasPadding="), this.b, ')');
        }
    }
}
