package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Parcelable;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.yandex.passport.api.impl.UserIdProperties;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.entities.Filter;
import com.yandex.passport.sloth.ui.SlothWebViewClient;
import com.yandex.passport.sloth.ui.webview.WebViewController;
import defpackage.jl40;
import defpackage.rt41;
import defpackage.tls;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class d1 implements com.yandex.passport.internal.core.accounts.f, rt41 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public Object w;
    public Object x;

    public d1(Context context) {
        Activity activity;
        this.a = 0;
        context.getClass();
        this.b = context;
        Intent action = new Intent().setAction("android.intent.action.SEND");
        this.c = action;
        action.putExtra("androidx.core.app.EXTRA_CALLING_PACKAGE", context.getPackageName());
        action.putExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE", context.getPackageName());
        action.addFlags(524288);
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            } else {
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (activity != null) {
            ComponentName componentName = activity.getComponentName();
            ((Intent) this.c).putExtra("androidx.core.app.EXTRA_CALLING_ACTIVITY", componentName);
            ((Intent) this.c).putExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY", componentName);
        }
    }

    public void a(Uri uri) {
        if (((ArrayList) this.x) == null) {
            this.x = new ArrayList();
        }
        ((ArrayList) this.x).add(uri);
    }

    public Intent b() {
        Intent intent = (Intent) this.c;
        ArrayList arrayList = (ArrayList) this.x;
        if (arrayList == null || arrayList.size() <= 1) {
            intent.setAction("android.intent.action.SEND");
            ArrayList arrayList2 = (ArrayList) this.x;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                intent.removeExtra("android.intent.extra.STREAM");
                intent.setClipData(null);
                intent.setFlags(intent.getFlags() & (-2));
            } else {
                intent.putExtra("android.intent.extra.STREAM", (Parcelable) ((ArrayList) this.x).get(0));
                e.c(intent, (ArrayList) this.x);
            }
        } else {
            intent.setAction("android.intent.action.SEND_MULTIPLE");
            intent.putParcelableArrayListExtra("android.intent.extra.STREAM", (ArrayList) this.x);
            e.c(intent, (ArrayList) this.x);
        }
        return Intent.createChooser(intent, (CharSequence) this.w);
    }

    public com.yandex.passport.internal.b c() {
        return (com.yandex.passport.internal.b) this.w;
    }

    public Filter d() {
        return (Filter) this.b;
    }

    public List e() {
        return (ArrayList) this.c;
    }

    public List f() {
        return (ArrayList) this.x;
    }

    @Override // defpackage.rt41
    public void l() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 3:
                ((SslErrorHandler) obj).proceed();
                break;
            default:
                ((SslErrorHandler) obj).proceed();
                break;
        }
    }

    @Override // defpackage.rt41
    public void onCanceled() {
        com.yandex.passport.sloth.ui.l lVar;
        tls tlsVar;
        com.yandex.passport.sloth.ui.c1 c1Var;
        tls tlsVar2;
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 3:
                ((SslErrorHandler) obj2).cancel();
                String url = ((WebView) obj).getUrl();
                SslError sslError = (SslError) this.w;
                boolean l = jl40.l(url, sslError.getUrl());
                SlothWebViewClient slothWebViewClient = (SlothWebViewClient) this.x;
                if (!l) {
                    lVar = slothWebViewClient.reporter;
                    ((com.yandex.passport.internal.ui.sloth.f) lVar).a(new com.yandex.passport.sloth.n0(sslError));
                    break;
                } else {
                    tlsVar = slothWebViewClient.onWebViewError;
                    tlsVar.invoke(new com.yandex.passport.sloth.ui.webview.e(sslError));
                    break;
                }
            default:
                ((SslErrorHandler) obj2).cancel();
                String url2 = ((WebView) obj).getUrl();
                SslError sslError2 = (SslError) this.w;
                boolean l2 = jl40.l(url2, sslError2.getUrl());
                WebViewController webViewController = (WebViewController) this.x;
                if (!l2) {
                    c1Var = webViewController.reporter;
                    c1Var.a(new com.yandex.passport.sloth.n0(sslError2));
                    break;
                } else {
                    webViewController.webViewHasError = true;
                    tlsVar2 = webViewController.onErrorCallback;
                    if (tlsVar2 != null) {
                        tlsVar2.invoke(new com.yandex.passport.sloth.ui.webview.e(sslError2));
                        break;
                    }
                }
                break;
        }
    }

    @Override // com.yandex.passport.internal.core.accounts.f
    public void onFailure(Exception exc) {
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        Uid uid = (Uid) this.c;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "removeAndRecreateAccount: remove uid=" + uid + ": exception", exc);
        }
        ((com.yandex.passport.internal.core.accounts.g) this.w).c.a(exc, uid.getValue());
        ((AtomicReference) this.x).set(exc);
        ((CountDownLatch) this.b).countDown();
    }

    @Override // com.yandex.passport.internal.core.accounts.f
    public void onSuccess() {
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        Uid uid = (Uid) this.c;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "removeAndRecreateAccount: remove uid=" + uid + ": success", 8);
        }
        ((CountDownLatch) this.b).countDown();
    }

    public d1(Filter filter, ArrayList arrayList, ArrayList arrayList2, com.yandex.passport.internal.b bVar) {
        this.a = 2;
        this.b = filter;
        this.x = arrayList;
        this.c = arrayList2;
        this.w = bVar;
    }

    public d1(com.arkivanov.mvikotlin.main.store.a aVar, com.yandex.passport.biometric.ui.verification.a aVar2, com.yandex.passport.internal.upgrader.h hVar, com.yandex.passport.internal.methods.requester.e eVar, UserIdProperties userIdProperties) {
        this.a = 5;
        this.b = aVar2;
        this.c = hVar;
        this.w = eVar;
        this.x = userIdProperties;
    }

    public /* synthetic */ d1(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
        this.x = obj4;
    }
}
