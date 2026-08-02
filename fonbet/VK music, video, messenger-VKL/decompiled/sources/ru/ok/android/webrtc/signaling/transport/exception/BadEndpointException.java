package ru.ok.android.webrtc.signaling.transport.exception;

import ru.ok.android.api.methods.authV2.login.LoginApiConstants;
import ru.ok.android.webrtc.log.UrlSecretEraser;
import xsna.rl3;
import xsna.zr;

/* loaded from: classes9.dex */
public final class BadEndpointException extends IllegalArgumentException {
    public final UrlSecretEraser a;
    public final String b;

    public BadEndpointException(String str) {
        UrlSecretEraser urlSecretEraser = new UrlSecretEraser(rl3.y0(new String[]{"token", "auth_data", "credential", LoginApiConstants.RESULT_NAME_AUTH_TOKEN, "session_data"}), "<ERASED_SECRET>");
        this.a = urlSecretEraser;
        this.b = zr.a("Unexpected endpoint: \"", urlSecretEraser.eraseSecrets(str), "\"");
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.b;
    }

    public final UrlSecretEraser getSecretEraser() {
        return this.a;
    }
}
