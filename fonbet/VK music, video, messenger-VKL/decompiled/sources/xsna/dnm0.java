package xsna;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.entities.stat.StoryStatContainer;
import com.vk.dto.stories.model.LiveFinishedStoriesContainer;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryMemoryType;
import com.vk.dto.stories.model.StoryQuestionEntry;
import com.vk.dto.stories.model.StoryViewAction;
import com.vk.dto.stories.model.ads.MyTargetAdData;
import com.vk.dto.stories.model.ads.MyTargetAdFormat;
import com.vk.dto.stories.model.clickable.ClickableHashtag;
import com.vk.dto.stories.model.clickable.ClickableMention;
import com.vk.dto.stories.model.clickable.ClickableSticker;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryViewItem;
import com.vk.story.viewer.api.models.Action;
import com.vk.story.viewer.api.models.AttachType;
import com.vk.story.viewer.api.models.Gesture;
import com.vk.story.viewer.api.models.PreloadSource;
import com.vkontakte.android.data.b;
import io.appmetrica.analytics.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kotlin.collections.EmptyList;
import xsna.anm0;

/* compiled from: StoryViewerAnalyticsImpl.kt */
/* loaded from: classes6.dex */
public final class dnm0 implements anm0 {
    public final LinkedHashSet b = new LinkedHashSet();
    public Long c;

    /* compiled from: StoryViewerAnalyticsImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[MobileOfficialAppsConStoriesStat$ViewEntryPoint.values().length];
            try {
                iArr[MobileOfficialAppsConStoriesStat$ViewEntryPoint.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MobileOfficialAppsConStoriesStat$ViewEntryPoint.SNIPPET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[StoryViewAction.values().length];
            try {
                iArr2[StoryViewAction.LINK_CLICK.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[MyTargetAdFormat.values().length];
            try {
                iArr3[MyTargetAdFormat.STATIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr3[MyTargetAdFormat.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[MyTargetAdFormat.HTML5.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    @Override // xsna.anm0
    public final void A(boolean z, boolean z2, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint) {
        anm0.d(this, z2 ? z ? MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.CANCEL_UNNOTIFY_STORIES : MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.CANCEL_NOTIFY_STORIES : z ? MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.NOTIFY_STORIES : MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.UNNOTIFY_STORIES, mobileOfficialAppsCoreNavStat$EventScreen, mobileOfficialAppsConStoriesStat$ViewEntryPoint, null, null, 56);
    }

    @Override // xsna.anm0
    public final void B(Action action, AttachType attachType, Gesture gesture, long j) {
        b.d dVar = new b.d("messages_story_experiment");
        String obj = action.toString();
        Locale locale = Locale.ROOT;
        dVar.b(obj.toLowerCase(locale), "action");
        dVar.b(attachType.toString().toLowerCase(locale), "attach_type");
        dVar.b(Long.valueOf(j), "peer_id");
        dVar.b(gesture.toString().toLowerCase(locale), "gesture");
        dVar.b("messages", "source_camera");
        dVar.e();
    }

    @Override // xsna.anm0
    public final void C(jlm0 jlm0Var) {
        this.b.add(jlm0Var);
    }

    @Override // xsna.anm0
    public final void D() {
        b.d dVar = new b.d("stories_questions_actions");
        dVar.b("share_action", "action");
        dVar.e();
    }

    @Override // xsna.anm0
    public final void F(ClickableMention clickableMention) {
        b.d a2 = io.reactivex.rxjava3.processors.b.a("story_mention", "action", CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE);
        String str = clickableMention.g;
        if (str == null) {
            str = "";
        }
        a2.b(str, TtmlNode.TAG_STYLE);
        a2.e();
    }

    @Override // xsna.anm0
    public final void G(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, StoryEntry storyEntry, u8m0 u8m0Var) {
        anm0.d(this, MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.OPEN_RECOMMENDATION_RULES, mobileOfficialAppsCoreNavStat$EventScreen, mobileOfficialAppsConStoriesStat$ViewEntryPoint, storyEntry, u8m0Var, 32);
    }

    @Override // xsna.anm0
    public final void H(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, StoryEntry storyEntry, u8m0 u8m0Var) {
        anm0.d(this, MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.AD_LINK_COPY, mobileOfficialAppsCoreNavStat$EventScreen, mobileOfficialAppsConStoriesStat$ViewEntryPoint, storyEntry, u8m0Var, 32);
    }

    @Override // xsna.anm0
    public final void I(StoryEntry storyEntry) {
        b.d dVar = new b.d("story_link_view");
        dVar.b(Integer.valueOf(storyEntry.c), "story_id");
        dVar.b(storyEntry.d, "owner_id");
        String str = storyEntry.u;
        if (str != null && str.length() != 0) {
            dVar.b(storyEntry.u, "track_code");
        }
        dVar.e();
    }

    @Override // xsna.anm0
    public final void J(StoryViewAction storyViewAction, StoryQuestionEntry storyQuestionEntry, xkm0 xkm0Var) {
        K(storyViewAction, xkm0Var, new z6f0(storyQuestionEntry, 17));
    }

    @Override // xsna.anm0
    public final void K(StoryViewAction storyViewAction, xkm0 xkm0Var, izs<? super b.d, s3q0> izsVar) {
        String str = xkm0Var.a;
        MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint = xkm0Var.b;
        if (mobileOfficialAppsConStoriesStat$ViewEntryPoint == null) {
            mobileOfficialAppsConStoriesStat$ViewEntryPoint = MobileOfficialAppsConStoriesStat$ViewEntryPoint.LIST;
        }
        c(storyViewAction, str, mobileOfficialAppsConStoriesStat$ViewEntryPoint, xkm0Var.d, xkm0Var.c, new ab(21, xkm0Var, izsVar));
    }

    @Override // xsna.anm0
    public final void L(xkm0 xkm0Var) {
        K(StoryViewAction.COMMENT_AUDIO_SEND, xkm0Var, null);
    }

    @Override // xsna.anm0
    public final void M(StoryEntry storyEntry, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, u8m0 u8m0Var) {
        anm0.E(this, StoryViewAction.MUSIC_ADDED, com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.STORY_VIEWER), mobileOfficialAppsConStoriesStat$ViewEntryPoint, storyEntry, u8m0Var, 32);
    }

    @Override // xsna.anm0
    public final void N() {
        b.d dVar = new b.d("stories_questions_actions");
        dVar.b("message_action", "action");
        dVar.e();
    }

    @Override // xsna.anm0
    public final void O(StoriesContainer storiesContainer, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint) {
        io.reactivex.rxjava3.core.x l0Var;
        StoryEntry Bb = storiesContainer.Bb();
        boolean A = fsk.A(storiesContainer);
        boolean z = storiesContainer instanceof LiveFinishedStoriesContainer;
        if (Bb == null || A || z || Bb.h) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Bb.d);
        sb.append('_');
        sb.append(Bb.c);
        String sb2 = sb.toString();
        String lowerCase = mobileOfficialAppsConStoriesStat$ViewEntryPoint.name().toLowerCase(Locale.getDefault());
        cul0 cul0Var = cul0.b;
        ArrayList arrayList = cul0.c;
        int i = 28;
        if (arrayList.isEmpty()) {
            io.reactivex.rxjava3.internal.operators.maybe.n nVar = new io.reactivex.rxjava3.internal.operators.maybe.n(((gvg0) cul0.d.getValue()).b(io.reactivex.rxjava3.schedulers.a.b()), new vvi0(new qcw(i), 3));
            EmptyList emptyList = EmptyList.b;
            Objects.requireNonNull(emptyList, "defaultItem is null");
            l0Var = new io.reactivex.rxjava3.internal.operators.maybe.l0(nVar, emptyList);
        } else {
            l0Var = io.reactivex.rxjava3.core.x.k(arrayList);
        }
        new io.reactivex.rxjava3.internal.operators.single.o(l0Var.l(new xb20(new bul0(sb2), 16)).m(io.reactivex.rxjava3.android.schedulers.a.b()), new fs00(new i0r(21), 24)).l(new o8c0(new k220(i), 4)).subscribe(new ux00(new xzk0(1, lowerCase, sb2), 23));
    }

    @Override // xsna.anm0
    public final void P(MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, String str, String str2) {
        b.d dVar = new b.d("story_question");
        dVar.b(StoryViewAction.COMMENT_SEND, "action");
        dVar.b(str, "nav_screen");
        dVar.b(str2, "ref");
        dVar.b(mobileOfficialAppsConStoriesStat$ViewEntryPoint.name().toLowerCase(Locale.ROOT), "source");
        dVar.e();
    }

    @Override // xsna.anm0
    public final void Q(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, StoryEntry storyEntry, u8m0 u8m0Var) {
        anm0.d(this, MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.PRIVACY_MODAL_CLICK_TO_CREATE_STORY, mobileOfficialAppsCoreNavStat$EventScreen, mobileOfficialAppsConStoriesStat$ViewEntryPoint, storyEntry, u8m0Var, 32);
    }

    @Override // xsna.anm0
    public final void R(boolean z) {
        b.d a2 = io.reactivex.rxjava3.processors.b.a("stories_questions_actions", "action", "share_btn");
        a2.b(z ? "anonymous" : BuildConfig.SDK_BUILD_FLAVOR, "is_anonymous");
        a2.e();
    }

    public final void S(b.d dVar, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, StoryEntry storyEntry, u8m0 u8m0Var, izs<? super b.d, s3q0> izsVar) {
        MyTargetAdData myTargetAdData;
        String str;
        List<ClickableSticker> list;
        Long l;
        List<ClickableSticker> list2;
        e1j0.a.getClass();
        dVar.b(Integer.valueOf(e1j0.d), "volume");
        if (mobileOfficialAppsConStoriesStat$ViewEntryPoint != null) {
            dVar.b(mobileOfficialAppsConStoriesStat$ViewEntryPoint.toString().toLowerCase(Locale.ROOT), "view_entry_point");
        }
        if (storyEntry != null) {
            dVar.b(Integer.valueOf(storyEntry.c), "story_id");
            dVar.b(storyEntry.d, "story_owner_id");
            dVar.b(storyEntry.u, "track_code");
            if (storyEntry.C0 == StoryMemoryType.BIRTHDAY) {
                dVar.b(1, "is_story_teaser");
                dVar.b("birthday", "story_teaser_type");
                dVar.b(1, "is_congratulate_button_available");
                ClickableStickers clickableStickers = storyEntry.X;
                if (clickableStickers != null && (list2 = clickableStickers.d) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list2) {
                        if (obj instanceof ClickableMention) {
                            arrayList.add(obj);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        UserId userId = ((ClickableMention) it.next()).e;
                        l = userId != null ? Long.valueOf(userId.b) : null;
                        if (l != null) {
                            break;
                        }
                    }
                }
                l = null;
                if (l != null) {
                    dVar.b(Long.valueOf(l.longValue()), "user2_id");
                }
            }
            if (storyEntry.C0 == StoryMemoryType.MY_TOP_TRACK) {
                dVar.b(Integer.valueOf(!o25.a().a(storyEntry.d) ? 1 : 0), "is_my_favorite_track_available");
            }
            ClickableStickers clickableStickers2 = storyEntry.X;
            if (clickableStickers2 != null && (list = clickableStickers2.d) != null && !list.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((ClickableSticker) it2.next()).zb());
                }
                Serializer.c<StoryStatContainer> cVar = StoryStatContainer.CREATOR;
                dVar.b(StoryStatContainer.a.a(arrayList2), "clickable_stickers");
            }
        }
        if (storyEntry != null && (myTargetAdData = storyEntry.E0) != null) {
            Integer num = myTargetAdData.f;
            if (num != null) {
                dVar.b(Integer.valueOf(num.intValue()), "story_ad_id");
            }
            MyTargetAdData myTargetAdData2 = storyEntry.E0;
            MyTargetAdFormat myTargetAdFormat = myTargetAdData2 != null ? myTargetAdData2.d : null;
            int i = myTargetAdFormat == null ? -1 : a.$EnumSwitchMapping$2[myTargetAdFormat.ordinal()];
            if (i == 1) {
                str = "photo";
            } else if (i == 2) {
                str = "video";
            } else if (i == 3) {
                str = "html5_ad";
            }
            dVar.b(str, "story_type");
        }
        if (u8m0Var != null) {
            dVar.b(Integer.valueOf(u8m0Var.b), "stories_author_before");
            dVar.b(Integer.valueOf(u8m0Var.c), "stories_author_after");
            dVar.b(Long.valueOf(u8m0Var.a), "view_event_timeline_position");
            dVar.b(u8m0Var.d, "story_length");
            dVar.b(u8m0Var.e ? "1" : "0", "is_grouped");
        }
        Long l2 = this.c;
        if (l2 != null) {
            dVar.b(Long.valueOf(l2.longValue()), "story_viewer_session");
        }
        ugg.a(dVar);
        if (izsVar != null) {
            izsVar.invoke(dVar);
        }
        dVar.e();
    }

    @Override // xsna.anm0
    public final void a(ClickableMention clickableMention) {
        b.d a2 = io.reactivex.rxjava3.processors.b.a("story_mention", "action", "click");
        String str = clickableMention.g;
        if (str == null) {
            str = "";
        }
        a2.b(str, TtmlNode.TAG_STYLE);
        a2.e();
    }

    @Override // xsna.anm0
    public final void b(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, StoryEntry storyEntry, u8m0 u8m0Var) {
        anm0.d(this, MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.OPEN_ADVERTISER_INFORMATION, mobileOfficialAppsCoreNavStat$EventScreen, mobileOfficialAppsConStoriesStat$ViewEntryPoint, storyEntry, u8m0Var, 32);
    }

    @Override // xsna.anm0
    @ozl
    public final void c(StoryViewAction storyViewAction, String str, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, StoryEntry storyEntry, u8m0 u8m0Var, izs<? super b.d, s3q0> izsVar) {
        ClickableStickers clickableStickers;
        List<ClickableSticker> list;
        b.d dVar = new b.d("story_view");
        String obj = storyViewAction.toString();
        Locale locale = Locale.ROOT;
        dVar.b(obj.toLowerCase(locale), "event_type");
        ClickableSticker clickableSticker = null;
        dVar.b(str != null ? str.toLowerCase(locale) : null, "nav_screen");
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((anm0.b) it.next()).a(dVar);
        }
        if (storyEntry != null && (clickableStickers = storyEntry.X) != null && (list = clickableStickers.d) != null) {
            clickableSticker = (ClickableSticker) j5g.a0(list);
        }
        if (a.$EnumSwitchMapping$1[storyViewAction.ordinal()] == 1 && clickableSticker != null) {
            dVar.b(clickableSticker.zb().zb(), "clickable_sticker");
        }
        S(dVar, mobileOfficialAppsConStoriesStat$ViewEntryPoint, storyEntry, u8m0Var, izsVar);
    }

    @Override // xsna.anm0
    public final void e(PreloadSource preloadSource, StoryEntry storyEntry, long j) {
        long currentTimeMillis = System.currentTimeMillis() - j;
        if (preloadSource == null || currentTimeMillis < 0) {
            return;
        }
        b.d dVar = new b.d("stories_viewing_start_time");
        dVar.b(storyEntry.d, "owner_id");
        dVar.b(Integer.valueOf(storyEntry.c), "story_id");
        dVar.b(Long.valueOf(currentTimeMillis), "time");
        dVar.b(preloadSource.toString().toLowerCase(Locale.ROOT), "source");
        dVar.b(com.vk.core.utils.newtork.b.c().c(), "internet_type");
        String str = storyEntry.u;
        if (str != null && str.length() != 0) {
            dVar.b(storyEntry.u, "track_code");
        }
        dVar.e();
    }

    @Override // xsna.anm0
    public final void g(xkm0 xkm0Var) {
        K(StoryViewAction.COMMENT_AUDIO_START, xkm0Var, null);
    }

    @Override // xsna.anm0
    public final void h() {
        b.d dVar = new b.d("stories_questions_actions");
        dVar.b("ban_action", "action");
        dVar.e();
    }

    @Override // xsna.anm0
    public final void i(StoryEntry storyEntry, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, u8m0 u8m0Var) {
        anm0.E(this, StoryViewAction.LINK_SWIPE, com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.STORY_VIEWER), mobileOfficialAppsConStoriesStat$ViewEntryPoint, storyEntry, u8m0Var, 32);
    }

    @Override // xsna.anm0
    public final void j(StoryEntry storyEntry, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, u8m0 u8m0Var) {
        anm0.d(this, MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.CLICK_TO_CONGRATULATE, MobileOfficialAppsCoreNavStat$EventScreen.STORY_VIEWER, mobileOfficialAppsConStoriesStat$ViewEntryPoint, storyEntry, u8m0Var, 32);
    }

    @Override // xsna.anm0
    public final void k(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, StoryEntry storyEntry, u8m0 u8m0Var) {
        anm0.d(this, MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.COPY_ERID, mobileOfficialAppsCoreNavStat$EventScreen, mobileOfficialAppsConStoriesStat$ViewEntryPoint, storyEntry, u8m0Var, 32);
    }

    @Override // xsna.anm0
    public final void l(ClickableHashtag clickableHashtag) {
        b.d a2 = io.reactivex.rxjava3.processors.b.a("story_hashtag", "action", "search");
        String str = clickableHashtag.f;
        if (str == null) {
            str = "";
        }
        a2.b(str, TtmlNode.TAG_STYLE);
        a2.b(clickableHashtag.e, "text");
        a2.e();
    }

    @Override // xsna.anm0
    public final void m(StoryEntry storyEntry, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, u8m0 u8m0Var) {
        anm0.d(this, MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.MARK_NOT_INTERESTED, MobileOfficialAppsCoreNavStat$EventScreen.STORY_VIEWER, mobileOfficialAppsConStoriesStat$ViewEntryPoint, storyEntry, u8m0Var, 32);
    }

    @Override // xsna.anm0
    public final void n(boolean z, boolean z2, xkm0 xkm0Var) {
        K(z ? StoryViewAction.QUESTION_REPLY_PUBLIC : z2 ? StoryViewAction.QUESTION_REPLY_ANONYMOUS : StoryViewAction.QUESTION_REPLY, xkm0Var, null);
    }

    @Override // xsna.anm0
    public final void o() {
        this.c = Long.valueOf(System.currentTimeMillis() / 1000);
    }

    @Override // xsna.anm0
    public final void p(MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType eventType, String str, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, StoryEntry storyEntry, u8m0 u8m0Var, izs<? super b.d, s3q0> izsVar) {
        b.d dVar = new b.d("story_view");
        String obj = eventType.toString();
        Locale locale = Locale.ROOT;
        dVar.b(obj.toLowerCase(locale), "event_type");
        dVar.b(str != null ? str.toLowerCase(locale) : null, "nav_screen");
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((anm0.b) it.next()).a(dVar);
        }
        S(dVar, mobileOfficialAppsConStoriesStat$ViewEntryPoint, storyEntry, u8m0Var, izsVar);
    }

    @Override // xsna.anm0
    public final void q(MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType eventType, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, StoryEntry storyEntry, u8m0 u8m0Var, izs<? super b.d, s3q0> izsVar) {
        p(eventType, mobileOfficialAppsCoreNavStat$EventScreen != null ? com.vk.stat.scheme.t0.a(mobileOfficialAppsCoreNavStat$EventScreen) : null, mobileOfficialAppsConStoriesStat$ViewEntryPoint, storyEntry, u8m0Var, izsVar);
    }

    @Override // xsna.anm0
    public final void r(StoryEntry storyEntry, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, u8m0 u8m0Var) {
        anm0.d(this, MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.CLICK_TO_MY_FAVORITE_TRACK, MobileOfficialAppsCoreNavStat$EventScreen.STORY_VIEWER, mobileOfficialAppsConStoriesStat$ViewEntryPoint, storyEntry, u8m0Var, 32);
    }

    @Override // xsna.anm0
    public final void s(StoryEntry storyEntry, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, u8m0 u8m0Var) {
        anm0.E(this, StoryViewAction.LINK_CLICK, com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.STORY_VIEWER), mobileOfficialAppsConStoriesStat$ViewEntryPoint, storyEntry, u8m0Var, 32);
    }

    @Override // xsna.anm0
    public final void t(StoryViewAction storyViewAction, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, StoryEntry storyEntry, u8m0 u8m0Var, String str, izs<? super b.d, s3q0> izsVar) {
        int i = a.$EnumSwitchMapping$0[mobileOfficialAppsConStoriesStat$ViewEntryPoint.ordinal()];
        String lowerCase = i != 1 ? i != 2 ? mobileOfficialAppsConStoriesStat$ViewEntryPoint.name().toLowerCase(Locale.ROOT) : "link" : "feed";
        b.d dVar = new b.d("stories_viewer_navigation");
        dVar.b(storyEntry != null ? storyEntry.d : null, "owner_id");
        dVar.b(storyEntry != null ? Integer.valueOf(storyEntry.c) : null, "story_id");
        dVar.b(storyViewAction.toString().toLowerCase(Locale.ROOT), "action");
        dVar.b(lowerCase, "source");
        String str2 = storyEntry != null ? storyEntry.u : null;
        if (str2 != null && str2.length() != 0) {
            dVar.b(storyEntry != null ? storyEntry.u : null, "track_code");
        }
        dVar.e();
        if (str == null) {
            str = "unknown";
        }
        c(storyViewAction, str, mobileOfficialAppsConStoriesStat$ViewEntryPoint, storyEntry, u8m0Var, izsVar);
    }

    @Override // xsna.anm0
    public final void v(ClickableHashtag clickableHashtag) {
        b.d a2 = io.reactivex.rxjava3.processors.b.a("story_hashtag", "action", "click");
        String str = clickableHashtag.f;
        if (str == null) {
            str = "";
        }
        a2.b(str, TtmlNode.TAG_STYLE);
        a2.b(clickableHashtag.e, "text");
        a2.e();
    }

    @Override // xsna.anm0
    public final void w(jlm0 jlm0Var) {
        this.b.remove(jlm0Var);
    }

    @Override // xsna.anm0
    public final void x(boolean z, String str, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint) {
        anm0.E(this, z ? StoryViewAction.DISCOVER_ENABLED : StoryViewAction.DISCOVER_DISABLED, str, mobileOfficialAppsConStoriesStat$ViewEntryPoint, null, null, 56);
    }

    @Override // xsna.anm0
    public final void y(MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, StoryEntry storyEntry, u8m0 u8m0Var, String str, final long j, final Integer num, final int i) {
        p(MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.VIEW_STORY, str, mobileOfficialAppsConStoriesStat$ViewEntryPoint, storyEntry, u8m0Var, new izs() { // from class: xsna.bnm0
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                b.d dVar = (b.d) obj;
                dVar.b(Long.valueOf(j), "loading_duration");
                dVar.b(num, "narrative_id");
                int i2 = i;
                if (i2 != -1) {
                    dVar.b(Integer.valueOf(i2), "story_index");
                }
                return s3q0.a;
            }
        });
    }

    @Override // xsna.anm0
    public final void z(MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, StoryEntry storyEntry, u8m0 u8m0Var, String str, final long j, final Integer num, final int i) {
        p(MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.OPEN_VIEWER, str, mobileOfficialAppsConStoriesStat$ViewEntryPoint, storyEntry, u8m0Var, new izs() { // from class: xsna.cnm0
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                b.d dVar = (b.d) obj;
                dVar.b(Long.valueOf(j), "loading_duration");
                dVar.b(num, "narrative_id");
                int i2 = i;
                if (i2 != -1) {
                    dVar.b(Integer.valueOf(i2), "story_index");
                }
                return s3q0.a;
            }
        });
    }
}
