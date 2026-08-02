package xsna;

import android.graphics.Bitmap;
import xsna.oa70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class qc70 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ qc70(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.invoke(new oa70.c((ha70) ((snv) obj)));
                break;
            case 1:
                String i = ((l2v0) obj).i();
                if (i != null) {
                    this.c.invoke(i);
                }
                break;
            default:
                this.c.invoke((Bitmap) obj);
                break;
        }
        return s3q0.a;
    }
}
