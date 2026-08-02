package xsna;

import android.content.Context;

/* compiled from: MiniAppLaunchDto.kt */
/* loaded from: classes7.dex */
public final class np20 {
    public final int a;
    public final Context b;
    public final mq20 c;
    public final iq20 d;
    public final aq20 e;

    public np20(int i, Context context, mq20 mq20Var, iq20 iq20Var, aq20 aq20Var) {
        this.a = i;
        this.b = context;
        this.c = mq20Var;
        this.d = iq20Var;
        this.e = aq20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof np20)) {
            return false;
        }
        np20 np20Var = (np20) obj;
        return this.a == np20Var.a && epx.f(this.b, np20Var.b) && epx.f(this.c, np20Var.c) && epx.f(this.d, np20Var.d) && epx.f(this.e, np20Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "MiniAppLaunchDto(appId=" + this.a + ", context=" + this.b + ", urls=" + this.c + ", stat=" + this.d + ", params=" + this.e + ')';
    }

    public /* synthetic */ np20(int i, Context context, mq20 mq20Var, iq20 iq20Var, aq20 aq20Var, int i2) {
        this(i, context, (i2 & 4) != 0 ? new mq20((String) null, (String) null, (String) null, (String) null, 127, (String) null, (String) null) : mq20Var, (i2 & 8) != 0 ? new iq20(null, null, null, null, null, null, null, null, 255) : iq20Var, (i2 & 16) != 0 ? new aq20(null, null, null, null, null, null, null, false, null, false, 4095) : aq20Var);
    }
}
