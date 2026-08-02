package xsna;

import android.content.Context;
import android.view.ViewGroup;
import com.google.gson.Gson;
import com.vk.api.base.VkPaginationList;
import com.vk.api.generated.audio.dto.AudioAddErrorDto;
import com.vk.api.generated.audio.dto.AudioAddResponseDto;
import com.vk.api.generated.audio.dto.AudioAddResultDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetChallengeResponseDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.core.utils.newtork.d;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.stickers.ImageConfigId;
import com.vk.dto.stickers.StickerAnimation;
import com.vk.dto.stickers.StickerRender;
import com.vk.dto.stickers.popup.PopupStickerAnimation;
import com.vk.im.ui.components.msg_search.domain.model.PeersSearchBlock;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.libvideo.ui.VideoAuthorView;
import com.vk.log.L;
import com.vk.newsfeed.common.presentation.newsfeed.ListLoadingState;
import com.vk.newsfeed.impl.presentation.postponed.presentation.fragment.PostponedPostsFragment;
import com.vk.repository.internal.repos.stickers.database.converters.dto.ImageConfigIdDto;
import com.vk.repository.internal.repos.stickers.database.converters.dto.PopupStickerAnimationDto;
import com.vk.repository.internal.repos.stickers.database.converters.dto.StickerAnimationDto;
import com.vk.repository.internal.repos.stickers.database.converters.dto.StickerRenderDto;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vkontakte.android.R;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class e420 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ e420(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ImageConfigId imageConfigId;
        StickerRender stickerRender;
        PopupStickerAnimation d;
        float f;
        int i = 1;
        int i2 = 0;
        switch (this.b) {
            case 0:
                return new ArrayList((List) obj);
            case 1:
                AudioAddResponseDto audioAddResponseDto = (AudioAddResponseDto) obj;
                List<AudioAddResultDto> e = audioAddResponseDto.e();
                List<AudioAddErrorDto> d2 = audioAddResponseDto.d();
                List<AudioAddResultDto> list = e;
                if (list == null || list.isEmpty()) {
                    List<AudioAddErrorDto> list2 = d2;
                    if (list2 != null && !list2.isEmpty()) {
                        throw new VKApiException(((AudioAddErrorDto) j5g.Y(d2)).d());
                    }
                } else {
                    i2 = ((AudioAddResultDto) j5g.Y(e)).d();
                }
                return Integer.valueOf(i2);
            case 2:
                return ((PeersSearchBlock.b) obj).b;
            case 3:
                return Boolean.valueOf(!(((com.vk.core.utils.newtork.d) obj) instanceof d.b));
            case 4:
                return Boolean.valueOf(((u0a) obj) instanceof cfp0);
            case 5:
                bn40.c((Throwable) obj, new Object[0]);
                return s3q0.a;
            case 6:
                L.l("OKVoipAudioManager", ms9.b("calling onError=", (Throwable) obj));
                return s3q0.a;
            case 7:
                ((Integer) obj).intValue();
                return s3q0.a;
            case 8:
                UsersUserFullDto usersUserFullDto = (UsersUserFullDto) j5g.a0((List) obj);
                if (usersUserFullDto != null) {
                    return j2r0.a(usersUserFullDto);
                }
                return null;
            case 9:
                return new ap90((ViewGroup) obj);
            case 10:
                return ((ibb0) obj).e;
            case 11:
                qgi0.r((tgi0) obj, "PollExitDialogTitle");
                return s3q0.a;
            case 12:
                Throwable th = (Throwable) obj;
                if (th instanceof VKApiExecutionException) {
                    Context context = e43.a;
                    if (context == null) {
                        context = null;
                    }
                    j03.i(context, (VKApiExecutionException) th);
                }
                return s3q0.a;
            case 13:
                qcy<Object>[] qcyVarArr = PostponedPostsFragment.q0;
                ur60 ur60Var = ((nsc0) obj).c;
                sq60 sq60Var = ur60Var.b;
                return new htc0(sq60Var, ur60Var.e, ur60Var.f, ur60Var.g, sq60Var.a.isEmpty() && !ur60Var.g && !ur60Var.f && ur60Var.e == ListLoadingState.IDLE);
            case 14:
                Throwable th2 = (Throwable) obj;
                if (th2 instanceof VKApiExecutionException) {
                    j03.a.getClass();
                    j03.k((VKApiExecutionException) th2);
                } else {
                    cvk.u(R.string.live_network_error_description, false);
                }
                return s3q0.a;
            case 15:
                return new qra().a((ShortVideoGetChallengeResponseDto) obj);
            case 16:
                qyg0 V0 = ((hyg0) obj).V0("SELECT `recents_stickers`.`id` AS `id`, `recents_stickers`.`productId` AS `productId`, `recents_stickers`.`images` AS `images`, `recents_stickers`.`imagesWithBackground` AS `imagesWithBackground`, `recents_stickers`.`config` AS `config`, `recents_stickers`.`animations` AS `animations`, `recents_stickers`.`isAllowed` AS `isAllowed`, `recents_stickers`.`render` AS `render`, `recents_stickers`.`vmojiCharacter` AS `vmojiCharacter`, `recents_stickers`.`popup` AS `popup`, `recents_stickers`.`order` AS `order` FROM recents_stickers ORDER BY `order`");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (V0.step()) {
                        int i3 = (int) V0.getLong(0);
                        int i4 = (int) V0.getLong(i);
                        ImageList a = psj.a(V0.l2(2));
                        if (a == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.vk.dto.common.im.ImageList', but it was NULL.");
                        }
                        ImageList a2 = psj.a(V0.l2(3));
                        if (a2 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.vk.dto.common.im.ImageList', but it was NULL.");
                        }
                        String l2 = V0.isNull(4) ? null : V0.l2(4);
                        if (l2 == null) {
                            imageConfigId = null;
                        } else {
                            ImageConfigIdDto imageConfigIdDto = (ImageConfigIdDto) psj.a.fromJson(l2, ImageConfigIdDto.class);
                            imageConfigId = imageConfigIdDto != null ? new ImageConfigId(imageConfigIdDto.b(), imageConfigIdDto.a()) : null;
                        }
                        String l22 = V0.l2(5);
                        Gson gson = psj.a;
                        StickerAnimationDto stickerAnimationDto = (StickerAnimationDto) gson.fromJson(l22, StickerAnimationDto.class);
                        StickerAnimation stickerAnimation = stickerAnimationDto != null ? new StickerAnimation(stickerAnimationDto.a(), stickerAnimationDto.b()) : null;
                        if (stickerAnimation == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.vk.dto.stickers.StickerAnimation', but it was NULL.");
                        }
                        int i5 = i;
                        boolean z = ((int) V0.getLong(6)) != 0 ? i5 : 0;
                        String l23 = V0.isNull(7) ? null : V0.l2(7);
                        if (l23 == null) {
                            stickerRender = null;
                        } else {
                            StickerRenderDto stickerRenderDto = (StickerRenderDto) gson.fromJson(l23, StickerRenderDto.class);
                            stickerRender = stickerRenderDto != null ? new StickerRender(stickerRenderDto.a(), en00.l(stickerRenderDto.b()), en00.l(stickerRenderDto.c()), stickerRenderDto.e(), stickerRenderDto.d()) : null;
                        }
                        String l24 = V0.isNull(8) ? null : V0.l2(8);
                        String l25 = V0.isNull(9) ? null : V0.l2(9);
                        if (l25 == null) {
                            d = null;
                        } else {
                            PopupStickerAnimationDto popupStickerAnimationDto = (PopupStickerAnimationDto) gson.fromJson(l25, PopupStickerAnimationDto.class);
                            d = popupStickerAnimationDto != null ? en00.d(popupStickerAnimationDto) : null;
                        }
                        arrayList.add(new f4l0(i3, i4, a, a2, imageConfigId, stickerAnimation, z, stickerRender, l24, d, (int) V0.getLong(10)));
                        i = i5;
                    }
                    V0.close();
                    return arrayList;
                } catch (Throwable th3) {
                    V0.close();
                    throw th3;
                }
            case 17:
                qof0 qof0Var = (qof0) obj;
                return new apf0(qof0Var.a, qof0Var.d(), qof0Var.b());
            case 18:
                return s3q0.a;
            case 19:
                return s3q0.a;
            case 20:
                return s3q0.a;
            case 21:
                L.g("Error on get session rooms list", (Throwable) obj);
                return s3q0.a;
            case 22:
                j03.l((Throwable) obj);
                return s3q0.a;
            case 23:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (!booleanValue) {
                    f = 0.64f;
                } else {
                    if (!booleanValue) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f = 1.0f;
                }
                return Float.valueOf(f);
            case 24:
                qgi0.r((tgi0) obj, "back_button");
                return s3q0.a;
            case 25:
                return ((com.vk.upload.impl.b) obj).s();
            case 26:
                Pair pair = (Pair) obj;
                return new VkPaginationList((List) pair.i(), 0, ((Boolean) pair.j()).booleanValue(), 0, 10, null);
            case 27:
                return new ByteArrayInputStream((byte[]) obj);
            case 28:
                int i6 = VideoAuthorView.l;
                return s3q0.a;
            default:
                int i7 = VideoMinimizableDiscoveryFragment.p1;
                return Boolean.valueOf(com.vk.libvideo.api.minimizable.a.g((VideoMinimizableState) obj));
        }
    }

    public /* synthetic */ e420(j2r0 j2r0Var) {
        this.b = 8;
    }
}
