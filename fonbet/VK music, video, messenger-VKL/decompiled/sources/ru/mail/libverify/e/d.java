package ru.mail.libverify.e;

import ru.mail.libverify.requests.VerifyApiRequest;
import ru.mail.verify.core.utils.Gsonable;
import xsna.epx;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* loaded from: classes9.dex */
public abstract class d implements Gsonable {
    public static final c Companion = new c();
    private final VerifyApiRequest.VerifyChecks route;

    public static final class a extends d implements Gsonable {
        public static final C2193a Companion = new C2193a();
        private final int fallbackTimeout;
        private final boolean isDisableDirectCall;
        private final boolean isIvr;
        private final String phone;
        private final int totalFallbackTimeout;

        /* renamed from: ru.mail.libverify.e.d$a$a, reason: collision with other inner class name */
        public static final class C2193a {
        }

        public a() {
            this(0, 0, null, false, false, 31, null);
        }

        public final int b() {
            return this.fallbackTimeout;
        }

        public final String c() {
            return this.phone;
        }

        public final int d() {
            return this.totalFallbackTimeout;
        }

        public final boolean e() {
            return this.isDisableDirectCall;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.fallbackTimeout == aVar.fallbackTimeout && this.totalFallbackTimeout == aVar.totalFallbackTimeout && epx.f(this.phone, aVar.phone) && this.isDisableDirectCall == aVar.isDisableDirectCall && this.isIvr == aVar.isIvr;
        }

        public final boolean f() {
            return this.isIvr;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isIvr) + qoy.b(urd0.a(shy.a(this.totalFallbackTimeout, Integer.hashCode(this.fallbackTimeout) * 31, 31), 31, this.phone), 31, this.isDisableDirectCall);
        }

        public final String toString() {
            return "";
        }

        public /* synthetic */ a(int i, int i2, String str, boolean z, boolean z2, int i3, zcl zclVar) {
            this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? "" : str, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? false : z2);
        }

        public a(int i, int i2, String str, boolean z, boolean z2) {
            super(VerifyApiRequest.VerifyChecks.CALLIN, null);
            this.fallbackTimeout = i;
            this.totalFallbackTimeout = i2;
            this.phone = str;
            this.isDisableDirectCall = z;
            this.isIvr = z2;
        }
    }

    public static final class b extends d implements Gsonable {
        public static final a Companion = new a();
        private final String description;
        private final String descriptionOptional;
        private final int fallbackTimeout;
        private final String fragmentStart;

        public static final class a {
        }

        public b() {
            this(0, null, null, null, 15, null);
        }

        public final String b() {
            return this.description;
        }

        public final String c() {
            return this.descriptionOptional;
        }

        public final int d() {
            return this.fallbackTimeout;
        }

        public final String e() {
            return this.fragmentStart;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.fallbackTimeout == bVar.fallbackTimeout && epx.f(this.fragmentStart, bVar.fragmentStart) && epx.f(this.description, bVar.description) && epx.f(this.descriptionOptional, bVar.descriptionOptional);
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.fallbackTimeout) * 31;
            String str = this.fragmentStart;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.description;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.descriptionOptional;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            return "";
        }

        public /* synthetic */ b(int i, String str, String str2, String str3, int i2, zcl zclVar) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3);
        }

        public b(int i, String str, String str2, String str3) {
            super(VerifyApiRequest.VerifyChecks.CALLUI, null);
            this.fallbackTimeout = i;
            this.fragmentStart = str;
            this.description = str2;
            this.descriptionOptional = str3;
        }
    }

    public static final class c {

        public /* synthetic */ class a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[VerifyApiRequest.VerifyChecks.values().length];
                try {
                    iArr[VerifyApiRequest.VerifyChecks.SMS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[VerifyApiRequest.VerifyChecks.CALLUI.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[VerifyApiRequest.VerifyChecks.CALLIN.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[VerifyApiRequest.VerifyChecks.MESSENGER.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                a = iArr;
            }
        }
    }

    /* renamed from: ru.mail.libverify.e.d$d, reason: collision with other inner class name */
    public static final class C2194d extends d implements Gsonable {
        public static final a Companion = new a();
        private final String description;
        private final int fallbackTimeout;
        private final String id;
        private final String name;

        /* renamed from: ru.mail.libverify.e.d$d$a */
        public static final class a {
        }

        public C2194d() {
            this(0, null, null, null, 15, null);
        }

        public final String b() {
            return this.description;
        }

        public final int c() {
            return this.fallbackTimeout;
        }

        public final String d() {
            return this.id;
        }

        public final String e() {
            return this.name;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2194d)) {
                return false;
            }
            C2194d c2194d = (C2194d) obj;
            return this.fallbackTimeout == c2194d.fallbackTimeout && epx.f(this.name, c2194d.name) && epx.f(this.id, c2194d.id) && epx.f(this.description, c2194d.description);
        }

        public final int hashCode() {
            return this.description.hashCode() + urd0.a(urd0.a(Integer.hashCode(this.fallbackTimeout) * 31, 31, this.name), 31, this.id);
        }

        public final String toString() {
            return "";
        }

        public /* synthetic */ C2194d(int i, String str, String str2, String str3, int i2, zcl zclVar) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3);
        }

        public C2194d(int i, String str, String str2, String str3) {
            super(VerifyApiRequest.VerifyChecks.MESSENGER, null);
            this.fallbackTimeout = i;
            this.name = str;
            this.id = str2;
            this.description = str3;
        }
    }

    public static final class e extends d implements Gsonable {
        private final int fallbackTimeout;
        private int maxRedirects;
        private String url;

        public e() {
            this(null, 0, 0, 7, null);
        }

        public final int b() {
            return this.fallbackTimeout;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (e.class.equals(obj != null ? obj.getClass() : null)) {
                return epx.f(this.url, ((e) obj).url);
            }
            return false;
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return "";
        }

        public /* synthetic */ e(String str, int i, int i2, int i3, zcl zclVar) {
            this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 5000 : i2);
        }

        public e(String str, int i, int i2) {
            super(VerifyApiRequest.VerifyChecks.MOBILEID, null);
            this.url = str;
            this.maxRedirects = i;
            this.fallbackTimeout = i2;
        }
    }

    public static final class f extends d implements Gsonable {
        public static final a Companion = new a();
        private final Integer fallbackTimeout;

        public static final class a {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public f() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final Integer b() {
            return this.fallbackTimeout;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.fallbackTimeout, ((f) obj).fallbackTimeout);
        }

        public final int hashCode() {
            Integer num = this.fallbackTimeout;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public final String toString() {
            return "";
        }

        public /* synthetic */ f(Integer num, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : num);
        }

        public f(Integer num) {
            super(VerifyApiRequest.VerifyChecks.SMS, null);
            this.fallbackTimeout = num;
        }
    }

    public /* synthetic */ d(VerifyApiRequest.VerifyChecks verifyChecks, zcl zclVar) {
        this(verifyChecks);
    }

    public final VerifyApiRequest.VerifyChecks a() {
        return this.route;
    }

    private d(VerifyApiRequest.VerifyChecks verifyChecks) {
        this.route = verifyChecks;
    }
}
