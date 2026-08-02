package xsna;

import com.google.gson.Gson;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.messages.dto.MessagesGetConversationMembersDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.core.serialize.Serializer;
import com.vk.core.utils.newtork.NetworkState;
import com.vk.dto.clips.external.ClipsDraftablePlaylist;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.stickers.AnimatedStickerInfo;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.ui.fragments.MsgViewFragment;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.newsfeed.api.posting.profilefriendslists.ProfileFriendItem;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.photogallery.PhotoGalleryView;
import com.vk.stickers.popup.PopupStickerView;
import com.vk.stories.design.view.stickers.StickersDrawingViewGroup;
import com.vk.stories.design.view.stickers.music.MusicStickerStyleSwitchingView;
import com.vk.superapp.api.dto.menu.Action;
import com.vk.superapp.api.dto.menu.Animation;
import com.vk.superapp.api.dto.menu.SuperAppAnimationConfig;
import com.vk.voip.ui.VoipViewModelState;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PollAttachment;
import com.vkontakte.android.fragments.SettingsGeneralFragment;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import xsna.hd20;
import xsna.xaf;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class x620 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ x620(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Animation animation;
        String c;
        String d;
        List<ClipsDraftablePlaylist> list;
        r2 = null;
        r2 = null;
        xaf.c cVar = null;
        int i = 2;
        switch (this.b) {
            case 0:
                SuperAppAnimationConfig superAppAnimationConfig = (SuperAppAnimationConfig) obj;
                List<Animation> a = superAppAnimationConfig.a();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : a) {
                    if (((Animation) obj2).b() == Action.SHAKE) {
                        arrayList.add(obj2);
                    }
                }
                if (!arrayList.isEmpty() && (c = (animation = (Animation) j5g.Y(arrayList)).c()) != null && c.length() != 0 && (d = animation.d()) != null && d.length() != 0) {
                    return io.reactivex.rxjava3.core.x.k(superAppAnimationConfig);
                }
                k720 k720Var = k720.a;
                return k720.S(arrayList).l(new ai3(new vfk(superAppAnimationConfig, 26), 28));
            case 1:
                return hd20.a.a;
            case 2:
                return Boolean.valueOf(((VoipViewModelState) obj) != VoipViewModelState.Idle);
            case 3:
                L.i((Throwable) obj);
                return s3q0.a;
            case 4:
                bn40.c((Throwable) obj, new Object[0]);
                return s3q0.a;
            case 5:
                int i2 = MsgViewFragment.i0;
                Object Z = j5g.Z(((wpp) obj).c.values());
                MsgFromUser msgFromUser = Z instanceof MsgFromUser ? (MsgFromUser) Z : null;
                if (msgFromUser != null) {
                    return msgFromUser;
                }
                throw new IllegalStateException("Message not found");
            case 6:
                List list2 = (List) obj;
                long j = 0;
                while (list2.iterator().hasNext()) {
                    j += ((MusicTrack) r0.next()).f;
                }
                return new tt70(4, j, rli0.A(rli0.y(rli0.t(new i5g(list2), new d230(i)), 2)));
            case 7:
                qgi0.r((tgi0) obj, "MusicPickerToolbarBackButton");
                return s3q0.a;
            case 8:
                int i3 = MusicStickerStyleSwitchingView.k;
                return s3q0.a;
            case 9:
                return s3q0.a;
            case 10:
                PhotoGalleryView.a.C1472a c1472a = PhotoGalleryView.a.a;
                return s3q0.a;
            case 11:
                qgi0.r((tgi0) obj, "pin_review_community_image");
                return s3q0.a;
            case 12:
                return Long.valueOf(((Integer) obj).intValue() * 1000);
            case 13:
                return Boolean.valueOf(((l3b0) obj).h);
            case 14:
                qgi0.r((tgi0) obj, "pollEditorSaveButton");
                return s3q0.a;
            case 15:
                return new PollAttachment(((JSONObject) obj).getJSONObject("response"));
            case 16:
                AtomicInteger atomicInteger = PopupStickerView.q;
                List<AnimatedStickerInfo> list3 = (List) obj;
                int e = on00.e(c5g.u(list3, 10));
                if (e < 16) {
                    e = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(e);
                for (AnimatedStickerInfo animatedStickerInfo : list3) {
                    String str = animatedStickerInfo.b;
                    String str2 = animatedStickerInfo.e;
                    if (str2 == null) {
                        str2 = "";
                    }
                    Pair pair = new Pair(str, str2);
                    linkedHashMap.put(pair.i(), pair.j());
                }
                return linkedHashMap;
            case 17:
                return ((PostingState.Editing) obj).i.g;
            case 18:
                List<UsersUserFullDto> g = ((MessagesGetConversationMembersDto) obj).g();
                if (g == null) {
                    return EmptyList.b;
                }
                List<UsersUserFullDto> list4 = g;
                ArrayList arrayList2 = new ArrayList(c5g.u(list4, 10));
                for (UsersUserFullDto usersUserFullDto : list4) {
                    Serializer.c<ProfileFriendItem> cVar2 = ProfileFriendItem.CREATOR;
                    arrayList2.add(ProfileFriendItem.a.b(usersUserFullDto));
                }
                return arrayList2;
            case 19:
                cvk.u(R.string.error_network, false);
                L.i((Throwable) obj);
                return s3q0.a;
            case 20:
                return new seq0(obj != null ? (String) obj : null);
            case 21:
                return s3q0.a;
            case 22:
                qgi0.r((tgi0) obj, "TEST_TAG_RIGHT_ICON");
                return s3q0.a;
            case 23:
                g2q0 g2q0Var = (g2q0) obj;
                int i4 = SettingsGeneralFragment.z0;
                if (g2q0Var != null) {
                    L l = L.a;
                    l.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l, L.LogType.e, new Object[]{"Privacy options form error: " + g2q0Var});
                    }
                    cvk.u(R.string.sett_ads_privacy_options_error, false);
                }
                return s3q0.a;
            case 24:
                int i5 = StickersDrawingViewGroup.j0;
                ((grt0) obj).s();
                return s3q0.a;
            case 25:
                return Boolean.valueOf(((BaseOkResponseDto) obj) == BaseOkResponseDto.OK);
            case 26:
                qyg0 V0 = ((hyg0) obj).V0("SELECT `stickers_suggests`.`words` AS `words`, `stickers_suggests`.`stickers` AS `stickers`, `stickers_suggests`.`is_special` AS `is_special` FROM stickers_suggests");
                try {
                    ArrayList arrayList3 = new ArrayList();
                    while (V0.step()) {
                        String l2 = V0.l2(0);
                        Gson gson = psj.a;
                        Type type = new nsj().getType();
                        Gson gson2 = psj.a;
                        arrayList3.add(new dxm((List) gson2.fromJson(l2, type), (List) gson2.fromJson(V0.l2(1), new lsj().getType()), ((int) V0.getLong(2)) != 0));
                    }
                    return arrayList3;
                } finally {
                    V0.close();
                }
            case 27:
                return Boolean.valueOf(((NetworkState) obj).d);
            case 28:
                L.j((Throwable) obj, "Catalog");
                return s3q0.a;
            default:
                bwr0 bwr0Var = (bwr0) obj;
                if (bwr0Var instanceof pwr0) {
                    return io.reactivex.rxjava3.core.q.T(xaf.a.a);
                }
                if ((bwr0Var instanceof twr0) || (bwr0Var instanceof rwr0)) {
                    return io.reactivex.rxjava3.core.q.T(xaf.c.a);
                }
                if (bwr0Var instanceof qwr0) {
                    return io.reactivex.rxjava3.core.q.T(xaf.d.a);
                }
                if (bwr0Var instanceof uxr0) {
                    return io.reactivex.rxjava3.core.q.T(xaf.e.a);
                }
                if (!(bwr0Var instanceof fyr0)) {
                    return bwr0Var instanceof wxr0 ? ((wxr0) bwr0Var).a.k1() == 0 ? io.reactivex.rxjava3.core.q.T(xaf.f.a) : io.reactivex.rxjava3.core.q.T(xaf.e.a) : io.reactivex.rxjava3.core.q.T(xaf.b.a);
                }
                xaf.c cVar3 = xaf.c.a;
                VideoFile videoFile = ((fyr0) bwr0Var).a;
                ClipVideoFile clipVideoFile = videoFile instanceof ClipVideoFile ? (ClipVideoFile) videoFile : null;
                if (clipVideoFile != null && (list = clipVideoFile.M1) != null && (!list.isEmpty())) {
                    cVar = cVar3;
                }
                return io.reactivex.rxjava3.core.q.O(rl3.I(new xaf[]{xaf.f.a, cVar}));
        }
    }

    public /* synthetic */ x620(bf40 bf40Var) {
        this.b = 6;
    }
}
