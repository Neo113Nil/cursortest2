package defpackage;

import java.util.ArrayList;

/* loaded from: classes13.dex */
public final class ly7 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;

    public ly7(l0o l0oVar, ArrayList arrayList) {
        this.a = 1;
        this.b = arrayList;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        ArrayList arrayList = this.b;
        switch (i) {
            case 0:
                arrayList.get(((Number) obj).intValue());
                break;
            case 1:
                break;
            case 2:
                arrayList.get(((Number) obj).intValue());
                break;
            default:
                arrayList.get(((Number) obj).intValue());
                break;
        }
        return null;
    }

    public /* synthetic */ ly7(ArrayList arrayList, int i) {
        this.a = i;
        this.b = arrayList;
    }
}
