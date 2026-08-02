package com.yandex.div.core.view2;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.l;
import com.yandex.div.core.expression.RuntimeStoreProvider;
import com.yandex.div.core.view2.ReleaseManager;
import com.yandex.div.internal.Log;
import java.util.HashMap;
import java.util.Set;
import xsna.f5z;
import xsna.gqo;
import xsna.izi0;
import xsna.s3q0;
import xsna.zcl;

/* compiled from: ReleaseManager.kt */
/* loaded from: classes7.dex */
public class ReleaseManager {
    public static final Companion Companion = new Companion(null);
    private final HashMap<f5z, Set<Div2View>> divToRelease = new HashMap<>();
    private final Object monitor = new Object();
    private final l observer = new l() { // from class: xsna.htf0
        @Override // androidx.lifecycle.l
        public final void onStateChanged(f5z f5zVar, Lifecycle.Event event) {
            ReleaseManager.observer$lambda$2(ReleaseManager.this, f5zVar, event);
        }
    };
    private final RuntimeStoreProvider runtimeStoreProvider;

    /* compiled from: ReleaseManager.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: ReleaseManager.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ReleaseManager(RuntimeStoreProvider runtimeStoreProvider) {
        this.runtimeStoreProvider = runtimeStoreProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object addLifecycleListener(f5z f5zVar, Div2View div2View) {
        Object obj;
        synchronized (this.monitor) {
            try {
                if (this.divToRelease.containsKey(f5zVar)) {
                    Set<Div2View> set = this.divToRelease.get(f5zVar);
                    obj = set != null ? Boolean.valueOf(set.add(div2View)) : null;
                } else {
                    this.divToRelease.put(f5zVar, izi0.i(div2View));
                    f5zVar.getLifecycle().addObserver(this.observer);
                    obj = s3q0.a;
                }
            } finally {
            }
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observer$lambda$2(ReleaseManager releaseManager, f5z f5zVar, Lifecycle.Event event) {
        synchronized (releaseManager.monitor) {
            try {
                if (WhenMappings.$EnumSwitchMapping$0[event.ordinal()] == 1) {
                    Set<Div2View> set = releaseManager.divToRelease.get(f5zVar);
                    if (set != null) {
                        for (Div2View div2View : set) {
                            div2View.cleanup();
                            releaseManager.runtimeStoreProvider.cleanupRuntime$div_release(div2View);
                        }
                    }
                    releaseManager.divToRelease.remove(f5zVar);
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void observeDivLifecycle(final Div2View div2View) {
        f5z lifecycleOwner$div_release = div2View.getContext$div_release().getLifecycleOwner$div_release();
        if (lifecycleOwner$div_release != null) {
            addLifecycleListener(lifecycleOwner$div_release, div2View);
            return;
        }
        if (!div2View.isAttachedToWindow()) {
            div2View.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.div.core.view2.ReleaseManager$observeDivLifecycle$$inlined$doOnAttach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                    div2View.removeOnAttachStateChangeListener(this);
                    f5z e = gqo.e(div2View);
                    if (e != null) {
                        this.addLifecycleListener(e, div2View);
                    } else {
                        Log.w("ReleaseManager", "Attempt to bind a Div2View, which has no LifecycleOwner. Release event will not be caught! If you're using some long-lived resources, like a video player, call cleanup explicitly when you don't need Div2View anymore");
                    }
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                }
            });
            return;
        }
        f5z e = gqo.e(div2View);
        if (e != null) {
            addLifecycleListener(e, div2View);
        } else {
            Log.w("ReleaseManager", "Attempt to bind a Div2View, which has no LifecycleOwner. Release event will not be caught! If you're using some long-lived resources, like a video player, call cleanup explicitly when you don't need Div2View anymore");
        }
    }
}
