package xsna;

import android.view.View;

/* compiled from: ChatProfileTabItem.kt */
/* loaded from: classes2.dex */
public final class sxb {
    public final txb a;
    public View b;

    public sxb(txb txbVar) {
        this.a = txbVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof sxb) && ((sxb) obj).a == this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
