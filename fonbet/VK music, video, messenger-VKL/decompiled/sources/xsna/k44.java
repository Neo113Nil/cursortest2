package xsna;

import xsna.nyu;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class k44 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ k44(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ((com.vk.attachpicker.impl.a) this.d).e.smoothScrollToPosition(this.c + 1);
                return null;
            case 1:
                nyu.a aVar = ((nyu) this.d).K;
                if (aVar != null) {
                    aVar.b(this.c);
                }
                return s3q0.a;
            default:
                dsy dsyVar = (dsy) this.d;
                boolean z = true;
                int d = dsyVar.i().d() - 1;
                xqy xqyVar = (xqy) j5g.k0(dsyVar.i().f());
                if (xqyVar != null && xqyVar.getIndex() < d - this.c) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
