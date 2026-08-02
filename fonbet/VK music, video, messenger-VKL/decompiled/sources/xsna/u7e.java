package xsna;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t0;
import com.vk.clips.sdk.shared.feed.recycler.adapter.ClipFeedAdapter;
import com.vk.clips.sdk.shared.viewer.experiments.models.ClipsFeedRecyclerPoolSettings;
import java.util.Collections;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.q7e;

/* compiled from: ClipsFeedListViewBuilder.kt */
/* loaded from: classes17.dex */
public final class u7e {
    public static final Object i = msy.a(LazyThreadSafetyMode.NONE, new cj4(6));
    public final p7e a;
    public final q7e b;
    public final mbs c;
    public final Context d;
    public final List<com.vk.stat.recycler.c> f;
    public final Object e = msy.a(LazyThreadSafetyMode.NONE, new in0(this, 24));
    public final bpn0 g = new bpn0(new z4(this, 28));
    public final bpn0 h = new bpn0(new mh(this, 29));

    /* compiled from: ClipsFeedListViewBuilder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipsFeedRecyclerPoolSettings.InflateMode.values().length];
            try {
                iArr[ClipsFeedRecyclerPoolSettings.InflateMode.ASYNC_EARLY_CONSUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipsFeedRecyclerPoolSettings.InflateMode.EARLY_NON_BLOCKING_CONSUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: ClipsFeedListViewBuilder.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<RecyclerView.e0, Boolean> {
        @Override // xsna.izs
        public final Boolean invoke(RecyclerView.e0 e0Var) {
            boolean z;
            RecyclerView.e0 e0Var2 = e0Var;
            u7e u7eVar = (u7e) this.receiver;
            Object obj = u7e.i;
            u7eVar.getClass();
            if (e0Var2.getItemViewType() == ClipFeedAdapter.ViewType.CLIP_CONTROLS.ordinal() || e0Var2.getItemViewType() == ClipFeedAdapter.ViewType.ADS_CONTROLS.ordinal()) {
                i0q0.f(new nh3(6, u7eVar, e0Var2));
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    public u7e(p7e p7eVar, q7e q7eVar, mbs mbsVar, Context context) {
        this.a = p7eVar;
        this.b = q7eVar;
        this.c = mbsVar;
        this.d = context;
        this.f = Collections.singletonList(new com.vk.stat.recycler.c(q7eVar.s.b, "clips_feed"));
        mbsVar.a(new c());
    }

    /* compiled from: ClipsFeedListViewBuilder.kt */
    public static final class c implements obs {
        public boolean b;

        public c() {
        }

        @Override // xsna.obs
        public final void onCreate(Bundle bundle) {
            this.b = true;
            ((androidx.recyclerview.widget.t0) u7e.this.g.getValue()).d.m();
        }

        @Override // xsna.obs
        public final void onDestroy() {
            u7e u7eVar = u7e.this;
            androidx.recyclerview.widget.t0 t0Var = (androidx.recyclerview.widget.t0) u7eVar.g.getValue();
            t0Var.b.b(t0Var.c);
            c63 c63Var = t0Var.a.g;
            t0.c cVar = t0Var.e;
            c63Var.getClass();
            c63.c(cVar);
            t0Var.d.r();
            u7eVar.c.d(this);
            if (this.b) {
                return;
            }
            q7e.e eVar = u7eVar.b.s;
            com.vk.metrics.eventtracking.b.a.q(new IllegalStateException("onCreate was not called, prefetching is likely to be broken"));
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
        public final void onPause() {
        }

        @Override // xsna.obs
        public final void onResume() {
        }

        @Override // xsna.obs
        public final void onStop() {
        }

        @Override // xsna.obs
        public final void onConfigurationChanged(Configuration configuration) {
        }

        @Override // xsna.obs
        public final void onActivityResult(int i, int i2, Intent intent) {
        }
    }
}
