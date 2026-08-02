package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.builders.ListBuilder;

/* loaded from: classes10.dex */
public final class fa10 extends k8 {
    public final iq31 a;
    public final ArrayList b;
    public final List c;

    public fa10(iq31 iq31Var, ListBuilder listBuilder, ArrayList arrayList, rx40 rx40Var) {
        if (rx40Var.b != arrayList.size() + 1) {
            ny61.g("Outline progress size is expected to be the cubics size + 1");
            throw null;
        }
        int i = rx40Var.b;
        if (i == 0) {
            xva1.e("FloatList is empty.");
            throw null;
        }
        float[] fArr = rx40Var.a;
        int i2 = 0;
        float f = 0.0f;
        if (fArr[0] != 0.0f) {
            ny61.g("First outline progress value is expected to be zero");
            throw null;
        }
        if (i == 0) {
            xva1.e("FloatList is empty.");
            throw null;
        }
        if (fArr[i - 1] != 1.0f) {
            ny61.g("Last outline progress value is expected to be one");
            throw null;
        }
        this.a = iq31Var;
        this.c = listBuilder;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        while (i2 < size) {
            int i3 = i2 + 1;
            if (rx40Var.b(i3) - rx40Var.b(i2) > 1.0E-4f) {
                arrayList2.add(new ea10(this, (jdf) arrayList.get(i2), f, rx40Var.b(i3)));
                f = rx40Var.b(i3);
            }
            i2 = i3;
        }
        ea10 ea10Var = (ea10) arrayList2.get(scc.f(arrayList2));
        float f2 = ea10Var.c;
        if (1.0f < f2) {
            ny61.g("endOutlineProgress is expected to be equal or greater than startOutlineProgress");
            throw null;
        }
        ea10Var.c = f2;
        ea10Var.d = 1.0f;
        this.b = arrayList2;
    }

    @Override // defpackage.z6, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ea10) {
            return super.contains((ea10) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return (ea10) this.b.get(i);
    }

    @Override // defpackage.z6
    public final int getSize() {
        return this.b.size();
    }

    @Override // defpackage.k8, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ea10) {
            return super.indexOf((ea10) obj);
        }
        return -1;
    }

    @Override // defpackage.k8, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ea10) {
            return super.lastIndexOf((ea10) obj);
        }
        return -1;
    }
}
