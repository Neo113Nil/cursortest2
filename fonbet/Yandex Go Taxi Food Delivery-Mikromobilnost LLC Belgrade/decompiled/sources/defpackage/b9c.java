package defpackage;

import android.text.Editable;
import android.text.Layout;

/* loaded from: classes15.dex */
public final class b9c {
    public final int a = e8m.a(7);

    public static void a(b9c b9cVar, Editable editable, Layout layout, int i) {
        if ((i & 64) != 0) {
            int i2 = b9cVar.a;
        }
        int i3 = b9cVar.a;
        b9cVar.getClass();
        if (editable == null || layout == null) {
            return;
        }
        int i4 = 0;
        xxk0[] xxk0VarArr = (xxk0[]) editable.getSpans(0, editable.length(), xxk0.class);
        if (xxk0VarArr == null || xxk0VarArr.length == 0) {
            return;
        }
        while (i4 < xxk0VarArr.length) {
            int i5 = i4 + 1;
            try {
                xxk0 xxk0Var = xxk0VarArr[i4];
                int lineForOffset = layout.getLineForOffset(editable.getSpanStart(null));
                if (lineForOffset <= layout.getLineForOffset(editable.getSpanEnd(null) - 1)) {
                    layout.getLineTop(lineForOffset);
                    layout.getLineBottom(lineForOffset);
                    throw null;
                }
                i4 = i5;
            } catch (ArrayIndexOutOfBoundsException e) {
                w511.i(e.getMessage());
                return;
            }
        }
    }
}
