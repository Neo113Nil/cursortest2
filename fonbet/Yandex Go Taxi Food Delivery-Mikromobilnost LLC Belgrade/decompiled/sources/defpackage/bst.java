package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes8.dex */
public final class bst {
    public final Context a;
    public final q0b0 b;

    public bst(Context context) {
        this.a = context;
        this.b = new q0b0(context);
    }

    public final boolean a(Intent intent) {
        hst hstVar = jst.e;
        try {
            intent.addFlags(SelfTester_JCP.IMITA);
            this.a.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException e) {
            hst hstVar2 = jst.e;
            ke00 a = hstVar2.b.a();
            if (a == null || !a.b(15)) {
                return false;
            }
            a.a(15, "IntentUrlOpener", e, "Unable to start activity by " + intent, hstVar2.a);
            return false;
        }
    }

    public final void b(Intent intent) {
        try {
            this.a.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            hst hstVar = jst.e;
            ke00 a = hstVar.b.a();
            if (a == null || !a.b(15)) {
                return;
            }
            a.a(15, "IntentUrlOpener", e, unr0.n(intent.getData(), "Failed to find corresponding activity for opening "), hstVar.a);
        }
    }
}
