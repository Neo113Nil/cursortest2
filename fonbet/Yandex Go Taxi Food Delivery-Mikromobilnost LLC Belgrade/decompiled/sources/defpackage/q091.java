package defpackage;

import com.google.android.gms.common.Feature;

/* loaded from: classes11.dex */
public abstract class q091 {
    public static final Feature a;
    public static final Feature b;
    public static final Feature c;
    public static final Feature d;
    public static final Feature[] e;

    static {
        Feature feature = new Feature("auth_api_credentials_begin_sign_in", 9L);
        Feature feature2 = new Feature("auth_api_credentials_sign_out", 2L);
        a = feature2;
        Feature feature3 = new Feature("auth_api_credentials_authorize", 1L);
        Feature feature4 = new Feature("auth_api_credentials_revoke_access", 1L);
        Feature feature5 = new Feature("auth_api_credentials_save_password", 4L);
        b = feature5;
        Feature feature6 = new Feature("auth_api_credentials_get_sign_in_intent", 6L);
        c = feature6;
        Feature feature7 = new Feature("auth_api_credentials_save_account_linking_token", 3L);
        Feature feature8 = new Feature("auth_api_credentials_get_phone_number_hint_intent", 3L);
        d = feature8;
        e = new Feature[]{feature, feature2, feature3, feature4, feature5, feature6, feature7, feature8};
    }
}
