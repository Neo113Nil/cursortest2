package xsna;

import android.content.Context;
import xsna.wjg0;

/* compiled from: TemporalFileController.kt */
/* loaded from: classes7.dex */
public final class n9o0 {
    public final Context a;
    public final ku90[] b = {yu90.a, ou90.a};

    public n9o0(Context context) {
        this.a = context;
    }

    public final ju90<?> a(wjg0.a aVar) {
        ku90 ku90Var;
        String type = this.a.getContentResolver().getType(aVar.b);
        if (type == null) {
            type = "application/*";
        }
        ku90[] ku90VarArr = this.b;
        int length = ku90VarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                ku90Var = null;
                break;
            }
            ku90Var = ku90VarArr[i];
            if (ku90Var.b(type)) {
                break;
            }
            i++;
        }
        if (ku90Var != null) {
            return ku90Var.a(aVar);
        }
        throw new UnsupportedOperationException("Can't transform file with type = ".concat(type));
    }
}
