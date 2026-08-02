package xsna;

import java.util.List;
import xsna.dcm;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class ybm implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ List c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ ybm(int i, List list, boolean z) {
        this.b = i;
        this.c = list;
        this.d = z;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        dcm.a aVar = (dcm.a) obj2;
        if (aVar == null) {
            aVar = new dcm.a(this.b, 7);
        }
        return dcm.a.a(aVar, this.c, false, this.d || aVar.c, 8);
    }
}
