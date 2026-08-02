package xsna;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryViewAction;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stories.design.view.StoryProgressView;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.story.viewer.api.models.PreloadSource;
import com.vk.story.viewer.impl.presentation.stories.view.SourceTransitionStory;
import com.vkontakte.android.data.b;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import xsna.umm0;

/* compiled from: BaseStoryView.java */
/* loaded from: classes6.dex */
public abstract class po6 extends FrameLayout implements qo6, wsi, w8i, umm0.a {
    public final io.reactivex.rxjava3.disposables.b A;
    public final WeakReference<vrl0> B;
    public final Handler C;
    public final oo6 D;

    @Nullable
    public umm0 b;

    @Nullable
    public final elm0 c;

    @NonNull
    public final MobileOfficialAppsConStoriesStat$ViewEntryPoint d;

    @NonNull
    public final View.OnTouchListener e;
    public final boolean f;

    @NonNull
    public final qlm0 g;

    @NonNull
    public StoriesContainer h;

    @Nullable
    public Dialog i;

    @Nullable
    public Dialog j;

    @Nullable
    public Window k;
    public StoryProgressView l;

    @Nullable
    public StoryEntry m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public int r;
    public long s;
    public final a7m0 t;
    public boolean u;
    public int v;
    public boolean w;
    public boolean x;

    @NonNull
    public final wmm0 y;
    public final anm0 z;

    public po6(@NonNull Context context, @NonNull StoriesContainer storiesContainer, @Nullable elm0 elm0Var, @NonNull View.OnTouchListener onTouchListener, @NonNull com.vk.story.api.a aVar, @NonNull qlm0 qlm0Var, WeakReference<vrl0> weakReference) {
        super(context);
        this.s = -1L;
        this.t = new a7m0();
        this.u = false;
        this.y = new wmm0(o25.a());
        this.z = ((StoryViewerComponent) j6i.b(m7m.f(this), StoryViewerComponent.class)).l9();
        this.A = new io.reactivex.rxjava3.disposables.b();
        this.C = new Handler(Looper.getMainLooper());
        this.D = new oo6(this, 0);
        this.c = elm0Var;
        this.h = storiesContainer;
        this.e = onTouchListener;
        this.f = aVar.f;
        this.d = aVar.e;
        this.v = aVar.d;
        this.g = qlm0Var;
        this.B = weakReference;
    }

    @Override // xsna.qo6
    public final void A() {
        if (!T0() && R0()) {
            V0(SourceTransitionStory.CLICK);
        }
    }

    @Override // xsna.qo6
    public final boolean B() {
        return this.w;
    }

    @Override // xsna.qo6
    public final void C() {
        if (!T0() && R0()) {
            W0(SourceTransitionStory.CLICK);
        }
    }

    public boolean O(int i, int i2) {
        return false;
    }

    public final u8m0 P0() {
        long currentTime = getCurrentTime();
        StoriesContainer storiesContainer = getStoriesContainer();
        Long duration = getDuration();
        StoryEntry storyEntry = this.m;
        if (storiesContainer == null || storyEntry == null) {
            return null;
        }
        int indexOf = storiesContainer.g.indexOf(storyEntry);
        return new u8m0(currentTime, indexOf, (storiesContainer.g.size() - 1) - indexOf, duration, false);
    }

    public final void Q0() {
        if (T0()) {
            return;
        }
        this.C.removeCallbacksAndMessages(null);
        g1();
        setLoadingProgressVisible(false);
    }

    @Override // xsna.qo6
    public final void R() {
        qap qapVar;
        qap qapVar2;
        if (T0()) {
            return;
        }
        umm0 umm0Var = this.b;
        StoryEntry currentStory = umm0Var.a.getCurrentStory();
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (currentStory != null) {
            f = Math.min(Math.max((currentStory.i * 1.0f) / 100.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), 1.0f);
        }
        long c = (long) ((umm0Var.c != null ? r1.c() : 0) * f);
        o3e0 o3e0Var = umm0Var.c;
        if (o3e0Var != null && (qapVar2 = o3e0Var.a) != null) {
            qapVar2.b = 0L;
            qapVar2.c = 0L;
            qapVar2.d = false;
        }
        if (o3e0Var != null && (qapVar = o3e0Var.a) != null) {
            if (qapVar.d) {
                qapVar.c = SystemClock.elapsedRealtime() - c;
            } else {
                qapVar.a = c;
            }
        }
        StoryProgressView storyProgressView = umm0Var.b;
        if (storyProgressView != null) {
            storyProgressView.setProgress(f);
        }
        o3e0 o3e0Var2 = umm0Var.c;
        if (o3e0Var2 != null) {
            o3e0Var2.f();
        }
        umm0Var.c(false);
    }

    public final boolean R0() {
        elm0 elm0Var = this.c;
        return elm0Var != null && elm0Var.getCurrentIdlePagerPosition() == getPosition();
    }

    public final boolean T0() {
        return this.f || this.n;
    }

    public void V0(SourceTransitionStory sourceTransitionStory) {
        if (R0()) {
            Dialog dialog = this.i;
            if (dialog != null) {
                dialog.dismiss();
            }
            Dialog dialog2 = this.j;
            if (dialog2 != null) {
                dialog2.dismiss();
            }
            Z0();
            int i = this.r;
            int sectionsCount = getSectionsCount() - 1;
            elm0 elm0Var = this.c;
            if (i == sectionsCount) {
                if ((this instanceof y9n) || elm0Var == null) {
                    return;
                }
                elm0Var.e(sourceTransitionStory);
                return;
            }
            int size = this.h.g.size();
            int i2 = this.r + 1;
            if (size > i2) {
                this.g.s.c(this.h, this.h.g.get(i2), MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.TypeNextStory.NEXT_STORY);
            }
            StoryEntry currentStory = getCurrentStory();
            if (sourceTransitionStory == SourceTransitionStory.CLICK && currentStory != null) {
                e1(StoryViewAction.GO_TO_NEXT_STORY_TAP);
            } else if (sourceTransitionStory == SourceTransitionStory.EXPIRED_TIME && currentStory != null) {
                e1(StoryViewAction.GO_TO_NEXT_STORY_AUTO_BY_TIME);
            }
            if (elm0Var != null) {
                elm0Var.j();
            }
            setPreloadSource(PreloadSource.NEXT_STORY);
            X0(this.r + 1);
            c1(true);
            ((mkm0) this).y0();
        }
    }

    public void W0(SourceTransitionStory sourceTransitionStory) {
        if (R0()) {
            qlm0 qlm0Var = this.g;
            qlm0Var.s.d();
            Dialog dialog = this.i;
            if (dialog != null) {
                dialog.dismiss();
            }
            Z0();
            StoryEntry currentStory = getCurrentStory();
            if (sourceTransitionStory == SourceTransitionStory.CLICK && currentStory != null) {
                e1(StoryViewAction.GO_TO_PREVIOUS_STORY);
            }
            int i = this.r;
            if (i == 0) {
                elm0 elm0Var = this.c;
                if (elm0Var != null) {
                    elm0Var.o();
                    return;
                }
                return;
            }
            q7m0 q7m0Var = qlm0Var.s;
            StoriesContainer storiesContainer = this.h;
            q7m0Var.c(storiesContainer, storiesContainer.g.get(i - 1), MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.TypeNextStory.PREV_STORY);
            setPreloadSource(PreloadSource.PREVIOUS_STORY);
            X0(this.r - 1);
            c1(true);
            ((mkm0) this).y0();
        }
    }

    public boolean X(int i, int i2) {
        return false;
    }

    public final void Z0() {
        StoryEntry currentStory = getCurrentStory();
        if (currentStory == null || currentStory.c == 0) {
            return;
        }
        this.g.b.e(o25.a().c(), currentStory, this.d, this.b.a(), false, MobileOfficialAppsCoreNavStat$EventScreen.STORY_VIEWER);
    }

    @Override // xsna.wsi, xsna.qdc0
    public final void a(@NonNull io.reactivex.rxjava3.disposables.c cVar) {
        this.A.b(cVar);
    }

    public void a1() {
        if (T0()) {
            return;
        }
        Handler handler = this.C;
        handler.removeCallbacksAndMessages(null);
        handler.postDelayed(this.D, 700L);
    }

    public final void c1(boolean z) {
        if (T0()) {
            return;
        }
        this.b.c(z);
    }

    public void d1() {
        umm0 umm0Var;
        if (T0() || (umm0Var = this.b) == null) {
            return;
        }
        umm0Var.i.removeCallbacksAndMessages(null);
        umm0Var.g.run();
        CopyOnWriteArrayList<m8m0> copyOnWriteArrayList = umm0Var.h;
        int size = copyOnWriteArrayList.size();
        for (int i = 0; i < size; i++) {
            copyOnWriteArrayList.get(i).b();
        }
    }

    public void destroy() {
        if (this.f || this.n) {
            return;
        }
        this.n = true;
        Z0();
        d1();
        Dialog dialog = this.i;
        if (dialog != null) {
            dialog.dismiss();
        }
        dispose();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override // xsna.wsi
    public final void dispose() {
        this.A.dispose();
    }

    public void e1(StoryViewAction storyViewAction) {
        f1(storyViewAction, null);
    }

    public void f1(@NonNull StoryViewAction storyViewAction, izs<? super b.d, s3q0> izsVar) {
        elm0 elm0Var = this.c;
        this.z.t(storyViewAction, this.d, this.m, P0(), elm0Var != null ? elm0Var.getRef() : "unknown", izsVar);
    }

    public abstract void g1();

    @NonNull
    public Context getCtx() {
        return getContext();
    }

    @Nullable
    public Dialog getCurrentDialog() {
        return this.i;
    }

    public /* bridge */ /* synthetic */ float getCurrentHeaderAvatarScale() {
        return 1.0f;
    }

    public int getCurrentIndex() {
        return this.r;
    }

    @Nullable
    public StoryEntry getCurrentStory() {
        return this.m;
    }

    public abstract /* synthetic */ long getCurrentTime();

    @NonNull
    public qlm0 getDependencies() {
        return this.g;
    }

    public /* bridge */ /* synthetic */ Long getDuration() {
        return null;
    }

    public boolean getErrorState() {
        return this.o;
    }

    @NonNull
    public View.OnTouchListener getGestureTouchListener() {
        return this.e;
    }

    public int getHeightPx() {
        return getHeight();
    }

    public int getMeasuredWidthPx() {
        return getMeasuredWidth();
    }

    @Nullable
    public Dialog getNotBlockingDialog() {
        return this.j;
    }

    @Override // xsna.qo6
    public int getPosition() {
        return this.v;
    }

    @NonNull
    public StoryProgressView getProgressView() {
        return this.l;
    }

    public /* bridge */ /* synthetic */ iz8 getSavedCadreSize() {
        return null;
    }

    @Override // xsna.umm0.a
    public int getSectionsCount() {
        return this.h.g.size();
    }

    public long getStartTime() {
        return this.s;
    }

    @Override // xsna.qo6
    @NonNull
    public StoriesContainer getStoriesContainer() {
        return this.h;
    }

    @NonNull
    public a7m0 getStoryMetricsCollector() {
        return this.t;
    }

    public wmm0 getStoryViewProgressStrategyFactory() {
        return this.y;
    }

    public /* bridge */ /* synthetic */ Long getVideoViewDuration() {
        return null;
    }

    @NonNull
    public MobileOfficialAppsConStoriesStat$ViewEntryPoint getViewEntryPoint() {
        return this.d;
    }

    @Override // xsna.qo6
    @Nullable
    public Window getWindow() {
        Window window = this.k;
        if (window != null) {
            return window;
        }
        Context context = getContext();
        bpn0 bpn0Var = enj.a;
        Activity h = e3m.h(context);
        if (h != null) {
            return h.getWindow();
        }
        return null;
    }

    public boolean o() {
        elm0 elm0Var;
        StoryEntry currentStory = getCurrentStory();
        if (this.x || this.n) {
            return false;
        }
        if ((this.f && (currentStory == null || !currentStory.Tb())) || (elm0Var = this.c) == null || !elm0Var.g() || !R0() || this.i != null) {
            return false;
        }
        if (!this.p || this.q) {
            return currentStory == null || !this.g.o.j(currentStory.c);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void onPause() {
        this.x = true;
    }

    public void onResume() {
        this.x = false;
    }

    public void pause() {
        if (this.f || this.n) {
            return;
        }
        StoryEntry storyEntry = this.m;
        if (storyEntry != null) {
            q7m0 q7m0Var = this.g.s;
            int i = storyEntry.c;
            StoryEntry b = q7m0Var.b();
            if (b != null && b.c == i) {
                q7m0Var.i = true;
            }
        }
        this.w = false;
        d1();
    }

    public void play() {
        umm0 umm0Var;
        if (this.f || this.n || this.i != null || this.u) {
            return;
        }
        this.w = true;
        if (!R0() || this.o || (umm0Var = this.b) == null) {
            return;
        }
        umm0Var.c(false);
    }

    public abstract /* synthetic */ void setAudioMuted(boolean z);

    public void setContainerWindow(@NonNull Window window) {
        this.k = window;
    }

    public void setCurrentDialog(@Nullable Dialog dialog) {
        this.i = dialog;
    }

    public void setCurrentIndex(int i) {
        this.r = i;
    }

    public void setCurrentStory(StoryEntry storyEntry) {
        this.m = storyEntry;
    }

    public abstract /* synthetic */ void setCurrentStorySeekMs(long j);

    public abstract /* synthetic */ void setEncodingDone(zjm0 zjm0Var);

    public void setIsCurrentStoryPhoto(boolean z) {
        this.p = z;
    }

    public abstract void setLoadingProgressVisible(boolean z);

    public void setNotBlockingDialog(@Nullable Dialog dialog) {
        this.j = dialog;
    }

    public void setPosition(int i) {
        this.v = i;
    }

    public abstract void setPreloadSource(@NonNull PreloadSource preloadSource);

    public void setProgressDelegate(umm0 umm0Var) {
        this.b = umm0Var;
    }

    public void setProgressView(StoryProgressView storyProgressView) {
        this.l = storyProgressView;
    }

    public void setStartTime(long j) {
        this.s = j;
    }

    public void setStoriesContainer(StoriesContainer storiesContainer) {
        this.h = storiesContainer;
    }

    public abstract /* synthetic */ void setUploadDone(zjm0 zjm0Var);

    public abstract /* synthetic */ void setUploadFailed(zjm0 zjm0Var);

    public abstract /* synthetic */ void setUploadProgress(zjm0 zjm0Var);

    @Override // xsna.umm0.a
    public final void x() {
        pause();
    }

    @Override // xsna.qo6
    public void I() {
    }

    public void E0(boolean z) {
    }

    public void X0(int i) {
    }

    public void j0(float f) {
    }

    public void setErrorVisible(boolean z) {
    }
}
