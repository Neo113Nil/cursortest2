package com.google.firebase.installations.remote;

/* loaded from: classes.dex */
public abstract class TokenResult {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ResponseCode {
        private static final /* synthetic */ ResponseCode[] $VALUES;
        public static final ResponseCode AUTH_ERROR;
        public static final ResponseCode BAD_CONFIG;
        public static final ResponseCode OK;

        static {
            ResponseCode responseCode = new ResponseCode("OK", 0);
            OK = responseCode;
            ResponseCode responseCode2 = new ResponseCode("BAD_CONFIG", 1);
            BAD_CONFIG = responseCode2;
            ResponseCode responseCode3 = new ResponseCode("AUTH_ERROR", 2);
            AUTH_ERROR = responseCode3;
            $VALUES = new ResponseCode[]{responseCode, responseCode2, responseCode3};
        }

        public static ResponseCode valueOf(String str) {
            return (ResponseCode) Enum.valueOf(ResponseCode.class, str);
        }

        public static ResponseCode[] values() {
            return (ResponseCode[]) $VALUES.clone();
        }
    }

    public static abstract class a {
    }

    public abstract ResponseCode a();

    public abstract String b();

    public abstract long c();
}
