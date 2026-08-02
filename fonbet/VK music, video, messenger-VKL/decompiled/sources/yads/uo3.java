package yads;

import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import xsna.qcy;

/* loaded from: classes10.dex */
public final class uo3 implements hm1 {
    public final z22 a;

    public uo3(z22 z22Var) {
        this.a = z22Var;
    }

    @Override // yads.hm1
    public final TextView getCountDownProgress() {
        return null;
    }

    @Override // yads.hm1
    public final CheckBox getMuteControl() {
        mn2 mn2Var = this.a.c;
        qcy qcyVar = z22.g[2];
        return (CheckBox) mn2Var.a.get();
    }

    @Override // yads.hm1
    public final ProgressBar getVideoProgress() {
        mn2 mn2Var = this.a.d;
        qcy qcyVar = z22.g[3];
        return (ProgressBar) mn2Var.a.get();
    }
}
