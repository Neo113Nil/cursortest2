package xsna;

import com.vk.dto.common.id.UserId;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: VKApiValidationHandler.kt */
/* loaded from: classes.dex */
public interface n7r0 {

    /* compiled from: VKApiValidationHandler.kt */
    /* loaded from: classes15.dex */
    public static class a<T> {
        public final e a;
        public volatile T b;

        public a(e eVar) {
            this.a = eVar;
        }

        public void a() {
            CountDownLatch andSet = this.a.a.getAndSet(null);
            if (andSet == null) {
                throw new NullPointerException("Latch is null!");
            }
            andSet.countDown();
        }

        public final e b() {
            return this.a;
        }

        public final T c() {
            return this.b;
        }

        public void d(T t) {
            this.b = t;
            CountDownLatch andSet = this.a.a.getAndSet(null);
            if (andSet == null) {
                throw new NullPointerException("Latch is null!");
            }
            andSet.countDown();
        }
    }

    /* compiled from: VKApiValidationHandler.kt */
    /* loaded from: classes15.dex */
    public static final class b {
        public final String a;
        public final Integer b;
        public final Integer c;
        public final Double d;
        public final boolean e;
        public final String f;
        public final Boolean g;
        public final String h;
        public final String i;
        public final String j;
        public final String k;
        public final String l;
        public final String m;

        public b(String str, Integer num, Integer num2, Double d, boolean z, String str2, Boolean bool, String str3, String str4, String str5, String str6, String str7, String str8, int i) {
            str6 = (i & 1024) != 0 ? null : str6;
            String str9 = (i & 2048) != 0 ? null : str7;
            String str10 = (i & 4096) == 0 ? str8 : null;
            this.a = str;
            this.b = num;
            this.c = num2;
            this.d = d;
            this.e = z;
            this.f = str2;
            this.g = bool;
            this.h = str3;
            this.i = str4;
            this.j = str5;
            this.k = str6;
            this.l = str9;
            this.m = str10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && this.e == bVar.e && epx.f(this.f, bVar.f) && epx.f(this.g, bVar.g) && epx.f(this.h, bVar.h) && epx.f(this.i, bVar.i) && epx.f(this.j, bVar.j) && epx.f(this.k, bVar.k) && epx.f(this.l, bVar.l) && epx.f(this.m, bVar.m);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Integer num = this.b;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.c;
            int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Double d = this.d;
            int a = urd0.a(qoy.b((hashCode3 + (d == null ? 0 : d.hashCode())) * 31, 31, this.e), 31, this.f);
            Boolean bool = this.g;
            int hashCode4 = (a + (bool == null ? 0 : bool.hashCode())) * 31;
            String str = this.h;
            int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.i;
            int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.j;
            int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.k;
            int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.l;
            int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.m;
            return hashCode9 + (str6 != null ? str6.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder d = jq.d(this.b, "Captcha(img=", this.a, ", height=", ", width=");
            d.append(this.c);
            d.append(", ratio=");
            d.append(this.d);
            d.append(", isRefreshEnabled=");
            d.append(this.e);
            d.append(", captchaSid=");
            d.append(this.f);
            d.append(", isSoundCaptcha=");
            l4.i(this.g, ", captchaTrack=", this.h, ", token=", d);
            n6j.b(d, this.i, ", redirectUri=", this.j, ", hitmanChallengeUrl=");
            n6j.b(d, this.k, ", hitmanChallengeDomain=", this.l, ", requestDomain=");
            return i5s.a(d, this.m, ")");
        }
    }

    /* compiled from: VKApiValidationHandler.kt */
    /* loaded from: classes15.dex */
    public static final class c {
        public final String a;
        public final boolean b;
        public final boolean c;
        public final boolean d;

        public c(String str, boolean z, boolean z2, boolean z3) {
            this.a = str;
            this.b = z;
            this.c = z2;
            this.d = z3;
        }

        public final String a() {
            return this.a;
        }

        public final boolean b() {
            return this.d;
        }

        public final boolean c() {
            return this.c;
        }

        public final boolean d() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && this.b == cVar.b && this.c == cVar.c && this.d == cVar.d;
        }

        public final int hashCode() {
            String str = this.a;
            return Boolean.hashCode(this.d) + qoy.b(qoy.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            return "CaptchaResult(key=" + this.a + ", isSoundCaptcha=" + this.b + ", isNotRobotCaptcha=" + this.c + ", isHitmanChallenge=" + this.d + ")";
        }
    }

    /* compiled from: VKApiValidationHandler.kt */
    /* loaded from: classes15.dex */
    public static final class d {
        public static final d g = new d(0, 0, null, "", "");
        public final String a;
        public final String b;
        public final UserId c;
        public final int d;
        public final long e;
        public final boolean f;

        /* compiled from: VKApiValidationHandler.kt */
        public static final class a {
            public static d a() {
                return d.g;
            }
        }

        public d(int i, long j, UserId userId, String str, String str2) {
            this.a = str;
            this.b = str2;
            this.c = userId;
            this.d = i;
            this.e = j;
            this.f = true ^ (str2 == null || drm0.N(str2));
        }

        public final long a() {
            return this.e;
        }

        public final int b() {
            return this.d;
        }

        public final String c() {
            return this.a;
        }

        public final String d() {
            return this.b;
        }

        public final UserId e() {
            return this.c;
        }

        public final boolean f() {
            return this.f;
        }
    }

    /* compiled from: VKApiValidationHandler.kt */
    public static final class e {
        public final AtomicReference<CountDownLatch> a = new AtomicReference<>();
    }

    void a(b bVar, a<c> aVar);

    void b(String str, a<Boolean> aVar);

    void c(String str, a<d> aVar);
}
