package xsna;

import android.app.Activity;
import android.view.View;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.camera.clips.core.drafts.ClipsDraftVk;
import com.vk.clips.upload.vk.api.navigation.preview.ClipPreviewInputParams;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.id.UserId;
import com.vk.dto.posting.PostingVisibilityMode;
import com.vk.external.miniapp.net.ad.AdvertisementType;
import com.vk.external.miniapp.net.app.WebAdConfig;
import com.vk.music.podcast.impl.ui.offlinepage.presentation.feature.OfflinePodcastEpisodesMviState;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipPreview;
import com.vk.superapp.advertisement.requestsanalytics.AdRequestPurpose;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import one.video.player.OneVideoPlayer;
import xsna.awg0;
import xsna.fxs;
import xsna.gi0;
import xsna.j11;
import xsna.lze;
import xsna.t3d0;
import xsna.y31;
import xsna.yze;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class swe implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ swe(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                l7s l7sVar = (l7s) this.c;
                View view = (View) this.d;
                VideoFile videoFile = (VideoFile) this.e;
                izs izsVar = (izs) this.f;
                PostingVisibilityMode postingVisibilityMode = (PostingVisibilityMode) obj;
                List<PrivacySetting.PrivacyRule> h = ywe.h(postingVisibilityMode);
                PrivacySetting privacySetting = new PrivacySetting();
                privacySetting.e = h;
                new PrivacySetting().e = ywe.g(videoFile, false);
                jx2 b = ywe.b(videoFile, privacySetting, null, null, new fre(l7sVar, 2));
                b.g = l7sVar;
                hg1.b(view, b.a());
                izsVar.invoke(postingVisibilityMode);
                return s3q0.a;
            case 1:
                ClipPreviewInputParams clipPreviewInputParams = (ClipPreviewInputParams) this.c;
                tze tzeVar = (tze) this.d;
                lze.d dVar = (lze.d) this.e;
                List list = (List) this.f;
                String str = clipPreviewInputParams.e;
                ((ClipsDraftPersistentStore) obj).getClass();
                ClipsDraftVk l = ClipsDraftPersistentStore.l(str);
                if (l == null) {
                    tzeVar.f.b(t3d0.a.a);
                    return s3q0.a;
                }
                tze.V(MobileOfficialAppsClipsStat$TypeClipPreview.EventType.PREVIEW_OPEN, dVar.d);
                tzeVar.T(new yze.b(clipPreviewInputParams.b, l, list, dVar.c, dVar.d, clipPreviewInputParams.g));
                return s3q0.a;
            case 2:
                y31.a aVar = (y31.a) this.c;
                fxs fxsVar = (fxs) this.d;
                Activity activity = (Activity) this.e;
                WebAdConfig webAdConfig = (WebAdConfig) this.f;
                gi0 gi0Var = (gi0) obj;
                if (gi0Var instanceof gi0.a) {
                    AdvertisementType advertisementType = aVar.b;
                    gi0.a aVar2 = (gi0.a) gi0Var;
                    AdvertisementType advertisementType2 = aVar2.c;
                    if (advertisementType == advertisementType2) {
                        fxsVar.v(new uh0(AdRequestPurpose.SHOW_INSTANCE), activity, aVar, aVar2, new fxs.a(true, false), webAdConfig);
                    } else {
                        fxsVar.x(activity, new y31.a(aVar.a, advertisementType2, aVar.c, advertisementType), webAdConfig);
                    }
                } else {
                    if (!epx.f(gi0Var, gi0.b.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gnl gnlVar = e370.m;
                    if (gnlVar == null) {
                        gnlVar = null;
                    }
                    gnlVar.a().d();
                    fxsVar.e.f(aVar.d, false, new j11.a(2004, "No slots available", "Hasn't banners error"), null);
                }
                return s3q0.a;
            case 3:
                com.vk.im.ui.components.msg_list.a aVar3 = (com.vk.im.ui.components.msg_list.a) this.c;
                ClipVideoFile clipVideoFile = (ClipVideoFile) this.d;
                UserId userId = (UserId) this.e;
                w8 w8Var = (w8) this.f;
                com.vk.im.ui.components.msg_list.a.b1(aVar3, clipVideoFile, userId, false);
                w8Var.invoke(clipVideoFile);
                return s3q0.a;
            case 4:
                wu70 wu70Var = (wu70) this.c;
                UserId userId2 = (UserId) this.d;
                OfflinePodcastEpisodesMviState.SortType sortType = (OfflinePodcastEpisodesMviState.SortType) this.e;
                el50 el50Var = (el50) this.f;
                awg0 awg0Var = (awg0) obj;
                return awg0.a.b(awg0Var, ((lq40) wu70Var.a.a).M(userId2, sortType.h()).r0(awg0Var.r().c()), new k130(el50Var, 9), null, new nq60(1, el50Var, sortType), 2);
            default:
                OneVideoPlayer.DiscontinuityReason discontinuityReason = (OneVideoPlayer.DiscontinuityReason) this.c;
                deb0 deb0Var = (deb0) this.d;
                deb0 deb0Var2 = (deb0) this.e;
                ks80 ks80Var = (ks80) this.f;
                lk3 b2 = new lk3().b("reason", discontinuityReason.name());
                StringBuilder sb = new StringBuilder();
                sb.append(deb0Var.b);
                sb.append(':');
                sb.append(deb0Var.a);
                lk3 b3 = b2.b("oldPosition", sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(deb0Var2.b);
                sb2.append(':');
                sb2.append(deb0Var2.a);
                jk3 e = b3.b("newPosition", sb2.toString()).e();
                ohk0 f = ks80Var.f().f((String) obj);
                if (f != null) {
                    f.j("onPositionDiscontinuity", e);
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ swe(twe tweVar, l7s l7sVar, View view, VideoFile videoFile, izs izsVar) {
        this.b = 0;
        this.c = l7sVar;
        this.d = view;
        this.e = videoFile;
        this.f = izsVar;
    }
}
