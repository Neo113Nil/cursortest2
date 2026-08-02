package com.yandex.plus.home.feature.panel.internal.shortcuts.daily.mapper;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import com.yandex.plus.core.data.common.PlusColor;
import defpackage.adg;
import defpackage.b2d0;
import defpackage.b5d0;
import defpackage.cvu0;
import defpackage.dht;
import defpackage.dke;
import defpackage.dye;
import defpackage.edg;
import defpackage.eht;
import defpackage.fdg;
import defpackage.fht;
import defpackage.gdg;
import defpackage.ght;
import defpackage.hdg;
import defpackage.idg;
import defpackage.j73;
import defpackage.jdg;
import defpackage.jse;
import defpackage.kdg;
import defpackage.mm91;
import defpackage.mz6;
import defpackage.nl;
import defpackage.ny61;
import defpackage.pdg;
import defpackage.rdg;
import defpackage.s2d0;
import defpackage.shr0;
import defpackage.sls;
import defpackage.tld0;
import defpackage.uld0;
import defpackage.w511;
import defpackage.wj4;
import defpackage.wky0;
import defpackage.zcg;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.PropertyReference0;

/* loaded from: classes2.dex */
public final class a {
    public final float a;
    public final sls b;
    public final b5d0 c;
    public final jse d;

    public a(float f, sls slsVar, b2d0 b2d0Var, b5d0 b5d0Var, jse jseVar) {
        this.a = f;
        this.b = slsVar;
        this.c = b5d0Var;
        this.d = jseVar;
    }

    public static String c(jdg jdgVar) {
        String str = jdgVar.a;
        for (tld0 tld0Var : jdgVar.c) {
            str = cvu0.v(str, tld0Var.c, tld0Var.e, false);
        }
        for (uld0 uld0Var : jdgVar.d) {
            str = cvu0.v(str, uld0Var.c, uld0Var.d, false);
        }
        return str;
    }

    public static fht d(PlusColor plusColor) {
        if (plusColor instanceof PlusColor.Color) {
            return new eht(((PlusColor.Color) plusColor).getColor());
        }
        if (plusColor instanceof PlusColor.Gradient) {
            return new dht(s2d0.c(((PlusColor.Gradient) plusColor).getGradients()));
        }
        w511.b();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(gdg gdgVar, zcg zcgVar, ContinuationImpl continuationImpl) {
        DailyContentMapper$mapToBottomContent$1 dailyContentMapper$mapToBottomContent$1;
        int i;
        int i2;
        String str;
        RippleDrawable rippleDrawable;
        View.OnClickListener onClickListener;
        jdg jdgVar;
        gdg gdgVar2;
        RippleDrawable rippleDrawable2;
        wky0 wky0Var;
        wky0 wky0Var2;
        int i3;
        View.OnClickListener onClickListener2;
        jdg jdgVar2;
        wky0 wky0Var3;
        String str2;
        wky0 wky0Var4;
        gdg gdgVar3;
        RippleDrawable rippleDrawable3;
        wky0 wky0Var5;
        RippleDrawable rippleDrawable4;
        String str3;
        gdg gdgVar4 = gdgVar;
        if (continuationImpl instanceof DailyContentMapper$mapToBottomContent$1) {
            dailyContentMapper$mapToBottomContent$1 = (DailyContentMapper$mapToBottomContent$1) continuationImpl;
            int i4 = dailyContentMapper$mapToBottomContent$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                dailyContentMapper$mapToBottomContent$1.label = i4 - Integer.MIN_VALUE;
                Object obj = dailyContentMapper$mapToBottomContent$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dailyContentMapper$mapToBottomContent$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    sls slsVar = gdgVar4.e;
                    jdg jdgVar3 = gdgVar4.c;
                    nl nlVar = slsVar != null ? new nl(4, new dke(11, zcgVar, gdgVar4), this, slsVar) : null;
                    String c = c(jdgVar3);
                    jdg jdgVar4 = gdgVar4.d;
                    String c2 = jdgVar4 != null ? c(jdgVar4) : null;
                    jdg jdgVar5 = gdgVar4.f;
                    String c3 = jdgVar5 != null ? c(jdgVar5) : null;
                    hdg hdgVar = gdgVar4.h;
                    String X = kotlin.collections.a.X(j73.A(new String[]{c, c2, c3, hdgVar != null ? hdgVar.a : null}), null, null, null, null, 63);
                    edg edgVar = gdgVar4.b;
                    PlusColor plusColor = edgVar.a;
                    int i5 = edgVar.b;
                    float f = this.a;
                    Drawable d = s2d0.d(plusColor, i5, 0.0f, 0.0f, f, f, 6);
                    int intValue = ((Number) ((PropertyReference0) this.b).get()).intValue();
                    float f2 = this.a;
                    RippleDrawable b = mm91.b(d, intValue, 0.0f, 0.0f, f2, f2, 6);
                    dailyContentMapper$mapToBottomContent$1.L$0 = null;
                    dailyContentMapper$mapToBottomContent$1.L$1 = null;
                    dailyContentMapper$mapToBottomContent$1.L$2 = gdgVar4;
                    dailyContentMapper$mapToBottomContent$1.L$3 = nlVar;
                    dailyContentMapper$mapToBottomContent$1.L$4 = X;
                    dailyContentMapper$mapToBottomContent$1.L$5 = b;
                    i2 = 0;
                    dailyContentMapper$mapToBottomContent$1.I$0 = 0;
                    dailyContentMapper$mapToBottomContent$1.label = 1;
                    Object f3 = f(jdgVar3, dailyContentMapper$mapToBottomContent$1);
                    if (f3 != obj2) {
                        str = X;
                        obj = f3;
                        rippleDrawable = b;
                        onClickListener = nlVar;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        onClickListener2 = (View.OnClickListener) dailyContentMapper$mapToBottomContent$1.L$8;
                        wky0Var5 = (wky0) dailyContentMapper$mapToBottomContent$1.L$7;
                        wky0Var = (wky0) dailyContentMapper$mapToBottomContent$1.L$6;
                        rippleDrawable4 = (RippleDrawable) dailyContentMapper$mapToBottomContent$1.L$5;
                        str3 = (String) dailyContentMapper$mapToBottomContent$1.L$4;
                        gdgVar3 = (gdg) dailyContentMapper$mapToBottomContent$1.L$2;
                        kotlin.b.b(obj);
                        wky0Var4 = (wky0) obj;
                        wky0Var3 = wky0Var5;
                        rippleDrawable3 = rippleDrawable4;
                        str2 = str3;
                        View.OnClickListener onClickListener3 = onClickListener2;
                        wky0 wky0Var6 = wky0Var;
                        List list = gdgVar3.g;
                        hdg hdgVar2 = gdgVar3.h;
                        mz6 mz6Var = hdgVar2 != null ? new mz6(hdgVar2.a, hdgVar2.b, hdgVar2.c) : null;
                        String str4 = gdgVar3.i;
                        shr0 shr0Var = str4 != null ? new shr0(0.0f, this.a, 0.0f, 22, str4) : null;
                        String str5 = gdgVar3.j;
                        return new adg(rippleDrawable3, wky0Var6, wky0Var3, onClickListener3, wky0Var4, list, mz6Var, str2, shr0Var, str5 != null ? new shr0(0.0f, 0.0f, this.a, 14, str5) : null);
                    }
                    i3 = dailyContentMapper$mapToBottomContent$1.I$0;
                    wky0Var = (wky0) dailyContentMapper$mapToBottomContent$1.L$6;
                    rippleDrawable2 = (RippleDrawable) dailyContentMapper$mapToBottomContent$1.L$5;
                    str = (String) dailyContentMapper$mapToBottomContent$1.L$4;
                    onClickListener = (View.OnClickListener) dailyContentMapper$mapToBottomContent$1.L$3;
                    gdgVar2 = (gdg) dailyContentMapper$mapToBottomContent$1.L$2;
                    kotlin.b.b(obj);
                    wky0Var2 = (wky0) obj;
                    i2 = i3;
                    onClickListener2 = onClickListener;
                    jdgVar2 = gdgVar2.f;
                    if (jdgVar2 == null) {
                        wky0Var3 = wky0Var2;
                        str2 = str;
                        wky0Var4 = null;
                        gdgVar3 = gdgVar2;
                        rippleDrawable3 = rippleDrawable2;
                        View.OnClickListener onClickListener32 = onClickListener2;
                        wky0 wky0Var62 = wky0Var;
                        List list2 = gdgVar3.g;
                        hdg hdgVar22 = gdgVar3.h;
                        if (hdgVar22 != null) {
                        }
                        String str42 = gdgVar3.i;
                        if (str42 != null) {
                        }
                        String str52 = gdgVar3.j;
                        return new adg(rippleDrawable3, wky0Var62, wky0Var3, onClickListener32, wky0Var4, list2, mz6Var, str2, shr0Var, str52 != null ? new shr0(0.0f, 0.0f, this.a, 14, str52) : null);
                    }
                    dailyContentMapper$mapToBottomContent$1.L$0 = null;
                    dailyContentMapper$mapToBottomContent$1.L$1 = null;
                    dailyContentMapper$mapToBottomContent$1.L$2 = gdgVar2;
                    dailyContentMapper$mapToBottomContent$1.L$3 = null;
                    dailyContentMapper$mapToBottomContent$1.L$4 = str;
                    dailyContentMapper$mapToBottomContent$1.L$5 = rippleDrawable2;
                    dailyContentMapper$mapToBottomContent$1.L$6 = wky0Var;
                    dailyContentMapper$mapToBottomContent$1.L$7 = wky0Var2;
                    dailyContentMapper$mapToBottomContent$1.L$8 = onClickListener2;
                    dailyContentMapper$mapToBottomContent$1.I$0 = i2;
                    dailyContentMapper$mapToBottomContent$1.label = 3;
                    Object f4 = f(jdgVar2, dailyContentMapper$mapToBottomContent$1);
                    if (f4 != obj2) {
                        wky0Var5 = wky0Var2;
                        obj = f4;
                        rippleDrawable4 = rippleDrawable2;
                        str3 = str;
                        gdgVar3 = gdgVar2;
                        wky0Var4 = (wky0) obj;
                        wky0Var3 = wky0Var5;
                        rippleDrawable3 = rippleDrawable4;
                        str2 = str3;
                        View.OnClickListener onClickListener322 = onClickListener2;
                        wky0 wky0Var622 = wky0Var;
                        List list22 = gdgVar3.g;
                        hdg hdgVar222 = gdgVar3.h;
                        if (hdgVar222 != null) {
                        }
                        String str422 = gdgVar3.i;
                        if (str422 != null) {
                        }
                        String str522 = gdgVar3.j;
                        return new adg(rippleDrawable3, wky0Var622, wky0Var3, onClickListener322, wky0Var4, list22, mz6Var, str2, shr0Var, str522 != null ? new shr0(0.0f, 0.0f, this.a, 14, str522) : null);
                    }
                    return obj2;
                }
                int i6 = dailyContentMapper$mapToBottomContent$1.I$0;
                rippleDrawable = (RippleDrawable) dailyContentMapper$mapToBottomContent$1.L$5;
                str = (String) dailyContentMapper$mapToBottomContent$1.L$4;
                onClickListener = (View.OnClickListener) dailyContentMapper$mapToBottomContent$1.L$3;
                gdg gdgVar5 = (gdg) dailyContentMapper$mapToBottomContent$1.L$2;
                kotlin.b.b(obj);
                i2 = i6;
                gdgVar4 = gdgVar5;
                wky0 wky0Var7 = (wky0) obj;
                jdgVar = gdgVar4.d;
                if (jdgVar == null) {
                    dailyContentMapper$mapToBottomContent$1.L$0 = null;
                    dailyContentMapper$mapToBottomContent$1.L$1 = null;
                    dailyContentMapper$mapToBottomContent$1.L$2 = gdgVar4;
                    dailyContentMapper$mapToBottomContent$1.L$3 = onClickListener;
                    dailyContentMapper$mapToBottomContent$1.L$4 = str;
                    dailyContentMapper$mapToBottomContent$1.L$5 = rippleDrawable;
                    dailyContentMapper$mapToBottomContent$1.L$6 = wky0Var7;
                    dailyContentMapper$mapToBottomContent$1.I$0 = i2;
                    dailyContentMapper$mapToBottomContent$1.label = 2;
                    Object f5 = f(jdgVar, dailyContentMapper$mapToBottomContent$1);
                    if (f5 != obj2) {
                        RippleDrawable rippleDrawable5 = rippleDrawable;
                        wky0Var = wky0Var7;
                        obj = f5;
                        rippleDrawable2 = rippleDrawable5;
                        gdgVar2 = gdgVar4;
                        i3 = i2;
                        wky0Var2 = (wky0) obj;
                        i2 = i3;
                        onClickListener2 = onClickListener;
                        jdgVar2 = gdgVar2.f;
                        if (jdgVar2 == null) {
                        }
                    }
                    return obj2;
                }
                gdgVar2 = gdgVar4;
                rippleDrawable2 = rippleDrawable;
                wky0Var = wky0Var7;
                wky0Var2 = null;
                onClickListener2 = onClickListener;
                jdgVar2 = gdgVar2.f;
                if (jdgVar2 == null) {
                }
            }
        }
        dailyContentMapper$mapToBottomContent$1 = new DailyContentMapper$mapToBottomContent$1(this, continuationImpl);
        Object obj3 = dailyContentMapper$mapToBottomContent$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dailyContentMapper$mapToBottomContent$1.label;
        if (i != 0) {
        }
        wky0 wky0Var72 = (wky0) obj3;
        jdgVar = gdgVar4.d;
        if (jdgVar == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(kdg kdgVar, boolean z, ContinuationImpl continuationImpl) {
        DailyContentMapper$mapToTopContent$1 dailyContentMapper$mapToTopContent$1;
        Object obj;
        int i;
        String str;
        boolean z2;
        View.OnClickListener onClickListener;
        kdg kdgVar2;
        int i2;
        Object f;
        wky0 wky0Var;
        Object f2;
        kdg kdgVar3;
        String str2;
        wky0 wky0Var2;
        boolean z3;
        RippleDrawable a;
        idg idgVar;
        boolean z4;
        wky0 wky0Var3;
        ght ghtVar;
        View.OnClickListener onClickListener2;
        String str3;
        mz6 mz6Var;
        RippleDrawable rippleDrawable;
        wky0 wky0Var4;
        boolean z5;
        View.OnClickListener onClickListener3;
        wky0 wky0Var5;
        wky0 wky0Var6;
        RippleDrawable rippleDrawable2;
        mz6 mz6Var2;
        String str4;
        if (continuationImpl instanceof DailyContentMapper$mapToTopContent$1) {
            dailyContentMapper$mapToTopContent$1 = (DailyContentMapper$mapToTopContent$1) continuationImpl;
            int i3 = dailyContentMapper$mapToTopContent$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dailyContentMapper$mapToTopContent$1.label = i3 - Integer.MIN_VALUE;
                Object obj2 = dailyContentMapper$mapToTopContent$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dailyContentMapper$mapToTopContent$1.label;
                int i4 = 4;
                shr0 shr0Var = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    pdg pdgVar = kdgVar.f;
                    jdg jdgVar = kdgVar.b;
                    nl nlVar = pdgVar != null ? new nl(i4, new dye(21, kdgVar), this, pdgVar) : null;
                    String c = c(jdgVar);
                    String c2 = c(kdgVar.c);
                    String c3 = c(kdgVar.d);
                    hdg hdgVar = kdgVar.g;
                    String X = kotlin.collections.a.X(j73.A(new String[]{c, c2, c3, hdgVar != null ? hdgVar.a : null}), null, null, null, null, 63);
                    dailyContentMapper$mapToTopContent$1.L$0 = null;
                    dailyContentMapper$mapToTopContent$1.L$1 = kdgVar;
                    dailyContentMapper$mapToTopContent$1.L$2 = nlVar;
                    dailyContentMapper$mapToTopContent$1.L$3 = X;
                    dailyContentMapper$mapToTopContent$1.Z$0 = z;
                    dailyContentMapper$mapToTopContent$1.I$0 = 0;
                    dailyContentMapper$mapToTopContent$1.label = 1;
                    Object f3 = f(jdgVar, dailyContentMapper$mapToTopContent$1);
                    if (f3 != obj) {
                        str = X;
                        obj2 = f3;
                        z2 = z;
                        onClickListener = nlVar;
                        kdgVar2 = kdgVar;
                        i2 = 0;
                    }
                    return obj;
                }
                if (i != 1) {
                    if (i == 2) {
                        i2 = dailyContentMapper$mapToTopContent$1.I$0;
                        z2 = dailyContentMapper$mapToTopContent$1.Z$0;
                        wky0Var = (wky0) dailyContentMapper$mapToTopContent$1.L$4;
                        str = (String) dailyContentMapper$mapToTopContent$1.L$3;
                        onClickListener = (View.OnClickListener) dailyContentMapper$mapToTopContent$1.L$2;
                        kdgVar2 = (kdg) dailyContentMapper$mapToTopContent$1.L$1;
                        kotlin.b.b(obj2);
                        wky0 wky0Var7 = (wky0) obj2;
                        jdg jdgVar2 = kdgVar2.d;
                        dailyContentMapper$mapToTopContent$1.L$0 = null;
                        dailyContentMapper$mapToTopContent$1.L$1 = kdgVar2;
                        dailyContentMapper$mapToTopContent$1.L$2 = onClickListener;
                        dailyContentMapper$mapToTopContent$1.L$3 = str;
                        dailyContentMapper$mapToTopContent$1.L$4 = wky0Var;
                        dailyContentMapper$mapToTopContent$1.L$5 = wky0Var7;
                        dailyContentMapper$mapToTopContent$1.Z$0 = z2;
                        dailyContentMapper$mapToTopContent$1.I$0 = i2;
                        dailyContentMapper$mapToTopContent$1.label = 3;
                        f2 = f(jdgVar2, dailyContentMapper$mapToTopContent$1);
                        if (f2 != obj) {
                            kdgVar3 = kdgVar2;
                            str2 = str;
                            wky0Var2 = wky0Var7;
                            int i5 = i2;
                            z3 = z2;
                            wky0 wky0Var8 = (wky0) f2;
                            edg edgVar = kdgVar3.e;
                            PlusColor plusColor = edgVar.a;
                            sls slsVar = this.b;
                            if (z3) {
                            }
                            hdg hdgVar2 = kdgVar3.g;
                            if (hdgVar2 == null) {
                            }
                            idgVar = kdgVar3.h;
                            shr0Var = null;
                            if (idgVar != null) {
                            }
                        }
                        return obj;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z3 = dailyContentMapper$mapToTopContent$1.Z$1;
                        z5 = dailyContentMapper$mapToTopContent$1.Z$0;
                        rippleDrawable2 = (RippleDrawable) dailyContentMapper$mapToTopContent$1.L$9;
                        onClickListener3 = (View.OnClickListener) dailyContentMapper$mapToTopContent$1.L$8;
                        mz6Var2 = (mz6) dailyContentMapper$mapToTopContent$1.L$7;
                        wky0Var6 = (wky0) dailyContentMapper$mapToTopContent$1.L$6;
                        wky0Var2 = (wky0) dailyContentMapper$mapToTopContent$1.L$5;
                        wky0Var5 = (wky0) dailyContentMapper$mapToTopContent$1.L$4;
                        str2 = (String) dailyContentMapper$mapToTopContent$1.L$3;
                        kdgVar3 = (kdg) dailyContentMapper$mapToTopContent$1.L$1;
                        kotlin.b.b(obj2);
                        z4 = z3;
                        ghtVar = (ght) obj2;
                        z3 = z5;
                        rippleDrawable = rippleDrawable2;
                        onClickListener2 = onClickListener3;
                        mz6Var = mz6Var2;
                        wky0Var3 = wky0Var6;
                        str3 = str2;
                        wky0Var4 = wky0Var5;
                        kdg kdgVar4 = kdgVar3;
                        wky0 wky0Var9 = wky0Var2;
                        fdg fdgVar = kdgVar4.i;
                        wj4 wj4Var = fdgVar != null ? new wj4(fdgVar.a, fdgVar.b, fdgVar.c) : shr0Var;
                        String str5 = kdgVar4.j;
                        shr0 g = str5 != null ? g(str5, z3) : shr0Var;
                        String str6 = kdgVar4.k;
                        shr0 g2 = str6 != null ? g(str6, z3) : shr0Var;
                        str4 = kdgVar4.l;
                        if (str4 != null) {
                            shr0Var = g(str4, z3);
                        }
                        return new rdg(wky0Var4, wky0Var9, wky0Var3, rippleDrawable, z4, onClickListener2, mz6Var, ghtVar, wj4Var, g, str3, g2, shr0Var, kdgVar4.m);
                    }
                    i2 = dailyContentMapper$mapToTopContent$1.I$0;
                    z2 = dailyContentMapper$mapToTopContent$1.Z$0;
                    wky0 wky0Var10 = (wky0) dailyContentMapper$mapToTopContent$1.L$5;
                    wky0Var = (wky0) dailyContentMapper$mapToTopContent$1.L$4;
                    String str7 = (String) dailyContentMapper$mapToTopContent$1.L$3;
                    onClickListener = (View.OnClickListener) dailyContentMapper$mapToTopContent$1.L$2;
                    kdg kdgVar5 = (kdg) dailyContentMapper$mapToTopContent$1.L$1;
                    kotlin.b.b(obj2);
                    kdgVar3 = kdgVar5;
                    str2 = str7;
                    wky0Var2 = wky0Var10;
                    f2 = obj2;
                    int i52 = i2;
                    z3 = z2;
                    wky0 wky0Var82 = (wky0) f2;
                    edg edgVar2 = kdgVar3.e;
                    PlusColor plusColor2 = edgVar2.a;
                    sls slsVar2 = this.b;
                    if (z3) {
                        float f4 = this.a;
                        Drawable b = s2d0.b(plusColor2, edgVar2.b, f4, f4, f4, f4);
                        int intValue = ((Number) ((PropertyReference0) slsVar2).get()).intValue();
                        float f5 = this.a;
                        a = mm91.a(b, intValue, f5, f5, f5, f5);
                    } else {
                        int i6 = edgVar2.b;
                        float f6 = this.a;
                        Drawable d = s2d0.d(plusColor2, i6, f6, f6, 0.0f, 0.0f, 24);
                        int intValue2 = ((Number) ((PropertyReference0) slsVar2).get()).intValue();
                        float f7 = this.a;
                        a = mm91.b(d, intValue2, f7, f7, 0.0f, 0.0f, 24);
                    }
                    hdg hdgVar22 = kdgVar3.g;
                    mz6 mz6Var3 = hdgVar22 == null ? new mz6(hdgVar22.a, hdgVar22.b, hdgVar22.c) : null;
                    idgVar = kdgVar3.h;
                    shr0Var = null;
                    if (idgVar != null) {
                        z4 = z3;
                        wky0Var3 = wky0Var82;
                        ghtVar = null;
                        onClickListener2 = onClickListener;
                        str3 = str2;
                        mz6Var = mz6Var3;
                        rippleDrawable = a;
                        wky0Var4 = wky0Var;
                        kdg kdgVar42 = kdgVar3;
                        wky0 wky0Var92 = wky0Var2;
                        fdg fdgVar2 = kdgVar42.i;
                        if (fdgVar2 != null) {
                        }
                        String str52 = kdgVar42.j;
                        if (str52 != null) {
                        }
                        String str62 = kdgVar42.k;
                        if (str62 != null) {
                        }
                        str4 = kdgVar42.l;
                        if (str4 != null) {
                        }
                        return new rdg(wky0Var4, wky0Var92, wky0Var3, rippleDrawable, z4, onClickListener2, mz6Var, ghtVar, wj4Var, g, str3, g2, shr0Var, kdgVar42.m);
                    }
                    dailyContentMapper$mapToTopContent$1.L$0 = null;
                    dailyContentMapper$mapToTopContent$1.L$1 = kdgVar3;
                    dailyContentMapper$mapToTopContent$1.L$2 = null;
                    dailyContentMapper$mapToTopContent$1.L$3 = str2;
                    dailyContentMapper$mapToTopContent$1.L$4 = wky0Var;
                    dailyContentMapper$mapToTopContent$1.L$5 = wky0Var2;
                    dailyContentMapper$mapToTopContent$1.L$6 = wky0Var82;
                    dailyContentMapper$mapToTopContent$1.L$7 = mz6Var3;
                    dailyContentMapper$mapToTopContent$1.L$8 = onClickListener;
                    dailyContentMapper$mapToTopContent$1.L$9 = a;
                    dailyContentMapper$mapToTopContent$1.Z$0 = z3;
                    dailyContentMapper$mapToTopContent$1.I$0 = i52;
                    dailyContentMapper$mapToTopContent$1.Z$1 = z3;
                    dailyContentMapper$mapToTopContent$1.label = 4;
                    obj2 = e(idgVar, dailyContentMapper$mapToTopContent$1);
                    if (obj2 != obj) {
                        z5 = z3;
                        onClickListener3 = onClickListener;
                        wky0Var5 = wky0Var;
                        wky0Var6 = wky0Var82;
                        rippleDrawable2 = a;
                        mz6Var2 = mz6Var3;
                        z4 = z3;
                        ghtVar = (ght) obj2;
                        z3 = z5;
                        rippleDrawable = rippleDrawable2;
                        onClickListener2 = onClickListener3;
                        mz6Var = mz6Var2;
                        wky0Var3 = wky0Var6;
                        str3 = str2;
                        wky0Var4 = wky0Var5;
                        kdg kdgVar422 = kdgVar3;
                        wky0 wky0Var922 = wky0Var2;
                        fdg fdgVar22 = kdgVar422.i;
                        if (fdgVar22 != null) {
                        }
                        String str522 = kdgVar422.j;
                        if (str522 != null) {
                        }
                        String str622 = kdgVar422.k;
                        if (str622 != null) {
                        }
                        str4 = kdgVar422.l;
                        if (str4 != null) {
                        }
                        return new rdg(wky0Var4, wky0Var922, wky0Var3, rippleDrawable, z4, onClickListener2, mz6Var, ghtVar, wj4Var, g, str3, g2, shr0Var, kdgVar422.m);
                    }
                    return obj;
                }
                i2 = dailyContentMapper$mapToTopContent$1.I$0;
                z2 = dailyContentMapper$mapToTopContent$1.Z$0;
                str = (String) dailyContentMapper$mapToTopContent$1.L$3;
                onClickListener = (View.OnClickListener) dailyContentMapper$mapToTopContent$1.L$2;
                kdgVar2 = (kdg) dailyContentMapper$mapToTopContent$1.L$1;
                kotlin.b.b(obj2);
                wky0 wky0Var11 = (wky0) obj2;
                jdg jdgVar3 = kdgVar2.c;
                dailyContentMapper$mapToTopContent$1.L$0 = null;
                dailyContentMapper$mapToTopContent$1.L$1 = kdgVar2;
                dailyContentMapper$mapToTopContent$1.L$2 = onClickListener;
                dailyContentMapper$mapToTopContent$1.L$3 = str;
                dailyContentMapper$mapToTopContent$1.L$4 = wky0Var11;
                dailyContentMapper$mapToTopContent$1.Z$0 = z2;
                dailyContentMapper$mapToTopContent$1.I$0 = i2;
                dailyContentMapper$mapToTopContent$1.label = 2;
                f = f(jdgVar3, dailyContentMapper$mapToTopContent$1);
                if (f != obj) {
                    wky0Var = wky0Var11;
                    obj2 = f;
                    wky0 wky0Var72 = (wky0) obj2;
                    jdg jdgVar22 = kdgVar2.d;
                    dailyContentMapper$mapToTopContent$1.L$0 = null;
                    dailyContentMapper$mapToTopContent$1.L$1 = kdgVar2;
                    dailyContentMapper$mapToTopContent$1.L$2 = onClickListener;
                    dailyContentMapper$mapToTopContent$1.L$3 = str;
                    dailyContentMapper$mapToTopContent$1.L$4 = wky0Var;
                    dailyContentMapper$mapToTopContent$1.L$5 = wky0Var72;
                    dailyContentMapper$mapToTopContent$1.Z$0 = z2;
                    dailyContentMapper$mapToTopContent$1.I$0 = i2;
                    dailyContentMapper$mapToTopContent$1.label = 3;
                    f2 = f(jdgVar22, dailyContentMapper$mapToTopContent$1);
                    if (f2 != obj) {
                    }
                }
                return obj;
            }
        }
        dailyContentMapper$mapToTopContent$1 = new DailyContentMapper$mapToTopContent$1(this, continuationImpl);
        Object obj22 = dailyContentMapper$mapToTopContent$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dailyContentMapper$mapToTopContent$1.label;
        int i42 = 4;
        shr0 shr0Var2 = null;
        if (i != 0) {
        }
        wky0 wky0Var112 = (wky0) obj22;
        jdg jdgVar32 = kdgVar2.c;
        dailyContentMapper$mapToTopContent$1.L$0 = null;
        dailyContentMapper$mapToTopContent$1.L$1 = kdgVar2;
        dailyContentMapper$mapToTopContent$1.L$2 = onClickListener;
        dailyContentMapper$mapToTopContent$1.L$3 = str;
        dailyContentMapper$mapToTopContent$1.L$4 = wky0Var112;
        dailyContentMapper$mapToTopContent$1.Z$0 = z2;
        dailyContentMapper$mapToTopContent$1.I$0 = i2;
        dailyContentMapper$mapToTopContent$1.label = 2;
        f = f(jdgVar32, dailyContentMapper$mapToTopContent$1);
        if (f != obj) {
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(idg idgVar, ContinuationImpl continuationImpl) {
        DailyContentMapper$toProgressContent$1 dailyContentMapper$toProgressContent$1;
        int i;
        if (continuationImpl instanceof DailyContentMapper$toProgressContent$1) {
            dailyContentMapper$toProgressContent$1 = (DailyContentMapper$toProgressContent$1) continuationImpl;
            int i2 = dailyContentMapper$toProgressContent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dailyContentMapper$toProgressContent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dailyContentMapper$toProgressContent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dailyContentMapper$toProgressContent$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = new b(idgVar.b, this.d);
                    ArrayList arrayList = idgVar.c;
                    dailyContentMapper$toProgressContent$1.L$0 = idgVar;
                    dailyContentMapper$toProgressContent$1.label = 1;
                    obj = bVar.c(arrayList, this.c, dailyContentMapper$toProgressContent$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    idgVar = (idg) dailyContentMapper$toProgressContent$1.L$0;
                    kotlin.b.b(obj);
                }
                b bVar2 = (b) obj;
                bVar2.b(idgVar.d);
                return new ght(d(idgVar.a), bVar2.b, d(idgVar.e), d(idgVar.f), d(idgVar.g), idgVar.h);
            }
        }
        dailyContentMapper$toProgressContent$1 = new DailyContentMapper$toProgressContent$1(this, continuationImpl);
        Object obj2 = dailyContentMapper$toProgressContent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dailyContentMapper$toProgressContent$1.label;
        if (i != 0) {
        }
        b bVar22 = (b) obj2;
        bVar22.b(idgVar.d);
        return new ght(d(idgVar.a), bVar22.b, d(idgVar.e), d(idgVar.f), d(idgVar.g), idgVar.h);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(jdg jdgVar, ContinuationImpl continuationImpl) {
        DailyContentMapper$toTextContent$1 dailyContentMapper$toTextContent$1;
        int i;
        if (continuationImpl instanceof DailyContentMapper$toTextContent$1) {
            dailyContentMapper$toTextContent$1 = (DailyContentMapper$toTextContent$1) continuationImpl;
            int i2 = dailyContentMapper$toTextContent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dailyContentMapper$toTextContent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dailyContentMapper$toTextContent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dailyContentMapper$toTextContent$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = new b(jdgVar.a, this.d);
                    List list = jdgVar.c;
                    dailyContentMapper$toTextContent$1.L$0 = jdgVar;
                    dailyContentMapper$toTextContent$1.label = 1;
                    obj = bVar.c(list, this.c, dailyContentMapper$toTextContent$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jdgVar = (jdg) dailyContentMapper$toTextContent$1.L$0;
                    kotlin.b.b(obj);
                }
                b bVar2 = (b) obj;
                bVar2.b(jdgVar.d);
                return new wky0(bVar2.b, jdgVar.b);
            }
        }
        dailyContentMapper$toTextContent$1 = new DailyContentMapper$toTextContent$1(this, continuationImpl);
        Object obj2 = dailyContentMapper$toTextContent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dailyContentMapper$toTextContent$1.label;
        if (i != 0) {
        }
        b bVar22 = (b) obj2;
        bVar22.b(jdgVar.d);
        return new wky0(bVar22.b, jdgVar.b);
    }

    public final shr0 g(String str, boolean z) {
        float f = this.a;
        if (!z) {
            return new shr0(f, 0.0f, f, 10, str);
        }
        return new shr0(f, 0.0f, 0.0f, 26, str);
    }
}
