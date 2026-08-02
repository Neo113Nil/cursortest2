package xsna;

import android.content.res.ColorStateList;
import android.widget.ProgressBar;
import com.vkontakte.android.data.b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class zl9 implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zl9(int i, am9 am9Var) {
        this.c = i;
        this.d = am9Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        int i2 = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                b.d dVar = (b.d) obj;
                dVar.b(Integer.valueOf(i2), "brand_id");
                Integer num = ((am9) obj2).b;
                if (num != null) {
                    nf9 nf9Var = nf9.b;
                    nf9.n(dVar, num);
                }
                break;
            default:
                kkm kkmVar = (kkm) obj2;
                ProgressBar progressBar = (ProgressBar) obj;
                progressBar.setProgressTintList(ColorStateList.valueOf(kkmVar.f(i2)));
                progressBar.setIndeterminateTintList(ColorStateList.valueOf(kkmVar.f(i2)));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ zl9(kkm kkmVar, int i) {
        this.d = kkmVar;
        this.c = i;
    }
}
