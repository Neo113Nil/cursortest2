package defpackage;

import com.monetization.ads.network.core.Request;
import java.io.UnsupportedEncodingException;

/* loaded from: classes7.dex */
public final class nl71 extends Request {
    public final Object a;
    public fj81 b;

    public nl71(String str, fj81 fj81Var, wf81 wf81Var) {
        super(0, str, wf81Var);
        this.a = new Object();
        this.b = fj81Var;
    }

    @Override // com.monetization.ads.network.core.Request
    public final void cancel() {
        super.cancel();
        synchronized (this.a) {
            this.b = null;
        }
    }

    @Override // com.monetization.ads.network.core.Request
    public final void deliverResponse(Object obj) {
        fj81 fj81Var;
        String str = (String) obj;
        synchronized (this.a) {
            fj81Var = this.b;
        }
        if (fj81Var != null) {
            fj81Var.a(str);
        }
    }

    @Override // com.monetization.ads.network.core.Request
    public final km81 parseNetworkResponse(gb81 gb81Var) {
        String str;
        try {
            str = new String(gb81Var.b, hba1.c(gb81Var.c));
        } catch (UnsupportedEncodingException unused) {
            str = new String(gb81Var.b);
        }
        return new km81(str, hba1.d(gb81Var));
    }
}
