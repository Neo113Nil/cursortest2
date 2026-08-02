package xsna;

import com.vk.core.compose.component.cell.content.Cell$Left;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class qhg implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ spg0 c;
    public final /* synthetic */ q630 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Cell$Left.Main f;

    public /* synthetic */ qhg(Cell$Left.Main main, spg0 spg0Var, q630 q630Var, int i, int i2) {
        this.b = i2;
        this.f = main;
        this.c = spg0Var;
        this.d = q630Var;
        this.e = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).intValue();
                int I = ne7.I(this.e | 1);
                ((com.vk.core.compose.component.cell.content.t) this.f).a(this.c, this.d, (androidx.compose.runtime.a) obj, I);
                break;
            default:
                ((Integer) obj2).intValue();
                int I2 = ne7.I(this.e | 1);
                ((o5p0) this.f).a(this.c, this.d, (androidx.compose.runtime.a) obj, I2);
                break;
        }
        return s3q0.a;
    }
}
