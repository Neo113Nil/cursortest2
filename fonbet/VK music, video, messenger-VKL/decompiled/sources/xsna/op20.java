package xsna;

import android.content.Context;
import com.vk.dto.common.data.ApiApplication;

/* compiled from: MiniAppLaunchDto.kt */
/* loaded from: classes7.dex */
public final class op20 {
    public final ApiApplication a;
    public final Context b;
    public final mq20 c;
    public final iq20 d;
    public final aq20 e;

    public op20(ApiApplication apiApplication, Context context, mq20 mq20Var, iq20 iq20Var, aq20 aq20Var) {
        this.a = apiApplication;
        this.b = context;
        this.c = mq20Var;
        this.d = iq20Var;
        this.e = aq20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof op20)) {
            return false;
        }
        op20 op20Var = (op20) obj;
        return epx.f(this.a, op20Var.a) && epx.f(this.b, op20Var.b) && epx.f(this.c, op20Var.c) && epx.f(this.d, op20Var.d) && epx.f(this.e, op20Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "MiniAppLaunchDtoWithApp(app=" + this.a + ", context=" + this.b + ", urls=" + this.c + ", stat=" + this.d + ", params=" + this.e + ')';
    }

    public /* synthetic */ op20(ApiApplication apiApplication, Context context, mq20 mq20Var, iq20 iq20Var, aq20 aq20Var, int i) {
        this(apiApplication, context, (i & 4) != 0 ? new mq20((String) null, (String) null, (String) null, (String) null, 127, (String) null, (String) null) : mq20Var, (i & 8) != 0 ? new iq20(null, null, null, null, null, null, null, null, 255) : iq20Var, (i & 16) != 0 ? new aq20(null, null, null, null, null, null, null, false, null, false, 4095) : aq20Var);
    }
}
