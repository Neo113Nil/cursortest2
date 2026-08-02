package xsna;

import android.content.Context;
import android.view.ViewGroup;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetContentForTabsResponseDto;
import com.vk.api.generated.groups.dto.GroupsTabContentMarketDto;
import com.vk.api.generated.market.dto.MarketGetEditUrlResponseDto;
import com.vk.api.generated.market.dto.MarketMarketAlbumDto;
import com.vk.clips.attachments.impl.publish.geolocation.presentation.j;
import com.vk.clips.design.view.component.badge.ClipBadge;
import com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.BaseBadgeHolder;
import com.vk.dto.common.Good;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Thumb;
import com.vk.dto.posting.PostingVisibilityMode;
import com.vk.dto.shortvideo.entries.ClipsGridHeaderEntry;
import com.vk.dto.user.UserProfile;
import com.vk.file_picker.external.ExternalFilePickerFragment;
import com.vk.im.ui.components.contacts.ContactsListFactory;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.log.L;
import com.vk.music.snippet.api.presentation.model.SnippetSectionType;
import com.vk.newsfeed.api.posting.author.PostingAuthor;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import xsna.fih;
import xsna.mr3;
import xsna.tj50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class e60 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ e60(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object obj2;
        fih.a aVar;
        Integer e;
        int i = 2;
        int i2 = 10;
        int i3 = 0;
        switch (this.b) {
            case 0:
                Throwable th = (Throwable) obj;
                L.j(th, "Offline:ActionSynchronizerInteractorImpl", "Error subscribing to sync events.");
                com.vk.metrics.eventtracking.b.a.a(th);
                return s3q0.a;
            case 1:
                Group group = (Group) obj;
                UserId e2 = !fkq0.b(group.c) ? fkq0.e(group.c) : group.c;
                UserProfile userProfile = new UserProfile(group);
                int i4 = group.s;
                int i5 = group.n;
                ExtendedUserProfile j = bwd0.j(userProfile);
                j.d0 = i5;
                boolean z = i4 >= 2 && i5 != 0;
                j.g0 = z;
                String str = group.d;
                String str2 = str == null ? "" : str;
                String str3 = group.f;
                return new PostingAuthor.Community(e2, str2, (str3 == null && (str3 = group.e) == null) ? "" : str3, j, z, group.E, group.F, true);
            case 2:
                qgi0.r((tgi0) obj, "storefront_group_albums_title");
                return s3q0.a;
            case 3:
                kwg0.b().accept((Throwable) obj);
                return s3q0.a;
            case 4:
                int i6 = com.vk.profile.questions.impl.a.o1;
                qgi0.r((tgi0) obj, "answer_question_avatar");
                return s3q0.a;
            case 5:
                tj50.a aVar2 = (tj50.a) obj;
                jr3 jr3Var = new jr3(i3);
                ao8 ao8Var = ao8.d;
                return new mr3.a.C3368a(aVar2.a(jr3Var, ao8Var), aVar2.a(new nt(i), ao8Var));
            case 6:
                List list = (List) obj;
                List<ock0> list2 = list;
                ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                for (ock0 ock0Var : list2) {
                    String str4 = ock0Var.j;
                    String str5 = ock0Var.b;
                    String str6 = ock0Var.c;
                    Thumb thumb = ock0Var.d;
                    String str7 = ock0Var.e;
                    Iterator<E> it = SnippetSectionType.h().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (epx.f(((SnippetSectionType) obj2).i(), ock0Var.a.i())) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    SnippetSectionType snippetSectionType = (SnippetSectionType) obj2;
                    if (snippetSectionType == null) {
                        snippetSectionType = SnippetSectionType.DEFAULT;
                    }
                    ArrayList<wbk0> arrayList2 = ock0Var.f;
                    ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, i2));
                    for (wbk0 wbk0Var : arrayList2) {
                        wbk0Var.getClass();
                        arrayList3.add(new nbk0(wbk0Var.b, wbk0Var.c, null, false));
                    }
                    arrayList.add(new nck0(str4, str5, str6, thumb, str7, snippetSectionType, arrayList3));
                    i2 = 10;
                }
                return new Pair(list, arrayList);
            case 7:
                L.e("CallVmojiDelegate", "Ml model ready check signal emitted. Current thread is " + Thread.currentThread().getName());
                return s3q0.a;
            case 8:
                com.vk.metrics.eventtracking.b.a.q((Throwable) obj);
                return s3q0.a;
            case 9:
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : (List) obj) {
                    if (jnj.b(((MusicTrack) obj3).V)) {
                        arrayList4.add(obj3);
                    }
                }
                return arrayList4;
            case 10:
                return com.vk.channels.impl.comments.g.a((com.vk.channels.impl.comments.g) obj, null, null, null, true, 7);
            case 11:
                com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.c cVar = new com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.c((ViewGroup) obj);
                cVar.l.setMode(ClipBadge.BadgeMode.STATIC);
                cVar.t6(BaseBadgeHolder.BadgeSide.LEFT, new com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.b(1, cVar, com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.c.class, "calculateBadgeInsets", "calculateBadgeInsets(Lcom/vk/clips/viewer/impl/feed/view/list/item/badges/holders/BaseBadgeHolder$BadgeImageContent;)Landroid/graphics/Rect;", 0), new sd4(1), new b76((byte) 0, 0));
                return cVar;
            case 12:
                return j.e.a;
            case 13:
                nmv nmvVar = (nmv) obj;
                return Boolean.valueOf((nmvVar instanceof ClipsGridHeaderEntry.Author) && ((ClipsGridHeaderEntry.Author) nmvVar).e != ClipsGridHeaderEntry.Author.ContentType.COMPILATION);
            case 14:
                g620.f().getPrivacy().f((PostingVisibilityMode) obj);
                return s3q0.a;
            case 15:
                return Integer.valueOf(an10.b(sa30.E(((Float) obj).floatValue(), new k9x(-1, 1, 1), new k9x(-50, 50, 1))));
            case 16:
                return s3q0.a;
            case 17:
                qgi0.r((tgi0) obj, "community_addresses_address_top_bar_title");
                return s3q0.a;
            case 18:
                qgi0.r((tgi0) obj, "errorDescription");
                return s3q0.a;
            case 19:
                ((etv0) obj).b(false);
                return s3q0.a;
            case 20:
                GroupsGetContentForTabsResponseDto groupsGetContentForTabsResponseDto = (GroupsGetContentForTabsResponseDto) obj;
                GroupsTabContentMarketDto l = groupsGetContentForTabsResponseDto.l();
                if (l != null) {
                    ArrayList e3 = b210.e(l.g());
                    ArrayList arrayList5 = new ArrayList(c5g.u(e3, 10));
                    Iterator it2 = e3.iterator();
                    while (it2.hasNext()) {
                        arrayList5.add(new f5u((Good) it2.next()));
                    }
                    aVar = new fih.a(arrayList5, l.i(), l.f());
                } else {
                    aVar = null;
                }
                GroupsTabContentMarketDto l2 = groupsGetContentForTabsResponseDto.l();
                List<MarketMarketAlbumDto> d = l2 != null ? l2.d() : null;
                if (d == null) {
                    d = EmptyList.b;
                }
                List<MarketMarketAlbumDto> list3 = d;
                GroupsTabContentMarketDto l3 = groupsGetContentForTabsResponseDto.l();
                if (l3 != null && (e = l3.e()) != null) {
                    i3 = e.intValue();
                }
                int i7 = i3;
                GroupsTabContentMarketDto l4 = groupsGetContentForTabsResponseDto.l();
                return new fih.b(list3, i7, aVar, null, l4 != null ? l4.f() : null);
            case 21:
                String url = ((MarketGetEditUrlResponseDto) obj).getUrl();
                return url == null ? "" : url;
            case 22:
                w8j w8jVar = (w8j) obj;
                ContactsListFactory contactsListFactory = ContactsListFactory.CREATE_CONVERSATION_VKME;
                return new obm(w8jVar.a, w8jVar.b, w8jVar.c);
            case 23:
                qgi0.r((tgi0) obj, "creation_onboarding_task_dialog_snackbar_button");
                return s3q0.a;
            case 24:
                LinkedHashMap linkedHashMap = DialogActionsListView.j;
                return ((Context) obj).getString(R.string.vkim_dialog_attaches_open_chat);
            case 25:
                int i8 = ExternalFilePickerFragment.R;
                cvk.w((String) obj, false);
                return s3q0.a;
            case 26:
                L.g("loadCachedWithTimeout", (Throwable) obj);
                return s3q0.a;
            case 27:
                return new v990(R.layout.vk_view_default_list_loading, (ViewGroup) obj);
            case 28:
                return ((JSONObject) obj).getJSONObject("response");
            default:
                return Boolean.valueOf(((BaseOkResponseDto) obj) == BaseOkResponseDto.OK);
        }
    }

    public /* synthetic */ e60(Object obj, int i) {
        this.b = i;
    }
}
