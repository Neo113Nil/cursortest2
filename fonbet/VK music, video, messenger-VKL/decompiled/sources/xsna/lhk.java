package xsna;

import android.net.Uri;

/* compiled from: CropImageState.kt */
/* loaded from: classes18.dex */
public interface lhk {

    /* compiled from: CropImageState.kt */
    public static final class a implements lhk {
        public final Uri a;
        public final float b;
        public final iba0 c;

        public a(Uri uri, float f, iba0 iba0Var) {
            this.a = uri;
            this.b = f;
            this.c = iba0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && Float.compare(this.b, aVar.b) == 0 && epx.f(this.c, aVar.c);
        }

        @Override // xsna.lhk
        public final iba0 getImageSize() {
            return this.c;
        }

        public final int hashCode() {
            int a = io.reactivex.rxjava3.subjects.b.a(this.b, this.a.hashCode() * 31, 31);
            iba0 iba0Var = this.c;
            return a + (iba0Var == null ? 0 : iba0Var.hashCode());
        }

        public final String toString() {
            return "LocalImage(uri=" + this.a + ", ratio=" + this.b + ", imageSize=" + this.c + ')';
        }
    }

    /* compiled from: CropImageState.kt */
    public static final class b implements lhk {
        public final String a;
        public final float b;
        public final iba0 c;

        public b(String str, float f, iba0 iba0Var) {
            this.a = str;
            this.b = f;
            this.c = iba0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && Float.compare(this.b, bVar.b) == 0 && epx.f(this.c, bVar.c);
        }

        @Override // xsna.lhk
        public final iba0 getImageSize() {
            return this.c;
        }

        public final int hashCode() {
            int a = io.reactivex.rxjava3.subjects.b.a(this.b, this.a.hashCode() * 31, 31);
            iba0 iba0Var = this.c;
            return a + (iba0Var == null ? 0 : iba0Var.hashCode());
        }

        public final String toString() {
            return "RemoteImage(ownerCombinedPhotoId=" + this.a + ", ratio=" + this.b + ", imageSize=" + this.c + ')';
        }
    }

    iba0 getImageSize();
}
