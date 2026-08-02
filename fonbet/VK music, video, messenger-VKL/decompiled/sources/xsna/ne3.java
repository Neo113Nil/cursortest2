package xsna;

import android.view.View;
import androidx.constraintlayout.widget.Group;
import com.vk.attachpicker.base.BaseAttachPickerFragment;
import com.vk.auth.ui.carousel.UserCarouselView;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.content.design.view.camera.MasksWrap;
import com.vk.dto.masks.Mask;
import com.vk.ecomm.market.album.MarketAlbumImagePickerView;
import com.vk.stories.analytics.StoryPublishEvent;
import com.vk.webapp.community_picker.AppsCommunityPickerFragment;
import com.yandex.div.internal.widget.SelectView;
import xsna.as30;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class ne3 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ne3(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                com.google.android.material.bottomsheet.b bVar = (com.google.android.material.bottomsheet.b) this.c;
                int i = AppsCommunityPickerFragment.U;
                bVar.dismiss();
                break;
            case 1:
                BaseAttachPickerFragment baseAttachPickerFragment = (BaseAttachPickerFragment) this.c;
                int i2 = BaseAttachPickerFragment.y0;
                if (!baseAttachPickerFragment.a0()) {
                    baseAttachPickerFragment.oo().c(baseAttachPickerFragment);
                    h3p0.b(baseAttachPickerFragment);
                    break;
                }
                break;
            case 2:
                CameraUIView cameraUIView = (CameraUIView) this.c;
                float f = CameraUIView.w1;
                gm9 gm9Var = cameraUIView.B;
                gm9Var.getState().o(false);
                gm9Var.d();
                MasksWrap masksWrap = cameraUIView.b0;
                if (masksWrap != null) {
                    int i3 = MasksWrap.e0;
                    masksWrap.I(true);
                    break;
                }
                break;
            case 3:
                b2q b2qVar = (b2q) this.c;
                b2qVar.An();
                UserCarouselView userCarouselView = b2qVar.t;
                if (userCarouselView == null) {
                    userCarouselView = null;
                }
                userCarouselView.setConfiguring(true);
                Group group = b2qVar.w;
                if (group == null) {
                    group = null;
                }
                group.setVisibility(4);
                View view2 = b2qVar.v;
                (view2 != null ? view2 : null).setVisibility(0);
                break;
            case 4:
                com.vk.im.video.g gVar = (com.vk.im.video.g) this.c;
                t4w t4wVar = gVar.t;
                if (t4wVar == null) {
                    t4wVar = null;
                }
                if (!t4wVar.W0()) {
                    fh5 fh5Var = gVar.w;
                    (fh5Var != null ? fh5Var : null).n0();
                    break;
                } else {
                    as30.a aVar = gVar.s;
                    (aVar != null ? aVar : null).b();
                    break;
                }
            case 5:
                ((com.vk.im.design.view.pagination.pin.d) this.c).l.invoke();
                break;
            case 6:
                MarketAlbumImagePickerView.a((MarketAlbumImagePickerView) this.c);
                break;
            case 7:
                CameraUIView.d dVar = ((qg10) this.c).g;
                MasksWrap masksWrap2 = CameraUIView.this.b0;
                if (masksWrap2 != null) {
                    Mask mask = dVar.b;
                    if (mask.u) {
                        masksWrap2.C("https://" + a0a.d + "/clips/effect/" + mask.e + '_' + mask.d);
                    } else {
                        masksWrap2.C("https://" + a0a.d + "/masks#/" + mask.e + '/' + mask.d);
                    }
                    nf9.b.k(StoryPublishEvent.OPEN_EFFECT);
                    break;
                }
                break;
            case 8:
                izs<? super View, s3q0> izsVar = ((vq50) this.c).R.k;
                if (izsVar != null) {
                    izsVar.invoke(view);
                    break;
                }
                break;
            case 9:
                SelectView._init_$lambda$1((SelectView) this.c, view);
                break;
            default:
                x7b0 x7b0Var = (x7b0) this.c;
                if (!bwt0.B().a()) {
                    x7b0Var.onClick(view);
                    break;
                }
                break;
        }
    }
}
