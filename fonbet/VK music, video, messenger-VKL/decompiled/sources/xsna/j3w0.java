package xsna;

import android.content.Context;
import com.vk.libdelayedjobs.WorkPolicy;
import com.vk.superapp.vkworkout.widget.api.di.VkWorkoutWidgetComponent;
import kotlin.coroutines.d;

/* compiled from: VkWorkoutWidgetSyncJob.kt */
/* loaded from: classes6.dex */
public final class j3w0 extends tsl implements w8i {
    public static final a e = new a();
    public final bpn0 c;
    public final hpj d;

    /* compiled from: VkWorkoutWidgetSyncJob.kt */
    public static final class a {
        public final String a() {
            return "j3w0";
        }

        public final void b(long j) {
            xgx0.a.getClass();
            xgx0.a("VkWorkoutWidgetSyncJob.setupNextUpdate() -> delayMillis: " + j + ' ');
            ((xsl) uh.b.b()).a("j3w0", new j3w0(new fyx()), new usl(WorkPolicy.REPLACE, j, 248));
        }
    }

    public j3w0(fyx fyxVar) {
        super(fyxVar);
        this.c = new bpn0(new fcs0(this, 8));
        this.d = zvj.a(d.a.a(whn0.a(), hqu0.a()));
    }

    @Override // xsna.tsl
    public final void a(Context context) {
        ((VkWorkoutWidgetComponent) this.c.getValue()).v5().g(context);
        myc0.h(this.d, null, null, new k3w0(2, null), 3);
    }
}
