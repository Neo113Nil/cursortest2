package xsna;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import kotlin.LazyThreadSafetyMode;

/* compiled from: FragmentLifecycleAdapter.kt */
/* loaded from: classes3.dex */
public final class nbs implements f5z {
    public final mbs b;
    public final Object c = msy.a(LazyThreadSafetyMode.NONE, new b1h(this, 16));
    public final a d;

    public nbs(mbs mbsVar) {
        this.b = mbsVar;
        a aVar = new a();
        this.d = aVar;
        mbsVar.a(aVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.f5z
    public final androidx.lifecycle.m getLifecycle() {
        return (androidx.lifecycle.m) this.c.getValue();
    }

    /* compiled from: FragmentLifecycleAdapter.kt */
    public static final class a implements obs {
        public a() {
        }

        @Override // xsna.obs
        public final void onCreate(Bundle bundle) {
            nbs.this.getLifecycle().c(Lifecycle.Event.ON_CREATE);
        }

        @Override // xsna.obs
        public final void onDestroy() {
            nbs nbsVar = nbs.this;
            Lifecycle.State state = nbsVar.getLifecycle().d;
            Lifecycle.State state2 = Lifecycle.State.INITIALIZED;
            if (state != state2) {
                nbsVar.getLifecycle().c(Lifecycle.Event.ON_DESTROY);
            } else {
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.e, new Object[]{"No event down from " + state2 + " in component FragmentLifecycleAdapter."});
                }
            }
            nbsVar.b.d(nbsVar.d);
        }

        @Override // xsna.obs
        public final void onPause() {
            nbs.this.getLifecycle().c(Lifecycle.Event.ON_PAUSE);
        }

        @Override // xsna.obs
        public final void onResume() {
            nbs.this.getLifecycle().c(Lifecycle.Event.ON_RESUME);
        }

        @Override // xsna.obs
        public final void onStop() {
            nbs.this.getLifecycle().c(Lifecycle.Event.ON_STOP);
        }

        @Override // xsna.obs
        public final void b() {
        }

        @Override // xsna.obs
        public final void c() {
        }

        @Override // xsna.obs
        public final void onDestroyView() {
        }

        @Override // xsna.obs
        public final void onConfigurationChanged(Configuration configuration) {
        }

        @Override // xsna.obs
        public final void onActivityResult(int i, int i2, Intent intent) {
        }
    }
}
