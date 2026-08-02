package xsna;

import com.vk.core.view.components.counter.VkCounter;

/* compiled from: ButtonDefaults.kt */
/* loaded from: classes17.dex */
public final class exj {
    public final VkCounter.Mode a;
    public final VkCounter.CounterAppearance.Appearance b;

    public exj(VkCounter.Mode mode, VkCounter.CounterAppearance.Appearance appearance) {
        this.a = mode;
        this.b = appearance;
    }

    public final VkCounter.CounterAppearance.Appearance a() {
        return this.b;
    }

    public final VkCounter.Mode b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof exj)) {
            return false;
        }
        exj exjVar = (exj) obj;
        return this.a == exjVar.a && this.b == exjVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CounterAttributesOverride(mode=" + this.a + ", appearance=" + this.b + ')';
    }
}
