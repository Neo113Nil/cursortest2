package xsna;

import com.vk.dto.photo.PhotoAlbum;

/* compiled from: AlbumPickerViewState.kt */
/* loaded from: classes5.dex */
public final class ek1 implements ao50 {
    public final fi50 a;

    /* compiled from: AlbumPickerViewState.kt */
    public static final class a implements fm50<ak1> {
        public final yzt0<wia0<PhotoAlbum>> a;
        public final yzt0<ewp> b;
        public final yzt0<Boolean> c;

        public a(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + sr.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(result=");
            sb.append(this.a);
            sb.append(", error=");
            sb.append(this.b);
            sb.append(", loading=");
            return tr.c(sb, this.c, ')');
        }
    }

    public ek1(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
