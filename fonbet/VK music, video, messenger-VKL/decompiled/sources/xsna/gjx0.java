package xsna;

import android.app.Activity;
import com.vk.core.util.parallelrunner.ParallelTaskRunner;
import com.vk.log.L;

/* compiled from: WebViewPoolPrepareTask.kt */
/* loaded from: classes11.dex */
public final class gjx0 extends ParallelTaskRunner.d {
    @Override // com.vk.core.util.parallelrunner.ParallelTaskRunner.d
    public final String a() {
        return "WebViewPoolPrepare";
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        c63 c63Var = c63.a;
        final Activity b = c63.b();
        if (b != null) {
            b.runOnUiThread(new Runnable() { // from class: xsna.fjx0
                @Override // java.lang.Runnable
                public final void run() {
                    ((s1w0) jgn0.d.getValue()).a(b);
                }
            });
        } else {
            L.e("WebViewPoolPrepare", "last activity is null");
        }
        return s3q0.a;
    }
}
