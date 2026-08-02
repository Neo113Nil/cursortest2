package xsna;

import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: VkSdkUiListenerImpl.kt */
/* loaded from: classes11.dex */
public final class xhv0 {
    public static final xhv0 a = new xhv0();
    public static final CopyOnWriteArraySet<b> b = new CopyOnWriteArraySet<>();

    /* compiled from: VkSdkUiListenerImpl.kt */
    public static final class b {
        public final WeakReference<f5z> a;

        public b(f5z f5zVar) {
            this.a = new WeakReference<>(f5zVar);
        }

        public final boolean equals(Object obj) {
            f5z f5zVar = this.a.get();
            return f5zVar != null ? (obj instanceof b) && f5zVar.equals(((b) obj).a.get()) : obj == null;
        }

        public final int hashCode() {
            f5z f5zVar = this.a.get();
            if (f5zVar != null) {
                return f5zVar.hashCode();
            }
            return 0;
        }
    }

    /* compiled from: VkSdkUiListenerImpl.kt */
    public static final class a implements nhl {
        @Override // xsna.nhl
        public final void onDestroy(f5z f5zVar) {
            f5zVar.getLifecycle().removeObserver(this);
            xhv0.b.remove(new b(f5zVar));
        }

        @Override // xsna.nhl
        public final void onStart(f5z f5zVar) {
            xhv0 xhv0Var = xhv0.a;
        }

        @Override // xsna.nhl
        public final void onStop(f5z f5zVar) {
            xhv0 xhv0Var = xhv0.a;
        }

        @Override // xsna.nhl
        public final void onCreate(f5z f5zVar) {
        }

        @Override // xsna.nhl
        public final void onPause(f5z f5zVar) {
        }

        @Override // xsna.nhl
        public final void onResume(f5z f5zVar) {
        }
    }
}
