package xsna;

import ru.ok.android.api.methods.authV2.login.LoginApiConstants;

/* compiled from: ContentType.android.kt */
/* loaded from: classes11.dex */
public interface mlj {
    public static final a a = a.a;

    /* compiled from: ContentType.android.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final m72 b;
        public static final m72 c;
        public static final m72 d;

        static {
            fdi.d("username");
            b = fdi.d(LoginApiConstants.PARAM_NAME_PASSWORD);
            c = fdi.d("emailAddress");
            fdi.d("newUsername");
            fdi.d("newPassword");
            fdi.d("postalAddress");
            fdi.d("postalCode");
            fdi.d("creditCardNumber");
            fdi.d("creditCardSecurityCode");
            fdi.d("creditCardExpirationDate");
            fdi.d("creditCardExpirationMonth");
            fdi.d("creditCardExpirationYear");
            fdi.d("creditCardExpirationDay");
            fdi.d("addressCountry");
            fdi.d("addressRegion");
            fdi.d("addressLocality");
            fdi.d("streetAddress");
            fdi.d("extendedAddress");
            fdi.d("extendedPostalCode");
            fdi.d("personName");
            fdi.d("personGivenName");
            fdi.d("personFamilyName");
            fdi.d("personMiddleName");
            fdi.d("personMiddleInitial");
            fdi.d("personNamePrefix");
            fdi.d("personNameSuffix");
            d = fdi.d("phoneNumber");
            fdi.d("phoneNumberDevice");
            fdi.d("phoneCountryCode");
            fdi.d("phoneNational");
            fdi.d("gender");
            fdi.d("birthDateFull");
            fdi.d("birthDateDay");
            fdi.d("birthDateMonth");
            fdi.d("birthDateYear");
            fdi.d("smsOTPCode");
        }
    }
}
