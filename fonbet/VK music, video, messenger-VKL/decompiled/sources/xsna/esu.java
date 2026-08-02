package xsna;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import ru.rustore.sdk.appupdate.C5384m;
import ru.rustore.sdk.appupdate.C5385n;
import ru.rustore.sdk.core.exception.RuStoreException;
import xsna.brk;

/* loaded from: classes9.dex */
public final class esu implements ServiceConnection {
    public final Context b;
    public final String c;
    public final C5384m d;
    public final C5385n e;

    public static final class a extends fnv {
        public final /* synthetic */ esu e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(esu esuVar) {
            super(2);
            this.e = esuVar;
            attachInterface(this, "ru.vk.store.provider.appupdate.CompleteUpdateFlowCallback");
        }
    }

    public esu(Context context, String str, C5384m c5384m, C5385n c5385n) {
        this.b = context;
        this.c = str;
        this.d = c5384m;
        this.e = c5385n;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            brk.a.f(iBinder).k1(this.c, new a(this));
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
}
