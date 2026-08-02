package defpackage;

import androidx.compose.ui.layout.o;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Ref$IntRef;

/* loaded from: classes12.dex */
public final /* synthetic */ class m57 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Ref$IntRef c;
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;

    public /* synthetic */ m57(ArrayList arrayList, Ref$IntRef ref$IntRef, int i, int i2, int i3) {
        this.a = i3;
        this.b = arrayList;
        this.c = ref$IntRef;
        this.w = i;
        this.x = i2;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.x;
        int i3 = this.w;
        Ref$IntRef ref$IntRef = this.c;
        ArrayList arrayList = this.b;
        o.a aVar = (o.a) obj;
        switch (i) {
            case 0:
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    o.a.o(aVar, (o) it.next(), 0, ref$IntRef.element);
                    ref$IntRef.element = i3 + i2 + ref$IntRef.element;
                }
                break;
            default:
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    o.a.o(aVar, (o) it2.next(), ref$IntRef.element, 0);
                    ref$IntRef.element = i3 + i2 + ref$IntRef.element;
                }
                break;
        }
        return zy11Var;
    }
}
