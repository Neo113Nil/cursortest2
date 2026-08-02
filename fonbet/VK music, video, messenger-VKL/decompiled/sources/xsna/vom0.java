package xsna;

import com.vk.auth.external.b;
import com.vk.voip.ui.broadcast.fragments.info.StreamInfoFragment;
import xsna.mjw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class vom0 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ vom0(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        izs izsVar = this.c;
        switch (i) {
            case 0:
                int i2 = StreamInfoFragment.S;
                ((ut30) izsVar).invoke(obj);
                break;
            case 1:
                ((rh4) izsVar).invoke(obj);
                break;
            case 2:
                ((jhn0) izsVar).invoke(obj);
                break;
            case 3:
                ((ptl0) izsVar).invoke(obj);
                break;
            case 4:
                ((b.a) izsVar).invoke(obj);
                break;
            case 5:
                ((n5v0) izsVar).invoke(obj);
                break;
            case 6:
                ((ptl0) izsVar).invoke(obj);
                break;
            case 7:
                ((f1p0) izsVar).invoke(obj);
                break;
            default:
                ((mjw0.g) izsVar).invoke(obj);
                break;
        }
    }
}
