package xsna;

import com.vk.superapp.bridges.dto.analytics.RefreshType;
import com.vk.superapp.bridges.dto.analytics.VkHealthProductType;
import com.vk.superapp.bridges.dto.analytics.VkSystemWidgetType;

/* compiled from: VkSystemWidgetRefreshEvent.kt */
/* loaded from: classes6.dex */
public final class cpv0 {
    public final VkHealthProductType a;
    public final VkSystemWidgetType b;
    public final RefreshType c;
    public final String d;

    public cpv0(VkHealthProductType vkHealthProductType, VkSystemWidgetType vkSystemWidgetType, RefreshType refreshType, String str) {
        this.a = vkHealthProductType;
        this.b = vkSystemWidgetType;
        this.c = refreshType;
        this.d = str;
    }

    public final String a() {
        return this.d;
    }

    public final VkHealthProductType b() {
        return this.a;
    }

    public final RefreshType c() {
        return this.c;
    }

    public final VkSystemWidgetType d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cpv0)) {
            return false;
        }
        cpv0 cpv0Var = (cpv0) obj;
        return this.a == cpv0Var.a && this.b == cpv0Var.b && this.c == cpv0Var.c && epx.f(this.d, cpv0Var.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 961;
        String str = this.d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkSystemWidgetRefreshEvent(productType=");
        sb.append(this.a);
        sb.append(", widgetType=");
        sb.append(this.b);
        sb.append(", refreshType=");
        sb.append(this.c);
        sb.append(", refer=null, errorDescription=");
        return ho8.a(sb, this.d, ')');
    }
}
