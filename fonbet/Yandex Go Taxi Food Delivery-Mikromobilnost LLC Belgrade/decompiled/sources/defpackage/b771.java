package defpackage;

import android.content.Context;
import com.monetization.ads.network.core.Request;
import yads.ck0;
import yads.y92;

/* loaded from: classes7.dex */
public final class b771 extends Request {
    public static final Object w = new Object();
    public final ji41 a;
    public final ck0 b;
    public final cr81 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b771(String str, Context context, ck0 ck0Var, gs51 gs51Var) {
        super(0, str, gs51Var);
        ji41 ji41Var = new ji41(context.getApplicationContext(), 18);
        this.a = ji41Var;
        this.b = ck0Var;
        this.c = new cr81();
        setRetryPolicy(new nv71(2.0f, 1000, 2));
        setShouldCache(false);
    }

    @Override // com.monetization.ads.network.core.Request
    public final void deliverResponse(Object obj) {
        this.b.invoke((ma71) obj);
    }

    @Override // com.monetization.ads.network.core.Request
    public final km81 parseNetworkResponse(gb81 gb81Var) {
        km81 km81Var;
        synchronized (w) {
            try {
                cr81 cr81Var = this.c;
                byte[] bArr = gb81Var.b;
                cr81Var.getClass();
                km81Var = new km81(new ma71(this.a.M(gb81Var.b), cr81.a(bArr)), hba1.d(gb81Var));
            } catch (Exception e) {
                km81Var = new km81(new y92(e));
            } catch (OutOfMemoryError e2) {
                int length = gb81Var.b.length;
                getUrl();
                boolean z = ew71.a;
                km81Var = new km81(new y92(e2));
            }
        }
        return km81Var;
    }
}
