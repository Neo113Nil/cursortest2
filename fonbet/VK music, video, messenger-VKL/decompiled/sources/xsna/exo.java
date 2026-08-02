package xsna;

import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.utils.EcoplateElementViewType;
import java.util.List;

/* compiled from: EcoplateLoadingVisibleFieldsConfig.kt */
/* loaded from: classes6.dex */
public final class exo {
    public static final List<EcoplateElementViewType> b;
    public static final exo c;
    public final List<EcoplateElementViewType> a;

    static {
        List<EcoplateElementViewType> l = e43.l(EcoplateElementViewType.AVATAR, EcoplateElementViewType.NAME, EcoplateElementViewType.INFO, EcoplateElementViewType.LK_BUTTON, EcoplateElementViewType.LOGOUT_BUTTON);
        b = l;
        c = new exo(l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public exo(List<? extends EcoplateElementViewType> list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof exo) && epx.f(this.a, ((exo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("EcoplateLoadingVisibleFieldsConfig(visibleFieldsList="), this.a);
    }
}
