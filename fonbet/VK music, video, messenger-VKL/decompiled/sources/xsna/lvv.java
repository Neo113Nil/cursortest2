package xsna;

import androidx.fragment.app.Fragment;
import com.vk.superapp.api.dto.identity.WebIdentityCardData;

/* compiled from: IdentityListContract.kt */
/* loaded from: classes2.dex */
public final class lvv extends g4f0 implements gm6 {
    @Override // xsna.gm6
    public final boolean a0() {
        return false;
    }

    @Override // xsna.gm6
    public final void onDestroyView() {
        io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) this.c;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.fragment.app.Fragment, xsna.e0v0] */
    @Override // xsna.gm6
    public final void onStart() {
        WebIdentityCardData webIdentityCardData = (WebIdentityCardData) this.d;
        if (webIdentityCardData == null) {
            N3();
        } else {
            ((Fragment) this.b).I6(webIdentityCardData);
        }
    }

    @Override // xsna.gm6
    public final void d() {
    }

    @Override // xsna.cc6
    public final void onDestroy() {
    }

    @Override // xsna.cc6
    public final void onPause() {
    }

    @Override // xsna.cc6
    public final void onResume() {
    }

    @Override // xsna.gm6
    public final void onStop() {
    }
}
