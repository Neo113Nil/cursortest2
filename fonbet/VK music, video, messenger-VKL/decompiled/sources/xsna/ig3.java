package xsna;

import com.vk.dto.common.data.VKList;
import com.vk.dto.photo.Photo;
import com.vk.photos.root.selectalbum.domain.PhotoAlbumWrapper;
import java.util.List;
import java.util.Set;
import xsna.oi3;

/* compiled from: ArchiveAction.kt */
/* loaded from: classes4.dex */
public abstract class ig3 implements kj50 {

    /* compiled from: ArchiveAction.kt */
    public static final class a extends ig3 {
        public final VKList<Photo> b;
        public final boolean c;
        public final boolean d;

        public a(VKList<Photo> vKList, boolean z, boolean z2) {
            this.b = vKList;
            this.c = z;
            this.d = z2;
        }
    }

    /* compiled from: ArchiveAction.kt */
    public static final class b extends ig3 {
        public static final b b = new b();
    }

    /* compiled from: ArchiveAction.kt */
    public static final class c extends ig3 {
        public static final c b = new c();
    }

    /* compiled from: ArchiveAction.kt */
    public static final class d extends ig3 {
    }

    /* compiled from: ArchiveAction.kt */
    public static abstract class e extends ig3 {

        /* compiled from: ArchiveAction.kt */
        public static final class a extends e {
            public static final a b = new a();
        }

        /* compiled from: ArchiveAction.kt */
        public static final class b extends e {
            public final List<String> b;

            public b(List<String> list) {
                this.b = list;
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
                return ms9.a(')', new StringBuilder("DownloadFailure(photosUrls="), this.b);
            }
        }

        /* compiled from: ArchiveAction.kt */
        public static final class c extends e {
            public static final c b = new c();
        }

        /* compiled from: ArchiveAction.kt */
        public static final class d extends e {
            public final oi3.a b;

            public d(oi3.a aVar) {
                this.b = aVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "PopupMenuItemClicked(item=" + this.b + ')';
            }
        }

        /* compiled from: ArchiveAction.kt */
        /* renamed from: xsna.ig3$e$e, reason: collision with other inner class name */
        public static final class C3054e extends e {
            public final Set<Photo> b;

            /* JADX WARN: Multi-variable type inference failed */
            public C3054e(Set<? extends Photo> set) {
                this.b = set;
            }
        }
    }

    /* compiled from: ArchiveAction.kt */
    public static final class g extends ig3 {
        public final Photo b;

        public g(Photo photo) {
            this.b = photo;
        }
    }

    /* compiled from: ArchiveAction.kt */
    public static final class h extends ig3 {
        public final Photo b;

        public h(Photo photo) {
            this.b = photo;
        }
    }

    /* compiled from: ArchiveAction.kt */
    public static final class i extends ig3 {
        public final boolean b;

        public i(boolean z) {
            this.b = z;
        }
    }

    /* compiled from: ArchiveAction.kt */
    public static final class j extends ig3 {
        public static final j b = new j();
    }

    /* compiled from: ArchiveAction.kt */
    public static abstract class k extends ig3 {

        /* compiled from: ArchiveAction.kt */
        public static final class a extends k {
            public final Photo b;

            public a(Photo photo) {
                this.b = photo;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return tq.c(new StringBuilder("Click(photo="), this.b, ')');
            }
        }

        /* compiled from: ArchiveAction.kt */
        public static final class b extends k {
            public final Photo b;

            public b(Photo photo) {
                this.b = photo;
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
                return tq.c(new StringBuilder("DeleteConfirmation(photo="), this.b, ')');
            }
        }

        /* compiled from: ArchiveAction.kt */
        public static final class c extends k {
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
                return ho8.a(new StringBuilder("DownloadFailure(photoUrl="), this.b, ')');
            }
        }

        /* compiled from: ArchiveAction.kt */
        public static final class d extends k {
            public static final d b = new d();
        }

        /* compiled from: ArchiveAction.kt */
        public static final class e extends k {
            public final oi3.b b;
            public final Photo c;

            public e(oi3.b bVar, Photo photo) {
                this.b = bVar;
                this.c = photo;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return epx.f(this.b, eVar.b) && epx.f(this.c, eVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("PopupMenuItemClicked(item=");
                sb.append(this.b);
                sb.append(", photo=");
                return tq.c(sb, this.c, ')');
            }
        }

        /* compiled from: ArchiveAction.kt */
        public static final class f extends k {
            public final Photo b;

            public f(Photo photo) {
                this.b = photo;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && epx.f(this.b, ((f) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return tq.c(new StringBuilder("RetryDelete(photo="), this.b, ')');
            }
        }

        /* compiled from: ArchiveAction.kt */
        public static final class g extends k {
            public final Photo b;
            public final int c;

            public g(int i, Photo photo) {
                this.b = photo;
                this.c = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return epx.f(this.b, gVar.b) && this.c == gVar.c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ShowMenu(photo=");
                sb.append(this.b);
                sb.append(", adapterPosition=");
                return vu5.b(sb, this.c, ')');
            }
        }
    }

    /* compiled from: ArchiveAction.kt */
    public static final class l extends ig3 {
        public final Photo b;
        public final boolean c;

        public l(Photo photo, boolean z) {
            this.b = photo;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return epx.f(this.b, lVar.b) && this.c == lVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UnBlurPhoto(photo=");
            sb.append(this.b);
            sb.append(", isOwner=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: ArchiveAction.kt */
    public static final class m extends ig3 {
        public final PhotoAlbumWrapper b;

        public m(PhotoAlbumWrapper photoAlbumWrapper) {
            this.b = photoAlbumWrapper;
        }
    }

    /* compiled from: ArchiveAction.kt */
    public static final class f extends ig3 {
        public final boolean b;
        public final Photo c;

        public f(Photo photo, boolean z) {
            this.b = z;
            this.c = photo;
        }

        public /* synthetic */ f() {
            this(null, false);
        }
    }
}
