package defpackage;

import com.yandex.fintechsdk.entities.environment.PayEnvironment;

/* loaded from: classes12.dex */
public final class d5o {
    public static PayEnvironment a(String str) {
        return str == null ? PayEnvironment.PRODUCTION : (cvu0.x(str, "test.pay.ya.", false) || cvu0.x(str, "test.pay.yandex.", false)) ? PayEnvironment.TESTING : (cvu0.x(str, "sandbox.pay.ya.", false) || cvu0.x(str, "sandbox.pay.yandex.", false)) ? PayEnvironment.SANDBOX : PayEnvironment.PRODUCTION;
    }
}
