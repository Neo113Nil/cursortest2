package xsna;

import com.vk.odnoklassniki.heads.di.OkHeadsComponent;
import com.vk.tabbar.settings.impl.di.TabbarSettingsComponentImpl;
import com.vk.toggle.features.CoreFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vk.voip.di.VoipCallComponentImpl;
import com.vkontakte.android.VKApplication;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import xsna.nx50;
import xsna.q5o0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class gbl implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gbl(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        boolean z = false;
        z = false;
        switch (this.b) {
            case 0:
                return ((OkHeadsComponent) m7m.a(((com.vk.auth.b) this.c).a).mo408a(fpf0.a(OkHeadsComponent.class))).s6();
            case 1:
                return (Map) ((sp40) this.c).d.getValue();
            case 2:
                nx50 nx50Var = (nx50) this.c;
                LinkedHashMap linkedHashMap = nx50.Q0;
                if (!p1p0.a(com.vk.toggle.b.A.i(CoreFeatures.DO_NOT_KILL_ROOT_FRAGMENTS))) {
                    return new com.vk.core.fragments.b(nx50Var.p, nx50.a.a(nx50Var.E0()), nx50Var, nx50Var.q);
                }
                vbs vbsVar = nx50Var.p;
                ArrayList a = nx50.a.a(nx50Var.E0());
                xsn b = com.vk.toggle.d.o.b();
                if (b == null) {
                    xsn.b.getClass();
                    b = xsn.c;
                }
                return new com.vk.core.fragments.e(vbsVar, a, b.a, nx50Var, nx50Var.q);
            case 3:
                return new xwn0(((TabbarSettingsComponentImpl) this.c).b.md());
            case 4:
                ExecutorService k = ((q5o0) this.c).k(new pep0(hre0.a(null)));
                io.reactivex.rxjava3.core.w wVar = io.reactivex.rxjava3.schedulers.a.a;
                return new q5o0.c(k, new io.reactivex.rxjava3.internal.schedulers.d(k, true));
            case 5:
                v94 v94Var = (v94) this.c;
                VKApplication.a aVar = VKApplication.c;
                asu0.a.getClass();
                asu0.n().submit(new t7r0(v94Var, z ? 1 : 0));
                return s3q0.a;
            case 6:
                VKApplication vKApplication = (VKApplication) this.c;
                VKApplication.a aVar2 = VKApplication.c;
                hjv.a.getClass();
                t260 t260Var = hjv.g;
                if (t260Var != null && t260Var.j.b) {
                    boolean z2 = t260Var.i.a;
                    w0f w0fVar = new w0f(10);
                    synchronized (gau.a) {
                        gau.b = new rnk0(new n560(vKApplication), w0fVar, z2);
                    }
                }
                return s3q0.a;
            case 7:
                if (((qks0) this.c).b) {
                    VideoFeatures videoFeatures = VideoFeatures.VK_VIDEO_RIGHT_PROMO_FULLSCREEN;
                    videoFeatures.getClass();
                    if (com.vk.toggle.b.A.a(videoFeatures)) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            default:
                return new qhw0(((VoipCallComponentImpl) this.c).b.getValue());
        }
    }

    public /* synthetic */ gbl(q5o0 q5o0Var, p5o0 p5o0Var) {
        this.b = 4;
        this.c = q5o0Var;
    }
}
