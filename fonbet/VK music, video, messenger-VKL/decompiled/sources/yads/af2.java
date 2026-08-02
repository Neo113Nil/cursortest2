package yads;

import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;

/* loaded from: classes10.dex */
public final class af2 implements ig3 {
    public ig3 a;
    public final /* synthetic */ bf2 b;

    public af2(bf2 bf2Var) {
        this.b = bf2Var;
    }

    @Override // yads.ig3
    public final void a() {
        ig3 ig3Var = this.a;
        if (ig3Var != null) {
            ig3Var.a();
        }
    }

    @Override // yads.ig3
    public final void b() {
        g82 g82Var = (g82) this.b.a.b();
        if (g82Var != null) {
            o62 o62Var = g82Var.c;
            i82 i82Var = this.b.c;
            hm1 hm1Var = o62Var.b;
            i82Var.getClass();
            if (hm1Var != null) {
                CheckBox muteControl = hm1Var.getMuteControl();
                if (muteControl != null) {
                    muteControl.setOnClickListener(null);
                    muteControl.setVisibility(8);
                }
                ProgressBar videoProgress = hm1Var.getVideoProgress();
                if (videoProgress != null) {
                    videoProgress.setProgress(0);
                    videoProgress.setVisibility(8);
                }
                TextView countDownProgress = hm1Var.getCountDownProgress();
                if (countDownProgress != null) {
                    countDownProgress.setText("");
                    countDownProgress.setVisibility(8);
                }
            }
        }
        ig3 ig3Var = this.a;
        if (ig3Var != null) {
            ig3Var.b();
        }
    }

    @Override // yads.ig3
    public final void c() {
        g82 g82Var = (g82) this.b.a.b();
        if (g82Var != null) {
            this.b.d.a(g82Var);
        }
        ig3 ig3Var = this.a;
        if (ig3Var != null) {
            ig3Var.c();
        }
    }
}
