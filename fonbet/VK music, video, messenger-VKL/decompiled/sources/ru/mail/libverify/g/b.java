package ru.mail.libverify.g;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;
import java.util.Set;
import ru.mail.libverify.requests.j;
import ru.mail.verify.core.utils.Gsonable;
import xsna.efz;

/* loaded from: classes9.dex */
public class b implements Gsonable {
    private Long hold_timeout;
    private a message;
    private String sender;
    private long server_timestamp = 0;
    private long timestamp = 0;
    private j.c deliveryMethod = j.c.UNKNOWN;

    public static class a implements Gsonable {
        private String application_id;
        private int comm_push;
        private C2199a controls;
        private Set<EnumC2202b> delivery_flags;
        private String from;
        private String imei;
        private String imsi;
        private String phone;
        private String public_text;
        private String push_token_id;
        private long requester_id;
        private String requester_package_name;
        private String session_id;
        private String shortcut_name;
        private String src_application_logo;
        private String text;
        private c type;
        private String verification_url;
        private String verify_code;

        /* renamed from: ru.mail.libverify.g.b$a$a, reason: collision with other inner class name */
        public static class C2199a implements Gsonable {
            private C2200a confirm;
            private C2201b description;

            /* renamed from: ru.mail.libverify.g.b$a$a$a, reason: collision with other inner class name */
            public static class C2200a implements Gsonable {
                private int enableTimeoutSec;
                private String text;

                public final boolean equals(@Nullable Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    C2200a c2200a = (C2200a) obj;
                    if (this.enableTimeoutSec != c2200a.enableTimeoutSec) {
                        return false;
                    }
                    return Objects.equals(this.text, c2200a.text);
                }

                public final int hashCode() {
                    String str = this.text;
                    return ((str != null ? str.hashCode() : 0) * 31) + this.enableTimeoutSec;
                }
            }

            /* renamed from: ru.mail.libverify.g.b$a$a$b, reason: collision with other inner class name */
            public static class C2201b implements Gsonable {
                private String text;

                public final boolean equals(@Nullable Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    return Objects.equals(this.text, ((C2201b) obj).text);
                }

                public final int hashCode() {
                    String str = this.text;
                    if (str != null) {
                        return str.hashCode();
                    }
                    return 0;
                }
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                C2199a c2199a = (C2199a) obj;
                if (Objects.equals(this.confirm, c2199a.confirm)) {
                    return Objects.equals(this.description, c2199a.description);
                }
                return false;
            }

            public final int hashCode() {
                C2200a c2200a = this.confirm;
                int hashCode = (c2200a != null ? c2200a.hashCode() : 0) * 31;
                C2201b c2201b = this.description;
                return hashCode + (c2201b != null ? c2201b.hashCode() : 0);
            }
        }

        /* renamed from: ru.mail.libverify.g.b$a$b, reason: collision with other inner class name */
        public enum EnumC2202b {
            POPUP,
            IPC,
            SMS,
            UNKNOWN
        }

        public enum c {
            MESSAGE,
            PING,
            PING_V2,
            VERIFIED,
            UNKNOWN
        }

        public final Set<EnumC2202b> d() {
            return this.delivery_flags;
        }

        public final String e() {
            return this.from;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.requester_id == aVar.requester_id && Objects.equals(this.text, aVar.text) && Objects.equals(this.verify_code, aVar.verify_code) && Objects.equals(this.from, aVar.from) && Objects.equals(this.delivery_flags, aVar.delivery_flags) && this.type == aVar.type && Objects.equals(this.imsi, aVar.imsi) && Objects.equals(this.imei, aVar.imei) && Objects.equals(this.session_id, aVar.session_id) && Objects.equals(this.application_id, aVar.application_id) && Objects.equals(this.phone, aVar.phone) && Objects.equals(this.controls, aVar.controls) && Objects.equals(this.verification_url, aVar.verification_url) && Integer.valueOf(this.comm_push).equals(Integer.valueOf(aVar.comm_push))) {
                return Objects.equals(this.requester_package_name, aVar.requester_package_name);
            }
            return false;
        }

        public final String f() {
            return this.imei;
        }

        public final String g() {
            return this.imsi;
        }

        public final String h() {
            return this.phone;
        }

        public final int hashCode() {
            String str = this.text;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.verify_code;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.from;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            Set<EnumC2202b> set = this.delivery_flags;
            int hashCode4 = (hashCode3 + (set != null ? set.hashCode() : 0)) * 31;
            c cVar = this.type;
            int hashCode5 = (hashCode4 + (cVar != null ? cVar.hashCode() : 0)) * 31;
            String str4 = this.imsi;
            int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.imei;
            int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
            String str6 = this.session_id;
            int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31;
            String str7 = this.application_id;
            int hashCode9 = (hashCode8 + (str7 != null ? str7.hashCode() : 0)) * 31;
            String str8 = this.phone;
            int hashCode10 = (hashCode9 + (str8 != null ? str8.hashCode() : 0)) * 31;
            C2199a c2199a = this.controls;
            int hashCode11 = (hashCode10 + (c2199a != null ? c2199a.hashCode() : 0)) * 31;
            String str9 = this.verification_url;
            int hashCode12 = (hashCode11 + (str9 != null ? str9.hashCode() : 0)) * 31;
            String str10 = this.requester_package_name;
            return Long.hashCode(this.requester_id) + ((hashCode12 + (str10 != null ? str10.hashCode() : 0)) * 31);
        }

        public final String i() {
            return this.public_text;
        }

        public final String j() {
            return this.push_token_id;
        }

        @Nullable
        public final String k() {
            return this.requester_package_name;
        }

        public final String l() {
            return this.session_id;
        }

        public final String m() {
            return this.shortcut_name;
        }

        public final String n() {
            return this.text;
        }

        public final c o() {
            return this.type;
        }

        public final String p() {
            return this.verification_url;
        }

        public final String q() {
            return this.verify_code;
        }

        public final boolean r() {
            C2199a.C2200a c2200a;
            C2199a c2199a = this.controls;
            return (c2199a == null || (c2200a = c2199a.confirm) == null || TextUtils.isEmpty(c2200a.text)) ? false : true;
        }

        public final boolean s() {
            return this.comm_push == 1;
        }

        @NonNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Message{text='");
            sb.append(this.text);
            sb.append("', from='");
            sb.append(this.from);
            sb.append("', session_id='");
            sb.append(this.session_id);
            sb.append("', requester_package_name=");
            sb.append(this.requester_package_name);
            sb.append(", requester_id='");
            return efz.b(this.requester_id, "'}", sb);
        }

        public final String a() {
            return this.application_id;
        }

        @Nullable
        public final String b() {
            if (r()) {
                return this.controls.confirm.text;
            }
            return null;
        }

        @Nullable
        public final String c() {
            C2199a.C2201b c2201b;
            C2199a c2199a = this.controls;
            if (c2199a == null || (c2201b = c2199a.description) == null || TextUtils.isEmpty(c2201b.text)) {
                return null;
            }
            return this.controls.description.text;
        }
    }

    public final void a(long j) {
        this.timestamp = j;
    }

    @Nullable
    public final Long b() {
        return this.hold_timeout;
    }

    @NonNull
    public final String c() {
        return this.message.from + Long.toString(this.message.requester_id);
    }

    public final long d() {
        return this.timestamp;
    }

    public final a e() {
        return this.message;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.message, ((b) obj).message);
    }

    public final String f() {
        return this.sender;
    }

    public final long g() {
        return this.server_timestamp;
    }

    @Nullable
    public final String h() {
        a aVar = this.message;
        if (aVar == null) {
            return null;
        }
        return aVar.src_application_logo;
    }

    public final int hashCode() {
        a aVar = this.message;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    @NonNull
    public final String toString() {
        return "ServerNotificationMessage{message=" + this.message + ", sender='" + this.sender + "', timestamp=" + this.timestamp + ", hold_timeout=" + this.hold_timeout + ", deliveryMethod=" + this.deliveryMethod + '}';
    }

    public final j.c a() {
        return this.deliveryMethod;
    }

    public final void a(j.c cVar) {
        this.deliveryMethod = cVar;
    }
}
