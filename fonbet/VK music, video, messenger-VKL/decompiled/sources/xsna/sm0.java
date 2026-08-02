package xsna;

import android.content.Context;
import android.content.Intent;
import com.vk.api.generated.friends.dto.FriendsSearchResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetSuggestionsResponseDto;
import com.vk.api.generated.groups.dto.GroupsSuggestionDto;
import com.vk.api.generated.messages.dto.MessagesContactDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.GroupsSuggestions;
import com.vk.dto.shortvideo.entries.ClipsGridHeaderEntry;
import com.vk.dto.user.UserProfile;
import com.vk.feed.design.view.newsfeed.avatar_stack.AvatarAnimatedStack;
import com.vk.im.engine.models.events.OnCacheInvalidateEvent;
import com.vk.im.ui.components.contacts.ContactsListFactory;
import com.vk.im.ui.components.contacts.SortOrder;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.log.L;
import com.vk.newsfeed.api.posting.profilefriendslists.ProfileFriendItem;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import org.json.JSONObject;
import xsna.au5;
import xsna.c4u;
import xsna.mr3;
import xsna.tlo0;
import xsna.xf5;
import xsna.y6u;
import xsna.zt5;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class sm0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ sm0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ClipsGridHeaderEntry.Author.ContentType contentType;
        switch (this.b) {
            case 0:
                int i = ym0.k1;
                L.i((Throwable) obj);
                return s3q0.a;
            case 1:
                return mr3.a.b.a;
            case 2:
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(xf5.a.a((xf5) it.next()));
                }
                return arrayList;
            case 3:
                zt5 zt5Var = (zt5) obj;
                if (zt5Var instanceof zt5.a) {
                    return new au5.a.InterfaceC2575a.C2576a(((zt5.a) zt5Var).b);
                }
                if (zt5Var instanceof zt5.b) {
                    return au5.a.InterfaceC2575a.b.a;
                }
                if (zt5Var instanceof zt5.c) {
                    return au5.a.InterfaceC2575a.c.a;
                }
                throw new NoWhenBranchMatchedException();
            case 4:
                return (MessagesContactDto) j5g.Y((List) obj);
            case 5:
                return Boolean.valueOf(((oy9) obj).g);
            case 6:
                Float f = (Float) obj;
                f.floatValue();
                return f;
            case 7:
                nmv nmvVar = (nmv) obj;
                return Boolean.valueOf((!(nmvVar instanceof ClipsGridHeaderEntry.Author) || (contentType = ((ClipsGridHeaderEntry.Author) nmvVar).e) == ClipsGridHeaderEntry.Author.ContentType.MASK || contentType == ClipsGridHeaderEntry.Author.ContentType.EFFECT) ? false : true);
            case 8:
                Intent intent = (Intent) obj;
                intent.putExtra("selection_limit", 1);
                intent.putExtra("single_mode", true);
                intent.putExtra("media_type", Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE);
                intent.putExtra("camera_enabled", false);
                intent.putExtra("initialize_camera", false);
                intent.putExtra("enable_default_album_entries", false);
                intent.putExtra("prevent_styling", true);
                intent.putExtra("enable_orientation_locker", true);
                intent.putExtra("new_photo_editor_collage_context", true);
                return s3q0.a;
            case 9:
                qgi0.r((tgi0) obj, "errorTitle");
                return s3q0.a;
            case 10:
                h03.b((Throwable) obj);
                return s3q0.a;
            case 11:
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 12:
                Map.Entry entry = (Map.Entry) obj;
                return new Pair(entry.getKey(), ((UserProfile) entry.getValue()).l0());
            case 13:
                rry rryVar = (rry) obj;
                for (int i2 = 0; i2 < 20; i2++) {
                    rry.j(rryVar, null, eli.a, 7);
                }
                return s3q0.a;
            case 14:
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            case 15:
                x8j x8jVar = (x8j) obj;
                ContactsListFactory contactsListFactory = ContactsListFactory.CREATE_CONVERSATION_VKME;
                return new rbj(5, x8jVar.c, x8jVar.a, SortOrder.BY_NAME, x8jVar.d, false, "ContactsListComponent", x8jVar.e);
            case 16:
                LinkedHashMap linkedHashMap = DialogActionsListView.j;
                return m33.a(R.drawable.vk_icon_add_square_outline_28, (Context) obj);
            case 17:
                return Boolean.TRUE;
            case 18:
                AvatarAnimatedStack avatarAnimatedStack = new AvatarAnimatedStack((Context) obj, null, 6);
                tlo0.Companion.getClass();
                avatarAnimatedStack.setText(new tlo0.h("Нравится Ивану и ещё 5 людям плюс очень длинный текст, чтобы не помещался в одну строку"));
                avatarAnimatedStack.a(null, e43.l("https://sun9-56.userapi.com/s/v1/ig2/cqW3O-sLWt9GB7fe8QspKJrGQGL_xgqZpw3bGkXTBgIxC8TBMVV7oggz7M4Ui7YnnQKiHTHMuamC3cONaMu_POMV.jpg?quality=95&as=32x24,48x36,72x54,108x81,160x120,240x180,360x270,480x360,540x405,640x480,720x540,800x600&from=bu&u=KCYXtnqDaHJ8JdBSHVrMQK4qMANCAxnpn7IXNr7YYYY&cs=800x0", "https://sun9-11.userapi.com/s/v1/ig2/8ASAJV_87mlTav5DoI-KU1OkK-2oZxOtJ062kVx7F3JElLG8Jj6M1TxCp5W9wlQngPZ9eU2Qfsc2rpxECzJU4jMD.jpg?quality=95&as=32x32,48x48,72x72,108x108,160x160,240x240,360x360,480x480,540x540,640x640,720x720,1080x1080&from=bu&u=piXpizO0HgNnhrf-R793MglftMbsHbMgi3HSaAXZ7j0&cs=1080x0"));
                return avatarAnimatedStack;
            case 19:
                return ((JSONObject) obj).getJSONObject("response");
            case 20:
                ArrayList arrayList2 = new ArrayList();
                List<UsersUserFullDto> d = ((FriendsSearchResponseDto) obj).d();
                ArrayList arrayList3 = new ArrayList(c5g.u(d, 10));
                for (UsersUserFullDto usersUserFullDto : d) {
                    Serializer.c<ProfileFriendItem> cVar = ProfileFriendItem.CREATOR;
                    arrayList3.add(ProfileFriendItem.a.b(usersUserFullDto));
                }
                return new cts(arrayList2, arrayList3);
            case 21:
                return Long.valueOf(((LocalDateTime) obj).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli());
            case 22:
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("response");
                if (optJSONObject != null) {
                    return Long.valueOf(optJSONObject.optLong("count"));
                }
                return null;
            case 23:
                return io.reactivex.rxjava3.core.q.T(new c4u.a(null, null, false));
            case 24:
                return y6u.a.c.b;
            case 25:
                ((dw20) obj).tn();
                return s3q0.a;
            case 26:
                GroupsGetSuggestionsResponseDto groupsGetSuggestionsResponseDto = (GroupsGetSuggestionsResponseDto) obj;
                String i3 = groupsGetSuggestionsResponseDto.f().i();
                String title = groupsGetSuggestionsResponseDto.getTitle();
                String e = groupsGetSuggestionsResponseDto.e();
                List<GroupsSuggestionDto> d2 = groupsGetSuggestionsResponseDto.d();
                ArrayList arrayList4 = new ArrayList(c5g.u(d2, 10));
                Iterator<T> it2 = d2.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(hru.a((GroupsSuggestionDto) it2.next()));
                }
                return new GroupsSuggestions(i3, title, e, p4g.q(arrayList4), null, groupsGetSuggestionsResponseDto.r());
            case 27:
                bn40.c((Throwable) obj, new Object[0]);
                return s3q0.a;
            case 28:
                List<UsersUserFullDto> list2 = (List) obj;
                ArrayList arrayList5 = new ArrayList(c5g.u(list2, 10));
                for (UsersUserFullDto usersUserFullDto2 : list2) {
                    Serializer.c<ProfileFriendItem> cVar2 = ProfileFriendItem.CREATOR;
                    arrayList5.add(ProfileFriendItem.a.b(usersUserFullDto2));
                }
                return arrayList5;
            default:
                sxp sxpVar = (sxp) obj;
                if (!(sxpVar instanceof OnCacheInvalidateEvent) && !(sxpVar instanceof p680)) {
                    r4 = false;
                }
                return Boolean.valueOf(r4);
        }
    }

    public /* synthetic */ sm0(xt5 xt5Var) {
        this.b = 3;
    }
}
