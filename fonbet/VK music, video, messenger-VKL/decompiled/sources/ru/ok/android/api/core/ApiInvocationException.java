package ru.ok.android.api.core;

import java.io.Serializable;
import xsna.h5s;
import xsna.kh10;
import xsna.n6j;
import xsna.zcl;

/* compiled from: ApiInvocationException.kt */
/* loaded from: classes11.dex */
public class ApiInvocationException extends ApiException {
    private final int errorCode;
    private final String errorCustomJson;
    private final String errorCustomKey;
    private final String errorData;
    private final String errorField;
    private final String errorMessage;
    private final ErrorPageInfo errorPage;

    /* compiled from: ApiInvocationException.kt */
    /* loaded from: classes9.dex */
    public static final class ErrorCodes {
        public static final int ACTION_BLOCKED = 7;
        public static final int AUTH_LOGIN = 401;
        public static final int AUTH_LOGIN_WEB_HUMAN_CHECK = 403;
        public static final int BATCH = 1200;
        public static final int CENSOR_MATCH = 454;
        public static final int CHAT_MAX_PARTICIPANT_COUNT_LIMIT = 800;
        public static final int CHAT_PARTICIPANTS_EMPTY_BLOCKED_USERS = 801;
        public static final int FLOOD_BLOCKED = 8;
        public static final int FRIENDSHIP_REQUIRED = 1103;
        public static final int FRIEND_RESTRICTION = 455;
        public static final int GROUP_DUPLICATE_JOIN_REQUEST = 610;
        public static final int GROUP_JOIN_AGREEMENT_RESTRICTION = 612;
        public static final int GROUP_JOIN_RESTRICTION = 611;
        public static final int GROUP_RESTRICTION = 456;
        public static final int IDS_BLOCKED = 511;
        public static final ErrorCodes INSTANCE = new ErrorCodes();
        public static final int IP_BLOCKED = 9;
        public static final int LIMIT_REACHED = 11;
        public static final int MEDIA_TOPIC_BLOCK_LIMIT = 600;
        public static final int MEDIA_TOPIC_POLL_ANSWERS_LIMIT = 603;
        public static final int MEDIA_TOPIC_POLL_ANSWER_TEXT_LIMIT = 604;
        public static final int MEDIA_TOPIC_POLL_QUESTION_TEXT_LIMIT = 602;
        public static final int MEDIA_TOPIC_TEXT_LIMIT = 601;
        public static final int MEDIA_TOPIC_WITH_FRIENDS_LIMIT = 605;
        public static final int MEDIA_TOPIC_WITH_FRIENDS_USER_LIMIT = 606;
        public static final int METHOD = 3;
        public static final int NOT_ADMIN = 50;
        public static final int NOT_FOUND = 300;
        public static final int PARAM = 100;
        public static final int PARAM_SESSION_EXPIRED = 102;
        public static final int PARAM_SESSION_KEY = 103;
        public static final int PARAM_SESSION_KEY_CHANGED = 107;
        public static final int PARAM_SIGNATURE = 104;
        public static final int PERMISSION_DENIED = 10;
        public static final int PHOTO_IMAGE_CORRUPTED = 504;
        public static final int PHOTO_INVALID_FORMAT = 503;
        public static final int PHOTO_NO_IMAGE = 505;
        public static final int PHOTO_SIZE_LIMIT_EXCEEDED = 500;
        public static final int PHOTO_SIZE_SIZE_TOO_BIG = 502;
        public static final int PHOTO_SIZE_SIZE_TOO_SMALL = 501;
        public static final int PRIVACY_RESTRICTION = 458;
        public static final int REQUEST = 4;
        public static final int SERVICE = 2;
        public static final int SESSION_REQUIRED = 453;
        public static final int STICKER_MESSAGE_INVALID = 708;
        public static final int TIMEOUT_EXCEEDED = 704;
        public static final int TOO_LONG_REQUEST_SIZE = 30;
        public static final int UNAUTHORIZED_RESTRICTION = 457;
        public static final int UNKNOWN = 1;
        public static final int USER_IS_BLOCKED = 2002;
        public static final int USER_IS_DELETED = 2004;

        private ErrorCodes() {
        }
    }

    /* compiled from: ApiInvocationException.kt */
    /* loaded from: classes9.dex */
    public static final class ErrorPageInfo implements Serializable {
        private final String messagePlain;

        public ErrorPageInfo(String str) {
            this.messagePlain = str;
        }

        public final String getMessagePlain() {
            return this.messagePlain;
        }
    }

    public /* synthetic */ ApiInvocationException(int i, String str, String str2, String str3, String str4, String str5, ErrorPageInfo errorPageInfo, int i2, zcl zclVar) {
        this(i, str, str2, str3, str4, str5, (i2 & 64) != 0 ? null : errorPageInfo);
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorCustomJson() {
        return this.errorCustomJson;
    }

    public final String getErrorCustomKey() {
        return this.errorCustomKey;
    }

    public final String getErrorData() {
        return this.errorData;
    }

    public final String getErrorField() {
        return this.errorField;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final ErrorPageInfo getErrorPage() {
        return this.errorPage;
    }

    @Override // java.lang.Throwable
    public String toString() {
        int i = this.errorCode;
        String str = this.errorMessage;
        String str2 = this.errorField;
        String str3 = this.errorData;
        String str4 = this.errorCustomJson;
        String str5 = this.errorCustomKey;
        StringBuilder a = kh10.a(i, "ApiInvocationException{errorCode=", ", errorMessage='", str, "', errorField='");
        n6j.b(a, str2, "', errorData='", str3, "', errorCustomData=");
        return h5s.d(a, str4, ", errorCustomKey='", str5, "'}");
    }

    public ApiInvocationException(int i, String str, String str2, String str3, String str4, String str5, ErrorPageInfo errorPageInfo) {
        super(i + " " + str);
        this.errorCode = i;
        this.errorMessage = str;
        this.errorField = str2;
        this.errorData = str3;
        this.errorCustomKey = str4;
        this.errorCustomJson = str5;
        this.errorPage = errorPageInfo;
    }

    public ApiInvocationException(int i, String str) {
        this(i, str, null, null);
    }

    public ApiInvocationException(int i, String str, String str2, String str3) {
        this(i, str, str2, str3, null, null, null, 64, null);
    }
}
