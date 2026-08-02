package defpackage;

import com.yandex.plus.pay.repository.api.model.contacts.CollectContactsWebUrlParams$Theme;

/* loaded from: classes2.dex */
public final class kbc {
    public final CollectContactsWebUrlParams$Theme a;

    public kbc(CollectContactsWebUrlParams$Theme collectContactsWebUrlParams$Theme) {
        this.a = collectContactsWebUrlParams$Theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kbc) && this.a == ((kbc) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CollectContactsWebUrlParams(theme=" + this.a + ')';
    }
}
