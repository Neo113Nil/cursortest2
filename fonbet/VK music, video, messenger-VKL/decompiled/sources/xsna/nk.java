package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.apps.dto.AppsActionBannerDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.groups.dto.GroupsGetInviteLinkPreviewResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.groups.dto.GroupsGroupIsClosedDto;
import com.vk.api.generated.groups.dto.GroupsInviteLinksDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetThumbUploadUrlResponseDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.catalog.mvi.block.video.impl.channel.AuthorsChannelSliderView$AuthorsChannelState;
import com.vk.draftslist.impl.ui.entity.DraftsListState;
import com.vk.dto.attaches.AttachWithImage;
import com.vk.dto.common.AttachmentWithMedia;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.feed.core.models.cache.CachedNewsEntry;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.log.L;
import com.vk.newsfeed.api.data.discover.a;
import com.vk.profile.community.details.api.invitelink.data.dto.CommunityInviteLink;
import com.vk.stickers.bonus.catalog.BonusCatalogFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.bhk;
import xsna.hh8;
import xsna.hpb;
import xsna.npb;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class nk implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ nk(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c4  */
    /* JADX WARN: Type inference failed for: r1v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v17, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.util.ArrayList] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        String D1;
        String str;
        List<UsersUserFullDto> f;
        List list;
        UserId P0;
        String y1;
        String e;
        Integer o1;
        int i = 10;
        switch (this.b) {
            case 0:
                L.f("AccessibilityEvents", "Error on get announce authors", (Throwable) obj);
                return s3q0.a;
            case 1:
                bn40.c((Throwable) obj, new Object[0]);
                return s3q0.a;
            case 2:
                return AuthorsChannelSliderView$AuthorsChannelState.a((AuthorsChannelSliderView$AuthorsChannelState) obj, false);
            case 3:
                return (AttachWithImage) ca3.b((AttachmentWithMedia) obj);
            case 4:
                return s3q0.a;
            case 5:
                int i2 = BonusCatalogFragment.f0;
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 6:
                return Boolean.valueOf(((hh8) obj) instanceof hh8.f);
            case 7:
                L.g("Error on set speaker disabled", (Throwable) obj);
                return s3q0.a;
            case 8:
                ((pvw0) obj).o();
                return s3q0.a;
            case 9:
                hpb.b bVar = (hpb.b) obj;
                return new npb.d(bVar.b, bVar.c, bVar.d);
            case 10:
                return lhg.a(((Integer) obj).intValue(), "placeholder_");
            case 11:
                return Boolean.valueOf(!((List) obj).isEmpty());
            case 12:
                return new ncq0(((ShortVideoGetThumbUploadUrlResponseDto) obj).d(), null, null, null, null, 30);
            case 13:
                return Boolean.valueOf((boolean) ((((com.vk.photo.editor.features.colorgrading.a) obj).h == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : 0) ^ 1));
            case 14:
                rsg0.T(new rsg0("groups.removeRecents")).subscribe(new yng(new pe1(16), r5), new js1(new nj(i), 18));
                return s3q0.a;
            case 15:
                GroupsGetInviteLinkPreviewResponseDto groupsGetInviteLinkPreviewResponseDto = (GroupsGetInviteLinkPreviewResponseDto) obj;
                GroupsInviteLinksDto e2 = groupsGetInviteLinkPreviewResponseDto.e();
                if (e2 == null) {
                    return null;
                }
                Integer i3 = e2.i();
                UserId g = e2.g();
                UserId q = e2.q();
                String url = e2.getUrl();
                Long d = e2.d();
                long longValue = d != null ? d.longValue() : 0L;
                Long f2 = e2.f();
                long longValue2 = f2 != null ? f2.longValue() : 0L;
                Integer e3 = e2.e();
                int intValue = e3 != null ? e3.intValue() : 0;
                Integer j = e2.j();
                CommunityInviteLink communityInviteLink = new CommunityInviteLink(i3, g, q, url, longValue, longValue2, intValue, j != null ? j.intValue() : 0);
                GroupsGroupFullDto d2 = groupsGetInviteLinkPreviewResponseDto.d();
                int intValue2 = (d2 == null || (o1 = d2.o1()) == null) ? 0 : o1.intValue();
                GroupsGroupFullDto d3 = groupsGetInviteLinkPreviewResponseDto.d();
                String str2 = (d3 == null || (e = d3.e()) == null) ? "" : e;
                GroupsGroupFullDto d4 = groupsGetInviteLinkPreviewResponseDto.d();
                boolean z = (d4 != null ? d4.j() : null) != null;
                GroupsGroupFullDto d5 = groupsGetInviteLinkPreviewResponseDto.d();
                boolean z2 = (d5 != null ? d5.u3() : null) != GroupsGroupIsClosedDto.OPEN;
                GroupsGroupFullDto d6 = groupsGetInviteLinkPreviewResponseDto.d();
                if (d6 == null || (D1 = d6.V1()) == null) {
                    GroupsGroupFullDto d7 = groupsGetInviteLinkPreviewResponseDto.d();
                    D1 = d7 != null ? d7.D1() : null;
                    if (D1 == null) {
                        str = "";
                        GroupsGroupFullDto d8 = groupsGetInviteLinkPreviewResponseDto.d();
                        String str3 = (d8 != null || (y1 = d8.y1()) == null) ? "" : y1;
                        GroupsGroupFullDto d9 = groupsGetInviteLinkPreviewResponseDto.d();
                        boolean z3 = (d9 != null ? d9.I3() : null) != BaseBoolIntDto.YES;
                        GroupsGroupFullDto d10 = groupsGetInviteLinkPreviewResponseDto.d();
                        UserId e4 = (d10 != null || (P0 = d10.P0()) == null) ? UserId.d : fkq0.e(P0);
                        f = groupsGetInviteLinkPreviewResponseDto.f();
                        if (f == null) {
                            List<UsersUserFullDto> list2 = f;
                            list = new ArrayList(c5g.u(list2, 10));
                            for (UsersUserFullDto usersUserFullDto : list2) {
                                String r2 = usersUserFullDto.r2();
                                String D0 = usersUserFullDto.D0();
                                if (D0 == null) {
                                    D0 = "";
                                }
                                list.add(new d6h(r2, D0));
                            }
                        } else {
                            list = EmptyList.b;
                        }
                        return new c6h(communityInviteLink, intValue2, str2, z, z2, str, str3, z3, e4, list);
                    }
                }
                str = D1;
                GroupsGroupFullDto d82 = groupsGetInviteLinkPreviewResponseDto.d();
                if (d82 != null) {
                }
                GroupsGroupFullDto d92 = groupsGetInviteLinkPreviewResponseDto.d();
                if ((d92 != null ? d92.I3() : null) != BaseBoolIntDto.YES) {
                }
                GroupsGroupFullDto d102 = groupsGetInviteLinkPreviewResponseDto.d();
                UserId e42 = (d102 != null || (P0 = d102.P0()) == null) ? UserId.d : fkq0.e(P0);
                f = groupsGetInviteLinkPreviewResponseDto.f();
                if (f == null) {
                }
                return new c6h(communityInviteLink, intValue2, str2, z, z2, str, str3, z3, e42, list);
            case 16:
                h03.b((Throwable) obj);
                return s3q0.a;
            case 17:
                return ((bhk.a) obj).e;
            case 18:
                LinkedHashMap linkedHashMap = DialogActionsListView.j;
                return e3m.e(R.attr.im_ic_add_members, (Context) obj);
            case 19:
                List list3 = (List) obj;
                ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add(((CachedNewsEntry) it.next()).b);
                }
                return new w960(rdi.g(arrayList), a.C1366a.a);
            case 20:
                return new b0l0(((jla0) obj).a);
            case 21:
                return DraftsListState.a((DraftsListState) obj, null, DraftsListState.LoadingState.LOADING_INITIAL, 0, false, false, 59);
            case 22:
                qgi0.r((tgi0) obj, "edit_storefront_album_top_bar_title");
                return s3q0.a;
            case 23:
                AppsActionBannerDto appsActionBannerDto = (AppsActionBannerDto) obj;
                return appsActionBannerDto.getTitle() == null ? new sep() : m1a0.a(appsActionBannerDto);
            case 24:
                Rect rect = new Rect();
                if (((View) obj).getGlobalVisibleRect(rect)) {
                    return rect;
                }
                return null;
            case 25:
                return new iig0((ViewGroup) obj, 0);
            case 26:
                return ((x410) obj).p;
            case 27:
                return new ArrayList((List) obj);
            case 28:
                return ((MusicTrack) obj).Jb();
            default:
                cvk.u(R.string.music_play_failed, false);
                bn40.c((Throwable) obj, new Object[0]);
                return s3q0.a;
        }
    }

    public /* synthetic */ nk(com.vk.profile.community.details.impl.invitelink.b bVar) {
        this.b = 15;
    }
}
