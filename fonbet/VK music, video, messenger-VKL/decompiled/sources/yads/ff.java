package yads;

import android.widget.ProgressBar;

/* loaded from: classes10.dex */
public final class ff {
    public static void a(ProgressBar progressBar, long j, long j2) {
        progressBar.clearAnimation();
        if (j > 0) {
            progressBar.setMax((int) j);
            fk2 fk2Var = new fk2(progressBar, progressBar.getProgress(), (int) j2);
            fk2Var.setDuration(200L);
            progressBar.startAnimation(fk2Var);
        }
    }
}
