package xsna;

import androidx.fragment.app.Fragment;
import com.vk.superapp.api.dto.identity.WebIdentityCardData;

/* compiled from: VkIdentityListContract.kt */
/* loaded from: classes6.dex */
public final class d0v0 extends g4f0 implements fm6 {
    @Override // xsna.fm6
    public final boolean a0() {
        return false;
    }

    @Override // xsna.fm6
    public final void onDestroyView() {
        io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) this.c;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.fragment.app.Fragment, xsna.e0v0] */
    @Override // xsna.fm6
    public final void onStart() {
        WebIdentityCardData webIdentityCardData = (WebIdentityCardData) this.d;
        if (webIdentityCardData == null) {
            N3();
        } else {
            ((Fragment) this.b).I6(webIdentityCardData);
        }
    }

    @Override // xsna.fm6
    public final void d() {
    }

    @Override // xsna.fm6
    public final void onDestroy() {
    }

    @Override // xsna.fm6
    public final void onResume() {
    }
}
