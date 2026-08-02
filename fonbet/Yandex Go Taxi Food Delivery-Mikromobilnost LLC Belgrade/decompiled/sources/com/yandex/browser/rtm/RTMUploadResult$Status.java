package com.yandex.browser.rtm;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCSP.tools.common.window.id.IDialogId;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"com/yandex/browser/rtm/RTMUploadResult$Status", "", "Lcom/yandex/browser/rtm/RTMUploadResult$Status;", "UNKNOWN", "GENERIC_CONNECTIVITY_ERROR", "TLS_ERROR", "HTTP_RESPONSE_OTHER", "HTTP_RESPONSE_2XX", "HTTP_RESPONSE_200", "HTTP_RESPONSE_3XX", "HTTP_RESPONSE_301", "HTTP_RESPONSE_302", "HTTP_RESPONSE_4XX", "HTTP_RESPONSE_403", "HTTP_RESPONSE_404", "HTTP_RESPONSE_408", "HTTP_RESPONSE_413", "HTTP_RESPONSE_5XX", "HTTP_RESPONSE_500", "HTTP_RESPONSE_503", IDialogId.INTENT_EXTRA_IN_MAX, "lib-redir-log"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RTMUploadResult$Status {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RTMUploadResult$Status[] $VALUES;
    public static final RTMUploadResult$Status GENERIC_CONNECTIVITY_ERROR;
    public static final RTMUploadResult$Status HTTP_RESPONSE_200;
    public static final RTMUploadResult$Status HTTP_RESPONSE_2XX;
    public static final RTMUploadResult$Status HTTP_RESPONSE_301;
    public static final RTMUploadResult$Status HTTP_RESPONSE_302;
    public static final RTMUploadResult$Status HTTP_RESPONSE_3XX;
    public static final RTMUploadResult$Status HTTP_RESPONSE_403;
    public static final RTMUploadResult$Status HTTP_RESPONSE_404;
    public static final RTMUploadResult$Status HTTP_RESPONSE_408;
    public static final RTMUploadResult$Status HTTP_RESPONSE_413;
    public static final RTMUploadResult$Status HTTP_RESPONSE_4XX;
    public static final RTMUploadResult$Status HTTP_RESPONSE_500;
    public static final RTMUploadResult$Status HTTP_RESPONSE_503;
    public static final RTMUploadResult$Status HTTP_RESPONSE_5XX;
    public static final RTMUploadResult$Status HTTP_RESPONSE_OTHER;
    public static final RTMUploadResult$Status MAX;
    public static final RTMUploadResult$Status TLS_ERROR;
    public static final RTMUploadResult$Status UNKNOWN;

    static {
        RTMUploadResult$Status rTMUploadResult$Status = new RTMUploadResult$Status("UNKNOWN", 0);
        UNKNOWN = rTMUploadResult$Status;
        RTMUploadResult$Status rTMUploadResult$Status2 = new RTMUploadResult$Status("GENERIC_CONNECTIVITY_ERROR", 1);
        GENERIC_CONNECTIVITY_ERROR = rTMUploadResult$Status2;
        RTMUploadResult$Status rTMUploadResult$Status3 = new RTMUploadResult$Status("TLS_ERROR", 2);
        TLS_ERROR = rTMUploadResult$Status3;
        RTMUploadResult$Status rTMUploadResult$Status4 = new RTMUploadResult$Status("HTTP_RESPONSE_OTHER", 3);
        HTTP_RESPONSE_OTHER = rTMUploadResult$Status4;
        RTMUploadResult$Status rTMUploadResult$Status5 = new RTMUploadResult$Status("HTTP_RESPONSE_2XX", 4);
        HTTP_RESPONSE_2XX = rTMUploadResult$Status5;
        RTMUploadResult$Status rTMUploadResult$Status6 = new RTMUploadResult$Status("HTTP_RESPONSE_200", 5);
        HTTP_RESPONSE_200 = rTMUploadResult$Status6;
        RTMUploadResult$Status rTMUploadResult$Status7 = new RTMUploadResult$Status("HTTP_RESPONSE_3XX", 6);
        HTTP_RESPONSE_3XX = rTMUploadResult$Status7;
        RTMUploadResult$Status rTMUploadResult$Status8 = new RTMUploadResult$Status("HTTP_RESPONSE_301", 7);
        HTTP_RESPONSE_301 = rTMUploadResult$Status8;
        RTMUploadResult$Status rTMUploadResult$Status9 = new RTMUploadResult$Status("HTTP_RESPONSE_302", 8);
        HTTP_RESPONSE_302 = rTMUploadResult$Status9;
        RTMUploadResult$Status rTMUploadResult$Status10 = new RTMUploadResult$Status("HTTP_RESPONSE_4XX", 9);
        HTTP_RESPONSE_4XX = rTMUploadResult$Status10;
        RTMUploadResult$Status rTMUploadResult$Status11 = new RTMUploadResult$Status("HTTP_RESPONSE_403", 10);
        HTTP_RESPONSE_403 = rTMUploadResult$Status11;
        RTMUploadResult$Status rTMUploadResult$Status12 = new RTMUploadResult$Status("HTTP_RESPONSE_404", 11);
        HTTP_RESPONSE_404 = rTMUploadResult$Status12;
        RTMUploadResult$Status rTMUploadResult$Status13 = new RTMUploadResult$Status("HTTP_RESPONSE_408", 12);
        HTTP_RESPONSE_408 = rTMUploadResult$Status13;
        RTMUploadResult$Status rTMUploadResult$Status14 = new RTMUploadResult$Status("HTTP_RESPONSE_413", 13);
        HTTP_RESPONSE_413 = rTMUploadResult$Status14;
        RTMUploadResult$Status rTMUploadResult$Status15 = new RTMUploadResult$Status("HTTP_RESPONSE_5XX", 14);
        HTTP_RESPONSE_5XX = rTMUploadResult$Status15;
        RTMUploadResult$Status rTMUploadResult$Status16 = new RTMUploadResult$Status("HTTP_RESPONSE_500", 15);
        HTTP_RESPONSE_500 = rTMUploadResult$Status16;
        RTMUploadResult$Status rTMUploadResult$Status17 = new RTMUploadResult$Status("HTTP_RESPONSE_503", 16);
        HTTP_RESPONSE_503 = rTMUploadResult$Status17;
        RTMUploadResult$Status rTMUploadResult$Status18 = new RTMUploadResult$Status(IDialogId.INTENT_EXTRA_IN_MAX, 17);
        MAX = rTMUploadResult$Status18;
        RTMUploadResult$Status[] rTMUploadResult$StatusArr = {rTMUploadResult$Status, rTMUploadResult$Status2, rTMUploadResult$Status3, rTMUploadResult$Status4, rTMUploadResult$Status5, rTMUploadResult$Status6, rTMUploadResult$Status7, rTMUploadResult$Status8, rTMUploadResult$Status9, rTMUploadResult$Status10, rTMUploadResult$Status11, rTMUploadResult$Status12, rTMUploadResult$Status13, rTMUploadResult$Status14, rTMUploadResult$Status15, rTMUploadResult$Status16, rTMUploadResult$Status17, rTMUploadResult$Status18};
        $VALUES = rTMUploadResult$StatusArr;
        $ENTRIES = a.a(rTMUploadResult$StatusArr);
    }

    public static RTMUploadResult$Status valueOf(String str) {
        return (RTMUploadResult$Status) Enum.valueOf(RTMUploadResult$Status.class, str);
    }

    public static RTMUploadResult$Status[] values() {
        return (RTMUploadResult$Status[]) $VALUES.clone();
    }
}
