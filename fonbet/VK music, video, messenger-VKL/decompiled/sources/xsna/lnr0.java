package xsna;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;

/* compiled from: VerificationStatEnum.kt */
/* loaded from: classes15.dex */
public abstract class lnr0 {
    public final String a;

    /* compiled from: VerificationStatEnum.kt */
    public static final class a extends lnr0 {
        public static final a b = new a("already_verified_libverify");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1559535248;
        }

        public final String toString() {
            return "AlreadyVerifiedLibverify";
        }
    }

    /* compiled from: VerificationStatEnum.kt */
    public static final class b extends lnr0 {
        public static final b b = new b(MBridgeConstans.DYNAMIC_VIEW_WX_APP);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -179838641;
        }

        public final String toString() {
            return "App";
        }
    }

    /* compiled from: VerificationStatEnum.kt */
    public static final class c extends lnr0 {
        public static final c b = new c(NotificationCompat.CATEGORY_CALL);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1279985424;
        }

        public final String toString() {
            return "Call";
        }
    }

    /* compiled from: VerificationStatEnum.kt */
    public static final class d extends lnr0 {
        public static final d b = new d("call_libverify");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 271296558;
        }

        public final String toString() {
            return "CallLibverify";
        }
    }

    /* compiled from: VerificationStatEnum.kt */
    public static final class e extends lnr0 {
        public static final e b = new e("callin_libverify");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1160343383;
        }

        public final String toString() {
            return "CallinLibverify";
        }
    }

    /* compiled from: VerificationStatEnum.kt */
    public static final class f extends lnr0 {
        public static final f b = new f("email");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1022648502;
        }

        public final String toString() {
            return "Email";
        }
    }

    /* compiled from: VerificationStatEnum.kt */
    public static final class g extends lnr0 {
        public static final g b = new g("max_messenger");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 1623249569;
        }

        public final String toString() {
            return "MaxMessenger";
        }
    }

    /* compiled from: VerificationStatEnum.kt */
    public static final class h extends lnr0 {
        public static final h b = new h("max_code");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -175708474;
        }

        public final String toString() {
            return "MaxOtpCode";
        }
    }

    /* compiled from: VerificationStatEnum.kt */
    public static final class i extends lnr0 {
        public final String b;

        public i(String str) {
            super(cqm0.m(str).concat("_libverify"));
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && epx.f(this.b, ((i) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("MessengerLibverify(messengerName="), this.b, ')');
        }
    }

    /* compiled from: VerificationStatEnum.kt */
    public static final class j extends lnr0 {
        public static final j b = new j("mobileid_libverify");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 430969103;
        }

        public final String toString() {
            return "MobileIdLibverify";
        }
    }

    /* compiled from: VerificationStatEnum.kt */
    public static final class k extends lnr0 {
        public static final k b = new k("official_messenger");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return -81684714;
        }

        public final String toString() {
            return "OfficialMessenger";
        }
    }

    /* compiled from: VerificationStatEnum.kt */
    public static final class l extends lnr0 {
        public static final l b = new l("passkey");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return 1628280028;
        }

        public final String toString() {
            return "Passkey";
        }
    }

    /* compiled from: VerificationStatEnum.kt */
    public static final class m extends lnr0 {
        public static final m b = new m("ecosystem_push");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return -1279578708;
        }

        public final String toString() {
            return "Push";
        }
    }

    /* compiled from: VerificationStatEnum.kt */
    public static final class n extends lnr0 {
        public static final n b = new n("reserve_code");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public final int hashCode() {
            return 523422199;
        }

        public final String toString() {
            return "ReserveCode";
        }
    }

    /* compiled from: VerificationStatEnum.kt */
    public static final class o extends lnr0 {
        public static final o b = new o("sms");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return -179821433;
        }

        public final String toString() {
            return "Sms";
        }
    }

    /* compiled from: VerificationStatEnum.kt */
    public static final class p extends lnr0 {
        public static final p b = new p("sms_inbox");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof p);
        }

        public final int hashCode() {
            return 1891945023;
        }

        public final String toString() {
            return "SmsInbox";
        }
    }

    /* compiled from: VerificationStatEnum.kt */
    public static final class q extends lnr0 {
        public static final q b = new q("sms_libverify");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof q);
        }

        public final int hashCode() {
            return 1363842679;
        }

        public final String toString() {
            return "SmsLibverify";
        }
    }

    public lnr0(String str) {
        this.a = str;
    }
}
