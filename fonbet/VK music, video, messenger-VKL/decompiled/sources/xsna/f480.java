package xsna;

import com.vk.dto.common.DialogBackground;

/* compiled from: OnDialogBackgroundsChangeEvent.kt */
/* loaded from: classes2.dex */
public final class f480 extends sxp {
    public final Object b;
    public final DialogBackground c;

    public f480(Object obj, DialogBackground dialogBackground) {
        this.b = obj;
        this.c = dialogBackground;
    }

    @Override // xsna.sxp
    public final Object a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f480)) {
            return false;
        }
        f480 f480Var = (f480) obj;
        return epx.f(this.b, f480Var.b) && epx.f(this.c, f480Var.c);
    }

    public final int hashCode() {
        Object obj = this.b;
        return this.c.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "OnDialogBackgroundsChangeEvent(changerTag=" + this.b + ", background=" + this.c + ')';
    }
}
