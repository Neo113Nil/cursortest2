package xsna;

import com.vk.im.engine.models.dialogs.Dialog;

/* compiled from: OnDialogUpdateEvent.kt */
/* loaded from: classes2.dex */
public final class r480 extends sxp {
    public final Object b;
    public final wpp<Long, Dialog> c;

    public r480(Object obj, wpp<Long, Dialog> wppVar) {
        this.b = obj;
        this.c = wppVar;
    }

    @Override // xsna.sxp
    public final Object a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r480)) {
            return false;
        }
        r480 r480Var = (r480) obj;
        return epx.f(this.b, r480Var.b) && epx.f(this.c, r480Var.c);
    }

    public final int hashCode() {
        Object obj = this.b;
        return this.c.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "OnDialogUpdateEvent(changerTag=" + this.b + ", dialogs=" + this.c + ')';
    }
}
