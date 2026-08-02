package defpackage;

import com.yandex.plus.home.feature.panel.internal.stub.PlusPanelStubShortcutConfig$WidthType;

/* loaded from: classes2.dex */
public final class n7d0 {
    public final PlusPanelStubShortcutConfig$WidthType a;
    public final int b;

    public n7d0(PlusPanelStubShortcutConfig$WidthType plusPanelStubShortcutConfig$WidthType, int i) {
        this.a = plusPanelStubShortcutConfig$WidthType;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n7d0)) {
            return false;
        }
        n7d0 n7d0Var = (n7d0) obj;
        return this.a == n7d0Var.a && this.b == n7d0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlusPanelStubShortcutConfig(widthType=");
        sb.append(this.a);
        sb.append(", height=");
        return oyr.s(sb, this.b, ')');
    }
}
