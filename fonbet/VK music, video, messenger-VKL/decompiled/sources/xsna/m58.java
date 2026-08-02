package xsna;

import android.graphics.Bitmap;
import com.vk.log.L;
import xsna.rre;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class m58 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m58(Object obj, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return ((s58) this.d).c.m((Bitmap) obj, s58.h, s58.i, this.c);
            default:
                nre nreVar = (nre) this.d;
                L.i((Throwable) obj);
                nreVar.T(new rre.e(this.c));
                return s3q0.a;
        }
    }
}
