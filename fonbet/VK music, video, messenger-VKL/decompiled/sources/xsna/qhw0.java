package xsna;

import android.content.Context;
import android.os.Looper;
import com.vk.core.voip.VoipCallSource;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import com.vk.log.L;
import com.vk.voip.api.id.CallId;
import com.vk.voip.api.join.JoinData;
import com.vk.voip.ui.join.directly.withpreview.JoinCallConfig;
import com.vk.voip.ui.join.directly.withpreview.JoinCallFragment;
import com.vkontakte.android.R;
import java.util.List;
import xsna.phw0;

/* compiled from: VoipCallRouterImpl.kt */
/* loaded from: classes11.dex */
public final class qhw0 implements phw0 {
    public final fhw0 a;

    public qhw0(fhw0 fhw0Var) {
        this.a = fhw0Var;
    }

    @Override // xsna.phw0
    public final void a(phw0.c cVar) {
        f(new tvs0(cVar, 6));
    }

    @Override // xsna.phw0
    public final void b(phw0.a aVar) {
        f(new srq0(aVar, 13));
    }

    @Override // xsna.phw0
    public final void c() {
        cvk.u(R.string.common_network_error, false);
    }

    @Override // xsna.phw0
    public final void d(phw0.d dVar) {
        ImageList f = dVar.f();
        List<Image> Ib = f != null ? f.Ib() : null;
        JoinData joinData = new JoinData(dVar.e(), dVar.b(), Ib != null ? new ImageList(Ib) : new ImageList(null, 1, null));
        CallId a = dVar.a();
        String i = dVar.i();
        JoinCallConfig.ConfigCallPreview configCallPreview = new JoinCallConfig.ConfigCallPreview(dVar.h(), dVar.b());
        VoipCallSource c = dVar.c();
        dVar.g().getClass();
        boolean a2 = dVar.g().a();
        dVar.g().getClass();
        JoinCallConfig joinCallConfig = new JoinCallConfig(i, configCallPreview, joinData, a, c, new JoinCallConfig.JoinAs(true, a2, true), dVar.g().c(), dVar.g().b());
        Context context = dVar.d().get();
        if (context != null) {
            int i2 = JoinCallFragment.U;
            JoinCallFragment.a.a(context, joinCallConfig);
        }
    }

    @Override // xsna.phw0
    public final void e(phw0.b bVar) {
        f(new rns0(bVar, 9));
    }

    public final void f(gzs gzsVar) {
        boolean isCurrentThread = Looper.getMainLooper().isCurrentThread();
        fhw0 fhw0Var = this.a;
        if (fhw0Var.isInitialized() && isCurrentThread) {
            gzsVar.invoke();
            return;
        }
        io.reactivex.rxjava3.kotlin.c.d(fhw0Var.a().o(asu0.a.d()), new utp(3, gzsVar), new wv2(L.a, 14));
    }
}
