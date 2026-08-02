package com.yandex.passport.api.internal.integration;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.yandex.passport.internal.account.c;
import com.yandex.passport.internal.database.DatabaseHelper;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import defpackage.g8e;

@Deprecated
/* loaded from: classes15.dex */
public class TestProvider extends ContentProvider {
    public static final String AUTHORITY_PREFIX = "com.yandex.passport.test.integration.";
    public static final String EXCEPTION_MESSAGE_KEY = "exception-message";
    public static final String EXCEPTION_TRACE_KEY = "exception-trace";
    private DatabaseHelper databaseHelper;
    private boolean injected;
    private c loginController;

    public static String getAuthority(String str) {
        return g8e.o("content://com.yandex.passport.test.integration.", str);
    }

    private void injectSelf() {
        if (this.injected) {
            return;
        }
        PassportProcessGlobalComponent a = com.yandex.passport.internal.di.a.a();
        this.databaseHelper = a.getDatabaseHelper();
        this.loginController = a.getLoginController();
        this.injected = true;
    }

    private Bundle sendException(Exception exc) {
        Bundle bundle = new Bundle();
        bundle.putString(EXCEPTION_MESSAGE_KEY, exc.getMessage() != null ? exc.getMessage() : exc.getClass().getCanonicalName());
        StackTraceElement[] stackTrace = exc.getStackTrace();
        String[] strArr = new String[stackTrace.length];
        for (int i = 0; i < stackTrace.length; i++) {
            strArr[i] = stackTrace[i].toString();
        }
        bundle.putStringArray(EXCEPTION_TRACE_KEY, strArr);
        return bundle;
    }

    @Override // android.content.ContentProvider
    public Bundle call(String str, String str2, Bundle bundle) {
        injectSelf();
        try {
            return new b(this.databaseHelper, this.loginController, str, bundle).a();
        } catch (Exception e) {
            com.yandex.passport.legacy.a.e(3, "TestInternalDataResponder.response()", e);
            return this.sendException(e);
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
