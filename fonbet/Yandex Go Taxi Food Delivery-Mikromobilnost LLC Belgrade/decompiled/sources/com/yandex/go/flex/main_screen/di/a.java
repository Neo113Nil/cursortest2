package com.yandex.go.flex.main_screen.di;

import android.content.Context;
import com.yandex.feedsdk.di.FeedSdkComponent;
import com.yandex.feedsdk.di.Yatagan$FeedSdkComponent;
import com.yandex.go.flex.main_screen.experiments.SuperappMainFeedClientFeaturesExperiment;
import com.yandex.go.flex.main_screen.presentation.d;
import defpackage.b8w;
import defpackage.c8w;
import defpackage.g0p;
import defpackage.gd;
import defpackage.gd1;
import defpackage.gqq;
import defpackage.hir;
import defpackage.hpq;
import defpackage.i130;
import defpackage.jn11;
import defpackage.jp50;
import defpackage.k6x;
import defpackage.l20;
import defpackage.mbw0;
import defpackage.mir;
import defpackage.n2g;
import defpackage.nbw0;
import defpackage.nfh;
import defpackage.p7w0;
import defpackage.p800;
import defpackage.pav;
import defpackage.rav;
import defpackage.scc;
import defpackage.sve;
import defpackage.upj;
import defpackage.v7p;
import defpackage.vbh;
import defpackage.vit;
import defpackage.vlr;
import defpackage.w800;
import defpackage.x800;
import defpackage.xei0;
import defpackage.xvf0;
import defpackage.y2g;
import defpackage.y2r0;
import defpackage.ynq;
import defpackage.z2g;
import defpackage.z4k0;
import java.util.Collections;
import java.util.Set;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes.dex */
public final class a implements v7p {
    public final xvf0 a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final xvf0 g;
    public final xvf0 h;
    public final xvf0 i;
    public final xvf0 j;
    public final xvf0 k;
    public final z2g l;
    public final xvf0 m;
    public final xvf0 n;
    public final xvf0 o;
    public final xvf0 p;
    public final sve q;
    public final c8w r;
    public final upj s;
    public final gd t;

    public a(y2g y2gVar, y2g y2gVar2, z2g z2gVar, z2g z2gVar2, n2g n2gVar, z2g z2gVar3, b8w b8wVar, p7w0 p7w0Var, z2g z2gVar4, z4k0 z4k0Var, l20 l20Var, z2g z2gVar5, xvf0 xvf0Var, xvf0 xvf0Var2, y2r0 y2r0Var, z2g z2gVar6, sve sveVar, c8w c8wVar, upj upjVar, gd gdVar) {
        this.a = y2gVar;
        this.b = y2gVar2;
        this.c = z2gVar;
        this.d = z2gVar2;
        this.e = n2gVar;
        this.f = z2gVar3;
        this.g = b8wVar;
        this.h = p7w0Var;
        this.i = z2gVar4;
        this.j = z4k0Var;
        this.k = l20Var;
        this.l = z2gVar5;
        this.m = xvf0Var;
        this.n = xvf0Var2;
        this.o = y2r0Var;
        this.p = z2gVar6;
        this.q = sveVar;
        this.r = c8wVar;
        this.s = upjVar;
        this.t = gdVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        mir mirVar = (mir) this.a.get();
        hpq hpqVar = (hpq) this.b.get();
        rav ravVar = (rav) this.c.get();
        pav pavVar = (pav) this.d.get();
        Context context = (Context) this.e.get();
        i130 i130Var = (i130) this.f.get();
        hir hirVar = (hir) this.g.get();
        nbw0 nbw0Var = (nbw0) this.h.get();
        jp50 jp50Var = (jp50) this.i.get();
        com.yandex.go.flex.main_screen.a aVar = (com.yandex.go.flex.main_screen.a) this.j.get();
        d dVar = (d) this.k.get();
        k6x k6xVar = (k6x) this.l.get();
        x800 x800Var = (x800) this.m.get();
        w800 w800Var = (w800) this.n.get();
        Set set = (Set) this.o.get();
        p800 p800Var = (p800) this.p.get();
        g0p g0pVar = (g0p) this.q.get();
        com.yandex.go.flex.main_screen.data.network.d dVar2 = (com.yandex.go.flex.main_screen.data.network.d) this.r.get();
        com.yandex.go.flex.main_screen.data.network.a aVar2 = (com.yandex.go.flex.main_screen.data.network.a) this.s.get();
        gd1 gd1Var = (gd1) this.t.get();
        hpqVar.getClass();
        nfh nfhVar = new nfh(context, i130Var, new vbh(true));
        mbw0 mbw0Var = nbw0Var.a;
        FeedSdkComponent a = mirVar.a(new vlr("MainScreen", hirVar, null, g0pVar, nfhVar, dVar, null, null, kotlin.collections.a.J0(set), Collections.singletonList(x800Var), k6xVar, jp50Var, aVar, new vit(26, w800Var), scc.g(dVar2, aVar2, gd1Var), new xei0(((SuperappMainFeedClientFeaturesExperiment) mbw0Var.c()).c.a.a, ((SuperappMainFeedClientFeaturesExperiment) mbw0Var.c()).c.a.c, ((SuperappMainFeedClientFeaturesExperiment) mbw0Var.c()).c.a.b * 1000), ((SuperappMainFeedClientFeaturesExperiment) mbw0Var.c()).e ? new ynq(pavVar, ravVar.a) : null, new jn11(new MainScreenFlexSdkViewModule$provideMainScreenOnFlexComponentComponent$buildFlexSdkConfig$1(0, nbw0Var, nbw0.class, "divkitSnippetCacheEnabled", "divkitSnippetCacheEnabled()Z", 0), new MainScreenFlexSdkViewModule$provideMainScreenOnFlexComponentComponent$buildFlexSdkConfig$2(0, nbw0Var, nbw0.class, "divkitSnippetCacheMaxTypeCount", "divkitSnippetCacheMaxTypeCount()I", 0), new MainScreenFlexSdkViewModule$provideMainScreenOnFlexComponentComponent$buildFlexSdkConfig$3(0, nbw0Var, nbw0.class, "divkitSnippetMaxViewCount", "divkitSnippetMaxViewCount()I", 0)), null, 524682));
        gqq gqqVar = ((Yatagan$FeedSdkComponent) a).R;
        r0 r0Var = p800Var.a;
        r0Var.getClass();
        r0Var.m(null, gqqVar);
        return a;
    }
}
