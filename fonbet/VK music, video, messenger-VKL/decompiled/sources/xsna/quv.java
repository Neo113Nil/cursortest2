package xsna;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.camera.editor.common.cadre.CadreTarget;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.IdeasStoriesContainer;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.ideas.StoryIdea;
import com.vk.dto.stories.model.ideas.StoryIdeaPayload;
import com.vk.dto.stories.model.web.StoryBoxPrepared;
import com.vk.imageloader.ImageScreenSize;
import com.vk.imageloader.view.VKImageView;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryViewItem;
import com.vk.stories.design.view.StoryProgressView;
import com.vk.story.viewer.api.models.PreloadSource;
import com.vk.story.viewer.impl.presentation.ideas.ui.IdeasOnboardingShimmerView;
import com.vk.story.viewer.impl.presentation.ideas.ui.IdeasStoryAvatarView;
import com.vk.story.viewer.impl.presentation.ideas.ui.IdeasTeaserEvent;
import com.vk.story.viewer.impl.presentation.stories.view.SourceTransitionStory;
import com.vkontakte.android.R;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.MapBuilder;
import org.json.JSONArray;
import xsna.e3m;
import xsna.f5h0;
import xsna.hso0;
import xsna.itv;
import xsna.iuv;
import xsna.rsv;
import xsna.ruv;

/* compiled from: IdeasStoryView.kt */
/* loaded from: classes6.dex */
public final class quv extends FrameLayout implements qo6 {
    public AnimatorSet A;
    public AnimatorSet B;
    public final Handler C;
    public int D;
    public final qo4 E;
    public final bpn0 F;
    public final bpn0 b;
    public final bpn0 c;
    public MobileOfficialAppsConStoriesStat$ViewEntryPoint d;
    public final bpn0 e;
    public final StoryProgressView f;
    public final ProgressBar g;
    public final View h;
    public final View i;
    public final View j;
    public final VKImageView k;
    public final IdeasOnboardingShimmerView l;
    public final IdeasStoryAvatarView m;
    public final ImageButton n;
    public final ImageView o;
    public final View p;
    public final View q;
    public final View r;
    public final View s;
    public ruv.a t;
    public StoriesContainer u;
    public List<StoryIdea> v;
    public List<StoryIdea> w;
    public elm0 x;
    public VkContextMenu y;
    public boolean z;

    /* compiled from: IdeasStoryView.kt */
    public static final class a {
        public final int a;
        public final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("IdeasStoryBoxSize(width=");
            sb.append(this.a);
            sb.append(", height=");
            return vu5.b(sb, this.b, ')');
        }
    }

    public quv(Context context) {
        super(context, null);
        this.b = new bpn0(new tvj(this, 15));
        this.c = new bpn0(new odm(this, 16));
        this.d = MobileOfficialAppsConStoriesStat$ViewEntryPoint.DISCOVER;
        this.e = new bpn0(new akh(this, 24));
        this.v = EmptyList.b;
        this.C = new Handler(Looper.getMainLooper());
        LayoutInflater.from(context).inflate(R.layout.layout_ideas_story_view, (ViewGroup) this, true);
        this.f = (StoryProgressView) findViewById(R.id.ideas_progress);
        this.g = (ProgressBar) findViewById(R.id.ideas_loader);
        this.h = findViewById(R.id.ideas_controls_top);
        this.i = findViewById(R.id.ideas_controls_bottom);
        this.j = findViewById(R.id.ideas_back_gradient);
        this.k = (VKImageView) findViewById(R.id.ideas_background_image);
        this.l = (IdeasOnboardingShimmerView) findViewById(R.id.ideas_onboarding_bar_skeleton);
        IdeasStoryAvatarView ideasStoryAvatarView = (IdeasStoryAvatarView) findViewById(R.id.ideas_avatar);
        this.m = ideasStoryAvatarView;
        ImageButton imageButton = (ImageButton) findViewById(R.id.ideas_open_editor);
        this.n = imageButton;
        ImageView imageView = (ImageView) findViewById(R.id.ideas_more);
        this.o = imageView;
        View findViewById = findViewById(R.id.ideas_viewport);
        this.p = findViewById;
        this.q = findViewById(R.id.ideas_story_box);
        ouv ouvVar = new ouv(this, 0);
        findViewById.addOnLayoutChangeListener(ouvVar);
        findViewById(R.id.ideas_title).addOnLayoutChangeListener(ouvVar);
        ideasStoryAvatarView.setOnRenderedListener(new hxl(this, 12));
        ideasStoryAvatarView.setOnRenderErrorListener(new w69(this, 7));
        this.r = findViewById(R.id.fl_error);
        View findViewById2 = findViewById(R.id.tv_retry);
        this.s = findViewById2;
        findViewById2.setOnClickListener(new dd6(this, 4));
        imageButton.setOnClickListener(new p01(this, 8));
        imageView.setOnClickListener(new q01(this, 6));
        ((VkButton) findViewById(R.id.ideas_publish_button)).setOnClickListener(new wz5(this, 6));
        ((ImageView) findViewById(R.id.ideas_close)).setOnClickListener(new gmp(this, 3));
        setOutlineProvider(new puv());
        setClipToOutline(true);
        this.E = new qo4(this, 5);
        this.F = new bpn0(new k6k(this, 21));
    }

    public static void a(quv quvVar) {
        quvVar.getFeature().C(zsv.b);
    }

    public static s3q0 d(quv quvVar, StoryBoxPrepared storyBoxPrepared) {
        quvVar.getFeature().C(new wsv(storyBoxPrepared));
        return s3q0.a;
    }

    public static s3q0 e(quv quvVar) {
        quvVar.z = true;
        quvVar.getFeature().C(rsv.b.C3629b.b);
        return s3q0.a;
    }

    public static s3q0 f(quv quvVar) {
        quvVar.z = true;
        quvVar.getFeature().C(rsv.b.a.b);
        return s3q0.a;
    }

    public static s3q0 g(quv quvVar, int i) {
        quvVar.getFeature().C(new ysv(i));
        return s3q0.a;
    }

    private final kz8 getCadreUtil() {
        return (kz8) this.c.getValue();
    }

    private final ktv getFeature() {
        return (ktv) this.b.getValue();
    }

    private final itv getIdeasAnalytics() {
        return (itv) this.e.getValue();
    }

    private final qsv getProgressDelegate() {
        return (qsv) this.F.getValue();
    }

    public static s3q0 h(quv quvVar) {
        quvVar.y = null;
        if (!quvVar.z) {
            quvVar.getFeature().C(ftv.b);
        }
        quvVar.z = false;
        return s3q0.a;
    }

    public static s3q0 i(quv quvVar, boolean z) {
        quvVar.setLoaderVisibleDelayed(z);
        return s3q0.a;
    }

    public static s3q0 j(quv quvVar, StoryBoxPrepared storyBoxPrepared) {
        quvVar.getFeature().C(new xsv(storyBoxPrepared));
        return s3q0.a;
    }

    public static void k(quv quvVar) {
        quvVar.getFeature().C(htv.b);
    }

    public static void l(quv quvVar) {
        quvVar.getFeature().C(etv.b);
        VkContextMenu vkContextMenu = quvVar.y;
        if (vkContextMenu != null) {
            vkContextMenu.e(null);
            vkContextMenu.b();
            quvVar.y = null;
        }
        quvVar.z = false;
        l7s u = bwt0.u(quvVar.getContext());
        e3m.a aVar = e3m.a;
        Drawable a2 = m33.a(R.drawable.vk_icon_gear_outline_20, u);
        Drawable a3 = m33.a(R.drawable.vk_icon_hide_outline_20, u);
        ImageView imageView = quvVar.o;
        int l = krv0.l(R.attr.vk_ui_icon_accent);
        imageView.getContext();
        e.b bVar = new e.b(imageView, null, null, l, 6);
        bVar.w = R.layout.ds_internal_context_menu_item;
        bVar.e = u;
        bVar.m = iah0.a(7);
        bVar.g(R.attr.vk_ui_icon_accent);
        VkContextMenu.c.c(bVar, R.string.ideas_story_menu_settings, a2, false, null, new rkt(quvVar, 3), 28);
        VkContextMenu.c.c(bVar, R.string.ideas_story_menu_hide, a3, false, null, new nuv(quvVar, 0), 28);
        VkContextMenu a4 = bVar.a();
        ((com.vk.core.view.components.context.menu.e) a4).q = new m2g(quvVar, 25);
        a4.j(false);
        quvVar.y = a4;
    }

    public static s3q0 m(quv quvVar, v3e0 v3e0Var) {
        qsv progressDelegate = quvVar.getProgressDelegate();
        StoryProgressView storyProgressView = progressDelegate.a;
        storyProgressView.setSectionCount(v3e0Var.b);
        int i = v3e0Var.a;
        storyProgressView.setCurrentSection(i);
        boolean z = v3e0Var.c;
        if (i != progressDelegate.e) {
            progressDelegate.a();
            storyProgressView.setProgress(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            progressDelegate.e = i;
        }
        ValueAnimator valueAnimator = progressDelegate.d;
        if (z && valueAnimator == null) {
            progressDelegate.b();
        } else if (z && valueAnimator != null && valueAnimator.isPaused()) {
            valueAnimator.resume();
        } else if (z && valueAnimator != null && !valueAnimator.isRunning() && !valueAnimator.isPaused()) {
            progressDelegate.b();
        } else if (!z && valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.pause();
        }
        return s3q0.a;
    }

    public static s3q0 n(quv quvVar, iuv iuvVar) {
        MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType eventType;
        String str;
        JSONArray jSONArray;
        if (iuvVar instanceof iuv.a) {
            elm0 elm0Var = quvVar.x;
            if (elm0Var != null) {
                elm0Var.e(((iuv.a) iuvVar).a);
            }
        } else if (iuvVar.equals(iuv.e.a)) {
            elm0 elm0Var2 = quvVar.x;
            if (elm0Var2 != null) {
                elm0Var2.q(quvVar.getStoriesContainer());
            }
        } else if (iuvVar.equals(iuv.d.a)) {
            elm0 elm0Var3 = quvVar.x;
            if (elm0Var3 != null) {
                elm0Var3.o();
            }
        } else if (iuvVar.equals(iuv.c.a)) {
            itv ideasAnalytics = quvVar.getIdeasAnalytics();
            ideasAnalytics.getClass();
            ideasAnalytics.a(MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.GO_TO_SETTINGS, jgp.b);
            sxc0.a().a(quvVar.getContext(), MobileOfficialAppsConStoriesStat$ViewEntryPoint.DISCOVER);
        } else if (iuvVar instanceof iuv.g) {
            itv ideasAnalytics2 = quvVar.getIdeasAnalytics();
            iuv.g gVar = (iuv.g) iuvVar;
            IdeasTeaserEvent ideasTeaserEvent = gVar.a;
            StoryIdea storyIdea = gVar.b;
            ideasAnalytics2.getClass();
            StoryIdeaPayload storyIdeaPayload = storyIdea.c;
            int i = itv.a.$EnumSwitchMapping$0[ideasTeaserEvent.ordinal()];
            if (i == 1) {
                eventType = MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.VIEW_STORY;
            } else if (i == 2) {
                eventType = MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.CLICK_TO_PUBLISH;
            } else if (i == 3) {
                eventType = MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.CLICK_TO_EDIT;
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                eventType = MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.CLICK_TO_HIDE_TEASER;
            }
            MapBuilder mapBuilder = new MapBuilder();
            mapBuilder.put("is_story_teaser", 1);
            boolean z = storyIdeaPayload instanceof StoryIdeaPayload.Birthday;
            if (z) {
                str = "birthday";
            } else if (storyIdeaPayload instanceof StoryIdeaPayload.Music) {
                str = "music";
            } else {
                if (!(storyIdeaPayload instanceof StoryIdeaPayload.Gallery)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "gallery";
            }
            mapBuilder.put("story_teaser_type", str);
            if (z) {
                jSONArray = new JSONArray().put(String.valueOf(((StoryIdeaPayload.Birthday) storyIdeaPayload).b.b));
            } else {
                if (!(storyIdeaPayload instanceof StoryIdeaPayload.Music) && !(storyIdeaPayload instanceof StoryIdeaPayload.Gallery)) {
                    throw new NoWhenBranchMatchedException();
                }
                jSONArray = null;
            }
            if (jSONArray != null) {
                mapBuilder.put("story_teaser_value", jSONArray);
            }
            s3q0 s3q0Var = s3q0.a;
            ideasAnalytics2.a(eventType, mapBuilder.h());
        } else if (iuvVar.equals(iuv.f.a)) {
            itv ideasAnalytics3 = quvVar.getIdeasAnalytics();
            ideasAnalytics3.getClass();
            ideasAnalytics3.a(MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.SHOW_STORIES_POSTING_RECOMMENDATION, on00.f(new Pair("is_story_teaser", 0)));
        } else {
            if (!iuvVar.equals(iuv.b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            Context context = quvVar.getContext();
            cmf0.d(context, quvVar.getWindow(), context.getString(R.string.ideas_story_hide_error), false, (56 & 16) != 0 ? iah0.a(88) : 0, (56 & 32) != 0);
            quvVar.getFeature().C(ftv.b);
        }
        return s3q0.a;
    }

    public static s3q0 o(quv quvVar) {
        quvVar.getFeature().C(new btv(SourceTransitionStory.EXPIRED_TIME));
        return s3q0.a;
    }

    public static void p(quv quvVar) {
        quvVar.getFeature().C(gtv.b);
    }

    public static AnimatorSet q(AnimatorSet animatorSet, List list, boolean z, boolean z2) {
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        float f = z ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return null;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (((View) it.next()).getAlpha() != f) {
                ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(ObjectAnimator.ofFloat((View) it2.next(), (Property<View, Float>) View.ALPHA, f));
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(arrayList);
                animatorSet2.setDuration(200L);
                animatorSet2.setStartDelay((!z2 || z) ? 0L : 500L);
                animatorSet2.start();
                return animatorSet2;
            }
        }
        return null;
    }

    private final void setLoaderVisibleDelayed(boolean z) {
        Handler handler = this.C;
        qo4 qo4Var = this.E;
        handler.removeCallbacks(qo4Var);
        if (z) {
            handler.postDelayed(qo4Var, 700L);
        } else {
            this.g.setVisibility(8);
        }
    }

    @Override // xsna.qo6
    public final void A() {
        getFeature().C(new btv(0));
    }

    @Override // xsna.qo6
    public final boolean B() {
        yzt0<Boolean> yzt0Var;
        Boolean a2;
        ruv.a aVar = this.t;
        if (aVar == null || (yzt0Var = aVar.d) == null || (a2 = yzt0Var.a()) == null) {
            return false;
        }
        return a2.booleanValue();
    }

    @Override // xsna.qo6
    public final void C() {
        getFeature().C(ctv.b);
    }

    @Override // xsna.qo6
    public final void E() {
        getFeature().C(ctv.b);
    }

    @Override // xsna.qo6
    public final void E0(boolean z) {
        getFeature().C(new rsv.c.b(z));
    }

    @Override // xsna.qo6
    public final void I() {
        getFeature().C(rsv.a.C3628a.b);
    }

    @Override // xsna.qo6
    public final boolean I0() {
        return true;
    }

    @Override // xsna.qo6
    public final Animator K0(boolean z, ViewGroup viewGroup, int i, int i2) {
        return null;
    }

    @Override // xsna.qo6
    public final void L(int i, int i2) {
        if (getPosition() == i) {
            qsv progressDelegate = getProgressDelegate();
            progressDelegate.a();
            progressDelegate.a.setProgress(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            progressDelegate.e = -1;
        }
    }

    @Override // xsna.qo6
    public final void L0() {
        getFeature().C(rsv.a.b.b);
    }

    @Override // xsna.qo6
    public final void N() {
        getFeature().C(new btv(0));
    }

    @Override // xsna.qo6
    public final boolean O(int i, int i2) {
        return false;
    }

    @Override // xsna.qo6
    public final Animator P() {
        return null;
    }

    @Override // xsna.qo6
    public final void Q() {
        getFeature().C(new rsv.c.a(true));
    }

    @Override // xsna.qo6
    public final void R() {
        qsv progressDelegate = getProgressDelegate();
        progressDelegate.a();
        progressDelegate.a.setProgress(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        progressDelegate.e = -1;
        getFeature().C(new dtv());
    }

    @Override // xsna.qo6
    public final void S() {
        getFeature().C(new rsv.c.a(false));
    }

    @Override // xsna.qo6
    public final void U() {
        getFeature().C(rsv.a.c.b);
    }

    @Override // xsna.qo6
    public final boolean X(int i, int i2) {
        return false;
    }

    @Override // xsna.qo6
    public final void b() {
        getFeature().C(ftv.b);
    }

    @Override // xsna.qo6
    public final void c() {
        getFeature().C(etv.b);
    }

    @Override // xsna.qo6
    public final void destroy() {
        getFeature().onDestroy();
    }

    public Context getCtx() {
        return getContext();
    }

    @Override // xsna.qo6
    public float getCurrentHeaderAvatarScale() {
        return 1.0f;
    }

    @Override // xsna.qo6
    public StoryEntry getCurrentStory() {
        return null;
    }

    @Override // xsna.qo6
    public long getCurrentTime() {
        yzt0<v3e0> yzt0Var;
        ruv.a aVar = this.t;
        if (aVar == null || (yzt0Var = aVar.b) == null || yzt0Var.a() == null) {
            return -1L;
        }
        return (long) (swe0.f(getProgressDelegate().a.getProgress(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f) * 8000);
    }

    @Override // xsna.qo6
    public Long getDuration() {
        yzt0<v3e0> yzt0Var;
        v3e0 a2;
        int i;
        ruv.a aVar = this.t;
        if (aVar == null || (yzt0Var = aVar.b) == null || (a2 = yzt0Var.a()) == null || (i = a2.b) <= 0) {
            return null;
        }
        return Long.valueOf(8000 * i);
    }

    public int getHeightPx() {
        return getMeasuredHeight();
    }

    public int getMeasuredWidthPx() {
        return getMeasuredWidth();
    }

    @Override // xsna.qo6
    public int getPosition() {
        return this.D;
    }

    @Override // xsna.qo6
    public iz8 getSavedCadreSize() {
        return null;
    }

    @Override // xsna.qo6
    public StoriesContainer getStoriesContainer() {
        StoriesContainer storiesContainer = this.u;
        if (storiesContainer != null) {
            return storiesContainer;
        }
        throw new IllegalStateException("IdeasStoryView.storiesContainer is not set. Call setStoriesContainer() before use.");
    }

    public Long getVideoViewDuration() {
        return null;
    }

    @Override // xsna.qo6
    public Window getWindow() {
        Activity h = e3m.h(getContext());
        if (h != null) {
            return h.getWindow();
        }
        return null;
    }

    @Override // xsna.qo6
    public final void j0(float f) {
        getFeature().C(new rsv.a.d(f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.p.post(new ou4(this, 6));
        this.l.post(new tn9(this, 7));
        f5z e = gqo.e(this);
        if (e == null) {
            return;
        }
        ((ruv) getFeature().c.g()).a.a(new defpackage.h0(15, this, e), e);
        getFeature().h.a(new lwh(this, 20), e);
        List<StoryIdea> list = this.w;
        List<StoryIdea> list2 = this.v;
        if (list != list2) {
            this.w = list2;
            getFeature().C(new tsv(this.v));
        }
        s();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        VkContextMenu vkContextMenu = this.y;
        if (vkContextMenu != null) {
            vkContextMenu.e(null);
            vkContextMenu.b();
            this.y = null;
        }
        super.onDetachedFromWindow();
        r();
        IdeasOnboardingShimmerView ideasOnboardingShimmerView = this.l;
        ValueAnimator valueAnimator = ideasOnboardingShimmerView.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = ideasOnboardingShimmerView.e;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllUpdateListeners();
        }
        ideasOnboardingShimmerView.e = null;
        ideasOnboardingShimmerView.invalidate();
        AnimatorSet animatorSet = this.A;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.A = null;
        AnimatorSet animatorSet2 = this.B;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.B = null;
        this.C.removeCallbacks(this.E);
        getProgressDelegate().a();
    }

    @Override // xsna.qo6
    public final void onPause() {
        getFeature().C(etv.b);
    }

    @Override // xsna.qo6
    public final void onResume() {
        s();
    }

    @Override // xsna.qo6
    public final void pause() {
        getFeature().C(etv.b);
    }

    @Override // xsna.qo6
    public final void play() {
        s();
    }

    public final void r() {
        ImageScreenSize imageScreenSize = ImageScreenSize.BIG;
        VKImageView vKImageView = this.k;
        vKImageView.O0(null, imageScreenSize);
        vKImageView.Q0(null, f5h0.f.a);
        vKImageView.setVisibility(8);
    }

    @Override // xsna.qo6
    public final boolean r0() {
        return true;
    }

    public final void s() {
        elm0 elm0Var = this.x;
        if (elm0Var == null || elm0Var.getCurrentIdlePagerPosition() != getPosition()) {
            getFeature().C(usv.b);
        } else {
            getFeature().C(vsv.b);
        }
    }

    public final void setCallback(elm0 elm0Var) {
        this.x = elm0Var;
    }

    public void setPosition(int i) {
        this.D = i;
    }

    @Override // xsna.qo6
    public void setPreloadSource(PreloadSource preloadSource) {
        getFeature().C(new atv(preloadSource));
    }

    public final void setStoriesContainer(StoriesContainer storiesContainer) {
        this.u = storiesContainer;
        IdeasStoriesContainer ideasStoriesContainer = storiesContainer instanceof IdeasStoriesContainer ? (IdeasStoriesContainer) storiesContainer : null;
        List<StoryIdea> list = ideasStoriesContainer != null ? ideasStoriesContainer.o : null;
        if (list == null) {
            list = EmptyList.b;
        }
        this.v = list;
        this.w = null;
        if (ideasStoriesContainer == null) {
            r();
            return;
        }
        String str = ideasStoriesContainer.p;
        if (str == null || drm0.N(str)) {
            r();
            return;
        }
        VKImageView vKImageView = this.k;
        vKImageView.setVisibility(0);
        vKImageView.getHierarchy().q(mcr0.p(str) || mcr0.o(str) ? 200 : 0);
        String str2 = ideasStoriesContainer.q;
        f5h0.f fVar = f5h0.f.a;
        vKImageView.Q0(null, fVar);
        if (str2 != null && !drm0.N(str2) && !mcr0.p(str) && !mcr0.o(str)) {
            try {
                hso0.b a2 = hso0.a(Base64.decode(str2, 3));
                Bitmap createBitmap = Bitmap.createBitmap(a2.a, a2.b, Bitmap.Config.ARGB_8888);
                createBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(a2.c));
                vKImageView.Q0(new BitmapDrawable(getResources(), createBitmap), fVar);
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable unused) {
            }
        }
        vKImageView.O0(str, ImageScreenSize.BIG);
    }

    public final void setViewEntryPoint(MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint) {
        this.d = mobileOfficialAppsConStoriesStat$ViewEntryPoint;
    }

    public final void t() {
        a aVar;
        iz8 b = kz8.b(getCadreUtil(), this, false, CadreTarget.VIEWER, 10);
        View view = this.p;
        int width = view.getWidth();
        int height = view.getHeight();
        int i = b.a;
        int i2 = b.b;
        if (i <= 0 || i2 <= 0 || width <= 0 || height <= 0) {
            aVar = null;
        } else {
            int a2 = iah0.a(40);
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.ideas_story_onboarding_bar_height);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.ideas_story_box_margin_top);
            View findViewById = findViewById(R.id.ideas_title);
            int bottom = (height - ((!findViewById.isLaidOut() || findViewById.getHeight() <= 0) ? 0 : findViewById.getBottom() - view.getTop())) - dimensionPixelSize2;
            int i3 = bottom >= 0 ? bottom : 0;
            int i4 = a2 * 2;
            int i5 = i - i4;
            if (i5 <= width) {
                width = i5;
            }
            if (width < 1) {
                width = 1;
            }
            int i6 = i2 - i4;
            if (i6 <= i3) {
                i3 = i6;
            }
            if (i3 < 1) {
                i3 = 1;
            }
            int i7 = i3 - dimensionPixelSize;
            int i8 = i7 >= 1 ? i7 : 1;
            int i9 = (width * 436) / 295;
            if (i9 > i8) {
                width = (i8 * 295) / 436;
            } else {
                i8 = i9;
            }
            aVar = new a(width, i8 + dimensionPixelSize);
        }
        if (aVar == null) {
            return;
        }
        int i10 = aVar.b;
        View view2 = this.q;
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        ConstraintLayout.b bVar = layoutParams instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams : null;
        if (bVar == null) {
            return;
        }
        int i11 = ((ViewGroup.MarginLayoutParams) bVar).width;
        int i12 = aVar.a;
        if (i11 == i12 && ((ViewGroup.MarginLayoutParams) bVar).height == i10) {
            return;
        }
        ((ViewGroup.MarginLayoutParams) bVar).width = i12;
        ((ViewGroup.MarginLayoutParams) bVar).height = i10;
        view2.setLayoutParams(bVar);
    }

    @Override // xsna.qo6
    public final void v0(boolean z, boolean z2, boolean z3) {
        getFeature().C(new rsv.c.C3630c(z, z2, z3));
    }

    @Override // xsna.qo6
    public final void D() {
    }

    @Override // xsna.qo6
    public final void G() {
    }

    @Override // xsna.qo6
    public final void y0() {
    }

    @Override // xsna.qo6
    public final void z() {
    }

    @Override // xsna.qo6
    public final void G0(tu1 tu1Var) {
    }

    @Override // xsna.qo6
    public final void J(StoryEntry storyEntry) {
    }

    @Override // xsna.qo6
    public final void m0(axl0 axl0Var) {
    }

    @Override // xsna.qo6
    public final void onTouch(MotionEvent motionEvent) {
    }

    @Override // xsna.qo6
    public void setAudioMuted(boolean z) {
    }

    @Override // xsna.qo6
    public void setEncodingDone(zjm0 zjm0Var) {
    }

    @Override // xsna.qo6
    public void setUploadDone(zjm0 zjm0Var) {
    }

    @Override // xsna.qo6
    public void setUploadFailed(zjm0 zjm0Var) {
    }

    @Override // xsna.qo6
    public void setUploadProgress(zjm0 zjm0Var) {
    }

    @Override // xsna.qo6
    public final void H(int i, UserId userId) {
    }

    @Override // xsna.qo6
    public final void H0(int i, UserId userId) {
    }
}
