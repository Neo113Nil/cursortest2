package com.ybsdk.feature.transfer.version2.internal.screens.me2me.confirm;

import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.core.navigation.cicerone.androidx.TransitionPolicyType;
import com.ybsdk.core.transfer.utils.domain.entities.UnconditionalLimitWidgetEntity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.Me2MeDebitResultFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.Me2MeDebitResultScreenParams;
import defpackage.ds31;
import defpackage.g8e;
import defpackage.gcq0;
import defpackage.gl1;
import defpackage.h791;
import defpackage.j3h;
import defpackage.jl01;
import defpackage.jl40;
import defpackage.l04;
import defpackage.l0p;
import defpackage.lm01;
import defpackage.pm01;
import defpackage.px11;
import defpackage.pz40;
import defpackage.qoi0;
import defpackage.r8j0;
import defpackage.ri01;
import defpackage.s8j0;
import defpackage.s910;
import defpackage.sl;
import defpackage.ssa1;
import defpackage.t8j0;
import defpackage.tc01;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.u8j0;
import defpackage.uc5;
import defpackage.w511;
import defpackage.ws00;
import defpackage.x4c;
import defpackage.yas;
import defpackage.zka1;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class a extends uc5 {
    public final j3h B;
    public final com.ybsdk.feature.transfer.version2.internal.screens.me2me.confirm.data.a C;
    public final TransferMe2MeConfirmScreenParams D;
    public final tfl0 E;
    public final com.ybsdk.feature.transfer.version2.internal.screens.a F;
    public final l04 G;

    public a(pm01 pm01Var, j3h j3hVar, com.ybsdk.feature.transfer.version2.internal.screens.me2me.confirm.data.a aVar, TransferMe2MeConfirmScreenParams transferMe2MeConfirmScreenParams, tfl0 tfl0Var, com.ybsdk.feature.transfer.version2.internal.screens.a aVar2, l04 l04Var) {
        super(new tc01(11), pm01Var);
        this.B = j3hVar;
        this.C = aVar;
        this.D = transferMe2MeConfirmScreenParams;
        this.E = tfl0Var;
        this.F = aVar2;
        this.G = l04Var;
        l04Var.a.I.a.a("me2me_pull_debit.screen.open", null);
    }

    public final void b0() {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, zka1.d((u8j0) value, new ri01(22))));
    }

    public final void c0() {
        u8j0 t8j0Var;
        Object obj;
        r0 r0Var;
        Object value;
        Object t8j0Var2;
        lm01 lm01Var = (lm01) ((u8j0) X()).a();
        if (lm01Var == null) {
            x4c.g("onBottomSheetPrimaryAction null bottomSheetState", null, null, null, 14);
            return;
        }
        u8j0 u8j0Var = (u8j0) X();
        if (u8j0Var instanceof r8j0) {
            r8j0 r8j0Var = (r8j0) u8j0Var;
            t8j0Var = new r8j0(((lm01) r8j0Var.a).c, r8j0Var.b, r8j0Var.c, r8j0Var.d);
        } else if (u8j0Var instanceof s8j0) {
            t8j0Var = new s8j0(((s8j0) u8j0Var).a);
        } else {
            if (!(u8j0Var instanceof t8j0)) {
                w511.b();
                return;
            }
            t8j0Var = new t8j0();
        }
        gcq0 gcq0Var = (gcq0) t8j0Var.a();
        if (gcq0Var == null) {
            x4c.g("onBottomSheetPrimaryAction null bottomSheetState", null, null, null, 14);
            return;
        }
        Iterator it = lm01Var.a.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            String str = ((gl1) obj).a;
            sl slVar = gcq0Var.a;
            if (jl40.l(str, slVar != null ? slVar.a : null)) {
                break;
            }
        }
        gl1 gl1Var = (gl1) obj;
        if (gl1Var == null) {
            x4c.g("Couldn't find me2me account in available accounts", null, null, null, 14);
            return;
        }
        l04 l04Var = this.G;
        l04Var.a.I.a.a("me2me_pull_debit.agreements.select.initiated2", g8e.w(1, "account", ssa1.b(gl1Var.a)));
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
            u8j0 u8j0Var2 = (u8j0) value;
            if (u8j0Var2 instanceof r8j0) {
                r8j0 r8j0Var2 = (r8j0) u8j0Var2;
                t8j0Var2 = new r8j0(lm01.a((lm01) r8j0Var2.a, gl1Var, null, 29), r8j0Var2.b, r8j0Var2.c, r8j0Var2.d);
            } else if (u8j0Var2 instanceof s8j0) {
                t8j0Var2 = new s8j0(((s8j0) u8j0Var2).a);
            } else {
                if (!(u8j0Var2 instanceof t8j0)) {
                    w511.b();
                    return;
                }
                t8j0Var2 = new t8j0();
            }
        } while (!r0Var.k(value, t8j0Var2));
        b0();
        UnconditionalLimitWidgetEntity unconditionalLimitWidgetEntity = gl1Var.i;
        if (unconditionalLimitWidgetEntity != null) {
            l04Var.a.I.a.a("me2me_pull_debit.widget.shown", g8e.w(1, "text", unconditionalLimitWidgetEntity.getDescription()));
        }
    }

    public final void d0() {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, new t8j0()));
    }

    public final void e0() {
        k0();
    }

    public final void f0(sl slVar) {
        u8j0 t8j0Var;
        r0 r0Var;
        Object value;
        u8j0 u8j0Var = (u8j0) X();
        if (u8j0Var instanceof r8j0) {
            r8j0 r8j0Var = (r8j0) u8j0Var;
            t8j0Var = new r8j0(((lm01) r8j0Var.a).c, r8j0Var.b, r8j0Var.c, r8j0Var.d);
        } else if (u8j0Var instanceof s8j0) {
            t8j0Var = new s8j0(((s8j0) u8j0Var).a);
        } else {
            if (!(u8j0Var instanceof t8j0)) {
                w511.b();
                return;
            }
            t8j0Var = new t8j0();
        }
        gcq0 gcq0Var = (gcq0) t8j0Var.a();
        if (gcq0Var == null) {
            x4c.g("onSelectedAccountChanged null state", null, null, null, 14);
            return;
        }
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, zka1.d((u8j0) value, new yas(gcq0Var, slVar, 1))));
    }

    public final void g0() {
        r0 r0Var;
        Object value;
        lm01 lm01Var = (lm01) ((u8j0) X()).a();
        if (lm01Var == null) {
            x4c.g("onToolbarClick null state", null, null, null, 14);
            return;
        }
        if (lm01Var.e) {
            List list = lm01Var.d;
            l0p l0pVar = this.G.a.I;
            l0pVar.a.a("me2me_pull_debit.agreements.click", g8e.w(1, "accounts", kotlin.collections.a.X(list, "\n", null, null, new ws00(15), 30)));
            pz40 Y = Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, zka1.d((u8j0) value, new jl01(2, lm01Var))));
        }
    }

    public final void h0() {
        u8j0 t8j0Var;
        String str;
        u8j0 u8j0Var = (u8j0) X();
        if (u8j0Var instanceof r8j0) {
            r8j0 r8j0Var = (r8j0) u8j0Var;
            t8j0Var = new r8j0(((lm01) r8j0Var.a).b, r8j0Var.b, r8j0Var.c, r8j0Var.d);
        } else if (u8j0Var instanceof s8j0) {
            t8j0Var = new s8j0(((s8j0) u8j0Var).a);
        } else {
            if (!(u8j0Var instanceof t8j0)) {
                w511.b();
                return;
            }
            t8j0Var = new t8j0();
        }
        gl1 gl1Var = (gl1) t8j0Var.a();
        if (gl1Var == null || (str = gl1Var.f) == null) {
            return;
        }
        h791.e(this.B, str, false, null, 14);
    }

    public final void i0() {
        k0();
    }

    public final void j0(px11 px11Var) {
        Text.Constant constant = px11Var.a;
        l04 l04Var = this.G;
        l0p l0pVar = l04Var.a.I;
        l0pVar.a.a("me2me_pull_debit.widget.click", g8e.w(1, "text", d.a(l04Var.b, constant).toString()));
        String str = px11Var.e;
        if (str != null) {
            h791.e(this.B, str, false, null, 14);
        }
    }

    public final void k0() {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, new t8j0()));
        tje.N(ds31.a(this), null, null, new TransferMe2MeConfirmViewModel$requestData$2(this, null), 3);
    }

    public final void l0() {
        s910 s910Var;
        gl1 gl1Var;
        String str;
        lm01 lm01Var = (lm01) ((u8j0) X()).a();
        if (lm01Var == null || (s910Var = lm01Var.a) == null) {
            return;
        }
        this.G.a.I.a.a("me2me_pull_debit.state.initiated", null);
        String permissionRequestId = this.D.getPermissionRequestId();
        lm01 lm01Var2 = (lm01) ((u8j0) X()).a();
        if (lm01Var2 == null || (gl1Var = lm01Var2.b) == null || (str = gl1Var.a) == null) {
            return;
        }
        Me2MeDebitResultScreenParams me2MeDebitResultScreenParams = new Me2MeDebitResultScreenParams(permissionRequestId, str, s910Var.e, s910Var.f, s910Var.a.c.a);
        this.F.getClass();
        this.E.l(new FragmentScreen("Me2MeDebitResultScreen", false, me2MeDebitResultScreenParams, TransitionPolicyType.DEFAULT, qoi0.a(Me2MeDebitResultFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 2, null));
    }
}
