package xsna;

import androidx.compose.ui.state.ToggleableState;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class ih2 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ih2(int i, int i2, Object obj, Object obj2, boolean z) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = z;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ToggleableState toggleableState = (ToggleableState) this.d;
                q630 q630Var = (q630) this.e;
                ((Integer) obj2).getClass();
                kh2.b(ne7.I(7), (androidx.compose.runtime.a) obj, toggleableState, q630Var, this.c);
                break;
            default:
                ((Integer) obj2).getClass();
                int I = ne7.I(1);
                o7t.d((String) this.d, (String) this.e, this.c, (androidx.compose.runtime.a) obj, I);
                break;
        }
        return s3q0.a;
    }
}
