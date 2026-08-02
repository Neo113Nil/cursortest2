package xsna;

import com.vk.tabbar.settings.impl.mvi.InteractSource;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class d3c implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ gzs d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ d3c(int i, String str, gzs gzsVar, q630 q630Var, boolean z) {
        this.e = str;
        this.c = z;
        this.d = gzsVar;
        this.f = q630Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                String str = (String) this.e;
                q630 q630Var = (q630) this.f;
                ((Integer) obj2).getClass();
                e3c.a(ne7.I(1), (androidx.compose.runtime.a) obj, str, this.d, q630Var, this.c);
                break;
            default:
                ((Integer) obj2).getClass();
                int I = ne7.I(1);
                sun0.b((InteractSource) this.e, this.c, (uun0) this.f, this.d, (androidx.compose.runtime.a) obj, I);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ d3c(InteractSource interactSource, boolean z, uun0 uun0Var, gzs gzsVar, int i) {
        this.e = interactSource;
        this.c = z;
        this.f = uun0Var;
        this.d = gzsVar;
    }
}
