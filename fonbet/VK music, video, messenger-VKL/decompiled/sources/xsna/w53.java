package xsna;

import android.content.Context;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.t53;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class w53 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ w53(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                t53.d.a aVar = (t53.d.a) this.d;
                xgx0.a.getClass();
                xgx0.d((Throwable) obj);
                aVar.a6(this.c);
                break;
            case 1:
                ((TextView) obj).setTextColor(((kkm) this.d).f(this.c));
                break;
            case 2:
                ts70 ts70Var = (ts70) this.d;
                pzw pzwVar = (pzw) obj;
                int i = this.c;
                pzwVar.a = new fh4(ts70Var, i, 4);
                pzwVar.c = new qma(i, ts70Var);
                break;
            default:
                qgi0.h((tgi0) obj, ((Context) this.d).getString(R.string.talkback_pin_btn, String.valueOf(this.c)));
                break;
        }
        return s3q0.a;
    }
}
