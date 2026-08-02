package xsna;

import android.content.Context;
import android.view.View;
import xsna.kyl;
import xsna.xxl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class pz7 implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ izs c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ pz7(Context context, kyl.c cVar, xxl.c cVar2, izs izsVar, q630 q630Var, int i) {
        this.d = context;
        this.e = cVar;
        this.f = cVar2;
        this.c = izsVar;
        this.g = q630Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                int I = ne7.I(1);
                vz7.e((com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.o) this.d, this.e, (yw90) this.f, (View) this.g, this.c, (androidx.compose.runtime.a) obj, I);
                break;
            default:
                ((Integer) obj2).getClass();
                int I2 = ne7.I(24577);
                kxl.a((Context) this.d, (kyl.c) this.e, (xxl.c) this.f, this.c, (q630) this.g, (androidx.compose.runtime.a) obj, I2);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ pz7(com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.o oVar, Object obj, yw90 yw90Var, View view, izs izsVar, int i) {
        this.d = oVar;
        this.e = obj;
        this.f = yw90Var;
        this.g = view;
        this.c = izsVar;
    }
}
