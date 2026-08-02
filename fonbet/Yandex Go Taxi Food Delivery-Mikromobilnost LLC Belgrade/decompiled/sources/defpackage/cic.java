package defpackage;

import androidx.compose.ui.layout.o;
import java.util.ArrayList;
import kotlin.jvm.internal.Ref$IntRef;

/* loaded from: classes12.dex */
public final class cic implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Ref$IntRef b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ int w;
    public final /* synthetic */ o x;

    public cic(int i, Ref$IntRef ref$IntRef, ArrayList arrayList, int i2, o oVar) {
        this.a = i;
        this.b = ref$IntRef;
        this.c = arrayList;
        this.w = i2;
        this.x = oVar;
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
            i = this.w;
            arrayList = this.c;
            if (i3 >= i2) {
                break;
            }
            o oVar = (o) arrayList.get(i3);
            o.a.o(aVar, oVar, i4, Math.round((1.0f + 0.0f) * ((i - oVar.b) / 2.0f)));
            i4 += oVar.a;
            i3++;
        }
        o oVar2 = this.x;
        int i5 = oVar2.a;
        int i6 = this.a;
        o.a.o(aVar, oVar2, (i6 - i5) / 2, Math.round((1.0f + 0.0f) * ((i - oVar2.b) / 2.0f)));
        int size = arrayList.size() - 1;
        int i7 = ref$IntRef.element;
        if (i7 <= size) {
            while (true) {
                o oVar3 = (o) arrayList.get(size);
                i6 -= oVar3.a;
                o.a.o(aVar, oVar3, i6, Math.round((1.0f + 0.0f) * ((i - oVar3.b) / 2.0f)));
                if (size == i7) {
                    break;
                }
                size--;
            }
        }
        return zy11.a;
    }
}
