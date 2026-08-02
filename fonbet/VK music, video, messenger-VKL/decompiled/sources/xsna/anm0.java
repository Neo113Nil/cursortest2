package xsna;

import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryQuestionEntry;
import com.vk.dto.stories.model.StoryViewAction;
import com.vk.dto.stories.model.clickable.ClickableHashtag;
import com.vk.dto.stories.model.clickable.ClickableMention;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryViewItem;
import com.vk.story.viewer.api.models.Action;
import com.vk.story.viewer.api.models.AttachType;
import com.vk.story.viewer.api.models.Gesture;
import com.vk.story.viewer.api.models.PreloadSource;
import com.vkontakte.android.data.b;

/* compiled from: StoryViewerAnalytics.kt */
/* loaded from: classes6.dex */
public interface anm0 {
    public static final a a = a.a;

    /* compiled from: StoryViewerAnalytics.kt */
    public interface b {
        void a(b.d dVar);
    }

    static /* synthetic */ void E(anm0 anm0Var, StoryViewAction storyViewAction, String str, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, StoryEntry storyEntry, u8m0 u8m0Var, int i) {
        if ((i & 8) != 0) {
            storyEntry = null;
        }
        if ((i & 16) != 0) {
            u8m0Var = null;
        }
        anm0Var.c(storyViewAction, str, mobileOfficialAppsConStoriesStat$ViewEntryPoint, storyEntry, u8m0Var, null);
    }

    static /* synthetic */ void d(anm0 anm0Var, MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType eventType, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, StoryEntry storyEntry, u8m0 u8m0Var, int i) {
        if ((i & 4) != 0) {
            mobileOfficialAppsConStoriesStat$ViewEntryPoint = null;
        }
        if ((i & 8) != 0) {
            storyEntry = null;
        }
        if ((i & 16) != 0) {
            u8m0Var = null;
        }
        anm0Var.q(eventType, mobileOfficialAppsCoreNavStat$EventScreen, mobileOfficialAppsConStoriesStat$ViewEntryPoint, storyEntry, u8m0Var, null);
    }

    static /* synthetic */ void f(anm0 anm0Var, MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType eventType, String str, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, StoryEntry storyEntry, u8m0 u8m0Var, int i) {
        if ((i & 16) != 0) {
            u8m0Var = null;
        }
        anm0Var.p(eventType, str, mobileOfficialAppsConStoriesStat$ViewEntryPoint, storyEntry, u8m0Var, null);
    }

    /* compiled from: StoryViewerAnalytics.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final anm0 STUB = new C2556a();

        public final anm0 getSTUB() {
            return STUB;
        }

        /* compiled from: StoryViewerAnalytics.kt */
        /* renamed from: xsna.anm0$a$a, reason: collision with other inner class name */
        public static final class C2556a implements anm0 {
            @Override // xsna.anm0
            public final void D() {
            }

            @Override // xsna.anm0
            public final void N() {
            }

            @Override // xsna.anm0
            public final void h() {
            }

            @Override // xsna.anm0
            public final void o() {
            }

            @Override // xsna.anm0
            public final void C(jlm0 jlm0Var) {
            }

            @Override // xsna.anm0
            public final void F(ClickableMention clickableMention) {
            }

            @Override // xsna.anm0
            public final void I(StoryEntry storyEntry) {
            }

            @Override // xsna.anm0
            public final void L(xkm0 xkm0Var) {
            }

            @Override // xsna.anm0
            public final void R(boolean z) {
            }

            @Override // xsna.anm0
            public final void a(ClickableMention clickableMention) {
            }

            @Override // xsna.anm0
            public final void g(xkm0 xkm0Var) {
            }

            @Override // xsna.anm0
            public final void l(ClickableHashtag clickableHashtag) {
            }

            @Override // xsna.anm0
            public final void v(ClickableHashtag clickableHashtag) {
            }

            @Override // xsna.anm0
            public final void w(jlm0 jlm0Var) {
            }

            @Override // xsna.anm0
            public final void O(StoriesContainer storiesContainer, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint) {
            }

            @Override // xsna.anm0
            public final void J(StoryViewAction storyViewAction, StoryQuestionEntry storyQuestionEntry, xkm0 xkm0Var) {
            }

            @Override // xsna.anm0
            public final void K(StoryViewAction storyViewAction, xkm0 xkm0Var, izs<? super b.d, s3q0> izsVar) {
            }

            @Override // xsna.anm0
            public final void M(StoryEntry storyEntry, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, u8m0 u8m0Var) {
            }

            @Override // xsna.anm0
            public final void P(MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, String str, String str2) {
            }

            @Override // xsna.anm0
            public final void e(PreloadSource preloadSource, StoryEntry storyEntry, long j) {
            }

            @Override // xsna.anm0
            public final void i(StoryEntry storyEntry, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, u8m0 u8m0Var) {
            }

            @Override // xsna.anm0
            public final void j(StoryEntry storyEntry, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, u8m0 u8m0Var) {
            }

            @Override // xsna.anm0
            public final void m(StoryEntry storyEntry, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, u8m0 u8m0Var) {
            }

            @Override // xsna.anm0
            public final void n(boolean z, boolean z2, xkm0 xkm0Var) {
            }

            @Override // xsna.anm0
            public final void r(StoryEntry storyEntry, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, u8m0 u8m0Var) {
            }

            @Override // xsna.anm0
            public final void s(StoryEntry storyEntry, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, u8m0 u8m0Var) {
            }

            @Override // xsna.anm0
            public final void x(boolean z, String str, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint) {
            }

            @Override // xsna.anm0
            public final void A(boolean z, boolean z2, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint) {
            }

            @Override // xsna.anm0
            public final void B(Action action, AttachType attachType, Gesture gesture, long j) {
            }

            @Override // xsna.anm0
            public final void G(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, StoryEntry storyEntry, u8m0 u8m0Var) {
            }

            @Override // xsna.anm0
            public final void H(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, StoryEntry storyEntry, u8m0 u8m0Var) {
            }

            @Override // xsna.anm0
            public final void Q(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, StoryEntry storyEntry, u8m0 u8m0Var) {
            }

            @Override // xsna.anm0
            public final void b(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, StoryEntry storyEntry, u8m0 u8m0Var) {
            }

            @Override // xsna.anm0
            public final void k(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, StoryEntry storyEntry, u8m0 u8m0Var) {
            }

            @Override // xsna.anm0
            public final void y(MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, StoryEntry storyEntry, u8m0 u8m0Var, String str, long j, Integer num, int i) {
            }

            @Override // xsna.anm0
            public final void z(MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, StoryEntry storyEntry, u8m0 u8m0Var, String str, long j, Integer num, int i) {
            }

            @Override // xsna.anm0
            @ozl
            public final void c(StoryViewAction storyViewAction, String str, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, StoryEntry storyEntry, u8m0 u8m0Var, izs<? super b.d, s3q0> izsVar) {
            }

            @Override // xsna.anm0
            public final void p(MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType eventType, String str, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, StoryEntry storyEntry, u8m0 u8m0Var, izs<? super b.d, s3q0> izsVar) {
            }

            @Override // xsna.anm0
            public final void q(MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType eventType, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, StoryEntry storyEntry, u8m0 u8m0Var, izs<? super b.d, s3q0> izsVar) {
            }

            @Override // xsna.anm0
            public final void t(StoryViewAction storyViewAction, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, StoryEntry storyEntry, u8m0 u8m0Var, String str, izs<? super b.d, s3q0> izsVar) {
            }
        }
    }

    default void D() {
    }

    default void N() {
    }

    default void h() {
    }

    default void o() {
    }

    default void C(jlm0 jlm0Var) {
    }

    default void F(ClickableMention clickableMention) {
    }

    default void I(StoryEntry storyEntry) {
    }

    default void L(xkm0 xkm0Var) {
    }

    default void R(boolean z) {
    }

    default void a(ClickableMention clickableMention) {
    }

    default void g(xkm0 xkm0Var) {
    }

    default void l(ClickableHashtag clickableHashtag) {
    }

    default void v(ClickableHashtag clickableHashtag) {
    }

    default void w(jlm0 jlm0Var) {
    }

    default void O(StoriesContainer storiesContainer, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint) {
    }

    default void J(StoryViewAction storyViewAction, StoryQuestionEntry storyQuestionEntry, xkm0 xkm0Var) {
    }

    default void K(StoryViewAction storyViewAction, xkm0 xkm0Var, izs<? super b.d, s3q0> izsVar) {
    }

    default void M(StoryEntry storyEntry, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, u8m0 u8m0Var) {
    }

    default void P(MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, String str, String str2) {
    }

    default void e(PreloadSource preloadSource, StoryEntry storyEntry, long j) {
    }

    default void i(StoryEntry storyEntry, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, u8m0 u8m0Var) {
    }

    default void j(StoryEntry storyEntry, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, u8m0 u8m0Var) {
    }

    default void m(StoryEntry storyEntry, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, u8m0 u8m0Var) {
    }

    default void n(boolean z, boolean z2, xkm0 xkm0Var) {
    }

    default void r(StoryEntry storyEntry, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, u8m0 u8m0Var) {
    }

    default void s(StoryEntry storyEntry, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, u8m0 u8m0Var) {
    }

    default void x(boolean z, String str, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint) {
    }

    default void A(boolean z, boolean z2, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint) {
    }

    default void B(Action action, AttachType attachType, Gesture gesture, long j) {
    }

    default void G(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, StoryEntry storyEntry, u8m0 u8m0Var) {
    }

    default void H(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, StoryEntry storyEntry, u8m0 u8m0Var) {
    }

    default void Q(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, StoryEntry storyEntry, u8m0 u8m0Var) {
    }

    default void b(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, StoryEntry storyEntry, u8m0 u8m0Var) {
    }

    default void k(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, StoryEntry storyEntry, u8m0 u8m0Var) {
    }

    default void y(MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, StoryEntry storyEntry, u8m0 u8m0Var, String str, long j, Integer num, int i) {
    }

    default void z(MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, StoryEntry storyEntry, u8m0 u8m0Var, String str, long j, Integer num, int i) {
    }

    @ozl
    default void c(StoryViewAction storyViewAction, String str, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, StoryEntry storyEntry, u8m0 u8m0Var, izs<? super b.d, s3q0> izsVar) {
    }

    default void p(MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType eventType, String str, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, StoryEntry storyEntry, u8m0 u8m0Var, izs<? super b.d, s3q0> izsVar) {
    }

    default void q(MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType eventType, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, StoryEntry storyEntry, u8m0 u8m0Var, izs<? super b.d, s3q0> izsVar) {
    }

    default void t(StoryViewAction storyViewAction, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, StoryEntry storyEntry, u8m0 u8m0Var, String str, izs<? super b.d, s3q0> izsVar) {
    }
}
