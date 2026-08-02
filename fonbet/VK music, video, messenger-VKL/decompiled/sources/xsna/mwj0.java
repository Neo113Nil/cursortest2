package xsna;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import xsna.q4j;

/* compiled from: SingletonConnectivityReceiver.java */
/* loaded from: classes12.dex */
public final class mwj0 {
    public static volatile mwj0 d;
    public final c a;
    public final HashSet b = new HashSet();
    public boolean c;

    /* compiled from: SingletonConnectivityReceiver.java */
    public class a implements d1u<ConnectivityManager> {
        public final /* synthetic */ Context b;

        public a(Context context) {
            this.b = context;
        }

        @Override // xsna.d1u
        public final ConnectivityManager get() {
            return (ConnectivityManager) this.b.getSystemService("connectivity");
        }
    }

    /* compiled from: SingletonConnectivityReceiver.java */
    public class b implements q4j.a {
        public b() {
        }

        @Override // xsna.q4j.a
        public final void a(boolean z) {
            ArrayList arrayList;
            s2r0.a();
            synchronized (mwj0.this) {
                arrayList = new ArrayList(mwj0.this.b);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((q4j.a) it.next()).a(z);
            }
        }
    }

    /* compiled from: SingletonConnectivityReceiver.java */
    public static final class c {
        public boolean a;
        public final b b;
        public final c1u c;
        public final a d = new a();

        /* compiled from: SingletonConnectivityReceiver.java */
        public class a extends ConnectivityManager.NetworkCallback {
            public a() {
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onAvailable(@NonNull Network network) {
                s2r0.f().post(new nwj0(this, true));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onLost(@NonNull Network network) {
                s2r0.f().post(new nwj0(this, false));
            }
        }

        public c(c1u c1uVar, b bVar) {
            this.c = c1uVar;
            this.b = bVar;
        }
    }

    public mwj0(@NonNull Context context) {
        this.a = new c(new c1u(new a(context)), new b());
    }

    public static mwj0 a(@NonNull Context context) {
        if (d == null) {
            synchronized (mwj0.class) {
                try {
                    if (d == null) {
                        d = new mwj0(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return d;
    }
}
