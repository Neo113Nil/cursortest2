package xsna;

import android.content.Context;
import com.vk.catalog2.common.ui.mvp.video.VideoUploadFragment;
import com.vk.dto.clips.external.VideoToClipInfo;
import com.vk.dto.clips.external.VideoToClipInput;
import com.vk.dto.clips.gallery.ClipsProcessedItem;
import com.vk.dto.clips.gallery.TranscodingState;
import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.bridges.dto.VkAlertData;
import com.vkontakte.android.R;
import xsna.chd;
import xsna.vyd;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class ov20 implements gzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ov20(int i, Context context, gzs gzsVar, gzs gzsVar2) {
        this.d = context;
        this.c = i;
        this.e = gzsVar;
        this.f = gzsVar2;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.f;
        int i2 = this.c;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                Context context = (Context) obj3;
                gzs gzsVar = (gzs) obj2;
                gzs gzsVar2 = (gzs) obj;
                VkAlertData.b bVar = new VkAlertData.b(context.getString(R.string.vk_auth_error), context.getString(R.string.vk_qr_auth_no_internet), (VkAlertData.DialogType) null, new VkAlertData.a(context.getString(i2), null), (VkAlertData.a) null, 52);
                SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                (superappUiRouterBridge != null ? superappUiRouterBridge : null).O(e3m.h(context), bVar, new qr1(gzsVar2, gzsVar));
                break;
            default:
                VideoUploadFragment videoUploadFragment = (VideoUploadFragment) obj3;
                int i3 = VideoUploadFragment.S;
                VideoToClipInput videoToClipInput = new VideoToClipInput(new ClipsProcessedItem((String) obj2, i2, TranscodingState.GALLERY_NOT_TRANSCODED, null, null, false, 56, null), new VideoToClipInfo(0L, 0L, true, true, 3, null));
                ((rhd) videoUploadFragment.R.getValue()).h(chd.a.a((UserId) obj), false);
                vyd.d dVar = new vyd.d(videoToClipInput, MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.VIDEO_AS_CLIP_VIDEO_UPLOAD, true);
                dhr0.a.getClass();
                ((vyd) videoUploadFragment.O.getValue()).a(videoUploadFragment.kn(), dVar, new vyd.c(dhr0.u().c, 12, 13));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ ov20(VideoUploadFragment videoUploadFragment, String str, int i, UserId userId) {
        this.d = videoUploadFragment;
        this.e = str;
        this.c = i;
        this.f = userId;
    }
}
