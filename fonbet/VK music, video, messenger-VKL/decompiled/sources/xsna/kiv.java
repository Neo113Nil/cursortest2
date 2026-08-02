package xsna;

import xsna.riv;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class kiv implements wzs {
    public final /* synthetic */ int b;

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        riv.b bVar = (riv.b) obj2;
        if (bVar == null) {
            bVar = new riv.b(str);
        }
        bVar.d++;
        bVar.e += this.b;
        return bVar;
    }
}
