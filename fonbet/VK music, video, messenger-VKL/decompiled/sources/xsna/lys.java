package xsna;

import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import xsna.dz40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class lys implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ lys(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.e = obj;
        this.c = obj2;
        this.f = obj3;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ((oys) this.e).a((q630) this.c, (jai) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                z8u.c((izs) this.e, (b5u) this.f, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                ((i6v) this.e).c((q630) this.c, (Cell$Middle.Size) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                int I = ne7.I(this.d | 1);
                ((jwy) this.e).c(this.c, (jai) this.f, (androidx.compose.runtime.a) obj, I);
                break;
            case 4:
                ((Integer) obj2).getClass();
                s1b0.b((dz40.h) this.e, (izs) this.f, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 5:
                ((Integer) obj2).intValue();
                ((com.vk.core.compose.component.cell.content.r0) this.e).a((spg0) this.f, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((TopBar$Middle.Text.Title.a.b) this.e).a((mtk0) this.c, (com.vk.core.compose.component.topbar.k) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ lys(Object obj, Object obj2, q630 q630Var, int i, int i2) {
        this.b = i2;
        this.e = obj;
        this.f = obj2;
        this.c = q630Var;
        this.d = i;
    }
}
