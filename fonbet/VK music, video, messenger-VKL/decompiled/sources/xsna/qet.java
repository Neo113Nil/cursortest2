package xsna;

import xsna.loh0;
import xsna.pdd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class qet implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ qet(Object obj, izs izsVar, Object obj2, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = izsVar;
        this.e = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                int I = ne7.I(385);
                set.a((tet) this.d, this.c, (q630) this.e, (androidx.compose.runtime.a) obj, I);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int I2 = ne7.I(1);
                sju.a((loh0.b) this.d, (c1h) this.e, this.c, (androidx.compose.runtime.a) obj, I2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int I3 = ne7.I(513);
                ((tdd0) this.d).h(this.c, (pdd0.a) this.e, (androidx.compose.runtime.a) obj, I3);
                break;
            default:
                ((Integer) obj2).getClass();
                int I4 = ne7.I(1);
                s8k0.a((g9k0) this.d, this.c, (q630) this.e, (androidx.compose.runtime.a) obj, I4);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ qet(loh0.b bVar, c1h c1hVar, izs izsVar, int i) {
        this.b = 1;
        this.d = bVar;
        this.e = c1hVar;
        this.c = izsVar;
    }
}
