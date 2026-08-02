package xsna;

import android.content.Context;
import android.os.Build;
import kotlin.LazyThreadSafetyMode;

/* compiled from: DatingScreenshotDelegate.kt */
/* loaded from: classes6.dex */
public final class w1l {
    public final Context a;
    public final i8n0 b;
    public final prq0 c;
    public final wmd0 d;
    public final boolean e;
    public final boolean f;
    public final Object g;
    public final v1l h;

    public w1l() {
        throw null;
    }

    public w1l(Context context, i8n0 i8n0Var, prq0 prq0Var, wmd0 wmd0Var) {
        this.a = context;
        this.b = i8n0Var;
        this.c = prq0Var;
        this.d = wmd0Var;
        this.e = true;
        this.f = Build.VERSION.SDK_INT < 34;
        this.g = msy.a(LazyThreadSafetyMode.NONE, new xqf(this, 12));
        this.h = new v1l(this);
    }
}
