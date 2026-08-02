package ru.mail.libverify.w;

import android.graphics.Bitmap;
import ru.mail.libverify.u.w;
import xsna.bqy;

/* loaded from: classes9.dex */
public final class g implements f {
    private final bqy<b> a;
    private final w b;

    public g(bqy<b> bqyVar, w wVar) {
        this.a = bqyVar;
        this.b = wVar;
    }

    @Override // ru.mail.libverify.w.f
    public final Bitmap a(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new i(str, this.a).a(this.b);
        } catch (Exception e) {
            ru.mail.libverify.n0.b.a("SmsCodeNotification", e, "Failed init download %s", str);
            return null;
        }
    }
}
