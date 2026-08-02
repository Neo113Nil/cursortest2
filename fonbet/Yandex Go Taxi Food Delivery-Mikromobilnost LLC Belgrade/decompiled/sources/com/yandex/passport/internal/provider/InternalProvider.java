package com.yandex.passport.internal.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import com.yandex.passport.api.exception.PassportAccountNotAuthorizedException;
import com.yandex.passport.api.exception.PassportAccountNotFoundException;
import com.yandex.passport.api.exception.PassportAuthorizationPendingException;
import com.yandex.passport.api.exception.PassportAutoLoginImpossibleException;
import com.yandex.passport.api.exception.PassportCodeInvalidException;
import com.yandex.passport.api.exception.PassportCookieInvalidException;
import com.yandex.passport.api.exception.PassportCredentialsNotFoundException;
import com.yandex.passport.api.exception.PassportException;
import com.yandex.passport.api.exception.PassportFailedResponseException;
import com.yandex.passport.api.exception.PassportIOException;
import com.yandex.passport.api.exception.PassportInvalidTokenException;
import com.yandex.passport.api.exception.PassportInvalidTrackIdException;
import com.yandex.passport.api.exception.PassportInvalidUrlException;
import com.yandex.passport.api.exception.PassportRuntimeUnknownException;
import com.yandex.passport.api.exception.PassportSyncLimitExceededException;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.analytics.n;
import com.yandex.passport.internal.analytics.t;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.methods.MethodRef;
import com.yandex.passport.internal.methods.g0;
import com.yandex.passport.internal.methods.performer.v0;
import com.yandex.passport.internal.methods.x2;
import com.yandex.passport.internal.properties.u;
import com.yandex.passport.internal.util.p;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.b64;
import defpackage.j73;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.tls;
import defpackage.unr0;
import defpackage.z8u0;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 G2\u00020\u0001:\u0001HB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006*\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ,\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\t2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00120\u0011H\u0082\b¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u001a\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001d\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u00142\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\"\u0010\u0003J\u000f\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J-\u0010)\u001a\u0004\u0018\u00010\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b)\u0010\u000fJM\u00102\u001a\u0004\u0018\u0001012\u0006\u0010+\u001a\u00020*2\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010,2\b\u0010.\u001a\u0004\u0018\u00010\t2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010,2\b\u00100\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u0002042\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b5\u00106J!\u00109\u001a\u0002042\u0006\u0010+\u001a\u00020*2\b\u00108\u001a\u0004\u0018\u000107H\u0016¢\u0006\u0004\b9\u0010:J1\u0010;\u001a\u0002042\u0006\u0010+\u001a\u00020*2\b\u0010.\u001a\u0004\u0018\u00010\t2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010,H\u0016¢\u0006\u0004\b;\u0010<J;\u0010=\u001a\u0002042\u0006\u0010+\u001a\u00020*2\b\u00108\u001a\u0004\u0018\u0001072\b\u0010.\u001a\u0004\u0018\u00010\t2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010,H\u0016¢\u0006\u0004\b=\u0010>R\u0016\u0010@\u001a\u00020?8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010C\u001a\u00020B8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006I"}, d2 = {"Lcom/yandex/passport/internal/provider/InternalProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "wrapAsException", "(Ljava/lang/Throwable;)Ljava/lang/Exception;", "", "method", "arg", "Landroid/os/Bundle;", "extras", "tryCall", "(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;", "methodString", "Lkotlin/Function1;", "Lzy11;", "onError", "Lcom/yandex/passport/internal/methods/MethodRef;", "resolveMethodRef", "(Ljava/lang/String;Ltls;)Lcom/yandex/passport/internal/methods/MethodRef;", "", "startTime", "exceptionMessage", "reportExecutionTime", "(Ljava/lang/String;JLjava/lang/String;)V", "th", "reportExecutionTimeWithException", "(Ljava/lang/String;JLjava/lang/Throwable;)V", "methodRef", "callImpl", "(Lcom/yandex/passport/internal/methods/MethodRef;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;", "injectSelf", "Landroid/content/Context;", "requireContextInternal", "()Landroid/content/Context;", "", "onCreate", "()Z", "call", "Landroid/net/Uri;", LaunchBrowserActivity.KEY_URI, "", "projection", "selection", "selectionArgs", "sortOrder", "Landroid/database/Cursor;", "query", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "", "getType", "(Landroid/net/Uri;)Ljava/lang/Void;", "Landroid/content/ContentValues;", "values", "insert", "(Landroid/net/Uri;Landroid/content/ContentValues;)Ljava/lang/Void;", "delete", "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/Void;", "update", "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/Void;", "Lcom/yandex/passport/internal/methods/performer/v0;", "methodPerformDispatcher", "Lcom/yandex/passport/internal/methods/performer/v0;", "Lcom/yandex/passport/internal/analytics/t;", "appAnalyticsTracker", "Lcom/yandex/passport/internal/analytics/t;", "injected", "Z", "Companion", "com/yandex/passport/internal/provider/a", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class InternalProvider extends ContentProvider {
    public static final int $stable = 8;
    public static final a Companion = new a();
    private static volatile boolean isInPassportProcess;
    private t appAnalyticsTracker;
    private boolean injected;
    private v0 methodPerformDispatcher;

    private final Bundle callImpl(MethodRef methodRef, String arg, Bundle extras) throws PassportAccountNotFoundException, PassportAccountNotAuthorizedException, PassportCredentialsNotFoundException, PassportIOException, PassportRuntimeUnknownException, PassportCodeInvalidException, PassportCookieInvalidException, PassportAutoLoginImpossibleException, PassportFailedResponseException, PassportAuthorizationPendingException, PassportSyncLimitExceededException, PassportInvalidTrackIdException, PassportInvalidUrlException, PassportInvalidTokenException {
        extras.setClassLoader(p.class.getClassLoader());
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Going to performMethod " + methodRef, 8);
        }
        v0 v0Var = this.methodPerformDispatcher;
        v0 v0Var2 = v0Var != null ? v0Var : null;
        x2 a = g0.a(methodRef, extras);
        v0Var2.getClass();
        Object value = ((Result) new z8u0(4, v0Var2, a).invoke()).getValue();
        Throwable a2 = Result.a(value);
        if (a2 == null) {
            Bundle bundle = new Bundle();
            a.c().d(bundle, value);
            return bundle;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putSerializable(Constants.KEY_EXCEPTION, a2);
        return bundle2;
    }

    private final void injectSelf() {
        if (this.injected) {
            return;
        }
        PassportProcessGlobalComponent a = com.yandex.passport.internal.di.a.a();
        this.methodPerformDispatcher = a.getMethodPerformDispatcher();
        this.appAnalyticsTracker = a.getAnalyticsTrackerWrapper();
        this.injected = true;
    }

    private final void reportExecutionTime(String method, long startTime, String exceptionMessage) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - startTime;
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, n.d + ": method=" + method + " time=" + elapsedRealtime, 8);
        }
        Map s = kotlin.collections.b.s(j73.A(Arrays.copyOf(new Pair[]{new Pair("method", method), new Pair("execution_time", String.valueOf(elapsedRealtime)), exceptionMessage != null ? new Pair(Constants.KEY_EXCEPTION, exceptionMessage) : null}, 3)));
        t tVar = this.appAnalyticsTracker;
        (tVar != null ? tVar : null).d(n.d, s);
    }

    private final void reportExecutionTimeWithException(String method, long startTime, Throwable th) {
        try {
            if (startTime != 0) {
                reportExecutionTime(method, startTime, th.getMessage());
                return;
            }
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.ERROR, null, "reportExecutionTimeWithException: startTime is not initialized", 8);
            }
        } catch (Throwable th2) {
            com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "reportExecutionTimeWithException", th2);
            }
        }
    }

    private final Context requireContextInternal() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        ny61.r("Cannot find context from the provider.");
        return null;
    }

    private final MethodRef resolveMethodRef(String methodString, tls onError) {
        try {
            return MethodRef.valueOf(methodString);
        } catch (IllegalArgumentException e) {
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, unr0.l('\'', "call: unknown method '", methodString), e);
            }
            t tVar = this.appAnalyticsTracker;
            if (tVar == null) {
                tVar = null;
            }
            tVar.c(e);
            onError.invoke(u.r(new PassportRuntimeUnknownException(unr0.l('\'', "Unknown provider method '", methodString))));
            ny61.r("Internal Error");
            return null;
        }
    }

    private final Bundle tryCall(String method, String arg, Bundle extras) {
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            LogLevel logLevel = LogLevel.DEBUG;
            StringBuilder sb = new StringBuilder("call: isInPassportProcess=");
            unr0.A(" method='", method, "' arg='", sb, isInPassportProcess);
            sb.append(arg);
            sb.append("' extras=");
            sb.append(extras);
            com.yandex.passport.common.logger.a.c(logLevel, null, sb.toString(), 8);
        }
        injectSelf();
        try {
            MethodRef valueOf = MethodRef.valueOf(method);
            if (extras != null) {
                return callImpl(valueOf, arg, extras);
            }
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.ERROR, null, oyr.p("call: method='", method, "': extras is null"), 8);
            }
            PassportRuntimeUnknownException passportRuntimeUnknownException = new PassportRuntimeUnknownException(unr0.l('\'', "Extra is null for method '", method));
            t tVar = this.appAnalyticsTracker;
            (tVar != null ? tVar : null).c(passportRuntimeUnknownException);
            return u.r(passportRuntimeUnknownException);
        } catch (IllegalArgumentException e) {
            com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, unr0.l('\'', "call: unknown method '", method), e);
            }
            t tVar2 = this.appAnalyticsTracker;
            (tVar2 != null ? tVar2 : null).c(e);
            return u.r(new PassportRuntimeUnknownException(unr0.l('\'', "Unknown provider method '", method)));
        }
    }

    private final Exception wrapAsException(Throwable th) {
        return th instanceof Exception ? (Exception) th : new Exception(th);
    }

    @Override // android.content.ContentProvider
    public Bundle call(String method, String arg, Bundle extras) {
        long j;
        try {
            try {
                j = SystemClock.elapsedRealtime();
            } catch (Throwable th) {
                th = th;
                j = 0;
            }
            try {
                return tryCall(method, arg, extras);
            } catch (Throwable th2) {
                th = th2;
                com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "call", th);
                }
                Exception wrapAsException = this.wrapAsException(th);
                if (this.injected) {
                    this.reportExecutionTimeWithException(method, j, th);
                    t tVar = this.appAnalyticsTracker;
                    (tVar != null ? tVar : null).c(wrapAsException);
                } else if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.ERROR, null, b64.m("appAnalyticsTracker is not injected on ", " catch", th), 8);
                }
                return u.r(wrapAsException);
            }
        } catch (PassportException e) {
            com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.b(LogLevel.DEBUG, null, "call", e);
            }
            return u.r(e);
        } catch (PassportIOException e2) {
            com.yandex.passport.common.logger.c cVar3 = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.b(LogLevel.DEBUG, null, "call", e2);
            }
            return u.r(e2);
        } catch (SecurityException e3) {
            com.yandex.passport.common.logger.c cVar4 = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.b(LogLevel.DEBUG, null, "call", e3);
            }
            throw e3;
        }
    }

    @Override // android.content.ContentProvider
    public /* bridge */ /* synthetic */ int delete(Uri uri, String str, String[] strArr) {
        return ((Number) delete(uri, str, strArr)).intValue();
    }

    @Override // android.content.ContentProvider
    public /* bridge */ /* synthetic */ String getType(Uri uri) {
        return (String) getType(uri);
    }

    @Override // android.content.ContentProvider
    public /* bridge */ /* synthetic */ Uri insert(Uri uri, ContentValues contentValues) {
        return (Uri) insert(uri, contentValues);
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "onCreate", 8);
        }
        isInPassportProcess = true;
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public /* bridge */ /* synthetic */ int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return ((Number) update(uri, contentValues, str, strArr)).intValue();
    }

    @Override // android.content.ContentProvider
    public Void getType(Uri uri) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public Void insert(Uri uri, ContentValues values) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public Void delete(Uri uri, String selection, String[] selectionArgs) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public Void update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        throw new UnsupportedOperationException();
    }
}
