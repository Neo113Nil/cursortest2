package xsna;

import android.os.Bundle;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedOpenAction;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.viewer.api.routing.models.ClipFeedTransientArgumentsContainer;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.arguments.ClipsWrapperInputArguments;
import com.vk.clips.viewer.impl.owner.ui.fragment.ClipsOwnerSwipeFragment;
import java.util.List;
import kotlin.LazyThreadSafetyMode;

/* compiled from: ClipsOwnerSwipeInputArguments.kt */
/* loaded from: classes17.dex */
public final class roe {
    public final ClipsOwnerSwipeFragment.d a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;

    /* compiled from: ClipsOwnerSwipeInputArguments.kt */
    public static final class a {
        public static ClipFeedOpenAction a(Bundle bundle) {
            ClipsWrapperInputArguments.r.getClass();
            return ClipsWrapperInputArguments.a.a(bundle);
        }

        public static int b(List list, Bundle bundle) {
            ClipsWrapperInputArguments.r.getClass();
            return ClipsWrapperInputArguments.a.b(list, bundle);
        }
    }

    public roe(ClipsOwnerSwipeFragment.d dVar) {
        this.a = dVar;
        com.vk.movika.sdk.base.model.b bVar = new com.vk.movika.sdk.base.model.b(this, 25);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = msy.a(lazyThreadSafetyMode, bVar);
        int i = 19;
        this.c = msy.a(lazyThreadSafetyMode, new cb(this, i));
        this.d = msy.a(lazyThreadSafetyMode, new ey0(this, i));
        this.e = msy.a(lazyThreadSafetyMode, new eb(this, 21));
        this.f = msy.a(lazyThreadSafetyMode, new e4(this, 18));
        this.g = msy.a(lazyThreadSafetyMode, new il1(this, 24));
        int i2 = 25;
        this.h = msy.a(lazyThreadSafetyMode, new gy0(this, 25));
        this.i = msy.a(lazyThreadSafetyMode, new eu1(this, i2));
        this.j = msy.a(lazyThreadSafetyMode, new q(this, i2));
        this.k = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.model.e(this, 21));
        this.l = msy.a(lazyThreadSafetyMode, new bb(this, 21));
    }

    public final Bundle a() {
        return (Bundle) this.a.invoke();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean b() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final List<ClipFeedTab> c() {
        return (List) this.i.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ClipFeedTransientArgumentsContainer d() {
        return (ClipFeedTransientArgumentsContainer) this.b.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final String e() {
        return (String) this.k.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean f() {
        return ((Boolean) this.g.getValue()).booleanValue();
    }
}
