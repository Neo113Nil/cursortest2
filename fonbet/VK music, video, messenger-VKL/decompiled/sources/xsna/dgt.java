package xsna;

import java.util.ArrayList;
import xsna.o9t;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class dgt implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ dgt(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.invoke(new o9t.m((djc) obj));
                return s3q0.a;
            default:
                return (ArrayList) this.c.invoke(obj);
        }
    }
}
