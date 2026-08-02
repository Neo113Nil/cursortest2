package xsna;

import com.vk.catalog2.common.dto.ui.UIBlockList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ik40 implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ik40(int i, int i2, String str, boolean z) {
        this.e = str;
        this.c = z;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                UIBlockList uIBlockList = (UIBlockList) obj;
                ((nk40) this.e).getClass();
                edi.y(uIBlockList, new jk40(this.d, 0), new zy2(this.c, 1));
                return uIBlockList;
            default:
                String str = (String) this.e;
                ((Integer) obj2).getClass();
                int I = ne7.I(1);
                n7d0.a(this.d, I, (androidx.compose.runtime.a) obj, str, this.c);
                return s3q0.a;
        }
    }

    public /* synthetic */ ik40(nk40 nk40Var, int i, boolean z) {
        this.e = nk40Var;
        this.d = i;
        this.c = z;
    }
}
