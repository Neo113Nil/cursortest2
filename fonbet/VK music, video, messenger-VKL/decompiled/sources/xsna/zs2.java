package xsna;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.us2;

/* compiled from: AnnotatedString.kt */
/* loaded from: classes11.dex */
public final class zs2 {
    public static final us2 a = new us2("");

    public static us2 a(String str, hik0 hik0Var) {
        return new us2(str, (List<us2.d<hik0>>) Collections.singletonList(new us2.d(hik0Var, 0, str.length())), EmptyList.b);
    }

    public static final List b(us2 us2Var, int i, int i2, wh1 wh1Var) {
        List<us2.d<? extends us2.a>> list;
        if (i == i2 || (list = us2Var.b) == null) {
            return null;
        }
        if (i != 0 || i2 < us2Var.c.length()) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                us2.d<? extends us2.a> dVar = list.get(i3);
                if ((wh1Var != null ? ((Boolean) wh1Var.invoke(dVar.a)).booleanValue() : true) && c(i, i2, dVar.b, dVar.c)) {
                    arrayList.add(new us2.d((us2.a) dVar.a, swe0.g(dVar.b, i, i2) - i, swe0.g(dVar.c, i, i2) - i, dVar.d));
                }
            }
            return arrayList;
        }
        if (wh1Var == null) {
            return list;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            us2.d<? extends us2.a> dVar2 = list.get(i4);
            if (((Boolean) wh1Var.invoke(dVar2.a)).booleanValue()) {
                arrayList2.add(dVar2);
            }
        }
        return arrayList2;
    }

    public static final boolean c(int i, int i2, int i3, int i4) {
        return ((i < i4) & (i3 < i2)) | (((i == i2) | (i3 == i4)) & (i == i3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static us2 d(us2 us2Var) {
        ArrayList arrayList;
        lwz lwzVar = lwz.d;
        int i = 0;
        xs2 xs2Var = new xs2(sta0.a.b(), i);
        TreeSet b = oa01.b(0, Integer.valueOf(us2Var.c.length()));
        List<us2.d<? extends us2.a>> list = us2Var.b;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                us2.d<? extends us2.a> dVar = list.get(i2);
                b.add(Integer.valueOf(dVar.b));
                b.add(Integer.valueOf(dVar.c));
            }
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = "";
        int i3 = x8x.a;
        mg50 mg50Var = new mg50();
        mg50Var.g(0, 0);
        j5g.V0(b, 2, 1, false, new aa5(ref$ObjectRef, xs2Var, us2Var, mg50Var, 4));
        if (list != null) {
            arrayList = new ArrayList(list.size());
            int size2 = list.size();
            while (i < size2) {
                us2.d<? extends us2.a> dVar2 = list.get(i);
                arrayList.add(new us2.d(dVar2.a, mg50Var.b(dVar2.b), mg50Var.b(dVar2.c)));
                i++;
            }
        } else {
            arrayList = null;
        }
        return new us2(arrayList, (String) ref$ObjectRef.element);
    }
}
