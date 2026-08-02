package xsna;

import com.vk.core.ui.themes.VKTheme;

/* compiled from: VkTheme.kt */
/* loaded from: classes.dex */
public final class ehr0 {
    public final VKTheme a;
    public final VKTheme b;

    public ehr0(VKTheme vKTheme, VKTheme vKTheme2) {
        this.a = vKTheme;
        this.b = vKTheme2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ehr0)) {
            return false;
        }
        ehr0 ehr0Var = (ehr0) obj;
        return epx.f(this.a, ehr0Var.a) && epx.f(this.b, ehr0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "VKThemes(light=" + this.a + ", dark=" + this.b + ')';
    }
}
