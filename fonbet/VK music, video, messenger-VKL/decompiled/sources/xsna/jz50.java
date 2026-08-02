package xsna;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.common.links.LaunchContext;
import com.vk.dto.common.id.UserId;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.newsfeed.exceptions.PostNotFoundException;
import com.vk.dto.profile.CatchUpBanner;
import com.vk.dto.stories.entities.PromoInfo;
import com.vk.dto.stories.model.HighlightStoriesContainer;
import com.vk.dto.stories.model.NarrativePublishEventType;
import com.vk.dto.stories.model.PromoStoriesContainer;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryMemoryType;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.dto.stories.model.StoryViewAction;
import com.vk.dto.stories.model.clickable.ClickableSticker;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryPublishItem;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryViewItem;
import com.vk.story.viewer.impl.presentation.stories.message.FastReaction;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import xsna.ikv0;
import xsna.o0r0;

/* compiled from: NavigationStoryViewDelegate.java */
/* loaded from: classes6.dex */
public final class jz50 {

    @NonNull
    public final ezt0 a;

    @NonNull
    public q7r b;

    @NonNull
    public x4m0 c;

    @NonNull
    public kl20 d;

    @NonNull
    public f0q0 e;

    @NonNull
    public eza0 f;

    /* compiled from: NavigationStoryViewDelegate.java */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[StoryMemoryType.values().length];
            a = iArr;
            try {
                iArr[StoryMemoryType.FIRST_STORY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[StoryMemoryType.FIRST_AVATAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[StoryMemoryType.FIRST_POST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[StoryMemoryType.FIRST_AUDIO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[StoryMemoryType.MY_TOP_TRACK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public jz50(@NonNull ezt0 ezt0Var) {
        this.a = ezt0Var;
    }

    public final void a() {
        mkm0 mkm0Var = this.b.i0;
        if (mkm0Var.f || mkm0Var.c == null) {
            return;
        }
        if (mkm0Var.getCurrentStory() != null) {
            this.b.i0.f1(StoryViewAction.CLOSE_TAP, null);
        }
        if (this.b.i0.getStoriesContainer() instanceof HighlightStoriesContainer) {
            Narrative narrative = ((HighlightStoriesContainer) this.b.i0.getStoriesContainer()).o;
            b.d dVar = new b.d("narrative_close");
            dVar.b(Integer.valueOf(narrative.b), "narrative_id");
            dVar.b(narrative.c, "owner_id");
            dVar.e();
        }
        this.b.i0.d1();
        this.b.i0.c.finish();
    }

    public final void b(boolean z, @Nullable ClickableSticker clickableSticker, @Nullable String str) {
        StoryEntry currentStory;
        StoryMemoryType storyMemoryType;
        int i;
        StoryEntry currentStory2 = this.b.i0.getCurrentStory();
        if (currentStory2 == null) {
            return;
        }
        this.f.b();
        if (currentStory2.Tb()) {
            this.a.a();
        }
        if (currentStory2.m0 != null) {
            sxc0.a().n(this.b.i0.getContext(), currentStory2);
            return;
        }
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.STORY_VIEWER;
        String a2 = com.vk.stat.scheme.t0.a(mobileOfficialAppsCoreNavStat$EventScreen);
        String str2 = str == null ? currentStory2.T : str;
        if (str2 != null && str2.contains("/memories") && (currentStory = this.b.i0.getCurrentStory()) != null && (storyMemoryType = currentStory.C0) != null && ((i = b.a[storyMemoryType.ordinal()]) == 1 || i == 2 || i == 3 || i == 4 || i == 5)) {
            a2 = MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint.STORY_VIRAL.name().toLowerCase();
        }
        if (currentStory2.C0 == StoryMemoryType.MY_TOP_TRACK) {
            a2 = MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint.VIRAL_BUTTON.name().toLowerCase();
        }
        String str3 = a2;
        if (str2.contains("open_author_profile")) {
            this.b.i0.getDependencies().f.q(MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.GO_TO_AUTHOR_BUTTON, mobileOfficialAppsCoreNavStat$EventScreen, this.b.i0.getViewEntryPoint(), currentStory2, this.b.i0.P0(), null);
            currentStory2 = currentStory2;
        }
        LaunchContext launchContext = new LaunchContext(false, false, false, str3, null, null, null, null, "story", null, null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67108352);
        xwk.d().e().l(this.b.i0.getContext(), str2, launchContext, null, new a(currentStory2, z, clickableSticker, launchContext));
    }

    public final void c() {
        boolean z;
        PromoInfo promoInfo;
        StoryEntry currentStory = this.b.i0.getCurrentStory();
        StoriesContainer storiesContainer = this.b.i0.getStoriesContainer();
        boolean z2 = storiesContainer instanceof PromoStoriesContainer;
        if (z2 && ((PromoStoriesContainer) storiesContainer).o) {
            return;
        }
        if (currentStory != null && (promoInfo = currentStory.t) != null && !TextUtils.isEmpty(promoInfo.b)) {
            b6m.a().n(this.b.i0.getContext(), currentStory.t.b);
        } else if (!z2) {
            UserId Ab = storiesContainer.Ab();
            CatchUpBanner catchUpBanner = currentStory != null ? currentStory.U : null;
            String str = currentStory != null ? currentStory.u : null;
            o0r0 e = xwk.e();
            Context context = this.b.i0.getContext();
            StoryOwner storyOwner = storiesContainer.b;
            String Db = storyOwner != null ? storyOwner.Db() : null;
            StoryOwner storyOwner2 = storiesContainer.b;
            String Bb = storyOwner2 != null ? storyOwner2.Bb() : null;
            StoryOwner storyOwner3 = storiesContainer.b;
            boolean z3 = false;
            if (storyOwner3 == null || !storyOwner3.Lb()) {
                z = false;
            } else {
                z = false;
                z3 = true;
            }
            StoryOwner storyOwner4 = storiesContainer.b;
            e.m(context, Ab, new o0r0.a(false, "", str, catchUpBanner, null, Db, Bb, z3, (storyOwner4 == null || !storyOwner4.Hb()) ? z : true, false, false, null, null, null, 65024));
        }
        if (currentStory != null) {
            this.b.i0.f1(StoryViewAction.GO_TO_AUTHOR, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
    public final void d(StoryEntry storyEntry, boolean z, boolean z2, @Nullable zzs<? super StoryEntry, ? super Boolean, ? super Collection<Narrative>, ? super Collection<Narrative>, s3q0> zzsVar) {
        io.reactivex.rxjava3.core.q b2;
        io.reactivex.rxjava3.core.q b3;
        Activity h = e3m.h(this.b.i0.getContext());
        if (h == null) {
            return;
        }
        j6v j6vVar = this.b.i0.getDependencies().c;
        NarrativePublishEventType narrativePublishEventType = z2 ? NarrativePublishEventType.CLICK_TO_ADD_TO_NARRATIVE_FROM_DOTS : NarrativePublishEventType.CLICK_TO_ADD_TO_NARRATIVE;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.STORY_VIEWER;
        j6vVar.a(narrativePublishEventType, mobileOfficialAppsCoreNavStat$EventScreen, storyEntry.c);
        s8i0 s8i0Var = new s8i0(h, this.b.i0.getWindow(), storyEntry, new fz50(this, storyEntry, zzsVar, z2, j6vVar), new mh4(21, this, storyEntry), mobileOfficialAppsCoreNavStat$EventScreen, this.b.i0.getStoriesContainer().b instanceof StoryOwner.Community, this.b.G);
        UserId userId = s8i0Var.d;
        ?? r3 = s8i0Var.l;
        Activity activity = s8i0Var.b;
        if (!z) {
            s8i0Var.x = new t8i0(s8i0Var);
            b2 = ((vu50) r3.getValue()).b(100, userId, null, true);
            hg1.n(b2.m0().m(io.reactivex.rxjava3.android.schedulers.a.b()), activity, false, null, 62).subscribe(new k2y(new w910(s8i0Var, 24), 13), new qw40(new pf40(s8i0Var, 16), 13));
            return;
        }
        s8i0Var.x = new t8i0(s8i0Var);
        aeg0 aeg0Var = activity instanceof aeg0 ? (aeg0) activity : null;
        if (aeg0Var != null) {
            aeg0Var.Li(s8i0Var);
        }
        s8i0Var.w = true;
        b3 = ((vu50) r3.getValue()).b(100, userId, null, true);
        hg1.n(b3.m0().m(io.reactivex.rxjava3.android.schedulers.a.b()), activity, false, null, 62).subscribe(new cl30(new arb0(s8i0Var, 11), 10), new skz(new r8a0(s8i0Var, 17), 23));
    }

    public final void e() {
        Activity h;
        io.reactivex.rxjava3.disposables.c subscribe;
        this.b.i0.f1(StoryViewAction.COMMENT_TAP, null);
        StoryEntry currentStory = this.b.i0.getCurrentStory();
        if (currentStory == null || (h = e3m.h(this.b.i0.getContext())) == null) {
            return;
        }
        if (!currentStory.r) {
            String string = h.getString(R.string.stories_sending_messages_restricted);
            Context context = this.b.i0.getContext();
            Window window = this.b.i0.getWindow();
            if (window == null) {
                return;
            }
            ikv0.a aVar = new ikv0.a(bwt0.u(context));
            aVar.u = new ikv0.d(string, (String) null, (ikv0.d.a) null);
            aVar.p(window);
            return;
        }
        mkm0 mkm0Var = this.b.i0;
        elm0 elm0Var = mkm0Var.c;
        String r = elm0Var == null ? null : elm0Var.r(mkm0Var.getCurrentStory().c);
        if (this.b.i0.getStoriesContainer() instanceof HighlightStoriesContainer) {
            Narrative narrative = ((HighlightStoriesContainer) this.b.i0.getStoriesContainer()).o;
        }
        t6g0 t6g0Var = t6g0.b;
        kcl0 d = t6g0.d();
        y6m0 y6m0Var = new y6m0(this.b.i0.getStoriesContainer().Ab(), this.b.i0.getViewEntryPoint(), currentStory, this.b.i0.P0(), r);
        ycm0 ycm0Var = new ycm0(qxi.a(), d, this.b.i0.getStoriesContainer().b);
        this.b.i0.c.d(true);
        q7r q7rVar = this.b;
        l7s u = bwt0.u(this.b.i0.getContext());
        q7r q7rVar2 = this.b;
        q7rVar.W = new tcm0(u, ycm0Var, q7rVar2.j0, d, q7rVar2.e0);
        ycm0Var.h = this.b.W;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(h, R.style.Vk_Theme_VkApp_space_gray_generated);
        kkm kkmVar = new kkm();
        vu4 vu4Var = new vu4(contextThemeWrapper, new n7w(this, 12), null, ycm0Var, g2v.c(), currentStory.d.b, kkmVar, true, -1, kkmVar.f(R.attr.vk_ui_background_content), contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.vkim_audio_hold_container_height), vu4.G);
        ycm0Var.e = vu4Var;
        vu4Var.V0();
        ycm0Var.i = y6m0Var;
        ycm0Var.j = r == null || r.length() == 0;
        if (r == null || r.length() == 0) {
            zb90 zb90Var = ycm0Var.f;
            if (zb90Var == null) {
                zb90Var = null;
            }
            zb90Var.e(true);
            zb90 zb90Var2 = ycm0Var.f;
            if (zb90Var2 == null) {
                zb90Var2 = null;
            }
            zb90Var2.b(false);
        } else {
            mcm0 mcm0Var = ycm0Var.h;
            if (mcm0Var == null) {
                mcm0Var = null;
            }
            ((tcm0) mcm0Var).d.setText(r);
            mcm0 mcm0Var2 = ycm0Var.h;
            if (mcm0Var2 == null) {
                mcm0Var2 = null;
            }
            ((tcm0) mcm0Var2).d.setSelection(r.length());
            mcm0 mcm0Var3 = ycm0Var.h;
            if (mcm0Var3 == null) {
                mcm0Var3 = null;
            }
            ((tcm0) mcm0Var3).f.setEnabled(false);
        }
        lcm0 lcm0Var = new lcm0(this.b.i0.getDependencies().f);
        lcm0Var.b = this.d.a();
        ycm0Var.g = lcm0Var;
        new dk5(d);
        ArrayList u0 = j5g.u0(ycm0.o, ycm0.n);
        r6e0 B = d.B();
        ArrayList arrayList = new ArrayList(c5g.u(u0, 10));
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((FastReaction) it.next()).j()));
        }
        io.reactivex.rxjava3.core.q c = B.c(arrayList);
        io.reactivex.rxjava3.internal.operators.observable.l2 r0 = c != null ? c.U(new hl30(new ym80(u0, 1), 13)).r0(asu0.a.c()) : null;
        if (r0 != null && (subscribe = ktr.c(r0).subscribe(new o060(new m2l0(ycm0Var, 4), 15), new w250(new z410(26), 21))) != null) {
            ycm0Var.m.b(subscribe);
        }
        mcm0 mcm0Var4 = ycm0Var.h;
        if (mcm0Var4 == null) {
            mcm0Var4 = null;
        }
        EmptyList emptyList = EmptyList.b;
        tcm0 tcm0Var = (tcm0) mcm0Var4;
        tcm0Var.j.a = true;
        tcm0Var.l.submitList(emptyList);
        this.e.e(this.b.W, null);
    }

    /* compiled from: NavigationStoryViewDelegate.java */
    public class a implements yp80 {
        public final /* synthetic */ StoryEntry b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ ClickableSticker d;
        public final /* synthetic */ LaunchContext e;

        public a(StoryEntry storyEntry, boolean z, ClickableSticker clickableSticker, LaunchContext launchContext) {
            this.b = storyEntry;
            this.c = z;
            this.d = clickableSticker;
            this.e = launchContext;
        }

        @Override // xsna.yp80
        public final void U() {
            rk8 browser = xwk.d().getBrowser();
            jz50 jz50Var = jz50.this;
            browser.f(jz50Var.b.i0.getContext(), null, this.e, this.b.T);
            Activity h = e3m.h(jz50Var.b.i0.getContext());
            if (h != null) {
                h.overridePendingTransition(R.anim.stories_slide_in_from_bottom, R.anim.stories_no_anim);
            }
        }

        @Override // xsna.yp80
        public final void onError(@NonNull Throwable th) {
            boolean z = th instanceof PostNotFoundException;
            jz50 jz50Var = jz50.this;
            if (!z) {
                Context context = jz50Var.b.i0.getContext();
                cmf0.d(context, jz50Var.b.i0.getWindow(), j03.g(context, th, R.string.error), false, iah0.a(88), true);
            }
            jz50Var.f.c();
        }

        @Override // xsna.yp80
        public final void onSuccess() {
            jz50 jz50Var = jz50.this;
            Activity h = e3m.h(jz50Var.b.i0.getContext());
            if (h != null) {
                h.overridePendingTransition(R.anim.stories_slide_in_from_bottom, R.anim.stories_no_anim);
            }
            anm0 anm0Var = jz50Var.b.i0.getDependencies().f;
            StoryEntry storyEntry = this.b;
            anm0Var.I(storyEntry);
            if (!this.c) {
                jz50Var.b.i0.getDependencies().f.i(storyEntry, jz50Var.b.i0.getViewEntryPoint(), jz50Var.b.i0.P0());
                return;
            }
            ClickableSticker clickableSticker = this.d;
            if (clickableSticker != null) {
                jz50Var.b.i0.f1(StoryViewAction.CLICK_TO_TOOLTIP, new f0z(clickableSticker, 14));
            }
            StoryMemoryType storyMemoryType = storyEntry.C0;
            if (storyMemoryType == StoryMemoryType.BIRTHDAY) {
                jz50Var.b.i0.getDependencies().f.j(storyEntry, jz50Var.b.i0.getViewEntryPoint(), jz50Var.b.i0.P0());
            } else if (storyMemoryType == StoryMemoryType.MY_TOP_TRACK) {
                jz50Var.b.i0.getDependencies().f.r(storyEntry, jz50Var.b.i0.getViewEntryPoint(), jz50Var.b.i0.P0());
            } else {
                jz50Var.b.i0.getDependencies().f.s(storyEntry, jz50Var.b.i0.getViewEntryPoint(), jz50Var.b.i0.P0());
            }
        }

        @Override // xsna.yp80
        public final void I() {
        }

        @Override // xsna.yp80
        public final void B0(boolean z) {
        }
    }
}
