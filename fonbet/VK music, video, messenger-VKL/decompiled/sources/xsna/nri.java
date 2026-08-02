package xsna;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.os.Trace;
import androidx.compose.ui.platform.ComposeView;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import com.vk.toggle.features.CoreFeatures;
import kotlin.Result;
import xsna.c63;

/* compiled from: ComposeWarmupTask.kt */
/* loaded from: classes11.dex */
public final class nri implements gzs<s3q0> {

    /* compiled from: ComposeWarmupTask.kt */
    /* loaded from: classes7.dex */
    public static final class a implements vvi {
        public final vvi[] a;

        public a(vvi... vviVarArr) {
            this.a = vviVarArr;
        }

        @Override // xsna.vvi
        public final boolean a() {
            for (int i = 0; i < 2; i++) {
                if (this.a[i].a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // xsna.vvi
        public final void b(int i, int i2, int i3, String str) {
            for (int i4 = 0; i4 < 2; i4++) {
                vvi vviVar = this.a[i4];
                if (vviVar.a()) {
                    vviVar.b(i, i2, i3, str);
                }
            }
        }

        @Override // xsna.vvi
        public final void c() {
            for (int i = 0; i < 2; i++) {
                vvi vviVar = this.a[i];
                if (vviVar.a()) {
                    vviVar.c();
                }
            }
        }
    }

    /* compiled from: ComposeWarmupTask.kt */
    /* loaded from: classes7.dex */
    public static final class b implements vvi {
        public final boolean a;
        public boolean b;
        public boolean c;
        public long d;
        public long e;
        public long f;
        public long g;

        public b(boolean z) {
            this.a = z;
        }

        @Override // xsna.vvi
        public final boolean a() {
            return !this.c;
        }

        @Override // xsna.vvi
        public final void b(int i, int i2, int i3, String str) {
            long j = this.e + 1;
            this.e = j;
            this.f++;
            this.g = Math.max(j, this.g);
            if (this.b) {
                return;
            }
            this.b = true;
            this.d = SystemClock.elapsedRealtime();
        }

        @Override // xsna.vvi
        public final void c() {
            if (this.b) {
                long j = this.e - 1;
                this.e = j;
                if (j == 0) {
                    this.c = true;
                    int elapsedRealtime = (int) (SystemClock.elapsedRealtime() - this.d);
                    l5m l5mVar = new l5m(null, null, 3);
                    String h = DevNullEventKey.COMPOSE_START_TIME.h();
                    int i = (int) this.f;
                    int i2 = (int) this.g;
                    UiTracker uiTracker = UiTracker.a;
                    l5mVar.g = new SchemeStat$TypeDevNullItem(h, null, UiTracker.d(), Integer.valueOf(elapsedRealtime), null, Integer.valueOf(this.a ? 1 : 0), null, Integer.valueOf(i), null, Integer.valueOf(i2), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -686, 3, null);
                    l5mVar.q();
                }
            }
        }
    }

    /* compiled from: ComposeWarmupTask.kt */
    public static final class c implements vvi {
        public static final c a = new c();

        @Override // xsna.vvi
        public final boolean a() {
            return false;
        }

        @Override // xsna.vvi
        public final void b(int i, int i2, int i3, String str) {
            Trace.beginSection(ndp0.f(str));
        }

        @Override // xsna.vvi
        public final void c() {
            Trace.endSection();
        }
    }

    /* compiled from: ComposeWarmupTask.kt */
    /* loaded from: classes7.dex */
    public static final class d extends c63.b {
        public final n8 b;

        public d(n8 n8Var) {
            this.b = n8Var;
        }

        @Override // xsna.c63.b
        public final void p(Activity activity) {
            c63 c63Var = c63.a;
            c63.c(this);
            this.b.invoke(activity);
        }
    }

    public nri() {
        androidx.compose.runtime.b.a = c.a;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        Object failure;
        try {
            CoreFeatures coreFeatures = CoreFeatures.COMPOSE_START_STAT;
            coreFeatures.getClass();
            if (com.vk.toggle.b.A.a(coreFeatures)) {
                wqi b2 = com.vk.toggle.d.p.b();
                if (b2 == null) {
                    wqi.d.getClass();
                    b2 = wqi.e;
                }
                if (b2.a) {
                    Context context = e43.a;
                    if (context == null) {
                        context = null;
                    }
                    new ComposeView(context, null, 6);
                }
                if (b2.b) {
                    ((zak0) androidx.compose.runtime.k.b(Boolean.FALSE)).setValue(Boolean.TRUE);
                }
                if (b2.c) {
                    c63 c63Var = c63.a;
                    Activity b3 = c63.b();
                    if (b3 != null) {
                        a94 a94Var = new a94(9, this, b3);
                        if (i0q0.b()) {
                            a94Var.invoke();
                        } else {
                            i0q0.f(a94Var);
                        }
                    } else {
                        c63.a(new d(new n8(this)));
                    }
                } else if (!androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.a = new a(c.a, new b(false));
                }
            }
            failure = s3q0.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        Throwable a2 = Result.a(failure);
        if (a2 != null) {
            bVar.a(a2);
        }
        return s3q0.a;
    }
}
