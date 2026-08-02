package com.yandex.messaging.internal.view.timeline;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.chip.ChipGroup;
import com.yandex.messaging.internal.entities.Suggest;
import com.yandex.messaging.internal.view.timeline.c0;
import defpackage.acb;
import defpackage.h3y;
import defpackage.i3y;
import defpackage.iw10;
import defpackage.kgx;
import defpackage.kse;
import defpackage.lh00;
import defpackage.n7l0;
import defpackage.nka1;
import defpackage.oyr;
import defpackage.pj91;
import defpackage.pzt0;
import defpackage.qoi0;
import defpackage.rp3;
import defpackage.scc;
import defpackage.sls;
import defpackage.sm1;
import defpackage.tje;
import defpackage.tu10;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes15.dex */
public final class c0 {
    public static final /* synthetic */ kgx[] n = {new MutablePropertyReference1Impl("clickHandleJob", 0, "getClickHandleJob()Lkotlinx/coroutines/Job;", c0.class), oyr.B(qoi0.a, c0.class, "applyTranslationsJob", "getApplyTranslationsJob()Lkotlinx/coroutines/Job;", 0)};
    public final ViewGroup a;
    public final h3y b;
    public final kse c;
    public final iw10 d;
    public final sm1 e;
    public final i3y f;
    public final i3y h;
    public final i3y l;
    public final ArrayList g = new ArrayList();
    public final ArrayList i = new ArrayList();
    public final rp3 j = new rp3();
    public final rp3 k = new rp3();
    public final lh00 m = new lh00();

    public c0(ViewGroup viewGroup, h3y h3yVar, kse kseVar, sls slsVar, iw10 iw10Var, sm1 sm1Var) {
        this.a = viewGroup;
        this.b = h3yVar;
        this.c = kseVar;
        this.d = iw10Var;
        this.e = sm1Var;
        final int i = 0;
        this.f = kotlin.a.a(new sls(this) { // from class: ccv0
            public final /* synthetic */ c0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                c0 c0Var = this.b;
                switch (i2) {
                    case 0:
                        return (ChipGroup) c0Var.a.findViewById(e9h0.regular_suggests_container);
                    default:
                        return (FrameLayout) c0Var.a.findViewById(e9h0.layout_suggests_container);
                }
            }
        });
        final int i2 = 1;
        this.h = kotlin.a.a(new sls(this) { // from class: ccv0
            public final /* synthetic */ c0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                c0 c0Var = this.b;
                switch (i22) {
                    case 0:
                        return (ChipGroup) c0Var.a.findViewById(e9h0.regular_suggests_container);
                    default:
                        return (FrameLayout) c0Var.a.findViewById(e9h0.layout_suggests_container);
                }
            }
        });
        this.l = kotlin.a.a(new n7l0(14, slsVar));
    }

    public final void a() {
        this.a.setVisibility(8);
        ((ChipGroup) this.f.getValue()).setVisibility(8);
        ((FrameLayout) this.h.getValue()).setVisibility(8);
        kgx[] kgxVarArr = n;
        kgx kgxVar = kgxVarArr[1];
        this.k.a(null);
        lh00 lh00Var = this.m;
        lh00Var.a.clear();
        lh00Var.b.clear();
        kgx kgxVar2 = kgxVarArr[0];
        this.j.a(null);
    }

    public final void b(Suggest suggest, boolean z, tu10 tu10Var, Integer num, int i, acb acbVar) {
        List M = kotlin.collections.a.M(suggest.getDirectives());
        List M2 = kotlin.collections.a.M(suggest.getDirectives());
        this.e.b("suggest_pressed", suggest, z, tu10Var, scc.g(new Pair("all_directives_count", Integer.valueOf(suggest.getDirectives().size())), new Pair("parsed_directives_count", Integer.valueOf(((ArrayList) M2).size())), new Pair("parsed_directives", M2)));
        kgx[] kgxVarArr = n;
        rp3 rp3Var = this.j;
        if (acbVar == null) {
            kgx kgxVar = kgxVarArr[0];
            rp3Var.a(null);
        } else {
            pzt0 N = tje.N(nka1.c(pj91.f(this.a)), this.c.c, null, new SuggestsUiDelegate$onSuggestClicked$2(acbVar, M, suggest, num, i, tu10Var, this, z, null), 2);
            kgx kgxVar2 = kgxVarArr[0];
            rp3Var.a(N);
        }
    }
}
