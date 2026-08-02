package defpackage;

import android.widget.ProgressBar;
import android.widget.TextView;
import java.util.Arrays;
import java.util.Locale;
import yads.lh2;
import yads.t52;

/* loaded from: classes7.dex */
public final class fv81 implements z971 {
    public final yp61 a;
    public final ky71 b;
    public final s081 c;

    public fv81(yp61 yp61Var) {
        ky71 ky71Var = new ky71();
        s081 s081Var = new s081();
        this.a = yp61Var;
        this.b = ky71Var;
        this.c = s081Var;
    }

    @Override // defpackage.z971
    public final void c(long j, long j2) {
        t52 t52Var = (t52) this.a.d();
        if (t52Var != null) {
            x071 x071Var = t52Var.c.b;
            ProgressBar videoProgress = x071Var != null ? x071Var.getVideoProgress() : null;
            if (videoProgress != null) {
                this.b.getClass();
                videoProgress.clearAnimation();
                if (j > 0) {
                    videoProgress.setMax((int) j);
                    lh2 lh2Var = new lh2(videoProgress, videoProgress.getProgress(), (int) j2);
                    lh2Var.setDuration(200L);
                    videoProgress.startAnimation(lh2Var);
                }
            }
            x071 x071Var2 = t52Var.c.b;
            TextView countDownProgress = x071Var2 != null ? x071Var2.getCountDownProgress() : null;
            if (countDownProgress != null) {
                qi81 qi81Var = this.c.a;
                long ceil = (long) Math.ceil((j - j2) / 1000.0f);
                countDownProgress.setText(String.format(Locale.US, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(ceil / 60), Long.valueOf(ceil % 60)}, 2)));
            }
        }
    }
}
