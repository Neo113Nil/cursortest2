package defpackage;

import io.flutter.plugins.imagepicker.Messages;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class kx10 implements qx10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ce5 c;

    public /* synthetic */ kx10(ArrayList arrayList, ce5 ce5Var, int i) {
        this.a = i;
        this.b = arrayList;
        this.c = ce5Var;
    }

    @Override // defpackage.qx10
    public final void c(ArrayList arrayList) {
        int i = this.a;
        ce5 ce5Var = this.c;
        ArrayList arrayList2 = this.b;
        switch (i) {
            case 0:
                arrayList2.add(0, arrayList);
                ce5Var.a(arrayList2);
                break;
            default:
                arrayList2.add(0, arrayList);
                ce5Var.a(arrayList2);
                break;
        }
    }

    @Override // defpackage.qx10
    public final void g(Messages.FlutterError flutterError) {
        int i = this.a;
        ce5 ce5Var = this.c;
        switch (i) {
            case 0:
                ce5Var.a(Messages.a(flutterError));
                break;
            default:
                ce5Var.a(Messages.a(flutterError));
                break;
        }
    }
}
