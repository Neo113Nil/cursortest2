package xsna;

import com.vk.dto.common.GoodAlbum;
import java.util.ArrayList;
import java.util.List;

/* compiled from: StorefrontAlbumsPatch.kt */
/* loaded from: classes18.dex */
public interface kkl0 extends yl50 {

    /* compiled from: StorefrontAlbumsPatch.kt */
    public static final class a implements kkl0 {
        public final int a;
        public final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CountersUpdate(cartCount=");
            sb.append(this.a);
            sb.append(", bookmarkCount=");
            return vu5.b(sb, this.b, ')');
        }
    }

    /* compiled from: StorefrontAlbumsPatch.kt */
    public static final class b implements kkl0 {
        public final mpl0 a;
        public final List<GoodAlbum> b;
        public final int c;
        public final int d;
        public final boolean e;
        public final boolean f;

        /* JADX WARN: Multi-variable type inference failed */
        public b(mpl0 mpl0Var, List<? extends GoodAlbum> list, int i, int i2, boolean z, boolean z2) {
            this.a = mpl0Var;
            this.b = list;
            this.c = i;
            this.d = i2;
            this.e = z;
            this.f = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e && this.f == bVar.f;
        }

        public final int hashCode() {
            mpl0 mpl0Var = this.a;
            return Boolean.hashCode(this.f) + qoy.b(shy.a(this.d, shy.a(this.c, fw3.a((mpl0Var == null ? 0 : mpl0Var.hashCode()) * 31, 31, this.b), 31), 31), 31, this.e);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LoadResult(viewedItems=");
            sb.append(this.a);
            sb.append(", albums=");
            sb.append(this.b);
            sb.append(", offset=");
            sb.append(this.c);
            sb.append(", total=");
            sb.append(this.d);
            sb.append(", canEdit=");
            sb.append(this.e);
            sb.append(", isCartEnabled=");
            return defpackage.q0.a(sb, this.f, ')');
        }
    }

    /* compiled from: StorefrontAlbumsPatch.kt */
    public static final class c implements kkl0 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1315612393;
        }

        public final String toString() {
            return "LoadingError";
        }
    }

    /* compiled from: StorefrontAlbumsPatch.kt */
    public static final class d implements kkl0 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -755120190;
        }

        public final String toString() {
            return "PageLoadStart";
        }
    }

    /* compiled from: StorefrontAlbumsPatch.kt */
    public static final class e implements kkl0 {
        public final ArrayList a;
        public final int b;

        public e(ArrayList arrayList, int i) {
            this.a = arrayList;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a.equals(eVar.a) && this.b == eVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PageResult(albums=");
            sb.append(this.a);
            sb.append(", offset=");
            return vu5.b(sb, this.b, ')');
        }
    }

    /* compiled from: StorefrontAlbumsPatch.kt */
    public static final class f implements kkl0 {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 344911358;
        }

        public final String toString() {
            return "ReloadStart";
        }
    }
}
