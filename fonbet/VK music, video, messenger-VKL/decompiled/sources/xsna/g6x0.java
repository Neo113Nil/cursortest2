package xsna;

import android.content.Context;

/* compiled from: VoipVmojiViewController.kt */
/* loaded from: classes7.dex */
public final class g6x0 {
    public final Context a;
    public final v5x0 b;
    public final io.reactivex.rxjava3.subjects.f<q5x0> c = new io.reactivex.rxjava3.subjects.f<>();
    public final io.reactivex.rxjava3.disposables.c d;

    public g6x0(Context context, v5x0 v5x0Var) {
        this.a = context;
        this.b = v5x0Var;
        this.d = v5x0Var.g.subscribe(new v4r0(new hfv0(this, 8), 7));
    }
}
