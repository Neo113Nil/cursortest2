package xsna;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: ErrorCode.kt */
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes12.dex */
public @interface yup {
    public static final int CHANGES_TOKEN_OUTDATED = 10008;
    public static final a Companion = a.a;
    public static final int DATABASE_ERROR = 10006;
    public static final int EMPTY_PERMISSION_LIST = 10002;
    public static final int INTERNAL_ERROR = 10007;
    public static final int INVALID_OWNERSHIP = 10000;
    public static final int INVALID_PERMISSION_RATIONALE_DECLARATION = 10004;
    public static final int INVALID_UID = 10005;
    public static final int NOT_ALLOWED = 10001;
    public static final int NO_PERMISSION = 4;
    public static final int PERMISSION_NOT_DECLARED = 10003;
    public static final int PROVIDER_NEEDS_UPDATE = 3;
    public static final int PROVIDER_NOT_ENABLED = 2;
    public static final int PROVIDER_NOT_INSTALLED = 1;
    public static final int TRANSACTION_TOO_LARGE = 10010;

    /* compiled from: ErrorCode.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
    }
}
