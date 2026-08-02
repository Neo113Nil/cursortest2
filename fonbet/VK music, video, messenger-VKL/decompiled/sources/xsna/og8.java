package xsna;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionPlayAudiosFromBlock;
import com.vk.catalog2.common.ui.core.analytics.tracking.SearchEntityAnswerAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.search.SearchEntityPersonAnswerVh;
import com.vk.catalog2.feature.music.holders.MusicPlaylistCellVh;
import com.vk.catalog2.feature.search.dto.ui.UIBlockSearchEntityPerson;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.cell.left.VkCellLeft;
import com.vk.dto.music.MusicTrack;
import com.vk.im.ui.fragments.ImCreateChatFragment;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlayCatalogSource;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vk.newsfeed.impl.fragments.VideoPostViewFragment;
import java.util.List;
import xsna.qg8;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class og8 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ og8(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        UIBlockActionPlayAudiosFromBlock uIBlockActionPlayAudiosFromBlock;
        gzs<Boolean> gzsVar;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                pg8 pg8Var = (pg8) obj;
                qg8.a aVar = qg8.a.a;
                if (pg8Var.m) {
                    pg8Var.l.onNext(aVar);
                    break;
                }
                break;
            case 1:
                yfg yfgVar = ((ngg) obj).F;
                if (yfgVar != null) {
                    yfgVar.e.invoke((String) view.getTag(), yfgVar);
                    break;
                }
                break;
            case 2:
                y6k y6kVar = ((ImCreateChatFragment) obj).X;
                if (y6kVar == null) {
                    y6kVar = null;
                }
                y6kVar.X0();
                break;
            case 3:
                uhz uhzVar = (uhz) obj;
                com.vk.newsfeed.common.posting.listfriends.a aVar2 = uhzVar.n;
                if (aVar2 != null) {
                    uhzVar.i6(aVar2);
                    break;
                }
                break;
            case 4:
                MusicPlaylistCellVh musicPlaylistCellVh = (MusicPlaylistCellVh) obj;
                MusicPlaylistCellVh.a aVar3 = new MusicPlaylistCellVh.a(0, musicPlaylistCellVh, MusicPlaylistCellVh.class, "handlePlaylistClick", "handlePlaylistClick()V", 0);
                musicPlaylistCellVh.getClass();
                jjc.a(aVar3);
                break;
            case 5:
                vm30 vm30Var = vm30.this;
                ym30 ym30Var = vm30Var.t0;
                if (ym30Var != null) {
                    ym30Var.S();
                }
                lgh0 lgh0Var = vm30Var.a0;
                lgh0Var.j = true;
                lgh0Var.e();
                break;
            case 6:
                SearchEntityPersonAnswerVh searchEntityPersonAnswerVh = (SearchEntityPersonAnswerVh) obj;
                u2b0 u2b0Var = searchEntityPersonAnswerVh.g;
                UIBlockSearchEntityPerson uIBlockSearchEntityPerson = searchEntityPersonAnswerVh.r;
                if (uIBlockSearchEntityPerson != null && (uIBlockActionPlayAudiosFromBlock = uIBlockSearchEntityPerson.B) != null) {
                    StartPlayCatalogSource startPlayCatalogSource = new StartPlayCatalogSource(uIBlockActionPlayAudiosFromBlock.z, null, null, null, false, null, 62, null);
                    if (!u2b0Var.h() || !epx.f(u2b0Var.j(), startPlayCatalogSource)) {
                        if (!epx.f(u2b0Var.j(), startPlayCatalogSource)) {
                            searchEntityPersonAnswerVh.c(SearchEntityAnswerAnalyticsInfo.ClickTarget.PlayAll);
                            u2b0Var.N0(new lqk0(startPlayCatalogSource, (MusicTrack) null, (List) null, MusicPlaybackLaunchContext.Fb(uIBlockActionPlayAudiosFromBlock.f), 0, ShuffleMode.SHUFFLE_OFF, PlayRequestTrigger.FAST_PLAY_TRACK_LIST, (AdsAudioPixelsContainer) null, 0L, 822));
                            break;
                        } else {
                            searchEntityPersonAnswerVh.c(SearchEntityAnswerAnalyticsInfo.ClickTarget.PlayAll);
                            u2b0Var.f(new PlaybackActionMeta(6, 0L, 2, null));
                            break;
                        }
                    } else {
                        searchEntityPersonAnswerVh.c(SearchEntityAnswerAnalyticsInfo.ClickTarget.Pause);
                        u2b0Var.pause(6);
                        break;
                    }
                }
                break;
            case 7:
                ((androidx.appcompat.app.d) obj).dismiss();
                break;
            case 8:
                Context context = (Context) obj;
                Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + context.getPackageName()));
                intent.addFlags(268435456);
                context.startActivity(intent);
                break;
            case 9:
                u3g0 u3g0Var = (u3g0) obj;
                gzs<Boolean> gzsVar2 = u3g0Var.d;
                if (gzsVar2 == null || !gzsVar2.invoke().booleanValue()) {
                    u3g0Var.Ic(false);
                    break;
                }
                break;
            case 10:
                VideoPostViewFragment videoPostViewFragment = (VideoPostViewFragment) obj;
                int i2 = VideoPostViewFragment.W0;
                u3g0 u3g0Var2 = videoPostViewFragment.X;
                if (u3g0Var2 == null || (gzsVar = u3g0Var2.d) == null || !gzsVar.invoke().booleanValue()) {
                    videoPostViewFragment.Ic(false);
                    break;
                }
                break;
            default:
                int i3 = VkCellLeft.r;
                gzs<s3q0> gzsVar3 = ((VkCell.Left.c.a) obj).b;
                if (gzsVar3 != null) {
                    gzsVar3.invoke();
                    break;
                }
                break;
        }
    }
}
