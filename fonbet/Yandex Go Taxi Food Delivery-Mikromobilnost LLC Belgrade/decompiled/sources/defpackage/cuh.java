package defpackage;

import java.util.ArrayList;

/* loaded from: classes9.dex */
public final /* synthetic */ class cuh implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ cuh(ArrayList arrayList, int i) {
        this.a = i;
        this.b = arrayList;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        boolean z;
        int i = this.a;
        ArrayList arrayList = this.b;
        switch (i) {
            case 0:
                z = !arrayList.contains((String) obj);
                break;
            default:
                z = arrayList.contains(((b580) obj).a);
                break;
        }
        return Boolean.valueOf(z);
    }
}
