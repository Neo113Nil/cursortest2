package xsna;

/* compiled from: CatalogRegistryComponent.kt */
/* loaded from: classes16.dex */
public final class vca implements l9i {
    public final String a;

    public vca(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vca) && epx.f(this.a, ((vca) obj).a);
    }

    @Override // xsna.l9i
    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("CatalogRegistryComponentParams(catalogEntryPointToken="), this.a, ')');
    }
}
