package xsna;

import com.vk.core.compose.component.group.header.GroupHeader$Right;
import xsna.b78;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class sac implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ sac(GroupHeader$Right.a.c cVar, com.vk.core.compose.component.group.header.b bVar, int i) {
        this.b = 2;
        this.d = cVar;
        this.e = bVar;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                izs izsVar = (izs) this.d;
                q630 q630Var = (q630) this.e;
                ((Integer) obj2).getClass();
                fbc.k(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj, izsVar, q630Var);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int I = ne7.I(1);
                tso.f((mm3) this.e, this.c, (izs) this.d, (androidx.compose.runtime.a) obj, I);
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((GroupHeader$Right.a.c) this.d).a((com.vk.core.compose.component.group.header.b) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 3:
                cfl0 cfl0Var = (cfl0) this.d;
                jai jaiVar = (jai) this.e;
                ((Integer) obj2).getClass();
                cfl0Var.g(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj, jaiVar);
                break;
            case 4:
                ((Integer) obj2).intValue();
                uml0.b((jpl0) this.e, (izs) this.d, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 5:
                ((Integer) obj2).intValue();
                ((ybo0) this.d).a((q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                x8u0.c((b78.b) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ sac(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = i;
    }

    public /* synthetic */ sac(mm3 mm3Var, int i, izs izsVar, int i2) {
        this.b = 1;
        this.e = mm3Var;
        this.c = i;
        this.d = izsVar;
    }

    public /* synthetic */ sac(jpl0 jpl0Var, izs izsVar, int i) {
        this.b = 4;
        this.e = jpl0Var;
        this.d = izsVar;
        this.c = i;
    }
}
