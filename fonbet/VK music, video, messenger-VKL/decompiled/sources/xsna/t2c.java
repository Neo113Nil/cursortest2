package xsna;

import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.view.components.user.stack.VkUserStackOld;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class t2c implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ t2c(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.f = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                u2c.a((s2c) this.f, (izs) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(this.e | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                r7c.a((q7c) this.f, (izs) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(this.e | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                ((s5v) this.f).c((q630) this.d, (Cell$Middle.Size) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.e | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                ((VkUserStackOld.c) this.f).a((rlw) this.c, (yzs) this.d, (androidx.compose.runtime.a) obj, ne7.I(this.e | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ t2c(s5v s5vVar, q630 q630Var, Cell$Middle.Size size, int i) {
        this.b = 2;
        this.f = s5vVar;
        this.d = q630Var;
        this.c = size;
        this.e = i;
    }
}
