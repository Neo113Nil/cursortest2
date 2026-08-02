package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes10.dex */
public final class jg21 implements q430 {
    public static final Set b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));
    public final ig21 a;

    public jg21(ig21 ig21Var) {
        this.a = ig21Var;
    }

    @Override // defpackage.q430
    public final p430 a(Object obj, int i, int i2, mg70 mg70Var) {
        gog e93Var;
        Uri uri = (Uri) obj;
        lp60 lp60Var = new lp60(uri);
        ig21 ig21Var = this.a;
        switch (ig21Var.a) {
            case 0:
                e93Var = new e93(ig21Var.b, uri, 0);
                break;
            case 1:
                e93Var = new e93(ig21Var.b, uri, 1);
                break;
            default:
                e93Var = new eru0(1, uri, ig21Var.b);
                break;
        }
        return new p430(lp60Var, e93Var);
    }

    @Override // defpackage.q430
    public final boolean b(Object obj) {
        return b.contains(((Uri) obj).getScheme());
    }
}
