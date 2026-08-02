package xsna;

import android.view.ViewGroup;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vk.api.generated.account.dto.AccountSetPrivacyResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.privacy.dto.PrivacyOwnersDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.video.dto.VideoCommentOrdersDto;
import com.vk.api.generated.video.dto.VideoCommentSortingDto;
import com.vk.api.generated.video.dto.VideoGetCommentsExtendedResponseDto;
import com.vk.api.generated.wall.dto.WallWallCommentDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.NotificationImage;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.log.L;
import com.vk.media.player.VideoMode;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.Set;
import kotlin.collections.EmptySet;
import xsna.f5h0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class h2h0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ h2h0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        List<UserId> e;
        Object obj2;
        Object obj3;
        Image image;
        yg5 yg5Var;
        Set set = null;
        String str = null;
        set = null;
        switch (this.b) {
            case 0:
                String str2 = (String) obj;
                Locale forLanguageTag = Locale.forLanguageTag(str2);
                if (epx.f(forLanguageTag.toLanguageTag(), C.LANGUAGE_UNDETERMINED)) {
                    System.err.println("The language tag " + str2 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                }
                return new kwz(forLanguageTag);
            case 1:
                qgi0.r((tgi0) obj, "search_database_geo_item_subtitle");
                return s3q0.a;
            case 2:
                return ((h8i0) obj).a;
            case 3:
                return s3q0.a;
            case 4:
                PrivacyOwnersDto d = ((AccountSetPrivacyResponseDto) obj).d();
                if (d != null && (e = d.e()) != null) {
                    set = j5g.S0(e);
                }
                return set == null ? EmptySet.b : set;
            case 5:
                t6g0 t6g0Var = t6g0.b;
                t6g0.b().a();
                return s3q0.a;
            case 6:
                return io.reactivex.rxjava3.internal.operators.completable.i.b;
            case 7:
                L.j((Throwable) obj, "Catalog");
                return s3q0.a;
            case 8:
                return s3q0.a;
            case 9:
                ((ojt) obj).l = f5h0.f.a;
                return s3q0.a;
            case 10:
                return s3q0.a;
            case 11:
                cvk.u(R.string.video_playlist_unsubscribe_fail, false);
                L.i((Throwable) obj);
                return s3q0.a;
            case 12:
                VideoGetCommentsExtendedResponseDto videoGetCommentsExtendedResponseDto = (VideoGetCommentsExtendedResponseDto) obj;
                VideoCommentOrdersDto i = videoGetCommentsExtendedResponseDto.i();
                if ((i != null ? i.d() : null) != VideoCommentSortingDto.MOST_INTERESTING_COMMENTS_FIRST || videoGetCommentsExtendedResponseDto.f().isEmpty() || videoGetCommentsExtendedResponseDto.getCount() <= 0) {
                    return Optional.empty();
                }
                WallWallCommentDto wallWallCommentDto = (WallWallCommentDto) j5g.Y(videoGetCommentsExtendedResponseDto.f());
                Iterator<T> it = videoGetCommentsExtendedResponseDto.k().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (epx.f(wallWallCommentDto.k(), ((UsersUserFullDto) obj2).s1())) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                UsersUserFullDto usersUserFullDto = (UsersUserFullDto) obj2;
                String r2 = usersUserFullDto != null ? usersUserFullDto.r2() : null;
                Iterator<T> it2 = videoGetCommentsExtendedResponseDto.e().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj3 = it2.next();
                        GroupsGroupFullDto groupsGroupFullDto = (GroupsGroupFullDto) obj3;
                        long j = groupsGroupFullDto.P0().b;
                        UserId P0 = groupsGroupFullDto.P0();
                        if (j > 0) {
                            P0 = fkq0.e(P0);
                        }
                        if (epx.f(P0, wallWallCommentDto.k())) {
                        }
                    } else {
                        obj3 = null;
                    }
                }
                GroupsGroupFullDto groupsGroupFullDto2 = (GroupsGroupFullDto) obj3;
                String V1 = groupsGroupFullDto2 != null ? groupsGroupFullDto2.V1() : null;
                if (r2 == null) {
                    r2 = V1;
                }
                if (r2 != null) {
                    Serializer.c<Image> cVar = Image.CREATOR;
                    image = Image.b.a(r2);
                } else {
                    image = null;
                }
                String C = wallWallCommentDto.C();
                if (image != null) {
                    Serializer.c<Owner> cVar2 = Owner.CREATOR;
                    str = Owner.a.a(50, image);
                }
                return Optional.of(new wbg(C, str));
            case 13:
                VideoPipStateHolder.State state = (VideoPipStateHolder.State) obj;
                VideoPipStateHolder.c = state;
                int i2 = VideoPipStateHolder.b.$EnumSwitchMapping$0[state.ordinal()];
                if (i2 == 1) {
                    VideoPipStateHolder.a.getClass();
                    VideoPipStateHolder.i(null);
                } else if (i2 == 2 && (yg5Var = VideoPipStateHolder.d.get()) != null) {
                    yg5Var.L(VideoMode.PIP);
                }
                return s3q0.a;
            case 14:
                return s3q0.a;
            case 15:
                return new lyu(bwt0.I(R.layout.ds_context_menu_header, (ViewGroup) obj, false));
            case 16:
                Throwable th = (Throwable) obj;
                com.vk.metrics.eventtracking.b.a.a(th);
                h03.b(th);
                return s3q0.a;
            case 17:
                int i3 = otw0.i1;
                L.C("VoipParticipantSettingsAccessRightsModalDialog", (Throwable) obj);
                return s3q0.a;
            default:
                NotificationImage.ImageInfo imageInfo = (NotificationImage.ImageInfo) obj;
                return imageInfo.b + 'x' + imageInfo.c + " got url: " + myc0.f(imageInfo.d);
        }
    }
}
