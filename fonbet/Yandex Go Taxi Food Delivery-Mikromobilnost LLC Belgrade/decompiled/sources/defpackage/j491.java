package defpackage;

import com.google.android.gms.common.Feature;

/* loaded from: classes11.dex */
public abstract class j491 {
    public static final Feature a;
    public static final Feature[] b;

    static {
        Feature feature = new Feature("sms_code_autofill", 2L);
        Feature feature2 = new Feature("sms_code_browser", 2L);
        Feature feature3 = new Feature("sms_retrieve", 1L);
        a = feature3;
        b = new Feature[]{feature, feature2, feature3, new Feature("user_consent", 3L)};
    }
}
