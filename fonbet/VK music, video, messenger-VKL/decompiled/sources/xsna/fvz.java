package xsna;

import android.net.Uri;
import com.vk.imageloader.ImageScreenSize;
import com.vk.newsfeed.posting.impl.domain.model.LocalMediaEntry;

/* compiled from: PostingViewState.kt */
/* loaded from: classes4.dex */
public interface fvz {

    /* compiled from: PostingViewState.kt */
    public static final class a implements fvz {
        public final long a;
        public final LocalMediaEntry b;
        public final boolean c;
        public final int d;
        public final boolean e;
        public final boolean f;
        public final String g;
        public final Uri h;
        public final ImageScreenSize i;
        public final String j;
        public final int k;
        public final String l;

        public a(long j, LocalMediaEntry localMediaEntry, boolean z, int i, boolean z2, boolean z3, String str, Uri uri, ImageScreenSize imageScreenSize, String str2, int i2, String str3) {
            this.a = j;
            this.b = localMediaEntry;
            this.c = z;
            this.d = i;
            this.e = z2;
            this.f = z3;
            this.g = str;
            this.h = uri;
            this.i = imageScreenSize;
            this.j = str2;
            this.k = i2;
            this.l = str3;
        }

        public final LocalMediaEntry a() {
            return this.b;
        }

        public final boolean b() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && epx.f(this.g, aVar.g) && epx.f(this.h, aVar.h) && this.i == aVar.i && epx.f(this.j, aVar.j) && this.k == aVar.k && epx.f(this.l, aVar.l);
        }

        public final int hashCode() {
            return this.l.hashCode() + shy.a(this.k, urd0.a((this.i.hashCode() + ((this.h.hashCode() + urd0.a(qoy.b(qoy.b(shy.a(this.d, qoy.b((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31, this.c), 31), 31, this.e), 31, this.f), 31, this.g)) * 31)) * 31, 31, this.j), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MediaUiDto(id=");
            sb.append(this.a);
            sb.append(", entry=");
            sb.append(this.b);
            sb.append(", isSelected=");
            sb.append(this.c);
            sb.append(", indexInPicker=");
            sb.append(this.d);
            sb.append(", isIconVisible=");
            sb.append(this.e);
            sb.append(", isDurationVisible=");
            sb.append(this.f);
            sb.append(", durationString=");
            sb.append(this.g);
            sb.append(", imageUri=");
            sb.append(this.h);
            sb.append(", imageSize=");
            sb.append(this.i);
            sb.append(", imageContentDescription=");
            sb.append(this.j);
            sb.append(", checkBoxImageRes=");
            sb.append(this.k);
            sb.append(", checkBoxContentDescription=");
            return ho8.a(sb, this.l, ')');
        }
    }

    /* compiled from: PostingViewState.kt */
    public static final class b implements fvz {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -390189496;
        }

        public final String toString() {
            return "OpenCameraButtonUiDto";
        }
    }

    /* compiled from: PostingViewState.kt */
    public static final class c implements fvz {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -871812015;
        }

        public final String toString() {
            return "PlaceHolder";
        }
    }
}
