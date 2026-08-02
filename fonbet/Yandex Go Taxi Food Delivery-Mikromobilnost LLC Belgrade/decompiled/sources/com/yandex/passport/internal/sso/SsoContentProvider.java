package com.yandex.passport.internal.sso;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.analytics.c0;
import com.yandex.passport.internal.analytics.p;
import com.yandex.passport.internal.analytics.t;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.properties.u;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.k4o;
import defpackage.uw51;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u00015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\f\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0016\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017JM\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0018\u001a\u00020\u00122\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u001f\u0010 J;\u0010$\u001a\u00020#2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010!\u001a\u0004\u0018\u00010\u00062\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0019H\u0016¢\u0006\u0004\b$\u0010%J1\u0010&\u001a\u00020#2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010!\u001a\u0004\u0018\u00010\u00062\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0019H\u0016¢\u0006\u0004\b&\u0010'J\u0019\u0010(\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00101\u001a\u0002008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104¨\u00066"}, d2 = {"Lcom/yandex/passport/internal/sso/SsoContentProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "Lzy11;", "injectSelf", "", "getCallingPackageName", "()Ljava/lang/String;", "", "onCreate", "()Z", "method", "arg", "Landroid/os/Bundle;", "extras", "call", "(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;", "Landroid/net/Uri;", LaunchBrowserActivity.KEY_URI, "Landroid/content/ContentValues;", "values", "insert", "(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;", "a", "", "b", "c", "d", "e", "Landroid/database/Cursor;", "query", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "selection", "selectionArgs", "", "update", "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "delete", "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", "getType", "(Landroid/net/Uri;)Ljava/lang/String;", "Lcom/yandex/passport/internal/analytics/t;", "appAnalyticsTracker", "Lcom/yandex/passport/internal/analytics/t;", "Lcom/yandex/passport/internal/analytics/c0;", "eventReporter", "Lcom/yandex/passport/internal/analytics/c0;", "Lcom/yandex/passport/internal/sso/k;", "ssoContentProviderHelper", "Lcom/yandex/passport/internal/sso/k;", "injected", "Z", "Method", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SsoContentProvider extends ContentProvider {
    public static final int $stable = 8;
    private t appAnalyticsTracker;
    private c0 eventReporter;
    private boolean injected;
    private k ssoContentProviderHelper;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/passport/internal/sso/SsoContentProvider$Method;", "", "<init>", "(Ljava/lang/String;I)V", "GetAccounts", "InsertAccounts", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Method {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Method[] $VALUES;
        public static final Method GetAccounts = new Method("GetAccounts", 0);
        public static final Method InsertAccounts = new Method("InsertAccounts", 1);

        private static final /* synthetic */ Method[] $values() {
            return new Method[]{GetAccounts, InsertAccounts};
        }

        static {
            Method[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private Method(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static Method valueOf(String str) {
            return (Method) Enum.valueOf(Method.class, str);
        }

        public static Method[] values() {
            return (Method[]) $VALUES.clone();
        }
    }

    private final String getCallingPackageName() {
        String nameForUid = getContext().getPackageManager().getNameForUid(Binder.getCallingUid());
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            uw51.w("callingPackageName: ", nameForUid, LogLevel.DEBUG, null, 8);
        }
        return nameForUid;
    }

    private final void injectSelf() {
        if (this.injected) {
            return;
        }
        PassportProcessGlobalComponent a = com.yandex.passport.internal.di.a.a();
        this.appAnalyticsTracker = a.getAnalyticsTrackerWrapper();
        this.eventReporter = a.getEventReporter();
        this.ssoContentProviderHelper = a.getSsoContentProviderHelper();
        this.injected = true;
    }

    @Override // android.content.ContentProvider
    public Bundle call(String method, String arg, Bundle extras) {
        try {
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "call: method='" + method + "' arg='" + arg + "' extras=" + extras, 8);
            }
            injectSelf();
            String callingPackageName = getCallingPackageName();
            k kVar = this.ssoContentProviderHelper;
            if (kVar == null) {
                kVar = null;
            }
            kVar.a(callingPackageName);
            try {
                int i = i.a[Method.valueOf(method).ordinal()];
                if (i == 1) {
                    c0 c0Var = this.eventReporter;
                    if (c0Var == null) {
                        c0Var = null;
                    }
                    c0Var.getClass();
                    c0Var.i(callingPackageName, p.i);
                    k kVar2 = this.ssoContentProviderHelper;
                    if (kVar2 == null) {
                        kVar2 = null;
                    }
                    return kVar2.b(callingPackageName);
                }
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                c0 c0Var2 = this.eventReporter;
                if (c0Var2 == null) {
                    c0Var2 = null;
                }
                c0Var2.getClass();
                c0Var2.i(callingPackageName, p.k);
                if (extras == null) {
                    throw new IllegalArgumentException("method=InsertAccounts: extras null");
                }
                k kVar3 = this.ssoContentProviderHelper;
                if (kVar3 == null) {
                    kVar3 = null;
                }
                Set set = b.c;
                return kVar3.c(callingPackageName, u.D(extras));
            } catch (IllegalArgumentException e) {
                com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "call: unknown method '" + method + '\'', e);
                }
                t tVar = this.appAnalyticsTracker;
                if (tVar == null) {
                    tVar = null;
                }
                tVar.c(e);
                throw new IllegalArgumentException("Unknown provider method '" + method + '\'');
            }
        } catch (Throwable th) {
            com.yandex.passport.common.logger.c cVar3 = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "call", th);
            }
            Exception exc = th instanceof Exception ? th : new Exception(th);
            t tVar2 = this.appAnalyticsTracker;
            (tVar2 != null ? tVar2 : null).c(exc);
            String message = exc.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            return u.l(message);
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues values) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri a, String[] b, String c, String[] d, String e) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        throw new UnsupportedOperationException();
    }
}
