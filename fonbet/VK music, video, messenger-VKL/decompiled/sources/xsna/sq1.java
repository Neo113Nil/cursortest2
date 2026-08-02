package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.PhotoAlbum;
import java.util.List;
import xsna.fk1;
import xsna.tlo0;

/* compiled from: AlbumsSideEffect.kt */
/* loaded from: classes4.dex */
public abstract class sq1 {

    /* compiled from: AlbumsSideEffect.kt */
    public static final class a extends sq1 {
        public final PhotoAlbum a;

        public a(PhotoAlbum photoAlbum) {
            this.a = photoAlbum;
        }
    }

    /* compiled from: AlbumsSideEffect.kt */
    public static final class b extends sq1 {
        public final UserId a;

        public b(UserId userId) {
            this.a = userId;
        }
    }

    /* compiled from: AlbumsSideEffect.kt */
    public static final class c extends sq1 {
        public final PhotoAlbum a;
        public final int b;
        public final boolean c;
        public final List<fk1.a> d;

        /* JADX WARN: Multi-variable type inference failed */
        public c(PhotoAlbum photoAlbum, int i, boolean z, List<? extends fk1.a> list) {
            this.a = photoAlbum;
            this.b = i;
            this.c = z;
            this.d = list;
        }
    }

    /* compiled from: AlbumsSideEffect.kt */
    public static final class d extends sq1 {
        public static final d a = new d();
    }

    /* compiled from: AlbumsSideEffect.kt */
    public static final class e extends sq1 {
        public final PhotoAlbum a;

        public e(PhotoAlbum photoAlbum) {
            this.a = photoAlbum;
        }
    }

    /* compiled from: AlbumsSideEffect.kt */
    public static final class f extends sq1 {
        public final tlo0.f a;
        public final tlo0.f b;
        public final tlo0.f c;
        public final km1 d;

        public f(tlo0.f fVar, tlo0.f fVar2, tlo0.f fVar3, km1 km1Var) {
            this.a = fVar;
            this.b = fVar2;
            this.c = fVar3;
            this.d = km1Var;
        }
    }

    /* compiled from: AlbumsSideEffect.kt */
    public static final class g extends sq1 {
        public final j7k0 a;

        public g(j7k0 j7k0Var) {
            this.a = j7k0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.a, ((g) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Snackbar(snackbarData=" + this.a + ')';
        }
    }
}
