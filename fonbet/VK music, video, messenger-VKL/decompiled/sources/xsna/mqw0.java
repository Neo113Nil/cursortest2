package xsna;

import android.content.Context;
import android.os.Handler;
import com.vk.core.apps.BuildInfo;
import com.vk.log.L;
import com.vk.ml.MLFeatures;
import com.vk.ml.api.tf.TensorflowFacade;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.ui.VoipStatManager;
import com.vk.voip.ui.groupcalls.GroupCallViewModel;
import com.vk.voip.ui.members.VoipDataProvider;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.functions.b;
import java.util.List;
import java.util.Locale;
import xsna.bnw0;
import xsna.hg1;
import xsna.v2x0;

/* compiled from: VoipInitializer.kt */
/* loaded from: classes7.dex */
public final class mqw0 {
    public static final mqw0 a = new mqw0();
    public static boolean b;

    public final void a(Context context) {
        cnw0 cnw0Var;
        ysg0<Object> ysg0Var;
        a.q qVar;
        b.a aVar;
        asu0 asu0Var;
        Context context2;
        xkg xkgVar = xkg.a;
        L.e("VoipInitializer init");
        if (b) {
            return;
        }
        b = true;
        g2v.c().getClass();
        g2v.c().getClass();
        boolean g = BuildInfo.g();
        io.reactivex.rxjava3.internal.observers.d<String> dVar = x5m.a;
        new io.reactivex.rxjava3.internal.operators.single.v(new t72(3, context.getFilesDir(), new pm60(20))).q(io.reactivex.rxjava3.schedulers.a.b()).subscribe(x5m.a);
        c2f0 c2f0Var = new c2f0();
        List<MLFeatures.MLFeature> list = o570.a;
        jx40 jx40Var = new jx40(0, o25.a(), b25.class, "isLoggedIn", "isLoggedIn()Z", 0, 3);
        z9o0 z9o0Var = xkg.b;
        c39 c39Var = new c39(jx40Var, z9o0Var, new jms(0, z9o0Var, TensorflowFacade.class, "isVoipGesturesEnabled", "isVoipGesturesEnabled()Z", 1));
        krw0 krw0Var = new krw0(new t6c0(23), new rme0(c39Var, new x8w0()));
        com.vk.voip.call_effects.a aVar2 = new com.vk.voip.call_effects.a(new d1d(0, o25.a(), b25.class, "isLoggedIn", "isLoggedIn()Z", 0, 1), c39Var, krw0Var, z9o0Var);
        m570 m570Var = new m570(krw0Var, new ufm0(12), new i8c0(13));
        jqw0 jqw0Var = new jqw0(true, false, g);
        a000 a000Var = new a000(context);
        c1w0 c1w0Var = new c1w0(context, a000Var, new lqw0());
        b1w0 b1w0Var = c1w0Var.b;
        vx2.a.getClass();
        d1w0 d1w0Var = new d1w0(vx2.b());
        lmc lmcVar = new lmc();
        fq4 fq4Var = new fq4(a000Var, a000Var);
        kqw0 kqw0Var = new kqw0();
        qr2 qr2Var = new qr2(new za9());
        bnw0.b bVar = new bnw0.b(d1w0Var, lmcVar, aVar2, fq4Var, kqw0Var, qr2Var, m570Var, b1w0Var);
        Handler handler = bnw0.a;
        cnw0 cnw0Var2 = new cnw0(new bnw0.a(new hyd0(13), new im80(18), new buc0(24), new uh80(16), new bnw0.c(new vxl0(10), new ifv0(2), new bzq0(5))), bVar);
        com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
        cVar.getClass();
        L.A("VoipViewModel", "doInit");
        if (com.vk.voip.ui.c.c1) {
            cnw0Var = cnw0Var2;
        } else {
            com.vk.voip.ui.c.p.getClass();
            Context context3 = e43.a;
            com.vk.voip.ui.c.b1 = new i9e0(context3 != null ? context3 : null);
            com.vk.voip.ui.a aVar3 = com.vk.voip.ui.a.a;
            i9e0 i9e0Var = com.vk.voip.ui.c.b1;
            if (i9e0Var == null) {
                i9e0Var = null;
            }
            aVar3.getClass();
            com.vk.voip.ui.a.e = i9e0Var;
            ysg0<Object> ysg0Var2 = ysg0.b;
            com.vk.voip.ui.c.e.b(ysg0Var2.a.a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new tgl(), new eeh0(new r8(com.vk.metrics.eventtracking.b.a, 12), 20)));
            VoipStatManager.StatData statData = VoipStatManager.a;
            ysg0Var2.a.b0(fjw0.class).subscribe(new jgs0(new jvl0(12), 6));
            io.reactivex.rxjava3.subjects.f<Object> fVar = ysg0Var2.a;
            fVar.b0(h3x0.class).subscribe(new pd40(new d230(26), 23));
            fVar.b0(ab80.class).subscribe(new k6w0(new wx30(24), 1));
            fVar.b0(ra80.class).subscribe(new gyq0(new rgl0(16), 6));
            cVar.getClass();
            io.reactivex.rxjava3.internal.operators.observable.j1 U = com.vk.voip.ui.c.h0().b.U(new zzq0(new k4x0(1)));
            a.q qVar2 = io.reactivex.rxjava3.internal.functions.a.a;
            b.a aVar4 = io.reactivex.rxjava3.internal.functions.b.a;
            cnw0Var = cnw0Var2;
            new io.reactivex.rxjava3.internal.operators.observable.y(U, qVar2, aVar4).subscribe(new h8l0(new fyi0(15), 13));
            com.vk.voip.ui.c.f0 = new ssw(new upj());
            io.reactivex.rxjava3.subjects.f<Object> fVar2 = ysg0Var2.a;
            hg1.y4 y4Var = new hg1.y4(qg5.e);
            fVar2.getClass();
            io.reactivex.rxjava3.internal.operators.observable.i0 i0Var = new io.reactivex.rxjava3.internal.operators.observable.i0(fVar2, y4Var);
            ssw sswVar = com.vk.voip.ui.c.f0;
            if (sswVar != null) {
                sswVar.b = new io.reactivex.rxjava3.internal.operators.observable.y(i0Var.a0(asu0.a.d()), qVar2, aVar4).subscribe(new hmq0(new e0w0(sswVar, 6), 13));
            }
            com.vk.voip.ui.c.c1 = true;
        }
        GroupCallViewModel.b.getClass();
        if (GroupCallViewModel.c == null) {
            GroupCallViewModel.c = ysg0.b.a.a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new atb());
        }
        OKVoipEngine oKVoipEngine = OKVoipEngine.b;
        oKVoipEngine.getClass();
        OKVoipEngine.v = cnw0Var;
        oKVoipEngine.w();
        new0 new0Var = oew0.a;
        new0Var.c = io.reactivex.rxjava3.kotlin.c.f(2, new0Var.a.b0(chw0.class).a0(io.reactivex.rxjava3.android.schedulers.a.b()), null, new wep0(9), new ftu0(new0Var, 4));
        r99 r99Var = r99.a;
        a1w a1wVar = q1w.a;
        if (a1wVar == null) {
            a1wVar = null;
        }
        synchronized (r99Var) {
            if (r99.b) {
                throw new IllegalStateException("Already inited");
            }
            r99.b = true;
            r99.c = context.getApplicationContext();
            r99.d = a1wVar;
            ysg0Var = ysg0.b;
            io.reactivex.rxjava3.internal.operators.observable.j1 U2 = ysg0Var.a.b0(fjw0.class).U(new kr(new xr0(5), 8)).p0(com.vk.voip.ui.c.K0).U(new d22(new z13(2), 6));
            qVar = io.reactivex.rxjava3.internal.functions.a.a;
            aVar = io.reactivex.rxjava3.internal.functions.b.a;
            io.reactivex.rxjava3.internal.operators.observable.y yVar = new io.reactivex.rxjava3.internal.operators.observable.y(U2, qVar, aVar);
            asu0Var = asu0.a;
            asu0Var.getClass();
            r99.h = io.reactivex.rxjava3.kotlin.c.f(3, yVar.a0(asu0.i()), null, null, new io3(2));
        }
        se8 se8Var = new se8(vx2.b(), new w1i(0, this, mqw0.class, "shouldUseContactNames", "shouldUseContactNames()Z", 0, 3));
        synchronized (zjq.b) {
            if (zjq.e) {
                throw new IllegalStateException("Already inited");
            }
            zjq.c = se8Var;
            zjq.e = true;
        }
        synchronized (ad0.c) {
            if (ad0.f) {
                throw new IllegalStateException("Already inited");
            }
            ad0.d = se8Var;
            ad0.f = true;
        }
        wwf0.g = c1w0Var;
        int i = 9;
        v2x0 v2x0Var = new v2x0(new e1w0(), c2f0Var, d1w0Var, lmcVar, fq4Var, new bbv(o25.a()), new v2x0.a(m570Var, qr2Var, aVar2, new vpn0(krw0Var, 18)));
        u2x0 u2x0Var = new u2x0(new jzm0(11), new vqe0(16), new chr0(i), new chr0(i), new chr0(i), new kt4(0, this, mqw0.class, "shouldUseContactNames", "shouldUseContactNames()Z", 0, 4), new bem0(8), jqw0Var, new chr0(i), kqw0Var, new mnh0(), new chr0(i), new f1w0(context), new chr0(i));
        synchronized (cVar) {
            L.A("VoipViewModel", "init");
            com.vk.voip.ui.c.r0 = v2x0Var;
            com.vk.voip.ui.c.s0 = u2x0Var;
            com.vk.voip.ui.c.J().j(new l4x0());
            com.vk.voip.ui.c.S = new nav(new f7q0(10));
            OKVoipEngine oKVoipEngine2 = com.vk.voip.ui.c.r;
            oKVoipEngine2.getClass();
            OKVoipEngine.k.c.a(cVar);
            kcx0 k0 = com.vk.voip.ui.c.k0();
            if (((Boolean) k0.b.invoke()).booleanValue()) {
                context2 = null;
                io.reactivex.rxjava3.kotlin.c.f(3, k0.a.a0(asu0Var.d()), null, null, new obt0(3, k0.c.h(), k0));
            } else {
                context2 = null;
            }
            com.vk.voip.ui.c.d0 = new VoipDataProvider("VOIP_CALL".toLowerCase(Locale.ROOT), oKVoipEngine2, new VoipDataProvider.a(new gwd0(18), new s8(cVar, 19), com.vk.voip.ui.c.s0.g, new vqf0(17), new eu2(18)), new VoipDataProvider.c(a201.b().e(), new nt8(com.vk.voip.ui.c.k0), com.vk.voip.ui.c.j, com.vk.voip.ui.c.n0));
            com.vk.voip.ui.c.e0 = new com.vk.voip.ui.actions.feature.c(new rd9(), a201.b().e(), new pd9(com.vk.voip.ui.c.J()), oKVoipEngine2);
            ofy0 ofy0Var = new ofy0(com.vk.voip.ui.c.p0, 3);
            com.vk.voip.ui.c.V = ofy0Var;
            com.vk.voip.ui.c.W = new fw6(ofy0Var, new hw6(oKVoipEngine, cVar), new e0a(com.vk.voip.ui.c.j0()), com.vk.voip.ui.c.M0(), new wqf0(15));
            com.vk.voip.ui.c.p.getClass();
            Context context4 = e43.a;
            com.vk.voip.ui.c.g = new rah0(com.vk.voip.ui.c.j0(), oKVoipEngine2, context4 != null ? context4 : context2, new j1t0(5), asu0Var);
        }
        ysg0<Object> ysg0Var3 = ysg0.b;
        int i2 = 13;
        ysg0Var.a.b0(fjw0.class).subscribe(new wvq0(new udk0(i), i2));
        atw0.a.getClass();
        ysg0<Object> ysg0Var4 = ysg0.b;
        ysg0Var.a.b0(fjw0.class).subscribe(new j7l0(new g1s0(7), i2));
        ysg0<Object> ysg0Var5 = ysg0.b;
        new io.reactivex.rxjava3.internal.operators.observable.y(ysg0Var.a.b0(fjw0.class).U(new ky80(new fyo0(10), i2)).p0(com.vk.voip.ui.c.K0).U(new nh40(new gxj0(14), 26)), qVar, aVar).a0(asu0Var.c()).subscribe(new h2t0(new iqw0(0), 3));
    }
}
