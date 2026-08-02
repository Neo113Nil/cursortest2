package xsna;

import android.content.Context;
import com.google.android.gms.common.api.b;
import java.util.Locale;
import xsna.rax0;

/* compiled from: GooglePayTransactionsManager.kt */
/* loaded from: classes6.dex */
public final class eau {
    public final ps90 a;

    public eau(Context context, boolean z) {
        rax0.a.C3602a c3602a = new rax0.a.C3602a();
        int i = z ? 1 : 3;
        if (i != 0 && i != 0 && i != 2 && i != 1 && i != 3) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(lhg.a(i, "Invalid environment value "));
        }
        c3602a.a = i;
        this.a = new ps90(context, rax0.a, new rax0.a(c3602a), b.a.c);
    }

    public final io.reactivex.rxjava3.internal.operators.single.b a() {
        return new io.reactivex.rxjava3.internal.operators.single.b(new o40(this, 23));
    }
}
