package xsna;

import com.vk.im.engine.models.InfoBar;

/* compiled from: OnDialogsListInfoBarUpdateEvent.kt */
/* loaded from: classes2.dex */
public final class m580 extends sxp {
    public final boolean b;
    public final InfoBar c;

    public m580(boolean z, InfoBar infoBar) {
        this.b = z;
        this.c = infoBar;
    }

    @Override // xsna.sxp
    public final Object a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m580)) {
            return false;
        }
        m580 m580Var = (m580) obj;
        return this.b == m580Var.b && epx.f(this.c, m580Var.c);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.b) * 31;
        InfoBar infoBar = this.c;
        return hashCode + (infoBar == null ? 0 : infoBar.hashCode());
    }

    public final String toString() {
        return "OnDialogsListInfoBarUpdateEvent(fromLocalAction=" + this.b + ", infoBar=" + this.c + ')';
    }
}
