package xsna;

import com.huawei.hms.framework.common.BundleUtil;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: MusicExternalEventHandlerDelegate.kt */
/* loaded from: classes.dex */
public final /* synthetic */ class mk40 extends FunctionReferenceImpl implements izs<yj40, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(yj40 yj40Var) {
        n3a n3aVar;
        oon0 oon0Var;
        oon0 oon0Var2;
        oon0 oon0Var3;
        oon0 oon0Var4;
        yj40 yj40Var2 = yj40Var;
        nk40 nk40Var = (nk40) this.receiver;
        q3a q3aVar = nk40Var.b;
        boolean z = false;
        if (yj40Var2 instanceof fa50) {
            fa50 fa50Var = (fa50) yj40Var2;
            MusicTrack musicTrack = fa50Var.b;
            String str = "music_audios_add";
            q3aVar.b(new buz(12, new sx4(nk40Var, musicTrack, str, 6), new bx(nk40Var, musicTrack, str, fa50Var.a)), false);
            n3aVar = new oon0("music_audios_add", null, false, false, 14);
        } else {
            boolean z2 = true;
            n3aVar = null;
            if (yj40Var2 instanceof yd50) {
                yd50 yd50Var = (yd50) yj40Var2;
                List<String> list = yd50Var.b;
                MusicTrack musicTrack2 = yd50Var.a;
                MusicTrack musicTrack3 = yd50Var.c;
                if (list.size() > 1) {
                    for (String str2 : list) {
                        int parseInt = Integer.parseInt(drm0.g0(str2, BundleUtil.UNDERLINE_TAG, str2));
                        musicTrack3.b = parseInt;
                        musicTrack2.b = parseInt;
                        nk40Var.d(musicTrack3, musicTrack2);
                    }
                } else {
                    nk40Var.d(musicTrack3, musicTrack2);
                }
            } else if (yj40Var2 instanceof ib50) {
                ib50 ib50Var = (ib50) yj40Var2;
                MusicTrack musicTrack4 = ib50Var.b;
                n3aVar = new buz(8, new sx4(nk40Var, musicTrack4, "music_audios_download", 6), new bm3(nk40Var, musicTrack4, ib50Var.a));
            } else if (yj40Var2 instanceof gc50) {
                gc50 gc50Var = (gc50) yj40Var2;
                n3aVar = new buz(8, new d05(27, nk40Var, gc50Var.b()), new onb(3, nk40Var, gc50Var.b()));
            } else {
                if (yj40Var2 instanceof ave0) {
                    ave0 ave0Var = (ave0) yj40Var2;
                    q3aVar.b(new buz(12, new ajf(nk40Var, ave0Var.b(), 1), new ik40(nk40Var, ave0Var.b(), z2)), false);
                    oon0Var4 = new oon0("radiostations_add", null, false, false, 14);
                } else {
                    if (yj40Var2 instanceof bve0) {
                        bve0 bve0Var = (bve0) yj40Var2;
                        q3aVar.b(new buz(12, new ajf(nk40Var, bve0Var.b(), 1), new ik40(nk40Var, bve0Var.b(), z)), false);
                        oon0Var3 = new oon0("radiostations_remove", null, false, false, 14);
                    } else {
                        if (yj40Var2 instanceof xo50) {
                            oon0Var = new oon0("links_subscribe", null, false, false, 14);
                        } else if (yj40Var2 instanceof yo50) {
                            oon0Var = new oon0("links_unsubscribe", null, false, false, 14);
                        } else if (yj40Var2 instanceof tjb0) {
                            tjb0 tjb0Var = (tjb0) yj40Var2;
                            q3aVar.b(new buz(12, new bp7(22, nk40Var, tjb0Var.b()), new hk40(nk40Var, tjb0Var.b(), z)), false);
                            oon0Var3 = new oon0("podcasts_unsubscribe", null, false, false, 14);
                        } else if (yj40Var2 instanceof ljb0) {
                            ljb0 ljb0Var = (ljb0) yj40Var2;
                            q3aVar.b(new buz(12, new bp7(22, nk40Var, ljb0Var.b()), new hk40(nk40Var, ljb0Var.b(), z2)), false);
                            oon0Var4 = new oon0("podcasts_subscribe", null, false, false, 14);
                        } else if (yj40Var2 instanceof wj4) {
                            wj4 wj4Var = (wj4) yj40Var2;
                            q3aVar.b(new buz(12, new v5b(nk40Var, wj4Var.b(), 2), new dc1(nk40Var, wj4Var.b(), z2)), false);
                            oon0Var4 = new oon0("audio_books_subscribe", null, false, false, 14);
                        } else if (yj40Var2 instanceof zj4) {
                            zj4 zj4Var = (zj4) yj40Var2;
                            q3aVar.b(new buz(12, new v5b(nk40Var, zj4Var.b(), 2), new dc1(nk40Var, zj4Var.b(), z)), false);
                            oon0Var3 = new oon0("audio_books_unsubscribe", null, false, false, 14);
                        } else {
                            if (yj40Var2 instanceof b9b0) {
                                boolean z3 = ((b9b0) yj40Var2).c;
                                oon0Var2 = new oon0(z3 ? "music_playlists_follow" : "music_playlists_unfollow", null, z3, z3, 2);
                            } else if (yj40Var2 instanceof i8b0) {
                                oon0Var = new oon0("music_playlists_add", null, true, true, 2);
                            } else if (yj40Var2 instanceof u8b0) {
                                oon0Var = new oon0("music_playlists_add", null, false, false, 14);
                            } else if (yj40Var2 instanceof gcb0) {
                                oon0Var = new oon0("music_playlists_remove", null, false, false, 14);
                            } else if (yj40Var2 instanceof n8b0) {
                                n8b0 n8b0Var = (n8b0) yj40Var2;
                                Playlist playlist = n8b0Var.a;
                                if (epx.f(playlist.H, DownloadingState.NotLoaded.b)) {
                                    q3aVar.b(new mon0(CatalogDataType.DATA_TYPE_MUSIC_RECOMMENDED_PLAYLISTS), false);
                                    n3aVar = new mon0(CatalogDataType.DATA_TYPE_MUSIC_PLAYLISTS);
                                } else {
                                    Playlist playlist2 = n8b0Var.b;
                                    n3aVar = new buz(8, new b1a(22, nk40Var, playlist2), new cr3(nk40Var, playlist2, playlist, 3));
                                }
                            } else if (yj40Var2 instanceof elk) {
                                elk elkVar = (elk) yj40Var2;
                                oon0Var2 = new oon0(elkVar.b() ? "curator_subscribe" : "curator_unsubscribe", null, elkVar.b(), elkVar.b(), 2);
                            } else if (yj40Var2 instanceof uq3) {
                                oon0Var2 = new oon0(((uq3) yj40Var2).b() ? "artist_subscribe" : "artist_unsubscribe", null, false, false, 14);
                            } else if (yj40Var2 instanceof xeb0) {
                                Playlist playlist3 = ((xeb0) yj40Var2).a;
                                n3aVar = new buz(12, new b1a(22, nk40Var, playlist3), new cr3(nk40Var, playlist3, playlist3, 3));
                            } else if (yj40Var2 instanceof reb0) {
                                reb0 reb0Var = (reb0) yj40Var2;
                                n3aVar = new buz(12, new isg(reb0Var.a, nk40Var, reb0Var.b(), 4), new bc1(6, nk40Var, reb0Var.b()));
                            } else if ((yj40Var2 instanceof oe50) || epx.f(yj40Var2, v350.a)) {
                                n3aVar = new mon0(CatalogDataType.DATA_TYPE_MUSIC_TRACKS);
                            } else if (yj40Var2 instanceof ehb0) {
                                oon0Var = new oon0("podcast_episodes_mark_as_listened", null, false, false, 14);
                            } else if (epx.f(yj40Var2, lh4.a)) {
                                oon0Var = new oon0("audio_books_mark_as_listened", null, false, false, 14);
                            }
                            n3aVar = oon0Var2;
                        }
                        n3aVar = oon0Var;
                    }
                    n3aVar = oon0Var3;
                }
                n3aVar = oon0Var4;
            }
        }
        if (n3aVar != null) {
            q3aVar.b(n3aVar, false);
        }
        return s3q0.a;
    }
}
