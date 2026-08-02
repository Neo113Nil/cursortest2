package xsna;

import com.vk.notifications.core.item.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ni70 implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ q630 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ni70(a.c cVar, izs izsVar, q630 q630Var, int i) {
        this.e = cVar;
        this.f = izsVar;
        this.c = q630Var;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                int I = ne7.I(this.d | 1);
                oi70.a((a.c) this.e, (izs) this.f, this.c, (androidx.compose.runtime.a) obj, I);
                break;
            default:
                ((Integer) obj2).getClass();
                int I2 = ne7.I(49);
                nab0.a((String) this.e, this.c, (Integer) this.f, (androidx.compose.runtime.a) obj, I2, this.d);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ ni70(String str, q630 q630Var, Integer num, int i, int i2) {
        this.e = str;
        this.c = q630Var;
        this.f = num;
        this.d = i2;
    }
}
