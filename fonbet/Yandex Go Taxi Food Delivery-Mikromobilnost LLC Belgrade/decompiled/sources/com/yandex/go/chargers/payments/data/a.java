package com.yandex.go.chargers.payments.data;

import com.yandex.go.chargers.payments.domain.d;
import com.yandex.go.payments.data.g;
import com.yandex.go.payments.domain.l0;
import defpackage.bvf0;
import defpackage.cne0;
import defpackage.crg;
import defpackage.dne0;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.h0a0;
import defpackage.hfa0;
import defpackage.jl40;
import defpackage.jtq0;
import defpackage.lv90;
import defpackage.m6a0;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.oea0;
import defpackage.po21;
import defpackage.tf91;
import defpackage.tla;
import defpackage.tpr;
import defpackage.vez0;
import defpackage.yuu;
import defpackage.zy11;
import defpackage.zzs;
import java.util.Date;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.preorder.source.userposition.e;

/* loaded from: classes.dex */
public final class a {
    public final jtq0 a;
    public final po21 b;
    public final tla c;
    public final kotlinx.coroutines.sync.a d = gtq0.a();
    public final r0 e = bvf0.c(null);
    public final cne0 f;
    public final r0 g;

    public a(jtq0 jtq0Var, crg crgVar, dne0 dne0Var, po21 po21Var, tla tlaVar) {
        Date c;
        this.a = jtq0Var;
        this.b = po21Var;
        this.c = tlaVar;
        Date date = null;
        cne0 a = dne0Var.a("payment_method_selected_at_prefs");
        this.f = a;
        String l = a.l("payment_method_selected_at_prefs_key", null);
        if (l != null && (c = crgVar.c(l)) != null) {
            date = c;
        } else if (d() != null) {
            date = jtq0Var.c();
            a.r("payment_method_selected_at_prefs_key", yuu.a(date));
        }
        this.g = bvf0.c(date);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c2 A[Catch: all -> 0x005c, TryCatch #1 {all -> 0x005c, blocks: (B:26:0x0058, B:27:0x00a8, B:28:0x00ae, B:33:0x0082, B:36:0x0095, B:39:0x00c2, B:41:0x00d2, B:43:0x00d8), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, zzs zzsVar, ContinuationImpl continuationImpl) {
        ChargersCurrentPaymentMethodRepositoryImpl$invalidateCurrentPaymentModels$1 chargersCurrentPaymentMethodRepositoryImpl$invalidateCurrentPaymentModels$1;
        int i;
        Throwable th;
        g050 g050Var;
        zzs zzsVar2;
        g050 g050Var2;
        oea0 b;
        g050 g050Var3;
        tla tlaVar = aVar.c;
        try {
            if (continuationImpl instanceof ChargersCurrentPaymentMethodRepositoryImpl$invalidateCurrentPaymentModels$1) {
                chargersCurrentPaymentMethodRepositoryImpl$invalidateCurrentPaymentModels$1 = (ChargersCurrentPaymentMethodRepositoryImpl$invalidateCurrentPaymentModels$1) continuationImpl;
                int i2 = chargersCurrentPaymentMethodRepositoryImpl$invalidateCurrentPaymentModels$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    chargersCurrentPaymentMethodRepositoryImpl$invalidateCurrentPaymentModels$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = chargersCurrentPaymentMethodRepositoryImpl$invalidateCurrentPaymentModels$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = chargersCurrentPaymentMethodRepositoryImpl$invalidateCurrentPaymentModels$1.label;
                    if (i != 0) {
                        b.b(obj);
                        kotlinx.coroutines.sync.a aVar2 = aVar.d;
                        chargersCurrentPaymentMethodRepositoryImpl$invalidateCurrentPaymentModels$1.L$0 = zzsVar;
                        chargersCurrentPaymentMethodRepositoryImpl$invalidateCurrentPaymentModels$1.L$1 = aVar2;
                        chargersCurrentPaymentMethodRepositoryImpl$invalidateCurrentPaymentModels$1.label = 1;
                        if (aVar2.a(chargersCurrentPaymentMethodRepositoryImpl$invalidateCurrentPaymentModels$1) != obj2) {
                            zzsVar2 = zzsVar;
                            g050Var2 = aVar2;
                        }
                        return obj2;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            g050Var = (g050) chargersCurrentPaymentMethodRepositoryImpl$invalidateCurrentPaymentModels$1.L$1;
                            try {
                                b.b(obj);
                                g050Var3 = g050Var;
                                g050Var2 = g050Var3;
                                g050Var2.d(null);
                                return zy11.a;
                            } catch (Throwable th2) {
                                th = th2;
                                g050Var.d(null);
                                throw th;
                            }
                        }
                        g050Var2 = (g050) chargersCurrentPaymentMethodRepositoryImpl$invalidateCurrentPaymentModels$1.L$1;
                        b.b(obj);
                        zzsVar2 = ((mo21) obj).a();
                        chargersCurrentPaymentMethodRepositoryImpl$invalidateCurrentPaymentModels$1.L$0 = null;
                        chargersCurrentPaymentMethodRepositoryImpl$invalidateCurrentPaymentModels$1.L$1 = g050Var2;
                        chargersCurrentPaymentMethodRepositoryImpl$invalidateCurrentPaymentModels$1.L$2 = null;
                        chargersCurrentPaymentMethodRepositoryImpl$invalidateCurrentPaymentModels$1.L$3 = null;
                        chargersCurrentPaymentMethodRepositoryImpl$invalidateCurrentPaymentModels$1.label = 3;
                        if (aVar.f(zzsVar2, chargersCurrentPaymentMethodRepositoryImpl$invalidateCurrentPaymentModels$1) != obj2) {
                            g050Var3 = g050Var2;
                            g050Var2 = g050Var3;
                            g050Var2.d(null);
                            return zy11.a;
                        }
                        return obj2;
                    }
                    g050Var2 = (g050) chargersCurrentPaymentMethodRepositoryImpl$invalidateCurrentPaymentModels$1.L$1;
                    zzsVar2 = (zzs) chargersCurrentPaymentMethodRepositoryImpl$invalidateCurrentPaymentModels$1.L$0;
                    b.b(obj);
                    b = ((d) tlaVar).c().b("no_feature");
                    if (b.a()) {
                        lv90 i3 = ((d) tlaVar).c().i("no_feature");
                        hfa0 b2 = tf91.b(b, i3);
                        if (i3 == null && b2.d() != null) {
                            aVar.g(b2);
                        }
                        g050Var2.d(null);
                        return zy11.a;
                    }
                    if (zzsVar2 == null) {
                        po21 po21Var = aVar.b;
                        chargersCurrentPaymentMethodRepositoryImpl$invalidateCurrentPaymentModels$1.L$0 = null;
                        chargersCurrentPaymentMethodRepositoryImpl$invalidateCurrentPaymentModels$1.L$1 = g050Var2;
                        chargersCurrentPaymentMethodRepositoryImpl$invalidateCurrentPaymentModels$1.L$2 = null;
                        chargersCurrentPaymentMethodRepositoryImpl$invalidateCurrentPaymentModels$1.label = 2;
                        obj = ((e) po21Var).h(chargersCurrentPaymentMethodRepositoryImpl$invalidateCurrentPaymentModels$1);
                        if (obj == obj2) {
                            return obj2;
                        }
                        zzsVar2 = ((mo21) obj).a();
                    }
                    chargersCurrentPaymentMethodRepositoryImpl$invalidateCurrentPaymentModels$1.L$0 = null;
                    chargersCurrentPaymentMethodRepositoryImpl$invalidateCurrentPaymentModels$1.L$1 = g050Var2;
                    chargersCurrentPaymentMethodRepositoryImpl$invalidateCurrentPaymentModels$1.L$2 = null;
                    chargersCurrentPaymentMethodRepositoryImpl$invalidateCurrentPaymentModels$1.L$3 = null;
                    chargersCurrentPaymentMethodRepositoryImpl$invalidateCurrentPaymentModels$1.label = 3;
                    if (aVar.f(zzsVar2, chargersCurrentPaymentMethodRepositoryImpl$invalidateCurrentPaymentModels$1) != obj2) {
                    }
                    return obj2;
                }
            }
            if (i != 0) {
            }
            b = ((d) tlaVar).c().b("no_feature");
            if (b.a()) {
            }
        } catch (Throwable th3) {
            th = th3;
            g050Var = zzsVar;
        }
        chargersCurrentPaymentMethodRepositoryImpl$invalidateCurrentPaymentModels$1 = new ChargersCurrentPaymentMethodRepositoryImpl$invalidateCurrentPaymentModels$1(aVar, continuationImpl);
        Object obj3 = chargersCurrentPaymentMethodRepositoryImpl$invalidateCurrentPaymentModels$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersCurrentPaymentMethodRepositoryImpl$invalidateCurrentPaymentModels$1.label;
    }

    public final Date b() {
        m6a0 d = d();
        r0 r0Var = this.g;
        if (d != null) {
            return (Date) r0Var.getValue();
        }
        r0Var.l(null);
        this.f.r("payment_method_selected_at_prefs_key", null);
        return null;
    }

    public final hfa0 c() {
        return tf91.c(((d) this.c).c().b("no_feature"), d());
    }

    public final m6a0 d() {
        m6a0 c0;
        lv90 i = ((d) this.c).c().i("no_feature");
        m6a0 m6a0Var = (m6a0) this.e.getValue();
        if (i == null || (c0 = vez0.c0(i, null)) == null) {
            return null;
        }
        return new m6a0(c0.a, c0.b, m6a0Var);
    }

    public final tpr e() {
        l0 c = ((d) this.c).c();
        return com.yandex.go.coroutines.b.d(kotlinx.coroutines.flow.e.n(((g) c.a.a("no_feature")).d(), c.j("no_feature"), this.e, new ChargersCurrentPaymentMethodRepositoryImpl$listenCurrentPaymentOptions$1(this, null)), new ChargersCurrentPaymentMethodRepositoryImpl$listenCurrentPaymentOptions$2(this, null, null));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|8|(1:(2:11|12)(2:18|19))(3:20|21|(1:23))|13|14|15))|30|6|7|8|(0)(0)|13|14|15|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006f, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x002e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
    
        defpackage.jst.e.c(java.lang.String.format("Error while requesting current payment options for chargers", java.util.Arrays.copyOf(new java.lang.Object[]{r0}, 1)));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(zzs zzsVar, ContinuationImpl continuationImpl) {
        ChargersCurrentPaymentMethodRepositoryImpl$requestPaymentModels$1 chargersCurrentPaymentMethodRepositoryImpl$requestPaymentModels$1;
        int i;
        if (continuationImpl instanceof ChargersCurrentPaymentMethodRepositoryImpl$requestPaymentModels$1) {
            chargersCurrentPaymentMethodRepositoryImpl$requestPaymentModels$1 = (ChargersCurrentPaymentMethodRepositoryImpl$requestPaymentModels$1) continuationImpl;
            int i2 = chargersCurrentPaymentMethodRepositoryImpl$requestPaymentModels$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersCurrentPaymentMethodRepositoryImpl$requestPaymentModels$1.label = i2 - Integer.MIN_VALUE;
                ChargersCurrentPaymentMethodRepositoryImpl$requestPaymentModels$1 chargersCurrentPaymentMethodRepositoryImpl$requestPaymentModels$12 = chargersCurrentPaymentMethodRepositoryImpl$requestPaymentModels$1;
                Object obj = chargersCurrentPaymentMethodRepositoryImpl$requestPaymentModels$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersCurrentPaymentMethodRepositoryImpl$requestPaymentModels$12.label;
                if (i != 0) {
                    b.b(obj);
                    l0 c = ((d) this.c).c();
                    h0a0 h0a0Var = new h0a0(zzsVar);
                    chargersCurrentPaymentMethodRepositoryImpl$requestPaymentModels$12.L$0 = null;
                    chargersCurrentPaymentMethodRepositoryImpl$requestPaymentModels$12.label = 1;
                    if (l0.d(c, h0a0Var, null, false, chargersCurrentPaymentMethodRepositoryImpl$requestPaymentModels$12, 30) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return zy11.a;
            }
        }
        chargersCurrentPaymentMethodRepositoryImpl$requestPaymentModels$1 = new ChargersCurrentPaymentMethodRepositoryImpl$requestPaymentModels$1(this, continuationImpl);
        ChargersCurrentPaymentMethodRepositoryImpl$requestPaymentModels$1 chargersCurrentPaymentMethodRepositoryImpl$requestPaymentModels$122 = chargersCurrentPaymentMethodRepositoryImpl$requestPaymentModels$1;
        Object obj2 = chargersCurrentPaymentMethodRepositoryImpl$requestPaymentModels$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersCurrentPaymentMethodRepositoryImpl$requestPaymentModels$122.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    public final void g(hfa0 hfa0Var) {
        if (!jl40.l(hfa0Var.d(), d())) {
            Date c = this.a.c();
            this.f.r("payment_method_selected_at_prefs_key", yuu.a(c));
            this.g.l(c);
        }
        ((d) this.c).c().g(hfa0Var.b(), "no_feature");
        m6a0 d = hfa0Var.d();
        this.e.l(d != null ? d.c : null);
    }
}
