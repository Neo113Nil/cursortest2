package xsna;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.vk.api.base.VkPaginationList;
import com.vk.api.generated.apps.dto.AppsIsNotificationsAllowedResponseDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetObjectExtendedResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetTopVideosResponseDto;
import com.vk.clips.design.view.component.badge.ClipBadge;
import com.vk.clips.reports.impl.ClipsReportFragment;
import com.vk.clips.reports.impl.data.ClipsReportCategory;
import com.vk.clips.reports.impl.data.ClipsReportReason;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.BaseBadgeHolder;
import com.vk.common.links.LinksParserData;
import com.vk.core.apps.BuildInfo;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.reactions.BadgeMeta;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.user.UserProfile;
import com.vk.ecomm.cart.impl.cart.a;
import com.vk.im.engine.internal.storage.delegates.channel_messages.ChannelMessageHistoryMetaColumn;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.log.L;
import com.vk.managed_groups.impl.list.g;
import com.vk.stickers.bridge.GiftData;
import com.vk.stickers.bridge.b;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import xsna.noa;
import xsna.tj50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class qm0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ qm0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ImageSize Cb;
        yvv yvvVar;
        AttributeSet attributeSet = null;
        switch (this.b) {
            case 0:
                int i = ym0.k1;
                L.g("Can't get rooms list", (Throwable) obj);
                return s3q0.a;
            case 1:
                return Boolean.TRUE;
            case 2:
                return s3q0.a;
            case 3:
                L.j((Throwable) obj, "An error occurred while deleted");
                return s3q0.a;
            case 4:
                Set set = (Set) obj;
                ArrayList arrayList = new ArrayList(c5g.u(set, 10));
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(((CallMemberId) it.next()).b);
                }
                return arrayList;
            case 5:
                return a.b.a;
            case 6:
                VkCell vkCell = new VkCell((Context) obj, attributeSet, 6, r4 ? 1 : 0);
                vkCell.setMiddleTitleHolderFactory(new noa.d());
                return vkCell;
            case 7:
                return ((ChannelMessageHistoryMetaColumn) obj).getKey();
            case 8:
                return Long.valueOf(((b7c) obj).c.a);
            case 9:
                com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.i iVar = new com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.i((ViewGroup) obj);
                iVar.l.setMode(ClipBadge.BadgeMode.STATIC);
                iVar.t6(BaseBadgeHolder.BadgeSide.RIGHT, new com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.h(1, iVar, com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.i.class, "calculateBadgeInsets", "calculateBadgeInsets(Lcom/vk/clips/viewer/impl/feed/view/list/item/badges/holders/BaseBadgeHolder$BadgeImageContent;)Landroid/graphics/Rect;", 0), new sd4(1), new b76((byte) 0, 0));
                return iVar;
            case 10:
                return s3q0.a;
            case 11:
                ShortVideoGetTopVideosResponseDto shortVideoGetTopVideosResponseDto = (ShortVideoGetTopVideosResponseDto) obj;
                ArrayList f = ums0.f(ums0.a, shortVideoGetTopVideosResponseDto.e(), shortVideoGetTopVideosResponseDto.g(), shortVideoGetTopVideosResponseDto.d());
                String f2 = shortVideoGetTopVideosResponseDto.f();
                return new jpe(f, (f2 == null || f2.length() == 0 || f2.equals("null")) ? PaginationKey.LoadedFull.b : new PaginationKey.Next(f2));
            case 12:
                GroupsGetObjectExtendedResponseDto groupsGetObjectExtendedResponseDto = (GroupsGetObjectExtendedResponseDto) obj;
                List<GroupsGroupFullDto> e = groupsGetObjectExtendedResponseDto.e();
                ArrayList arrayList2 = new ArrayList(c5g.u(e, 10));
                Iterator<T> it2 = e.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(dqu.a((GroupsGroupFullDto) it2.next()));
                }
                return new VkPaginationList(arrayList2, groupsGetObjectExtendedResponseDto.getCount(), false, 0, 12, null);
            case 13:
                m1f m1fVar = (m1f) obj;
                int i2 = ClipsReportFragment.V;
                ArrayList arrayList3 = new ArrayList();
                Map<ClipsReportCategory, List<ClipsReportReason>> map = m1fVar.a;
                ClipsReportReason clipsReportReason = m1fVar.b;
                for (Map.Entry<ClipsReportCategory, List<ClipsReportReason>> entry : map.entrySet()) {
                    ClipsReportCategory key = entry.getKey();
                    List<ClipsReportReason> value = entry.getValue();
                    arrayList3.add(new e1f(key));
                    for (ClipsReportReason clipsReportReason2 : value) {
                        arrayList3.add(new j1f(key, clipsReportReason2, clipsReportReason2 == clipsReportReason));
                    }
                }
                return new n1f(arrayList3, clipsReportReason != null);
            case 14:
                return Float.valueOf(sa30.E(((Float) obj).floatValue(), new k9x(-1, 1, 1), new k9x(0, 100, 1)));
            case 15:
                return new b.a((StickerStockItem) obj, GiftData.d);
            case 16:
                qgi0.r((tgi0) obj, "ad_banner_action_button");
                return s3q0.a;
            case 17:
                ucp ucpVar = ucp.a;
                return ucp.i(xwk.d().a().d((String) obj, new LinksParserData(0, (Bundle) null, 0, 0, (String) null, (String) null, 0, 0, LinksParserData.HashtagService.Video, (saz) null, 0, (taz) null, false, 16127)));
            case 18:
                LinkedHashMap linkedHashMap = DialogActionsListView.j;
                return ((Context) obj).getString(R.string.vkim_groups_receive_msg_enable);
            case 19:
                return Boolean.valueOf(((ReactionMeta) obj) instanceof BadgeMeta);
            case 20:
                return i2s.u(t2s.a((t2s) obj, null, false, null, null, true, null, null, false, 0, 495));
            case 21:
                return Boolean.valueOf(((jis) obj).g);
            case 22:
                return ((JSONObject) obj).getJSONObject("response");
            case 23:
                return Boolean.valueOf(((AppsIsNotificationsAllowedResponseDto) obj).d());
            case 24:
                Image image = ((UserProfile) obj).O;
                if (image == null || (Cb = image.Cb(cn70.b(16), true, true)) == null) {
                    return null;
                }
                return Cb.d.d;
            case 25:
                if (BuildInfo.m() || (yvvVar = zvv.a.get()) == null) {
                    return s3q0.a;
                }
                yvvVar.b();
                throw null;
            case 26:
                MotionEvent motionEvent = (MotionEvent) obj;
                return Boolean.valueOf(mnh0.o(motionEvent) || mnh0.r(motionEvent));
            case 27:
                zex0 zex0Var = e370.q;
                if (zex0Var != null) {
                    zex0Var.c();
                }
                return s3q0.a;
            case 28:
                return Boolean.valueOf(((BaseOkResponseDto) obj) == BaseOkResponseDto.OK);
            default:
                return new g.a(((tj50.a) obj).a(new pey(2), ao8.d));
        }
    }

    public /* synthetic */ qm0(Object obj, int i) {
        this.b = i;
    }
}
