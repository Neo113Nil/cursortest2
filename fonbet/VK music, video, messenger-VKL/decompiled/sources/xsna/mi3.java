package xsna;

import com.vk.dto.common.data.VKList;
import com.vk.dto.photo.Photo;
import java.util.Set;

/* compiled from: ArchivePatch.kt */
/* loaded from: classes4.dex */
public abstract class mi3 implements xl50 {

    /* compiled from: ArchivePatch.kt */
    public static final class a extends mi3 {
        public final boolean b;

        public a(boolean z) {
            this.b = z;
        }
    }

    /* compiled from: ArchivePatch.kt */
    public static final class b extends mi3 {
        public final VKList<Photo> b;
        public final boolean c;
        public final boolean d;

        public b(VKList<Photo> vKList, boolean z, boolean z2) {
            this.b = vKList;
            this.c = z;
            this.d = z2;
        }
    }

    /* compiled from: ArchivePatch.kt */
    public static final class c extends mi3 {
    }

    /* compiled from: ArchivePatch.kt */
    public static final class d extends mi3 {
        public final Set<Integer> b;

        public d(Set<Integer> set) {
            this.b = set;
        }
    }

    /* compiled from: ArchivePatch.kt */
    public static final class e extends mi3 {
        public final Photo b;

        public e(Photo photo) {
            this.b = photo;
        }
    }

    /* compiled from: ArchivePatch.kt */
    public static final class f extends mi3 {
        public final Photo b;

        public f(Photo photo) {
            this.b = photo;
        }
    }

    /* compiled from: ArchivePatch.kt */
    public static final class g extends mi3 {
        public final Set<Integer> b;

        public g(Set<Integer> set) {
            this.b = set;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.b, ((g) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ur.c(new StringBuilder("PhotosUnBlurred(unBlurredPhotoIds="), this.b, ')');
        }
    }

    /* compiled from: ArchivePatch.kt */
    public static final class h extends mi3 {
        public final boolean b;

        public h(boolean z) {
            this.b = z;
        }
    }

    /* compiled from: ArchivePatch.kt */
    public static final class i extends mi3 {
        public final boolean b = true;
    }
}
