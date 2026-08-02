package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: GoodPreviewAction.kt */
/* loaded from: classes18.dex */
public abstract class m5u implements kj50 {

    /* compiled from: GoodPreviewAction.kt */
    public static final class a extends m5u {
        public final UserId b;
        public final long c;

        public a(long j, UserId userId) {
            this.b = userId;
            this.c = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            return Long.hashCode(this.c) + (Long.hashCode(this.b.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AddToCart(ownerId=");
            sb.append(this.b);
            sb.append(", itemId=");
            return vu5.a(')', this.c, sb);
        }
    }

    /* compiled from: GoodPreviewAction.kt */
    public static final class b extends m5u {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 75198920;
        }

        public final String toString() {
            return "ClickBack";
        }
    }

    /* compiled from: GoodPreviewAction.kt */
    public static final class c extends m5u {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 75229185;
        }

        public final String toString() {
            return "ClickCart";
        }
    }

    /* compiled from: GoodPreviewAction.kt */
    public static final class d extends m5u {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1388043773;
        }

        public final String toString() {
            return "ClickFavorite";
        }
    }

    /* compiled from: GoodPreviewAction.kt */
    public static final class e extends m5u {
        public static final e b = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -161048557;
        }

        public final String toString() {
            return "ClickPrimaryButton";
        }
    }

    /* compiled from: GoodPreviewAction.kt */
    public static final class f extends m5u {
        public static final f b = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -257941943;
        }

        public final String toString() {
            return "ClickSearch";
        }
    }

    /* compiled from: GoodPreviewAction.kt */
    public static final class g extends m5u {
        public static final g b = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 1249839685;
        }

        public final String toString() {
            return "ClickSecondaryButton";
        }
    }

    /* compiled from: GoodPreviewAction.kt */
    public static final class h extends m5u {
        public static final h b = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -1947893986;
        }

        public final String toString() {
            return "ClickShare";
        }
    }

    /* compiled from: GoodPreviewAction.kt */
    public static final class i extends m5u {
        public static final i b = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 1116113273;
        }

        public final String toString() {
            return "ClickVoiceSearch";
        }
    }

    /* compiled from: GoodPreviewAction.kt */
    public static final class j extends m5u {
        public final ay00 b;

        public j(ay00 ay00Var) {
            this.b = ay00Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && epx.f(this.b, ((j) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "HandleExternalEvent(event=" + this.b + ')';
        }
    }

    /* compiled from: GoodPreviewAction.kt */
    public static final class k extends m5u {
        public final UserId b;
        public final long c;
        public final int d;
        public final String e;

        public k(int i, long j, UserId userId, String str) {
            this.b = userId;
            this.c = j;
            this.d = i;
            this.e = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return epx.f(this.b, kVar.b) && this.c == kVar.c && this.d == kVar.d && epx.f(this.e, kVar.e);
        }

        public final int hashCode() {
            int a = shy.a(this.d, bh10.a(Long.hashCode(this.b.b) * 31, 31, this.c), 31);
            String str = this.e;
            return a + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Init(ownerId=");
            sb.append(this.b);
            sb.append(", itemId=");
            sb.append(this.c);
            sb.append(", itemPosition=");
            sb.append(this.d);
            sb.append(", trackCode=");
            return ho8.a(sb, this.e, ')');
        }
    }

    /* compiled from: GoodPreviewAction.kt */
    public static final class l extends m5u {
        public static final l b = new l();
    }

    /* compiled from: GoodPreviewAction.kt */
    public static final class m extends m5u {
        public final k7u b;

        public m(k7u k7uVar) {
            this.b = k7uVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && epx.f(this.b, ((m) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "OpenChat(good=" + this.b + ')';
        }
    }

    /* compiled from: GoodPreviewAction.kt */
    public static final class n extends m5u {
        public final String b;

        public n(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && epx.f(this.b, ((n) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("OpenLink(link="), this.b, ')');
        }
    }

    /* compiled from: GoodPreviewAction.kt */
    public static final class o extends m5u {
        public static final o b = new o();
    }

    /* compiled from: GoodPreviewAction.kt */
    public static final class p extends m5u {
        public final k7u b;
        public final Integer c;

        public p(k7u k7uVar, Integer num) {
            this.b = k7uVar;
            this.c = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return epx.f(this.b, pVar.b) && epx.f(this.c, pVar.c);
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            Integer num = this.c;
            return hashCode + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenProductCard(good=");
            sb.append(this.b);
            sb.append(", position=");
            return uqi.b(sb, this.c, ')');
        }
    }

    /* compiled from: GoodPreviewAction.kt */
    public static final class q extends m5u {
        public final UserId b;
        public final long c;
        public final int d;

        public q(UserId userId, long j, int i) {
            this.b = userId;
            this.c = j;
            this.d = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return epx.f(this.b, qVar.b) && this.c == qVar.c && this.d == qVar.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + bh10.a(Long.hashCode(this.b.b) * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Refresh(ownerId=");
            sb.append(this.b);
            sb.append(", itemId=");
            sb.append(this.c);
            sb.append(", itemPosition=");
            return vu5.b(sb, this.d, ')');
        }
    }

    /* compiled from: GoodPreviewAction.kt */
    public static final class r extends m5u {
        public final k7u b;
        public final boolean c;
        public final boolean d;
        public final Integer e;

        public r(k7u k7uVar, boolean z, boolean z2, Integer num) {
            this.b = k7uVar;
            this.c = z;
            this.d = z2;
            this.e = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof r)) {
                return false;
            }
            r rVar = (r) obj;
            return epx.f(this.b, rVar.b) && this.c == rVar.c && this.d == rVar.d && epx.f(this.e, rVar.e);
        }

        public final int hashCode() {
            int b = qoy.b(qoy.b(this.b.hashCode() * 31, 31, this.c), 31, this.d);
            Integer num = this.e;
            return b + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ToggleFave(good=");
            sb.append(this.b);
            sb.append(", isFave=");
            sb.append(this.c);
            sb.append(", isRecommendation=");
            sb.append(this.d);
            sb.append(", position=");
            return uqi.b(sb, this.e, ')');
        }
    }

    /* compiled from: GoodPreviewAction.kt */
    public static final class s extends m5u {
        public final k7u b;
        public final boolean c;
        public final boolean d;

        public s(k7u k7uVar, boolean z, boolean z2) {
            this.b = k7uVar;
            this.c = z;
            this.d = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof s)) {
                return false;
            }
            s sVar = (s) obj;
            return epx.f(this.b, sVar.b) && this.c == sVar.c && this.d == sVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + qoy.b(this.b.hashCode() * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ToggleFaveSuccess(good=");
            sb.append(this.b);
            sb.append(", isFave=");
            sb.append(this.c);
            sb.append(", isRecommendation=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }
}
