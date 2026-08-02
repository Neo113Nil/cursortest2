package com.yandex.go.shortcuts.impl.ui.shortcutview;

import android.content.Context;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import defpackage.bdc;
import defpackage.ebm;
import defpackage.ec3;
import defpackage.g18;
import defpackage.g8v;
import defpackage.gac;
import defpackage.gx00;
import defpackage.ic0;
import defpackage.kbv;
import defpackage.lbm;
import defpackage.mqu;
import defpackage.nac;
import defpackage.obv;
import defpackage.pav;
import defpackage.qbv;
import defpackage.qfv;
import defpackage.s8o;
import defpackage.sls;
import defpackage.tav;
import defpackage.tls;
import defpackage.xw31;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes13.dex */
public final class a {
    public final Context a;
    public final pav b;

    public a(Context context, pav pavVar) {
        this.a = context;
        this.b = pavVar;
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [T, dai, g18] */
    /* JADX WARN: Type inference failed for: r2v3, types: [T, ec3] */
    public static g18 a(a aVar, ImageView imageView, String str, bdc bdcVar, String str2, int i, g8v g8vVar, sls slsVar, gx00 gx00Var, int i2) {
        kbv qbvVar;
        bdc bdcVar2 = (i2 & 4) != 0 ? null : bdcVar;
        String str3 = (i2 & 8) != 0 ? null : str2;
        int i3 = 0;
        int i4 = (i2 & 16) != 0 ? 0 : i;
        g8v g8vVar2 = (i2 & 32) != 0 ? null : g8vVar;
        sls slsVar2 = (i2 & 64) != 0 ? null : slsVar;
        gx00 gx00Var2 = (i2 & 128) != 0 ? null : gx00Var;
        boolean z = (i2 & 256) == 0;
        boolean z2 = (i2 & 512) != 0;
        pav pavVar = aVar.b;
        pavVar.c(imageView);
        ?? r15 = g18.u1;
        if ((str == null || str.length() == 0) && (str3 == null || str3.length() == 0)) {
            int i5 = i4;
            if (i5 != 0) {
                imageView.setImageResource(i5);
            }
            if (gx00Var2 == null) {
                return r15;
            }
            gx00Var2.invoke();
            return r15;
        }
        lbm a = pavVar.a(imageView);
        if (str == null || str.length() == 0) {
            if (str3 == null) {
                str3 = "";
            }
            qbvVar = new qbv(str3);
        } else {
            qbvVar = new obv(str, null, 6, 0);
        }
        if (slsVar2 != null) {
            ((nac) a).h = new ic0(22, slsVar2);
        }
        if (gx00Var2 != null) {
            ((nac) a).i = gx00Var2;
        }
        if (bdcVar2 != null) {
            int m = s8o.m(bdcVar2, aVar.a);
            nac nacVar = (nac) a;
            nacVar.getClass();
            nacVar.e = new gac(m, i3);
        }
        if (g8vVar2 != null) {
            ((nac) a).g(new qfv(g8vVar2.a, g8vVar2.b));
        }
        final tav tavVar = new tav(z2, a, imageView, i4, qbvVar);
        if (xw31.j(imageView) && !z) {
            return (g18) tavVar.invoke();
        }
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = r15;
        final boolean z3 = true;
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.yandex.go.shortcuts.impl.ui.shortcutview.ImageLoaderDelegateImpl$loadImage$$inlined$doOnPreDrawCancelable$1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                tavVar.invoke();
                ((g18) Ref$ObjectRef.this.element).cancel();
                return z3;
            }
        };
        ref$ObjectRef.element = new ec3(viewTreeObserver, onPreDrawListener, imageView, 4);
        viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
        return new ebm(a, new ImageLoaderDelegateImpl$loadImage$2(0, (g18) ref$ObjectRef.element, g18.class, "cancel", "cancel()V", 0));
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [T, ec3] */
    /* JADX WARN: Type inference failed for: r12v2, types: [T, dai, g18] */
    public static g18 b(a aVar, ImageView imageView, String str, sls slsVar, tls tlsVar, int i) {
        final boolean z = true;
        boolean z2 = (i & 8) != 0;
        if ((i & 32) != 0) {
            tlsVar = null;
        }
        pav pavVar = aVar.b;
        pavVar.c(imageView);
        ?? r12 = g18.u1;
        if (str == null || str.length() == 0) {
            slsVar.invoke();
            return r12;
        }
        nac nacVar = (nac) pavVar.a(imageView);
        nacVar.i = slsVar;
        if (tlsVar != null) {
            nacVar.h = tlsVar;
        }
        if (z2) {
            nacVar.f(imageView.getMeasuredWidth(), imageView.getMeasuredHeight());
        }
        final mqu mquVar = new mqu(2, nacVar, str);
        if (xw31.j(imageView)) {
            return (g18) mquVar.invoke();
        }
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = r12;
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.yandex.go.shortcuts.impl.ui.shortcutview.ImageLoaderDelegateImpl$loadImage$$inlined$doOnPreDrawCancelable$3
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                mquVar.invoke();
                ((g18) Ref$ObjectRef.this.element).cancel();
                return z;
            }
        };
        ref$ObjectRef.element = new ec3(viewTreeObserver, onPreDrawListener, imageView, 5);
        viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
        return new ebm(pavVar.a(imageView), new ImageLoaderDelegateImpl$loadImage$3(0, (g18) ref$ObjectRef.element, g18.class, "cancel", "cancel()V", 0));
    }
}
