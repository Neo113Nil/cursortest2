package com.yandex.go.places.impl.ui.web_custom_tabs;

import android.os.SystemClock;
import defpackage.h75;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.rg41;
import defpackage.sg41;
import defpackage.sjh;
import defpackage.tg41;
import defpackage.tje;
import defpackage.tls;
import defpackage.tt2;
import defpackage.uyj;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.am.o;

/* loaded from: classes13.dex */
public final class b extends h75 {
    public final o A;
    public pzt0 B;
    public final rg41 x;
    public final tg41 y;
    public final tt2 z;

    public b(rg41 rg41Var, tg41 tg41Var, tt2 tt2Var, o oVar) {
        super(sg41.class);
        this.x = rg41Var;
        this.y = tg41Var;
        this.z = tt2Var;
        this.A = oVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0061, code lost:
    
        if (r11.cf(r0) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0096 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Kg(b bVar, tls tlsVar, ContinuationImpl continuationImpl) {
        WebCustomTabsPresenter$awaitWithMinLoaderVisible$1 webCustomTabsPresenter$awaitWithMinLoaderVisible$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        long j;
        long j2;
        bVar.getClass();
        if (continuationImpl instanceof WebCustomTabsPresenter$awaitWithMinLoaderVisible$1) {
            webCustomTabsPresenter$awaitWithMinLoaderVisible$1 = (WebCustomTabsPresenter$awaitWithMinLoaderVisible$1) continuationImpl;
            int i2 = webCustomTabsPresenter$awaitWithMinLoaderVisible$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                webCustomTabsPresenter$awaitWithMinLoaderVisible$1.label = i2 - Integer.MIN_VALUE;
                obj = webCustomTabsPresenter$awaitWithMinLoaderVisible$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = webCustomTabsPresenter$awaitWithMinLoaderVisible$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    sg41 sg41Var = (sg41) bVar.Dg();
                    webCustomTabsPresenter$awaitWithMinLoaderVisible$1.L$0 = tlsVar;
                    webCustomTabsPresenter$awaitWithMinLoaderVisible$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Object obj2 = webCustomTabsPresenter$awaitWithMinLoaderVisible$1.L$1;
                            kotlin.b.b(obj);
                            return obj2;
                        }
                        j = webCustomTabsPresenter$awaitWithMinLoaderVisible$1.J$0;
                        kotlin.b.b(obj);
                        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
                        j2 = 500 - elapsedRealtime;
                        if (j2 < 0) {
                            j2 = 0;
                        }
                        webCustomTabsPresenter$awaitWithMinLoaderVisible$1.L$0 = null;
                        webCustomTabsPresenter$awaitWithMinLoaderVisible$1.L$1 = obj;
                        webCustomTabsPresenter$awaitWithMinLoaderVisible$1.J$0 = j;
                        webCustomTabsPresenter$awaitWithMinLoaderVisible$1.J$1 = elapsedRealtime;
                        webCustomTabsPresenter$awaitWithMinLoaderVisible$1.label = 3;
                        return kotlinx.coroutines.a.i(j2, webCustomTabsPresenter$awaitWithMinLoaderVisible$1) != coroutineSingletons ? coroutineSingletons : obj;
                    }
                    tlsVar = (tls) webCustomTabsPresenter$awaitWithMinLoaderVisible$1.L$0;
                    kotlin.b.b(obj);
                }
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                webCustomTabsPresenter$awaitWithMinLoaderVisible$1.L$0 = null;
                webCustomTabsPresenter$awaitWithMinLoaderVisible$1.J$0 = elapsedRealtime2;
                webCustomTabsPresenter$awaitWithMinLoaderVisible$1.label = 2;
                obj = tlsVar.invoke(webCustomTabsPresenter$awaitWithMinLoaderVisible$1);
                if (obj != coroutineSingletons) {
                    j = elapsedRealtime2;
                    long elapsedRealtime3 = SystemClock.elapsedRealtime() - j;
                    j2 = 500 - elapsedRealtime3;
                    if (j2 < 0) {
                    }
                    webCustomTabsPresenter$awaitWithMinLoaderVisible$1.L$0 = null;
                    webCustomTabsPresenter$awaitWithMinLoaderVisible$1.L$1 = obj;
                    webCustomTabsPresenter$awaitWithMinLoaderVisible$1.J$0 = j;
                    webCustomTabsPresenter$awaitWithMinLoaderVisible$1.J$1 = elapsedRealtime3;
                    webCustomTabsPresenter$awaitWithMinLoaderVisible$1.label = 3;
                    if (kotlinx.coroutines.a.i(j2, webCustomTabsPresenter$awaitWithMinLoaderVisible$1) != coroutineSingletons) {
                    }
                }
            }
        }
        webCustomTabsPresenter$awaitWithMinLoaderVisible$1 = new WebCustomTabsPresenter$awaitWithMinLoaderVisible$1(bVar, continuationImpl);
        obj = webCustomTabsPresenter$awaitWithMinLoaderVisible$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = webCustomTabsPresenter$awaitWithMinLoaderVisible$1.label;
        if (i != 0) {
        }
        long elapsedRealtime22 = SystemClock.elapsedRealtime();
        webCustomTabsPresenter$awaitWithMinLoaderVisible$1.L$0 = null;
        webCustomTabsPresenter$awaitWithMinLoaderVisible$1.J$0 = elapsedRealtime22;
        webCustomTabsPresenter$awaitWithMinLoaderVisible$1.label = 2;
        obj = tlsVar.invoke(webCustomTabsPresenter$awaitWithMinLoaderVisible$1);
        if (obj != coroutineSingletons) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Lg(b bVar, ContinuationImpl continuationImpl) {
        WebCustomTabsPresenter$fetchWrappedUrl$1 webCustomTabsPresenter$fetchWrappedUrl$1;
        int i;
        bVar.getClass();
        try {
            if (continuationImpl instanceof WebCustomTabsPresenter$fetchWrappedUrl$1) {
                webCustomTabsPresenter$fetchWrappedUrl$1 = (WebCustomTabsPresenter$fetchWrappedUrl$1) continuationImpl;
                int i2 = webCustomTabsPresenter$fetchWrappedUrl$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    webCustomTabsPresenter$fetchWrappedUrl$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = webCustomTabsPresenter$fetchWrappedUrl$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = webCustomTabsPresenter$fetchWrappedUrl$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        bVar.z.getClass();
                        sjh sjhVar = uyj.a;
                        mdh mdhVar = mdh.b;
                        WebCustomTabsPresenter$fetchWrappedUrl$2$1 webCustomTabsPresenter$fetchWrappedUrl$2$1 = new WebCustomTabsPresenter$fetchWrappedUrl$2$1(bVar, null);
                        webCustomTabsPresenter$fetchWrappedUrl$1.label = 1;
                        obj = tje.k0(mdhVar, webCustomTabsPresenter$fetchWrappedUrl$2$1, webCustomTabsPresenter$fetchWrappedUrl$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    return (String) obj;
                }
            }
            if (i != 0) {
            }
            return (String) obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
        webCustomTabsPresenter$fetchWrappedUrl$1 = new WebCustomTabsPresenter$fetchWrappedUrl$1(bVar, continuationImpl);
        Object obj2 = webCustomTabsPresenter$fetchWrappedUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = webCustomTabsPresenter$fetchWrappedUrl$1.label;
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        pzt0 pzt0Var = this.B;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.B = null;
    }

    public final void Mg() {
        pzt0 pzt0Var = this.B;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        ((sg41) Dg()).showLoading();
        this.B = com.yandex.go.coroutines.b.g(Jg(), null, null, new WebCustomTabsPresenter$loadUrl$1(this, null), 3);
    }
}
