package xsna;

import android.net.Uri;
import android.os.Bundle;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.clips.design.view.QRSharingView;
import com.vk.photos.ui.album_list.AlbumsListFragment;
import com.vk.profile.provider.di.ProfileFragmentProviderComponent;
import com.vk.toggle.anonymous.SakFeatures;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class no1 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ no1(Object obj, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        boolean z = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                qo1 qo1Var = (qo1) obj2;
                Throwable th = (Throwable) obj;
                if (!z) {
                    AlbumsListFragment albumsListFragment = qo1Var.b;
                    if (th instanceof VKApiExecutionException) {
                        VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th;
                        if (vKApiExecutionException.T() && SakFeatures.Type.NEW_GEOBLOCK_ERROR.h()) {
                            Bundle w = vKApiExecutionException.w();
                            long j = w != null ? w.getLong("owner_id") : 0L;
                            if (j != 0) {
                                ProfileFragmentProviderComponent profileFragmentProviderComponent = (ProfileFragmentProviderComponent) m7m.d(albumsListFragment).a(fpf0.a(ProfileFragmentProviderComponent.class));
                                ProfileFragmentProviderComponent.Companion companion = ProfileFragmentProviderComponent.Companion;
                                profileFragmentProviderComponent.E7(j).l(albumsListFragment);
                                albumsListFragment.finish();
                                s3q0 s3q0Var = s3q0.a;
                            }
                        }
                    }
                    aq2 aq2Var = albumsListFragment.T;
                    if (aq2Var == null) {
                        aq2Var = null;
                    }
                    aq2Var.g0();
                }
                break;
            case 1:
                ((mdg) obj2).S7((Throwable) obj, z);
                break;
            case 2:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.q(tgi0Var, (String) obj2);
                qgi0.r(tgi0Var, z ? "equalizerSwitcherOn" : "equalizerSwitcherOff");
                break;
            default:
                QRSharingView qRSharingView = (QRSharingView) obj2;
                Uri uri = (Uri) obj;
                qRSharingView.d = uri;
                if (z) {
                    nr4.b().D(qRSharingView.getContext(), uri.toString());
                    gzs<s3q0> gzsVar = qRSharingView.e;
                    if (gzsVar != null) {
                        gzsVar.invoke();
                    }
                } else {
                    cvk.u(R.string.qr_saved, false);
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ no1(boolean z, qo1 qo1Var) {
        this.b = 0;
        this.c = z;
        this.d = qo1Var;
    }
}
