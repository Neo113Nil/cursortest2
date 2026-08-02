package defpackage;

import android.content.Context;
import com.android.billingclient.api.a;
import com.android.billingclient.api.e;
import com.google.android.gms.internal.play_billing.g;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class h32 {
    public volatile Object a;
    public final Object b;
    public volatile Object c;

    public h32(cg70 cg70Var) {
        unj unjVar = new unj();
        mw11 mw11Var = new mw11();
        this.c = unjVar;
        this.b = new ArrayList();
        this.a = mw11Var;
        cg70Var.a(new g32(this));
    }

    public a a() {
        if (((Context) this.b) == null) {
            ny61.g("Please provide a valid Context.");
            return null;
        }
        if (((l0g0) this.c) == null) {
            ny61.g("Please provide a valid listener for purchases updates.");
            return null;
        }
        if (((vms) this.a) == null) {
            ny61.g("Pending purchases for one-time products must be supported.");
            return null;
        }
        ((vms) this.a).getClass();
        l0g0 l0g0Var = (l0g0) this.c;
        vms vmsVar = (vms) this.a;
        Context context = (Context) this.b;
        if (l0g0Var == null) {
            return b() ? new e(vmsVar, context) : new a(vmsVar, context);
        }
        l0g0 l0g0Var2 = (l0g0) this.c;
        return b() ? new e(vmsVar, context, l0g0Var2) : new a(vmsVar, context, l0g0Var2);
    }

    public boolean b() {
        Context context = (Context) this.b;
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
        } catch (Exception unused) {
            g.h("BillingClient");
            return false;
        }
    }

    public /* synthetic */ h32(Object obj) {
        this.b = obj;
    }
}
