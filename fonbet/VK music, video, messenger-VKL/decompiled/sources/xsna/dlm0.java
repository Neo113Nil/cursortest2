package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import androidx.viewpager.widget.ViewPager;
import com.vk.dto.stories.model.AppGroupedStoriesContainer;
import com.vk.dto.stories.model.DiscoverErrorLoadContainer;
import com.vk.dto.stories.model.DiscoverStoriesContainer;
import com.vk.dto.stories.model.DiscoverStubStoriesContainer;
import com.vk.dto.stories.model.IdeasStoriesContainer;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.ads.MyTargetAdStoriesContainer;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.story.viewer.impl.presentation.stories.c;
import java.lang.ref.WeakReference;

/* compiled from: StoryViewBuilder.kt */
/* loaded from: classes6.dex */
public final class dlm0 {
    public final Context a;
    public final StoriesContainer b;
    public final qlm0 c;
    public final WeakReference<vrl0> d;
    public boolean e;
    public MobileOfficialAppsConStoriesStat$ViewEntryPoint f;
    public int g;
    public View.OnTouchListener h;
    public elm0 i;
    public com.vk.story.api.a j;
    public Window k;
    public ViewPager l;
    public ac80 m;
    public float n = 1.0f;
    public boolean o;
    public Integer p;
    public boolean q;

    /* compiled from: StoryViewBuilder.kt */
    public static final class a implements View.OnTouchListener {
        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    public dlm0(Context context, StoriesContainer storiesContainer, qlm0 qlm0Var, WeakReference<vrl0> weakReference) {
        this.a = context;
        this.b = storiesContainer;
        this.c = qlm0Var;
        this.d = weakReference;
    }

    public final qo6 a() {
        Integer valueOf;
        qo6 b2nVar;
        qo6 qo6Var;
        Window window;
        MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint = this.f;
        if (mobileOfficialAppsConStoriesStat$ViewEntryPoint == null) {
            throw new IllegalStateException("viewEntryPoint == null");
        }
        View.OnTouchListener onTouchListener = this.h;
        if (onTouchListener == null) {
            onTouchListener = new a();
        }
        View.OnTouchListener onTouchListener2 = onTouchListener;
        com.vk.story.api.a aVar = this.j;
        if (aVar == null) {
            aVar = new com.vk.story.api.a();
        }
        com.vk.story.api.a aVar2 = aVar;
        aVar2.e = mobileOfficialAppsConStoriesStat$ViewEntryPoint;
        aVar2.d = this.g;
        aVar2.f = this.e;
        aVar2.h = this.p;
        StoriesContainer storiesContainer = this.b;
        if (fsk.A(storiesContainer)) {
            elm0 elm0Var = this.i;
            boolean z = this.e;
            elm0 elm0Var2 = !z ? elm0Var : null;
            Window window2 = !z ? this.k : null;
            ViewPager viewPager = !z ? this.l : null;
            valueOf = this.e ? null : Integer.valueOf(this.g);
            b2nVar = new gmz(this.a, elm0Var2, this.b, window2, viewPager, valueOf != null ? valueOf.intValue() : 0, this.c);
        } else {
            if (storiesContainer instanceof AppGroupedStoriesContainer) {
                qo6Var = new w43(this.a, onTouchListener2, this.b, this.i, aVar2, this.c);
            } else if (storiesContainer instanceof DiscoverStoriesContainer) {
                DiscoverStoriesContainer discoverStoriesContainer = (DiscoverStoriesContainer) storiesContainer;
                elm0 elm0Var3 = this.i;
                aVar2.g = discoverStoriesContainer.o;
                s3q0 s3q0Var = s3q0.a;
                qo6Var = new y9n(this.a, onTouchListener2, discoverStoriesContainer, elm0Var3, aVar2, this.c);
            } else {
                boolean z2 = storiesContainer instanceof DiscoverStubStoriesContainer;
                Context context = this.a;
                if (z2) {
                    DiscoverStubStoriesContainer discoverStubStoriesContainer = (DiscoverStubStoriesContainer) storiesContainer;
                    Window window3 = this.k;
                    if (this.e) {
                        window3 = null;
                    }
                    valueOf = this.e ? null : Integer.valueOf(this.g);
                    qo6Var = new dan(context, window3, discoverStubStoriesContainer, valueOf != null ? valueOf.intValue() : 0);
                } else if (storiesContainer instanceof DiscoverErrorLoadContainer) {
                    Window window4 = !this.e ? this.k : null;
                    valueOf = this.e ? null : Integer.valueOf(this.g);
                    b2nVar = new b2n(this.a, this.i, window4, (DiscoverErrorLoadContainer) storiesContainer, valueOf != null ? valueOf.intValue() : 0, this.c);
                } else if (storiesContainer instanceof MyTargetAdStoriesContainer) {
                    MyTargetAdStoriesContainer myTargetAdStoriesContainer = (MyTargetAdStoriesContainer) storiesContainer;
                    qo6Var = myTargetAdStoriesContainer.Vb() ? new kq50(this.a, onTouchListener2, myTargetAdStoriesContainer, this.i, aVar2, this.m, this.c, this.d) : new ep50(this.a, onTouchListener2, myTargetAdStoriesContainer, this.i, aVar2, this.m, this.c, this.d);
                } else if (storiesContainer instanceof IdeasStoriesContainer) {
                    quv quvVar = new quv(context);
                    quvVar.setStoriesContainer(storiesContainer);
                    quvVar.setCallback(this.i);
                    quvVar.setViewEntryPoint(mobileOfficialAppsConStoriesStat$ViewEntryPoint);
                    quvVar.setOnTouchListener(onTouchListener2);
                    quvVar.setPosition(this.g);
                    qo6Var = quvVar;
                } else {
                    qo6Var = new mkm0(this.a, onTouchListener2, this.b, this.i, aVar2, this.m, this.c, this.d, this.n, this.o, this.q);
                }
            }
            b2nVar = qo6Var;
        }
        if ((b2nVar instanceof po6) && (window = this.k) != null) {
            ((po6) b2nVar).setContainerWindow(window);
        }
        return b2nVar;
    }

    public final void b(c.d dVar) {
        this.i = dVar;
    }

    public final void c() {
        this.e = true;
    }

    public final void d(ac80 ac80Var) {
        this.m = ac80Var;
    }

    public final void e(MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint) {
        this.f = mobileOfficialAppsConStoriesStat$ViewEntryPoint;
    }
}
