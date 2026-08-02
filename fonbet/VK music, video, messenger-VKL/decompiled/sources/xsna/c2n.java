package xsna;

import androidx.lifecycle.Lifecycle;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: DiscoverFragmentUpdater.kt */
/* loaded from: classes4.dex */
public final class c2n {
    public final Set<MobileOfficialAppsCoreNavStat$EventScreen> a;
    public final a c;
    public io.reactivex.rxjava3.disposables.c d;
    public UiTrackingScreen e;
    public final long b = 600000;
    public final d2n f = new d2n(this);

    /* compiled from: DiscoverFragmentUpdater.kt */
    public interface a {
        void b(b bVar);
    }

    /* compiled from: DiscoverFragmentUpdater.kt */
    public static final class b {
        public final boolean a;

        public b(boolean z) {
            this.a = z;
        }
    }

    /* compiled from: DiscoverFragmentUpdater.kt */
    public static final /* synthetic */ class c {
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

    public c2n(Set set, a aVar) {
        this.a = set;
        this.c = aVar;
    }

    public final void a(Lifecycle.Event event) {
        int i = c.$EnumSwitchMapping$0[event.ordinal()];
        d2n d2nVar = this.f;
        if (i == 1) {
            UiTracker uiTracker = UiTracker.a;
            UiTracker.a(d2nVar);
            return;
        }
        if (i == 2) {
            io.reactivex.rxjava3.disposables.c cVar = this.d;
            if (cVar != null) {
                cVar.dispose();
            }
            this.d = null;
            this.e = null;
            return;
        }
        if (i == 3) {
            b();
            return;
        }
        if (i != 4) {
            return;
        }
        io.reactivex.rxjava3.disposables.c cVar2 = this.d;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        this.d = null;
        this.e = null;
        UiTracker uiTracker2 = UiTracker.a;
        UiTracker.g(d2nVar);
        this.e = null;
    }

    public final void b() {
        io.reactivex.rxjava3.disposables.c cVar = this.d;
        if (cVar != null) {
            cVar.dispose();
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        asu0 asu0Var = asu0.a;
        asu0Var.getClass();
        this.d = io.reactivex.rxjava3.core.a.s(this.b, timeUnit, asu0.i()).o(asu0Var.d()).subscribe(new cm4(this, 5), kwg0.b());
    }
}
