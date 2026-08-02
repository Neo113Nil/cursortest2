package xsna;

import com.vk.community.design.view.components.compose.a;
import com.vk.core.compose.component.topbar.TopBar$Before;
import xsna.b9p0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class ohf implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ohf(int i, int i2, int i3, Object obj, Object obj2) {
        this.b = i3;
        this.e = obj;
        this.d = i;
        this.c = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                int I = ne7.I(1);
                vhf.b((xhf) this.e, this.d, (q630) this.c, (androidx.compose.runtime.a) obj, I);
                break;
            case 1:
                ((Integer) obj2).intValue();
                ((a.C0722a) this.e).a((q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                int I2 = ne7.I(1);
                ((zuy) this.e).f(this.d, this.c, (androidx.compose.runtime.a) obj, I2);
                break;
            case 3:
                ((Integer) obj2).intValue();
                ((TopBar$Before.d) this.e).e((q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                ((b9p0.f) this.e).a((q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ ohf(Object obj, q630 q630Var, int i, int i2) {
        this.b = i2;
        this.e = obj;
        this.c = q630Var;
        this.d = i;
    }
}
