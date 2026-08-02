package defpackage;

import android.net.Uri;
import com.adjust.sdk.Constants;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes10.dex */
public final class ai21 implements q430 {
    public static final Set b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", Constants.SCHEME)));
    public final q430 a;

    public ai21(q430 q430Var) {
        this.a = q430Var;
    }

    @Override // defpackage.q430
    public final p430 a(Object obj, int i, int i2, mg70 mg70Var) {
        return this.a.a(new cit(((Uri) obj).toString(), peu.a), i, i2, mg70Var);
    }

    @Override // defpackage.q430
    public final boolean b(Object obj) {
        return b.contains(((Uri) obj).getScheme());
    }
}
