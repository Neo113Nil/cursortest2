package defpackage;

/* loaded from: classes8.dex */
public final class c7u extends e7u {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ c7u(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.e7u
    public final Object a() {
        switch (this.a) {
            case 0:
                return (Boolean) this.b;
            default:
                return (Integer) this.b;
        }
    }
}
