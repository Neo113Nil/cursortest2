package xsna;

import android.content.Context;
import com.google.gson.Gson;
import com.vk.api.generated.account.dto.AccountGetEmailResponseDto;
import com.vk.api.generated.audioBooks.dto.AudioBooksGetAudioBookByIdResponseDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.clips.coauthors.selector.presentation.state.ClipsCoauthorsSelectorMviState;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.Peer;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.stickers.ImageConfigId;
import com.vk.dto.stickers.StickerAnimation;
import com.vk.dto.stickers.StickerRender;
import com.vk.dto.stickers.popup.PopupStickerAnimation;
import com.vk.dto.user.RequestUserProfile;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import com.vk.im.engine.models.messages.Msg;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.repository.internal.repos.stickers.database.converters.dto.ImageConfigIdDto;
import com.vk.repository.internal.repos.stickers.database.converters.dto.PopupStickerAnimationDto;
import com.vk.repository.internal.repos.stickers.database.converters.dto.StickerAnimationDto;
import com.vk.repository.internal.repos.stickers.database.converters.dto.StickerRenderDto;
import com.vk.video.ui.upload.impl.publish.presentation.albumchoose.feature.entity.AlbumChooseState;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.g9k;
import xsna.ij20;
import xsna.k840;
import xsna.noa;
import xsna.ols;
import xsna.pqc;
import xsna.r7a;
import xsna.tj50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class p60 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ p60(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i;
        ImageConfigIdDto imageConfigIdDto;
        StickerRenderDto stickerRenderDto;
        PopupStickerAnimationDto popupStickerAnimationDto;
        switch (this.b) {
            case 0:
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.i, new Object[]{"Offline:ActionSynchronizerInteractorImpl", "Deleting synced actions."});
                }
                return s3q0.a;
            case 1:
                return AlbumChooseState.a((AlbumChooseState) obj, null, null, 0, false, false, true, 95);
            case 2:
                return drm0.p0((String) obj).toString();
            case 3:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (booleanValue) {
                    i = R.string.music_talkback_player_pause;
                } else {
                    if (booleanValue) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R.string.music_talkback_player_audiobook_play;
                }
                return Integer.valueOf(i);
            case 4:
                AudioBook a = eg4.a(((AudioBooksGetAudioBookByIdResponseDto) obj).d());
                qh4 a2 = k840.a.a();
                bpn0 bpn0Var = o25.a;
                if (bpn0Var == null) {
                    bpn0Var = null;
                }
                a2.B(((b25) bpn0Var.getValue()).c(), a);
                return a;
            case 5:
                ((gzs) obj).invoke();
                return s3q0.a;
            case 6:
                return ((pno0) obj).d().toString();
            case 7:
                ((RequestUserProfile) obj).s.putInt("friend_request_status", -3);
                return s3q0.a;
            case 8:
                qgi0.r((tgi0) obj, "cart_summary_price");
                return s3q0.a;
            case 9:
                return io.reactivex.rxjava3.core.q.H((Throwable) obj);
            case 10:
                return ((r7a.a) ((r7a) obj)).b;
            case 11:
                VkCell vkCell = new VkCell((Context) obj, null, 6, 0);
                vkCell.setLeftMainAvatarController(new noa.i());
                vkCell.setLeftMainPictureController(new noa.m());
                vkCell.setLeftMainViewController(new noa.k());
                vkCell.setRightExtraViewController(new noa.o());
                vkCell.setRightExtraActionPictureController(new noa.m());
                vkCell.setTitleAfterController(new noa.q());
                return vkCell;
            case 12:
                return Integer.valueOf(((Msg) obj).d);
            case 13:
                return new yeb(new wpp(), new ProfilesInfo());
            case 14:
                pqc.a aVar = (pqc.a) obj;
                if (aVar instanceof pqc.a.b) {
                    return ((pqc.a.b) aVar).a;
                }
                if (aVar instanceof pqc.a.c) {
                    return ((pqc.a.c) aVar).a;
                }
                if (aVar instanceof pqc.a.C3527a) {
                    throw ((pqc.a.C3527a) aVar).a;
                }
                if (aVar instanceof pqc.a.d) {
                    throw new IllegalStateException("Uninitialized state should not be here");
                }
                throw new NoWhenBranchMatchedException();
            case 15:
                return new w0h0(false, Integer.valueOf(((ClipsCoauthorsSelectorMviState.d) obj).c.size()));
            case 16:
                Throwable th = (Throwable) obj;
                if (th instanceof VKApiExecutionException) {
                    j03.a.getClass();
                    j03.k((VKApiExecutionException) th);
                } else {
                    cvk.u(R.string.live_network_error_description, false);
                }
                return s3q0.a;
            case 17:
                return Boolean.valueOf(((fzg) obj).m);
            case 18:
                h03.b((Throwable) obj);
                return s3q0.a;
            case 19:
                qgi0.r((tgi0) obj, "community_top_bar_back");
                return s3q0.a;
            case 20:
                tj50.a aVar2 = (tj50.a) obj;
                wh1 wh1Var = new wh1(14);
                ao8 ao8Var = ao8.d;
                return new g9k.d(aVar2.a(wh1Var, ao8Var), aVar2.a(new g54(18), ao8Var), aVar2.a(new com.vk.movika.sdk.base.observable.s(23), ao8Var));
            case 21:
                return String.valueOf(((Peer) obj).b);
            case 22:
                Pair pair = (Pair) obj;
                return "(folder_id = " + ((Number) pair.i()).intValue() + " AND filter_id = " + ((DialogsFilter) pair.j()).i() + ')';
            case 23:
                qyg0 V0 = ((hyg0) obj).V0("SELECT `favorites_stickers`.`id` AS `id`, `favorites_stickers`.`productId` AS `productId`, `favorites_stickers`.`images` AS `images`, `favorites_stickers`.`imagesWithBackground` AS `imagesWithBackground`, `favorites_stickers`.`config` AS `config`, `favorites_stickers`.`animations` AS `animations`, `favorites_stickers`.`isAllowed` AS `isAllowed`, `favorites_stickers`.`render` AS `render`, `favorites_stickers`.`vmojiCharacter` AS `vmojiCharacter`, `favorites_stickers`.`popup` AS `popup` FROM favorites_stickers");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (V0.step()) {
                        int i2 = (int) V0.getLong(0);
                        int i3 = (int) V0.getLong(1);
                        ImageList a3 = psj.a(V0.l2(2));
                        if (a3 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.vk.dto.common.im.ImageList', but it was NULL.");
                        }
                        ImageList a4 = psj.a(V0.l2(3));
                        if (a4 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.vk.dto.common.im.ImageList', but it was NULL.");
                        }
                        PopupStickerAnimation popupStickerAnimation = null;
                        String l2 = V0.isNull(4) ? null : V0.l2(4);
                        ImageConfigId imageConfigId = (l2 == null || (imageConfigIdDto = (ImageConfigIdDto) psj.a.fromJson(l2, ImageConfigIdDto.class)) == null) ? null : new ImageConfigId(imageConfigIdDto.b(), imageConfigIdDto.a());
                        String l22 = V0.l2(5);
                        Gson gson = psj.a;
                        StickerAnimationDto stickerAnimationDto = (StickerAnimationDto) gson.fromJson(l22, StickerAnimationDto.class);
                        StickerAnimation stickerAnimation = stickerAnimationDto != null ? new StickerAnimation(stickerAnimationDto.a(), stickerAnimationDto.b()) : null;
                        if (stickerAnimation == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.vk.dto.stickers.StickerAnimation', but it was NULL.");
                        }
                        boolean z = ((int) V0.getLong(6)) != 0;
                        String l23 = V0.isNull(7) ? null : V0.l2(7);
                        StickerRender stickerRender = (l23 == null || (stickerRenderDto = (StickerRenderDto) gson.fromJson(l23, StickerRenderDto.class)) == null) ? null : new StickerRender(stickerRenderDto.a(), en00.l(stickerRenderDto.b()), en00.l(stickerRenderDto.c()), stickerRenderDto.e(), stickerRenderDto.d());
                        String l24 = V0.isNull(8) ? null : V0.l2(8);
                        String l25 = V0.isNull(9) ? null : V0.l2(9);
                        if (l25 != null && (popupStickerAnimationDto = (PopupStickerAnimationDto) gson.fromJson(l25, PopupStickerAnimationDto.class)) != null) {
                            popupStickerAnimation = en00.d(popupStickerAnimationDto);
                        }
                        arrayList.add(new atq(i2, i3, a3, a4, imageConfigId, stickerAnimation, z, stickerRender, l24, popupStickerAnimation));
                    }
                    V0.close();
                    return arrayList;
                } catch (Throwable th2) {
                    V0.close();
                    throw th2;
                }
            case 24:
                ols.b bVar = (ols.b) obj;
                return new o2q0(bVar.b, bVar.c);
            case 25:
                AccountGetEmailResponseDto accountGetEmailResponseDto = (AccountGetEmailResponseDto) obj;
                String e = accountGetEmailResponseDto.e();
                if (e == null) {
                    e = "";
                }
                return new ts(e, accountGetEmailResponseDto.d());
            case 26:
                ((ij20.a) obj).l(true);
                return s3q0.a;
            case 27:
                return s3q0.a;
            case 28:
                return Float.valueOf(((com.vk.photo.editor.features.colorgrading.a) obj).j.c);
            default:
                return s3q0.a;
        }
    }
}
