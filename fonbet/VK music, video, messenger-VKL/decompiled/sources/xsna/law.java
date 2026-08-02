package xsna;

/* compiled from: ImPlaceholder.kt */
/* loaded from: classes2.dex */
public final class law {
    public final com.vk.im.design.view.placeholder.a a;

    public law() {
        this(null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof law)) {
            return false;
        }
        law lawVar = (law) obj;
        lawVar.getClass();
        return epx.f(this.a, lawVar.a);
    }

    public final int hashCode() {
        com.vk.im.design.view.placeholder.a aVar = this.a;
        if (aVar == null) {
            return 0;
        }
        return aVar.hashCode();
    }

    public final String toString() {
        return "DefaultBottom(cellGroup=null, buttonGroup=" + this.a + ')';
    }

    public law(com.vk.im.design.view.placeholder.a aVar) {
        this.a = aVar;
    }

    public /* synthetic */ law(com.vk.im.design.view.placeholder.a aVar, int i) {
        this((i & 2) != 0 ? null : aVar);
    }
}
