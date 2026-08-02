package xsna;

import android.text.Spannable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class wbo implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wbo(int i, Spannable spannable) {
        this.c = i;
        this.d = spannable;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        Object obj3 = this.d;
        int i2 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ybo.g((q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                break;
            default:
                gep gepVar = (gep) obj;
                int intValue = ((Integer) obj2).intValue();
                ucp ucpVar = ucp.a;
                ((Spannable) obj3).setSpan(new wdp(ucp.c(gepVar, i2)), intValue, gepVar.a() + intValue, 33);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ wbo(q630 q630Var, int i) {
        this.d = q630Var;
        this.c = i;
    }
}
