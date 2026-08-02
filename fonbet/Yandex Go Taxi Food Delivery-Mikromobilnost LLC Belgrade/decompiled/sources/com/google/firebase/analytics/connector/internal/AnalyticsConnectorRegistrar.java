package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.e;
import com.google.firebase.a;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.a1d;
import defpackage.c32;
import defpackage.cvw;
import defpackage.d32;
import defpackage.g0d;
import defpackage.j0d;
import defpackage.jx81;
import defpackage.tms;
import defpackage.vwi;
import defpackage.vzu0;
import defpackage.weo;
import defpackage.wms;
import defpackage.ykj;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static c32 lambda$getComponents$0(a1d a1dVar) {
        a aVar = (a) a1dVar.a(a.class);
        Context context = (Context) a1dVar.a(Context.class);
        vzu0 vzu0Var = (vzu0) a1dVar.a(vzu0.class);
        cvw.l(aVar);
        cvw.l(context);
        cvw.l(vzu0Var);
        cvw.l(context.getApplicationContext());
        if (d32.c == null) {
            synchronized (d32.class) {
                try {
                    if (d32.c == null) {
                        Bundle bundle = new Bundle(1);
                        aVar.a();
                        if ("[DEFAULT]".equals(aVar.b)) {
                            ((weo) vzu0Var).a(ykj.x, wms.b);
                            bundle.putBoolean("dataCollectionDefaultEnabled", aVar.j());
                        }
                        d32.c = new d32(e.c(context, bundle).b);
                    }
                } finally {
                }
            }
        }
        return d32.c;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<j0d> getComponents() {
        g0d b = j0d.b(c32.class);
        b.a(vwi.b(a.class));
        b.a(vwi.b(Context.class));
        b.a(vwi.b(vzu0.class));
        b.g = tms.b;
        b.e(2);
        return Arrays.asList(b.c(), jx81.j("fire-analytics", "23.0.0"));
    }
}
