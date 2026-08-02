package xsna;

import com.vk.ecomm.configureitemlist.api.model.ConfigureItem;

/* compiled from: ConfigureItemListItemModel.kt */
/* loaded from: classes18.dex */
public final class yzi {
    public final ConfigureItem a;
    public final boolean b;

    public yzi(ConfigureItem configureItem, boolean z) {
        this.a = configureItem;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yzi)) {
            return false;
        }
        yzi yziVar = (yzi) obj;
        return epx.f(this.a, yziVar.a) && this.b == yziVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConfigureItemListItemModel(configureItem=");
        sb.append(this.a);
        sb.append(", isDeleted=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
