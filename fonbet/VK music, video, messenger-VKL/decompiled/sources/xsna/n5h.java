package xsna;

import xsna.j5h;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class n5h implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ q630 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ n5h(Object obj, long j, q630 q630Var, int i, int i2) {
        this.b = i2;
        this.f = obj;
        this.c = j;
        this.d = q630Var;
        this.e = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).intValue();
                ((j5h.i) this.f).a(ne7.I(this.e | 1), this.c, (androidx.compose.runtime.a) obj, this.d);
                break;
            default:
                ((Integer) obj2).intValue();
                ((com.vk.catalog.mvi.block.impl.a0) this.f).a(ne7.I(this.e | 1), this.c, (androidx.compose.runtime.a) obj, this.d);
                break;
        }
        return s3q0.a;
    }
}
