package ru.ok.android.api.methods.authV2.login;

/* compiled from: LoginApiResult.kt */
/* loaded from: classes9.dex */
public interface LoginApiResult {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: LoginApiResult.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final LoginApiResult create(String str, String str2, String str3) {
            return new SimpleLoginApiResult(str, str2, str3);
        }
    }

    static LoginApiResult create(String str, String str2, String str3) {
        return Companion.create(str, str2, str3);
    }

    String getSessionKey();

    String getSessionSecret();

    String getUserId();
}
