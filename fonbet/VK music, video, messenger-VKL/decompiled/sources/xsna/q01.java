package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.vk.catalog2.common.ui.holders.analytics.MusicAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.holders.video.VideoSearchParamsVh;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicPlaylist;
import com.vk.catalog2.feature.music.holders.playlist.MusicPlaylistVkTileVh;
import com.vk.core.view.components.formitem.VkTextArea;
import com.vk.core.view.components.tabs.VkTabs;
import com.vk.core.view.components.tile.VkTile;
import com.vk.donut.design.view.reaction.DonutReactionButtonView;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.actions.Action;
import com.vk.dto.discover.carousel.Carousel;
import com.vk.dto.music.Playlist;
import com.vk.dto.posting.PostingVisibilityMode;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.photo.editor.features.crop.models.params.CropAspectRatioFormat;
import com.vk.photo.editor.features.crop.models.stat.CropStatEvent;
import com.vk.search.ui.SearchParametersBottomView;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vkontakte.android.data.b;
import xsna.jgz0;
import xsna.kkz0;
import xsna.oik;
import xsna.ptw0;
import xsna.szr;
import xsna.y050;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class q01 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q01(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        LinkButton linkButton;
        Action action;
        VkTile vkTile;
        Context context;
        Activity h;
        UIBlockMusicPlaylist uIBlockMusicPlaylist;
        SearchStatsLoggingInfo searchStatsLoggingInfo;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((w01) obj).b.a(yz0.b);
                break;
            case 1:
                vu9 vu9Var = (vu9) obj;
                Carousel carousel = (Carousel) vu9Var.q6();
                if (carousel != null && (linkButton = carousel.i) != null && (action = linkButton.c) != null) {
                    hd60.a().v(action, view.getContext(), (r20 & 4) != 0 ? null : null, (r20 & 8) != 0 ? null : null, (r20 & 16) != 0 ? null : null, (r20 & 32) != 0 ? null : null, null, (r20 & 128) != 0 ? null : 423);
                }
                Carousel carousel2 = (Carousel) vu9Var.q6();
                if (carousel2 != null) {
                    b.d dVar = new b.d("feed_carousel_click_more_button");
                    dVar.b(carousel2.l, "track_code");
                    dVar.e();
                    break;
                }
                break;
            case 2:
                View.OnClickListener onClickListener = (View.OnClickListener) obj;
                if (!jjc.d().b(400L)) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
            case 3:
                gik gikVar = (gik) obj;
                oik oikVar = gikVar.d;
                CropAspectRatioFormat cropAspectRatioFormat = CropAspectRatioFormat.CropFree;
                oik.a aVar = oikVar.d;
                (aVar != null ? aVar : null).a(cropAspectRatioFormat, true);
                View j = gikVar.c.j();
                r3h r3hVar = new r3h(gikVar, 5);
                ViewTreeObserver viewTreeObserver = j.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnPreDrawListener(new gyt0(j, r3hVar, false));
                }
                gikVar.j.b(CropStatEvent.h.a);
                break;
            case 4:
                gzs<s3q0> gzsVar = ((DonutReactionButtonView) obj).f;
                if (gzsVar != null) {
                    gzsVar.invoke();
                    break;
                }
                break;
            case 5:
                ((tzr) obj).a.onNext(szr.a.b);
                break;
            case 6:
                quv.l((quv) obj);
                break;
            case 7:
                hvx presenter = ((kvx) obj).getPresenter();
                if (presenter != null) {
                    presenter.p7();
                    break;
                }
                break;
            case 8:
                MusicPlaylistVkTileVh musicPlaylistVkTileVh = (MusicPlaylistVkTileVh) obj;
                if (!bwt0.c(400L) && (vkTile = musicPlaylistVkTileVh.i) != null && (context = vkTile.getContext()) != null && (h = e3m.h(context)) != null && (uIBlockMusicPlaylist = musicPlaylistVkTileVh.j) != null) {
                    Playlist playlist = uIBlockMusicPlaylist.z;
                    SearchStatInfoProvider searchStatInfoProvider = musicPlaylistVkTileVh.e;
                    if (searchStatInfoProvider != null) {
                        searchStatsLoggingInfo = searchStatInfoProvider.b(playlist.Eb() ? SchemeStat$EventItem.Type.ALBUM : SchemeStat$EventItem.Type.PLAYLIST, playlist.F, false);
                    } else {
                        searchStatsLoggingInfo = null;
                    }
                    if (!musicPlaylistVkTileVh.b(h)) {
                        if (!playlist.B()) {
                            musicPlaylistVkTileVh.c.a(new cfp0(uIBlockMusicPlaylist, new MusicAnalyticsInfo(MusicAnalyticsInfo.ClickTarget.Open)));
                            y050 U = musicPlaylistVkTileVh.d.U();
                            String str = uIBlockMusicPlaylist.f;
                            String str2 = uIBlockMusicPlaylist.b;
                            String h2 = MusicPlaylistVkTileVh.c(uIBlockMusicPlaylist.f) ? null : uIBlockMusicPlaylist.p.h();
                            if (h2 == null) {
                                h2 = jnj.a(playlist.O);
                            }
                            U.a(h, new y050.b.a(playlist, str, str2, searchStatsLoggingInfo, h2));
                            break;
                        } else {
                            fl4.p(musicPlaylistVkTileVh.d, h, MusicPlaylistVkTileVh.a(playlist.O, uIBlockMusicPlaylist), playlist, null, null, 24);
                            break;
                        }
                    }
                }
                break;
            case 9:
                gzs gzsVar2 = (gzs) obj;
                if (gzsVar2 != null) {
                    gzsVar2.invoke();
                    break;
                }
                break;
            case 10:
                ((com.vk.attachpicker.a) obj).c(false);
                break;
            case 11:
                cqb0.o((cqb0) obj);
                break;
            case 12:
                ((cqc0) obj).X0(PostingVisibilityMode.ALL);
                break;
            case 13:
                ViewParent parent = ((VkTabs.c) obj).a.getParent();
                while (parent != null && !(parent instanceof VkTabs)) {
                    parent = parent.getParent();
                }
                VkTabs vkTabs = parent instanceof VkTabs ? (VkTabs) parent : null;
                if (vkTabs != null) {
                    vkTabs.j();
                    break;
                }
                break;
            case 14:
                VideoSearchParamsVh videoSearchParamsVh = (VideoSearchParamsVh) obj;
                wet0 wet0Var = videoSearchParamsVh.f;
                SearchParametersBottomView searchParametersBottomView = videoSearchParamsVh.g;
                wet0Var.d((searchParametersBottomView != null ? searchParametersBottomView : null).getContext());
                break;
            case 15:
                Object obj2 = ((x2v0) obj).o;
                ((u2v0) (obj2 != null ? obj2 : null)).o();
                break;
            case 16:
                int i2 = VkTextArea.r;
                ((izs) obj).invoke(view);
                break;
            case 17:
                ((cuw0) obj).c.invoke(ptw0.l.b);
                break;
            case 18:
                kkz0.a aVar2 = ((fxy0) obj).r;
                if (aVar2 != null) {
                    ((jgz0.b) aVar2).a(2, new akz0());
                    break;
                }
                break;
            case 19:
                ((mfz0) obj).b.dismiss();
                break;
            default:
                ((ghz0) obj).e.x();
                break;
        }
    }
}
