package ru.mail.libverify.g0;

import android.content.Context;
import io.michaelrocks.libphonenumber.android.PhoneNumberUtil;
import ru.mail.verify.core.api.ApplicationModule;
import xsna.d9e0;

/* loaded from: classes9.dex */
public final class i implements d9e0 {
    private final ApplicationModule a;
    private final ru.mail.verify.core.api.g b;

    private i(ApplicationModule applicationModule, ru.mail.verify.core.api.g gVar) {
        this.a = applicationModule;
        this.b = gVar;
    }

    public static i a(ApplicationModule applicationModule, ru.mail.verify.core.api.g gVar) {
        return new i(applicationModule, gVar);
    }

    @Override // xsna.e9e0
    public final Object get() {
        ApplicationModule applicationModule = this.a;
        Context context = (Context) this.b.get();
        applicationModule.getClass();
        return PhoneNumberUtil.b(context);
    }
}
