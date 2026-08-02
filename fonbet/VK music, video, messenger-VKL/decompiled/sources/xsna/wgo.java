package xsna;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: AnchoredDraggable.kt */
/* loaded from: classes11.dex */
public final class wgo<T> {
    public final ArrayList a = new ArrayList();
    public float[] b;

    public wgo() {
        float[] fArr = new float[5];
        for (int i = 0; i < 5; i++) {
            fArr[i] = Float.NaN;
        }
        this.b = fArr;
    }

    public final void a(T t, float f) {
        ArrayList arrayList = this.a;
        arrayList.add(t);
        if (this.b.length < arrayList.size()) {
            this.b = Arrays.copyOf(this.b, arrayList.size() + 2);
        }
        this.b[arrayList.size() - 1] = f;
    }
}
