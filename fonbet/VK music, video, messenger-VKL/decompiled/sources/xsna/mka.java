package xsna;

import com.vk.core.compose.component.topbar.TopBar$Before;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class mka implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ mka(int i, ArrayList arrayList, izs izsVar, int i2) {
        this.b = 0;
        this.c = i;
        this.d = arrayList;
        this.e = izsVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                int I = ne7.I(1);
                nka.a(this.c, (ArrayList) this.d, (izs) this.e, (androidx.compose.runtime.a) obj, I);
                break;
            case 1:
                ((Integer) obj2).getClass();
                ebu.a((yk8) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                b8k0.a((k7k0) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                ((TopBar$Before.e) this.d).e((q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ mka(Object obj, q630 q630Var, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = q630Var;
        this.c = i;
    }
}
