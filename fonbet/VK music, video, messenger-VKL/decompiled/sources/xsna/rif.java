package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import xsna.oa70;
import xsna.yaf;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class rif implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;

    public /* synthetic */ rif(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ((izs) this.c).invoke(new yaf.b.C4088b(this.d));
                break;
            case 1:
                ((izs) this.c).invoke(new oa70.g(this.d));
                break;
            default:
                ((RecyclerView) ((ViewGroup) this.c)).scrollToPosition(this.d);
                break;
        }
        return s3q0.a;
    }
}
