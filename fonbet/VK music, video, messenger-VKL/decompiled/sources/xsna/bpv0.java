package xsna;

import com.vk.superapp.bridges.dto.analytics.VkHealthProductType;
import com.vk.superapp.bridges.dto.analytics.VkSystemWidgetType;

/* compiled from: VkSystemWidgetAddEvent.kt */
/* loaded from: classes6.dex */
public final class bpv0 {
    public final VkHealthProductType a;
    public final VkSystemWidgetType b;

    public bpv0(VkHealthProductType vkHealthProductType, VkSystemWidgetType vkSystemWidgetType) {
        this.a = vkHealthProductType;
        this.b = vkSystemWidgetType;
    }

    public final VkHealthProductType a() {
        return this.a;
    }

    public final VkSystemWidgetType b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bpv0)) {
            return false;
        }
        bpv0 bpv0Var = (bpv0) obj;
        return this.a == bpv0Var.a && this.b == bpv0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "VkSystemWidgetAddEvent(productType=" + this.a + ", widgetType=" + this.b + ')';
    }
}
