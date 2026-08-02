package sg.bigo.ads.dh;

import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public enum f {
    XML_PARSING_ERROR("100"),
    WRAPPER_TIMEOUT("301"),
    NO_ADS_VAST_RESPONSE("303"),
    GENERAL_LINEAR_AD_ERROR("400"),
    GENERAL_COMPANION_AD_ERROR("600"),
    UNDEFINED_ERROR("900");


    @NonNull
    public final String g;

    f(String str) {
        this.g = str;
    }
}
