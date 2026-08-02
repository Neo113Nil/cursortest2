package xsna;

import android.app.Activity;
import android.view.View;
import com.vk.core.ui.bottomsheet.internal.BottomSheetBehaviourExt;
import com.vk.dto.attaches.AttachMap;
import com.vk.im.engine.models.messages.MsgSendSource;
import java.util.Collections;
import xsna.nxz;
import xsna.tha0;

/* compiled from: LocationState.kt */
/* loaded from: classes2.dex */
public final class zyz extends sia0 {
    public final Activity d;
    public final tha0.a e;
    public final xia0 f;
    public final bpn0 g;

    /* compiled from: LocationState.kt */
    public final class a implements nxz.a {
        public a() {
        }

        @Override // xsna.nxz.a
        public final void N() {
            xia0 xia0Var = zyz.this.f;
            xia0Var.getClass();
            xia0Var.n = new nh3(22, (Object) null, xia0Var);
            d98 d98Var = xia0Var.l;
            if (d98Var != null) {
                BottomSheetBehaviourExt<View> bottomSheetBehaviourExt = d98Var.g;
                if (bottomSheetBehaviourExt.M == 3) {
                    d98Var.a.B0(1.0f);
                } else {
                    bottomSheetBehaviourExt.X(3);
                }
            }
        }

        @Override // xsna.nxz.a
        public final void b() {
            d98 d98Var = zyz.this.f.l;
            if (d98Var != null) {
                d98Var.e(false);
            }
        }

        @Override // xsna.nxz.a
        public final void c() {
            d98 d98Var = zyz.this.f.l;
            if (d98Var != null) {
                d98Var.e(true);
            }
        }

        @Override // xsna.nxz.a
        public final void d(AttachMap attachMap, View view) {
            zyz.this.e.getClass();
            Collections.singletonList(attachMap);
            tha0.a.C3744a c3744a = tha0.a.a;
        }

        @Override // xsna.nxz.a
        public final void e() {
            zyz zyzVar = zyz.this;
            xia0 xia0Var = zyzVar.f;
            h2s h2sVar = new h2s(zyzVar, 10);
            xia0Var.getClass();
            xia0Var.n = new nh3(22, h2sVar, xia0Var);
            d98 d98Var = xia0Var.l;
            if (d98Var != null) {
                BottomSheetBehaviourExt<View> bottomSheetBehaviourExt = d98Var.g;
                if (bottomSheetBehaviourExt.M == 3) {
                    d98Var.a.B0(1.0f);
                } else {
                    bottomSheetBehaviourExt.X(3);
                }
            }
        }

        @Override // xsna.nxz.a
        public final void f(AttachMap attachMap) {
            zyz zyzVar = zyz.this;
            xia0 xia0Var = zyzVar.f;
            xia0Var.m = new fqd(6, zyzVar, attachMap);
            xia0Var.q.removeCallbacksAndMessages(null);
            d98 d98Var = xia0Var.l;
            if (d98Var != null) {
                d98Var.g.X(5);
            }
        }
    }

    public zyz(Activity activity, tha0.a aVar, xia0 xia0Var, String str, MsgSendSource.b bVar, kkm kkmVar) {
        super(str, bVar);
        this.d = activity;
        this.e = aVar;
        this.f = xia0Var;
        this.g = new bpn0(new com.vk.movika.tools.controls.seekbar.f(14, this, kkmVar));
    }

    @Override // xsna.sia0
    public final void a() {
        h().H0();
    }

    @Override // xsna.sia0
    public final int b(int i) {
        return Math.max(i, iah0.u() / 2);
    }

    @Override // xsna.sia0
    public final boolean c() {
        return h().d;
    }

    @Override // xsna.sia0
    public final void d(float f) {
        h().k.c(f);
    }

    @Override // xsna.sia0
    public final void e(CharSequence charSequence) {
        h().d1(charSequence);
    }

    @Override // xsna.sia0
    public final void f() {
        h().V0();
    }

    @Override // xsna.sia0
    public final void g() {
        h().W0();
    }

    public final nxz h() {
        return (nxz) this.g.getValue();
    }
}
