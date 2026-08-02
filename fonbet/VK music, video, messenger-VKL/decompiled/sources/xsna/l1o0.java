package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.tags.Tag;
import java.util.ArrayList;

/* compiled from: TaggedItemsRepository.kt */
/* loaded from: classes18.dex */
public final class l1o0 {
    public final UserId a;
    public final int b;
    public final String c;
    public final o2o0 d = new o2o0();

    /* compiled from: TaggedItemsRepository.kt */
    public static final class a {
        public final ArrayList a;
        public final int b;
        public final int c;

        public a(ArrayList arrayList, int i, int i2) {
            this.a = arrayList;
            this.b = i;
            this.c = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + shy.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Result(items=");
            sb.append(this.a);
            sb.append(", offset=");
            sb.append(this.b);
            sb.append(", total=");
            return vu5.b(sb, this.c, ')');
        }
    }

    public l1o0(UserId userId, int i, String str) {
        this.a = userId;
        this.b = i;
        this.c = str;
    }

    public final io.reactivex.rxjava3.internal.operators.single.y a(int i, int i2) {
        String h = Tag.ContentType.PHOTO.h();
        return rsg0.w0(yfb.x(this.d.b(this.b, this.a, h, this.c))).l(new aam0(new k1o0(this, i, i2), 2));
    }
}
