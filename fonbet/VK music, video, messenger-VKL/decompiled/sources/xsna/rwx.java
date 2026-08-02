package xsna;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import ru.rustore.sdk.appupdate.model.AppUpdateParams;
import ru.rustore.sdk.appupdate.model.AppUpdateParamsKt;
import ru.rustore.sdk.core.exception.RuStoreException;
import xsna.brk;

/* loaded from: classes9.dex */
public final class rwx implements ServiceConnection {
    public final Context b;
    public final pzy0 c;
    public final String d;
    public final AppUpdateParams e;
    public final ru.rustore.sdk.appupdate.t f;
    public final ru.rustore.sdk.appupdate.u g;

    public static final class a extends rlv {
        public final /* synthetic */ rwx b;

        public a(rwx rwxVar) {
            this.b = rwxVar;
            attachInterface(this, "ru.vk.store.provider.appupdate.GetAppUpdateInfoCallback");
        }
    }

    public rwx(Context context, pzy0 pzy0Var, String str, AppUpdateParams appUpdateParams, ru.rustore.sdk.appupdate.t tVar, ru.rustore.sdk.appupdate.u uVar) {
        this.b = context;
        this.c = pzy0Var;
        this.d = str;
        this.e = appUpdateParams;
        this.f = tVar;
        this.g = uVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            brk.a.f(iBinder).g0(this.d, AppUpdateParamsKt.toBundle(this.e), new a(this));
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            this.g.invoke(new RuStoreException(message));
            inj.b(this.b, this);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.g.invoke(new RuStoreException("onServiceDisconnected"));
        inj.b(this.b, this);
    }
}
