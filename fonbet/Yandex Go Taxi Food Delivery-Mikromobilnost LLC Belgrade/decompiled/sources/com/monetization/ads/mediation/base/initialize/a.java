package com.monetization.ads.mediation.base.initialize;

import android.content.Context;
import defpackage.ad71;
import defpackage.cvu0;
import defpackage.evu0;
import defpackage.fe81;
import defpackage.ht71;
import defpackage.mw71;
import defpackage.ny61;
import defpackage.rr41;
import defpackage.tq81;
import defpackage.up81;
import defpackage.v981;
import defpackage.vp81;
import defpackage.z581;
import defpackage.zy11;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import yads.xz;
import yads.zo1;
import yads.zp1;

/* loaded from: classes7.dex */
public final class a {
    public static final AtomicBoolean g = new AtomicBoolean(true);
    public static final AtomicBoolean h = new AtomicBoolean(true);
    public final v981 a;
    public final vp81 b;
    public final ad71 c;
    public final up81 d;
    public final mw71 e;
    public final ht71 f;

    public a(v981 v981Var) {
        vp81 vp81Var = new vp81();
        ad71 ad71Var = new ad71();
        up81 up81Var = new up81();
        mw71 mw71Var = new mw71(up81Var);
        ht71 ht71Var = new ht71(up81Var);
        this.a = v981Var;
        this.b = vp81Var;
        this.c = ad71Var;
        this.d = up81Var;
        this.e = mw71Var;
        this.f = ht71Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, zp1 zp1Var, ContinuationImpl continuationImpl) {
        zo1 zo1Var;
        int i;
        Object obj;
        xz a;
        if (continuationImpl instanceof zo1) {
            zo1Var = (zo1) continuationImpl;
            int i2 = zo1Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zo1Var.e = i2 - Integer.MIN_VALUE;
                Object obj2 = zo1Var.c;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = zo1Var.e;
                if (i != 0) {
                    b.b(obj2);
                    this.d.a(zp1Var);
                    ht71 ht71Var = this.f;
                    v981 v981Var = this.a;
                    up81 up81Var = ht71Var.a;
                    String str = zp1Var.b;
                    String S = evu0.S("Adapter", evu0.e0('.', str, str));
                    if (S.length() <= 0) {
                        S = null;
                    }
                    if (S != null) {
                        Iterator it = up81Var.a.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (cvu0.s(S, (String) obj, false)) {
                                break;
                            }
                        }
                        String str2 = (String) obj;
                        if (str2 != null) {
                            tq81 tq81Var = xz.c;
                            String lowerCase = str2.toLowerCase(Locale.ROOT);
                            tq81Var.getClass();
                            a = tq81.a(lowerCase);
                            if (a != null) {
                                new rr41(new z581(new fe81(a), v981Var, null)).i(context, zp1Var, com.monetization.ads.mediation.base.a.class);
                            }
                        }
                    }
                    a = null;
                    if (a != null) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj2);
                    if (obj2 != null) {
                        ny61.u();
                        return null;
                    }
                }
                return zy11.a;
            }
        }
        zo1Var = new zo1(this, continuationImpl);
        Object obj22 = zo1Var.c;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zo1Var.e;
        if (i != 0) {
        }
        return zy11.a;
    }
}
