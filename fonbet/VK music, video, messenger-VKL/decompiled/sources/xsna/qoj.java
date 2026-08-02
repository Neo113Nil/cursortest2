package xsna;

import android.content.Context;
import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class qoj implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ wh50 c;

    public /* synthetic */ qoj(int i, wh50 wh50Var) {
        this.b = i;
        this.c = wh50Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                View view = new View((Context) obj);
                this.c.setValue(view);
                return view;
            default:
                this.c.setValue((tho0) obj);
                return s3q0.a;
        }
    }
}
