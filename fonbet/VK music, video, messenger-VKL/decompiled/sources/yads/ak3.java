package yads;

import android.widget.ProgressBar;
import android.widget.TextView;

/* loaded from: classes10.dex */
public final class ak3 implements ug3 {
    public final hl3 a;
    public final ff b;
    public final a20 c;

    public /* synthetic */ ak3(hl3 hl3Var) {
        this(hl3Var, new ff(), new a20());
    }

    @Override // yads.ug3
    public final void a(long j, long j2) {
        g82 g82Var = (g82) this.a.b();
        if (g82Var != null) {
            hm1 hm1Var = g82Var.c.b;
            ProgressBar videoProgress = hm1Var != null ? hm1Var.getVideoProgress() : null;
            if (videoProgress != null) {
                this.b.getClass();
                ff.a(videoProgress, j, j2);
            }
            hm1 hm1Var2 = g82Var.c.b;
            TextView countDownProgress = hm1Var2 != null ? hm1Var2.getCountDownProgress() : null;
            if (countDownProgress != null) {
                this.c.a.getClass();
                countDownProgress.setText(pk2.a(j - j2));
            }
        }
    }

    public ak3(hl3 hl3Var, ff ffVar, a20 a20Var) {
        this.a = hl3Var;
        this.b = ffVar;
        this.c = a20Var;
    }
}
