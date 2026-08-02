package com.yandex.passport.internal.authsdk;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import com.yandex.passport.api.exception.PassportRuntimeUnknownException;
import com.yandex.passport.internal.properties.u;
import com.yandex.passport.internal.ui.sloth.e;
import defpackage.ny61;
import defpackage.oyr;

/* loaded from: classes8.dex */
public class AuthSdkProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public Bundle call(String str, String str2, Bundle bundle) {
        try {
            AuthSdkProviderHelper$Method valueOf = AuthSdkProviderHelper$Method.valueOf(str);
            Context context = getContext();
            e.d(context);
            String nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid());
            b loginSdkProviderHelper = com.yandex.passport.internal.di.a.a().getLoginSdkProviderHelper();
            if (nameForUid != null) {
                Context context2 = getContext();
                loginSdkProviderHelper.getClass();
                if (b.b(context2, nameForUid)) {
                    if (a.a[valueOf.ordinal()] == 1) {
                        return loginSdkProviderHelper.a();
                    }
                    ny61.r("Unknown method");
                    return null;
                }
            }
            ny61.z("Untrusted application");
            return null;
        } catch (IllegalArgumentException unused) {
            return u.r(new PassportRuntimeUnknownException(oyr.p("Unknown provider method '", str, "'")));
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }
}
