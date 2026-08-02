package xsna;

import android.util.Size;
import android.view.ViewGroup;
import com.vk.attachpicker.stickers.post.attach.StoryAttachImageView;
import com.vk.dto.common.data.VKList;
import com.vk.im.ui.components.chat_profile.interactors.UserProfileAvatarsInteractor;
import com.vk.libvideo.ui.preview.VideoSeekPreviewImage;
import com.vk.log.L;
import com.vk.profile.user.impl.ui.UserProfileFragment;
import com.vk.stories.design.view.camera.StoryMediaPickerTabView;
import com.vk.stories.design.view.camera.StoryTabType;
import com.vk.superapp.verification.account.b;
import com.vk.video.ui.discovery.minimizable.c;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.i;
import com.vkontakte.android.R;
import java.util.Calendar;
import java.util.List;
import xsna.dpt0;
import xsna.e6w0;
import xsna.gm50;
import xsna.ikv0;
import xsna.sjm0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class sxl0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sxl0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        int i2 = 0;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                StoryAttachImageView storyAttachImageView = (StoryAttachImageView) obj2;
                if (storyAttachImageView.n) {
                    storyAttachImageView.T0(storyAttachImageView.o);
                }
                break;
            case 1:
                etv0 etv0Var = (etv0) obj;
                izs<? super StoryTabType, s3q0> izsVar = ((StoryMediaPickerTabView) obj2).h;
                if (izsVar != null) {
                    izsVar.invoke(StoryTabType.TEMPLATE);
                }
                etv0Var.b(false);
                break;
            case 2:
                break;
            case 3:
                wjm0 wjm0Var = (wjm0) obj2;
                sjm0.a aVar = (sjm0.a) obj;
                gm50.a.a(wjm0Var, aVar.a, new pf40(wjm0Var, 29));
                gm50.a.a(wjm0Var, aVar.b, new bl30(wjm0Var, 24));
                gm50.a.a(wjm0Var, aVar.c, new ujm0(wjm0Var, i2));
                break;
            case 4:
                ((uan0) obj2).h.set(((Long) obj).longValue());
                break;
            case 5:
                ((UserProfileAvatarsInteractor) obj2).c = (VKList) obj;
                break;
            case 6:
                List list = (List) obj;
                com.vk.profile.user.impl.ui.i iVar = ((UserProfileFragment) obj2).Q;
                com.vk.profile.user.impl.ui.i iVar2 = iVar != null ? iVar : null;
                wjf0.c(iVar2.f, new xq1(15, iVar2, list));
                break;
            case 7:
                ((nrr0) obj2).l.o();
                break;
            case 8:
                ((com.vk.video.ui.discovery.minimizable.g) obj2).C(new c.h0((yfs0) obj));
                break;
            case 9:
                dw20 dw20Var = ((hat0) obj2).b;
                if (dw20Var != null) {
                    String str = dw20.d1;
                    dw20Var.Sn(null);
                }
                break;
            case 10:
                ((com.vk.video.ui.discovery.minimizable.dialog.related_videos.d) obj2).j.b(new i.d(null));
                break;
            case 11:
                VideoSeekPreviewImage videoSeekPreviewImage = (VideoSeekPreviewImage) obj2;
                Throwable th = (Throwable) obj;
                int i3 = VideoSeekPreviewImage.G;
                videoSeekPreviewImage.setImageDrawable(null);
                videoSeekPreviewImage.A = true;
                if (th instanceof VideoSeekPreviewImage.a) {
                    videoSeekPreviewImage.B.invoke();
                } else {
                    L.i(th);
                }
                break;
            case 12:
                ((dpt0.a) obj2).g.onNext((fpt0) obj);
                break;
            case 13:
                ((ggu0) obj2).c.B((Throwable) obj);
                break;
            case 14:
                com.vk.superapp.verification.account.f fVar = (com.vk.superapp.verification.account.f) obj2;
                com.vk.superapp.verification.account.d dVar = fVar.e;
                if (dVar != null) {
                    dVar.I = true;
                }
                fVar.l(b.k.h);
                break;
            case 15:
                ((b8w0) obj2).a.invoke(e6w0.d.b);
                break;
            case 16:
                ((zyl0) obj2).invoke((ycw0) obj);
                break;
            case 17:
                int i4 = ((oe00) obj).a;
                l7s u = bwt0.u(((ViewGroup) ((nrw0) obj2).b).getContext());
                ikv0.a aVar2 = new ikv0.a(u);
                aVar2.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_outline_28, Integer.valueOf(R.attr.vk_ui_icon_negative), (Size) null, 12);
                aVar2.u = new ikv0.d(u.getString(i4), (String) null, (ikv0.d.a) null, 6);
                aVar2.o = Integer.valueOf(cn70.b(108));
                pkv0.f(aVar2);
                break;
            default:
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(((Long) obj).longValue());
                ((hmj0) obj2).invoke(new mvo0(calendar.getTimeInMillis()));
                break;
        }
        return s3q0.a;
    }
}
