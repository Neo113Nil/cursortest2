package com.yandex.passport.internal.social.esia;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/passport/internal/social/esia/EsiaException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class EsiaException extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public EsiaException(String str, String str2) {
        super(r0.toString());
        StringBuilder sb = new StringBuilder("code: ");
        sb.append(str);
        if (str2 != null) {
            sb.append(", description: ");
            sb.append(str2);
        }
    }
}
