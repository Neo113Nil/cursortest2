package xsna;

import android.content.Context;
import android.content.Intent;
import java.nio.ByteBuffer;
import javax.net.ssl.SSLEngine;

/* compiled from: TLSSession.kt */
/* loaded from: classes8.dex */
public final class srn0 implements la01 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public srn0(bs01 bs01Var, gtz0 gtz0Var, Intent intent, Context context) {
        this.d = bs01Var;
        this.a = gtz0Var;
        this.b = intent;
        this.c = context;
    }

    @Override // xsna.la01
    public void a(int i) {
        bs01 bs01Var = (bs01) this.d;
        bs01Var.g.post(new lr01(bs01Var, (gtz0) this.a, 6, i));
    }

    public ByteBuffer b() {
        return (ByteBuffer) ((bpn0) this.d).getValue();
    }

    public ByteBuffer c() {
        return (ByteBuffer) ((bpn0) this.c).getValue();
    }

    public ByteBuffer d() {
        return (ByteBuffer) ((bpn0) this.b).getValue();
    }

    @Override // xsna.la01
    public void zza() {
        bs01 bs01Var = (bs01) this.d;
        bs01Var.g.post(new lr01(bs01Var, (gtz0) this.a, 5, 0));
    }

    @Override // xsna.la01
    public void zzc() {
        Intent intent = (Intent) this.b;
        if (intent.getBooleanExtra("triggered_from_app_after_verification", false)) {
            ((bs01) this.d).a.b("Splits copied and verified more than once.", new Object[0]);
        } else {
            intent.putExtra("triggered_from_app_after_verification", true);
            ((Context) this.c).sendBroadcast(intent);
        }
    }

    public srn0(SSLEngine sSLEngine) {
        this.a = sSLEngine;
        this.b = new bpn0(new rrn0(this, 0));
        this.c = new bpn0(new kcj0(this, 4));
        this.d = new bpn0(new l6n0(this, 2));
    }
}
