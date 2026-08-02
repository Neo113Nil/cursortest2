package com.ybsdk.feature.divkit.internal.domain.hmac;

import com.ybsdk.feature.divkit.internal.domain.hmac.HmacData;
import com.ybsdk.feature.divkit.internal.domain.hmac.HmacResolveError;
import defpackage.a5f;
import defpackage.cvu0;
import defpackage.j73;
import defpackage.npk;
import defpackage.uza;
import defpackage.vsq;
import defpackage.w511;
import defpackage.xou;
import java.nio.charset.Charset;
import java.util.Locale;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public final class b implements xou {
    public final npk a;

    public b(npk npkVar) {
        this.a = npkVar;
    }

    public final String a(String str, HmacData.Spec spec, String str2) {
        int i = a.a[spec.getKeyType().ordinal()];
        if (i != 1) {
            if (i == 2) {
                throw new HmacResolveError.UnknownKeyType();
            }
            w511.b();
            return null;
        }
        String str3 = this.a.a.f;
        if (str3 == null) {
            throw new HmacResolveError.SigningKeyUnavailable(spec.getKeyType());
        }
        String lowerCase = kotlin.collections.a.X(spec.getItems(), "", null, null, new vsq(this, str2), 30).toLowerCase(Locale.ROOT);
        Mac mac = Mac.getInstance("HmacSHA256");
        Charset charset = uza.a;
        mac.init(new SecretKeySpec(str3.getBytes(charset), "HmacSHA256"));
        return cvu0.v(str, spec.getPlaceholder(), j73.K(mac.doFinal(lowerCase.getBytes(charset)), "", new a5f(5), 30), false);
    }
}
