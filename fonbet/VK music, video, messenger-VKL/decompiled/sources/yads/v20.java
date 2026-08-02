package yads;

import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import xsna.epx;

/* loaded from: classes10.dex */
public final class v20 implements hm1 {
    public final CheckBox a;
    public final ProgressBar b;
    public final TextView c;

    public v20(CheckBox checkBox, ProgressBar progressBar, TextView textView) {
        this.a = checkBox;
        this.b = progressBar;
        this.c = textView;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v20)) {
            return false;
        }
        v20 v20Var = (v20) obj;
        return epx.f(this.a, v20Var.a) && epx.f(this.b, v20Var.b) && epx.f(this.c, v20Var.c);
    }

    @Override // yads.hm1
    public final TextView getCountDownProgress() {
        return this.c;
    }

    @Override // yads.hm1
    public final CheckBox getMuteControl() {
        return this.a;
    }

    @Override // yads.hm1
    public final ProgressBar getVideoProgress() {
        return this.b;
    }

    public final int hashCode() {
        CheckBox checkBox = this.a;
        int hashCode = (checkBox == null ? 0 : checkBox.hashCode()) * 31;
        ProgressBar progressBar = this.b;
        int hashCode2 = (hashCode + (progressBar == null ? 0 : progressBar.hashCode())) * 31;
        TextView textView = this.c;
        return hashCode2 + (textView != null ? textView.hashCode() : 0);
    }

    public final String toString() {
        return "CustomControlsContainer(muteControl=" + this.a + ", videoProgress=" + this.b + ", countDownProgress=" + this.c + ")";
    }
}
