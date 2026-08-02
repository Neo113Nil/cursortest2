package com.yandex.messaging.internal.view.timeline.suggest;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.flexbox.FlexboxLayout;
import com.yandex.messaging.core.net.entities.directives.Button;
import com.yandex.messaging.internal.translator.k;
import com.yandex.messaging.internal.view.timeline.e;
import defpackage.bcb;
import defpackage.bvf0;
import defpackage.ccb;
import defpackage.dcb;
import defpackage.e7v0;
import defpackage.ecb;
import defpackage.g8a1;
import defpackage.ike;
import defpackage.j3b;
import defpackage.jl40;
import defpackage.jwf;
import defpackage.kgx;
import defpackage.l7b;
import defpackage.lqo;
import defpackage.nz01;
import defpackage.olh0;
import defpackage.oyr;
import defpackage.p4t;
import defpackage.p4v0;
import defpackage.pzt0;
import defpackage.qoi0;
import defpackage.rp3;
import defpackage.tje;
import defpackage.tz10;
import defpackage.w511;
import java.util.ArrayList;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes15.dex */
public final class c extends e {
    public static final /* synthetic */ kgx[] v1 = {new MutablePropertyReference1Impl("translationSubscriptionJob", 0, "getTranslationSubscriptionJob()Lkotlinx/coroutines/Job;", c.class), oyr.B(qoi0.a, c.class, "translationWaitingJob", "getTranslationWaitingJob()Lkotlinx/coroutines/Job;", 0)};
    public static final int x1 = olh0.msg_chat_item_suggest_buttons;
    public final p4t B0;
    public final k C0;
    public final nz01 D0;
    public final lqo E0;
    public l7b F0;
    public final FlexboxLayout G0;
    public ike H0;
    public bcb I0;
    public e7v0 J0;
    public boolean K0;
    public final rp3 L0;
    public final rp3 M0;
    public p4v0 N0;
    public Long O0;
    public Integer P0;
    public String Q0;
    public j3b R0;
    public String S0;
    public boolean T0;
    public boolean p1;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c(jwf jwfVar, p4t p4tVar, k kVar, nz01 nz01Var, lqo lqoVar) {
        super(false, r0, jwfVar);
        View g = g8a1.g((ViewGroup) jwfVar.k, olh0.msg_chat_item_suggest_buttons);
        this.B0 = p4tVar;
        this.C0 = kVar;
        this.D0 = nz01Var;
        this.E0 = lqoVar;
        this.G0 = (FlexboxLayout) g;
        this.L0 = new rp3();
        this.M0 = new rp3();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void y0(c cVar) {
        boolean z;
        p4v0 p4v0Var;
        l7b l7bVar;
        String str;
        lqo lqoVar = cVar.E0;
        bcb bcbVar = cVar.I0;
        Long l = cVar.O0;
        j3b j3bVar = cVar.R0;
        if (j3bVar == null) {
            return;
        }
        p4v0 p4v0Var2 = cVar.N0;
        boolean z2 = (p4v0Var2 != null ? p4v0Var2.b.length : 0) == 0;
        boolean z3 = cVar.p1;
        boolean z4 = cVar.T0;
        if (bcbVar != null && l != null && cVar.D0.b(j3bVar) && (str = cVar.Q0) != null && !jl40.l(cVar.S0, str)) {
            ecb a = bcbVar.a(l.longValue());
            p4v0 p4v0Var3 = null;
            ArrayList arrayList = null;
            if (a instanceof ccb) {
                if (lqoVar.a(tz10.w)) {
                    p4v0 p4v0Var4 = cVar.N0;
                    cVar.N0 = p4v0Var4 != null ? p4v0.a(p4v0Var4, null) : null;
                    cVar.S0 = null;
                }
                ike ikeVar = cVar.H0;
                pzt0 N = ikeVar != null ? tje.N(ikeVar, null, null, new ButtonsViewHolder$updateTranslatedState$1(a, cVar, null), 3) : null;
                rp3 rp3Var = cVar.M0;
                kgx kgxVar = v1[1];
                rp3Var.a(N);
                z = false;
                cVar.T0 = z;
                String str2 = cVar.Q0;
                boolean z5 = str2 == null && jl40.l(cVar.S0, str2);
                cVar.p1 = z5;
                p4v0Var = cVar.N0;
                if ((z2 != ((p4v0Var == null ? p4v0Var.b.length : 0) == 0) && z3 == z5 && z4 == cVar.T0) || (l7bVar = cVar.F0) == null) {
                    return;
                }
                l7bVar.invoke();
            }
            if (!a.equals(dcb.a)) {
                w511.b();
                return;
            }
            if (lqoVar.a(tz10.w)) {
                String str3 = cVar.Q0;
                p4v0 p4v0Var5 = cVar.N0;
                if (p4v0Var5 != null) {
                    Button[] buttonArr = p4v0Var5.b;
                    if (buttonArr != null) {
                        arrayList = new ArrayList(buttonArr.length);
                        for (Button button : buttonArr) {
                            arrayList.add("[" + str3 + "]: " + button.title);
                        }
                    }
                    p4v0Var3 = p4v0.a(p4v0Var5, arrayList);
                }
                cVar.N0 = p4v0Var3;
                cVar.S0 = str3;
            }
        }
        z = true;
        cVar.T0 = z;
        String str22 = cVar.Q0;
        if (str22 == null) {
        }
        cVar.p1 = z5;
        p4v0Var = cVar.N0;
        if (z2 != ((p4v0Var == null ? p4v0Var.b.length : 0) == 0)) {
        }
        l7bVar.invoke();
    }

    @Override // com.yandex.messaging.internal.view.timeline.e
    public final void f0() {
        ike ikeVar = this.H0;
        if (ikeVar != null) {
            bvf0.j(ikeVar, null);
        }
        this.H0 = null;
        kgx[] kgxVarArr = v1;
        kgx kgxVar = kgxVarArr[0];
        this.L0.a(null);
        kgx kgxVar2 = kgxVarArr[1];
        this.M0.a(null);
        this.Q0 = null;
        this.R0 = null;
        this.S0 = null;
        this.I0 = null;
        this.J0 = null;
        this.O0 = null;
        this.F0 = null;
        this.G0.removeAllViews();
        super.f0();
    }
}
