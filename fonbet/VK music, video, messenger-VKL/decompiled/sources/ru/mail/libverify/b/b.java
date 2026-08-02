package ru.mail.libverify.b;

import io.michaelrocks.libphonenumber.android.NumberParseException;
import io.michaelrocks.libphonenumber.android.PhoneNumberUtil;
import io.michaelrocks.libphonenumber.android.Phonenumber$PhoneNumber;
import ru.mail.verify.core.utils.FileLog;
import xsna.drm0;

/* loaded from: classes9.dex */
public final class b {
    private final PhoneNumberUtil a;

    public b(PhoneNumberUtil phoneNumberUtil) {
        this.a = phoneNumberUtil;
    }

    public final a a(ru.mail.libverify.f0.a aVar) {
        String k;
        try {
            ru.mail.libverify.f0.b a = aVar.a();
            if (a != null && (k = a.k()) != null && !drm0.N(k)) {
                PhoneNumberUtil phoneNumberUtil = this.a;
                String k2 = a.k();
                String j = a.j();
                phoneNumberUtil.getClass();
                Phonenumber$PhoneNumber phonenumber$PhoneNumber = new Phonenumber$PhoneNumber();
                phoneNumberUtil.s(k2, j, true, phonenumber$PhoneNumber);
                if (this.a.m(phonenumber$PhoneNumber)) {
                    return new a(phonenumber$PhoneNumber.j());
                }
                return null;
            }
            return null;
        } catch (NumberParseException e) {
            FileLog.e("SimCardDataUtils", "error during phone validation process", e);
            return null;
        } catch (Exception e2) {
            FileLog.e("SimCardDataUtils", "error during libphonenumber usage", e2);
            return null;
        }
    }
}
