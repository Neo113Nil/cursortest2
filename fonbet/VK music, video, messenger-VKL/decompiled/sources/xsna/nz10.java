package xsna;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.pf80;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class nz10 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ nz10(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                yz10 yz10Var = (yz10) this.d;
                int i = this.c;
                zy10 zy10Var = yz10Var.b;
                zy10Var.getClass();
                ArrayList a = i7o0.a((List) obj);
                if (i == 111) {
                    zy10Var.a = a;
                }
                return s3q0.a;
            case 1:
                return new pf80.e((Activity) this.d, this.c);
            default:
                ((v5b) this.d).invoke(new rbt0(this.c, 50, 0, 16, EmptyList.b));
                return s3q0.a;
        }
    }
}
