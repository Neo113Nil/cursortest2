package xsna;

import android.content.SharedPreferences;
import android.widget.TextView;
import com.vk.auth.loginconfirmation.VkLoginConfirmationStatusType;
import com.vk.catalog2.common.ui.mvp.holder.video.playlist.VideoPlaylistToolbarVh;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.preference.Preference;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.video.VideoAlbum;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.superapp.api.dto.restore.VkRestoreConfirmInstantResult;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoverySideEffect;
import com.vk.voip.ui.onboarding.features.FeatureId;
import com.vk.voip.ui.sessionrooms.dialog.SessionRoomsDialog;
import org.json.JSONObject;
import xsna.bex0;
import xsna.tlw0;
import xsna.xcw0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class cus0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cus0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                com.vk.video.ui.discovery.minimizable.g gVar = (com.vk.video.ui.discovery.minimizable.g) obj2;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                VideoFeatures videoFeatures = VideoFeatures.VK_VIDEO_RESTRICTION_DOWNLOAD_IN_VK_APP;
                videoFeatures.getClass();
                if (!com.vk.toggle.b.A.a(videoFeatures)) {
                    gVar.v0();
                } else if (booleanValue) {
                    gVar.v0();
                } else {
                    gVar.J.b(VideoMinimizableDiscoverySideEffect.j0.a);
                }
                break;
            case 1:
                t1t0 t1t0Var = (t1t0) obj2;
                vqt vqtVar = (vqt) obj;
                s170 s170Var = t1t0Var.n;
                int i2 = vqtVar.b;
                VKList<NewsComment> vKList = vqtVar.a;
                s170Var.e(Math.max(0, i2 - vqtVar.c));
                com.vk.lists.c cVar = t1t0Var.j;
                int i3 = vqtVar.c;
                cVar.q(i3 > 0 ? vKList.size() + i3 : vKList.size());
                if (cVar.i() >= vqtVar.b) {
                    cVar.r(false);
                }
                String j = cVar.j();
                if (j == null || j.length() == 0 || vKList.isEmpty()) {
                    cVar.r(false);
                }
                break;
            case 2:
                VideoPlaylistToolbarVh videoPlaylistToolbarVh = (VideoPlaylistToolbarVh) obj2;
                VideoAlbum videoAlbum = ((jwr0) obj).a;
                videoPlaylistToolbarVh.o = videoAlbum;
                TextView textView = videoPlaylistToolbarVh.k;
                if (textView != null) {
                    textView.setText(videoAlbum.d);
                }
                break;
            case 3:
                ((qst0) obj2).d();
                break;
            case 4:
                ((sba) obj).y((UiTrackingScreen) obj2);
                break;
            case 5:
                a3v0 a3v0Var = (a3v0) obj2;
                VkLoginConfirmationStatusType vkLoginConfirmationStatusType = ((VkRestoreConfirmInstantResult) obj) == VkRestoreConfirmInstantResult.SUCCESS ? VkLoginConfirmationStatusType.SUCCESS_DENY : VkLoginConfirmationStatusType.ALREADY_CONFIRMED;
                v2v0 v2v0Var = (v2v0) a3v0Var.a;
                if (v2v0Var != null) {
                    v2v0Var.oa(vkLoginConfirmationStatusType);
                }
                break;
            case 6:
                ts tsVar = (ts) obj;
                r6y r6yVar = ((jwv0) obj2).b;
                if (r6yVar != null) {
                    JsApiMethodType jsApiMethodType = JsApiMethodType.GET_PHONE_NUMBER;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("sign", tsVar.a);
                    jSONObject.put("phone_number", tsVar.b);
                    bex0.a.b(r6yVar, jsApiMethodType, jSONObject, null, 12);
                }
                break;
            case 7:
                lcw0 lcw0Var = (lcw0) obj2;
                SessionRoomsDialog.a aVar = new SessionRoomsDialog.a();
                aVar.a = SessionRoomsDialog.DialogKind.ADMIN_ROOMS_CONFIGURE;
                aVar.a(lcw0Var.a.getParentFragmentManager());
                lcw0Var.c.invoke();
                break;
            case 8:
                break;
            case 9:
                nfw0 nfw0Var = (nfw0) obj2;
                if (((Boolean) obj).booleanValue()) {
                    nfw0Var.d.m();
                    FeatureId featureId = FeatureId.ASR;
                    UserId userId = (UserId) nfw0Var.e.invoke();
                    pla.e().b().b(featureId.h());
                    SharedPreferences e = Preference.e(userId.b, featureId.h());
                    Boolean bool = Boolean.TRUE;
                    qaj0.c(e, "banner_disposed", bool);
                    qaj0.c(Preference.e(userId.b, featureId.h()), "feature_used", bool);
                }
                break;
            case 10:
                ylw0 ylw0Var = (ylw0) obj2;
                int i4 = ylw0.x1;
                tlw0.b bVar = tlw0.b.b;
                ylw0Var.getClass();
                xn50.a.c(ylw0Var, bVar);
                break;
            case 11:
                rnw0 rnw0Var = (rnw0) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    rnw0Var.c();
                }
                break;
            case 12:
                ((nrw0) obj2).q(xcw0.a0.a);
                break;
            default:
                qfx0.d.getClass();
                qfx0.A0((FragmentImpl) obj, null, (ihx0) obj2);
                break;
        }
        return s3q0.a;
    }
}
