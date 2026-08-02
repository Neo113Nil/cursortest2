package com.yandex.smartcamera.arscene;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.material.a;
import androidx.compose.runtime.f;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.r;
import androidx.fragment.app.Fragment;
import defpackage.an91;
import defpackage.azh0;
import defpackage.b64;
import defpackage.bj0;
import defpackage.bts;
import defpackage.c530;
import defpackage.cj6;
import defpackage.cma1;
import defpackage.did;
import defpackage.dx2;
import defpackage.f530;
import defpackage.fid;
import defpackage.i9a1;
import defpackage.j33;
import defpackage.jd00;
import defpackage.jl40;
import defpackage.k3r;
import defpackage.ljs0;
import defpackage.m33;
import defpackage.mhl0;
import defpackage.mw2;
import defpackage.n33;
import defpackage.o430;
import defpackage.ohd;
import defpackage.oyr;
import defpackage.pi6;
import defpackage.q0v;
import defpackage.q33;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.scc;
import defpackage.sls;
import defpackage.t33;
import defpackage.tfx;
import defpackage.tls;
import defpackage.v33;
import defpackage.wls;
import defpackage.wqy0;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.yx40;
import defpackage.z910;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0017¨\u0006\f²\u0006\n\u0010\r\u001a\u00020\u000eX\u008a\u008e\u0002"}, d2 = {"Lcom/yandex/smartcamera/arscene/ArFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "smartcam-arscene_release", "selectedBoxIndex", ""}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ArFragment extends Fragment {
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onCreateView$lambda$12$lambda$11(t33 t33Var, q33 q33Var, fid fidVar, int i) {
        if ((i & 3) == 2) {
            bts btsVar = (bts) fidVar;
            if (btsVar.E()) {
                btsVar.Y();
                return zy11.a;
            }
        }
        k3r k3rVar = ljs0.c;
        z910 d = pi6.d(x4c.b, false);
        int S = cma1.S(fidVar);
        bts btsVar2 = (bts) fidVar;
        r1b0 o = btsVar2.o();
        f530 d2 = b.d(fidVar, k3rVar);
        ohd.G1.getClass();
        sls slsVar = d.b;
        if (btsVar2.a == null) {
            cma1.b0();
            throw null;
        }
        btsVar2.i0();
        if (btsVar2.S) {
            btsVar2.n(slsVar);
        } else {
            btsVar2.r0();
        }
        qje.W(fidVar, d.f, d);
        qje.W(fidVar, d.e, o);
        wls wlsVar = d.g;
        if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(S))) {
            b64.z(S, btsVar2, S, wlsVar);
        }
        qje.W(fidVar, d.d, d2);
        Object Q = btsVar2.Q();
        o430 o430Var = did.a;
        if (Q == o430Var) {
            Q = f.g(0);
            btsVar2.o0(Q);
        }
        yx40 yx40Var = (yx40) Q;
        int intValue = yx40Var.getIntValue();
        Object Q2 = btsVar2.Q();
        int i2 = 1;
        if (Q2 == o430Var) {
            Q2 = new dx2(yx40Var, i2);
            btsVar2.o0(Q2);
        }
        tls tlsVar = (tls) Q2;
        boolean k = btsVar2.k(q33Var);
        Object Q3 = btsVar2.Q();
        if (k || Q3 == o430Var) {
            ArFragment$onCreateView$1$1$1$2$1 arFragment$onCreateView$1$1$1$2$1 = new ArFragment$onCreateView$1$1$1$2$1(0, q33Var, q33.class, "onObjectPlaced", "onObjectPlaced()V", 0);
            btsVar2.o0(arFragment$onCreateView$1$1$1$2$1);
            Q3 = arFragment$onCreateView$1$1$1$2$1;
        }
        jd00.a(t33Var, intValue, tlsVar, (sls) ((tfx) Q3), fidVar, 384);
        f530 d3 = i9a1.d(an91.o(cj6.a.a(c530.a, x4c.A), 0.0f, 0.0f, 0.0f, 50.0f, 7));
        boolean e = fidVar.e(t33Var);
        Object Q4 = btsVar2.Q();
        if (e || Q4 == o430Var) {
            Q4 = new mw2(i2, yx40Var, t33Var);
            btsVar2.o0(Q4);
        }
        a.a((sls) Q4, d3, false, null, null, null, null, wwg.S(1295348353, true, new bj0(13, yx40Var), fidVar), fidVar, 805306368, 508);
        btsVar2.t(true);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onCreateView$lambda$12$lambda$11$lambda$10$lambda$4$lambda$3(yx40 yx40Var, int i) {
        yx40Var.setIntValue(i);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onCreateView$lambda$12$lambda$11$lambda$10$lambda$8$lambda$7(yx40 yx40Var, t33 t33Var) {
        int intValue = yx40Var.getIntValue() + 1;
        Integer valueOf = Integer.valueOf(intValue);
        if (intValue >= t33Var.a.a.size()) {
            valueOf = null;
        }
        yx40Var.setIntValue(valueOf != null ? valueOf.intValue() : 0);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onCreateView$lambda$12$lambda$11$lambda$10$lambda$9(yx40 yx40Var, mhl0 mhl0Var, fid fidVar, int i) {
        if ((i & 17) == 16) {
            bts btsVar = (bts) fidVar;
            if (btsVar.E()) {
                btsVar.Y();
                return zy11.a;
            }
        }
        wqy0.b(oyr.j(yx40Var.getIntValue(), "Box index: ", ". Click to change"), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, fidVar, 0, 0, 131070);
        return zy11.a;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        t33 t33Var = new t33(new n33(scc.g(new j33("S", new m33(10.0f, 15.0f, 15.0f)), new j33("M", new m33(15.0f, 20.0f, 25.0f)), new j33("L", new m33(30.0f, 40.0f, 70.0f)))), new v33(getString(azh0.smartcamera_ar_hint_searching_for_planes)));
        q33 q33Var = new q33();
        ComposeView composeView = new ComposeView(requireContext(), null, 0, 6, null);
        composeView.setViewCompositionStrategy(r.c);
        composeView.setContent(new androidx.compose.runtime.internal.a(313300747, new q0v(15, t33Var, q33Var), true));
        return composeView;
    }
}
