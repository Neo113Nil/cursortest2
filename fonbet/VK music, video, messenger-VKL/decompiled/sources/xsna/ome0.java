package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import xsna.pk9;

/* compiled from: QRUtils.kt */
/* loaded from: classes5.dex */
public final class ome0 {

    /* compiled from: QRUtils.kt */
    public static final class a {
        public final String a;
        public final String b;
        public final pk9.a c;
        public final boolean d;
        public final int e;
        public final boolean f;

        public a(String str, String str2, pk9.a aVar, boolean z, int i, boolean z2) {
            this.a = str;
            this.b = str2;
            this.c = aVar;
            this.d = z;
            this.e = i;
            this.f = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f;
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return Boolean.hashCode(this.f) + shy.a(this.e, qoy.b((this.c.hashCode() + shy.a(0, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31, 31, this.d), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("QrInfo(data=");
            sb.append(this.a);
            sb.append(", urlLogo=");
            sb.append(this.b);
            sb.append(", logoRes=0, color=");
            sb.append(this.c);
            sb.append(", shouldCache=");
            sb.append(this.d);
            sb.append(", qrSize=");
            sb.append(this.e);
            sb.append(", useDefaultLogo=");
            return defpackage.q0.a(sb, this.f, ')');
        }
    }

    public static io.reactivex.rxjava3.core.q a(ImageView imageView) {
        Context context = imageView.getContext();
        Bitmap i = kd7.i(imageView, -1);
        int i2 = kwg0.a;
        return new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.b(new l340(new pw(29, imageView, i), 9)).q(asu0.a.c()), new g600(new t440(context, 16), 18)).m(io.reactivex.rxjava3.android.schedulers.a.b()).w();
    }
}
