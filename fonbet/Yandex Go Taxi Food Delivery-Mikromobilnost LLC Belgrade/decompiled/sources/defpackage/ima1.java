package defpackage;

import com.google.android.gms.common.Feature;

/* loaded from: classes11.dex */
public abstract class ima1 {
    public static final Feature a;
    public static final Feature[] b;

    static {
        Feature feature = new Feature("wallet", 1L);
        Feature feature2 = new Feature("wallet_biometric_auth_keys", 1L);
        Feature feature3 = new Feature("wallet_payment_dynamic_update", 2L);
        a = feature3;
        b = new Feature[]{feature, feature2, feature3, new Feature("wallet_1p_initialize_buyflow", 1L), new Feature("wallet_warm_up_ui_process", 1L), new Feature("wallet_get_setup_wizard_intent", 4L), new Feature("wallet_get_payment_card_recognition_intent", 1L), new Feature("wallet_save_instrument", 1L)};
    }
}
