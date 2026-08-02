package com.yandex.payment.sdk.flex.impl;

import android.app.Application;
import com.yandex.feedsdk.di.FeedSdkComponent;
import com.yandex.feedsdk.di.Yatagan$FeedSdkComponent;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.yandex.payment.sdk.flex.api.models.FlexAction;
import defpackage.aks0;
import defpackage.aoq0;
import defpackage.bhr;
import defpackage.bie;
import defpackage.cks0;
import defpackage.dhr;
import defpackage.du;
import defpackage.dul;
import defpackage.e511;
import defpackage.exl;
import defpackage.f970;
import defpackage.fhr;
import defpackage.g0p;
import defpackage.g0x0;
import defpackage.ghr;
import defpackage.hwn;
import defpackage.i3y;
import defpackage.i6p;
import defpackage.i7s0;
import defpackage.iul;
import defpackage.j0;
import defpackage.jah;
import defpackage.jks0;
import defpackage.jn11;
import defpackage.jq90;
import defpackage.jul;
import defpackage.k5c;
import defpackage.k6x;
import defpackage.kir;
import defpackage.l00;
import defpackage.lir;
import defpackage.mu;
import defpackage.mu00;
import defpackage.nu00;
import defpackage.ny2;
import defpackage.o211;
import defpackage.ou00;
import defpackage.oul;
import defpackage.ow50;
import defpackage.pvy0;
import defpackage.q18;
import defpackage.q511;
import defpackage.q631;
import defpackage.qoi0;
import defpackage.qxl;
import defpackage.r631;
import defpackage.reu;
import defpackage.s631;
import defpackage.s8o;
import defpackage.sb11;
import defpackage.sbx;
import defpackage.scc;
import defpackage.sir;
import defpackage.skf;
import defpackage.sls;
import defpackage.tje;
import defpackage.tph;
import defpackage.uoq0;
import defpackage.upq;
import defpackage.vfr;
import defpackage.vpq;
import defpackage.vqq;
import defpackage.w511;
import defpackage.weu;
import defpackage.wv2;
import defpackage.xei0;
import defpackage.xpq;
import defpackage.yfr;
import defpackage.z1o;
import defpackage.z9r;
import defpackage.zgl;
import defpackage.zrm;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;

/* loaded from: classes2.dex */
public final class a {
    public final i3y a = kotlin.a.a(new FlexAdapterImpl$FeedComponentProvider$mainFeedComponent$2(0, this, a.class, "createFeedSdkComponent", "createFeedSdkComponent()Lcom/yandex/feedsdk/di/FeedSdkComponent;", 0));
    public final /* synthetic */ b b;

    public a(b bVar) {
        this.b = bVar;
    }

    public final FeedSdkComponent a() {
        mu muVar;
        b bVar = this.b;
        k6x k6xVar = bVar.b;
        bhr bhrVar = bVar.f;
        lir lirVar = (bhrVar == null ? null : bhrVar).e;
        Map map = (bhrVar == null ? null : bhrVar).a;
        if (bhrVar == null) {
            bhrVar = null;
        }
        k5c k5cVar = bhrVar.h;
        final int i = 0;
        yfr yfrVar = new yfr(new zrm(16, k6xVar, new dhr(new WeakReference(bVar), i)));
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = FlexAction.a().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            EmptyList emptyList = EmptyList.a;
            if (!hasNext) {
                upq upqVar = new upq(new g0p(null, arrayList, 247));
                bhr bhrVar2 = bVar.f;
                if (bhrVar2 == null) {
                    bhrVar2 = null;
                }
                Application application = bhrVar2.b.getApplication();
                fhr fhrVar = new fhr(bVar);
                ghr ghrVar = new ghr(i, bVar);
                bhr bhrVar3 = bVar.f;
                if (bhrVar3 == null) {
                    bhrVar3 = null;
                }
                String str = bhrVar3.i;
                Map f = kotlin.collections.b.f();
                bhr bhrVar4 = bVar.f;
                if (bhrVar4 == null) {
                    bhrVar4 = null;
                }
                core.network.mapi.client.a aVar = new core.network.mapi.client.a(new sir(1, str), scc.g(new nu00(f), ou00.a), new mu00(bhrVar4.d, 0));
                fhr fhrVar2 = new fhr(bVar);
                bhr bhrVar5 = bVar.f;
                wv2 wv2Var = new wv2((bhrVar5 == null ? null : bhrVar5).e);
                xei0 xei0Var = new xei0(0);
                vpq vpqVar = new vpq(462, (bhrVar5 == null ? null : bhrVar5).g, (bhrVar5 == null ? null : bhrVar5).g, (bhrVar5 == null ? null : bhrVar5).g);
                jks0 jks0Var = jks0.a;
                if (bhrVar5 == null) {
                    bhrVar5 = null;
                }
                g0p g0pVar = new g0p(Collections.singletonList(new bie("skeleton", qoi0.a(aks0.class), jks0Var, new cks0(bhrVar5.f), emptyList)), null, 251);
                bhr bhrVar6 = bVar.f;
                if (bhrVar6 == null) {
                    bhrVar6 = null;
                }
                File cacheDir = bhrVar6.b.getCacheDir();
                bhr bhrVar7 = bVar.f;
                if (bhrVar7 == null) {
                    bhrVar7 = null;
                }
                File cacheDir2 = bhrVar7.b.getCacheDir();
                new jq90();
                kotlinx.serialization.modules.a aVar2 = new kotlinx.serialization.modules.a();
                s8o.Q(aVar2);
                flex.network.cache.a aVar3 = new flex.network.cache.a(ny2.a, cacheDir, cacheDir2, tje.a(sbx.d, new weu(20, aVar2.a())));
                bhr bhrVar8 = bVar.f;
                if (bhrVar8 == null) {
                    bhrVar8 = null;
                }
                reu reuVar = new reu(0, bhrVar8.e);
                skf skfVar = (skf) bVar.g.getValue();
                jah jahVar = new jah();
                zgl zglVar = new zgl(27);
                qxl a = flex.engine.document.a.a();
                ow50 ow50Var = new ow50();
                hwn hwnVar = new hwn();
                q18 q18Var = new q18();
                z1o z1oVar = new z1o();
                new s631();
                q631 q631Var = q631.a;
                r631 r631Var = new r631(q631Var);
                jul.U1.getClass();
                FeedSdkComponent a2 = upqVar.a(new xpq(application, fhrVar2, fhrVar, aVar, wv2Var, xei0Var, vpqVar, reuVar, oul.a, g0pVar, skfVar, ghrVar, jahVar, aVar3, exl.a, zglVar, null, a, q631Var, ow50Var, emptyList, null, null, hwnVar, q18Var, null, z1oVar, null, jn11.d, r631Var, iul.a, dul.a, new g0x0(), emptyList, new vqq(), 0, 16), k6xVar);
                pvy0 D = ((Yatagan$FeedSdkComponent) a2).D();
                bhr bhrVar9 = bVar.f;
                D.a((bhrVar9 == null ? null : bhrVar9).f ? DivkitThemeChangeListener.THEME_VARIABLE_DEFAULT_VALUE : "NIGHT");
                return a2;
            }
            FlexAction flexAction = (FlexAction) it.next();
            Object obj = map.get(flexAction);
            final vfr vfrVar = obj instanceof vfr ? (vfr) obj : null;
            if (vfrVar != null) {
                final int i2 = 8;
                final int i3 = 7;
                switch (l00.a[flexAction.ordinal()]) {
                    case 1:
                        final int i4 = 1;
                        muVar = new mu(vfrVar.b(), qoi0.a(f970.class), new du(17), kotlin.a.b(LazyThreadSafetyMode.NONE, new sls() { // from class: k00
                            @Override // defpackage.sls
                            public final Object invoke() {
                                int i5 = i4;
                                yfr yfrVar2 = null;
                                vfr vfrVar2 = vfrVar;
                                switch (i5) {
                                    case 0:
                                        return new o6p(vfrVar2, yfrVar2, 1);
                                    case 1:
                                        return new o6p(vfrVar2, yfrVar2, 2);
                                    case 2:
                                        return new o6p(vfrVar2, yfrVar2, 5);
                                    case 3:
                                        return new o6p(vfrVar2, yfrVar2, 4);
                                    case 4:
                                        return new o6p(vfrVar2, yfrVar2, 3);
                                    case 5:
                                        return new o6p(vfrVar2, yfrVar2, 8);
                                    case 6:
                                        return new o6p(vfrVar2, yfrVar2, 6);
                                    case 7:
                                        return new o6p(vfrVar2, yfrVar2, 7);
                                    default:
                                        return new o6p(vfrVar2, yfrVar2, 9);
                                }
                            }
                        }), emptyList, false);
                        break;
                    case 2:
                        final int i5 = 2;
                        muVar = new mu(vfrVar.b(), qoi0.a(i7s0.class), new du(19), kotlin.a.b(LazyThreadSafetyMode.NONE, new sls() { // from class: k00
                            @Override // defpackage.sls
                            public final Object invoke() {
                                int i52 = i5;
                                yfr yfrVar2 = null;
                                vfr vfrVar2 = vfrVar;
                                switch (i52) {
                                    case 0:
                                        return new o6p(vfrVar2, yfrVar2, 1);
                                    case 1:
                                        return new o6p(vfrVar2, yfrVar2, 2);
                                    case 2:
                                        return new o6p(vfrVar2, yfrVar2, 5);
                                    case 3:
                                        return new o6p(vfrVar2, yfrVar2, 4);
                                    case 4:
                                        return new o6p(vfrVar2, yfrVar2, 3);
                                    case 5:
                                        return new o6p(vfrVar2, yfrVar2, 8);
                                    case 6:
                                        return new o6p(vfrVar2, yfrVar2, 6);
                                    case 7:
                                        return new o6p(vfrVar2, yfrVar2, 7);
                                    default:
                                        return new o6p(vfrVar2, yfrVar2, 9);
                                }
                            }
                        }), emptyList, false);
                        break;
                    case 3:
                        final int i6 = 3;
                        muVar = new mu(vfrVar.b(), qoi0.a(uoq0.class), new du(20), kotlin.a.b(LazyThreadSafetyMode.NONE, new sls() { // from class: k00
                            @Override // defpackage.sls
                            public final Object invoke() {
                                int i52 = i6;
                                yfr yfrVar2 = null;
                                vfr vfrVar2 = vfrVar;
                                switch (i52) {
                                    case 0:
                                        return new o6p(vfrVar2, yfrVar2, 1);
                                    case 1:
                                        return new o6p(vfrVar2, yfrVar2, 2);
                                    case 2:
                                        return new o6p(vfrVar2, yfrVar2, 5);
                                    case 3:
                                        return new o6p(vfrVar2, yfrVar2, 4);
                                    case 4:
                                        return new o6p(vfrVar2, yfrVar2, 3);
                                    case 5:
                                        return new o6p(vfrVar2, yfrVar2, 8);
                                    case 6:
                                        return new o6p(vfrVar2, yfrVar2, 6);
                                    case 7:
                                        return new o6p(vfrVar2, yfrVar2, 7);
                                    default:
                                        return new o6p(vfrVar2, yfrVar2, 9);
                                }
                            }
                        }), emptyList, false);
                        break;
                    case 4:
                        muVar = new mu(vfrVar.b(), qoi0.a(tph.class), new du(21), kotlin.a.b(LazyThreadSafetyMode.NONE, new j0(i2, vfrVar, k5cVar)), emptyList, false);
                        break;
                    case 5:
                        final int i7 = 4;
                        muVar = new mu(vfrVar.b(), qoi0.a(aoq0.class), new du(23), kotlin.a.b(LazyThreadSafetyMode.NONE, new sls() { // from class: k00
                            @Override // defpackage.sls
                            public final Object invoke() {
                                int i52 = i7;
                                yfr yfrVar2 = null;
                                vfr vfrVar2 = vfrVar;
                                switch (i52) {
                                    case 0:
                                        return new o6p(vfrVar2, yfrVar2, 1);
                                    case 1:
                                        return new o6p(vfrVar2, yfrVar2, 2);
                                    case 2:
                                        return new o6p(vfrVar2, yfrVar2, 5);
                                    case 3:
                                        return new o6p(vfrVar2, yfrVar2, 4);
                                    case 4:
                                        return new o6p(vfrVar2, yfrVar2, 3);
                                    case 5:
                                        return new o6p(vfrVar2, yfrVar2, 8);
                                    case 6:
                                        return new o6p(vfrVar2, yfrVar2, 6);
                                    case 7:
                                        return new o6p(vfrVar2, yfrVar2, 7);
                                    default:
                                        return new o6p(vfrVar2, yfrVar2, 9);
                                }
                            }
                        }), emptyList, false);
                        break;
                    case 6:
                        final int i8 = 5;
                        muVar = new mu(vfrVar.b(), qoi0.a(q511.class), new du(22), kotlin.a.b(LazyThreadSafetyMode.NONE, new sls() { // from class: k00
                            @Override // defpackage.sls
                            public final Object invoke() {
                                int i52 = i8;
                                yfr yfrVar2 = null;
                                vfr vfrVar2 = vfrVar;
                                switch (i52) {
                                    case 0:
                                        return new o6p(vfrVar2, yfrVar2, 1);
                                    case 1:
                                        return new o6p(vfrVar2, yfrVar2, 2);
                                    case 2:
                                        return new o6p(vfrVar2, yfrVar2, 5);
                                    case 3:
                                        return new o6p(vfrVar2, yfrVar2, 4);
                                    case 4:
                                        return new o6p(vfrVar2, yfrVar2, 3);
                                    case 5:
                                        return new o6p(vfrVar2, yfrVar2, 8);
                                    case 6:
                                        return new o6p(vfrVar2, yfrVar2, 6);
                                    case 7:
                                        return new o6p(vfrVar2, yfrVar2, 7);
                                    default:
                                        return new o6p(vfrVar2, yfrVar2, 9);
                                }
                            }
                        }), emptyList, false);
                        break;
                    case 7:
                        final int i9 = 6;
                        muVar = new mu(vfrVar.b(), qoi0.a(o211.class), new du(24), kotlin.a.b(LazyThreadSafetyMode.NONE, new sls() { // from class: k00
                            @Override // defpackage.sls
                            public final Object invoke() {
                                int i52 = i9;
                                yfr yfrVar2 = null;
                                vfr vfrVar2 = vfrVar;
                                switch (i52) {
                                    case 0:
                                        return new o6p(vfrVar2, yfrVar2, 1);
                                    case 1:
                                        return new o6p(vfrVar2, yfrVar2, 2);
                                    case 2:
                                        return new o6p(vfrVar2, yfrVar2, 5);
                                    case 3:
                                        return new o6p(vfrVar2, yfrVar2, 4);
                                    case 4:
                                        return new o6p(vfrVar2, yfrVar2, 3);
                                    case 5:
                                        return new o6p(vfrVar2, yfrVar2, 8);
                                    case 6:
                                        return new o6p(vfrVar2, yfrVar2, 6);
                                    case 7:
                                        return new o6p(vfrVar2, yfrVar2, 7);
                                    default:
                                        return new o6p(vfrVar2, yfrVar2, 9);
                                }
                            }
                        }), emptyList, false);
                        break;
                    case 8:
                        muVar = new mu(vfrVar.b(), qoi0.a(e511.class), new du(25), kotlin.a.b(LazyThreadSafetyMode.NONE, new sls() { // from class: k00
                            @Override // defpackage.sls
                            public final Object invoke() {
                                int i52 = i3;
                                yfr yfrVar2 = null;
                                vfr vfrVar2 = vfrVar;
                                switch (i52) {
                                    case 0:
                                        return new o6p(vfrVar2, yfrVar2, 1);
                                    case 1:
                                        return new o6p(vfrVar2, yfrVar2, 2);
                                    case 2:
                                        return new o6p(vfrVar2, yfrVar2, 5);
                                    case 3:
                                        return new o6p(vfrVar2, yfrVar2, 4);
                                    case 4:
                                        return new o6p(vfrVar2, yfrVar2, 3);
                                    case 5:
                                        return new o6p(vfrVar2, yfrVar2, 8);
                                    case 6:
                                        return new o6p(vfrVar2, yfrVar2, 6);
                                    case 7:
                                        return new o6p(vfrVar2, yfrVar2, 7);
                                    default:
                                        return new o6p(vfrVar2, yfrVar2, 9);
                                }
                            }
                        }), emptyList, false);
                        break;
                    case 9:
                        muVar = new mu(vfrVar.b(), qoi0.a(sb11.class), new du(26), kotlin.a.b(LazyThreadSafetyMode.NONE, new sls() { // from class: k00
                            @Override // defpackage.sls
                            public final Object invoke() {
                                int i52 = i2;
                                yfr yfrVar2 = null;
                                vfr vfrVar2 = vfrVar;
                                switch (i52) {
                                    case 0:
                                        return new o6p(vfrVar2, yfrVar2, 1);
                                    case 1:
                                        return new o6p(vfrVar2, yfrVar2, 2);
                                    case 2:
                                        return new o6p(vfrVar2, yfrVar2, 5);
                                    case 3:
                                        return new o6p(vfrVar2, yfrVar2, 4);
                                    case 4:
                                        return new o6p(vfrVar2, yfrVar2, 3);
                                    case 5:
                                        return new o6p(vfrVar2, yfrVar2, 8);
                                    case 6:
                                        return new o6p(vfrVar2, yfrVar2, 6);
                                    case 7:
                                        return new o6p(vfrVar2, yfrVar2, 7);
                                    default:
                                        return new o6p(vfrVar2, yfrVar2, 9);
                                }
                            }
                        }), emptyList, false);
                        break;
                    case 10:
                        muVar = new mu(vfrVar.b(), qoi0.a(z9r.class), new du(27), kotlin.a.b(LazyThreadSafetyMode.NONE, new sls() { // from class: k00
                            @Override // defpackage.sls
                            public final Object invoke() {
                                int i52 = i;
                                yfr yfrVar2 = null;
                                vfr vfrVar2 = vfrVar;
                                switch (i52) {
                                    case 0:
                                        return new o6p(vfrVar2, yfrVar2, 1);
                                    case 1:
                                        return new o6p(vfrVar2, yfrVar2, 2);
                                    case 2:
                                        return new o6p(vfrVar2, yfrVar2, 5);
                                    case 3:
                                        return new o6p(vfrVar2, yfrVar2, 4);
                                    case 4:
                                        return new o6p(vfrVar2, yfrVar2, 3);
                                    case 5:
                                        return new o6p(vfrVar2, yfrVar2, 8);
                                    case 6:
                                        return new o6p(vfrVar2, yfrVar2, 6);
                                    case 7:
                                        return new o6p(vfrVar2, yfrVar2, 7);
                                    default:
                                        return new o6p(vfrVar2, yfrVar2, 9);
                                }
                            }
                        }), emptyList, false);
                        break;
                    case 11:
                        muVar = new mu(vfrVar.b(), qoi0.a(i6p.class), new du(18), kotlin.a.b(LazyThreadSafetyMode.NONE, new j0(i3, vfrVar, yfrVar)), emptyList, false);
                        break;
                    default:
                        w511.b();
                        return null;
                }
                arrayList.add(muVar);
            } else {
                lirVar.a(new kir("UNKNOWN ACTION"));
            }
        }
    }
}
