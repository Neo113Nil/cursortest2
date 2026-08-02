package xsna;

import android.view.ViewGroup;
import com.vk.ads.yandex.api.nativead.YandexNativeAdError;
import com.vk.api.generated.vmoji.dto.VmojiGetPhotoUploadUrlResponseDto;
import com.vk.catalog2.common.ui.mvp.video.VideoPlaylistPlaceHolder;
import com.vk.catalog2.common.ui.mvp.video.VideoUploadFragment;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.adapter.RecyclerViewState;
import com.vk.dto.photo.Photo;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.superapp.api.dto.app.WebSubscriptionInfo;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.upload.impl.tasks.VmojiPhotoUploadTask;
import com.vk.voip.ui.asr.ui.start.AsrRecordStartFragment;
import com.vk.voip.ui.calls.presentation.base.fragment.VoipCallServiceFragment;
import com.vk.voip.ui.share.link.pager.view.VoipShareLinkPagerView;
import com.vk.voip.ui.whiteboard.presentation.main.ui.WhiteboardFragment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.yandex.mobile.ads.common.AdRequestError;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.ghw0;
import xsna.mlx0;
import xsna.rhw0;
import xsna.uqw0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class z4t0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z4t0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ybs q;
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return Boolean.valueOf(((VideoPlaylistPlaceHolder) obj2).t.b == ((jwr0) obj).a.b);
            case 1:
                Photo photo = (Photo) obj2;
                PhotoAttachment photoAttachment = (PhotoAttachment) obj;
                if (epx.f(photoAttachment.g, photo.e) && photoAttachment.f == photo.c) {
                    r1 = true;
                }
                return Boolean.valueOf(r1);
            case 2:
                com.vk.auth.ui.password.askpassword.a aVar = (com.vk.auth.ui.password.askpassword.a) obj2;
                com.vk.registration.funnels.b.a.getClass();
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.PARTIAL_EXPAND_SUCCESS, null, null, null, null, null, null, 254);
                aVar.e = new gjr0(1);
                aVar.c.finish();
                return s3q0.a;
            case 3:
                ((com.vk.superapp.browser.internal.ui.menu.action.n) obj2).f = (RecyclerViewState) obj;
                return s3q0.a;
            case 4:
                mfu0 mfu0Var = ((ggu0) obj2).d;
                if (((Boolean) obj).booleanValue()) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("result", true);
                    mfu0Var.n(JsApiMethodType.SEND_PAYLOAD, jSONObject);
                } else {
                    mfu0Var.A(JsApiMethodType.SEND_PAYLOAD, null);
                }
                return s3q0.a;
            case 5:
                return (WebSubscriptionInfo) obj2;
            case 6:
                FragmentImpl fragmentImpl = (VideoUploadFragment) obj2;
                vbs Ln = fragmentImpl.Ln();
                if (Ln != null && (q = Ln.q()) != null) {
                    q.b(fragmentImpl);
                }
                return s3q0.a;
            case 7:
                VmojiPhotoUploadTask vmojiPhotoUploadTask = (VmojiPhotoUploadTask) obj2;
                VmojiGetPhotoUploadUrlResponseDto vmojiGetPhotoUploadUrlResponseDto = (VmojiGetPhotoUploadUrlResponseDto) obj;
                vmojiPhotoUploadTask.n = vmojiGetPhotoUploadUrlResponseDto.e();
                vmojiPhotoUploadTask.o = vmojiGetPhotoUploadUrlResponseDto.d();
                return new ncq0(vmojiGetPhotoUploadUrlResponseDto.f(), null, null, null, null, 30);
            case 8:
                int i2 = AsrRecordStartFragment.U;
                new AsrRecordStartFragment().Td(((lcw0) obj2).a.getParentFragmentManager(), "AsrRecordStartFragment");
                return s3q0.a;
            case 9:
                return Boolean.valueOf(((v79) obj2).b.a());
            case 10:
                ((ihw0) obj2).a(new ghw0.n());
                return s3q0.a;
            case 11:
                VoipCallServiceFragment voipCallServiceFragment = (VoipCallServiceFragment) obj2;
                int i3 = VoipCallServiceFragment.Y;
                rhw0.r.a aVar2 = new rhw0.r.a((String) obj);
                voipCallServiceFragment.getClass();
                xn50.a.c(voipCallServiceFragment, aVar2);
                return s3q0.a;
            case 12:
                ((pqw0) obj2).j.b(new uqw0.c((String) obj));
                return s3q0.a;
            case 13:
                return new e0x0((ViewGroup) obj, ((uzw0) obj2).i);
            case 14:
                com.vk.voip.ui.share.link.pager.view.a aVar3 = (com.vk.voip.ui.share.link.pager.view.a) obj;
                com.vk.voip.ui.share.link.pager.view.b bVar = ((VoipShareLinkPagerView) obj2).h;
                if (bVar != null) {
                    bVar.a(aVar3);
                }
                return s3q0.a;
            case 15:
                WhiteboardFragment whiteboardFragment = (WhiteboardFragment) obj2;
                mlx0 mlx0Var = (mlx0) obj;
                int i4 = WhiteboardFragment.R;
                whiteboardFragment.getClass();
                if (epx.f(mlx0Var, mlx0.a.a)) {
                    whiteboardFragment.finish();
                } else {
                    if (!(mlx0Var instanceof mlx0.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    com.vk.voip.ui.whiteboard.presentation.main.ui.a aVar4 = whiteboardFragment.Q;
                    if (aVar4 != null) {
                        mlx0.b bVar2 = (mlx0.b) mlx0Var;
                        aVar4.f.e(bVar2.a, bVar2.b, bVar2.c, bVar2.d);
                    }
                }
                return s3q0.a;
            case 16:
                com.vk.superapp.widget_settings.p004new.b bVar3 = (com.vk.superapp.widget_settings.p004new.b) obj2;
                uu1 uu1Var = (uu1) obj;
                io.reactivex.rxjava3.disposables.c cVar = bVar3.k;
                if (cVar == null || cVar.h()) {
                    bVar3.a.onNext(uu1Var.a);
                } else {
                    bVar3.o = true;
                }
                bVar3.c.onNext(uu1Var.b);
                return s3q0.a;
            case 17:
                y1y0 y1y0Var = (y1y0) obj2;
                awt0.v(y1y0Var.c(), y1y0Var.l.W());
                return s3q0.a;
            default:
                AdRequestError adRequestError = (AdRequestError) obj;
                ((io.reactivex.rxjava3.core.y) obj2).onError(new YandexNativeAdError.LoadingFailed(adRequestError.getCode(), adRequestError.getDescription()));
                return s3q0.a;
        }
    }
}
