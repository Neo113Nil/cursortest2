package xsna;

import androidx.recyclerview.widget.m;
import com.vk.dto.photo.PhotoAlbum;
import xsna.kn1;

/* compiled from: AlbumsItemAdapter.kt */
/* loaded from: classes4.dex */
public final class mn1 {
    public static final a a = new a();

    /* compiled from: AlbumsItemAdapter.kt */
    public static final class a extends m.e<kn1> {
        public final ci1 a = new ci1();

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(kn1 kn1Var, kn1 kn1Var2) {
            kn1 kn1Var3 = kn1Var;
            kn1 kn1Var4 = kn1Var2;
            if ((kn1Var3 instanceof kn1.c) && (kn1Var4 instanceof kn1.c)) {
                return false;
            }
            if ((kn1Var3 instanceof kn1.b) && (kn1Var4 instanceof kn1.b)) {
                return true;
            }
            if (!(kn1Var3 instanceof kn1.a) || !(kn1Var4 instanceof kn1.a)) {
                return false;
            }
            PhotoAlbum photoAlbum = ((kn1.a) kn1Var3).a;
            PhotoAlbum photoAlbum2 = ((kn1.a) kn1Var4).a;
            this.a.getClass();
            return ci1.a(photoAlbum, photoAlbum2);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(kn1 kn1Var, kn1 kn1Var2) {
            kn1 kn1Var3 = kn1Var;
            kn1 kn1Var4 = kn1Var2;
            if (((kn1Var3 instanceof kn1.c) && (kn1Var4 instanceof kn1.c)) || ((kn1Var3 instanceof kn1.b) && (kn1Var4 instanceof kn1.b))) {
                return true;
            }
            if ((kn1Var3 instanceof kn1.a) && (kn1Var4 instanceof kn1.a)) {
                PhotoAlbum photoAlbum = ((kn1.a) kn1Var3).a;
                PhotoAlbum photoAlbum2 = ((kn1.a) kn1Var4).a;
                this.a.getClass();
                if (photoAlbum.b == photoAlbum2.b) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.m.e
        public final Object getChangePayload(kn1 kn1Var, kn1 kn1Var2) {
            kn1 kn1Var3 = kn1Var;
            kn1 kn1Var4 = kn1Var2;
            if (!(kn1Var3 instanceof kn1.a) || !(kn1Var4 instanceof kn1.a)) {
                return s3q0.a;
            }
            PhotoAlbum photoAlbum = ((kn1.a) kn1Var3).a;
            PhotoAlbum photoAlbum2 = ((kn1.a) kn1Var4).a;
            this.a.getClass();
            return ci1.b(photoAlbum, photoAlbum2);
        }
    }
}
