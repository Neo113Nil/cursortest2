package xsna;

import android.app.Activity;
import android.app.Application;
import androidx.appcompat.app.AppCompatActivity;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.util.parallelrunner.ParallelTaskRunner;
import com.vk.toggle.features.CoreFeatures;
import com.vkontakte.android.VKApplication;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import xsna.bxi;
import xsna.f6q0;

/* compiled from: UnstableNetworkDetectorInitTaskLogic.kt */
/* loaded from: classes11.dex */
public final class i6q0 extends ParallelTaskRunner.d {
    public final bpn0 c;

    public i6q0(VKApplication vKApplication) {
        super(vKApplication);
        this.c = new bpn0(new fr6(vKApplication, 17));
    }

    @Override // com.vk.core.util.parallelrunner.ParallelTaskRunner.d
    public final String a() {
        return "UnstableNetDetectInit";
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        bxi.a aVar;
        CoreFeatures coreFeatures = CoreFeatures.KBH_DETECT;
        coreFeatures.getClass();
        if (com.vk.toggle.b.A.a(coreFeatures)) {
            f6q0 b = com.vk.toggle.d.H0.b();
            if (b == null) {
                f6q0.l.getClass();
                b = f6q0.m;
            }
            f6q0.b bVar = b.a;
            c63 c63Var = c63.a;
            Activity b2 = c63.b();
            AppCompatActivity appCompatActivity = b2 instanceof AppCompatActivity ? (AppCompatActivity) b2 : null;
            b8u0 b8u0Var = new b8u0();
            d6q0.a(b8u0Var);
            Application application = this.b;
            q1p0 q1p0Var = new q1p0(application);
            asu0.a.getClass();
            ExecutorService n = asu0.n();
            if (bVar != null) {
                String c = bVar.c();
                String e = bVar.e();
                String d = bVar.d();
                f6q0.b.a a = bVar.a();
                String b3 = a != null ? a.b() : null;
                f6q0.b.a a2 = bVar.a();
                bxi.a.C2631a c2631a = new bxi.a.C2631a(b3, a2 != null ? a2.a() : null);
                f6q0.b.a b4 = bVar.b();
                String b5 = b4 != null ? b4.b() : null;
                f6q0.b.a b6 = bVar.b();
                aVar = new bxi.a(c, e, d, c2631a, new bxi.a.C2631a(b5, b6 != null ? b6.a() : null));
            } else {
                aVar = null;
            }
            LinkedHashSet k = izi0.k(izi0.j(izi0.j(izi0.j(izi0.j(j5g.S0(b.b), sn60.a()), uqs0.a()), ktl0.a()), vew.a()), "MINI_APP_INTERNAL".toLowerCase(Locale.ROOT));
            g6q0 g6q0Var = new g6q0();
            bxi bxiVar = new bxi(application, q1p0Var, n, new yo20(this), aVar, new pxv(this, 8), new f370(15), new pni0(1), k, b.i, new jcw(this, b), g6q0Var, b.f, b.g, b.h, b.j, b.k, new dr6(14));
            UiTracker uiTracker = UiTracker.a;
            d6q0.e(bxiVar, new nhp0(UiTracker.d()), appCompatActivity);
            UiTracker.a(new h6q0());
            hew.b.D(new er6(11), b8u0Var, new f370(15), appCompatActivity);
        }
        return s3q0.a;
    }
}
