package xsna;

import android.content.Context;
import android.content.Intent;
import com.vk.dto.common.id.UserId;

/* compiled from: ProfilePhotoUploadInteractor.kt */
/* loaded from: classes5.dex */
public interface fzd0 {

    /* compiled from: ProfilePhotoUploadInteractor.kt */
    public interface a {
        void a(c cVar);
    }

    /* compiled from: ProfilePhotoUploadInteractor.kt */
    public static final class b {
        public final String a;
        public final UserId b;
        public final boolean c;
        public final float d;
        public final float e;
        public final float f;
        public final float g;
        public final boolean h;
        public final boolean i;
        public final String j;
        public final String k;

        public b(String str, UserId userId, boolean z, float f, float f2, float f3, float f4, boolean z2, boolean z3, String str2, String str3) {
            this.a = str;
            this.b = userId;
            this.c = z;
            this.d = f;
            this.e = f2;
            this.f = f3;
            this.g = f4;
            this.h = z2;
            this.i = z3;
            this.j = str2;
            this.k = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && this.c == bVar.c && Float.compare(this.d, bVar.d) == 0 && Float.compare(this.e, bVar.e) == 0 && Float.compare(this.f, bVar.f) == 0 && Float.compare(this.g, bVar.g) == 0 && this.h == bVar.h && this.i == bVar.i && epx.f(this.j, bVar.j) && epx.f(this.k, bVar.k);
        }

        public final int hashCode() {
            String str = this.a;
            int b = qoy.b(qoy.b(io.reactivex.rxjava3.subjects.b.a(this.g, io.reactivex.rxjava3.subjects.b.a(this.f, io.reactivex.rxjava3.subjects.b.a(this.e, io.reactivex.rxjava3.subjects.b.a(this.d, qoy.b(bh10.a((str == null ? 0 : str.hashCode()) * 31, 31, this.b.b), 31, this.c), 31), 31), 31), 31), 31, this.h), 31, this.i);
            String str2 = this.j;
            int hashCode = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.k;
            return hashCode + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PhotoProfileParams(file=");
            sb.append(this.a);
            sb.append(", uid=");
            sb.append(this.b);
            sb.append(", notify=");
            sb.append(this.c);
            sb.append(", cropLeft=");
            sb.append(this.d);
            sb.append(", cropTop=");
            sb.append(this.e);
            sb.append(", cropRight=");
            sb.append(this.f);
            sb.append(", cropBottom=");
            sb.append(this.g);
            sb.append(", publishPost=");
            sb.append(this.h);
            sb.append(", publishStory=");
            sb.append(this.i);
            sb.append(", source=");
            sb.append(this.j);
            sb.append(", screen=");
            return ho8.a(sb, this.k, ')');
        }
    }

    /* compiled from: ProfilePhotoUploadInteractor.kt */
    public static abstract class c {

        /* compiled from: ProfilePhotoUploadInteractor.kt */
        public static final class a extends c {
            public static final a a = new a();
        }

        /* compiled from: ProfilePhotoUploadInteractor.kt */
        public static final class b extends c {
            public static final b a = new b();
        }
    }

    static /* synthetic */ void b(fzd0 fzd0Var, int i, int i2, Intent intent, a aVar, String str, String str2, int i3) {
        if ((i3 & 16) != 0) {
            str = null;
        }
        if ((i3 & 64) != 0) {
            str2 = null;
        }
        fzd0Var.a(i, i2, intent, aVar, str, str2);
    }

    void a(int i, int i2, Intent intent, a aVar, String str, String str2);

    void c(Context context, b bVar);
}
