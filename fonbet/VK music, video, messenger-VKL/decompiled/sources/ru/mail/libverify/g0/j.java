package ru.mail.libverify.g0;

import io.michaelrocks.libphonenumber.android.PhoneNumberUtil;
import ru.mail.verify.core.api.ApplicationModule;
import xsna.d9e0;

/* loaded from: classes9.dex */
public final class j implements d9e0 {
    private final ApplicationModule a;
    private final i b;

    private j(ApplicationModule applicationModule, i iVar) {
        this.a = applicationModule;
        this.b = iVar;
    }

    public static j a(ApplicationModule applicationModule, i iVar) {
        return new j(applicationModule, iVar);
    }

    @Override // xsna.e9e0
    public final Object get() {
        ApplicationModule applicationModule = this.a;
        PhoneNumberUtil phoneNumberUtil = (PhoneNumberUtil) this.b.get();
        applicationModule.getClass();
        return new ru.mail.libverify.b.b(phoneNumberUtil);
    }
}
