package xsna;

import com.vk.core.compose.component.topbar.TopBar$Before;
import xsna.b9p0;
import xsna.lab0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class zbo implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ q630 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ zbo(Object obj, q630 q630Var, int i, int i2) {
        this.b = i2;
        this.e = obj;
        this.c = q630Var;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                int I = ne7.I(this.d | 1);
                aco.a((cco) this.e, this.c, (androidx.compose.runtime.a) obj, I);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int I2 = ne7.I(this.d | 1);
                xa50.f((lab0.a) this.e, this.c, (androidx.compose.runtime.a) obj, I2);
                break;
            case 2:
                ((Integer) obj2).intValue();
                int I3 = ne7.I(this.d | 1);
                ((TopBar$Before.a) this.e).e(this.c, (androidx.compose.runtime.a) obj, I3);
                break;
            default:
                ((Integer) obj2).intValue();
                int I4 = ne7.I(this.d | 1);
                ((b9p0.c) this.e).a(this.c, (androidx.compose.runtime.a) obj, I4);
                break;
        }
        return s3q0.a;
    }
}
