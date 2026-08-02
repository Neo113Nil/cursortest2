package yads;

import android.view.View;

/* loaded from: classes10.dex */
public final class pw implements View.OnClickListener {
    public final kz a;
    public final z30 b;

    public pw(kz kzVar, z30 z30Var) {
        this.a = kzVar;
        this.b = z30Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.e();
        this.b.a(y30.c);
    }
}
