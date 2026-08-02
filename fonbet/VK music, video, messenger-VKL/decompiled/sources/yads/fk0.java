package yads;

import android.content.Context;
import android.graphics.drawable.Drawable;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes10.dex */
public final class fk0 {
    public final ak0 a;

    public fk0(Context context) {
        this.a = new ak0(context.getApplicationContext());
    }

    public final Drawable a(byte[] bArr) {
        zj0 hqVar;
        v41 a = w41.a(bArr);
        ak0 ak0Var = this.a;
        ak0Var.getClass();
        int ordinal = a.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2) {
                hqVar = new pz0();
                return hqVar.a(bArr, ak0Var.a.getApplicationContext());
            }
            if (ordinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        hqVar = new hq();
        return hqVar.a(bArr, ak0Var.a.getApplicationContext());
    }
}
