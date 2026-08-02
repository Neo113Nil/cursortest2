package xsna;

import android.content.Context;
import kotlin.LazyThreadSafetyMode;

/* compiled from: ActionLocalRepositoryImpl.kt */
/* loaded from: classes.dex */
public final class v30 {
    public final Context a;
    public final h00 b;
    public final io.reactivex.rxjava3.subjects.f<b70> c = new io.reactivex.rxjava3.subjects.f<>();
    public final io.reactivex.rxjava3.core.w d = io.reactivex.rxjava3.schedulers.a.c();
    public final Object e = msy.a(LazyThreadSafetyMode.NONE, new r30(this, 0));

    public v30(Context context, h00 h00Var) {
        this.a = context;
        this.b = h00Var;
    }

    public final io.reactivex.rxjava3.internal.operators.completable.y a(x60 x60Var) {
        return io.reactivex.rxjava3.core.a.l(new o30(0, this, x60Var)).q(this.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final y60 b() {
        return (y60) this.e.getValue();
    }
}
