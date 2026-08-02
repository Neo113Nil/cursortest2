package xsna;

import com.vk.clips.sdk.shared.FavoriteFolderId;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ClipsFavoritesEventsSource.kt */
/* loaded from: classes16.dex */
public interface d4e {

    /* compiled from: ClipsFavoritesEventsSource.kt */
    public interface a {

        /* compiled from: ClipsFavoritesEventsSource.kt */
        /* renamed from: xsna.d4e$a$a, reason: collision with other inner class name */
        public static final class C2703a implements a {
            public final FavoriteFolderId a;
            public final List<String> b;

            public C2703a(FavoriteFolderId favoriteFolderId, List<String> list) {
                this.a = favoriteFolderId;
                this.b = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2703a)) {
                    return false;
                }
                C2703a c2703a = (C2703a) obj;
                return epx.f(this.a, c2703a.a) && epx.f(this.b, c2703a.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ClipsAddedToFolder(folderId=");
                sb.append(this.a);
                sb.append(", videoUniqueKeys=");
                return ms9.a(')', sb, this.b);
            }
        }

        /* compiled from: ClipsFavoritesEventsSource.kt */
        public static final class b implements a {
            public final FavoriteFolderId a;
            public final FavoriteFolderId b;
            public final ArrayList c;

            public b(FavoriteFolderId favoriteFolderId, FavoriteFolderId favoriteFolderId2, ArrayList arrayList) {
                this.a = favoriteFolderId;
                this.b = favoriteFolderId2;
                this.c = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.a.equals(bVar.a) && epx.f(this.b, bVar.b) && this.c.equals(bVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ClipsMoved(sourceFolderId=");
                sb.append(this.a);
                sb.append(", targetFolderId=");
                sb.append(this.b);
                sb.append(", videoUniqueKeys=");
                return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.c);
            }
        }

        /* compiled from: ClipsFavoritesEventsSource.kt */
        public static final class c implements a {
            public final FavoriteFolderId a;
            public final List<String> b;

            public c(FavoriteFolderId favoriteFolderId, List<String> list) {
                this.a = favoriteFolderId;
                this.b = list;
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
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ClipsRemovedFromFolder(folderId=");
                sb.append(this.a);
                sb.append(", videoUniqueKeys=");
                return ms9.a(')', sb, this.b);
            }
        }

        /* compiled from: ClipsFavoritesEventsSource.kt */
        public static final class d implements a {
            public final u2e a;

            public d(u2e u2eVar) {
                this.a = u2eVar;
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
                return "FolderCreated(folder=" + this.a + ')';
            }
        }

        /* compiled from: ClipsFavoritesEventsSource.kt */
        public static final class e implements a {
            public final FavoriteFolderId a;

            public e(FavoriteFolderId favoriteFolderId) {
                this.a = favoriteFolderId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "FolderRemoved(folderId=" + this.a + ')';
            }
        }

        /* compiled from: ClipsFavoritesEventsSource.kt */
        public static final class f implements a {
            public final u2e a;

            public f(u2e u2eVar) {
                this.a = u2eVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && epx.f(this.a, ((f) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "FolderUpdated(folder=" + this.a + ')';
            }
        }
    }

    io.reactivex.rxjava3.core.q<a.e> a();

    io.reactivex.rxjava3.core.q<a.f> b();

    io.reactivex.rxjava3.core.q<a.b> c();

    io.reactivex.rxjava3.core.q<a.C2703a> d();

    io.reactivex.rxjava3.core.q<a.c> e();

    io.reactivex.rxjava3.core.q<a.d> f();
}
