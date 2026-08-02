package xsna;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.catalog2.common.ui.mvp.holder.header.FriendsSearchQueryVh;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.libvideo.live.impl.views.menubutton.MenuButtonNewView;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.newsfeed.posting.geo_picker.presentation.a;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.mediapicker.localmedia.LocalMediaPickerFragmentOld;
import com.vk.stickers.roulette.StickersRouletteFragment;
import com.vk.superapp.multiaccount.impl.ui.relateduser.RelatedUserStackView;
import one.video.ad.ux.controls.OneVideoAdBaseControls;
import one.video.ad.ux.controls.OneVideoAdControlsViewNew;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class kn9 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kn9(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                float f = CameraUIView.w1;
                bm9 presenter = ((CameraUIView) obj).getPresenter();
                if (presenter != null) {
                    presenter.H3();
                    break;
                }
                break;
            case 1:
                rmb rmbVar = (rmb) obj;
                boolean z = rmbVar.h;
                qmb qmbVar = qmb.this;
                if (!z) {
                    qmbVar.l.f(new PlaybackActionMeta(6, 0L, 2, null));
                    break;
                } else {
                    qmbVar.l.pause(6);
                    break;
                }
            case 2:
                view.getContext().startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("tel:" + ((String) obj))));
                break;
            case 3:
                ((FriendsSearchQueryVh) obj).b.invoke();
                break;
            case 4:
                ((fnw) obj).e.a(null);
                break;
            case 5:
                int i2 = LocalMediaPickerFragmentOld.c0;
                efc0 fo = ((LocalMediaPickerFragmentOld) obj).fo();
                if (fo != null) {
                    fo.C(PostingAction.MediaPicker.OpenCamera.b);
                    break;
                }
                break;
            case 6:
                int i3 = MenuButtonNewView.h;
                ((MenuButtonNewView) obj).getPresenterLocal().X();
                break;
            case 7:
                ((com.vk.im.design.view.pagination.pin.f) obj).l.invoke();
                break;
            case 8:
                ((j650) obj).e.scrollToPosition(0);
                break;
            case 9:
                ((li70) obj).d("cell");
                break;
            case 10:
                int i4 = OneVideoAdControlsViewNew.E;
                OneVideoAdBaseControls.a listener = ((OneVideoAdControlsViewNew) obj).getListener();
                if (listener != null) {
                    listener.b();
                    break;
                }
                break;
            case 11:
                ((kra0) obj).l.yi(a.c.b.b);
                break;
            case 12:
                RelatedUserStackView.a aVar = RelatedUserStackView.m;
                ((RelatedUserStackView) obj).a();
                break;
            case 13:
                int i5 = StickersRouletteFragment.o0;
                ocl0 ocl0Var = (ocl0) ((StickersRouletteFragment) obj).S;
                if (ocl0Var != null) {
                    ocl0Var.G1();
                    break;
                }
                break;
            case 14:
                ((gzs) obj).invoke();
                break;
            default:
                ((w6x0) obj).b.a(!r3.b.b(), true);
                break;
        }
    }
}
