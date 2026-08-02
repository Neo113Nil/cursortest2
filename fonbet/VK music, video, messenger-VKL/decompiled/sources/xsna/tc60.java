package xsna;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import kotlin.LazyThreadSafetyMode;

/* compiled from: NewsfeedAutoPlayScrollController.kt */
/* loaded from: classes4.dex */
public final class tc60 {
    public final dui a;
    public final Object b;
    public final Object c;
    public cqp d;
    public hbt0 e;

    /* compiled from: NewsfeedAutoPlayScrollController.kt */
    public static final class b implements f5z {
        public final Object b;

        public b(tc60 tc60Var) {
            this.b = msy.a(LazyThreadSafetyMode.NONE, new p6y(tc60Var, 13));
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.f5z
        public final Lifecycle getLifecycle() {
            return (Lifecycle) this.b.getValue();
        }
    }

    public tc60(mbs mbsVar, dui duiVar, tr60 tr60Var) {
        this.a = duiVar;
        w100 w100Var = new w100(this, 7);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = msy.a(lazyThreadSafetyMode, w100Var);
        this.c = msy.a(lazyThreadSafetyMode, new a040(this, 7));
        if (tr60Var.f) {
            mbsVar.a(new a(mbsVar));
        }
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void a(RecyclerView recyclerView) {
        cqp cqpVar = new cqp(recyclerView, new fr20(this, 5));
        this.d = cqpVar;
        hbt0 hbt0Var = new hbt0(recyclerView.getContext(), cqpVar, (androidx.lifecycle.m) this.b.getValue(), new uah0(0.1f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new b4r(21), 5), null, 131056);
        bbt0 bbt0Var = hbt0Var.o;
        bbt0Var.getClass();
        bbt0Var.e = hbt0Var.f.d();
        this.a.l(hbt0Var);
        this.e = hbt0Var;
    }

    public final void b() {
        hbt0 hbt0Var = this.e;
        if (hbt0Var != null) {
            this.a.m(hbt0Var);
            hbt0Var.u();
        }
        hbt0 hbt0Var2 = this.e;
        if (hbt0Var2 != null) {
            hbt0Var2.u();
        }
        this.e = null;
        cqp cqpVar = this.d;
        if (cqpVar != null) {
            ((WeakReference) cqpVar.d).clear();
        }
        this.d = null;
    }

    public final void c() {
        hbt0 hbt0Var = this.e;
        if (hbt0Var != null) {
            hbt0Var.v();
        }
    }

    public final void d() {
        hbt0 hbt0Var = this.e;
        if (hbt0Var != null) {
            hbt0Var.w();
        }
    }

    /* compiled from: NewsfeedAutoPlayScrollController.kt */
    public static final class a implements obs {
        public final /* synthetic */ mbs c;

        public a(mbs mbsVar) {
            this.c = mbsVar;
        }

        @Override // xsna.obs
        public final void onDestroy() {
            this.c.d(this);
        }

        @Override // xsna.obs
        public final void onDestroyView() {
            tc60.this.b();
        }

        @Override // xsna.obs
        public final void onPause() {
            hbt0 hbt0Var = tc60.this.e;
            if (hbt0Var != null) {
                hbt0Var.v();
            }
        }

        @Override // xsna.obs
        public final void onResume() {
            hbt0 hbt0Var = tc60.this.e;
            if (hbt0Var != null) {
                hbt0Var.w();
            }
        }

        @Override // xsna.obs
        public final void b() {
        }

        @Override // xsna.obs
        public final void c() {
        }

        @Override // xsna.obs
        public final void onStop() {
        }

        @Override // xsna.obs
        public final void onConfigurationChanged(Configuration configuration) {
        }

        @Override // xsna.obs
        public final void onCreate(Bundle bundle) {
        }

        @Override // xsna.obs
        public final void onActivityResult(int i, int i2, Intent intent) {
        }
    }
}
