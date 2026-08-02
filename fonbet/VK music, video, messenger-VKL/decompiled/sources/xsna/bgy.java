package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.viewpager2.widget.ViewPager2;
import com.vk.api.generated.groups.dto.GroupsGetObjectExtendedResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.notifications.dto.NotificationsGetRedesignSettingsResponseDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingHintDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingRedesignDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingsSectionRedesignDto;
import com.vk.api.generated.notifications.dto.NotificationsUnifiedNotificationDto;
import com.vk.clips.design.view.timeline.MultiVideoTimelineView;
import com.vk.comments.impl.marketitem.commentlist.presentation.MarketItemCommentsFragment;
import com.vk.core.preference.Preference;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachAudioMsg;
import com.vk.dto.attaches.AttachWithDownload;
import com.vk.dto.common.data.VKList;
import com.vk.dto.group.Group;
import com.vk.ecomm.market.album.editor.cover.presentation.MarketEditAlbumCoverFragment;
import com.vk.ecomm.reviews.impl.marketitem.replies.presentation.MarketItemReviewRepliesFragment;
import com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.MarketItemReviewsFragment;
import com.vk.im.engine.models.messages.Msg;
import com.vk.lists.ListDataSet;
import com.vk.music.snippet.ui.presentation.MusicSnippetsFragment;
import com.vk.newsfeed.api.posting.author.PostingAuthor;
import com.vk.newsfeed.impl.fragments.NewsfeedFeedbackPollFragment;
import com.vk.newsfeed.impl.postmodal.reactions.tabs.b;
import com.vk.newsfeed.impl.postmodal.reactions.tabs.reposts.ModalPostRepostsTabFragment;
import com.vk.newsfeed.posting.additional_settings.domain.model.author.WallOwner;
import com.vk.newsfeed.posting.impl.domain.model.ActionsAvailabilityState;
import com.vk.newsfeed.posting.impl.domain.model.PostEditableData;
import com.vk.newsfeed.posting.impl.domain.model.PostEditingReason;
import com.vk.newsfeed.posting.impl.domain.model.PostingContext;
import com.vk.newsfeed.posting.impl.domain.model.PostingHints;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.presentation.model.DonutLevel;
import com.vk.newsfeed.posting.impl.presentation.model.PostingSettings;
import com.vk.newsfeed.posting.impl.presentation.model.ui.PrivacyViewState;
import com.vk.newsfeed.posting.privacy_picker.model.PrivacyPostType;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.ala0;
import xsna.c610;
import xsna.cf70;
import xsna.ctb0;
import xsna.dvc0;
import xsna.nh70;
import xsna.oox0;
import xsna.tlo0;
import xsna.xn50;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class bgy implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bgy(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v109, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v81, types: [android.view.ViewGroup, xsna.ype0] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        AttachWithDownload attachWithDownload;
        File i1;
        NotificationsNotificationSettingHintDto notificationsNotificationSettingHintDto;
        NotificationsUnifiedNotificationDto e;
        PrivacyViewState privacyViewState;
        int i = 10;
        Object obj2 = null;
        ArrayList arrayList = null;
        switch (this.b) {
            case 0:
                ((cgy) this.c).m.invoke();
                return s3q0.a;
            case 1:
                MarketEditAlbumCoverFragment marketEditAlbumCoverFragment = (MarketEditAlbumCoverFragment) this.c;
                zzo0 zzo0Var = (zzo0) obj;
                int i2 = MarketEditAlbumCoverFragment.c0;
                String str = zzo0Var.a;
                EditText editText = marketEditAlbumCoverFragment.R;
                if (editText == null) {
                    editText = null;
                }
                if (!epx.f(editText.getText().toString(), str)) {
                    EditText editText2 = marketEditAlbumCoverFragment.R;
                    if (editText2 == null) {
                        editText2 = null;
                    }
                    editText2.setText(str);
                    EditText editText3 = marketEditAlbumCoverFragment.R;
                    if (editText3 == null) {
                        editText3 = null;
                    }
                    editText3.setSelection(zzo0Var.b);
                }
                boolean z = zzo0Var.c;
                TextView textView = marketEditAlbumCoverFragment.V;
                if (textView == null) {
                    textView = null;
                }
                awt0.v(textView, z);
                if (z) {
                    TextView textView2 = marketEditAlbumCoverFragment.V;
                    if (textView2 == null) {
                        textView2 = null;
                    }
                    textView2.setVisibility(0);
                    EditText editText4 = marketEditAlbumCoverFragment.R;
                    dhr0.h0(marketEditAlbumCoverFragment.Z, editText4 != null ? editText4 : null);
                } else {
                    TextView textView3 = marketEditAlbumCoverFragment.V;
                    if (textView3 == null) {
                        textView3 = null;
                    }
                    f4m.j(textView3);
                    EditText editText5 = marketEditAlbumCoverFragment.R;
                    dhr0.h0(marketEditAlbumCoverFragment.a0, editText5 != null ? editText5 : null);
                }
                return s3q0.a;
            case 2:
                MarketItemCommentsFragment marketItemCommentsFragment = (MarketItemCommentsFragment) this.c;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                WriteBar writeBar = marketItemCommentsFragment.T;
                if (writeBar != null) {
                    bwt0.p0(writeBar, booleanValue);
                }
                View view = marketItemCommentsFragment.U;
                if (view != null) {
                    bwt0.p0(view, booleanValue);
                }
                return s3q0.a;
            case 3:
                MarketItemReviewRepliesFragment marketItemReviewRepliesFragment = (MarketItemReviewRepliesFragment) this.c;
                gom0 gom0Var = (gom0) obj;
                qcy<Object>[] qcyVarArr = MarketItemReviewRepliesFragment.b0;
                gom0.a(gom0Var, com.vk.ecomm.reviews.impl.marketitem.replies.presentation.f.b, new bo3(marketItemReviewRepliesFragment, 10));
                gom0.a(gom0Var, com.vk.ecomm.reviews.impl.marketitem.replies.presentation.g.b, new id4(marketItemReviewRepliesFragment, 7));
                gom0.a(gom0Var, com.vk.ecomm.reviews.impl.marketitem.replies.presentation.h.b, new jd4(marketItemReviewRepliesFragment, 11));
                gom0.a(gom0Var, com.vk.ecomm.reviews.impl.marketitem.replies.presentation.i.b, new yg7(marketItemReviewRepliesFragment, 9));
                int i3 = 10;
                gom0.a(gom0Var, com.vk.ecomm.reviews.impl.marketitem.replies.presentation.j.b, new zg7(marketItemReviewRepliesFragment, i3));
                gom0.a(gom0Var, com.vk.ecomm.reviews.impl.marketitem.replies.presentation.d.b, new w69(marketItemReviewRepliesFragment, i3));
                gom0.a(gom0Var, com.vk.ecomm.reviews.impl.marketitem.replies.presentation.e.b, new o85(marketItemReviewRepliesFragment, 8));
                return s3q0.a;
            case 4:
                MarketItemReviewsFragment marketItemReviewsFragment = (MarketItemReviewsFragment) this.c;
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                e2g0 e2g0Var = marketItemReviewsFragment.R;
                if (e2g0Var != null) {
                    e2g0Var.t(booleanValue2);
                }
                return s3q0.a;
            case 5:
                ((x510) this.c).T((c610.c) obj);
                return s3q0.a;
            case 6:
                ((p31) this.c).run();
                return s3q0.a;
            case 7:
                ModalPostRepostsTabFragment modalPostRepostsTabFragment = (ModalPostRepostsTabFragment) this.c;
                b.C1398b c1398b = (b.C1398b) obj;
                int i4 = ModalPostRepostsTabFragment.Y;
                if ((c1398b != null ? c1398b.a : 0) > 0) {
                    ListDataSet<com.vk.newsfeed.impl.postmodal.reactions.tabs.b> listDataSet = modalPostRepostsTabFragment.Q;
                    Iterator it = i7o0.a(listDataSet.d).iterator();
                    while (it.hasNext()) {
                        com.vk.newsfeed.impl.postmodal.reactions.tabs.b bVar = (com.vk.newsfeed.impl.postmodal.reactions.tabs.b) it.next();
                        if (bVar instanceof b.C1398b) {
                            ListDataSet.ArrayListImpl<com.vk.newsfeed.impl.postmodal.reactions.tabs.b> arrayListImpl = listDataSet.d;
                            int size = arrayListImpl.size();
                            int i5 = 0;
                            while (true) {
                                if (i5 >= size) {
                                    i5 = -1;
                                } else {
                                    com.vk.newsfeed.impl.postmodal.reactions.tabs.b bVar2 = arrayListImpl.get(i5);
                                    if (!((bVar2 == null && bVar == null) || (bVar2 != null && bVar2.equals(bVar)))) {
                                        i5++;
                                    }
                                }
                            }
                            if (i5 >= 0) {
                                listDataSet.k(i5);
                                arrayListImpl.remove(i5);
                                listDataSet.p(i5);
                            }
                        }
                    }
                    listDataSet.x(0, c1398b);
                }
                return s3q0.a;
            case 8:
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.c;
                Attach attach = (Attach) obj;
                if (!(attach instanceof AttachWithDownload) || (i1 = (attachWithDownload = (AttachWithDownload) attach).i1()) == null || !i1.exists() || i1.length() == 0 || attachWithDownload.X6()) {
                    return s3q0.a;
                }
                ref$BooleanRef.element = true;
                return s3q0.a;
            case 9:
                do30 do30Var = (do30) this.c;
                pk30 pk30Var = do30Var.m;
                eo30 eo30Var = do30Var.l;
                Msg msg = eo30Var != null ? eo30Var.q : null;
                Attach attach2 = eo30Var != null ? eo30Var.s : null;
                AttachAudioMsg attachAudioMsg = attach2 instanceof AttachAudioMsg ? (AttachAudioMsg) attach2 : null;
                if (pk30Var != null && msg != null && attachAudioMsg != null) {
                    pk30Var.a0(msg, eo30Var != null ? eo30Var.r : null, attachAudioMsg);
                }
                return s3q0.a;
            case 10:
                is30 is30Var = (is30) this.c;
                pk30 pk30Var2 = is30Var.k;
                js30 js30Var = is30Var.l;
                Msg msg2 = js30Var != null ? js30Var.m : null;
                if (pk30Var2 != null && msg2 != null) {
                    pk30Var2.j(msg2);
                }
                return s3q0.a;
            case 11:
                rx30 rx30Var = (rx30) this.c;
                int i6 = uur0.r;
                return new uur0(rx30Var.i.inflate(R.layout.vkim_search_phonebook_contact_list_item, (ViewGroup) obj, false), rx30Var.h);
            case 12:
                MultiVideoTimelineView multiVideoTimelineView = (MultiVideoTimelineView) this.c;
                ArrayList arrayList2 = (ArrayList) obj;
                int i7 = MultiVideoTimelineView.y0;
                if (arrayList2 != null) {
                    multiVideoTimelineView.getFrames().clear();
                    multiVideoTimelineView.getFrames().addAll(arrayList2);
                    ArrayList arrayList3 = new ArrayList();
                    int size2 = multiVideoTimelineView.getFrames().size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        arrayList3.add(new MultiVideoTimelineView.b(MultiVideoTimelineView.a.NORMAL, 0));
                    }
                    multiVideoTimelineView.k0.addAll(arrayList3);
                    multiVideoTimelineView.invalidate();
                }
                return s3q0.a;
            case 13:
                MusicSnippetsFragment musicSnippetsFragment = (MusicSnippetsFragment) this.c;
                int i9 = MusicSnippetsFragment.Y;
                musicSnippetsFragment.getClass();
                xn50.a.c(musicSnippetsFragment, (g650) obj);
                return s3q0.a;
            case 14:
                awt0.x((View) obj, 0, ((ga50) this.c).o, 0, 0, 13);
                return s3q0.a;
            case 15:
                com.vk.superapp.widget_settings.p004new.a aVar = (com.vk.superapp.widget_settings.p004new.a) this.c;
                oox0.a.AbstractC3459a abstractC3459a = (oox0.a.AbstractC3459a) obj;
                if (abstractC3459a instanceof oox0.a.AbstractC3459a.b) {
                    VkPlaceholder vkPlaceholder = aVar.k1;
                    if (vkPlaceholder == null) {
                        vkPlaceholder = null;
                    }
                    f4m.j(vkPlaceholder);
                    ViewPager2 viewPager2 = aVar.j1;
                    (viewPager2 != null ? viewPager2 : null).setVisibility(0);
                } else if (abstractC3459a instanceof oox0.a.AbstractC3459a.C3460a) {
                    VkPlaceholder vkPlaceholder2 = aVar.k1;
                    if (vkPlaceholder2 == null) {
                        vkPlaceholder2 = null;
                    }
                    vkPlaceholder2.setVisibility(0);
                    ViewPager2 viewPager22 = aVar.j1;
                    (viewPager22 != null ? viewPager22 : null).setVisibility(4);
                } else {
                    int i10 = com.vk.superapp.widget_settings.p004new.a.n1;
                    if (!(abstractC3459a instanceof oox0.a.AbstractC3459a.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return s3q0.a;
            case 16:
                NewsfeedFeedbackPollFragment newsfeedFeedbackPollFragment = (NewsfeedFeedbackPollFragment) this.c;
                int i11 = NewsfeedFeedbackPollFragment.g0;
                newsfeedFeedbackPollFragment.finish();
                return s3q0.a;
            case 17:
                ((qe70) this.c).T(cf70.j.b);
                return s3q0.a;
            case 18:
                hg70 hg70Var = (hg70) this.c;
                NotificationsGetRedesignSettingsResponseDto notificationsGetRedesignSettingsResponseDto = (NotificationsGetRedesignSettingsResponseDto) obj;
                boolean f = zqn0.a.f();
                hpt0 hpt0Var = hg70Var.n;
                msn msnVar = hg70Var.g;
                List<NotificationsNotificationSettingsSectionRedesignDto> d = notificationsGetRedesignSettingsResponseDto.d();
                if (d != null) {
                    List<NotificationsNotificationSettingsSectionRedesignDto> list = d;
                    ArrayList arrayList4 = new ArrayList(c5g.u(list, 10));
                    for (NotificationsNotificationSettingsSectionRedesignDto notificationsNotificationSettingsSectionRedesignDto : list) {
                        List<NotificationsNotificationSettingRedesignDto> e2 = notificationsNotificationSettingsSectionRedesignDto.e();
                        ArrayList arrayList5 = new ArrayList(c5g.u(e2, i));
                        for (NotificationsNotificationSettingRedesignDto notificationsNotificationSettingRedesignDto : e2) {
                            NotificationsNotificationSettingHintDto d2 = notificationsNotificationSettingRedesignDto.d();
                            if ((d2 != null ? d2.e() : null) != null) {
                                NotificationsNotificationSettingHintDto d3 = notificationsNotificationSettingRedesignDto.d();
                                if (d3 != null) {
                                    NotificationsNotificationSettingHintDto d4 = notificationsNotificationSettingRedesignDto.d();
                                    notificationsNotificationSettingHintDto = NotificationsNotificationSettingHintDto.a(d3, (d4 == null || (e = d4.e()) == null) ? null : ci70.a(e));
                                } else {
                                    notificationsNotificationSettingHintDto = null;
                                }
                                notificationsNotificationSettingRedesignDto = NotificationsNotificationSettingRedesignDto.a(notificationsNotificationSettingRedesignDto, null, notificationsNotificationSettingHintDto, null, 239);
                            }
                            arrayList5.add(notificationsNotificationSettingRedesignDto);
                        }
                        arrayList4.add(NotificationsNotificationSettingsSectionRedesignDto.a(notificationsNotificationSettingsSectionRedesignDto, arrayList5));
                        i = 10;
                    }
                    arrayList = arrayList4;
                }
                NotificationsGetRedesignSettingsResponseDto a = NotificationsGetRedesignSettingsResponseDto.a(notificationsGetRedesignSettingsResponseDto, arrayList);
                boolean z2 = hg70Var.f.a() && o25.a().g().size() > 1;
                boolean z3 = Preference.f("multi_push_settings_prefs").getBoolean("is_multi_push_disabled", true);
                hpt0Var.getClass();
                hg70Var.T(new rg70(new gg70(f, a, z2, z3, Preference.j().getBoolean("notifyLED", false), Preference.j().getInt("notifyLedColor", -1), Integer.valueOf(msnVar.e()))));
                if (hg70Var.h && !msnVar.b()) {
                    hg70Var.p.b(nh70.d.a);
                }
                return s3q0.a;
            case 19:
                ((c080) this.c).m = System.currentTimeMillis();
                return s3q0.a;
            case 20:
                zvj.c((hpj) this.c, null);
                return s3q0.a;
            case 21:
                ?? r1 = (ViewGroup) this.c;
                ctb0.b bVar3 = (ctb0.b) obj;
                int i12 = ri80.n1;
                if (!(bVar3 instanceof ctb0.b.c)) {
                    return s3q0.a;
                }
                r1.setState(((ctb0.b.c) bVar3).a);
                return s3q0.a;
            case 22:
                ala0 ala0Var = (ala0) this.c;
                ((zak0) ala0Var.i).setValue((ala0.a) ala0Var.c.get((String) obj));
                return s3q0.a;
            case 23:
                k3b0 k3b0Var = (k3b0) this.c;
                Long l = ((l3b0) obj).g;
                k3b0Var.getClass();
                if (l == null) {
                    return null;
                }
                long longValue = l.longValue();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                return String.format(Locale.getDefault(), "%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf((int) timeUnit.toMinutes(longValue)), Integer.valueOf(((int) timeUnit.toSeconds(longValue)) % 60)}, 2));
            case 24:
                ((da50) this.c).invoke();
                return s3q0.a;
            case 25:
                wcc0 wcc0Var = (wcc0) this.c;
                com.vk.newsfeed.api.posting.author.a aVar2 = (com.vk.newsfeed.api.posting.author.a) obj;
                ListBuilder e3 = e43.e();
                e3.add(aVar2.b);
                e3.addAll(aVar2.c);
                ListBuilder g = e3.g();
                ListIterator listIterator = g.listIterator(0);
                while (true) {
                    ListBuilder.a aVar3 = (ListBuilder.a) listIterator;
                    if (aVar3.hasNext()) {
                        Object next = aVar3.next();
                        if (epx.f(((PostingAuthor) next).d(), aVar2.a)) {
                            obj2 = next;
                        }
                    }
                }
                PostingAuthor postingAuthor = (PostingAuthor) obj2;
                if (postingAuthor == null) {
                    postingAuthor = aVar2.b;
                }
                wcc0Var.b.getClass();
                return new ucc0(postingAuthor, g, com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.domain.a.a(postingAuthor));
            case 26:
                com.vk.newsfeed.impl.posting.a aVar4 = (com.vk.newsfeed.impl.posting.a) this.c;
                GroupsGetObjectExtendedResponseDto groupsGetObjectExtendedResponseDto = (GroupsGetObjectExtendedResponseDto) obj;
                VKList vKList = new VKList(groupsGetObjectExtendedResponseDto.getCount(), 0);
                Iterator<GroupsGroupFullDto> it2 = groupsGetObjectExtendedResponseDto.e().iterator();
                while (it2.hasNext()) {
                    Group a2 = dqu.a(it2.next());
                    if (!a2.o()) {
                        vKList.add(a2);
                    }
                }
                aVar4.f(Boolean.valueOf(!vKList.isEmpty()));
                return vKList;
            case 27:
                qkc0 qkc0Var = (qkc0) this.c;
                PostingState.Editing editing = (PostingState.Editing) obj;
                if (!qkc0Var.i.k()) {
                    return null;
                }
                ((wfd0) qkc0Var.j.getValue()).getClass();
                PostingHints postingHints = editing.o;
                ActionsAvailabilityState actionsAvailabilityState = editing.l;
                PostingContext postingContext = editing.c;
                PostEditingReason postEditingReason = editing.h;
                PostingSettings postingSettings = editing.d;
                PostEditableData postEditableData = editing.i;
                boolean z4 = postingContext.c;
                WallOwner wallOwner = postingContext.b;
                Object[] objArr = fkq0.b(wallOwner.b) && postingSettings.f;
                boolean z5 = postingSettings.m;
                Object[] objArr2 = !(postEditingReason instanceof PostEditingReason.EditExistingPost) || postEditableData.z;
                PrivacyPostType privacyPostType = postEditableData.i;
                boolean z6 = x19.G(privacyPostType) && postEditableData.A;
                if (postEditingReason.Ja()) {
                    return null;
                }
                if (objArr2 != true && !z6) {
                    return null;
                }
                if (!z4 && (objArr != true || !z5)) {
                    return null;
                }
                if (fkq0.b(wallOwner.b)) {
                    if (!z5) {
                        return null;
                    }
                    boolean z7 = actionsAvailabilityState.i instanceof ActionsAvailabilityState.Availability.Available;
                    if (privacyPostType instanceof PrivacyPostType.AllDonuts) {
                        privacyViewState = new PrivacyViewState(tq.h(tlo0.Companion, R.string.privacy_settings_menu_post_for_dons_title), null, z7 ? PrivacyViewState.RightAction.Cancel : PrivacyViewState.RightAction.Open, z7, false);
                    } else if (privacyPostType instanceof PrivacyPostType.SingleDonutLevel) {
                        PrivacyViewState.RightAction rightAction = z7 ? PrivacyViewState.RightAction.Cancel : PrivacyViewState.RightAction.Open;
                        tlo0.f h = tq.h(tlo0.Companion, R.string.privacy_settings_menu_post_for_dons_title);
                        DonutLevel donutLevel = ((PrivacyPostType.SingleDonutLevel) privacyPostType).b;
                        privacyViewState = new PrivacyViewState(h, donutLevel != null ? tlo0.a.c(R.string.privacy_settings_donut_level_and_higher, donutLevel.c) : null, rightAction, z7, false);
                    } else {
                        privacyViewState = new PrivacyViewState(tq.h(tlo0.Companion, R.string.privacy_settings_menu_make_post_for_dons_title), new tlo0.f(R.string.privacy_settings_menu_post_open_for_all_now_subtitle), PrivacyViewState.RightAction.Open, z7, postingHints.k);
                    }
                } else {
                    if (!z5) {
                        return wfd0.a(editing);
                    }
                    boolean z8 = actionsAvailabilityState.i instanceof ActionsAvailabilityState.Availability.Available;
                    if (privacyPostType instanceof PrivacyPostType.AllDonuts) {
                        privacyViewState = new PrivacyViewState(tq.h(tlo0.Companion, R.string.privacy_and_donut_settings_menu_title), new tlo0.f(R.string.privacy_settings_menu_post_for_dons_title), PrivacyViewState.RightAction.Open, z8, false);
                    } else if (privacyPostType instanceof PrivacyPostType.SingleDonutLevel) {
                        tlo0.f h2 = tq.h(tlo0.Companion, R.string.privacy_and_donut_settings_menu_title);
                        DonutLevel donutLevel2 = ((PrivacyPostType.SingleDonutLevel) privacyPostType).b;
                        privacyViewState = new PrivacyViewState(h2, donutLevel2 != null ? tlo0.a.c(R.string.privacy_settings_menu_post_for_don_levels_subtitle, donutLevel2.c) : null, PrivacyViewState.RightAction.Open, z8, false);
                    } else {
                        if (!(privacyPostType instanceof PrivacyPostType.AllUsers)) {
                            return wfd0.a(editing);
                        }
                        privacyViewState = new PrivacyViewState(tq.h(tlo0.Companion, R.string.privacy_and_donut_settings_menu_title), new tlo0.f(R.string.privacy_settings_menu_post_open_for_all_subtitle), PrivacyViewState.RightAction.Open, z8, postingHints.k);
                    }
                }
                return privacyViewState;
            case 28:
                ((pvc0) this.c).c(new dvc0.a(new yo60.g.a((Throwable) obj)));
                return s3q0.a;
            default:
                return new hod0((ViewGroup) obj, ((aod0) this.c).i);
        }
    }

    public /* synthetic */ bgy(dqu dquVar, com.vk.newsfeed.impl.posting.a aVar) {
        this.b = 26;
        this.c = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ bgy(ype0 ype0Var) {
        this.b = 21;
        this.c = (ViewGroup) ype0Var;
    }
}
