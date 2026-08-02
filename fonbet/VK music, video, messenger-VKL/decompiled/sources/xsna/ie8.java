package xsna;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import com.vk.catalog2.common.dto.api.CatalogLaunchOrigin;
import com.vk.catalog2.feature.music.dto.ui.UIBlockOfflinePodcastItem;
import com.vk.catalog2.feature.music.holders.podcast.PodcastOfflineVh;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.clips.upload.edit.api.preview.ClipsChoosePreviewResult;
import com.vk.core.view.components.cell.rich.VkRichCell;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.podcast.OfflinePodcast;
import com.vk.dto.podcast.Podcast;
import com.vk.log.L;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.view.VideoView;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;
import ru.ok.android.utils.Logger;
import xsna.wih0;
import xsna.xn50;

/* compiled from: BroadcastConfigView.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class ie8 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ie8(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        CallMemberId callMemberId;
        OfflinePodcast offlinePodcast;
        Podcast podcast;
        String h;
        CatalogLaunchOrigin catalogLaunchOrigin;
        switch (this.b) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ke8 ke8Var = (ke8) this.receiver;
                bwt0.p0(ke8Var.o, booleanValue);
                bwt0.p0(ke8Var.p, bwt0.K(ke8Var.o) && bwt0.K(ke8Var.q));
                break;
            case 1:
                L.i((Throwable) obj);
                break;
            case 2:
                ((i8d) this.receiver).getClass();
                List singletonList = Collections.singletonList(new wih0.a(k15.B((VideoFile) obj), null));
                PaginationKey.LoadedFull loadedFull = PaginationKey.LoadedFull.b;
                break;
            case 3:
                ((qld) this.receiver).a.invoke((ClipsChoosePreviewResult) obj);
                break;
            case 4:
                ((iqf) this.receiver).T((ttf) obj);
                break;
            case 5:
                com.vk.ecomm.reviews.impl.communities.yclients.c cVar = (com.vk.ecomm.reviews.impl.communities.yclients.c) this.receiver;
                cVar.getClass();
                xn50.a.c(cVar, (com.vk.ecomm.reviews.impl.communities.yclients.a) obj);
                break;
            case 6:
                ((com.vk.im.ui.components.msg_list.a) this.receiver).j2((Map) obj);
                break;
            case 7:
                ((com.vk.music.onboarding.impl.a) this.receiver).Em((List) obj);
                break;
            case 8:
                ((jq60) this.receiver).a((ds60) obj);
                break;
            case 9:
                cjk0 cjk0Var = (cjk0) obj;
                eka0 eka0Var = (eka0) this.receiver;
                VideoView videoView = eka0Var.m;
                ConversationVideoTrackParticipantKey c = (cjk0Var == null || (callMemberId = cjk0Var.a) == null) ? null : eka0.c(callMemberId);
                boolean z = false;
                boolean z2 = c != null;
                boolean z3 = !z2;
                bwt0.p0(eka0Var.d, z3);
                bwt0.p0(eka0Var.f, z3);
                bwt0.p0(eka0Var.g, z3);
                bwt0.p0(eka0Var.h, z3);
                bwt0.p0(videoView, z2);
                if (c == null) {
                    videoView.b();
                } else {
                    com.vk.voip.ui.c.b.getClass();
                    videoView.a(com.vk.voip.ui.c.r.getVideoController(), c);
                    z = true;
                }
                eka0Var.r = z;
                eka0Var.t.a();
                break;
            case 10:
                int intValue = ((Number) obj).intValue();
                PodcastOfflineVh podcastOfflineVh = (PodcastOfflineVh) this.receiver;
                UIBlockOfflinePodcastItem uIBlockOfflinePodcastItem = podcastOfflineVh.g;
                if (uIBlockOfflinePodcastItem != null && (offlinePodcast = uIBlockOfflinePodcastItem.y) != null && (podcast = offlinePodcast.b) != null) {
                    UserId userId = podcast.c;
                    VkRichCell vkRichCell = podcastOfflineVh.h;
                    if (vkRichCell == null) {
                        vkRichCell = null;
                    }
                    Context context = vkRichCell.getContext();
                    if (context != null) {
                        if (intValue == R.id.music_action_go_to_community) {
                            UIBlockOfflinePodcastItem uIBlockOfflinePodcastItem2 = podcastOfflineVh.g;
                            if ((uIBlockOfflinePodcastItem2 != null ? uIBlockOfflinePodcastItem2.p : null) == CatalogLaunchOrigin.KIDS_SECTION) {
                                i0q0.f(new i3r(context, 2));
                            } else {
                                podcastOfflineVh.f.R3(userId.b, context);
                            }
                        } else if (intValue == R.id.music_action_share) {
                            kbj0.c(podcastOfflineVh.d, context, podcast.d(), true, null, null, false, 120);
                        } else if (intValue == R.id.music_action_copy_link) {
                            ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
                            String d = podcast.d();
                            clipboardManager.setPrimaryClip(ClipData.newPlainText(d, d));
                            cvk.u(R.string.link_copied, false);
                        } else if (intValue == R.id.music_action_podcast_unsubscribe) {
                            phb0 phb0Var = podcastOfflineVh.e;
                            Integer valueOf = Integer.valueOf(podcast.b);
                            UIBlockOfflinePodcastItem uIBlockOfflinePodcastItem3 = podcastOfflineVh.g;
                            if (uIBlockOfflinePodcastItem3 == null || (catalogLaunchOrigin = uIBlockOfflinePodcastItem3.p) == null || (h = catalogLaunchOrigin.h()) == null) {
                                h = CatalogLaunchOrigin.UNKNOWN.h();
                            }
                            UIBlockOfflinePodcastItem uIBlockOfflinePodcastItem4 = podcastOfflineVh.g;
                            podcastOfflineVh.i.b(itg0.l(phb0Var.c(userId, valueOf, h, uIBlockOfflinePodcastItem4 != null ? uIBlockOfflinePodcastItem4.f : null)));
                        }
                    }
                }
                break;
            case 11:
                c9i0 c9i0Var = (c9i0) obj;
                pm6 pm6Var = ((d9i0) this.receiver).k;
                if (pm6Var != null) {
                    pm6Var.a(c9i0Var);
                }
                break;
            default:
                l5v0.a((l5v0) this.receiver, (Throwable) obj);
                break;
        }
        return s3q0.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ie8(Object obj, int i) {
        super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
        this.b = i;
        switch (i) {
            case 7:
                super(1, obj, com.vk.music.onboarding.impl.a.class, "onArtistsSearchLoaded", "onArtistsSearchLoaded(Ljava/util/List;)V", 0);
                break;
            case 10:
                super(1, obj, PodcastOfflineVh.class, "onActionIdClick", "onActionIdClick(I)V", 0);
                break;
            case 12:
                super(1, obj, l5v0.class, "onUpdateError", "onUpdateError(Ljava/lang/Throwable;)V", 0);
                break;
            default:
                break;
        }
    }
}
