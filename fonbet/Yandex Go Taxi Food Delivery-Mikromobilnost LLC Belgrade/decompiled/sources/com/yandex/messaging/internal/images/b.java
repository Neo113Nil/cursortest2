package com.yandex.messaging.internal.images;

import android.graphics.Bitmap;
import com.adjust.sdk.Constants;
import com.yandex.images.HttpException;
import defpackage.c370;
import defpackage.d5b1;
import defpackage.h3y;
import defpackage.ht10;
import defpackage.j220;
import defpackage.jwu;
import defpackage.kbs;
import defpackage.kvj0;
import defpackage.kwu;
import defpackage.rvj0;
import defpackage.w511;
import defpackage.xn50;
import defpackage.yf7;
import defpackage.zn50;
import java.io.IOException;
import java.net.NoRouteToHostException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.concurrent.ExecutionException;
import javax.net.ssl.SSLException;

/* loaded from: classes15.dex */
public final class b extends zn50 {
    public final h3y b;
    public final h3y c;
    public final h3y d;

    public b(h3y h3yVar, h3y h3yVar2, h3y h3yVar3) {
        this.b = h3yVar;
        this.c = h3yVar2;
        this.d = h3yVar3;
    }

    public static String f(String str) {
        if (str == null) {
            return "";
        }
        jwu jwuVar = new jwu();
        jwuVar.o(Constants.SCHEME);
        jwuVar.h("messenger.authorized");
        jwuVar.c(str, true);
        return jwuVar.e().i;
    }

    @Override // defpackage.zn50
    public final boolean a(xn50 xn50Var) {
        return "messenger.authorized".equals(xn50Var.b.getAuthority());
    }

    @Override // defpackage.zn50
    public final ht10 c(xn50 xn50Var) {
        yf7 yf7Var;
        h3y h3yVar = this.d;
        kwu h = kwu.h(xn50Var.a);
        yf7 yf7Var2 = null;
        if (h == null) {
            w511.q();
            return null;
        }
        MessengerImageUriHandler$PreviewSize a = MessengerImageUriHandler$PreviewSize.a(xn50Var.i, xn50Var.j);
        if (a != null) {
            jwu g = h.g();
            g.d("size", a.name);
            h = g.e();
        }
        try {
            try {
                yf7Var = (yf7) new j220(this, h).get();
            } catch (IOException e) {
                e = e;
            }
            try {
                kvj0 execute = yf7Var.execute();
                int i = execute.w;
                if (i != 200) {
                    ((c370) h3yVar.get()).a(3, execute.a.a.i, String.valueOf(i));
                    throw new HttpException(i);
                }
                rvj0 rvj0Var = execute.z;
                if (rvj0Var == null) {
                    throw new IOException("Not OK, body is null");
                }
                if (!xn50Var.g || xn50Var.i <= 0 || xn50Var.j <= 0) {
                    return new ht10((Bitmap) null, rvj0Var.bytes());
                }
                return new ht10(d5b1.f(xn50Var.i, xn50Var.j, rvj0Var.bytes()), (byte[]) null);
            } catch (IOException e2) {
                e = e2;
                yf7Var2 = yf7Var;
                if (e instanceof UnknownHostException) {
                    ((c370) h3yVar.get()).a(4, yf7Var2.k().a.i, "DNS_FAILED");
                } else if (e instanceof SocketTimeoutException) {
                    ((c370) h3yVar.get()).a(6, yf7Var2.k().a.i, "TIMEOUT");
                } else if (e instanceof NoRouteToHostException) {
                    ((c370) h3yVar.get()).a(3, yf7Var2.k().a.i, "NO_ROUTE");
                } else if (e instanceof SSLException) {
                    ((c370) h3yVar.get()).a(5, yf7Var2.k().a.i, "SSL_ERROR");
                } else {
                    ((c370) h3yVar.get()).a(3, yf7Var2.k().a.i, "OTHER");
                }
                throw e;
            }
        } catch (InterruptedException e3) {
            Thread.currentThread().interrupt();
            kbs.r(e3);
            return null;
        } catch (ExecutionException e4) {
            kbs.r(e4);
            return null;
        }
    }
}
