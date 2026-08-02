package xsna;

import com.vk.api.generated.video.dto.VideoGetCommentsExtendedResponseDto;
import com.vk.attachpicker.fragment.gallery.PostingAttachGalleryFragment;
import com.vk.catalog2.feature.music.holders.MusicTrackCellVh;
import com.vk.content.design.view.camera.MasksWrap;
import com.vk.dto.live.LiveEventModel;
import com.vk.dto.video.VideoOwner;
import com.vk.voip.miniapps.impl.picture_in_picture.overlay.MiniAppCallPiPOverlayService;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.SettingsGeneralFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import xsna.i5d0;
import xsna.ikv0;
import xsna.oml0;
import xsna.xll0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class skz implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ skz(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                com.vk.libvideo.live.impl.views.live.b bVar = (com.vk.libvideo.live.impl.views.live.b) obj2;
                VideoGetCommentsExtendedResponseDto videoGetCommentsExtendedResponseDto = (VideoGetCommentsExtendedResponseDto) obj;
                e1q e1qVar = bVar.h;
                qpb qpbVar = e1qVar.b;
                if (qpbVar != null) {
                    qpbVar.q2();
                }
                qus qusVar = new qus();
                VideoOwner videoOwner = bVar.n;
                ArrayList b = qusVar.b(videoOwner.d, videoOwner.e, videoGetCommentsExtendedResponseDto);
                VideoOwner videoOwner2 = bVar.n;
                LiveEventModel c = qusVar.c(videoOwner2.d, videoOwner2.e, videoGetCommentsExtendedResponseDto);
                if (c != null) {
                    b.add(c);
                }
                Iterator it = b.iterator();
                while (it.hasNext()) {
                    LiveEventModel liveEventModel = (LiveEventModel) it.next();
                    liveEventModel.i = true;
                    e1qVar.b(liveEventModel);
                }
                bVar.B = null;
                break;
            case 1:
                ((wcj) obj2).invoke(obj);
                break;
            case 2:
                int i2 = MasksWrap.e0;
                ((wcj) obj2).invoke(obj);
                break;
            case 3:
                ((u6) obj2).invoke(obj);
                break;
            case 4:
                int i3 = MiniAppCallPiPOverlayService.e;
                ((wcj) obj2).invoke(obj);
                break;
            case 5:
                ((ba5) obj2).invoke(obj);
                break;
            case 6:
                ((acb) obj2).invoke(obj);
                break;
            case 7:
                Set<String> set = MusicTrackCellVh.A;
                ((yw5) obj2).invoke(obj);
                break;
            case 8:
                ((wcj) obj2).invoke(obj);
                break;
            case 9:
                ((cv60) obj2).invoke(obj);
                break;
            case 10:
                ((u6) obj2).invoke(obj);
                break;
            case 11:
                ((wcj) obj2).invoke(obj);
                break;
            case 12:
                ((c220) obj2).invoke(obj);
                break;
            case 13:
                ((r8a0) obj2).invoke(obj);
                break;
            case 14:
                ((ud8) obj2).invoke(obj);
                break;
            case 15:
                ((r8a0) obj2).invoke(obj);
                break;
            case 16:
                ((lty) obj2).invoke(obj);
                break;
            case 17:
                int i4 = PostingAttachGalleryFragment.p0;
                ((r8a0) obj2).invoke(obj);
                break;
            case 18:
                ((c220) obj2).invoke(obj);
                break;
            case 19:
                ((i5d0.a) obj2).invoke(obj);
                break;
            case 20:
                ((yw5) obj2).invoke(obj);
                break;
            case 21:
                ((wze0) obj2).invoke(obj);
                break;
            case 22:
                ((r8a0) obj2).invoke(obj);
                break;
            case 23:
                ((r8a0) obj2).invoke(obj);
                break;
            case 24:
                ((r8a0) obj2).invoke(obj);
                break;
            case 25:
                SettingsGeneralFragment settingsGeneralFragment = (SettingsGeneralFragment) obj2;
                int i5 = SettingsGeneralFragment.z0;
                ikv0.a aVar = new ikv0.a(settingsGeneralFragment.requireContext());
                aVar.u = new ikv0.d(settingsGeneralFragment.requireContext().getString(R.string.sync_contacts_reset_failed), (String) null, (ikv0.d.a) null);
                aVar.n();
                int i6 = kwg0.a;
                break;
            case 26:
                ((r8a0) obj2).invoke(obj);
                break;
            case 27:
                ((zkj0) obj2).invoke(obj);
                break;
            case 28:
                fpl0 fpl0Var = (fpl0) obj2;
                fpl0Var.e(oml0.i.a);
                fpl0Var.c(new xll0.a.t((Throwable) obj));
                break;
            default:
                ((aj50) obj2).invoke(obj);
                break;
        }
    }
}
