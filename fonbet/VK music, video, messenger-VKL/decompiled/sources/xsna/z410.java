package xsna;

import android.content.Context;
import android.graphics.Typeface;
import android.view.ViewGroup;
import com.vk.api.generated.kidsCollection.dto.KidsCollectionAddPlaylistResponseDto;
import com.vk.core.preference.Preference;
import com.vk.core.store.entity.models.StoriesEventsStack;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.id.UserId;
import com.vk.dto.donut.DonutLevel;
import com.vk.dto.music.PlaylistLink;
import com.vk.dto.stories.model.DiscoverStubStoriesContainer;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.log.L;
import com.vk.music.player.PlaySourceMeta;
import com.vk.music.player.PlayerTrack;
import com.vk.music.player.playback.PlaybackLaunchMeta;
import com.vk.superapp.miniapp.MenuApiApplicationsCache;
import com.vk.typography.Font;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import com.vk.voip.OKVoipEngine;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.dz40;
import xsna.ha70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class z410 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ z410(int i) {
        this.b = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x010b, code lost:
    
        if (r4.equals("track_mix") == false) goto L70;
     */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        dz40.h.a aVar;
        dz40.h.a aVar2;
        PlaybackLaunchMeta playbackLaunchMeta;
        switch (this.b) {
            case 0:
                return ((x410) obj).o;
            case 1:
                MenuApiApplicationsCache menuApiApplicationsCache = MenuApiApplicationsCache.b;
                Preference.C("menu_items_vk_apps", (String) MenuApiApplicationsCache.d.getValue());
                MenuApiApplicationsCache.e.remove(MenuApiApplicationsCache.AppsType.GAME);
                return s3q0.a;
            case 2:
                k720 k720Var = k720.a;
                k720.Y(null);
                k720.T(false);
                io.reactivex.rxjava3.disposables.c cVar = k720.D;
                if (cVar != null) {
                    cVar.dispose();
                }
                return s3q0.a;
            case 3:
                return s3q0.a;
            case 4:
                KidsCollectionAddPlaylistResponseDto kidsCollectionAddPlaylistResponseDto = (KidsCollectionAddPlaylistResponseDto) obj;
                Integer d = kidsCollectionAddPlaylistResponseDto.d();
                int intValue = d != null ? d.intValue() : 0;
                UserId q = kidsCollectionAddPlaylistResponseDto.q();
                if (q == null) {
                    q = UserId.d;
                }
                return new PlaylistLink(intValue, q, null, 4, null);
            case 5:
                return new ArrayList();
            case 6:
                return Boolean.valueOf(((NestedMsg) obj).b == NestedMsg.Type.FWD);
            case 7:
                return new czm0((ViewGroup) obj);
            case 8:
                yk60.m.set(false);
                yk60.a(null, 3);
                return s3q0.a;
            case 9:
                return new ha70.v((ApiApplication) obj);
            case 10:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                xot xotVar = OKVoipEngine.j;
                xotVar.c = booleanValue;
                xotVar.a.invoke(Boolean.valueOf(booleanValue && xotVar.b));
                return s3q0.a;
            case 11:
                return new yn90((ViewGroup) obj);
            case 12:
                Boolean invoke = Preference.g.invoke((String) obj);
                invoke.booleanValue();
                return invoke;
            case 13:
                return Integer.valueOf(((DonutLevel) obj).b);
            case 14:
                qgi0.r((tgi0) obj, "product_card_cta_call_primary_button_subtext");
                return s3q0.a;
            case 15:
                return PublishState.a((PublishState) obj, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, false, null, null, false, false, null, false, false, null, false, false, false, false, -4097, 2047);
            case 16:
                return Boolean.valueOf(((sy40) obj).C);
            case 17:
                return s3q0.a;
            case 18:
                sy40 sy40Var = (sy40) obj;
                PlayerTrack playerTrack = sy40Var.d;
                PlaySourceMeta playSourceMeta = (playerTrack == null || (playbackLaunchMeta = playerTrack.c) == null) ? null : playbackLaunchMeta.e;
                String str = sy40Var.x;
                if (playSourceMeta instanceof PlaySourceMeta.PlaylistPlaySourceMeta) {
                    PlaySourceMeta.PlaylistPlaySourceMeta playlistPlaySourceMeta = (PlaySourceMeta.PlaylistPlaySourceMeta) playSourceMeta;
                    if (epx.f(playlistPlaySourceMeta, (PlaySourceMeta.PlaylistPlaySourceMeta) PlaySourceMeta.PlaylistPlaySourceMeta.h.getValue())) {
                        aVar = new dz40.h.a(R.string.music_player_header_default_source, null, false);
                    } else {
                        boolean z = playlistPlaySourceMeta.c;
                        String str2 = playlistPlaySourceMeta.b;
                        aVar2 = z ? new dz40.h.a(R.string.music_player_header_album_source, str2, true) : new dz40.h.a(R.string.music_player_header_playlist_source, str2, true);
                        aVar = aVar2;
                    }
                } else {
                    boolean z2 = playSourceMeta instanceof PlaySourceMeta.SimilarTrackPlaySourceMeta;
                    int i = R.string.music_player_header_track_mix_source;
                    if (z2) {
                        aVar2 = new dz40.h.a(R.string.music_player_header_track_mix_source, ((PlaySourceMeta.SimilarTrackPlaySourceMeta) playSourceMeta).b, true);
                    } else if (playSourceMeta instanceof PlaySourceMeta.VKMixPlaySourceMeta) {
                        PlaySourceMeta.VKMixPlaySourceMeta vKMixPlaySourceMeta = (PlaySourceMeta.VKMixPlaySourceMeta) playSourceMeta;
                        Integer num = vKMixPlaySourceMeta.c;
                        String str3 = vKMixPlaySourceMeta.e;
                        if (num == null) {
                            switch (str3.hashCode()) {
                                case -469406254:
                                    if (str3.equals("my_music")) {
                                        i = R.string.music_player_header_mix_my_music_source;
                                        break;
                                    }
                                    i = R.string.music_player_header_vkmix_source;
                                    break;
                                case 249791628:
                                    if (str3.equals("album_mix")) {
                                        i = R.string.music_player_header_mix_album_source;
                                        break;
                                    }
                                    i = R.string.music_player_header_vkmix_source;
                                    break;
                                case 580525679:
                                    if (str3.equals("playlist_mix")) {
                                        i = R.string.music_player_header_mix_playlist_source;
                                        break;
                                    }
                                    i = R.string.music_player_header_vkmix_source;
                                    break;
                                case 630241636:
                                    if (str3.equals("artist_mix")) {
                                        i = R.string.music_player_header_mix_artist_source;
                                        break;
                                    }
                                    i = R.string.music_player_header_vkmix_source;
                                    break;
                                case 730147176:
                                    break;
                                default:
                                    i = R.string.music_player_header_vkmix_source;
                                    break;
                            }
                        } else {
                            i = num.intValue();
                        }
                        aVar = new dz40.h.a(i, epx.f(str3, "my_music") ? null : cqm0.a(vKMixPlaySourceMeta.b), vKMixPlaySourceMeta.d);
                    } else if (playSourceMeta instanceof PlaySourceMeta.CatalogPlaySourceMeta) {
                        aVar2 = new dz40.h.a(R.string.music_player_header_open_source, ((PlaySourceMeta.CatalogPlaySourceMeta) playSourceMeta).b, true);
                    } else {
                        aVar = new dz40.h.a(R.string.music_player_header_default_source, null, false);
                    }
                    aVar = aVar2;
                }
                return str != null ? new dz40.h.b(aVar.a, aVar.b, aVar.c, str) : aVar;
            case 19:
                return new p8u0((Context) obj, false, 14);
            case 20:
                return ((kt0) obj).a;
            case 21:
                Float f = (Float) obj;
                f.floatValue();
                int i2 = dbi0.r1;
                return f;
            case 22:
                ((Boolean) obj).booleanValue();
                return s3q0.a;
            case 23:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 24:
                ArrayList arrayList = cul0.c;
                arrayList.clear();
                arrayList.addAll(((StoriesEventsStack) obj).d());
                return s3q0.a;
            case 25:
                return Integer.valueOf(((k9l0) obj).i);
            case 26:
                L.l("Failed to load stickers for reactions");
                return s3q0.a;
            case 27:
                return new w6m0();
            case 28:
                return Boolean.valueOf(((StoriesContainer) obj) instanceof DiscoverStubStoriesContainer);
            default:
                Typeface a = cqi.a(Font.Companion, FontFamily.REGULAR, 13.0f, (Context) obj);
                TextSizeUnit textSizeUnit = TextSizeUnit.SP;
                return a;
        }
    }

    public /* synthetic */ z410(llf0 llf0Var) {
        this.b = 18;
    }
}
