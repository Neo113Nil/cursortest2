package xsna;

import com.vk.comments.core.BoardComment;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MarketItemCommentsPatch.kt */
/* loaded from: classes17.dex */
public interface d110 extends xl50 {

    /* compiled from: MarketItemCommentsPatch.kt */
    public static abstract class a implements d110 {

        /* compiled from: MarketItemCommentsPatch.kt */
        /* renamed from: xsna.d110$a$a, reason: collision with other inner class name */
        public static final class C2695a extends a {
            public final Throwable b;

            public C2695a(Throwable th) {
                this.b = th;
            }
        }

        /* compiled from: MarketItemCommentsPatch.kt */
        public static final class b extends a {
            public static final b b = new b();
        }

        /* compiled from: MarketItemCommentsPatch.kt */
        public static final class c extends a {
            public static final c b = new c();
        }

        /* compiled from: MarketItemCommentsPatch.kt */
        public static final class d extends a {
            public final UserId b;
            public final long c;
            public final ArrayList d;
            public final boolean e;
            public final int f;
            public final int g;

            public d(UserId userId, long j, ArrayList arrayList, boolean z, int i, int i2) {
                this.b = userId;
                this.c = j;
                this.d = arrayList;
                this.e = z;
                this.f = i;
                this.g = i2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return this.b.equals(dVar.b) && this.c == dVar.c && this.d.equals(dVar.d) && this.e == dVar.e && this.f == dVar.f && this.g == dVar.g;
            }

            public final int hashCode() {
                return Integer.hashCode(this.g) + shy.a(this.f, qoy.b(qr.a(this.d, bh10.a(Long.hashCode(this.b.b) * 31, 31, this.c), 31), 31, this.e), 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Success(ownerId=");
                sb.append(this.b);
                sb.append(", itemId=");
                sb.append(this.c);
                sb.append(", comments=");
                sb.append(this.d);
                sb.append(", canComment=");
                sb.append(this.e);
                sb.append(", commentCount=");
                sb.append(this.f);
                sb.append(", offset=");
                return vu5.b(sb, this.g, ')');
            }
        }
    }

    /* compiled from: MarketItemCommentsPatch.kt */
    public static abstract class b implements d110 {

        /* compiled from: MarketItemCommentsPatch.kt */
        public static final class a extends b {
            public final Throwable b;

            public a(Throwable th) {
                this.b = th;
            }
        }

        /* compiled from: MarketItemCommentsPatch.kt */
        /* renamed from: xsna.d110$b$b, reason: collision with other inner class name */
        public static final class C2696b extends b {
            public static final C2696b b = new C2696b();
        }

        /* compiled from: MarketItemCommentsPatch.kt */
        public static final class c extends b {
            public final int b;
            public final boolean c;
            public final ArrayList d;
            public final int e;

            public c(int i, int i2, ArrayList arrayList, boolean z) {
                this.b = i;
                this.c = z;
                this.d = arrayList;
                this.e = i2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.b == cVar.b && this.c == cVar.c && epx.f(this.d, cVar.d) && this.e == cVar.e;
            }

            public final int hashCode() {
                return Integer.hashCode(this.e) + qr.a(this.d, qoy.b(Integer.hashCode(this.b) * 31, 31, this.c), 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Success(commentCount=");
                sb.append(this.b);
                sb.append(", canComment=");
                sb.append(this.c);
                sb.append(", comments=");
                sb.append(this.d);
                sb.append(", offset=");
                return vu5.b(sb, this.e, ')');
            }
        }
    }

    /* compiled from: MarketItemCommentsPatch.kt */
    public static final class c implements d110 {
        public final List<BoardComment> b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends BoardComment> list) {
            this.b = list;
        }
    }

    /* compiled from: MarketItemCommentsPatch.kt */
    public static final class d implements d110 {
        public final Integer b;

        public d(Integer num) {
            this.b = num;
        }
    }
}
