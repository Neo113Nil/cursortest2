package xsna;

/* compiled from: GlideSuppliers.java */
/* loaded from: classes12.dex */
public final class c1u implements d1u<Object> {
    public volatile Object b;
    public final /* synthetic */ d1u c;

    public c1u(d1u d1uVar) {
        this.c = d1uVar;
    }

    @Override // xsna.d1u
    public final Object get() {
        if (this.b == null) {
            synchronized (this) {
                try {
                    if (this.b == null) {
                        Object obj = this.c.get();
                        nr2.r(obj, "Argument must not be null");
                        this.b = obj;
                    }
                } finally {
                }
            }
        }
        return this.b;
    }
}
