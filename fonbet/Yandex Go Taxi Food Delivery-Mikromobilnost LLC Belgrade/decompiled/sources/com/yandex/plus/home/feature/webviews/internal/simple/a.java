package com.yandex.plus.home.feature.webviews.internal.simple;

import android.net.Uri;
import com.yandex.plus.core.analytics.logging.PlusLogTag;
import com.yandex.plus.home.feature.webviews.internal.container.b;
import com.yandex.plus.home.feature.webviews.internal.uri.c;
import defpackage.bzd0;
import defpackage.e3n;
import defpackage.hsd0;
import defpackage.i0h;
import defpackage.iz4;
import defpackage.jse;
import defpackage.mfs0;
import defpackage.nfs0;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.qzg;
import defpackage.skd0;
import defpackage.so41;
import defpackage.tje;
import defpackage.ul60;
import defpackage.unr0;
import defpackage.uu60;
import defpackage.v920;
import defpackage.vzg;
import defpackage.wio;
import defpackage.y4a0;
import defpackage.zy11;
import java.util.Arrays;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a extends iz4 implements so41 {
    public final qzg f;
    public final String g;
    public final bzd0 h;
    public final boolean i;
    public final c j;
    public final b k;
    public final v920 l;
    public final i0h m;
    public final jse n;
    public final wio o;
    public final y4a0 p;
    public final hsd0 q;
    public final uu60 r;
    public final ul60 s;
    public String t;
    public boolean u;
    public boolean v;
    public pzt0 w;

    public a(qzg qzgVar, String str, bzd0 bzd0Var, boolean z, c cVar, com.yandex.plus.home.feature.webviews.internal.container.a aVar, v920 v920Var, i0h i0hVar, jse jseVar, wio wioVar, y4a0 y4a0Var, hsd0 hsd0Var, uu60 uu60Var, ul60 ul60Var) {
        super(jseVar, new mfs0());
        this.f = qzgVar;
        this.g = str;
        this.h = bzd0Var;
        this.i = z;
        this.j = cVar;
        this.k = aVar;
        this.l = v920Var;
        this.m = i0hVar;
        this.n = jseVar;
        this.o = wioVar;
        this.p = y4a0Var;
        this.q = hsd0Var;
        this.r = uu60Var;
        this.s = ul60Var;
        this.t = qzgVar.a.toString();
        skd0.b(PlusLogTag.UI, "init()");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object k(a aVar, String str, ContinuationImpl continuationImpl) {
        SimpleWebViewLayoutPresenter$loadUriInternal$1 simpleWebViewLayoutPresenter$loadUriInternal$1;
        int i;
        String str2;
        a aVar2;
        aVar.getClass();
        boolean z = aVar.i;
        if (continuationImpl instanceof SimpleWebViewLayoutPresenter$loadUriInternal$1) {
            simpleWebViewLayoutPresenter$loadUriInternal$1 = (SimpleWebViewLayoutPresenter$loadUriInternal$1) continuationImpl;
            int i2 = simpleWebViewLayoutPresenter$loadUriInternal$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                simpleWebViewLayoutPresenter$loadUriInternal$1.label = i2 - Integer.MIN_VALUE;
                Object obj = simpleWebViewLayoutPresenter$loadUriInternal$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = simpleWebViewLayoutPresenter$loadUriInternal$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    simpleWebViewLayoutPresenter$loadUriInternal$1.L$0 = str;
                    simpleWebViewLayoutPresenter$loadUriInternal$1.L$1 = aVar;
                    simpleWebViewLayoutPresenter$loadUriInternal$1.label = 1;
                    if (!z) {
                        c cVar = aVar.j;
                        Object j = cVar.a.j(Uri.parse(str));
                        if (j instanceof Result.Failure) {
                            j = null;
                        }
                        vzg vzgVar = (vzg) j;
                        if (vzgVar instanceof qzg) {
                            obj = cVar.b((qzg) vzgVar, simpleWebViewLayoutPresenter$loadUriInternal$1);
                            if (obj != coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            str2 = str;
                            aVar2 = aVar;
                        }
                    }
                    obj = str;
                    if (obj != coroutineSingletons) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aVar2 = (a) simpleWebViewLayoutPresenter$loadUriInternal$1.L$1;
                    str2 = (String) simpleWebViewLayoutPresenter$loadUriInternal$1.L$0;
                    kotlin.b.b(obj);
                }
                aVar2.t = (String) obj;
                PlusLogTag plusLogTag = PlusLogTag.UI;
                StringBuilder x = unr0.x("loadUriInternal(uriString=", str2, "), currentUrl=");
                x.append(aVar.t);
                skd0.b(plusLogTag, x.toString());
                aVar.v = false;
                ((nfs0) aVar.b).clearHistory();
                ((nfs0) aVar.b).showLoading();
                ((nfs0) aVar.b).loadUri(aVar.t);
                if (!z) {
                    pzt0 pzt0Var = aVar.w;
                    if (pzt0Var != null) {
                        pzt0Var.a(null);
                    }
                    aVar.w = tje.N(aVar.e(), aVar.n, null, new SimpleWebViewLayoutPresenter$loadUriInternal$2(aVar, null), 2);
                }
                return zy11.a;
            }
        }
        simpleWebViewLayoutPresenter$loadUriInternal$1 = new SimpleWebViewLayoutPresenter$loadUriInternal$1(aVar, continuationImpl);
        Object obj2 = simpleWebViewLayoutPresenter$loadUriInternal$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = simpleWebViewLayoutPresenter$loadUriInternal$1.label;
        if (i != 0) {
        }
        aVar2.t = (String) obj2;
        PlusLogTag plusLogTag2 = PlusLogTag.UI;
        StringBuilder x2 = unr0.x("loadUriInternal(uriString=", str2, "), currentUrl=");
        x2.append(aVar.t);
        skd0.b(plusLogTag2, x2.toString());
        aVar.v = false;
        ((nfs0) aVar.b).clearHistory();
        ((nfs0) aVar.b).showLoading();
        ((nfs0) aVar.b).loadUri(aVar.t);
        if (!z) {
        }
        return zy11.a;
    }

    @Override // defpackage.so41
    public final void f(String str, int i, String str2, String str3, boolean z) {
        this.o.c(str, i, str2, str3, z);
        if (z) {
            o(String.format("connection error, error code = %d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)), str);
        }
    }

    @Override // defpackage.so41
    public final void l(String str, int i, String str2, String str3, boolean z) {
        this.o.e(str, i, str2, str3, z);
        if (z) {
            o("ssl error", str);
        }
    }

    public final void m() {
        this.p.t(this.t);
        skd0.b(PlusLogTag.UI, "onWebPageReady() url=" + this.t);
        ((nfs0) this.b).showWebViewContent();
        this.q.e(this.g, this.t);
    }

    public final void n() {
        PlusLogTag plusLogTag = PlusLogTag.UI;
        StringBuilder sb = new StringBuilder("onWebPageReadyTimeout() wait timeout for ");
        bzd0 bzd0Var = this.h;
        sb.append((Object) e3n.p(bzd0Var.b));
        skd0.c(plusLogTag, sb.toString(), null);
        o("loading timeout", this.t);
        String str = this.t;
        this.o.d(bzd0Var.b, str);
    }

    public final void o(String str, String str2) {
        pzt0 pzt0Var;
        if (!this.i && (pzt0Var = this.w) != null) {
            pzt0Var.a(null);
        }
        if (str2 == null) {
            str2 = this.t;
        }
        this.q.d(this.g, str2);
        this.p.s();
        skd0.b(PlusLogTag.UI, "processError() errorMessage=".concat(str));
        this.v = true;
        ((nfs0) this.b).showError(str);
    }

    @Override // defpackage.so41
    public final void r(String str, int i, String str2, String str3, boolean z) {
        this.o.b(str, i, str2, str3, z);
        if (z) {
            o(String.format("http error, status code = %d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)), str);
        }
    }
}
