package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;

/* compiled from: BitmapFactory.kt */
/* loaded from: classes5.dex */
public final class ac7 {
    public final ArrayList<a> a = new ArrayList<>();

    /* compiled from: BitmapFactory.kt */
    public static final class a {
        public final Drawable a;
        public final Rect b;
        public final Bitmap c;

        public a(Drawable drawable, Rect rect, Bitmap bitmap) {
            this.a = drawable;
            this.b = rect;
            this.c = bitmap;
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
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CacheEntry(drawable=");
            sb.append(this.a);
            sb.append(", bounds=");
            sb.append(this.b);
            sb.append(", bitmap=");
            return qr.c(sb, this.c, ')');
        }
    }

    public final Bitmap a(Drawable drawable, Rect rect) {
        Bitmap bitmap;
        ArrayList<a> arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                bitmap = null;
                break;
            }
            a aVar = arrayList.get(i);
            if (epx.f(aVar.a, drawable) && aVar.b.equals(rect)) {
                bitmap = aVar.c;
                break;
            }
            i++;
        }
        if (bitmap != null) {
            return bitmap;
        }
        Bitmap createBitmap = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(rect);
        drawable.draw(canvas);
        arrayList.add(new a(drawable, new Rect(rect), createBitmap));
        return createBitmap;
    }
}
