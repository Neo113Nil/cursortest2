package xsna;

import com.vk.im.engine.models.InfoBar;

/* compiled from: DialogsListInfoBarHideResult.kt */
/* loaded from: classes2.dex */
public final class xsm {
    public final InfoBar a;

    public xsm(InfoBar infoBar) {
        this.a = infoBar;
    }

    public final InfoBar a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xsm) && epx.f(this.a, ((xsm) obj).a);
    }

    public final int hashCode() {
        InfoBar infoBar = this.a;
        if (infoBar == null) {
            return 0;
        }
        return infoBar.hashCode();
    }

    public final String toString() {
        return "DialogsListInfoBarHideResult(value=" + this.a + ')';
    }
}
