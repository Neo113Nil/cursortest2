package xsna;

import android.content.Context;
import android.view.ViewGroup;
import com.vk.api.generated.leadForms.dto.LeadFormsGetUserFormDataResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetOwnerVideosResponseDto;
import com.vk.channels.api.Channel;
import com.vk.clips.design.view.component.badge.ClipBadge;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListFragment;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.BaseBadgeHolder;
import com.vk.draftslist.impl.ui.entity.DraftsListState;
import com.vk.dto.common.Attachment;
import com.vk.dto.market.VariantGroup;
import com.vk.dto.music.Playlist;
import com.vk.feed.design.view.newsfeed.dzen.DzenNewsCell;
import com.vk.im.ui.components.contacts.ContactsListFactory;
import com.vk.im.ui.components.contacts.SortOrder;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.log.L;
import com.vk.voip.ui.menu.ui.MainMenuView;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.FwdMessagesAttachment;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;
import xsna.hh8;
import xsna.ogb;
import xsna.r7x;
import xsna.z890;
import xsna.zg8;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class gt implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ gt(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                qgi0.r((tgi0) obj, "authorClipsName");
                return s3q0.a;
            case 1:
                return ((ogb.a) obj).a;
            case 2:
                hh8 hh8Var = (hh8) obj;
                return new it80(hh8Var instanceof hh8.f.a ? new zg8.a(((hh8.f.a) hh8Var).c) : hh8Var instanceof hh8.f.d ? zg8.c.a : hh8Var instanceof hh8.f.b ? new zg8.b(zk70.b(((hh8.f.b) hh8Var).c)) : null);
            case 3:
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (List) obj) {
                    if (!jnj.b(((Playlist) obj2).O)) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            case 4:
                return Integer.valueOf(((z890.c) obj).c);
            case 5:
                return Boolean.valueOf(!(((Attachment) obj) instanceof FwdMessagesAttachment));
            case 6:
                return String.valueOf(((Channel) obj).b);
            case 7:
                qgi0.r((tgi0) obj, "checkout_form_field_caption");
                return s3q0.a;
            case 8:
                com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.e eVar = new com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.e((ViewGroup) obj);
                eVar.l.setMode(ClipBadge.BadgeMode.STATIC);
                eVar.t6(BaseBadgeHolder.BadgeSide.RIGHT, new com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.d(1, eVar, com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.e.class, "calculateBadgeInsets", "calculateBadgeInsets(Lcom/vk/clips/viewer/impl/feed/view/list/item/badges/holders/BaseBadgeHolder$BadgeImageContent;)Landroid/graphics/Rect;", 0), new sd4(1), new b76((byte) 0, 0));
                return eVar;
            case 9:
                ((ikv0) obj).a();
                return s3q0.a;
            case 10:
                int i = ClipsFavoriteFolderContentListFragment.W;
                qgi0.r((tgi0) obj, "clips_favorites_folder_content_list_top_bar_back_button");
                return s3q0.a;
            case 11:
                ShortVideoGetOwnerVideosResponseDto shortVideoGetOwnerVideosResponseDto = (ShortVideoGetOwnerVideosResponseDto) obj;
                ArrayList f = ums0.f(ums0.a, shortVideoGetOwnerVideosResponseDto.e(), shortVideoGetOwnerVideosResponseDto.j(), shortVideoGetOwnerVideosResponseDto.d());
                String g = shortVideoGetOwnerVideosResponseDto.g();
                return new jpe(f, (g == null || g.length() == 0 || g.equals("null")) ? PaginationKey.LoadedFull.b : new PaginationKey.Next(g));
            case 12:
                return Float.valueOf(((com.vk.photo.editor.features.colorgrading.a) obj).b);
            case 13:
                int i2 = p0j.j1;
                return s3q0.a;
            case 14:
                x8j x8jVar = (x8j) obj;
                ContactsListFactory contactsListFactory = ContactsListFactory.CREATE_CONVERSATION_VKME;
                return new rbj(x8jVar.c, x8jVar.a, SortOrder.BY_NAME, x8jVar.d, false, null, 384);
            case 15:
                return Integer.valueOf(((Integer) obj).intValue() / 3);
            case 16:
                int i3 = 15;
                qeh0 qeh0Var = new qeh0(new pr1(i3), new pr1(i3));
                qcy<Object>[] qcyVarArr = qgi0.a;
                sgi0<qeh0> sgi0Var = ngi0.w;
                qcy<Object> qcyVar = qgi0.a[13];
                ((tgi0) obj).a(sgi0Var, qeh0Var);
                return s3q0.a;
            case 17:
                L.i((Throwable) obj);
                return s3q0.a;
            case 18:
                LinkedHashMap linkedHashMap = DialogActionsListView.j;
                return ((Context) obj).getString(R.string.vkim_action_invite_to_chat);
            case 19:
                qgi0.r((tgi0) obj, "DonutTeaserSaveButton");
                return s3q0.a;
            case 20:
                return DraftsListState.a((DraftsListState) obj, null, DraftsListState.LoadingState.ERROR_PAGINATION, 0, false, false, 59);
            case 21:
                int i4 = DzenNewsCell.B;
                ((am) obj).x(true);
                return s3q0.a;
            case 22:
                L.i(new IllegalStateException("toggles_loading_failed", (Throwable) obj));
                return s3q0.a;
            case 23:
                return drm0.p0(((pno0) obj).d().toString()).toString();
            case 24:
                return ((JSONObject) obj).getJSONObject("response");
            case 25:
                return ((r7x.a) obj).b().d();
            case 26:
                it80.b.getClass();
                return new it80((LeadFormsGetUserFormDataResponseDto) obj);
            case 27:
                float f2 = MainMenuView.s;
                L.e("Click intercepted");
                return s3q0.a;
            case 28:
                return ((VariantGroup) obj).b;
            default:
                return ((x410) obj).d;
        }
    }

    public /* synthetic */ gt(sg8 sg8Var) {
        this.b = 2;
    }
}
