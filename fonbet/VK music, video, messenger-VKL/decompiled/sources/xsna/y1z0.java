package xsna;

import android.content.Context;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class y1z0 implements t3z0 {
    public final b1z0 a;
    public final mez0 b;
    public final WeakReference c;
    public final cwm d;

    public y1z0(b1z0 b1z0Var, mez0 mez0Var, cwm cwmVar, Context context) {
        this.a = b1z0Var;
        this.b = mez0Var;
        this.d = cwmVar;
        this.c = new WeakReference(context.getApplicationContext());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    @Override // xsna.t3z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(lwo0 lwo0Var) {
        x8c x8cVar;
        gaz0 gaz0Var;
        String string;
        cwm cwmVar = this.d;
        if (cwmVar == null) {
            gu8.c(null, "ShoppablePostMessageHandler hasn't shoppableAdsData");
            return;
        }
        if (!((String) lwo0Var.a).equals("shoppable")) {
            gu8.c(null, "ShoppablePostMessageHandler has wrong postMessage type");
            return;
        }
        if (!((String) lwo0Var.b).equals("click")) {
            gu8.c(null, "ShoppablePostMessageHandler has wrong postMessage action");
            return;
        }
        try {
            string = new JSONObject((String) lwo0Var.c).getString("id");
        } catch (Throwable th) {
            eb3.a(null, new StringBuilder("ShoppablePostMessageParamsParser: can't parse shoppablePostMessageParams – "), th);
        }
        if (TextUtils.isEmpty(string)) {
            gu8.c(null, "ShoppablePostMessageParamsParser: can't parse shoppablePostMessageParams – shoppableAdsDataId is empty");
            x8cVar = null;
            if (x8cVar != null) {
                gu8.c(null, "ShoppablePostMessageHandler has wrong parse post message params");
                return;
            }
            String str = (String) x8cVar.b;
            Context context = (Context) this.c.get();
            if (context == null) {
                gu8.c(null, "ShoppablePostMessageHandler hasn't context");
                return;
            }
            Iterator it = ((ArrayList) cwmVar.b).iterator();
            while (true) {
                if (!it.hasNext()) {
                    gaz0Var = null;
                    break;
                } else {
                    gaz0Var = (gaz0) it.next();
                    if (str.equals(gaz0Var.b)) {
                        break;
                    }
                }
            }
            if (gaz0Var == null) {
                gu8.c(null, "ShoppablePostMessageHandler cannot find internalShoppableAdsData by id");
                return;
            }
            h8z0.e(gaz0Var.i, "click", 2, null);
            this.b.f(this.a, gaz0Var.e, gaz0Var.f, gaz0Var.a, context);
            return;
        }
        x8cVar = new x8c(string);
        if (x8cVar != null) {
        }
    }
}
