package xsna;

import com.vk.music.player.api.BottomPlayerAppearance;
import xsna.dz40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class n48 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ n48(int i, int i2, Object obj, Object obj2, Object obj3, xzs xzsVar) {
        this.b = i2;
        this.e = obj;
        this.c = obj2;
        this.f = obj3;
        this.g = xzsVar;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ((o48) this.e).e((gzs) this.c, (gzs) this.f, (x5) this.g, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((z5u) this.e).o6((a1i0) this.f, (gzs) this.c, (q630) this.g, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                k0b0.b((dz40.t) this.e, (f3b0) this.c, (BottomPlayerAppearance) this.f, (izs) this.g, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                d4b0.a((dlv0) this.e, (qy40) this.c, (q630) this.f, (izs) this.g, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                wiu0.c((qco0) this.e, (q630) this.c, (qzy) this.f, (ekg0) this.g, (androidx.compose.runtime.a) obj, ne7.I(1), this.d);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ n48(z5u z5uVar, a1i0 a1i0Var, gzs gzsVar, q630 q630Var, int i) {
        this.b = 1;
        this.e = z5uVar;
        this.f = a1i0Var;
        this.c = gzsVar;
        this.g = q630Var;
        this.d = i;
    }

    public /* synthetic */ n48(qco0 qco0Var, q630 q630Var, qzy qzyVar, ekg0 ekg0Var, int i, int i2) {
        this.b = 4;
        this.e = qco0Var;
        this.c = q630Var;
        this.f = qzyVar;
        this.g = ekg0Var;
        this.d = i2;
    }
}
