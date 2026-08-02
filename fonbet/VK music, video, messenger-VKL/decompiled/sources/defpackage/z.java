package defpackage;

import android.net.Uri;
import com.vk.api.video.VideoSave;
import com.vk.catalog2.common.ui.holders.HidingToolbarVh;
import com.vk.channels.impl.list.b;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoUrl;
import com.vk.dto.common.id.UserId;
import com.vk.feed.design.view.newsfeed.reaction.FeedAnimatedView;
import com.vk.reactions.view.ElevationImageView;
import com.vk.sharing.im_engine_impl.BaseSharingExternalActivity;
import com.vk.superapp.browser.internal.ui.shortcats.a;
import com.vk.superapp.navigation.api.data.AppShareType;
import com.vk.upload.impl.tasks.VideoUploadTaskNew;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.VideoAttachment;
import io.reactivex.rxjava3.functions.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import xsna.a0a;
import xsna.atl;
import xsna.dam;
import xsna.f2k;
import xsna.mf8;
import xsna.o25;
import xsna.pps;
import xsna.rlh;
import xsna.thb;
import xsna.u4e;
import xsna.vr0;
import xsna.yvq;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class z implements f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i;
        int i2;
        int i3;
        switch (this.b) {
            case 0:
                ((y) this.c).invoke(obj);
                break;
            case 1:
                ((a.b) this.c).invoke(obj);
                break;
            case 2:
                ((com.vk.movika.sdk.base.data.a) this.c).invoke(obj);
                break;
            case 3:
                ((com.vk.movika.sdk.base.data.a) this.c).invoke(obj);
                break;
            case 4:
                ((vr0) this.c).invoke(obj);
                break;
            case 5:
                ((com.vk.movika.sdk.base.data.a) this.c).invoke(obj);
                break;
            case 6:
                ((com.vk.movika.sdk.base.data.a) this.c).invoke(obj);
                break;
            case 7:
                BaseSharingExternalActivity baseSharingExternalActivity = BaseSharingExternalActivity.this;
                int i4 = BaseSharingExternalActivity.Z;
                UserId c = o25.a().c();
                ArrayList arrayList = new ArrayList();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    VideoFile videoFile = ((VideoAttachment) it.next()).k;
                    arrayList.add(new VideoUploadTaskNew(videoFile.w9().Ab(VideoUrl.EXTERNAL_URL), videoFile.getTitle(), videoFile.j1(), VideoSave.Target.VIDEO, c, "BaseSharingExternalActivity", null, true, Collections.EMPTY_LIST, "", "", null, null, null, 0L, null, false, true, false));
                }
                if (arrayList.size() > 1) {
                    i = R.string.uploading_video_multiple;
                    i2 = R.string.video_upload_ok_multiple;
                    i3 = R.string.video_upload_ok_multiple_long;
                } else {
                    i = R.string.uploading_video;
                    i2 = R.string.video_upload_ok;
                    i3 = R.string.video_upload_ok_long;
                }
                int i5 = i3;
                com.vk.upload.impl.a.i(baseSharingExternalActivity.S2(arrayList, i, i2, i5, Uri.parse("vkontakte://" + a0a.d + "/videos" + c)));
                baseSharingExternalActivity.P.a(AppShareType.OTHER);
                baseSharingExternalActivity.finish();
                break;
            case 8:
                ((com.vk.movika.sdk.base.data.a) this.c).invoke(obj);
                break;
            case 9:
                ((com.vk.movika.sdk.base.data.a) this.c).invoke(obj);
                break;
            case 10:
                ((vr0) this.c).invoke(obj);
                break;
            case 11:
                thb thbVar = ((b) this.c).k;
                if (thbVar != null) {
                    thbVar.a();
                    break;
                }
                break;
            case 12:
                ((com.vk.movika.sdk.base.data.a) this.c).invoke(obj);
                break;
            case 13:
                ((com.vk.movika.sdk.base.data.a) this.c).invoke(obj);
                break;
            case 14:
                ((com.vk.movika.sdk.base.data.a) this.c).invoke(obj);
                break;
            case 15:
                ((u4e) this.c).invoke(obj);
                break;
            case 16:
                ((vr0) this.c).invoke(obj);
                break;
            case 17:
                ((f2k) this.c).invoke(obj);
                break;
            case 18:
                ((atl) this.c).invoke(obj);
                break;
            case 19:
                ((y) this.c).invoke(obj);
                break;
            case 20:
                ((rlh) this.c).invoke(obj);
                break;
            case 21:
                ((rlh) this.c).invoke(obj);
                break;
            case 22:
                rlh rlhVar = (rlh) this.c;
                float[] fArr = ElevationImageView.A;
                rlhVar.invoke(obj);
                break;
            case 23:
                yvq yvqVar = (yvq) this.c;
                int i6 = FeedAnimatedView.y;
                yvqVar.invoke(obj);
                break;
            case 24:
                ((pps) this.c).invoke(obj);
                break;
            case 25:
                ((rlh) this.c).invoke(obj);
                break;
            case 26:
                ((dam) this.c).invoke(obj);
                break;
            case 27:
                ((HidingToolbarVh.a) this.c).invoke(obj);
                break;
            case 28:
                ((mf8) this.c).invoke(obj);
                break;
            default:
                ((rlh) this.c).invoke(obj);
                break;
        }
    }
}
