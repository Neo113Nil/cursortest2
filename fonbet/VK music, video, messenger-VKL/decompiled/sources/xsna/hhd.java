package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: ClipsAuthorSelectorAuthorItem.kt */
/* loaded from: classes14.dex */
public final class hhd implements hfz {
    public final ghd b;

    public hhd(ghd ghdVar) {
        this.b = ghdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hhd) && epx.f(this.b, ((hhd) obj).b);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        UserId id = this.b.a.getId();
        return id != null ? Long.valueOf(id.b) : Long.valueOf(r0.hashCode());
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ClipsAuthorSelectorAuthorItem(authorData=" + this.b + ')';
    }
}
