package xsna;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import ru.rustore.sdk.appupdate.C5387p;
import ru.rustore.sdk.appupdate.C5388q;
import ru.rustore.sdk.appupdate.errors.RemoteProviderErrors;
import ru.rustore.sdk.core.exception.RuStoreException;
import xsna.b9y0;
import xsna.brk;

/* loaded from: classes9.dex */
public final class tey0 implements ServiceConnection {
    public final Context b;
    public final String c;
    public final C5387p d;
    public final C5388q e;

    public tey0(Context context, String str, C5387p c5387p, C5388q c5388q) {
        this.b = context;
        this.c = str;
        this.d = c5387p;
        this.e = c5388q;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            brk.a.f(iBinder).e0(this.c, new a(this));
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            this.e.invoke(new RuStoreException(message));
            inj.b(this.b, this);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.e.invoke(new RuStoreException("onServiceDisconnected"));
        inj.b(this.b, this);
    }

    public static final class a extends b9y0.a {
        public final /* synthetic */ tey0 b;

        public a(tey0 tey0Var) {
            this.b = tey0Var;
        }

        @Override // xsna.b9y0
        public final void a(int i, String str) {
            tey0 tey0Var = tey0.this;
            tey0Var.e.invoke(RemoteProviderErrors.INSTANCE.toRuStoreException(i, str));
            inj.b(tey0Var.b, this.b);
        }

        @Override // xsna.b9y0
        public final void a() {
            tey0 tey0Var = tey0.this;
            tey0Var.d.invoke();
            inj.b(tey0Var.b, this.b);
        }
    }
}
