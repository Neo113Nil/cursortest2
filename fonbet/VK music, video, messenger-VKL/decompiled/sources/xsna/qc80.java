package xsna;

import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;

/* compiled from: CatalogAnalyticsEvent.kt */
@ozl
/* loaded from: classes16.dex */
public final class qc80 implements u0a {
    public final UIBlockPlaceholder a;
    public final boolean b;

    public qc80(UIBlockPlaceholder uIBlockPlaceholder, boolean z) {
        this.a = uIBlockPlaceholder;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qc80)) {
            return false;
        }
        qc80 qc80Var = (qc80) obj;
        return epx.f(this.a, qc80Var.a) && this.b == qc80Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnUserInteractedWithNotificationEvent(uiBlock=");
        sb.append(this.a);
        sb.append(", isUserClosedNotification=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
