package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlock;

/* compiled from: ComposeCatalogAction.kt */
@vby
/* loaded from: classes3.dex */
public final class dpi {
    public final UIBlock a;

    public final boolean equals(Object obj) {
        if (obj instanceof dpi) {
            return epx.f(this.a, ((dpi) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ItemClicked(block=" + this.a + ')';
    }
}
