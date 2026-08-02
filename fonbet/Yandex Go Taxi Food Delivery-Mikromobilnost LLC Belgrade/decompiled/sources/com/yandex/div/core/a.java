package com.yandex.div.core;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import defpackage.cvu0;
import defpackage.djb1;
import defpackage.evu0;
import defpackage.ngd0;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.sls;
import defpackage.tls;
import defpackage.wdv;
import defpackage.xdv;
import defpackage.ydv;
import defpackage.zdv;
import defpackage.zy11;
import java.io.ByteArrayInputStream;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes.dex */
public final class a implements Runnable {
    public final String a;
    public final boolean b;
    public final tls c;

    public a(String str, boolean z, tls tlsVar) {
        this.a = str;
        this.b = z;
        this.c = tlsVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        zdv xdvVar;
        final zdv zdvVar;
        byte[] decode;
        String str = this.a;
        try {
            decode = Base64.decode(cvu0.x(str, "data:", false) ? str.substring(evu0.G(str, HexString.CHAR_COMMA, 0, 6) + 1) : str, 0);
        } catch (Exception e) {
            xdvVar = new xdv(e);
        }
        if (cvu0.x(str, "data:image/svg", false)) {
            zdvVar = ydv.a(djb1.h(new ByteArrayInputStream(decode)));
            if (this.b) {
                ngd0.G.t(new sls() { // from class: com.yandex.div.core.DecodeBase64ImageTask$run$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.sls
                    public final Object invoke() {
                        a.this.c.invoke(zdvVar);
                        return zy11.a;
                    }
                });
                return;
            } else {
                this.c.invoke(zdvVar);
                return;
            }
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
        if (decodeByteArray == null) {
            ny61.g(oyr.m(decode.length, " bytes", new StringBuilder("Failed to decode bitmap from ")));
            decodeByteArray = null;
        }
        xdvVar = new wdv(decodeByteArray);
        zdvVar = xdvVar;
        if (this.b) {
        }
    }
}
