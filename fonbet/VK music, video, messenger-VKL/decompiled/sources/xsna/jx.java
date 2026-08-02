package xsna;

import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.group.header.f;
import com.vk.ecomm.cart.impl.cart.ui.items.CartItem;
import java.util.Map;
import xsna.kx;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class jx implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ jx(com.vk.core.compose.component.group.header.c cVar, f.b bVar, com.vk.core.compose.component.group.header.b bVar2, int i) {
        this.b = 3;
        this.e = cVar;
        this.c = bVar;
        this.f = bVar2;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).intValue();
                ((kx.a) this.e).c((q630) this.c, (Cell$Middle.Size) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ay9.h((CartItem.d) this.e, (izs) this.f, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((rfj) this.e).e((Map) this.f, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            default:
                com.vk.core.compose.component.group.header.c cVar = (com.vk.core.compose.component.group.header.c) this.e;
                f.b bVar = (f.b) this.c;
                com.vk.core.compose.component.group.header.b bVar2 = (com.vk.core.compose.component.group.header.b) this.f;
                ((Integer) obj2).getClass();
                cVar.a(ne7.I(this.d | 1), (androidx.compose.runtime.a) obj, bVar2, bVar);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ jx(Object obj, Object obj2, q630 q630Var, int i, int i2) {
        this.b = i2;
        this.e = obj;
        this.f = obj2;
        this.c = q630Var;
        this.d = i;
    }

    public /* synthetic */ jx(kx.a aVar, q630 q630Var, Cell$Middle.Size size, int i) {
        this.b = 0;
        this.e = aVar;
        this.c = q630Var;
        this.f = size;
        this.d = i;
    }
}
