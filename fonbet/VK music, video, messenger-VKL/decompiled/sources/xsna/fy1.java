package xsna;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import java.util.Iterator;
import java.util.Map;
import ru.rustore.sdk.core.exception.RuStoreException;
import xsna.dy1;

/* compiled from: AnalyticsProviderServiceConnection.kt */
/* loaded from: classes9.dex */
public final class fy1 implements ServiceConnection {
    public final String b;
    public final String c;
    public final Map<String, String> d;
    public final vx1 e;
    public final wx1 f;

    /* compiled from: AnalyticsProviderServiceConnection.kt */
    public static final class a extends ey1 {
        public a() {
            attachInterface(this, "ru.vk.store.provider.analytics.AnalyticsProviderCallback");
        }
    }

    public fy1(String str, String str2, Map map, vx1 vx1Var, wx1 wx1Var) {
        this.b = str;
        this.c = str2;
        this.d = map;
        this.e = vx1Var;
        this.f = wx1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10, types: [xsna.dy1] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        dy1.a.C2769a c2769a;
        try {
            int i = dy1.a.a;
            if (iBinder == null) {
                c2769a = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("ru.vk.store.provider.analytics.AnalyticsProvider");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof dy1)) {
                    dy1.a.C2769a c2769a2 = new dy1.a.C2769a();
                    c2769a2.a = iBinder;
                    c2769a = c2769a2;
                } else {
                    c2769a = (dy1) queryLocalInterface;
                }
            }
            a aVar = new a();
            String str = this.b;
            String str2 = this.c;
            Map<String, String> map = this.d;
            Bundle bundle = new Bundle(map.size());
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                bundle.putString((String) entry.getKey(), (String) entry.getValue());
            }
            c2769a.d1(str, str2, bundle, aVar);
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            this.f.invoke(new RuStoreException(message));
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f.invoke(new RuStoreException("onServiceDisconnected"));
    }
}
