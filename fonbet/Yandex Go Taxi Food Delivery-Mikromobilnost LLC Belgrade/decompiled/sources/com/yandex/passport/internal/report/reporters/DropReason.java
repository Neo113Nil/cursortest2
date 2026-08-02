package com.yandex.passport.internal.report.reporters;

import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/yandex/passport/internal/report/reporters/DropReason;", "", "", CRLReasonCodeExtension.REASON, "Ljava/lang/String;", "getReason", "()Ljava/lang/String;", "UNKNOWN", "SSO", "PUSH_SUBSCRIBE", "PUSH_UNSUBSCRIBE", "GET_CODE_BY_UID", "AUTH_SDK_SUBMIT", "GET_CLIENT_TOKEN", "BIND_PHONE_COMMIT", "BIND_PHONE_SUBMIT", "SHORT_INFO", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
final class DropReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DropReason[] $VALUES;
    public static final DropReason AUTH_SDK_SUBMIT;
    public static final DropReason BIND_PHONE_COMMIT;
    public static final DropReason BIND_PHONE_SUBMIT;
    public static final DropReason GET_CLIENT_TOKEN;
    public static final DropReason GET_CODE_BY_UID;
    public static final DropReason PUSH_SUBSCRIBE;
    public static final DropReason PUSH_UNSUBSCRIBE;
    public static final DropReason SHORT_INFO;
    public static final DropReason SSO;
    public static final DropReason UNKNOWN;
    private final String reason;

    static {
        DropReason dropReason = new DropReason("UNKNOWN", 0, "unknown");
        UNKNOWN = dropReason;
        DropReason dropReason2 = new DropReason("SSO", 1, "Token already dropped");
        SSO = dropReason2;
        DropReason dropReason3 = new DropReason("PUSH_SUBSCRIBE", 2, "Dropped cause push/subscribe/ return InvalidTokenException");
        PUSH_SUBSCRIBE = dropReason3;
        DropReason dropReason4 = new DropReason("PUSH_UNSUBSCRIBE", 3, "Dropped cause push/unsubscribe/ return InvalidTokenException");
        PUSH_UNSUBSCRIBE = dropReason4;
        DropReason dropReason5 = new DropReason("GET_CODE_BY_UID", 4, "Dropped cause oauth/code_for_am/ return InvalidTokenException");
        GET_CODE_BY_UID = dropReason5;
        DropReason dropReason6 = new DropReason("AUTH_SDK_SUBMIT", 5, "Dropped cause authorize/submit return InvalidTokenException");
        AUTH_SDK_SUBMIT = dropReason6;
        DropReason dropReason7 = new DropReason("GET_CLIENT_TOKEN", 6, "Dropped cause 1/token return InvalidTokenException");
        GET_CLIENT_TOKEN = dropReason7;
        DropReason dropReason8 = new DropReason("BIND_PHONE_COMMIT", 7, "Dropped cause phone/bind_simple_or_confirm_bound/commit/ return InvalidTokenException");
        BIND_PHONE_COMMIT = dropReason8;
        DropReason dropReason9 = new DropReason("BIND_PHONE_SUBMIT", 8, "Dropped cause one of suggest/mobile_language/ || suggest/country/ || phone/bind_simple_or_confirm_bound/submit/ return InvalidTokenException");
        BIND_PHONE_SUBMIT = dropReason9;
        DropReason dropReason10 = new DropReason("SHORT_INFO", 9, "Dropped cause short_info return InvalidTokenException");
        SHORT_INFO = dropReason10;
        DropReason[] dropReasonArr = {dropReason, dropReason2, dropReason3, dropReason4, dropReason5, dropReason6, dropReason7, dropReason8, dropReason9, dropReason10};
        $VALUES = dropReasonArr;
        $ENTRIES = kotlin.enums.a.a(dropReasonArr);
    }

    public DropReason(String str, int i, String str2) {
        this.reason = str2;
    }

    public static DropReason valueOf(String str) {
        return (DropReason) Enum.valueOf(DropReason.class, str);
    }

    public static DropReason[] values() {
        return (DropReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getReason() {
        return this.reason;
    }
}
