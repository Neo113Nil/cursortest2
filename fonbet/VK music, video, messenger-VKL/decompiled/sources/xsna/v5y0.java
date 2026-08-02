package xsna;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import ru.rustore.sdk.appupdate.A;
import ru.rustore.sdk.appupdate.errors.RemoteProviderErrors;
import ru.rustore.sdk.core.exception.RuStoreException;
import xsna.b9y0;
import xsna.brk;

/* loaded from: classes9.dex */
public final class v5y0 implements ServiceConnection {
    public final Context b;
    public final String c;
    public final ru.rustore.sdk.appupdate.z d;
    public final A e;

    public v5y0(Context context, String str, ru.rustore.sdk.appupdate.z zVar, A a2) {
        this.b = context;
        this.c = str;
        this.d = zVar;
        this.e = a2;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            brk.a.f(iBinder).n0(this.c, new a(this));
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
        public final /* synthetic */ v5y0 b;

        public a(v5y0 v5y0Var) {
            this.b = v5y0Var;
        }

        @Override // xsna.b9y0
        public final void a(int i, String str) {
            v5y0 v5y0Var = v5y0.this;
            v5y0Var.e.invoke(RemoteProviderErrors.INSTANCE.toRuStoreException(i, str));
            inj.b(v5y0Var.b, this.b);
        }

        @Override // xsna.b9y0
        public final void a() {
            v5y0 v5y0Var = v5y0.this;
            v5y0Var.d.invoke();
            inj.b(v5y0Var.b, this.b);
        }
    }
}
