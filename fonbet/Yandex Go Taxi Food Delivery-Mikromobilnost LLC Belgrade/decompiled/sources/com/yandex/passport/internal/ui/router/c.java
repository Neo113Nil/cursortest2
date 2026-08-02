package com.yandex.passport.internal.ui.router;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.internal.properties.LoginProperties;
import defpackage.d6z;
import defpackage.j73;
import defpackage.w511;
import defpackage.wwg;
import java.util.Iterator;
import kotlin.Pair;

/* loaded from: classes8.dex */
public final class c {
    public static Intent a(Context context, LoginProperties loginProperties, boolean z, String str, String str2) {
        Intent d = d(context, RoadSign.LOGIN, loginProperties != null ? loginProperties.toBundle() : null, wwg.g(new Pair("passport_action", str2)));
        d.putExtra(GlobalRouterActivity.EXTERNAL_EXTRA, !z);
        d.putExtra(GlobalRouterActivity.CORRECTION_EXTRA, str);
        return d;
    }

    public static /* synthetic */ Intent b(c cVar, Context context, LoginProperties loginProperties, String str, int i) {
        boolean z = (i & 4) != 0;
        if ((i & 8) != 0) {
            str = null;
        }
        cVar.getClass();
        return a(context, loginProperties, z, str, null);
    }

    public static int c(PassportTheme passportTheme) {
        int i = b.a[passportTheme.ordinal()];
        if (i == 1 || i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return -1;
        }
        w511.b();
        return 0;
    }

    public static Intent d(Context context, RoadSign roadSign, Bundle... bundleArr) {
        Bundle bundle = new Bundle();
        bundle.putString(GlobalRouterActivity.ROAD_SIGN_EXTRA, roadSign.name());
        bundle.putBoolean(GlobalRouterActivity.EXTERNAL_EXTRA, true);
        Iterator it = j73.A(bundleArr).iterator();
        while (it.hasNext()) {
            bundle.putAll((Bundle) it.next());
        }
        return d6z.B(context, GlobalRouterActivity.class, bundle);
    }
}
