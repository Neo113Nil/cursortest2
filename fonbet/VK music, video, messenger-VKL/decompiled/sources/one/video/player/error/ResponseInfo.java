package one.video.player.error;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ResponseInfo.kt */
/* loaded from: classes8.dex */
public final class ResponseInfo {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ResponseInfo[] $VALUES;
    public static final ResponseInfo BODY_0;
    public static final ResponseInfo BODY_1;
    public static final ResponseInfo BODY_10;
    public static final ResponseInfo BODY_11;
    public static final ResponseInfo BODY_12;
    public static final ResponseInfo BODY_13;
    public static final ResponseInfo BODY_14;
    public static final ResponseInfo BODY_15;
    public static final ResponseInfo BODY_16;
    public static final ResponseInfo BODY_17;
    public static final ResponseInfo BODY_18;
    public static final ResponseInfo BODY_19;
    public static final ResponseInfo BODY_2;
    public static final ResponseInfo BODY_20;
    public static final ResponseInfo BODY_21;
    public static final ResponseInfo BODY_3;
    public static final ResponseInfo BODY_4;
    public static final ResponseInfo BODY_5;
    public static final ResponseInfo BODY_6;
    public static final ResponseInfo BODY_7;
    public static final ResponseInfo BODY_8;
    public static final ResponseInfo BODY_9;
    private final boolean canReload;
    private final int code;
    private final String description;

    static {
        ResponseInfo responseInfo = new ResponseInfo(0, "BODY_0", "unknown", 0, false);
        BODY_0 = responseInfo;
        ResponseInfo responseInfo2 = new ResponseInfo(1, "BODY_1", "badRequest.expired", 1, true);
        BODY_1 = responseInfo2;
        ResponseInfo responseInfo3 = new ResponseInfo(2, "BODY_2", "badRequest.url", 2, true);
        BODY_2 = responseInfo3;
        ResponseInfo responseInfo4 = new ResponseInfo(3, "BODY_3", "badRequest.time", 3, false);
        BODY_3 = responseInfo4;
        ResponseInfo responseInfo5 = new ResponseInfo(4, "BODY_4", "badRequest.argument", 4, false);
        BODY_4 = responseInfo5;
        ResponseInfo responseInfo6 = new ResponseInfo(5, "BODY_5", "loadError", 5, true);
        BODY_5 = responseInfo6;
        ResponseInfo responseInfo7 = new ResponseInfo(6, "BODY_6", "notFound", 6, true);
        BODY_6 = responseInfo7;
        ResponseInfo responseInfo8 = new ResponseInfo(7, "BODY_7", "headerError", 7, false);
        BODY_7 = responseInfo8;
        ResponseInfo responseInfo9 = new ResponseInfo(8, "BODY_8", "badRequest.flood", 8, true);
        BODY_8 = responseInfo9;
        ResponseInfo responseInfo10 = new ResponseInfo(9, "BODY_9", "internal.overload", 9, true);
        BODY_9 = responseInfo10;
        ResponseInfo responseInfo11 = new ResponseInfo(10, "BODY_10", "badRequest.userAgentChange", 10, false);
        BODY_10 = responseInfo11;
        ResponseInfo responseInfo12 = new ResponseInfo(11, "BODY_11", "badRequest.forbiddenReferer", 11, false);
        BODY_11 = responseInfo12;
        ResponseInfo responseInfo13 = new ResponseInfo(12, "BODY_12", "badRequest.tknNoCookie", 12, false);
        BODY_12 = responseInfo13;
        ResponseInfo responseInfo14 = new ResponseInfo(13, "BODY_13", "badRequest.tknInvalid", 13, false);
        BODY_13 = responseInfo14;
        ResponseInfo responseInfo15 = new ResponseInfo(14, "BODY_14", "badRequest.tknSigInvalid", 14, false);
        BODY_14 = responseInfo15;
        ResponseInfo responseInfo16 = new ResponseInfo(15, "BODY_15", "badRequest.tknExpired", 15, false);
        BODY_15 = responseInfo16;
        ResponseInfo responseInfo17 = new ResponseInfo(16, "BODY_16", "badRequest.forbiddenOrigin", 16, false);
        BODY_16 = responseInfo17;
        ResponseInfo responseInfo18 = new ResponseInfo(17, "BODY_17", "badRequest.forbiddenMethod", 17, false);
        BODY_17 = responseInfo18;
        ResponseInfo responseInfo19 = new ResponseInfo(18, "BODY_18", "badRequest.badCountryChange", 18, true);
        BODY_18 = responseInfo19;
        ResponseInfo responseInfo20 = new ResponseInfo(19, "BODY_19", "badRequest.forbiddenSourceIp", 19, true);
        BODY_19 = responseInfo20;
        ResponseInfo responseInfo21 = new ResponseInfo(20, "BODY_20", "badRequest.tooManyParams", 20, false);
        BODY_20 = responseInfo21;
        ResponseInfo responseInfo22 = new ResponseInfo(21, "BODY_21", "badRequest.invalidMainServer", 21, true);
        BODY_21 = responseInfo22;
        ResponseInfo[] responseInfoArr = {responseInfo, responseInfo2, responseInfo3, responseInfo4, responseInfo5, responseInfo6, responseInfo7, responseInfo8, responseInfo9, responseInfo10, responseInfo11, responseInfo12, responseInfo13, responseInfo14, responseInfo15, responseInfo16, responseInfo17, responseInfo18, responseInfo19, responseInfo20, responseInfo21, responseInfo22};
        $VALUES = responseInfoArr;
        $ENTRIES = new asp(responseInfoArr);
    }

    public ResponseInfo(int i, String str, String str2, int i2, boolean z) {
        this.code = i2;
        this.description = str2;
        this.canReload = z;
    }

    public static zrp<ResponseInfo> j() {
        return $ENTRIES;
    }

    public static ResponseInfo valueOf(String str) {
        return (ResponseInfo) Enum.valueOf(ResponseInfo.class, str);
    }

    public static ResponseInfo[] values() {
        return (ResponseInfo[]) $VALUES.clone();
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean h() {
        return this.canReload;
    }

    public final int i() {
        return this.code;
    }
}
