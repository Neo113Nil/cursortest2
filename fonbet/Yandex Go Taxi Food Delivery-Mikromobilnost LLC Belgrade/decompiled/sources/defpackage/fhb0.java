package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes10.dex */
public final class fhb0 implements nzc0 {
    public final Context a;
    public Activity b;
    public ozj0 c;

    public fhb0(Context context) {
        this.a = context;
    }

    @Override // defpackage.nzc0
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        if (i != 40071) {
            return false;
        }
        ozj0 ozj0Var = this.c;
        if (ozj0Var != null) {
            ozj0Var.a(Boolean.valueOf(i2 == -1));
        }
        this.c = null;
        return true;
    }
}
