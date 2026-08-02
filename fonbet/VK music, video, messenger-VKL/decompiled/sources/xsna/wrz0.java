package xsna;

import android.content.Context;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashMap;
import java.util.Map;
import xsna.oay0;
import xsna.z8y0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class wrz0 extends z8y0.a {
    @Override // xsna.z8y0.a
    public final int b(Context context) {
        return b7z0.b(context).a("sdk_flags");
    }

    @Override // xsna.z8y0.a
    public final HashMap c(u6z0 u6z0Var, s3z0 s3z0Var, Context context) {
        String join;
        String str;
        String str2;
        HashMap c = super.c(u6z0Var, s3z0Var, context);
        oay0 oay0Var = oay0.e;
        oay0.a aVar = u6z0Var.a.d;
        synchronized (oay0Var) {
            try {
                Map snapshot = oay0Var.a.snapshot();
                if (snapshot.isEmpty()) {
                    str = "";
                    join = "";
                } else {
                    String join2 = TextUtils.join(StringUtils.COMMA, snapshot.keySet());
                    join = TextUtils.join(StringUtils.COMMA, snapshot.values());
                    str = join2;
                }
                String a = oay0.a(oay0Var.d ? ((oay0Var.b + aVar.a) - oay0Var.c) / 1000 : 0L, aVar.b);
                if (!join.isEmpty() && !a.isEmpty()) {
                    str2 = join + StringUtils.COMMA + a;
                }
                str2 = join + a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!str.isEmpty()) {
            c.put("exb", str);
            gu8.c(null, "NativeAdServiceBuilder: Exclude list - ".concat(str));
        }
        if (!str2.isEmpty()) {
            c.put("excrid", str2);
        }
        return c;
    }
}
