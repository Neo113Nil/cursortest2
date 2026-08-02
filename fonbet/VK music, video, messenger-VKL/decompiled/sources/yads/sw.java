package yads;

import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;

/* loaded from: classes10.dex */
public enum sw {
    /* JADX INFO: Fake field, exist only in values array */
    EF9("IABConsent_ConsentString", AndroidTcfDataSource.TCF_TCSTRING_KEY),
    /* JADX INFO: Fake field, exist only in values array */
    EF21("IABConsent_SubjectToGDPR", "IABTCF_gdprApplies"),
    /* JADX INFO: Fake field, exist only in values array */
    EF33("IABConsent_CMPPresent", "IABTCF_CmpSdkID"),
    /* JADX INFO: Fake field, exist only in values array */
    EF45("IABConsent_ParsedPurposeConsents", "IABTCF_PurposeConsents"),
    /* JADX INFO: Fake field, exist only in values array */
    EF57("IABConsent_ParsedVendorConsents", "IABTCF_VendorConsents"),
    /* JADX INFO: Fake field, exist only in values array */
    EF68(null, "IABTCF_AddtlConsent");

    public static final rw d = new rw();
    public final String b;
    public final String c;

    sw(String str, String str2) {
        this.b = str;
        this.c = str2;
    }
}
