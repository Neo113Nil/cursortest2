package yads;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.vec;

/* loaded from: classes10.dex */
public final class i82 {
    public final ej3 a;
    public final x62 b;
    public final double c;

    public /* synthetic */ i82(q62 q62Var, ej3 ej3Var) {
        this(ej3Var, new x62(q62Var));
    }

    public final void a(hm1 hm1Var) {
        if (hm1Var != null) {
            CheckBox muteControl = hm1Var.getMuteControl();
            if (muteControl != null) {
                muteControl.setOnClickListener(new vec(4, this, muteControl));
                muteControl.setVisibility(this.a.b ? 0 : 8);
            }
            ProgressBar videoProgress = hm1Var.getVideoProgress();
            if (videoProgress != null) {
                videoProgress.setVisibility(this.a.c ? 8 : 0);
            }
            TextView countDownProgress = hm1Var.getCountDownProgress();
            if (countDownProgress != null) {
                countDownProgress.setText("");
                countDownProgress.setVisibility(0);
            }
        }
    }

    public i82(ej3 ej3Var, x62 x62Var) {
        double d;
        this.a = ej3Var;
        this.b = x62Var;
        Double a = ej3Var.a();
        if (a != null) {
            a = (a.doubleValue() > ConnectivityTracker.DEFAULT_UPLINK_BITRATE ? 1 : (a.doubleValue() == ConnectivityTracker.DEFAULT_UPLINK_BITRATE ? 0 : -1)) == 0 ? null : a;
            if (a != null) {
                d = a.doubleValue();
                this.c = d;
            }
        }
        d = 1.0d;
        this.c = d;
    }

    public static final void a(i82 i82Var, CheckBox checkBox, View view) {
        double d = !checkBox.isChecked() ? i82Var.c : ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        x62 x62Var = i82Var.b;
        x62Var.getClass();
        x62Var.a.setVolume((float) d);
    }
}
