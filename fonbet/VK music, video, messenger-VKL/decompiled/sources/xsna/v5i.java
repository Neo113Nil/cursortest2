package xsna;

/* compiled from: CompactHashMap.java */
/* loaded from: classes13.dex */
public final class v5i extends w5i<Object, Object>.b<Object> {
    public final /* synthetic */ w5i f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5i(w5i w5iVar) {
        super();
        this.f = w5iVar;
    }

    @Override // xsna.w5i.b
    public final Object a(int i) {
        return this.f.p()[i];
    }
}
