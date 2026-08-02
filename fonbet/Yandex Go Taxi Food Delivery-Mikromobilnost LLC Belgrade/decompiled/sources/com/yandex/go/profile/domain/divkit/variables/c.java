package com.yandex.go.profile.domain.divkit.variables;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import defpackage.agf0;
import defpackage.ffx;
import defpackage.gkh;
import defpackage.h3y;
import defpackage.jb7;
import defpackage.jl40;
import defpackage.jq4;
import defpackage.jst;
import defpackage.k7x0;
import defpackage.m1a0;
import defpackage.m7x0;
import defpackage.n0a0;
import defpackage.nwl;
import defpackage.ny61;
import defpackage.o8h;
import defpackage.p0a0;
import defpackage.pav;
import defpackage.qmp;
import defpackage.r0a0;
import defpackage.t0a0;
import defpackage.tje;
import defpackage.tma0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uma0;
import defpackage.xby;
import java.io.ByteArrayOutputStream;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class c extends nwl {
    public final Context b;
    public final h3y c;
    public final h3y d;
    public final h3y e;
    public final jb7 f;
    public final agf0 g;
    public final h3y h;
    public final h3y i;

    public c(Context context, h3y h3yVar, h3y h3yVar2, h3y h3yVar3, jb7 jb7Var, agf0 agf0Var, h3y h3yVar4, h3y h3yVar5, h3y h3yVar6) {
        super(h3yVar4);
        this.b = context;
        this.c = h3yVar;
        this.d = h3yVar2;
        this.e = h3yVar3;
        this.f = jb7Var;
        this.g = agf0Var;
        this.h = h3yVar5;
        this.i = h3yVar6;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(c cVar, m1a0 m1a0Var, ContinuationImpl continuationImpl) {
        PaymentMethodVariableHandler$extractIconAsBase64$1 paymentMethodVariableHandler$extractIconAsBase64$1;
        int i;
        String str;
        Bitmap a;
        String str2;
        Context context = cVar.b;
        h3y h3yVar = cVar.d;
        if (continuationImpl instanceof PaymentMethodVariableHandler$extractIconAsBase64$1) {
            paymentMethodVariableHandler$extractIconAsBase64$1 = (PaymentMethodVariableHandler$extractIconAsBase64$1) continuationImpl;
            int i2 = paymentMethodVariableHandler$extractIconAsBase64$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentMethodVariableHandler$extractIconAsBase64$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentMethodVariableHandler$extractIconAsBase64$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentMethodVariableHandler$extractIconAsBase64$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (jl40.l(m1a0Var, m1a0.h)) {
                        return null;
                    }
                    t0a0 t0a0Var = m1a0Var.c;
                    if (t0a0Var instanceof n0a0) {
                        String str3 = t0a0Var.a;
                        if (str3 != null) {
                            a = tma0.a((tma0) h3yVar.get(), cVar.b, str3);
                        }
                        a = null;
                    } else {
                        if (t0a0Var instanceof p0a0) {
                            String str4 = t0a0Var.a;
                            if (str4 != null) {
                                uma0 uma0Var = (uma0) ((tma0) h3yVar.get());
                                String c = uma0Var.a.c(str4);
                                uma0Var.c.getClass();
                                a = jq4.a(context, c, null, null, false);
                            }
                        } else if ((t0a0Var instanceof r0a0) && (str = t0a0Var.a) != null) {
                            tpr f = ((pav) cVar.h.get()).b().b(((m7x0) ((k7x0) cVar.i.get())).a(str)).f();
                            paymentMethodVariableHandler$extractIconAsBase64$1.L$0 = m1a0Var;
                            paymentMethodVariableHandler$extractIconAsBase64$1.L$1 = null;
                            paymentMethodVariableHandler$extractIconAsBase64$1.L$2 = null;
                            paymentMethodVariableHandler$extractIconAsBase64$1.L$3 = null;
                            paymentMethodVariableHandler$extractIconAsBase64$1.label = 1;
                            obj = kotlinx.coroutines.flow.e.A(f, paymentMethodVariableHandler$extractIconAsBase64$1);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        a = null;
                    }
                    if (a != null) {
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            a.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                        } catch (Throwable th) {
                            xby.l(jst.e, "PreviewVariableFactory", null, th, "Base64 convert problems", 2);
                            return null;
                        }
                    }
                    Drawable drawable = (Drawable) m1a0Var.c.b.apply(context);
                    if (drawable == null) {
                        return null;
                    }
                    Bitmap d0 = ffx.d0(drawable, 0, 0, 7);
                    try {
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        d0.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream2);
                        str2 = Base64.encodeToString(byteArrayOutputStream2.toByteArray(), 0);
                    } catch (Throwable th2) {
                        xby.l(jst.e, "PreviewVariableFactory", null, th2, "Base64 convert problems", 2);
                        str2 = null;
                    }
                    BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
                    if (!jl40.l(bitmapDrawable != null ? bitmapDrawable.getBitmap() : null, d0)) {
                        d0.recycle();
                    }
                    return str2;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m1a0Var = (m1a0) paymentMethodVariableHandler$extractIconAsBase64$1.L$0;
                kotlin.b.b(obj);
                a = (Bitmap) obj;
                if (a != null) {
                }
            }
        }
        paymentMethodVariableHandler$extractIconAsBase64$1 = new PaymentMethodVariableHandler$extractIconAsBase64$1(cVar, continuationImpl);
        Object obj2 = paymentMethodVariableHandler$extractIconAsBase64$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodVariableHandler$extractIconAsBase64$1.label;
        if (i != 0) {
        }
        a = (Bitmap) obj2;
        if (a != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(c cVar, ContinuationImpl continuationImpl) {
        PaymentMethodVariableHandler$resolveLpmService$1 paymentMethodVariableHandler$resolveLpmService$1;
        Object obj;
        int i;
        cVar.getClass();
        if (continuationImpl instanceof PaymentMethodVariableHandler$resolveLpmService$1) {
            paymentMethodVariableHandler$resolveLpmService$1 = (PaymentMethodVariableHandler$resolveLpmService$1) continuationImpl;
            int i2 = paymentMethodVariableHandler$resolveLpmService$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentMethodVariableHandler$resolveLpmService$1.label = i2 - Integer.MIN_VALUE;
                obj = paymentMethodVariableHandler$resolveLpmService$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentMethodVariableHandler$resolveLpmService$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    jb7 jb7Var = cVar.f;
                    paymentMethodVariableHandler$resolveLpmService$1.label = 1;
                    ((o8h) jb7Var.b).getClass();
                    ((qmp) jb7Var.c).getClass();
                    obj = ((com.yandex.go.payments.experiments.g) jb7Var.w).b(paymentMethodVariableHandler$resolveLpmService$1);
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
                if (((Boolean) obj).booleanValue()) {
                    return null;
                }
                String str = cVar.g.a;
                if (str != null) {
                    return str;
                }
                gkh gkhVar = (gkh) cVar.c.get();
                gkhVar.a.getClass();
                gkhVar.b.getClass();
                return null;
            }
        }
        paymentMethodVariableHandler$resolveLpmService$1 = new PaymentMethodVariableHandler$resolveLpmService$1(cVar, continuationImpl);
        obj = paymentMethodVariableHandler$resolveLpmService$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodVariableHandler$resolveLpmService$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    @Override // defpackage.nwl
    public final void a(tse tseVar) {
        tje.N(tseVar, null, null, new PaymentMethodVariableHandler$init$1(this, tseVar, null), 3);
    }
}
