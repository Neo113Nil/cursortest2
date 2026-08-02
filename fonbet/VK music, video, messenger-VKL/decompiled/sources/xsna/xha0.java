package xsna;

import android.graphics.Bitmap;

/* compiled from: PickerItem.kt */
/* loaded from: classes16.dex */
public abstract class xha0 {
    public final boolean a;

    /* compiled from: PickerItem.kt */
    public static final class a extends xha0 {
        public final boolean b;
        public final Bitmap c;
        public final Bitmap d;

        public a(Bitmap bitmap, Bitmap bitmap2, boolean z) {
            super(z);
            this.b = z;
            this.c = bitmap;
            this.d = bitmap2;
        }

        @Override // xsna.xha0
        public final boolean a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.c.hashCode() + (Boolean.hashCode(this.b) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Default(isSelected=");
            sb.append(this.b);
            sb.append(", blurBitmap=");
            sb.append(this.c);
            sb.append(", imageBitmap=");
            return qr.c(sb, this.d, ')');
        }
    }

    /* compiled from: PickerItem.kt */
    public static final class b extends xha0 {
        public final boolean b;
        public final String c;

        public b(boolean z, String str) {
            super(z);
            this.b = z;
            this.c = str;
        }

        @Override // xsna.xha0
        public final boolean a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.b == bVar.b && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (Boolean.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Verticalized(isSelected=");
            sb.append(this.b);
            sb.append(", url=");
            return ho8.a(sb, this.c, ')');
        }
    }

    public xha0(boolean z) {
        this.a = z;
    }

    public boolean a() {
        return this.a;
    }
}
