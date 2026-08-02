package xsna;

import android.content.Context;
import com.vk.core.apps.BuildInfo;
import com.vk.core.util.parallelrunner.ParallelTaskRunner;
import com.vk.toggle.Features;
import com.vk.toggle.b;
import com.vkontakte.android.VKApplication;
import org.json.JSONObject;
import xsna.rrw;

/* compiled from: InitInAppReviewTaskLogic.kt */
/* loaded from: classes11.dex */
public final class qyw extends ParallelTaskRunner.d {
    @Override // com.vk.core.util.parallelrunner.ParallelTaskRunner.d
    public final String a() {
        return "in-app-review";
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        JSONObject g;
        boolean k;
        bpn0 bpn0Var = rrw.a;
        this.b.registerActivityLifecycleCallbacks(new rrw.a());
        rrw.b = true;
        bpn0 bpn0Var2 = trw.a;
        r3y.a("vmojiConstructorClick", new a43(2));
        r3y.a("vmoji_character_recereate", new o8r(1));
        b.d i = com.vk.toggle.b.A.i(Features.Type.FEATURE_IN_APP_REVIEW);
        if (i != null && (g = i.g()) != null) {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            if (BuildInfo.h()) {
                VKApplication vKApplication = com.vk.core.apps.a.a;
                k = BuildInfo.k();
            } else {
                VKApplication vKApplication2 = com.vk.core.apps.a.a;
                k = BuildInfo.l(context, "com.huawei.appmarket");
            }
            final nyw nywVar = new nyw(g, k);
            if (k) {
                nywVar.invoke();
            } else {
                wvv.b(wvv.a, new Runnable() { // from class: xsna.oyw
                    @Override // java.lang.Runnable
                    public final void run() {
                        nyw.this.invoke();
                    }
                }, 0L, 0L, 14);
            }
        }
        return s3q0.a;
    }
}
