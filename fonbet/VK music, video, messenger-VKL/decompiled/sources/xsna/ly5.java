package xsna;

import com.vk.design.demo.presentation.screens.ContextMenuScreenContent;
import xsna.c9p0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class ly5 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ly5(int i, q630 q630Var, int i2) {
        this.b = 1;
        this.c = i;
        this.d = q630Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).intValue();
                ((qy5) this.d).e(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj);
                break;
            case 1:
                q630 q630Var = (q630) this.d;
                ((Integer) obj2).getClass();
                int I = ne7.I(49);
                l7c.g(this.c, I, (androidx.compose.runtime.a) obj, q630Var);
                break;
            case 2:
                ((Integer) obj2).intValue();
                ((ContextMenuScreenContent) this.d).c(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj);
                break;
            case 3:
                ((Integer) obj2).intValue();
                hkl0.a((qa8) this.d, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((c9p0.b) this.d).a(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ ly5(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    public /* synthetic */ ly5(c9p0.b bVar, int i) {
        this.b = 4;
        this.d = bVar;
        this.c = i;
    }
}
