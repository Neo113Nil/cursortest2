package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import com.google.android.gms.common.api.internal.f;

/* loaded from: classes11.dex */
public final class c091 extends ny81 {
    public final /* synthetic */ Dialog a;
    public final /* synthetic */ f b;

    public c091(f fVar, AlertDialog alertDialog) {
        this.b = fVar;
        this.a = alertDialog;
    }

    @Override // defpackage.ny81
    public final void a() {
        this.b.b.zad();
        Dialog dialog = this.a;
        if (dialog.isShowing()) {
            dialog.dismiss();
        }
    }
}
