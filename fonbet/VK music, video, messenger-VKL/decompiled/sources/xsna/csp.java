package xsna;

import android.content.Context;
import com.vk.media.pipeline.CancelException;
import xsna.ppa0;

/* compiled from: Env.kt */
/* loaded from: classes3.dex */
public final class csp {
    public final Context a;
    public final jpa0 b;
    public final ppa0.a c;
    public final f100 d;

    public csp(Context context, jpa0 jpa0Var, ppa0.a aVar, f100 f100Var) {
        this.a = context;
        this.b = jpa0Var;
        this.c = aVar;
        this.d = f100Var;
    }

    public final void a(String str) {
        if (((Boolean) this.c.get()).booleanValue()) {
            throw new CancelException(str);
        }
    }
}
