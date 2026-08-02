package ru.mail.libverify.l;

import ru.mail.verify.core.utils.Gsonable;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class b implements Gsonable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;

    @ru.mail.libverify.q0.b("block")
    public static final b BLOCK;

    @ru.mail.libverify.q0.b("callin_call")
    public static final b CALLIN_CALL;

    @ru.mail.libverify.q0.b("callin_click")
    public static final b CALLIN_CLICK;

    @ru.mail.libverify.q0.b("callin_expired")
    public static final b CALLIN_EXPIRED;

    @ru.mail.libverify.q0.b("check")
    public static final b CHECK;

    @ru.mail.libverify.q0.b("check_settings_packages_changed")
    public static final b CHECK_SETTINGS_PACKAGES_CHANGED;

    @ru.mail.libverify.q0.b("check_settings_restart")
    public static final b CHECK_SETTINGS_RESTART;

    @ru.mail.libverify.q0.b("check_settings_timer")
    public static final b CHECK_SETTINGS_TIMER;

    @ru.mail.libverify.q0.b("mobileid")
    public static final b MOBILE_ID;
    public static final b NO_ACTION;

    @ru.mail.libverify.q0.b("ping_response_fetcher")
    public static final b PING_RESPONSE_FETCHER;

    @ru.mail.libverify.q0.b("ping_response_gcm")
    public static final b PING_RESPONSE_GCM;

    @ru.mail.libverify.q0.b("ping_response_hms")
    public static final b PING_RESPONSE_HMS;

    @ru.mail.libverify.q0.b("report_no_gcm_service")
    public static final b REPORT_NO_GCM_SERVICE;

    @ru.mail.libverify.q0.b("report_reuse")
    public static final b REPORT_PHONE_NUMBER_REUSE;

    @ru.mail.libverify.q0.b("report_signout")
    public static final b REPORT_SIGNOUT;

    @ru.mail.libverify.q0.b("report_soft_signout")
    public static final b REPORT_SOFT_SIGNOUT;

    @ru.mail.libverify.q0.b("report_spam")
    public static final b REPORT_SPAM;

    @ru.mail.libverify.q0.b("request_sms_info")
    public static final b REQUEST_SMS_INFO;
    private final String value;

    static {
        b bVar = new b("REPORT_PHONE_NUMBER_REUSE", 0, "report_reuse");
        REPORT_PHONE_NUMBER_REUSE = bVar;
        b bVar2 = new b("REPORT_SPAM", 1, "report_spam");
        REPORT_SPAM = bVar2;
        b bVar3 = new b("BLOCK", 2, "block");
        BLOCK = bVar3;
        b bVar4 = new b("CHECK", 3, "check");
        CHECK = bVar4;
        b bVar5 = new b("REPORT_SIGNOUT", 4, "report_signout");
        REPORT_SIGNOUT = bVar5;
        b bVar6 = new b("REPORT_SOFT_SIGNOUT", 5, "report_soft_signout");
        REPORT_SOFT_SIGNOUT = bVar6;
        b bVar7 = new b("REPORT_NO_GCM_SERVICE", 6, "report_no_gcm_service");
        REPORT_NO_GCM_SERVICE = bVar7;
        b bVar8 = new b("REQUEST_SMS_INFO", 7, "request_sms_info");
        REQUEST_SMS_INFO = bVar8;
        b bVar9 = new b("PING_RESPONSE_GCM", 8, "ping_response_gcm");
        PING_RESPONSE_GCM = bVar9;
        b bVar10 = new b("PING_RESPONSE_HMS", 9, "ping_response_hms");
        PING_RESPONSE_HMS = bVar10;
        b bVar11 = new b("PING_RESPONSE_FETCHER", 10, "ping_response_fetcher");
        PING_RESPONSE_FETCHER = bVar11;
        b bVar12 = new b("CHECK_SETTINGS_PACKAGES_CHANGED", 11, "check_settings_packages_changed");
        CHECK_SETTINGS_PACKAGES_CHANGED = bVar12;
        b bVar13 = new b("CHECK_SETTINGS_TIMER", 12, "check_settings_timer");
        CHECK_SETTINGS_TIMER = bVar13;
        b bVar14 = new b("CHECK_SETTINGS_RESTART", 13, "check_settings_restart");
        CHECK_SETTINGS_RESTART = bVar14;
        b bVar15 = new b("MOBILE_ID", 14, "mobileid");
        MOBILE_ID = bVar15;
        b bVar16 = new b("CALLIN_EXPIRED", 15, "callin_expired");
        CALLIN_EXPIRED = bVar16;
        b bVar17 = new b("CALLIN_CALL", 16, "callin_call");
        CALLIN_CALL = bVar17;
        b bVar18 = new b("CALLIN_CLICK", 17, "callin_click");
        CALLIN_CLICK = bVar18;
        b bVar19 = new b("NO_ACTION", 18, null);
        NO_ACTION = bVar19;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14, bVar15, bVar16, bVar17, bVar18, bVar19};
        $VALUES = bVarArr;
        $ENTRIES = new asp(bVarArr);
    }

    private b(String str, int i, String str2) {
        this.value = str2;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
