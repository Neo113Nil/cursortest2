package com.yandex.passport.internal.helper;

import android.net.Uri;
import com.yandex.passport.api.exception.PassportAccountNotFoundException;
import com.yandex.passport.api.exception.PassportInvalidUrlException;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.ModernAccount;
import defpackage.unr0;

/* loaded from: classes8.dex */
public final class b {
    public final com.yandex.passport.internal.network.client.c a;
    public final com.yandex.passport.internal.core.accounts.d b;

    public b(com.yandex.passport.internal.network.client.c cVar, com.yandex.passport.internal.core.accounts.d dVar) {
        this.a = cVar;
        this.b = dVar;
    }

    public static String b(Uri uri, String str) {
        String queryParameter = uri.getQueryParameter(str);
        if (queryParameter != null) {
            return queryParameter;
        }
        throw new PassportInvalidUrlException(str.concat(" not found in uri"));
    }

    public final boolean a(Uid uid, Uri uri) {
        ModernAccount e = this.b.a().e(uid);
        if (e == null) {
            throw new PassportAccountNotFoundException(uid);
        }
        com.yandex.passport.internal.network.client.a a = this.a.a(uid.getEnvironment());
        String b = b(uri, "track_id");
        String b2 = b(uri, "action");
        if (b2.equals("accept")) {
            a.a(e.getMasterToken(), b, b(uri, "secret"));
            return true;
        }
        if (!b2.equals("cancel")) {
            throw new PassportInvalidUrlException(unr0.l('\'', "Invalid action value in uri: '", b2));
        }
        a.d(e.getMasterToken(), b);
        return false;
    }
}
