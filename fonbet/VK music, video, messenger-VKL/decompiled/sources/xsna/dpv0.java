package xsna;

import com.vk.superapp.bridges.dto.analytics.VkHealthProductType;
import com.vk.superapp.bridges.dto.analytics.VkSystemWidgetType;

/* compiled from: VkSystemWidgetRemoveEvent.kt */
/* loaded from: classes6.dex */
public final class dpv0 {
    public final VkHealthProductType a;
    public final VkSystemWidgetType b;

    public dpv0(VkHealthProductType vkHealthProductType, VkSystemWidgetType vkSystemWidgetType) {
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
        if (!(obj instanceof dpv0)) {
            return false;
        }
        dpv0 dpv0Var = (dpv0) obj;
        return this.a == dpv0Var.a && this.b == dpv0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "VkSystemWidgetRemoveEvent(productType=" + this.a + ", widgetType=" + this.b + ')';
    }
}
