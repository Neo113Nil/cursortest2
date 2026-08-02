package xsna;

import android.util.LruCache;
import com.vk.dto.common.ImageSize;
import java.util.Collections;
import java.util.List;

/* compiled from: VoipAvatar.kt */
/* loaded from: classes7.dex */
public class sew0 {
    public static final LruCache<String, fxj0> a = new LruCache<>(100);

    /* compiled from: VoipAvatar.kt */
    public static final class a {
        public static b a(String str, String str2, boolean z) {
            fxj0 fxj0Var;
            fxj0 e = e(100, str, false);
            if (str2 != null) {
                LruCache<String, fxj0> lruCache = sew0.a;
                fxj0Var = e(400, str2, false);
            } else {
                fxj0Var = null;
            }
            return new b(rl3.I(new fxj0[]{e, fxj0Var}), z, false);
        }

        public static b b(String str, boolean z, boolean z2) {
            return new b(Collections.singletonList(e(100, str, z2)), z, z2);
        }

        public static sew0 c(int i, String str, String str2, String str3, boolean z) {
            fxj0 fxj0Var;
            if (str.length() == 0 && (str2 == null || str2.length() == 0)) {
                return new c(str3, i);
            }
            fxj0 e = e(100, str, false);
            if (str2 != null) {
                LruCache<String, fxj0> lruCache = sew0.a;
                fxj0Var = e(400, str2, false);
            } else {
                fxj0Var = null;
            }
            return new b(rl3.I(new fxj0[]{e, fxj0Var}), z, false);
        }

        public static sew0 d(int i, boolean z, String str, boolean z2, String str2) {
            return (str == null || str.length() == 0) ? new c(str2, i) : new b(Collections.singletonList(e(100, str, z2)), z, z2);
        }

        public static fxj0 e(int i, String str, boolean z) {
            String str2;
            ImageSize imageSize;
            LruCache<String, fxj0> lruCache = sew0.a;
            fxj0 fxj0Var = lruCache.get(str);
            if (fxj0Var != null && fxj0Var.getWidth() == i) {
                return fxj0Var;
            }
            if (z) {
                m900<String, ImageSize> m900Var = ImageSize.e;
                imageSize = ImageSize.b.a(str);
                str2 = str;
            } else {
                str2 = str;
                imageSize = new ImageSize(str2, i, (char) 0, false, 12, (zcl) null);
            }
            lruCache.put(str2, imageSize);
            return imageSize;
        }
    }

    /* compiled from: VoipAvatar.kt */
    public static final class b extends sew0 {
        public final List<fxj0> b;
        public final boolean c;
        public final boolean d;

        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends fxj0> list, boolean z, boolean z2) {
            this.b = list;
            this.c = z;
            this.d = z2;
        }

        public final String a() {
            String url;
            fxj0 fxj0Var = (fxj0) j5g.a0(this.b);
            return (fxj0Var == null || (url = fxj0Var.getUrl()) == null) ? "" : url;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + qoy.b(this.b.hashCode() * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Image(images=");
            sb.append(this.b);
            sb.append(", isNft=");
            sb.append(this.c);
            sb.append(", isBase=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: VoipAvatar.kt */
    public static final class c extends sew0 {
        public final String b;
        public final int c;

        public c(String str, int i) {
            this.b = str;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.b, cVar.b) && this.c == cVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Name(name=");
            sb.append(this.b);
            sb.append(", color=");
            return vu5.b(sb, this.c, ')');
        }
    }
}
