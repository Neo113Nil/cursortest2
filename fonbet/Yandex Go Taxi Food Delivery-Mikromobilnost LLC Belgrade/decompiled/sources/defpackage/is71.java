package defpackage;

import android.content.Context;
import kotlinx.coroutines.CoroutineStart;
import yads.kc;

/* loaded from: classes7.dex */
public final class is71 {
    public static final Object d = new Object();
    public static volatile is71 e;
    public final gi81 a;
    public final vf71 b;
    public final qoh c;

    public is71(Context context) {
        hu71 hu71Var = new hu71();
        qhw0 a = jl40.a();
        sjh sjhVar = uyj.a;
        ike a2 = bvf0.a(cvw.U(a, mdh.b).plus(hu71Var));
        this.a = new gi81(context);
        this.b = new vf71();
        this.c = tje.h(a2, null, CoroutineStart.LAZY, new kc(this, null), 1);
    }
}
