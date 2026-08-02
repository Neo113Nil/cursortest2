package xsna;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class op01 {
    public final mb01 a;

    public op01(mb01 mb01Var) {
        this.a = mb01Var;
    }

    public final void a(Bundle bundle, String str) {
        String uri;
        mb01 mb01Var = this.a;
        x901 x901Var = mb01Var.i;
        kb01 kb01Var = mb01Var.k;
        mb01.k(kb01Var);
        kb01Var.k();
        if (mb01Var.b()) {
            return;
        }
        if (bundle.isEmpty()) {
            uri = null;
        } else {
            if (true == str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            uri = builder.build().toString();
        }
        if (TextUtils.isEmpty(uri)) {
            return;
        }
        mb01.i(x901Var);
        x901Var.x.b(uri);
        mb01.i(x901Var);
        u901 u901Var = x901Var.y;
        mb01Var.o.getClass();
        u901Var.b(System.currentTimeMillis());
    }

    public final boolean b() {
        x901 x901Var = this.a.i;
        mb01.i(x901Var);
        return x901Var.y.a() > 0;
    }

    public final boolean c() {
        if (!b()) {
            return false;
        }
        mb01 mb01Var = this.a;
        mb01Var.o.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        x901 x901Var = mb01Var.i;
        mb01.i(x901Var);
        return currentTimeMillis - x901Var.y.a() > mb01Var.h.q(null, s701.R);
    }
}
