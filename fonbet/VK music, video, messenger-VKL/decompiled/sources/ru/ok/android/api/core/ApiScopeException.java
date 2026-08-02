package ru.ok.android.api.core;

import xsna.zcl;

/* compiled from: ApiScopeException.kt */
/* loaded from: classes9.dex */
public class ApiScopeException extends ApiConfigException {
    public static final Companion Companion = new Companion(null);
    public static final String NO_USER_FOR_SESSION_MSG = "No user for session";

    /* compiled from: ApiScopeException.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public ApiScopeException(Throwable th) {
        super(th);
    }

    public ApiScopeException(String str) {
        super(str);
    }

    public ApiScopeException(String str, Throwable th) {
        super(str, th);
    }
}
