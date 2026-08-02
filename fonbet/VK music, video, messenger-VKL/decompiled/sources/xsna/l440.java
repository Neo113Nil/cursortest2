package xsna;

import com.vk.lists.ListDataSet;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class l440 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l440(int i, u440 u440Var) {
        this.b = 0;
        this.c = i;
        this.d = u440Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                u440 u440Var = (u440) this.d;
                Integer num = (Integer) obj;
                zif0 zif0Var = (zif0) obj2;
                boolean z = num != null && num.intValue() == this.c;
                if (zif0Var instanceof h640) {
                    h640 h640Var = (h640) zif0Var;
                    if (h640Var.b != z) {
                        h640Var.b = z;
                        ListDataSet listDataSet = u440Var.C0;
                        if (listDataSet != null) {
                            listDataSet.d(num.intValue());
                        }
                    }
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((a9k0) this.d).e(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj);
                break;
            default:
                ((Integer) obj2).intValue();
                ((clm0) this.d).X0(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ l440(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }
}
