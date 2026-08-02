package xsna;

import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.libvideo.design.compose.base.preview.PreviewViewState;
import xsna.jdh0;
import xsna.wzq0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class q5v implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ q5v(int i, int i2, Object obj, Object obj2, Object obj3) {
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
                ((Integer) obj2).intValue();
                ((r5v) this.e).c((q630) this.c, (Cell$Middle.Size) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                com.vk.libvideo.design.compose.base.preview.c.e((PreviewViewState.b) this.e, (PreviewViewState.Size) this.f, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                int I = ne7.I(this.d | 1);
                fjd0.c(this.e, (izs) this.f, (q630) this.c, (androidx.compose.runtime.a) obj, I);
                break;
            case 3:
                ((Integer) obj2).getClass();
                zlf0.f((ivs) this.e, (izs) this.f, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                jch0.c((jdh0.b) this.e, (izs) this.f, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                ((wzq0.d) this.e).e((String) this.c, (yzs) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ q5v(Object obj, Object obj2, q630 q630Var, int i, int i2) {
        this.b = i2;
        this.e = obj;
        this.f = obj2;
        this.c = q630Var;
        this.d = i;
    }
}
