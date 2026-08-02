package com.yandex.passport.internal.helper;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.sso.announcing.SsoAccountsSyncHelper$Source;
import com.yandex.passport.internal.sso.announcing.SsoAnnouncer$Source;
import com.yandex.passport.internal.sso.l;
import com.yandex.passport.internal.sso.m;
import com.yandex.passport.internal.storage.i;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class c {
    public final Context a;
    public final i b;
    public final com.yandex.passport.internal.sso.h c;
    public final l d;

    public c(Context context, i iVar, com.yandex.passport.internal.sso.h hVar, l lVar) {
        this.a = context;
        this.b = iVar;
        this.c = hVar;
        this.d = lVar;
    }

    public final void a() {
        boolean a = this.d.a();
        int i = 0;
        i iVar = this.b;
        if (a) {
            iVar.i.setValue(iVar, i.m[7], 0);
            return;
        }
        int intValue = ((Number) iVar.i.getValue(iVar, i.m[7])).intValue();
        Context context = this.a;
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle != null) {
                i = bundle.getInt("com.yandex.auth.INTERNAL_VERSION", 0);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (intValue < i) {
            if (intValue < 70000) {
                com.yandex.passport.internal.sso.h hVar = this.c;
                Iterator it = hVar.a.a().iterator();
                while (it.hasNext()) {
                    for (com.yandex.passport.internal.sso.c cVar : ((m) it.next()).a()) {
                        try {
                            hVar.c.b(cVar.a(), SsoAccountsSyncHelper$Source.BOOTSTRAP);
                            break;
                        } catch (Exception e) {
                            com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.b(LogLevel.DEBUG, null, "Failed to sync action with " + cVar.a(), e);
                            }
                        }
                    }
                }
                hVar.b.b(SsoAnnouncer$Source.BOOTSTRAP);
            }
            iVar.i.setValue(iVar, i.m[7], Integer.valueOf(i));
        }
    }
}
