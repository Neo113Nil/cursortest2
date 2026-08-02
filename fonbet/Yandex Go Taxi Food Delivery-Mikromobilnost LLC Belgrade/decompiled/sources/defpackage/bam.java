package defpackage;

import androidx.compose.material3.SheetValue;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class bam {
    public final ArrayList a = new ArrayList();
    public float[] b;

    public bam() {
        float[] fArr = new float[5];
        for (int i = 0; i < 5; i++) {
            fArr[i] = Float.NaN;
        }
        this.b = fArr;
    }

    public final void a(SheetValue sheetValue, float f) {
        ArrayList arrayList = this.a;
        arrayList.add(sheetValue);
        if (this.b.length < arrayList.size()) {
            this.b = Arrays.copyOf(this.b, arrayList.size() + 2);
        }
        this.b[arrayList.size() - 1] = f;
    }
}
