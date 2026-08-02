package defpackage;

import android.content.Context;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class fq71 implements jt71 {
    public final Context a;
    public final ms71 b;

    public fq71(Context context, ms71 ms71Var) {
        this.a = context;
        this.b = ms71Var;
    }

    @Override // defpackage.jt71
    public final Parcelable getValue() {
        return pv71.a(this.a, this.b);
    }
}
