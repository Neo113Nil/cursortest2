package xsna;

import android.content.Context;

/* compiled from: SnackbarPushHelper.kt */
/* loaded from: classes.dex */
public final class v8k0 {
    public final Context a;
    public final a1w b;
    public io.reactivex.rxjava3.disposables.c c;

    public v8k0(Context context, a1w a1wVar) {
        this.a = context;
        this.b = a1wVar;
    }

    public final void a() {
        this.c = this.b.l.a().b0(ya80.class).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new qpe(new ppe(this, 2), 1));
    }
}
