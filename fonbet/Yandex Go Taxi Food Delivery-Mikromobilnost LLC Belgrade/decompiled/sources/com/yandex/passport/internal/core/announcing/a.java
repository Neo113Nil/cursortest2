package com.yandex.passport.internal.core.announcing;

import android.content.Intent;
import android.os.Bundle;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.AccountRow;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import defpackage.evu0;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes15.dex */
public final class a {
    public final String a;
    public final Bundle b;

    public a(String str, Bundle bundle) {
        this.a = str;
        this.b = bundle;
    }

    public static void a(ArrayList arrayList, String str, AccountRow accountRow) {
        Environment environment;
        String str2 = accountRow.uidString;
        if (str2 == null) {
            com.yandex.passport.legacy.a.b("add: account.uidString is null, action ignored");
            return;
        }
        int D = evu0.D(str2, ':', 0, false);
        Uid uid = null;
        if (D >= 1 && D != str2.length() - 1) {
            String substring = str2.substring(0, D);
            try {
                long parseLong = Long.parseLong(str2.substring(D + 1));
                if (parseLong > 0) {
                    try {
                        com.yandex.passport.common.core.a aVar = Environment.Companion;
                        int parseInt = Integer.parseInt(substring);
                        aVar.getClass();
                        environment = com.yandex.passport.common.core.a.a(parseInt);
                    } catch (Exception unused) {
                        environment = Environment.PRODUCTION;
                    }
                    uid = new Uid(environment, parseLong);
                }
            } catch (NumberFormatException unused2) {
            }
        }
        if (uid == null) {
            com.yandex.passport.legacy.a.b("add: uid is null, action ignored");
        } else {
            arrayList.add(b(uid, str));
        }
    }

    public static a b(Uid uid, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt(WebViewActivity.KEY_ENVIRONMENT, uid.getEnvironment().getInteger());
        bundle.putLong("uid", uid.getValue());
        return new a(str, bundle);
    }

    public static ArrayList c(com.yandex.passport.internal.a aVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = aVar.a.iterator();
        while (it.hasNext()) {
            a(arrayList, "com.yandex.passport.client.ACCOUNT_ADDED", (AccountRow) it.next());
        }
        Iterator it2 = aVar.c.iterator();
        while (it2.hasNext()) {
            a(arrayList, "com.yandex.passport.client.TOKEN_CHANGED", (AccountRow) it2.next());
        }
        Iterator it3 = aVar.d.iterator();
        while (it3.hasNext()) {
            a(arrayList, "com.yandex.passport.client.ACCOUNT_REMOVED", (AccountRow) it3.next());
        }
        return arrayList;
    }

    public final Intent d() {
        Intent intent = new Intent(this.a);
        intent.putExtras(this.b);
        return intent;
    }

    public final String toString() {
        return "AccountChanges{action='" + this.a + "', extras=" + this.b + '}';
    }
}
