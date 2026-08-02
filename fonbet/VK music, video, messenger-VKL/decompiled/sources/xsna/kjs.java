package xsna;

import android.os.Bundle;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.content.design.view.camera.MasksWrap;
import com.vk.documents.impl.SearchDocumentsListFragment;
import com.vk.friends.requests.impl.requests.presentation.FriendRequestsFragment;
import com.vk.log.L;
import com.vk.profile.provider.di.ProfileFragmentProviderComponent;
import com.vk.toggle.anonymous.SakFeatures;
import com.vk.video.ui.edit.fragments.VideoAlbumEditorFragment;
import com.vkontakte.android.R;
import xsna.odg0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class kjs implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kjs(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                int i2 = FriendRequestsFragment.d0;
                ((l2k) obj2).invoke(obj);
                break;
            case 1:
                ((rw) obj2).invoke(obj);
                break;
            case 2:
                ((mh4) obj2).invoke(obj);
                break;
            case 3:
                int i3 = MasksWrap.e0;
                ((d2y) obj2).invoke(obj);
                break;
            case 4:
                ((vs6) obj2).invoke(obj);
                break;
            case 5:
                ((mi10) obj2).invoke(obj);
                break;
            case 6:
                ((mi10) obj2).invoke(obj);
                break;
            case 7:
                ((qc60) obj2).invoke(obj);
                break;
            case 8:
                ((mi10) obj2).invoke(obj);
                break;
            case 9:
                ((mh4) obj2).invoke(obj);
                break;
            case 10:
                ((u4u) obj2).invoke(obj);
                break;
            case 11:
                ((mh4) obj2).invoke(obj);
                break;
            case 12:
                ((mgz) obj2).invoke(obj);
                break;
            case 13:
                ((q1) obj2).invoke(obj);
                break;
            case 14:
                ((mi10) obj2).invoke(obj);
                break;
            case 15:
                ((mi10) obj2).invoke(obj);
                break;
            case 16:
                ((odg0.d) obj2).invoke(obj);
                break;
            case 17:
                ((ttg0) obj2).invoke(obj);
                break;
            case 18:
                int i4 = SearchDocumentsListFragment.h0;
                ((mi10) obj2).invoke(obj);
                break;
            case 19:
                ((mi10) obj2).invoke(obj);
                break;
            case 20:
                ((hwi0) obj2).invoke(obj);
                break;
            case 21:
                ((mi10) obj2).invoke(obj);
                break;
            case 22:
                ((j9e0) obj2).invoke(obj);
                break;
            case 23:
                com.vk.story.viewer.impl.presentation.stories.b bVar = (com.vk.story.viewer.impl.presentation.stories.b) obj2;
                Throwable th = (Throwable) obj;
                L.i(th);
                if (th instanceof VKApiExecutionException) {
                    VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th;
                    if (vKApiExecutionException.T() && SakFeatures.Type.NEW_GEOBLOCK_ERROR.h()) {
                        Bundle w = vKApiExecutionException.w();
                        long j = w != null ? w.getLong("owner_id") : 0L;
                        if (j != 0) {
                            ((ProfileFragmentProviderComponent) j6i.b(m7m.f(bVar), ProfileFragmentProviderComponent.class)).E7(j).k(bVar.getContext());
                            s3q0 s3q0Var = s3q0.a;
                        }
                        bVar.finish();
                        break;
                    }
                }
                cmf0.a.c(bVar.getContext(), bVar.l0, R.string.narrative_loading_error);
                bVar.finish();
                break;
            case 24:
                ((cim0) obj2).invoke(obj);
                break;
            case 25:
                ((cim0) obj2).invoke(obj);
                break;
            case 26:
                int i5 = VideoAlbumEditorFragment.l0;
                ((hwi0) obj2).invoke(obj);
                break;
            case 27:
                ((cim0) obj2).invoke(obj);
                break;
            case 28:
                ((m1k) obj2).invoke(obj);
                break;
            default:
                ((o0p0) obj2).invoke(obj);
                break;
        }
    }
}
