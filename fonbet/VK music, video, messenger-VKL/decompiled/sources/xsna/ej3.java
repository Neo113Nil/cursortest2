package xsna;

import com.vk.dto.common.data.VKList;
import com.vk.dto.photo.Photo;
import java.util.Set;
import kotlin.collections.EmptySet;

/* compiled from: ArchiveState.kt */
/* loaded from: classes4.dex */
public final class ej3 implements km50 {
    public static final ej3 f;
    public final boolean b;
    public final a c;
    public final boolean d;
    public final boolean e;

    /* compiled from: ArchiveState.kt */
    public static final class a {
        public final VKList<Photo> a;
        public final Set<Photo> b;
        public final boolean c;
        public final Set<Integer> d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(VKList<Photo> vKList, Set<? extends Photo> set, boolean z, Set<Integer> set2) {
            this.a = vKList;
            this.b = set;
            this.c = z;
            this.d = set2;
        }

        public static a a(a aVar, VKList vKList, Set set, boolean z, Set set2, int i) {
            if ((i & 1) != 0) {
                vKList = aVar.a;
            }
            if ((i & 2) != 0) {
                set = aVar.b;
            }
            if ((i & 4) != 0) {
                z = aVar.c;
            }
            if ((i & 8) != 0) {
                set2 = aVar.d;
            }
            aVar.getClass();
            return new a(vKList, set, z, set2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            VKList<Photo> vKList = this.a;
            return this.d.hashCode() + qoy.b(fw3.b((vKList == null ? 0 : vKList.hashCode()) * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PhotosState(items=");
            sb.append(this.a);
            sb.append(", selected=");
            sb.append(this.b);
            sb.append(", isLastPageLoaded=");
            sb.append(this.c);
            sb.append(", unBlurredPhotoIds=");
            return ur.c(sb, this.d, ')');
        }
    }

    static {
        EmptySet emptySet = EmptySet.b;
        f = new ej3(true, new a(null, emptySet, false, emptySet), false, false);
    }

    public ej3(boolean z, a aVar, boolean z2, boolean z3) {
        this.b = z;
        this.c = aVar;
        this.d = z2;
        this.e = z3;
    }

    public static ej3 a(ej3 ej3Var, boolean z, a aVar, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            z = ej3Var.b;
        }
        if ((i & 2) != 0) {
            aVar = ej3Var.c;
        }
        if ((i & 4) != 0) {
            z2 = ej3Var.d;
        }
        if ((i & 8) != 0) {
            z3 = ej3Var.e;
        }
        ej3Var.getClass();
        return new ej3(z, aVar, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ej3)) {
            return false;
        }
        ej3 ej3Var = (ej3) obj;
        return this.b == ej3Var.b && epx.f(this.c, ej3Var.c) && this.d == ej3Var.d && this.e == ej3Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + qoy.b((this.c.hashCode() + (Boolean.hashCode(this.b) * 31)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArchiveState(showSkeleton=");
        sb.append(this.b);
        sb.append(", photos=");
        sb.append(this.c);
        sb.append(", showLoader=");
        sb.append(this.d);
        sb.append(", multiSelectMode=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
