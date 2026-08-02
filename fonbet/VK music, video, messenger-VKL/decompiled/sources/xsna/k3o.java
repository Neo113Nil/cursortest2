package xsna;

import com.vk.dto.common.Good;
import com.vk.dto.fave.MarketFavable;
import java.util.List;
import kotlin.jvm.internal.Ref$FloatRef;
import xsna.ve10;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class k3o implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ k3o(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ((m3o) this.d).h((y3o) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((qwo) this.d).k((ioo) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 2:
                MarketFavable marketFavable = (MarketFavable) this.d;
                ot00 ot00Var = (ot00) this.e;
                Good good = (Good) this.c;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (((gmq) obj2).equals(marketFavable)) {
                    d9a d9aVar = ot00Var.g;
                    d9aVar.b(new c9a(d9aVar, good.b, booleanValue));
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                xb10.a((List) this.d, (q630) this.e, (xz00) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ((fe10) this.d).h((ve10.a.C3884a) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ((be70) this.d).k((ce70) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 6:
                ((Integer) obj2).getClass();
                ((mf70) this.d).h((hf70) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 7:
                Ref$FloatRef ref$FloatRef = (Ref$FloatRef) this.d;
                zhh0 zhh0Var = (zhh0) this.e;
                n160 n160Var = (n160) this.c;
                float floatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                ref$FloatRef.element += zhh0Var.d(zhh0Var.g(n160Var.b(zhh0Var.h(zhh0Var.d(floatValue - ref$FloatRef.element)))));
                break;
            case 8:
                ((Integer) obj2).getClass();
                ((gmh0) this.d).h((mmh0) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            default:
                ((Integer) obj2).getClass();
                i5k0.a((j5k0) this.d, (izs) this.c, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ k3o(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
    }

    public /* synthetic */ k3o(j5k0 j5k0Var, izs izsVar, q630 q630Var, int i) {
        this.b = 9;
        this.d = j5k0Var;
        this.c = izsVar;
        this.e = q630Var;
    }
}
