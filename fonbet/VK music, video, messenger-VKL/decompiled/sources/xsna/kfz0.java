package xsna;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class kfz0 extends LinearLayout {
    public final vbz0 b;
    public final auy0 c;
    public final auy0 d;
    public final ujz0 e;

    public kfz0(Context context) {
        super(context);
        setOrientation(1);
        this.e = new ujz0(context);
        LinearLayout a = io.reactivex.rxjava3.internal.operators.observable.q1.a(0, context);
        auy0 a2 = a(context);
        this.c = a2;
        c1z0.n(a2, "video_control_button");
        a.addView(a2);
        auy0 a3 = a(context);
        this.d = a3;
        c1z0.n(a3, "sound_control_button");
        a.addView(a3);
        addView(a);
        vbz0 vbz0Var = new vbz0(context);
        this.b = vbz0Var;
        c1z0.n(vbz0Var, "progress_view");
        addView(vbz0Var);
    }

    public final auy0 a(Context context) {
        auy0 auy0Var = new auy0(context);
        int i = ujz0.A;
        ujz0 ujz0Var = this.e;
        auy0Var.setLayoutParams(new LinearLayout.LayoutParams(ujz0Var.a.get(i), ujz0Var.a.get(ujz0.C)));
        return auy0Var;
    }

    @NonNull
    public paz0 getProgressView() {
        return this.b;
    }

    @NonNull
    public auy0 getSoundControlButton() {
        return this.d;
    }

    @NonNull
    public auy0 getVideoControlButton() {
        return this.c;
    }
}
