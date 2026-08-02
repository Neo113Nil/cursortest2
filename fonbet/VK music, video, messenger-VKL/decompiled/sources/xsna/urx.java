package xsna;

import com.vk.fullscreenvideo.ControlsState;
import java.util.List;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class urx implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ urx(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                wrx.a((uyh0) this.d, q630.a.a, (s890) this.e, (izs) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                ((h590) this.d).a((spg0) this.e, (q630) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 2:
                bkd0 bkd0Var = (bkd0) this.d;
                List list = (List) this.e;
                izs izsVar = (izs) this.f;
                ((Integer) obj2).intValue();
                bkd0Var.A6(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj, list, izsVar);
                break;
            default:
                ((Integer) obj2).getClass();
                p8p0.a((ControlsState.b) this.d, (izs) this.f, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ urx(ControlsState.b bVar, izs izsVar, q630 q630Var, int i) {
        this.b = 3;
        this.d = bVar;
        this.f = izsVar;
        this.e = q630Var;
        this.c = i;
    }

    public /* synthetic */ urx(uyh0 uyh0Var, s890 s890Var, izs izsVar, int i) {
        this.b = 0;
        this.d = uyh0Var;
        this.e = s890Var;
        this.f = izsVar;
        this.c = i;
    }
}
