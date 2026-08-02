package xsna;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.apps.BuildInfo;
import com.vk.core.files.ExternalDirType;
import com.vk.core.preference.Preference;
import xsna.t4p;

/* compiled from: GalleryImageViewerImpl.kt */
/* loaded from: classes15.dex */
public final class m4t implements t4p {
    public final /* synthetic */ o4t a;
    public final /* synthetic */ String b;

    public m4t(o4t o4tVar, String str) {
        this.a = o4tVar;
        this.b = str;
    }

    @Override // xsna.t4p
    public final void a(t4p.a aVar) {
        o4t o4tVar = this.a;
        FragmentActivity fragmentActivity = o4tVar.a;
        fragmentActivity.setRequestedOrientation(-1);
        if (epx.f(this.b, "SystemCameraInteractor")) {
            boolean z = true;
            if (BuildInfo.t() || BuildInfo.s()) {
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                z = Preference.g(context).getBoolean("saveProcessedImage", true);
            }
            if (!z && o4tVar.q && (aVar instanceof t4p.a.b)) {
                io.reactivex.rxjava3.internal.operators.single.f0 c = com.vk.core.files.b.c(new com.vk.core.files.b(fragmentActivity), com.vk.core.files.a.i(fragmentActivity, ((t4p.a.b) aVar).a.f()), ExternalDirType.IMAGES, 4);
                int i = kwg0.a;
                itg0.a(fragmentActivity, c.subscribe(new iwg0(), new hwg0()));
            }
        }
    }

    @Override // xsna.t4p
    public final boolean b() {
        return true;
    }
}
