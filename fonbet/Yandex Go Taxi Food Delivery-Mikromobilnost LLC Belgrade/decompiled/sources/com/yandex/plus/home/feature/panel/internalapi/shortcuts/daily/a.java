package com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.imageview.ShapeableImageView;
import com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.progress.GiftProgressView;
import com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.services.DailyServicesView;
import com.yandex.plus.log.api.LogPriority;
import defpackage.a2d0;
import defpackage.adg;
import defpackage.ard0;
import defpackage.b2d0;
import defpackage.b5d0;
import defpackage.b64;
import defpackage.bb1;
import defpackage.bdg;
import defpackage.cdg;
import defpackage.ddg;
import defpackage.dye;
import defpackage.ej40;
import defpackage.fdg;
import defpackage.gdg;
import defpackage.ght;
import defpackage.gse;
import defpackage.i3y;
import defpackage.jna1;
import defpackage.jr31;
import defpackage.jse;
import defpackage.k5;
import defpackage.kdg;
import defpackage.kgx;
import defpackage.ldg;
import defpackage.mz4;
import defpackage.mz6;
import defpackage.n4u0;
import defpackage.nvg0;
import defpackage.ny61;
import defpackage.ovy0;
import defpackage.pgz;
import defpackage.qoi0;
import defpackage.rdg;
import defpackage.s5r;
import defpackage.scc;
import defpackage.shr0;
import defpackage.tdg;
import defpackage.u9h0;
import defpackage.wj4;
import defpackage.wv5;
import defpackage.z75;
import defpackage.zcg;
import defpackage.zy11;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes2.dex */
public final class a extends z75 {
    public static final /* synthetic */ kgx[] p = {new PropertyReference1Impl("topLayout", 0, "getTopLayout()Landroid/view/ViewGroup;", a.class), b64.x(qoi0.a, a.class, "bottomLayout", "getBottomLayout()Landroid/view/ViewGroup;", 0)};
    public final n4u0 c;
    public final b5d0 d;
    public final ard0 e;
    public final boolean f;
    public final jse g;
    public final pgz h;
    public final wv5 i;
    public final wv5 j;
    public tdg k;
    public cdg l;
    public Context m;
    public final com.yandex.plus.home.feature.panel.internal.shortcuts.daily.mapper.a n;
    public ldg o;

    public a(PlusPanelDailyView plusPanelDailyView, n4u0 n4u0Var, ovy0 ovy0Var, b5d0 b5d0Var, b2d0 b2d0Var, ard0 ard0Var, boolean z, jse jseVar, jse jseVar2, pgz pgzVar) {
        super(plusPanelDailyView, jseVar);
        this.c = n4u0Var;
        this.d = b5d0Var;
        this.e = ard0Var;
        this.f = z;
        this.g = jseVar;
        this.h = pgzVar;
        this.i = new wv5(new a2d0(plusPanelDailyView, u9h0.plus_sdk_daily_top_layout, 0));
        this.j = new wv5(new a2d0(plusPanelDailyView, u9h0.plus_sdk_daily_bottom_layout, 1));
        plusPanelDailyView.getContext();
        throw null;
    }

    @Override // defpackage.z75
    public final void a() {
        this.a.getContext();
        throw null;
    }

    @Override // defpackage.z75
    public final void b() {
        this.k = null;
        this.l = null;
        com.yandex.plus.home.common.utils.a.b(this.b);
        LogPriority logPriority = LogPriority.DEBUG;
        pgz pgzVar = this.h;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, "PlusDailyViewController", "onViewDetachedToWindow() daily view detached");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(gdg gdgVar, zcg zcgVar, ContinuationImpl continuationImpl) {
        PlusDailyViewController$handleBottomPart$1 plusDailyViewController$handleBottomPart$1;
        int i;
        cdg cdgVar;
        cdg cdgVar2;
        ddg ddgVar;
        mz6 mz6Var;
        if (continuationImpl instanceof PlusDailyViewController$handleBottomPart$1) {
            plusDailyViewController$handleBottomPart$1 = (PlusDailyViewController$handleBottomPart$1) continuationImpl;
            int i2 = plusDailyViewController$handleBottomPart$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusDailyViewController$handleBottomPart$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plusDailyViewController$handleBottomPart$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusDailyViewController$handleBottomPart$1.label;
                int i3 = 0;
                if (i != 0) {
                    b.b(obj);
                    ((ViewGroup) this.j.a(p[1])).setVisibility(gdgVar != null ? 0 : 8);
                    if (gdgVar != null && (cdgVar = this.l) != null) {
                        plusDailyViewController$handleBottomPart$1.L$0 = null;
                        plusDailyViewController$handleBottomPart$1.L$1 = null;
                        plusDailyViewController$handleBottomPart$1.L$2 = cdgVar;
                        plusDailyViewController$handleBottomPart$1.label = 1;
                        Object a = this.n.a(gdgVar, zcgVar, plusDailyViewController$handleBottomPart$1);
                        if (a == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        obj = a;
                        cdgVar2 = cdgVar;
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cdgVar2 = (cdg) plusDailyViewController$handleBottomPart$1.L$2;
                b.b(obj);
                adg adgVar = (adg) obj;
                kgx[] kgxVarArr = cdg.n;
                View.OnClickListener onClickListener = adgVar.d;
                View view = cdgVar2.a;
                ddgVar = cdgVar2.e;
                wv5 wv5Var = cdgVar2.l;
                wv5 wv5Var2 = cdgVar2.k;
                wv5 wv5Var3 = cdgVar2.f;
                bb1.L(view, onClickListener);
                View view2 = cdgVar2.a;
                view2.setBackground(adgVar.a);
                jna1.c((TextView) wv5Var3.a(kgxVarArr[0]), onClickListener == null);
                mz4.e(adgVar.b, (TextView) wv5Var3.a(kgxVarArr[0]), new dye(20, cdgVar2));
                mz4.e(adgVar.c, (TextView) cdgVar2.g.a(kgxVarArr[1]), new ej40(8));
                mz6Var = adgVar.g;
                cdgVar2.c(mz6Var, (TextView) cdgVar2.j.a(kgxVarArr[4]));
                if (mz6Var == null) {
                    List list = adgVar.f;
                    DailyServicesView dailyServicesView = (DailyServicesView) cdgVar2.h.a(kgxVarArr[2]);
                    dailyServicesView.setVisibility(list != null ? 0 : 8);
                    if (list != null) {
                        dailyServicesView.setImagesCount(list.size());
                        s5r s5rVar = new s5r(kotlin.sequences.b.g(new jr31(dailyServicesView, 0), bdg.a));
                        while (s5rVar.hasNext()) {
                            Object next = s5rVar.next();
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                scc.m();
                                throw null;
                            }
                            com.yandex.plus.glide.a b = ((com.yandex.plus.glide.b) cdgVar2.c).b((String) list.get(i3));
                            b.a.g(cdgVar2.m);
                            b.b((ImageView) next);
                            i3 = i4;
                        }
                    }
                    if (list == null) {
                        mz4.e(adgVar.e, (TextView) cdgVar2.i.a(kgxVarArr[3]), new ej40(8));
                    }
                }
                view2.setContentDescription(adgVar.h);
                shr0 shr0Var = adgVar.i;
                kgx[] kgxVarArr2 = cdg.n;
                int i5 = 5;
                cdgVar2.d(shr0Var, (ShapeableImageView) wv5Var2.a(kgxVarArr2[5]));
                shr0 shr0Var2 = adgVar.j;
                int i6 = 6;
                cdgVar2.d(shr0Var2, (ShapeableImageView) wv5Var.a(kgxVarArr2[6]));
                i3y i3yVar = ddgVar.d;
                if (ddgVar.a) {
                    ((ValueAnimator) i3yVar.getValue()).removeAllUpdateListeners();
                    ((ValueAnimator) i3yVar.getValue()).cancel();
                }
                cdgVar2.g((ShapeableImageView) wv5Var2.a(kgxVarArr2[5]), new gse(i5));
                cdgVar2.g((ShapeableImageView) wv5Var.a(kgxVarArr2[6]), new gse(i6));
                if (ddgVar.a) {
                    ((ValueAnimator) ddgVar.d.getValue()).start();
                }
                return zy11.a;
            }
        }
        plusDailyViewController$handleBottomPart$1 = new PlusDailyViewController$handleBottomPart$1(this, continuationImpl);
        Object obj2 = plusDailyViewController$handleBottomPart$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusDailyViewController$handleBottomPart$1.label;
        int i32 = 0;
        if (i != 0) {
        }
        adg adgVar2 = (adg) obj2;
        kgx[] kgxVarArr3 = cdg.n;
        View.OnClickListener onClickListener2 = adgVar2.d;
        View view3 = cdgVar2.a;
        ddgVar = cdgVar2.e;
        wv5 wv5Var4 = cdgVar2.l;
        wv5 wv5Var22 = cdgVar2.k;
        wv5 wv5Var32 = cdgVar2.f;
        bb1.L(view3, onClickListener2);
        View view22 = cdgVar2.a;
        view22.setBackground(adgVar2.a);
        jna1.c((TextView) wv5Var32.a(kgxVarArr3[0]), onClickListener2 == null);
        mz4.e(adgVar2.b, (TextView) wv5Var32.a(kgxVarArr3[0]), new dye(20, cdgVar2));
        mz4.e(adgVar2.c, (TextView) cdgVar2.g.a(kgxVarArr3[1]), new ej40(8));
        mz6Var = adgVar2.g;
        cdgVar2.c(mz6Var, (TextView) cdgVar2.j.a(kgxVarArr3[4]));
        if (mz6Var == null) {
        }
        view22.setContentDescription(adgVar2.h);
        shr0 shr0Var3 = adgVar2.i;
        kgx[] kgxVarArr22 = cdg.n;
        int i52 = 5;
        cdgVar2.d(shr0Var3, (ShapeableImageView) wv5Var22.a(kgxVarArr22[5]));
        shr0 shr0Var22 = adgVar2.j;
        int i62 = 6;
        cdgVar2.d(shr0Var22, (ShapeableImageView) wv5Var4.a(kgxVarArr22[6]));
        i3y i3yVar2 = ddgVar.d;
        if (ddgVar.a) {
        }
        cdgVar2.g((ShapeableImageView) wv5Var22.a(kgxVarArr22[5]), new gse(i52));
        cdgVar2.g((ShapeableImageView) wv5Var4.a(kgxVarArr22[6]), new gse(i62));
        if (ddgVar.a) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(kdg kdgVar, boolean z, ContinuationImpl continuationImpl) {
        PlusDailyViewController$handleTopPart$1 plusDailyViewController$handleTopPart$1;
        int i;
        tdg tdgVar;
        boolean z2;
        ViewGroup.LayoutParams layoutParams;
        if (continuationImpl instanceof PlusDailyViewController$handleTopPart$1) {
            plusDailyViewController$handleTopPart$1 = (PlusDailyViewController$handleTopPart$1) continuationImpl;
            int i2 = plusDailyViewController$handleTopPart$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusDailyViewController$handleTopPart$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plusDailyViewController$handleTopPart$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusDailyViewController$handleTopPart$1.label;
                if (i != 0) {
                    b.b(obj);
                    tdg tdgVar2 = this.k;
                    if (tdgVar2 != null) {
                        plusDailyViewController$handleTopPart$1.L$0 = null;
                        plusDailyViewController$handleTopPart$1.L$1 = tdgVar2;
                        plusDailyViewController$handleTopPart$1.Z$0 = z;
                        plusDailyViewController$handleTopPart$1.label = 1;
                        Object b = this.n.b(kdgVar, z, plusDailyViewController$handleTopPart$1);
                        if (b == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        obj = b;
                        tdgVar = tdgVar2;
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tdgVar = (tdg) plusDailyViewController$handleTopPart$1.L$1;
                b.b(obj);
                rdg rdgVar = (rdg) obj;
                View.OnClickListener onClickListener = rdgVar.f;
                View view = tdgVar.a;
                ddg ddgVar = tdgVar.e;
                wv5 wv5Var = tdgVar.p;
                wv5 wv5Var2 = tdgVar.o;
                wv5 wv5Var3 = tdgVar.l;
                wv5 wv5Var4 = tdgVar.h;
                wv5 wv5Var5 = tdgVar.k;
                int q = bb1.q(nvg0.plus_sdk_panel_daily_top_layout_height, view);
                z2 = rdgVar.n;
                if (z2) {
                    q += bb1.q(nvg0.plus_sdk_panel_daily_bottom_layout_height, view);
                }
                layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    ny61.t("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    return null;
                }
                layoutParams.height = q;
                view.setLayoutParams(layoutParams);
                int q2 = bb1.q(z2 ? nvg0.plus_sdk_panel_daily_button_big_height : nvg0.plus_sdk_panel_daily_button_min_height, view);
                kgx[] kgxVarArr = tdg.r;
                TextView textView = (TextView) wv5Var5.a(kgxVarArr[3]);
                ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
                if (layoutParams2 == null) {
                    ny61.t("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    return null;
                }
                layoutParams2.height = q2;
                textView.setLayoutParams(layoutParams2);
                bb1.L(tdgVar.a, onClickListener != null ? new k5(24, tdgVar, onClickListener) : null);
                view.setBackground(rdgVar.d);
                jna1.c((TextView) wv5Var4.a(kgxVarArr[0]), onClickListener != null);
                int i3 = 8;
                ((View) tdgVar.q.a(kgxVarArr[9])).setVisibility(rdgVar.e ? 0 : 8);
                mz4.e(rdgVar.a, (TextView) wv5Var4.a(kgxVarArr[0]), new dye(22, tdgVar));
                mz4.e(rdgVar.b, (TextView) tdgVar.i.a(kgxVarArr[1]), new ej40(8));
                mz4.e(rdgVar.c, (TextView) tdgVar.j.a(kgxVarArr[2]), new ej40(8));
                mz6 mz6Var = rdgVar.g;
                tdgVar.c(mz6Var, (TextView) wv5Var5.a(kgxVarArr[3]));
                if (mz6Var == null) {
                    ght ghtVar = rdgVar.h;
                    ((GiftProgressView) wv5Var3.a(kgxVarArr[4])).setVisibility(ghtVar != null ? 0 : 8);
                    if (ghtVar != null) {
                        ((GiftProgressView) wv5Var3.a(kgxVarArr[4])).setContent(ghtVar, tdgVar.f, tdgVar.g, tdgVar.b);
                    }
                }
                wj4 wj4Var = rdgVar.i;
                tdgVar.h().setVisibility(wj4Var == null ? 8 : 0);
                if (wj4Var != null) {
                    tdgVar.h().setBackgroundTintList(ColorStateList.valueOf(wj4Var.a.getColor()));
                    tdgVar.h().setText(wj4Var.b);
                }
                view.setContentDescription(rdgVar.k);
                tdgVar.d(rdgVar.j, (ShapeableImageView) tdgVar.n.a(kgxVarArr[6]));
                int i4 = 7;
                tdgVar.d(rdgVar.l, (ShapeableImageView) wv5Var2.a(kgxVarArr[7]));
                tdgVar.d(rdgVar.m, (ShapeableImageView) wv5Var.a(kgxVarArr[8]));
                i3y i3yVar = ddgVar.d;
                if (ddgVar.a) {
                    ((ValueAnimator) i3yVar.getValue()).removeAllUpdateListeners();
                    ((ValueAnimator) i3yVar.getValue()).cancel();
                }
                tdgVar.g((ShapeableImageView) wv5Var2.a(kgxVarArr[7]), new gse(i4));
                tdgVar.g((ShapeableImageView) wv5Var.a(kgxVarArr[8]), new gse(i3));
                if (ddgVar.a) {
                    ((ValueAnimator) ddgVar.d.getValue()).start();
                }
                return zy11.a;
            }
        }
        plusDailyViewController$handleTopPart$1 = new PlusDailyViewController$handleTopPart$1(this, continuationImpl);
        Object obj2 = plusDailyViewController$handleTopPart$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusDailyViewController$handleTopPart$1.label;
        if (i != 0) {
        }
        rdg rdgVar2 = (rdg) obj2;
        View.OnClickListener onClickListener2 = rdgVar2.f;
        View view2 = tdgVar.a;
        ddg ddgVar2 = tdgVar.e;
        wv5 wv5Var6 = tdgVar.p;
        wv5 wv5Var22 = tdgVar.o;
        wv5 wv5Var32 = tdgVar.l;
        wv5 wv5Var42 = tdgVar.h;
        wv5 wv5Var52 = tdgVar.k;
        int q3 = bb1.q(nvg0.plus_sdk_panel_daily_top_layout_height, view2);
        z2 = rdgVar2.n;
        if (z2) {
        }
        layoutParams = view2.getLayoutParams();
        if (layoutParams != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00e1, code lost:
    
        if (c(r11, r6, r0) != r1) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Continuation continuation) {
        PlusDailyViewController$onStateChanged$1 plusDailyViewController$onStateChanged$1;
        int i;
        ldg ldgVar;
        zcg zcgVar;
        int i2;
        int i3;
        if (continuation instanceof PlusDailyViewController$onStateChanged$1) {
            plusDailyViewController$onStateChanged$1 = (PlusDailyViewController$onStateChanged$1) continuation;
            int i4 = plusDailyViewController$onStateChanged$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                plusDailyViewController$onStateChanged$1.label = i4 - Integer.MIN_VALUE;
                Object obj = plusDailyViewController$onStateChanged$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusDailyViewController$onStateChanged$1.label;
                if (i != 0) {
                    b.b(obj);
                    LogPriority logPriority = LogPriority.DEBUG;
                    pgz pgzVar = this.h;
                    if (pgzVar.e(logPriority)) {
                        pgzVar.a(logPriority, "PlusDailyViewController", "onStateChanged() data=" + this.o);
                    }
                    kgx[] kgxVarArr = p;
                    ViewGroup viewGroup = (ViewGroup) this.i.a(kgxVarArr[0]);
                    ldg ldgVar2 = this.o;
                    viewGroup.setVisibility((ldgVar2 != null ? ldgVar2.a : null) != null ? 0 : 8);
                    ViewGroup viewGroup2 = (ViewGroup) this.j.a(kgxVarArr[1]);
                    ldg ldgVar3 = this.o;
                    viewGroup2.setVisibility((ldgVar3 != null ? ldgVar3.b : null) != null ? 0 : 8);
                    ldgVar = this.o;
                    if (ldgVar != null) {
                        ?? r11 = ldgVar.b != null ? 1 : 0;
                        kdg kdgVar = ldgVar.a;
                        fdg fdgVar = kdgVar.i;
                        zcgVar = new zcg(fdgVar != null ? fdgVar.b : null);
                        plusDailyViewController$onStateChanged$1.L$0 = ldgVar;
                        plusDailyViewController$onStateChanged$1.L$1 = zcgVar;
                        plusDailyViewController$onStateChanged$1.I$0 = 0;
                        plusDailyViewController$onStateChanged$1.I$1 = r11;
                        plusDailyViewController$onStateChanged$1.label = 1;
                        if (d(kdgVar, r11, plusDailyViewController$onStateChanged$1) != coroutineSingletons) {
                            i2 = 0;
                            i3 = r11;
                            gdg gdgVar = ldgVar.b;
                            plusDailyViewController$onStateChanged$1.L$0 = null;
                            plusDailyViewController$onStateChanged$1.L$1 = null;
                            plusDailyViewController$onStateChanged$1.I$0 = i2;
                            plusDailyViewController$onStateChanged$1.I$1 = i3;
                            plusDailyViewController$onStateChanged$1.label = 2;
                        }
                        return coroutineSingletons;
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    return zy11.a;
                }
                i3 = plusDailyViewController$onStateChanged$1.I$1;
                i2 = plusDailyViewController$onStateChanged$1.I$0;
                zcgVar = (zcg) plusDailyViewController$onStateChanged$1.L$1;
                ldgVar = (ldg) plusDailyViewController$onStateChanged$1.L$0;
                b.b(obj);
                gdg gdgVar2 = ldgVar.b;
                plusDailyViewController$onStateChanged$1.L$0 = null;
                plusDailyViewController$onStateChanged$1.L$1 = null;
                plusDailyViewController$onStateChanged$1.I$0 = i2;
                plusDailyViewController$onStateChanged$1.I$1 = i3;
                plusDailyViewController$onStateChanged$1.label = 2;
            }
        }
        plusDailyViewController$onStateChanged$1 = new PlusDailyViewController$onStateChanged$1(this, continuation);
        Object obj2 = plusDailyViewController$onStateChanged$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusDailyViewController$onStateChanged$1.label;
        if (i != 0) {
        }
    }
}
