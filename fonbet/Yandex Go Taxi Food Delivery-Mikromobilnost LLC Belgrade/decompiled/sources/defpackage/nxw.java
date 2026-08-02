package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class nxw {
    public final ArrayList a;

    public nxw(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nxw) && this.a.equals(((nxw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return smw0.m(new StringBuilder("InvoiceAdditionalOffers(offers="), this.a, ')');
    }
}
