package xsna;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import com.ironsource.O6;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes.dex */
public final class h2z0 extends oi6 {
    public volatile HashMap a;

    public final synchronized Map g(Context context) {
        if (o8z0.b()) {
            gu8.c(null, "AppSetIdDataProvider: You must not call collectData method from main thread");
            return new HashMap();
        }
        if (this.a != null) {
            return new HashMap(this.a);
        }
        this.a = new HashMap();
        final b7z0 b = b7z0.b(context);
        final String e = b.e(O6.M0);
        final int a = b.a("asis");
        if (!TextUtils.isEmpty(e)) {
            this.a.put(O6.M0, e);
        }
        if (a != -1) {
            this.a.put("asis", String.valueOf(a));
        }
        try {
            AppSet.getClient(context).getAppSetIdInfo().addOnSuccessListener(o8z0.b, new OnSuccessListener() { // from class: xsna.g2z0
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    h2z0 h2z0Var = h2z0.this;
                    int i = a;
                    b7z0 b7z0Var = b;
                    String str = e;
                    AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
                    h2z0Var.getClass();
                    int scope = appSetIdInfo.getScope();
                    if (scope != i) {
                        b7z0Var.c("asis", scope);
                        synchronized (h2z0Var) {
                            h2z0Var.a.put("asis", String.valueOf(scope));
                        }
                        gu8.c(null, "AppSetIdDataProvider: new scope value has been received: " + scope);
                    }
                    String id = appSetIdInfo.getId();
                    if (id.equals(str)) {
                        return;
                    }
                    b7z0Var.d(O6.M0, id);
                    synchronized (h2z0Var) {
                        h2z0Var.a.put(O6.M0, id);
                    }
                    gu8.c(null, "AppSetIdDataProvider: new id value has been received: ".concat(id));
                }
            });
        } catch (Throwable unused) {
            gu8.c(null, "AppSetIdDataProvider: error occurred while trying to access app set id info");
        }
        return new HashMap(this.a);
    }
}
