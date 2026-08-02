package xsna;

import com.vk.dto.common.id.UserId;
import java.util.List;

/* compiled from: BannerCompanionViewState.kt */
/* loaded from: classes17.dex */
public interface a26 {

    /* compiled from: BannerCompanionViewState.kt */
    public static final class a implements a26 {
        public final boolean a;
        public final boolean b;

        public a(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        @Override // xsna.a26
        public final boolean a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Hidden(isCtaBanner=");
            sb.append(this.a);
            sb.append(", animated=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: BannerCompanionViewState.kt */
    public static final class b implements a26 {
        public final boolean a;
        public final int b;
        public final List<String> c;
        public final String d;
        public final Integer e;
        public final UserId f;

        public b(boolean z, int i, List<String> list, String str, Integer num, UserId userId) {
            this.a = z;
            this.b = i;
            this.c = list;
            this.d = str;
            this.e = num;
            this.f = userId;
        }

        @Override // xsna.a26
        public final boolean a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e) && epx.f(this.f, bVar.f);
        }

        public final int hashCode() {
            int a = shy.a(this.b, Boolean.hashCode(this.a) * 31, 31);
            List<String> list = this.c;
            int hashCode = (a + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.d;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.e;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            UserId userId = this.f;
            return hashCode3 + (userId != null ? Long.hashCode(userId.b) : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShouldLoadData(isCtaBanner=");
            sb.append(this.a);
            sb.append(", slotId=");
            sb.append(this.b);
            sb.append(", wbItemIds=");
            sb.append(this.c);
            sb.append(", articles=");
            sb.append(this.d);
            sb.append(", videoId=");
            sb.append(this.e);
            sb.append(", ownerId=");
            return gp.b(sb, this.f, ')');
        }
    }

    /* compiled from: BannerCompanionViewState.kt */
    public static final class c implements a26 {
        public final boolean a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final Boolean g;

        public c(boolean z, String str, String str2, String str3, String str4, String str5, Boolean bool) {
            this.a = z;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = bool;
        }

        @Override // xsna.a26
        public final boolean a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d) && epx.f(this.e, cVar.e) && epx.f(this.f, cVar.f) && epx.f(this.g, cVar.g);
        }

        public final int hashCode() {
            int a = urd0.a(urd0.a(urd0.a(urd0.a(urd0.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
            Boolean bool = this.g;
            return a + (bool == null ? 0 : bool.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Visible(isCtaBanner=");
            sb.append(this.a);
            sb.append(", imageUrl=");
            sb.append(this.b);
            sb.append(", title=");
            sb.append(this.c);
            sb.append(", label=");
            sb.append(this.d);
            sb.append(", age=");
            sb.append(this.e);
            sb.append(", buttonText=");
            sb.append(this.f);
            sb.append(", timerEnded=");
            return tn.a(sb, this.g, ')');
        }
    }

    boolean a();
}
