package xsna;

import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoAlbum;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.builders.ListBuilder;
import xsna.d8a0;
import xsna.tlo0;

/* compiled from: PhotoFlowSideEffect.kt */
/* loaded from: classes4.dex */
public abstract class b9a0 {

    /* compiled from: PhotoFlowSideEffect.kt */
    public static final class a extends b9a0 {
        public static final a a = new a();
    }

    /* compiled from: PhotoFlowSideEffect.kt */
    public static final class b extends b9a0 {
        public static final b a = new b();
    }

    /* compiled from: PhotoFlowSideEffect.kt */
    public static abstract class c extends b9a0 {

        /* compiled from: PhotoFlowSideEffect.kt */
        public static final class a extends c {
            public final Photo a;
            public final String b;

            public a(Photo photo, String str) {
                this.a = photo;
                this.b = str;
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
                int hashCode = this.a.hashCode() * 31;
                String str = this.b;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("DeletePhoto(photo=");
                sb.append(this.a);
                sb.append(", albumTitle=");
                return ho8.a(sb, this.b, ')');
            }
        }

        /* compiled from: PhotoFlowSideEffect.kt */
        public static final class b extends c {
            public final ArrayList a;

            public b(ArrayList arrayList) {
                this.a = arrayList;
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
                return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("DeletePhotos(photos="), this.a);
            }
        }

        /* compiled from: PhotoFlowSideEffect.kt */
        /* renamed from: xsna.b9a0$c$c, reason: collision with other inner class name */
        public static final class C2599c extends c {
            public final tlo0.f a;
            public final tlo0 b;
            public final gzs<s3q0> c;

            public C2599c(gzs gzsVar, tlo0.f fVar, tlo0 tlo0Var) {
                this.a = fVar;
                this.b = tlo0Var;
                this.c = gzsVar;
            }
        }

        /* compiled from: PhotoFlowSideEffect.kt */
        public static final class d extends c {
            public final List<d8a0.a> a;

            public d(ListBuilder listBuilder) {
                this.a = listBuilder;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ms9.a(')', new StringBuilder("MultiSelectMenu(items="), this.a);
            }
        }

        /* compiled from: PhotoFlowSideEffect.kt */
        public static final class e extends c {
            public final Photo a;
            public final int b;
            public final List<d8a0.b> c;

            public e(Photo photo, int i, ListBuilder listBuilder) {
                this.a = photo;
                this.b = i;
                this.c = listBuilder;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return epx.f(this.a, eVar.a) && this.b == eVar.b && epx.f(this.c, eVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + shy.a(this.b, this.a.hashCode() * 31, 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("SinglePhotoMenu(photo=");
                sb.append(this.a);
                sb.append(", absoluteAdapterPosition=");
                sb.append(this.b);
                sb.append(", items=");
                return ms9.a(')', sb, this.c);
            }
        }
    }

    /* compiled from: PhotoFlowSideEffect.kt */
    public static abstract class d extends b9a0 {

        /* compiled from: PhotoFlowSideEffect.kt */
        public static final class a extends d {
            public final List<String> a;

            public a(List<String> list) {
                this.a = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ms9.a(')', new StringBuilder("MultiplePhotos(photosUrls="), this.a);
            }
        }

        /* compiled from: PhotoFlowSideEffect.kt */
        public static final class b extends d {
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
                return ho8.a(new StringBuilder("SinglePhoto(photoUrl="), this.a, ')');
            }
        }
    }

    /* compiled from: PhotoFlowSideEffect.kt */
    public static final class e extends b9a0 {
        public final long a;

        public e(long j) {
            this.a = j;
        }
    }

    /* compiled from: PhotoFlowSideEffect.kt */
    public static abstract class f extends b9a0 {

        /* compiled from: PhotoFlowSideEffect.kt */
        public static final class a extends f {
            public final List<String> a;

            public a(List<String> list) {
                this.a = list;
            }
        }

        /* compiled from: PhotoFlowSideEffect.kt */
        public static final class b extends f {
            public final Photo a;

            public b(Photo photo) {
                this.a = photo;
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
                return tq.c(new StringBuilder("SharePhoto(photo="), this.a, ')');
            }
        }

        /* compiled from: PhotoFlowSideEffect.kt */
        public static final class c extends f {
            public final ArrayList a;

            public c(ArrayList arrayList) {
                this.a = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("SharePhotos(photos="), this.a);
            }
        }

        /* compiled from: PhotoFlowSideEffect.kt */
        public static final class d extends f {
            public final PhotoAlbum a;

            public d(PhotoAlbum photoAlbum) {
                this.a = photoAlbum;
            }
        }

        /* compiled from: PhotoFlowSideEffect.kt */
        public static final class e extends f {
            public final UserId a;
            public final int b;

            public e(UserId userId, int i) {
                this.a = userId;
                this.b = i;
            }
        }

        /* compiled from: PhotoFlowSideEffect.kt */
        /* renamed from: xsna.b9a0$f$f, reason: collision with other inner class name */
        public static final class C2600f extends f {
            public final List<Photo> a;
            public final Set<Integer> b;
            public final boolean c;

            public C2600f() {
                throw null;
            }

            public C2600f(Set set, List list) {
                this.a = list;
                this.b = set;
                this.c = true;
            }
        }

        /* compiled from: PhotoFlowSideEffect.kt */
        public static final class g extends f {
            public final int a;
            public final int b;

            public g(int i, int i2) {
                this.a = i;
                this.b = i2;
            }
        }

        /* compiled from: PhotoFlowSideEffect.kt */
        public static final class h extends f {
            public final int a;
            public final VKList<Photo> b;

            public h(int i, VKList<Photo> vKList) {
                this.a = i;
                this.b = vKList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof h)) {
                    return false;
                }
                h hVar = (h) obj;
                return this.a == hVar.a && epx.f(this.b, hVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
            }

            public final String toString() {
                return "ToPhotoViewer(photoPosition=" + this.a + ", photos=" + this.b + ')';
            }
        }

        /* compiled from: PhotoFlowSideEffect.kt */
        public static final class i extends f {
            public static final i a = new i();
        }
    }

    /* compiled from: PhotoFlowSideEffect.kt */
    public static final class g extends b9a0 {
        public static final g a = new g();
    }

    /* compiled from: PhotoFlowSideEffect.kt */
    public static final class h extends b9a0 {
        public static final h a = new h();
    }

    /* compiled from: PhotoFlowSideEffect.kt */
    public static final class i extends b9a0 {
        public static final i a = new i();
    }

    /* compiled from: PhotoFlowSideEffect.kt */
    public static final class j extends b9a0 {
    }

    /* compiled from: PhotoFlowSideEffect.kt */
    public static final class k extends b9a0 {
        public final j7k0 a;

        public k(j7k0 j7k0Var) {
            this.a = j7k0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && epx.f(this.a, ((k) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Snackbar(snackbarData=" + this.a + ')';
        }
    }
}
