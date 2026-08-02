package xsna;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.vk.bridges.ImageViewer;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.photo.Photo;
import com.vk.dto.stories.model.HighlightStoriesContainer;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.story.api.LoadContext;
import com.vk.story.viewer.api.StoryViewerRouter;
import com.vk.story.viewer.impl.presentation.stories.StoryViewActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* compiled from: StoryViewerRouterImpl.kt */
/* loaded from: classes11.dex */
public final class rnm0 implements StoryViewerRouter {
    public final p870 a;
    public final otl0 b;
    public final oga0 c;
    public final HashSet<UserId> d = new HashSet<>();
    public a e;

    /* compiled from: StoryViewerRouterImpl.kt */
    /* loaded from: classes6.dex */
    public static final class a {
        public final int a;
        public final List<String> b;
        public final boolean c;
        public final io.reactivex.rxjava3.disposables.c d;
        public final ImageViewer.c<Photo> e;

        public /* synthetic */ a(int i, List list, io.reactivex.rxjava3.disposables.c cVar) {
            this(i, list, false, cVar, null);
        }

        public static a a(a aVar, ImageViewer.c cVar, int i) {
            int i2 = aVar.a;
            List<String> list = aVar.b;
            boolean z = (i & 4) != 0 ? aVar.c : true;
            io.reactivex.rxjava3.disposables.c cVar2 = aVar.d;
            if ((i & 16) != 0) {
                cVar = aVar.e;
            }
            aVar.getClass();
            return new a(i2, list, z, cVar2, cVar);
        }

        public final io.reactivex.rxjava3.disposables.c b() {
            return this.d;
        }

        public final ImageViewer.c<Photo> c() {
            return this.e;
        }

        public final int d() {
            return this.a;
        }

        public final List<String> e() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && this.c == aVar.c && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e);
        }

        public final boolean f() {
            return this.c;
        }

        public final int hashCode() {
            int hashCode = (this.d.hashCode() + qoy.b(fw3.a(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31;
            ImageViewer.c<Photo> cVar = this.e;
            return hashCode + (cVar == null ? 0 : cVar.hashCode());
        }

        public final String toString() {
            return "PhotosOpeningRequest(parentViewId=" + this.a + ", photoIdsToOpen=" + this.b + ", viewerIsOpened=" + this.c + ", disposable=" + this.d + ", interactor=" + this.e + ')';
        }

        public a(int i, List<String> list, boolean z, io.reactivex.rxjava3.disposables.c cVar, ImageViewer.c<Photo> cVar2) {
            this.a = i;
            this.b = list;
            this.c = z;
            this.d = cVar;
            this.e = cVar2;
        }
    }

    public rnm0(p870 p870Var, otl0 otl0Var, oga0 oga0Var) {
        this.a = p870Var;
        this.b = otl0Var;
        this.c = oga0Var;
    }

    @Override // com.vk.story.viewer.api.StoryViewerRouter
    public final void b(Context context, UserId userId, int i, String str, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint) {
        Serializer.c<Narrative> cVar = Narrative.CREATOR;
        StoryViewerRouter.d(this, context, e43.a(new HighlightStoriesContainer(Narrative.a.a(i, userId), 0, 2, null)), str, mobileOfficialAppsConStoriesStat$ViewEntryPoint, null, null, null, null, null, 3952);
    }

    @Override // com.vk.story.viewer.api.StoryViewerRouter
    public final void c(Activity activity, List list, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, String str, f5z f5zVar, tjs tjsVar) {
        StoriesContainer storiesContainer;
        String Ob = (list == null || (storiesContainer = (StoriesContainer) list.get(0)) == null) ? null : storiesContainer.Ob();
        if (Ob == null) {
            Ob = "";
        }
        h(activity, list, Ob, null, (r42 & 16) != 0, mobileOfficialAppsConStoriesStat$ViewEntryPoint, (r42 & 64) != 0 ? MobileOfficialAppsConStoriesStat$ViewEntryPoint.DISCOVER : null, str, null, (r42 & 512) != 0 ? null : null, tjsVar, (r42 & 2048) != 0 ? StoryViewerRouter.InOutAnimation.PointToFullScreen : null, (r42 & 4096) != 0 ? new com.vk.story.api.a() : null, -1, -1, (32768 & r42) != 0 ? null : null, (65536 & r42) != 0 ? null : null, (131072 & r42) != 0 ? null : null, (262144 & r42) != 0 ? null : f5zVar, (r42 & 524288) != 0 ? SystemClock.elapsedRealtime() : 0L);
    }

    @Override // com.vk.story.viewer.api.StoryViewerRouter
    public final void f(Context context, StoryEntry storyEntry, LoadContext loadContext, Parcelable parcelable) {
        StoryViewerRouter.d(this, context, null, storyEntry.Fb(), null, loadContext, null, null, null, parcelable, 1898);
    }

    @Override // com.vk.story.viewer.api.StoryViewerRouter
    public final void g(Context context, List list, String str, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, LoadContext loadContext, String str2, String str3, boolean z, String str4, Parcelable parcelable) {
        if (list != null) {
            this.a.e(120, list);
        }
        Intent putExtra = new Intent(context, (Class<?>) StoryViewActivity.class).putExtra("global_layout_listener", z).putExtra("show_back_to_stories_button", false).putExtra("story_action", str4).putExtra("start_time", SystemClock.elapsedRealtime()).putExtra("transferable_state", parcelable);
        if (list != null) {
            putExtra.putExtra("stories_containers", new ArrayList(list));
        }
        if (str != null) {
            putExtra.putExtra("open_story", str);
        }
        if (mobileOfficialAppsConStoriesStat$ViewEntryPoint != null) {
            putExtra.putExtra("view_entry_point", mobileOfficialAppsConStoriesStat$ViewEntryPoint);
        }
        if (loadContext != null) {
            putExtra.putExtra("load_context", loadContext);
        }
        if (str2 != null) {
            putExtra.putExtra("ref", str2);
        }
        if (str3 != null) {
            putExtra.putExtra("track_code", str3);
        }
        context.startActivity(putExtra);
    }

    @Override // com.vk.story.viewer.api.StoryViewerRouter
    public final Dialog h(Activity activity, List<? extends StoriesContainer> list, String str, StoriesContainer storiesContainer, boolean z, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint2, String str2, String str3, String str4, StoryViewerRouter.a aVar, StoryViewerRouter.InOutAnimation inOutAnimation, com.vk.story.api.a aVar2, int i, int i2, DialogInterface.OnDismissListener onDismissListener, DialogInterface.OnShowListener onShowListener, StoryViewerRouter.b bVar, f5z f5zVar, long j) {
        if (list != null) {
            this.a.e(120, list);
        }
        com.vk.story.viewer.impl.presentation.stories.c cVar = new com.vk.story.viewer.impl.presentation.stories.c(activity, list, str, storiesContainer, z, aVar, mobileOfficialAppsConStoriesStat$ViewEntryPoint, mobileOfficialAppsConStoriesStat$ViewEntryPoint2, str2, str3, str4, f5zVar, j);
        cVar.P = inOutAnimation;
        cVar.Q = aVar2;
        cVar.E = i;
        cVar.F = i2;
        if (onDismissListener != null) {
            cVar.I = onDismissListener;
        }
        if (onShowListener != null) {
            cVar.setOnShowListener(onShowListener);
        }
        if (bVar != null) {
            cVar.J = bVar;
        }
        cVar.show();
        return cVar;
    }

    @Override // com.vk.story.viewer.api.StoryViewerRouter
    public final void i(Context context, long j, int i, x9l0 x9l0Var, mcj0 mcj0Var) {
        ver0.c(context, hg1.m(rsg0.y0(yfb.x(zga0.c(f9t.d(), new UserId(j), Collections.singletonList(Integer.valueOf(i)), null, null, null, 186)), null, null, 3), context, 50L, false, 60).subscribe(new ox80(new asy(this, context, x9l0Var, mcj0Var, 2), 13), new cx00(new mvl0(mcj0Var, 2), 26)));
    }

    @Override // com.vk.story.viewer.api.StoryViewerRouter
    public final void j(ViewGroup viewGroup, List list, gzs gzsVar, gzs gzsVar2, izs izsVar) {
        ImageViewer.c<Photo> c;
        io.reactivex.rxjava3.disposables.c b;
        a aVar = this.e;
        if (aVar != null && aVar.d() == System.identityHashCode(viewGroup)) {
            a aVar2 = this.e;
            if (epx.f(aVar2 != null ? aVar2.e() : null, list)) {
                return;
            }
            a aVar3 = this.e;
            if (aVar3 != null && aVar3.f()) {
                return;
            }
        }
        a aVar4 = this.e;
        if (aVar4 != null && (b = aVar4.b()) != null) {
            b.dispose();
        }
        a aVar5 = this.e;
        if (aVar5 != null && (c = aVar5.c()) != null) {
            c.a(false);
        }
        io.reactivex.rxjava3.disposables.c subscribe = hg1.m(rsg0.y0(yfb.x(zga0.l(f9t.d(), list, 6)), null, null, 3), viewGroup.getContext(), 50L, false, 60).subscribe(new r7a0(new ag9(this, viewGroup, gzsVar, gzsVar2, 3), 13), new d750(new dnh0(6, this, izsVar), 18));
        hg1.b(viewGroup, subscribe);
        this.e = new a(System.identityHashCode(viewGroup), list, subscribe);
    }

    @Override // com.vk.story.viewer.api.StoryViewerRouter
    public final Dialog k(h1m0 h1m0Var) {
        Activity a2 = h1m0Var.a().a();
        List<StoriesContainer> d = h1m0Var.a().d();
        String n = h1m0Var.a().n();
        StoriesContainer i = h1m0Var.a().i();
        boolean l = h1m0Var.a().l();
        MobileOfficialAppsConStoriesStat$ViewEntryPoint p = h1m0Var.a().p();
        MobileOfficialAppsConStoriesStat$ViewEntryPoint e = h1m0Var.a().e();
        String j = h1m0Var.a().j();
        String o = h1m0Var.a().o();
        String h = h1m0Var.a().h();
        StoryViewerRouter.a b = h1m0Var.a().b();
        StoryViewerRouter.InOutAnimation c = h1m0Var.a().c();
        com.vk.story.api.a k = h1m0Var.a().k();
        int q = h1m0Var.a().q();
        int r = h1m0Var.a().r();
        DialogInterface.OnDismissListener f = h1m0Var.a().f();
        h1m0Var.a().getClass();
        h1m0Var.a().getClass();
        Dialog h2 = h(a2, d, n, i, l, p, e, j, o, h, b, c, k, q, r, f, null, null, h1m0Var.a().g(), h1m0Var.a().m());
        Integer a3 = h1m0Var.b().a();
        if (a3 != null) {
            ((com.vk.story.viewer.impl.presentation.stories.c) h2).R = a3;
        }
        return h2;
    }

    @Override // com.vk.story.viewer.api.StoryViewerRouter
    public final void l(View view, StoryOwner storyOwner, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, gzs<s3q0> gzsVar) {
        Activity h = e3m.h(view.getContext());
        if (h == null && (h = enj.b(view)) == null) {
            gzsVar.invoke();
            return;
        }
        Activity activity = h;
        UserId Fb = storyOwner.Fb();
        HashSet<UserId> hashSet = this.d;
        if (hashSet.contains(Fb)) {
            return;
        }
        hashSet.add(Fb);
        ver0.c(view.getContext(), new io.reactivex.rxjava3.internal.operators.single.j(this.b.g(Fb), new qk8(3, this, Fb)).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new onm0(new qnm0(gzsVar, mobileOfficialAppsCoreNavStat$EventScreen, this, activity, mobileOfficialAppsConStoriesStat$ViewEntryPoint, view), 0), new pmu(new pnm0(storyOwner, mobileOfficialAppsCoreNavStat$EventScreen, this, activity, mobileOfficialAppsConStoriesStat$ViewEntryPoint, view), 23)));
    }
}
