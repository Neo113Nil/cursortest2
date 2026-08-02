package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class yr3 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yr3(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return new com.vk.catalog.mvi.block.music.impl.artists.mix.a((b2a) obj, (q4v0) this.c, (u2b0) this.d);
            default:
                htu htuVar = (htu) this.c;
                htuVar.c.removeCallbacks((gtu) this.d);
                return s3q0.a;
        }
    }
}
