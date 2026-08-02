package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.messages.dto.MessagesCountersFilterDto;
import com.vk.api.generated.stickers.dto.StickersPopupSettingsAutoplayDto;
import com.vk.api.generated.stickers.dto.StickersPopupSettingsDto;
import com.vk.api.generated.stickers.dto.StickersSetPopupSettingsResponseDto;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionSwitchSection;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicMainNavigation;
import com.vk.core.serialize.Serializer;
import com.vk.dto.video.VideoAlbum;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.music.bottomsheets.MusicBottomSheetLaunchPoint;
import com.vk.music.player.PlayerTrack;
import com.vk.newsfeed.impl.presentation.newsfeed_custom.presentation.fragment.NewsfeedCustomFragment2;
import com.vk.newsfeed.impl.presentation.search.presentation.fragment.NewsfeedSearchFragment;
import com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerState;
import com.vk.photos.ui.album.PhotoAlbumFragment;
import com.vk.photos.ui.album_list.AlbumImageView;
import com.vk.photos.ui.profile.ProfileMainPhotosFragment;
import com.vk.voip.ui.actions.feature.VoipActionsFeatureState;
import com.vkontakte.android.R;
import java.util.Map;
import java.util.Optional;
import kotlin.collections.EmptyList;
import one.video.exo.offline.DownloadInfo;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;
import xsna.dug0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class z7w implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ z7w(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        StickersPopupSettingsDto d;
        StickersPopupSettingsAutoplayDto d2;
        switch (this.b) {
            case 0:
                return "(id = ? AND type = ?)";
            case 1:
                return new ybx0(0);
            case 2:
                return Boolean.valueOf(((x410) obj).s);
            case 3:
                return ((MessagesCountersFilterDto) obj).i();
            case 4:
                return s3q0.a;
            case 5:
                return s3q0.a;
            case 6:
                return new MusicBottomSheetLaunchPoint.Player.Messenger((PlayerTrack) obj);
            case 7:
                return ((MusicPickerState) obj).l;
            case 8:
                return ((dug0.c) obj).c;
            case 9:
                qcy<Object>[] qcyVarArr = NewsfeedCustomFragment2.r0;
                return ((zg60) obj).c.c;
            case 10:
                qcy<Object>[] qcyVarArr2 = NewsfeedSearchFragment.p0;
                return Boolean.valueOf(((wy60) obj).c.e);
            case 11:
                return Boolean.valueOf(((BaseOkResponseDto) obj) == BaseOkResponseDto.OK);
            case 12:
                return s3q0.a;
            case 13:
                return fpf0.a(((jv80) obj).getClass());
            case 14:
                int i = PhotoAlbumFragment.r0;
                qgi0.r((tgi0) obj, "toolbar_icon_revert");
                return s3q0.a;
            case 15:
                x6e0 x6e0Var = (x6e0) obj;
                return new x6e0(x6e0Var.b, x6e0Var.a, x6e0Var.e, x6e0Var.f, x6e0Var.c, x6e0Var.d, x6e0Var.h, x6e0Var.g, x6e0Var.j, x6e0Var.i, x6e0Var.l, x6e0Var.k, x6e0Var.n, x6e0Var.m, x6e0Var.p, x6e0Var.o, x6e0Var.q, x6e0Var.r);
            case 16:
                StickersSetPopupSettingsResponseDto stickersSetPopupSettingsResponseDto = (StickersSetPopupSettingsResponseDto) obj;
                if (stickersSetPopupSettingsResponseDto == null || (d = stickersSetPopupSettingsResponseDto.d()) == null || (d2 = d.d()) == null) {
                    return null;
                }
                return yal0.c(d2);
            case 17:
                View view = (View) obj;
                int i2 = ProfileMainPhotosFragment.F0;
                ViewGroup.LayoutParams layoutParams = view.findViewById(R.id.content).getLayoutParams();
                layoutParams.width = -1;
                layoutParams.height = -2;
                AlbumImageView albumImageView = (AlbumImageView) view.findViewById(R.id.cover);
                albumImageView.getLayoutParams().width = -1;
                albumImageView.setQuad(true);
                return s3q0.a;
            case 18:
                qgi0.r((tgi0) obj, "errorImage");
                return s3q0.a;
            case 19:
                return Boolean.TRUE;
            case 20:
                qgi0.r((tgi0) obj, "search_address_input_custom_address");
                return s3q0.a;
            case 21:
                return Boolean.valueOf(((Float) obj).floatValue() > 0.1f);
            case 22:
                return ((bq) obj).a;
            case 23:
                Throwable th = (Throwable) obj;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{ms9.b("finish error preload=", th)});
                }
                return s3q0.a;
            case 24:
                qgi0.r((tgi0) obj, "ToolbarTags.BUTTON_DONE");
                return s3q0.a;
            case 25:
                Serializer.c<UIBlockMusicMainNavigation> cVar = UIBlockMusicMainNavigation.CREATOR;
                return ((UIBlockActionSwitchSection) obj).b;
            case 26:
                return EmptyList.b;
            case 27:
                return Boolean.valueOf(((DownloadInfo) ((Map.Entry) obj).getValue()).b.length == 0);
            case 28:
                return Optional.of((VideoAlbum) obj);
            default:
                return new VoipActionsFeatureState.m(true, (CallsAudioDeviceInfo) obj);
        }
    }
}
