package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;

/* compiled from: OnTypingFailedEvent.kt */
/* loaded from: classes2.dex */
public final class pc80 extends sxp {
    public final long b;
    public final VKApiExecutionException c;

    public pc80(long j, VKApiExecutionException vKApiExecutionException) {
        this.b = j;
        this.c = vKApiExecutionException;
    }

    @Override // xsna.sxp
    public final Object a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pc80)) {
            return false;
        }
        pc80 pc80Var = (pc80) obj;
        pc80Var.getClass();
        return this.b == pc80Var.b && epx.f(this.c, pc80Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "OnTypingFailedEvent(changerTag=null, dialogId=" + this.b + ", e=" + this.c + ')';
    }
}
