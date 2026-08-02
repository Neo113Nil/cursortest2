package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.communitySubscriptions.dto.CommunitySubscriptionsGetPricingInfoResponseDto;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.music.Artist;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Thumb;
import com.vk.im.ui.views.avatars.StackAvatarView;
import com.vk.music.player.PlayerTrack;
import com.vk.newsfeed.common.presentation.newsfeed.ListLoadingState;
import com.vk.newsfeed.impl.presentation.newsfeed_custom.presentation.fragment.NewsfeedCustomFragment2;
import com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerList;
import com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerState;
import com.vk.video.ui.smartcrop.impl.presentation.feature.entity.SmartCropState;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import xsna.erx;
import xsna.gfp0;
import xsna.it80;
import xsna.l110;
import xsna.t6k0;
import xsna.tj50;
import xsna.tyh0;
import xsna.v9i0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class h2w implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ h2w(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                it80.b.getClass();
                return it80.a.a();
            case 1:
                return Boolean.valueOf(((erx) obj) instanceof erx.b);
            case 2:
                return Boolean.valueOf(((BaseOkResponseDto) obj) == BaseOkResponseDto.OK);
            case 3:
                return new l110.d(((tj50.a) obj).a(new b4r(11), ao8.d));
            case 4:
                VkPlaceholder vkPlaceholder = new VkPlaceholder(((ViewGroup) obj).getContext(), null, 6, 0);
                vkPlaceholder.setId(R.id.market_picker_empty_search_placeholder);
                vkPlaceholder.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                vkPlaceholder.setMiddle(new VkPlaceholder.b(new VkPlaceholder.b.c(2, (tlo0) null), new VkPlaceholder.b.C0859b(14, tq.h(tlo0.Companion, R.string.attach_multipicker_market_search_empty))));
                return new u540(vkPlaceholder);
            case 5:
                w6e0 w6e0Var = (w6e0) obj;
                return new w6e0(w6e0Var.b, w6e0Var.a, w6e0Var.e, w6e0Var.f, w6e0Var.c, w6e0Var.d, w6e0Var.h, w6e0Var.g, w6e0Var.j, w6e0Var.i, w6e0Var.l, w6e0Var.k, w6e0Var.n, w6e0Var.m, w6e0Var.p, w6e0Var.o, w6e0Var.q, w6e0Var.r);
            case 6:
                return s3q0.a;
            case 7:
                qgi0.r((tgi0) obj, "vk_top_bar_back_btn");
                return s3q0.a;
            case 8:
                qgi0.r((tgi0) obj, "vk_top_bar_title");
                return s3q0.a;
            case 9:
                MusicPickerList musicPickerList = (MusicPickerList) j5g.k0(((MusicPickerState) obj).j);
                return Boolean.valueOf(((musicPickerList instanceof MusicPickerList.Tracks) || (musicPickerList instanceof MusicPickerList.Playlists)) && qu40.l(musicPickerList));
            case 10:
                return ((xhp0) ((whp0) obj)).a.b;
            case 11:
                bn40.c((Throwable) obj, new Object[0]);
                return s3q0.a;
            case 12:
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 13:
                xf60 xf60Var = (xf60) obj;
                qcy<Object>[] qcyVarArr = NewsfeedCustomFragment2.r0;
                String str = xf60Var.b;
                ur60 ur60Var = xf60Var.d;
                return new zg60(str, js60.a(ur60Var), ur60Var.b.a.isEmpty() && !ur60Var.g && !ur60Var.f && ur60Var.e == ListLoadingState.IDLE);
            case 14:
                ti60 ti60Var = (ti60) obj;
                return Boolean.valueOf((!ti60Var.c.isEmpty() || ti60Var.d || ti60Var.e) ? false : true);
            case 15:
                return new ArrayList();
            case 16:
                ((Long) obj).longValue();
                return s3q0.a;
            case 17:
                qgi0.r((tgi0) obj, "order_new_badge");
                return s3q0.a;
            case 18:
                CommunitySubscriptionsGetPricingInfoResponseDto communitySubscriptionsGetPricingInfoResponseDto = (CommunitySubscriptionsGetPricingInfoResponseDto) obj;
                return new qma0(communitySubscriptionsGetPricingInfoResponseDto.S1(), communitySubscriptionsGetPricingInfoResponseDto.d(), communitySubscriptionsGetPricingInfoResponseDto.getTitle(), communitySubscriptionsGetPricingInfoResponseDto.getDescription(), communitySubscriptionsGetPricingInfoResponseDto.f(), communitySubscriptionsGetPricingInfoResponseDto.e());
            case 19:
                qgi0.r((tgi0) obj, "MusicPickerPlaylistsEntryPointChevron");
                return s3q0.a;
            case 20:
                PlayerTrack playerTrack = ((sy40) obj).d;
                if (playerTrack == null) {
                    return gfp0.c.g;
                }
                String str2 = playerTrack.f;
                Thumb Jb = playerTrack.b.Jb();
                if (Jb == null) {
                    Jb = lso0.a;
                }
                MusicTrack musicTrack = playerTrack.b;
                String str3 = musicTrack.d;
                String str4 = "";
                if (str3 == null) {
                    str3 = "";
                }
                ucp ucpVar = ucp.a;
                StringBuilder sb = new StringBuilder();
                List<Artist> list = musicTrack.t;
                if (list != null) {
                    str4 = s490.i(list);
                } else {
                    String str5 = musicTrack.h;
                    if (str5 != null) {
                        str4 = str5;
                    }
                }
                sb.append(str4);
                sb.append(' ');
                sb.append(s490.c(musicTrack.u));
                return new gfp0.c(str2, Jb, str3, ucp.i(drm0.p0(sb.toString()).toString()).toString(), playerTrack.b.Lb(), jnj.d(playerTrack.b.V));
            case 21:
                return Boolean.valueOf(fkq0.c(((UIBlock) obj).g));
            case 22:
                return (llh0) ((it80) obj).a;
            case 23:
                return new tyh0.a(new onh0(), ((u4a) obj).b.I, 4);
            case 24:
                return ((v9i0.c) obj).d;
            case 25:
                return SmartCropState.a((SmartCropState) obj, null, null, null, null, 0L, false, null, false, false, null, 1663);
            case 26:
                t6k0 t6k0Var = (t6k0) obj;
                if (!(t6k0Var instanceof t6k0.b) && (!(t6k0Var instanceof t6k0.a) || !((t6k0.a) t6k0Var).b)) {
                    r3 = false;
                }
                return Boolean.valueOf(r3);
            case 27:
                return Float.valueOf(((View) obj).getX());
            case 28:
                int i = StackAvatarView.n;
                Serializer.c<ImageList> cVar = ImageList.CREATOR;
                return ImageList.a.c(-1, -1, (String) obj);
            default:
                return Boolean.valueOf(((nov) obj) instanceof z7c0);
        }
    }

    public /* synthetic */ h2w(Object obj, int i) {
        this.b = i;
    }
}
