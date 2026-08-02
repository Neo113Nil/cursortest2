package xsna;

import com.vk.music.bottomsheets.artistlist.domain.LoadingState;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class or3 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ or3(int i, int i2, Object obj, Object obj2, Object obj3) {
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
                xr3.a((LoadingState) this.e, (yq3) this.f, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 1:
                lv40 lv40Var = (lv40) this.e;
                izs izsVar = (izs) this.f;
                q630 q630Var = (q630) this.c;
                ((Integer) obj2).intValue();
                lv40Var.a(ne7.I(this.d | 1), (androidx.compose.runtime.a) obj, izsVar, q630Var);
                break;
            case 2:
                ((Integer) obj2).intValue();
                u770.a((xvy) this.e, (List) this.f, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                b8k0.b((e8k0) this.e, (q630) this.c, (yzs) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ or3(e8k0 e8k0Var, q630 q630Var, yzs yzsVar, int i) {
        this.b = 3;
        this.e = e8k0Var;
        this.c = q630Var;
        this.f = yzsVar;
        this.d = i;
    }
}
