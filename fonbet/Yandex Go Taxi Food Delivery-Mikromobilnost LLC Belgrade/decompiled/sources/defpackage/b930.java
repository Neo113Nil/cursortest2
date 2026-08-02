package defpackage;

import androidx.compose.ui.layout.o;
import java.util.ArrayList;
import kotlin.jvm.internal.Ref$IntRef;

/* loaded from: classes12.dex */
public final /* synthetic */ class b930 implements tls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ b930(Ref$IntRef ref$IntRef, ArrayList arrayList, int i, boolean z, o oVar) {
        this.w = ref$IntRef;
        this.x = arrayList;
        this.b = i;
        this.c = z;
        this.y = oVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.y;
        boolean z = this.c;
        int i2 = this.b;
        Object obj3 = this.x;
        Object obj4 = this.w;
        switch (i) {
            case 0:
                tls tlsVar = (tls) obj4;
                tls tlsVar2 = (tls) obj3;
                oz40 oz40Var = (oz40) obj2;
                hoy0 hoy0Var = (hoy0) obj;
                if (!z) {
                    String str = hoy0Var.a.b;
                    StringBuilder sb = new StringBuilder();
                    int length = str.length();
                    for (int i3 = 0; i3 < length; i3++) {
                        char charAt = str.charAt(i3);
                        if (Character.isDigit(charAt)) {
                            sb.append(charAt);
                        }
                    }
                    String A0 = gvu0.A0(i2, sb.toString());
                    String str2 = ((hoy0) oz40Var.getValue()).a.b;
                    int length2 = A0.length();
                    oz40Var.setValue(new hoy0(A0, eja1.c(length2, length2), 4));
                    if (!A0.equals(str2)) {
                        tlsVar.invoke(A0);
                        if (A0.length() == i2) {
                            tlsVar2.invoke(A0);
                            break;
                        }
                    }
                }
                break;
            default:
                ArrayList arrayList = (ArrayList) obj3;
                o oVar = (o) obj2;
                o.a aVar = (o.a) obj;
                int i4 = ((Ref$IntRef) obj4).element;
                int i5 = 0;
                for (int i6 = 0; i6 < i4; i6++) {
                    o.a.o(aVar, (o) arrayList.get(i6), i5, 0);
                    i5 += ((o) arrayList.get(i6)).a + i2;
                }
                if (z && oVar != null) {
                    o.a.o(aVar, oVar, i5, 0);
                    break;
                }
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ b930(boolean z, int i, tls tlsVar, tls tlsVar2, oz40 oz40Var) {
        this.c = z;
        this.b = i;
        this.w = tlsVar;
        this.x = tlsVar2;
        this.y = oz40Var;
    }
}
