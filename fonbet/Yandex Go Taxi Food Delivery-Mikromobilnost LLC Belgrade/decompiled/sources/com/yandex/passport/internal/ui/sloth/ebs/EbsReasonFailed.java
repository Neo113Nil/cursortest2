package com.yandex.passport.internal.ui.sloth.ebs;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0013\b\u0080\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/passport/internal/ui/sloth/ebs/EbsReasonFailed;", "", "Companion", "com/yandex/passport/internal/ui/sloth/ebs/c1", "IOEXCEPTION", "JSON_EXCEPTION", "SERIALIZATION_EXCEPTION", "INVALID_TOKEN", "BACKEND_ERROR_EXCEPTION", "FAILED_RESPONSE_EXCEPTION", "TRACK_ID_IS_NULL", "ESIA_CONSENT_APPLICATION_IS_NULL", "ESIA_CONSENT_CONSUMER_NULL", "ESIA_CONSENT_SCOPE_IS_NULL", "RETRYING_TRACK_ID_INIT_REQUEST_FAILED", "INSTALL_ID_IS_NULL", "FACE_RECOGNIZED_IS_FALSE", "FACE_RECOGNIZED_AND_FLOW_SUCCESSFUL_IS_FALSE", "ERROR_OPENING_URLS", "UNKNOWN", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EbsReasonFailed {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ EbsReasonFailed[] $VALUES;
    public static final EbsReasonFailed BACKEND_ERROR_EXCEPTION;
    public static final c1 Companion;
    public static final EbsReasonFailed ERROR_OPENING_URLS;
    public static final EbsReasonFailed ESIA_CONSENT_APPLICATION_IS_NULL;
    public static final EbsReasonFailed ESIA_CONSENT_CONSUMER_NULL;
    public static final EbsReasonFailed ESIA_CONSENT_SCOPE_IS_NULL;
    public static final EbsReasonFailed FACE_RECOGNIZED_AND_FLOW_SUCCESSFUL_IS_FALSE;
    public static final EbsReasonFailed FACE_RECOGNIZED_IS_FALSE;
    public static final EbsReasonFailed FAILED_RESPONSE_EXCEPTION;
    public static final EbsReasonFailed INSTALL_ID_IS_NULL;
    public static final EbsReasonFailed INVALID_TOKEN;
    public static final EbsReasonFailed IOEXCEPTION;
    public static final EbsReasonFailed JSON_EXCEPTION;
    public static final EbsReasonFailed RETRYING_TRACK_ID_INIT_REQUEST_FAILED;
    public static final EbsReasonFailed SERIALIZATION_EXCEPTION;
    public static final EbsReasonFailed TRACK_ID_IS_NULL;
    public static final EbsReasonFailed UNKNOWN;

    static {
        EbsReasonFailed ebsReasonFailed = new EbsReasonFailed("IOEXCEPTION", 0);
        IOEXCEPTION = ebsReasonFailed;
        EbsReasonFailed ebsReasonFailed2 = new EbsReasonFailed("JSON_EXCEPTION", 1);
        JSON_EXCEPTION = ebsReasonFailed2;
        EbsReasonFailed ebsReasonFailed3 = new EbsReasonFailed("SERIALIZATION_EXCEPTION", 2);
        SERIALIZATION_EXCEPTION = ebsReasonFailed3;
        EbsReasonFailed ebsReasonFailed4 = new EbsReasonFailed("INVALID_TOKEN", 3);
        INVALID_TOKEN = ebsReasonFailed4;
        EbsReasonFailed ebsReasonFailed5 = new EbsReasonFailed("BACKEND_ERROR_EXCEPTION", 4);
        BACKEND_ERROR_EXCEPTION = ebsReasonFailed5;
        EbsReasonFailed ebsReasonFailed6 = new EbsReasonFailed("FAILED_RESPONSE_EXCEPTION", 5);
        FAILED_RESPONSE_EXCEPTION = ebsReasonFailed6;
        EbsReasonFailed ebsReasonFailed7 = new EbsReasonFailed("TRACK_ID_IS_NULL", 6);
        TRACK_ID_IS_NULL = ebsReasonFailed7;
        EbsReasonFailed ebsReasonFailed8 = new EbsReasonFailed("ESIA_CONSENT_APPLICATION_IS_NULL", 7);
        ESIA_CONSENT_APPLICATION_IS_NULL = ebsReasonFailed8;
        EbsReasonFailed ebsReasonFailed9 = new EbsReasonFailed("ESIA_CONSENT_CONSUMER_NULL", 8);
        ESIA_CONSENT_CONSUMER_NULL = ebsReasonFailed9;
        EbsReasonFailed ebsReasonFailed10 = new EbsReasonFailed("ESIA_CONSENT_SCOPE_IS_NULL", 9);
        ESIA_CONSENT_SCOPE_IS_NULL = ebsReasonFailed10;
        EbsReasonFailed ebsReasonFailed11 = new EbsReasonFailed("RETRYING_TRACK_ID_INIT_REQUEST_FAILED", 10);
        RETRYING_TRACK_ID_INIT_REQUEST_FAILED = ebsReasonFailed11;
        EbsReasonFailed ebsReasonFailed12 = new EbsReasonFailed("INSTALL_ID_IS_NULL", 11);
        INSTALL_ID_IS_NULL = ebsReasonFailed12;
        EbsReasonFailed ebsReasonFailed13 = new EbsReasonFailed("FACE_RECOGNIZED_IS_FALSE", 12);
        FACE_RECOGNIZED_IS_FALSE = ebsReasonFailed13;
        EbsReasonFailed ebsReasonFailed14 = new EbsReasonFailed("FACE_RECOGNIZED_AND_FLOW_SUCCESSFUL_IS_FALSE", 13);
        FACE_RECOGNIZED_AND_FLOW_SUCCESSFUL_IS_FALSE = ebsReasonFailed14;
        EbsReasonFailed ebsReasonFailed15 = new EbsReasonFailed("ERROR_OPENING_URLS", 14);
        ERROR_OPENING_URLS = ebsReasonFailed15;
        EbsReasonFailed ebsReasonFailed16 = new EbsReasonFailed("UNKNOWN", 15);
        UNKNOWN = ebsReasonFailed16;
        EbsReasonFailed[] ebsReasonFailedArr = {ebsReasonFailed, ebsReasonFailed2, ebsReasonFailed3, ebsReasonFailed4, ebsReasonFailed5, ebsReasonFailed6, ebsReasonFailed7, ebsReasonFailed8, ebsReasonFailed9, ebsReasonFailed10, ebsReasonFailed11, ebsReasonFailed12, ebsReasonFailed13, ebsReasonFailed14, ebsReasonFailed15, ebsReasonFailed16};
        $VALUES = ebsReasonFailedArr;
        $ENTRIES = kotlin.enums.a.a(ebsReasonFailedArr);
        Companion = new c1();
    }

    public static EbsReasonFailed valueOf(String str) {
        return (EbsReasonFailed) Enum.valueOf(EbsReasonFailed.class, str);
    }

    public static EbsReasonFailed[] values() {
        return (EbsReasonFailed[]) $VALUES.clone();
    }
}
