package xsna;

import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.ecomm.onlinebooking.impl.edit.BookingEditScreenState;
import xsna.noa;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class jo7 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ jo7(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.e = obj;
        this.f = obj2;
        this.c = obj3;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ((ko7) this.e).a((BookingEditScreenState.a.C0956a) this.f, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                ((noa.f) this.e).c((q630) this.c, (Cell$Middle.Size) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                ((flk) this.e).a((spg0) this.f, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                ((f6v) this.e).c((q630) this.c, (Cell$Middle.Size) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                ((com.vk.core.compose.component.cell.content.q0) this.e).a((spg0) this.f, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((TopBar$Middle.Text.Title.a.C0754a) this.e).a((mtk0) this.f, (com.vk.core.compose.component.topbar.k) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ jo7(Cell$Middle.d dVar, q630 q630Var, Cell$Middle.Size size, int i, int i2) {
        this.b = i2;
        this.e = dVar;
        this.c = q630Var;
        this.f = size;
        this.d = i;
    }
}
