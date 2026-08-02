package defpackage;

import android.hardware.camera2.params.InputConfiguration;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class jyq0 {
    public static final List j = Arrays.asList(1, 5, 3);
    public final ArrayList a;
    public final gyq0 b;
    public final List c;
    public final List d;
    public final List e;
    public final fyq0 f;
    public final s38 g;
    public final int h;
    public final InputConfiguration i;

    public jyq0(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, s38 s38Var, fyq0 fyq0Var, InputConfiguration inputConfiguration, int i, gyq0 gyq0Var) {
        this.a = arrayList;
        this.c = Collections.unmodifiableList(arrayList2);
        this.d = Collections.unmodifiableList(arrayList3);
        this.e = Collections.unmodifiableList(arrayList4);
        this.f = fyq0Var;
        this.g = s38Var;
        this.i = inputConfiguration;
        this.h = i;
        this.b = gyq0Var;
    }

    public static jyq0 a() {
        return new jyq0(new ArrayList(), new ArrayList(0), new ArrayList(0), new ArrayList(0), new r38().e(), null, null, 0, null);
    }

    public final List b() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            gyq0 gyq0Var = (gyq0) it.next();
            arrayList.add(gyq0Var.f());
            Iterator it2 = gyq0Var.e().iterator();
            while (it2.hasNext()) {
                arrayList.add((DeferrableSurface) it2.next());
            }
        }
        return Collections.unmodifiableList(arrayList);
    }
}
