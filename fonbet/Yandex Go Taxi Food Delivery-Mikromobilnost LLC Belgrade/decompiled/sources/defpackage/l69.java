package defpackage;

import androidx.compose.ui.layout.o;
import java.util.ArrayList;
import kotlin.jvm.internal.Ref$IntRef;

/* loaded from: classes12.dex */
public final class l69 implements tls {
    public final /* synthetic */ to5 A;
    public final /* synthetic */ int a;
    public final /* synthetic */ Ref$IntRef b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ to5 w;
    public final /* synthetic */ int x;
    public final /* synthetic */ o y;
    public final /* synthetic */ to5 z;

    public l69(int i, Ref$IntRef ref$IntRef, ArrayList arrayList, to5 to5Var, int i2, o oVar, to5 to5Var2, to5 to5Var3) {
        this.a = i;
        this.b = ref$IntRef;
        this.c = arrayList;
        this.w = to5Var;
        this.x = i2;
        this.y = oVar;
        this.z = to5Var2;
        this.A = to5Var3;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i;
        ArrayList arrayList;
        o.a aVar = (o.a) obj;
        Ref$IntRef ref$IntRef = this.b;
        int i2 = ref$IntRef.element;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = this.x;
            arrayList = this.c;
            if (i3 >= i2) {
                break;
            }
            o oVar = (o) arrayList.get(i3);
            o.a.o(aVar, oVar, i4, this.w.a(oVar.b, i));
            i4 += oVar.a;
            i3++;
        }
        o oVar2 = this.y;
        int i5 = oVar2.a;
        int i6 = this.a;
        o.a.o(aVar, oVar2, (i6 - i5) / 2, this.z.a(oVar2.b, i));
        int size = arrayList.size() - 1;
        int i7 = ref$IntRef.element;
        if (i7 <= size) {
            while (true) {
                o oVar3 = (o) arrayList.get(size);
                i6 -= oVar3.a;
                o.a.o(aVar, oVar3, i6, this.A.a(oVar3.b, i));
                if (size == i7) {
                    break;
                }
                size--;
            }
        }
        return zy11.a;
    }
}
