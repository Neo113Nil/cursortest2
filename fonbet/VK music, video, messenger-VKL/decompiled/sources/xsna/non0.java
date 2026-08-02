package xsna;

import com.vk.catalog2.common.dto.ui.UIBlockList;

/* compiled from: CatalogCommand.kt */
/* loaded from: classes16.dex */
public final class non0 extends n3a {
    public final UIBlockList a;

    public non0(UIBlockList uIBlockList) {
        this.a = uIBlockList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof non0) && epx.f(this.a, ((non0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SyncWithData(blockList=" + this.a + ')';
    }
}
