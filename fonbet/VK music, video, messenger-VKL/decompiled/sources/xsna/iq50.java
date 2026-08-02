package xsna;

import android.view.View;
import android.webkit.JavascriptInterface;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryViewItem;
import com.vk.story.viewer.impl.presentation.stories.view.ads.html5.Html5LoadState;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.concurrent.TimeUnit;

/* compiled from: MyTargetHtml5StoryViewDelegate.kt */
/* loaded from: classes6.dex */
public final class iq50 {
    public final q7r a;
    public final a b = new a();
    public io.reactivex.rxjava3.disposables.c c = EmptyDisposable.INSTANCE;
    public Html5LoadState d;
    public boolean e;
    public boolean f;
    public boolean g;

    /* compiled from: MyTargetHtml5StoryViewDelegate.kt */
    public final class a {
        public a() {
        }

        @JavascriptInterface
        public final void VKHTML5AdGameStarted(String str) {
            i0q0.j(new tw3(iq50.this, 15));
        }
    }

    public iq50(q7r q7rVar) {
        this.a = q7rVar;
    }

    public final void a() {
        this.c.dispose();
        io.reactivex.rxjava3.internal.operators.completable.a0 r = io.reactivex.rxjava3.core.a.r(5L, TimeUnit.SECONDS);
        asu0 asu0Var = asu0.a;
        asu0Var.getClass();
        io.reactivex.rxjava3.internal.operators.completable.u o = r.q(asu0.i()).o(asu0Var.d());
        w97 w97Var = new w97(this, 2);
        int i = kwg0.a;
        io.reactivex.rxjava3.disposables.c subscribe = o.subscribe(w97Var, new iwg0());
        this.c = subscribe;
        this.a.i0.a(subscribe);
    }

    public final void b(boolean z) {
        q7r q7rVar = this.a;
        elm0 callback = q7rVar.j0.getCallback();
        if (callback != null) {
            callback.p(z);
        }
        View view = q7rVar.N;
        if (view != null) {
            bwt0.p0(view, !z);
        }
    }

    public final void c(MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType eventType) {
        mkm0 mkm0Var = this.a.i0;
        anm0.d(mkm0Var.getDependencies().f, eventType, MobileOfficialAppsCoreNavStat$EventScreen.STORY_VIEWER, mkm0Var.getViewEntryPoint(), mkm0Var.getCurrentStory(), mkm0Var.P0(), 32);
    }
}
