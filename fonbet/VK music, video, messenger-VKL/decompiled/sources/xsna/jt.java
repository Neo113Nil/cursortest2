package xsna;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.communities.CatalogGetSearchGroupsRequestFactory;
import com.vk.catalog2.common.dto.api.layout.CatalogLayout;
import com.vk.catalog2.common.dto.api.section.CatalogSection;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.clips.attachments.impl.publish.geolocation.presentation.j;
import com.vk.clips.design.view.component.badge.ClipBadge;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListFragment;
import com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.BaseBadgeHolder;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.shortvideo.entries.ClipsGridHeaderEntry;
import com.vk.dto.user.UserProfile;
import com.vk.im.engine.reporters.performance.PerformanceEventType;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.log.L;
import com.vk.newsfeed.api.posting.author.PostingAuthor;
import com.vk.profile.community.details.impl.name_history.c;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class jt implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ jt(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                qgi0.r((tgi0) obj, "authorClipsDescription");
                return s3q0.a;
            case 1:
                List<GroupsGroupFullDto> list = (List) obj;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (GroupsGroupFullDto groupsGroupFullDto : list) {
                    UserId e = !fkq0.b(groupsGroupFullDto.P0()) ? fkq0.e(groupsGroupFullDto.P0()) : groupsGroupFullDto.P0();
                    new dqu();
                    Group a = dqu.a(groupsGroupFullDto);
                    UserProfile userProfile = new UserProfile(a);
                    BaseBoolIntDto n = groupsGroupFullDto.n();
                    BaseBoolIntDto baseBoolIntDto = BaseBoolIntDto.YES;
                    boolean z = n == baseBoolIntDto;
                    int i = a.n;
                    ExtendedUserProfile j = bwd0.j(userProfile);
                    j.d0 = i;
                    j.g0 = z;
                    String y1 = groupsGroupFullDto.y1();
                    String str = y1 == null ? "" : y1;
                    String V1 = groupsGroupFullDto.V1();
                    arrayList.add(new PostingAuthor.Community(e, str, (V1 == null && (V1 = groupsGroupFullDto.X1()) == null) ? "" : V1, j, j.g0 && groupsGroupFullDto.h3() != GroupsGroupFullDto.WallDto.DISABLED, groupsGroupFullDto.C() == baseBoolIntDto, groupsGroupFullDto.u() == baseBoolIntDto, groupsGroupFullDto.D() == baseBoolIntDto));
                }
                return ut0.a(arrayList);
            case 2:
                int i2 = com.vk.profile.questions.impl.a.o1;
                return s3q0.a;
            case 3:
                return ((se3) obj).a;
            case 4:
                qgi0.r((tgi0) obj, "PostingMediaPickerEmptyTitle");
                return s3q0.a;
            case 5:
                cvk.u(R.string.common_network_error, false);
                return s3q0.a;
            case 6:
                return Boolean.valueOf(((it80) obj).a != 0);
            case 7:
                ay00 ay00Var = (ay00) obj;
                if (ay00Var instanceof hu00) {
                    hu00 hu00Var = (hu00) ay00Var;
                    return new qw9(hu00Var.d, hu00Var.a, hu00Var.c);
                }
                if (ay00Var instanceof gu00) {
                    gu00 gu00Var = (gu00) ay00Var;
                    return new qw9(gu00Var.c, gu00Var.a, gu00Var.b);
                }
                if (!(ay00Var instanceof iu00)) {
                    return null;
                }
                iu00 iu00Var = (iu00) ay00Var;
                return new qw9(iu00Var.c, iu00Var.a, 0);
            case 8:
                List<CatalogBlock> list2 = ((CatalogSection) ((hda) obj).a).i;
                int size = list2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    CatalogBlock catalogBlock = list2.get(i3);
                    CatalogDataType catalogDataType = catalogBlock.c;
                    CatalogLayout catalogLayout = catalogBlock.i;
                    if (catalogDataType == CatalogDataType.DATA_TYPE_GROUPS_ITEMS && catalogLayout.b == CatalogViewType.LIST) {
                        list2.set(i3, CatalogBlock.zb(catalogBlock, null, new CatalogLayout(CatalogViewType.SYNTHETIC_SEARCH_GROUP_ITEMS_LIST, catalogLayout.c, catalogLayout.d, catalogLayout.e, catalogLayout.f, catalogLayout.g, catalogLayout.h, catalogLayout.i, null, 256, null), null, 2097023));
                    }
                }
                return s3q0.a;
            case 9:
                int i4 = ChannelFragment.a1;
                int i5 = kwg0.a;
                return s3q0.a;
            case 10:
                return PerformanceEventType.CHANNEL_POST_ROUND_TRIP.h();
            case 11:
                com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.k kVar = new com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.k((ViewGroup) obj);
                kVar.l.setMode(ClipBadge.BadgeMode.STATIC);
                kVar.t6(BaseBadgeHolder.BadgeSide.LEFT, new com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.j(1, kVar, com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.k.class, "calculateBadgeInsets", "calculateBadgeInsets(Lcom/vk/clips/viewer/impl/feed/view/list/item/badges/holders/BaseBadgeHolder$BadgeImageContent;)Landroid/graphics/Rect;", 0), new sd4(1), new b76((byte) 0, 0));
                return kVar;
            case 12:
                return s3q0.a;
            case 13:
                int i6 = ClipsFavoriteFolderContentListFragment.W;
                qgi0.r((tgi0) obj, "clips_favorites_folder_content_list_top_bar_more_button");
                return s3q0.a;
            case 14:
                return j.c.a;
            case 15:
                nmv nmvVar = (nmv) obj;
                return Boolean.valueOf((nmvVar instanceof ClipsGridHeaderEntry.Author) && ((ClipsGridHeaderEntry.Author) nmvVar).e != ClipsGridHeaderEntry.Author.ContentType.CHALLENGE);
            case 16:
                return s3q0.a;
            case 17:
                qgi0.r((tgi0) obj, "errorImage");
                return s3q0.a;
            case 18:
                return new c.a.C1557c((pah) obj);
            case 19:
                Map.Entry entry = (Map.Entry) obj;
                return new Pair(fkq0.e((UserId) entry.getKey()), tsj.a((Group) entry.getValue()));
            case 20:
                qgi0.r((tgi0) obj, "CropEditorToolbar");
                return s3q0.a;
            case 21:
                LinkedHashMap linkedHashMap = DialogActionsListView.j;
                return ((Context) obj).getString(R.string.vkim_msg_header_menu_call_with_video);
            case 22:
                L.g("Error while tracking toggle", (Throwable) obj);
                return s3q0.a;
            case 23:
                return s3q0.a;
            case 24:
                return io.reactivex.rxjava3.core.a.r(200L, TimeUnit.MILLISECONDS);
            case 25:
                L.j((Throwable) obj, "Catalog");
                return s3q0.a;
            case 26:
                return Boolean.valueOf(((BaseOkResponseDto) obj) == BaseOkResponseDto.OK);
            case 27:
                qgi0.r((tgi0) obj, "storefront_shop_conditions_cell");
                return s3q0.a;
            case 28:
                ((View) obj).setPadding(0, 0, 0, 0);
                return s3q0.a;
            default:
                return fl3.K((Cursor) obj);
        }
    }

    public /* synthetic */ jt(CatalogGetSearchGroupsRequestFactory catalogGetSearchGroupsRequestFactory) {
        this.b = 8;
    }
}
