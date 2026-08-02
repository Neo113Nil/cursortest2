package defpackage;

/* loaded from: classes2.dex */
public final class lsu0 {
    public final String a;

    public lsu0(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lsu0) && this.a.equals(((lsu0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("OnDeeplinkCrossAction(deeplink="), this.a, ')');
    }
}
