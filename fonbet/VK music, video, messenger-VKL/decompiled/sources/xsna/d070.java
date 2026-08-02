package xsna;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.fragments.FragmentImpl;
import com.vk.newsfeed.utils.NewsDebuggerPoint;
import com.vk.story.api.di.StoriesComponent;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Lazy;
import xsna.b0g;
import xsna.c63;
import xsna.d070;

/* compiled from: NewsfeedStoriesBlockPlugin.kt */
/* loaded from: classes4.dex */
public final class d070 {
    public final at60 a;
    public final io.reactivex.rxjava3.disposables.b b;
    public final ts60 c;
    public final Lazy d;
    public final Lazy e;
    public boolean f;
    public WeakReference<FragmentImpl> g;
    public WeakReference<f5z> h;
    public cht k;
    public boolean n;
    public View s;
    public ee t;
    public volatile boolean u;
    public a v;
    public xif0 w;
    public RecyclerView x;
    public final c070 i = new androidx.lifecycle.l() { // from class: xsna.c070
        @Override // androidx.lifecycle.l
        public final void onStateChanged(f5z f5zVar, Lifecycle.Event event) {
            d070 d070Var = d070.this;
            Lazy lazy = d070Var.e;
            Set<rov> set = d070Var.o;
            bpn0 bpn0Var = d070Var.q;
            int i = d070.d.$EnumSwitchMapping$0[event.ordinal()];
            int i2 = 4;
            if (i == 1) {
                ((dtl0) bpn0Var.getValue()).onCreate();
                d070Var.b.b(((StoriesComponent) d070Var.d.getValue()).bf().g().subscribe(new f2u(new uh40(d070Var, i2), 10)));
                return;
            }
            if (i == 2) {
                ((StoryViewerComponent) lazy.getValue()).Nd().onResume();
                return;
            }
            if (i == 3) {
                ((StoryViewerComponent) lazy.getValue()).Nd().onPause();
                Iterator<rov> it = set.iterator();
                while (it.hasNext()) {
                    rov next = it.next();
                    if (next != null) {
                        next.onPause();
                        s3q0 s3q0Var = s3q0.a;
                    } else {
                        it.remove();
                    }
                }
                return;
            }
            if (i != 4) {
                return;
            }
            ((dtl0) bpn0Var.getValue()).onDestroy();
            Iterator<rov> it2 = set.iterator();
            while (it2.hasNext()) {
                rov next2 = it2.next();
                if (next2 != null) {
                    next2.onDestroy();
                    s3q0 s3q0Var2 = s3q0.a;
                } else {
                    it2.remove();
                }
            }
        }
    };
    public final g070 j = new g070(this);
    public final zf20 l = new zf20(this, 8);
    public final b m = new b();
    public final Set<rov> o = Collections.newSetFromMap(new WeakHashMap());
    public final h070 p = new h070(this);
    public final bpn0 q = new bpn0(new hj60(this, 2));
    public final c r = new c();

    /* compiled from: NewsfeedStoriesBlockPlugin.kt */
    public static final class a extends c63.b {
        public final WeakReference<Activity> b;
        public final WeakReference<d070> c;

        public a(FragmentActivity fragmentActivity, d070 d070Var) {
            this.b = new WeakReference<>(fragmentActivity);
            this.c = new WeakReference<>(d070Var);
        }

        @Override // xsna.c63.b
        public final void o(Activity activity) {
            d070 d070Var;
            if (this.b.get() != activity || (d070Var = this.c.get()) == null) {
                return;
            }
            d070Var.u = false;
            ts60 ts60Var = d070Var.c;
            NewsDebuggerPoint newsDebuggerPoint = NewsDebuggerPoint.ChangeList;
            ts60Var.T();
            d070Var.a().stop();
        }

        @Override // xsna.c63.b
        public final void p(Activity activity) {
            final d070 d070Var;
            if (this.b.get() != activity || (d070Var = this.c.get()) == null) {
                return;
            }
            d070Var.u = true;
            b0g b0gVar = b0g.a;
            b0g.a(new b0g.a() { // from class: xsna.b070
                @Override // xsna.b0g.a
                public final void a() {
                    d070 d070Var2 = d070.this;
                    if (d070Var2.u) {
                        ts60 ts60Var = d070Var2.c;
                        NewsDebuggerPoint newsDebuggerPoint = NewsDebuggerPoint.ChangeList;
                        ts60Var.T();
                        d070Var2.a().a();
                    }
                }
            });
        }
    }

    /* compiled from: NewsfeedStoriesBlockPlugin.kt */
    public static final class b implements gzs<s3q0> {
        @Override // xsna.gzs
        public final /* bridge */ /* synthetic */ s3q0 invoke() {
            return s3q0.a;
        }
    }

    /* compiled from: NewsfeedStoriesBlockPlugin.kt */
    public final class c implements zjf0<ol60> {
        public c() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.zjf0
        public final void b(RecyclerView.e0 e0Var) {
            rql0 rql0Var;
            View view;
            d070 d070Var = d070.this;
            Set<rov> set = d070Var.o;
            if (e0Var instanceof rql0) {
                ((rql0) e0Var).v6(d070Var.m);
                e0Var.itemView.removeOnLayoutChangeListener(d070Var.p);
                rov rovVar = (rov) e0Var;
                ((StoryViewerComponent) d070Var.e.getValue()).Nd().b(rovVar);
                set.remove(rovVar);
                Iterator<rov> it = set.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        rql0Var = null;
                        break;
                    }
                    rov next = it.next();
                    if (next instanceof rql0) {
                        rql0Var = (rql0) next;
                        break;
                    }
                    it.remove();
                }
                int measuredHeight = (rql0Var == null || (view = rql0Var.itemView) == null) ? 0 : view.getMeasuredHeight();
                View view2 = d070Var.s;
                if (view2 != null) {
                    f4m.t(measuredHeight, view2);
                }
                ee eeVar = d070Var.t;
                if (eeVar != null) {
                    f4m.t(measuredHeight, eeVar);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.zjf0
        public final void d(RecyclerView.e0 e0Var, ol60 ol60Var) {
            ol60 ol60Var2 = ol60Var;
            if ((e0Var instanceof rql0) && (ol60Var2 instanceof o070)) {
                rql0 rql0Var = (rql0) e0Var;
                d070 d070Var = d070.this;
                rql0Var.v6(d070Var.l);
                rql0Var.o = d070Var.f;
                rql0Var.V5(((o070) ol60Var2).h);
                if (d070Var.n) {
                    rql0Var.t6();
                    d070Var.n = false;
                }
                rov rovVar = (rov) e0Var;
                ((StoryViewerComponent) d070Var.e.getValue()).Nd().a(rovVar);
                d070Var.o.add(rovVar);
                e0Var.itemView.addOnLayoutChangeListener(d070Var.p);
                int measuredHeight = e0Var.itemView.getMeasuredHeight();
                View view = d070Var.s;
                if (view != null) {
                    f4m.t(measuredHeight, view);
                }
                ee eeVar = d070Var.t;
                if (eeVar != null) {
                    f4m.t(measuredHeight, eeVar);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.zjf0
        public final void e(RecyclerView.e0 e0Var) {
            if (e0Var instanceof rql0) {
                rov rovVar = (rov) e0Var;
                d070 d070Var = d070.this;
                ((StoryViewerComponent) d070Var.e.getValue()).Nd().a(rovVar);
                d070Var.o.add(rovVar);
                ((rql0) e0Var).n = true;
            }
        }
    }

    /* compiled from: NewsfeedStoriesBlockPlugin.kt */
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [xsna.c070] */
    public d070(at60 at60Var, io.reactivex.rxjava3.disposables.b bVar, bpn0 bpn0Var, Lazy lazy, ts60 ts60Var) {
        this.a = at60Var;
        this.b = bVar;
        this.c = ts60Var;
        this.d = bpn0Var;
        this.e = lazy;
    }

    public final i070 a() {
        return ((StoriesComponent) this.d.getValue()).gd();
    }
}
