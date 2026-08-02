package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
public abstract class fam0 extends gc5 {
    public fam0(String str, int i) {
        super((i & 1) != 0 ? "" : str, "SavingsCellItem");
    }

    public abstract aam0 c(Context context);

    public fam0() {
        this(null, 3);
    }
}
