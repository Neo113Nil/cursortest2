package xsna;

import ru.ok.android.api.core.ApiInvocationException;

/* compiled from: FilterItems.kt */
/* loaded from: classes18.dex */
public final class mec extends nmo {
    public dz00 l;

    public mec() {
        this(null, null, null, null, null, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mec(wqd0 wqd0Var, wqd0 wqd0Var2, String str, String str2, dz00 dz00Var, int i) {
        super(r3, r4, r5, r6, r7, null);
        wqd0 wqd0Var3 = (i & 1) != 0 ? null : wqd0Var;
        wqd0 wqd0Var4 = (i & 2) != 0 ? null : wqd0Var2;
        int i2 = (i & 4) != 0 ? 1 : 5;
        String str3 = (i & 8) != 0 ? null : str;
        String str4 = (i & 16) != 0 ? null : str2;
        dz00Var = (i & 256) != 0 ? null : dz00Var;
        this.l = dz00Var;
    }
}
