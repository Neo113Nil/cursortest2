package ru.mail.libverify.g;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;
import ru.mail.libverify.api.VerificationApi;
import ru.mail.libverify.api.model.CodeDeliveryInfo;
import ru.mail.libverify.m.o;
import ru.mail.libverify.requests.VerifyApiRequest;
import ru.mail.verify.core.utils.Gsonable;
import xsna.i5s;

/* loaded from: classes9.dex */
public class a implements Gsonable {
    private ru.mail.libverify.m.b call_info;
    private C2197a callin_info;
    private b callui_info;

    @Nullable
    @ru.mail.libverify.q0.b("code_delivery_info")
    private CodeDeliveryInfo codeDeliveryInfo;
    private int confirm_required;
    private o delayed_verify_response;
    private c do_attempt;
    private ru.mail.libverify.m.g message;
    private d messenger_info;
    private e mobileid;
    private f notification_info;
    private Long push_id;
    private VerifyApiRequest.VerifyChecks route_type;
    private String session_id;
    private h sms_info;
    private g type;
    private Long valid_until;

    /* renamed from: ru.mail.libverify.g.a$a, reason: collision with other inner class name */
    public static final class C2197a implements Gsonable {
        private Integer fallback_timeout;
        private String phone;
        private Integer total_fallback_timeout;
        private int disable_direct_call = 0;
        private int ivr = 0;

        @NonNull
        public final Integer a() {
            return this.fallback_timeout;
        }

        @NonNull
        public final String b() {
            return this.phone;
        }

        @Nullable
        public final Integer c() {
            return this.total_fallback_timeout;
        }

        public final boolean d() {
            return this.disable_direct_call == 1;
        }

        public final boolean e() {
            return this.ivr == 1;
        }
    }

    public static final class b implements Gsonable {
        private String description;
        private String description_optional;
        private Integer fallback_timeout;
        private String fragment_start;

        @Nullable
        public final String a() {
            return this.description;
        }

        @Nullable
        public final String b() {
            return this.description_optional;
        }

        @Nullable
        public final Integer c() {
            return this.fallback_timeout;
        }

        @Nullable
        public final String d() {
            return this.fragment_start;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Objects.equals(this.fallback_timeout, bVar.fallback_timeout) && Objects.equals(this.fragment_start, bVar.fragment_start) && Objects.equals(this.description, bVar.description) && Objects.equals(this.description_optional, bVar.description_optional);
        }

        public final int hashCode() {
            return Objects.hash(this.fallback_timeout, this.fragment_start, this.description, this.description_optional);
        }
    }

    public static final class c implements Gsonable {
        private String code;

        @Nullable
        private VerificationApi.VerificationSource code_source;

        public final String a() {
            return this.code;
        }

        @Nullable
        public final VerificationApi.VerificationSource b() {
            return this.code_source;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return Objects.equals(this.code, ((c) obj).code);
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(this.code);
        }

        @NonNull
        public final String toString() {
            return "DoAttempt{code='" + this.code + "', code_source='" + this.code_source + "'}";
        }
    }

    public static final class d implements Gsonable {
        private String description;
        private int fallback_timeout;
        private String id;
        private String name;

        @NonNull
        public final String a() {
            return this.description;
        }

        public final int b() {
            return this.fallback_timeout;
        }

        @NonNull
        public final String c() {
            return this.id;
        }

        @NonNull
        public final String d() {
            return this.name;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Integer.valueOf(this.fallback_timeout).equals(Integer.valueOf(dVar.fallback_timeout)) && Objects.equals(this.name, dVar.name) && Objects.equals(this.id, dVar.id) && Objects.equals(this.description, dVar.description);
        }

        public final int hashCode() {
            return Objects.hash(Integer.valueOf(this.fallback_timeout), this.name, this.id, this.description);
        }
    }

    public static final class e implements Gsonable {

        @Nullable
        private Integer fallback_timeout = null;
        private int max_redirects;
        private String url;

        public final void a(int i) {
            this.max_redirects = i;
        }

        public final int b() {
            return this.max_redirects;
        }

        public final String c() {
            return this.url;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                return Objects.equals(this.url, ((e) obj).url);
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(this.url);
        }

        @NonNull
        public final String toString() {
            return i5s.a(new StringBuilder("MobileId{url='"), this.url, "'}");
        }

        public final void a(String str) {
            this.url = str;
        }

        public final int a() {
            Integer num = this.fallback_timeout;
            if (num == null) {
                return 5000;
            }
            return num.intValue();
        }
    }

    public static final class f implements Gsonable {

        @NonNull
        private EnumC2198a action = EnumC2198a.UNKNOWN;
        private String session_id;

        /* renamed from: ru.mail.libverify.g.a$f$a, reason: collision with other inner class name */
        public enum EnumC2198a {
            COMPLETED,
            UNKNOWN
        }

        @NonNull
        public final EnumC2198a a() {
            return this.action;
        }

        public final String b() {
            return this.session_id;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.action == ((f) obj).action;
        }

        public final int hashCode() {
            return Objects.hash(this.action);
        }

        @NonNull
        public final String toString() {
            return "NotificationInfo{, action=" + this.action + '}';
        }
    }

    public enum g {
        MOBILEID,
        DO_ATTEMPT,
        ROUTE_INFO,
        UNKNOWN
    }

    public static final class h implements Gsonable {
        private Integer fallback_timeout;

        @Nullable
        public final Integer a() {
            return this.fallback_timeout;
        }
    }

    @Nullable
    public final C2197a a() {
        return this.callin_info;
    }

    @Nullable
    public final ru.mail.libverify.m.b b() {
        return this.call_info;
    }

    @Nullable
    public final b c() {
        return this.callui_info;
    }

    @Nullable
    public final CodeDeliveryInfo d() {
        return this.codeDeliveryInfo;
    }

    @Nullable
    public final o e() {
        return this.delayed_verify_response;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.confirm_required == aVar.confirm_required && Objects.equals(this.call_info, aVar.call_info) && Objects.equals(this.notification_info, aVar.notification_info) && Objects.equals(this.delayed_verify_response, aVar.delayed_verify_response) && this.route_type == aVar.route_type && Objects.equals(this.session_id, aVar.session_id) && Objects.equals(this.callui_info, aVar.callui_info) && Objects.equals(this.mobileid, aVar.mobileid) && Objects.equals(this.do_attempt, aVar.do_attempt) && Objects.equals(this.message, aVar.message) && Objects.equals(this.messenger_info, aVar.messenger_info) && Objects.equals(this.codeDeliveryInfo, aVar.codeDeliveryInfo) && this.type == aVar.type;
    }

    @Nullable
    public final c f() {
        return this.do_attempt;
    }

    public final String g() {
        return this.session_id;
    }

    public final ru.mail.libverify.m.g h() {
        return this.message;
    }

    public final int hashCode() {
        return Objects.hash(this.call_info, this.notification_info, this.delayed_verify_response, Integer.valueOf(this.confirm_required), this.route_type, this.session_id, this.callui_info, this.mobileid, this.do_attempt, this.message, this.type, this.messenger_info, this.codeDeliveryInfo);
    }

    @Nullable
    public final d i() {
        return this.messenger_info;
    }

    @Nullable
    public final e j() {
        return this.mobileid;
    }

    @Nullable
    public final f k() {
        return this.notification_info;
    }

    @Nullable
    public final Long l() {
        return this.push_id;
    }

    @Nullable
    public final VerifyApiRequest.VerifyChecks m() {
        return this.route_type;
    }

    @Nullable
    public final h n() {
        return this.sms_info;
    }

    public final g o() {
        return this.type;
    }

    @Nullable
    public final Long p() {
        return this.valid_until;
    }

    public final boolean q() {
        return this.confirm_required == 1;
    }

    @NonNull
    public final String toString() {
        String str;
        if (this.codeDeliveryInfo == null) {
            str = "null";
        } else {
            str = "CodeDeliveryInfo(routeType=" + this.codeDeliveryInfo.getRouteType() + ",status=" + this.codeDeliveryInfo.getStatus() + ")";
        }
        return "ServerInfo{, type=" + this.type + ", call_info=" + this.call_info + ", notification_info=" + this.notification_info + ", messenger_info =" + this.messenger_info + ", confirm_required=" + this.confirm_required + ", delayed_verify_response=" + this.delayed_verify_response + ", session_id=" + this.session_id + ", route_type=" + this.route_type + ", code_delivery_info=" + str + '}';
    }
}
