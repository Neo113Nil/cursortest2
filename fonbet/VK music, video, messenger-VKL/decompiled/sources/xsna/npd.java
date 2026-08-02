package xsna;

import xsna.mbf;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class npd implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ npd(izs izsVar, int i) {
        this.b = 2;
        this.c = izsVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                this.c.invoke(new mbf.b.c((zoa) obj, (String) obj2));
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.c.invoke(bool);
                break;
            default:
                ((Integer) obj2).getClass();
                int I = ne7.I(1);
                uso.a(this.c, (androidx.compose.runtime.a) obj, I);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ npd(izs izsVar, int i, byte b) {
        this.b = i;
        this.c = izsVar;
    }
}
