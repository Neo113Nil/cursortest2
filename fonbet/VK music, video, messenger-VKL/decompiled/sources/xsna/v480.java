package xsna;

import com.vk.im.engine.models.dialogs.DialogsFilter;

/* compiled from: OnDialogsFilterEnabledUpdateEvent.kt */
/* loaded from: classes2.dex */
public final class v480 extends sxp {
    public final Object b;
    public final DialogsFilter c;
    public final xpp<Boolean> d;

    public v480(Object obj, DialogsFilter dialogsFilter, xpp<Boolean> xppVar) {
        this.b = obj;
        this.c = dialogsFilter;
        this.d = xppVar;
    }

    @Override // xsna.sxp
    public final Object a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v480)) {
            return false;
        }
        v480 v480Var = (v480) obj;
        return epx.f(this.b, v480Var.b) && this.c == v480Var.c && epx.f(this.d, v480Var.d);
    }

    public final int hashCode() {
        Object obj = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31)) * 31);
    }

    public final String toString() {
        return "OnDialogsFilterEnabledUpdateEvent(changerTag=" + this.b + ", filter=" + this.c + ", enabled=" + this.d + ')';
    }
}
