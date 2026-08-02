package xsna;

import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.tra0;

/* compiled from: AlertDialog.kt */
/* loaded from: classes11.dex */
public final class as1 implements cp10 {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;

    public as1(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public static final void a(ArrayList arrayList, Ref$IntRef ref$IntRef, ep10 ep10Var, float f, ArrayList arrayList2, ArrayList arrayList3, Ref$IntRef ref$IntRef2, ArrayList arrayList4, Ref$IntRef ref$IntRef3, Ref$IntRef ref$IntRef4) {
        if (!arrayList.isEmpty()) {
            ref$IntRef.element = ep10Var.r0(f) + ref$IntRef.element;
        }
        arrayList.add(0, j5g.O0(arrayList2));
        arrayList3.add(Integer.valueOf(ref$IntRef2.element));
        arrayList4.add(Integer.valueOf(ref$IntRef.element));
        ref$IntRef.element += ref$IntRef2.element;
        ref$IntRef3.element = Math.max(ref$IntRef3.element, ref$IntRef4.element);
        arrayList2.clear();
        ref$IntRef4.element = 0;
        ref$IntRef2.element = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0087 A[SYNTHETIC] */
    @Override // xsna.cp10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final dp10 b(final ep10 ep10Var, List<? extends zo10> list, long j) {
        int i;
        tra0 tra0Var;
        List<? extends zo10> list2 = list;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        ArrayList arrayList4 = new ArrayList();
        Ref$IntRef ref$IntRef3 = new Ref$IntRef();
        Ref$IntRef ref$IntRef4 = new Ref$IntRef();
        int i2 = 0;
        for (int size = list2.size(); i2 < size; size = i) {
            tra0 N = list2.get(i2).N(j);
            boolean isEmpty = arrayList4.isEmpty();
            float f = this.a;
            if (!isEmpty) {
                ArrayList arrayList5 = arrayList;
                Ref$IntRef ref$IntRef5 = ref$IntRef2;
                if (ep10Var.r0(f) + ref$IntRef3.element + N.b <= o6j.i(j)) {
                    arrayList = arrayList5;
                    ref$IntRef2 = ref$IntRef5;
                } else {
                    i = size;
                    ref$IntRef2 = ref$IntRef5;
                    tra0Var = N;
                    arrayList = arrayList5;
                    a(arrayList, ref$IntRef2, ep10Var, this.b, arrayList4, arrayList2, ref$IntRef4, arrayList3, ref$IntRef, ref$IntRef3);
                    if (arrayList4.isEmpty()) {
                        ref$IntRef3.element = ep10Var.r0(f) + ref$IntRef3.element;
                    }
                    arrayList4.add(tra0Var);
                    ref$IntRef3.element += tra0Var.b;
                    ref$IntRef4.element = Math.max(ref$IntRef4.element, tra0Var.c);
                    i2++;
                    list2 = list;
                }
            }
            i = size;
            tra0Var = N;
            if (arrayList4.isEmpty()) {
            }
            arrayList4.add(tra0Var);
            ref$IntRef3.element += tra0Var.b;
            ref$IntRef4.element = Math.max(ref$IntRef4.element, tra0Var.c);
            i2++;
            list2 = list;
        }
        if (!arrayList4.isEmpty()) {
            a(arrayList, ref$IntRef2, ep10Var, this.b, arrayList4, arrayList2, ref$IntRef4, arrayList3, ref$IntRef, ref$IntRef3);
        }
        final int max = Math.max(ref$IntRef.element, o6j.k(j));
        int max2 = Math.max(ref$IntRef2.element, o6j.j(j));
        final ArrayList arrayList6 = arrayList;
        final float f2 = this.a;
        return ep10Var.Q(max, max2, jgp.b, new izs() { // from class: xsna.zr1
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                ep10 ep10Var2;
                tra0.a aVar = (tra0.a) obj;
                ArrayList arrayList7 = arrayList6;
                int size2 = arrayList7.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    List list3 = (List) arrayList7.get(i3);
                    int size3 = list3.size();
                    int[] iArr = new int[size3];
                    int i4 = 0;
                    while (true) {
                        ep10Var2 = ep10Var;
                        if (i4 >= size3) {
                            break;
                        }
                        iArr[i4] = ((tra0) list3.get(i4)).b + (i4 < e43.h(list3) ? ep10Var2.r0(f2) : 0);
                        i4++;
                    }
                    int[] iArr2 = new int[size3];
                    androidx.compose.foundation.layout.a.b.b(ep10Var2, max, iArr, ep10Var2.getLayoutDirection(), iArr2);
                    int size4 = list3.size();
                    for (int i5 = 0; i5 < size4; i5++) {
                        aVar.q((tra0) list3.get(i5), iArr2[i5], ((Number) arrayList3.get(i3)).intValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                }
                return s3q0.a;
            }
        });
    }
}
