package xsna;

import com.vk.writebar.WriteBar;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class b0y0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b0y0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                int i2 = WriteBar.h0;
                ((WriteBar) obj2).V();
                break;
            default:
                ((jds0) obj2).invoke();
                break;
        }
        return s3q0.a;
    }
}
