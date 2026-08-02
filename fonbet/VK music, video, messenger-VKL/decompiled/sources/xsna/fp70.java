package xsna;

import com.vk.api.sdk.exceptions.ApiErrorViewType;

/* compiled from: OauthRawError.kt */
/* loaded from: classes15.dex */
public final class fp70 extends wz2 {
    public final String c;
    public final String d;

    public fp70(ApiErrorViewType apiErrorViewType, String str, String str2) {
        super("oauth", apiErrorViewType);
        this.c = str;
        this.d = str2;
    }
}
