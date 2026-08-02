package xsna;

import android.content.Context;
import android.view.View;
import com.vkontakte.android.R;
import xsna.p2x0;

/* compiled from: VoipToolTipHelper.kt */
/* loaded from: classes7.dex */
public final class q2x0 {
    public final Context a;
    public final String b;
    public final int c;
    public final p2x0 d;
    public final s2x0 e;

    public /* synthetic */ q2x0(Context context, String str, int i, r2x0 r2x0Var, View view, int i2) {
        this(context, str, i, r2x0Var, R.color.vk_white, R.color.vk_tip_background, 5000L, view);
    }

    public final void a() {
        String string = this.a.getString(this.c);
        p2x0 p2x0Var = this.d;
        p2x0Var.getClass();
        p2x0Var.c.onNext(new p2x0.b.C3489b(this.b, string));
    }

    public q2x0(Context context, String str, int i, t2x0 t2x0Var, int i2, int i3, long j, View view) {
        this.a = context;
        this.b = str;
        this.c = i;
        p2x0 p2x0Var = new p2x0(t2x0Var);
        this.d = p2x0Var;
        this.e = new s2x0(context, p2x0Var, i2, i3, j, view);
    }
}
