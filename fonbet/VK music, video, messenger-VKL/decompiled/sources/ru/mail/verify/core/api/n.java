package ru.mail.verify.core.api;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import ru.mail.libverify.a0.a;
import ru.mail.libverify.g0.q;
import ru.mail.libverify.g0.r;
import ru.mail.libverify.p0.e;
import ru.mail.verify.core.api.ApplicationModule;
import ru.mail.verify.core.utils.FileLog;
import ru.mail.verify.core.utils.SocketFactoryProvider;
import ru.mail.verify.core.utils.components.MessageBus;
import ru.mail.verify.core.utils.network.NetworkStateReceiver;
import xsna.anj;

/* loaded from: classes9.dex */
public class n implements q, ru.mail.libverify.p0.f {

    @NonNull
    private final Context a;

    @NonNull
    private final MessageBus b;

    @NonNull
    private final ApplicationModule.NetworkPolicyConfig c;

    @Nullable
    protected final SocketFactoryProvider d;

    @NonNull
    private r e = r.DEFAULT;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[r.values().length];
            a = iArr;
            try {
                iArr[r.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[r.WIFI_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[r.CELLULAR_IF_NOT_METERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[r.DISABLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public n(@NonNull Context context, @NonNull MessageBus messageBus, @NonNull ApplicationModule.NetworkPolicyConfig networkPolicyConfig, @Nullable SocketFactoryProvider socketFactoryProvider) {
        this.a = context;
        this.b = messageBus;
        this.c = networkPolicyConfig;
        this.d = socketFactoryProvider;
    }

    @Override // ru.mail.libverify.g0.f
    public final void a() {
        this.b.register(Collections.singletonList(ru.mail.libverify.p0.a.API_APPLICATION_START_CONFIG_CHANGED), this);
    }

    @Override // ru.mail.libverify.g0.q
    public final boolean b() {
        r networkSyncMode = this.c.getNetworkSyncMode();
        this.e = networkSyncMode;
        return a(networkSyncMode);
    }

    @Override // ru.mail.libverify.g0.q
    public final boolean d() {
        return NetworkStateReceiver.f(this.a);
    }

    @Override // ru.mail.libverify.g0.q
    public final void e() {
        NetworkStateReceiver.h(this.a);
    }

    @Override // ru.mail.libverify.g0.q
    public final boolean f() {
        Context context = this.a;
        int i = NetworkStateReceiver.c;
        if (anj.a(context, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            try {
                return a.C2189a.a(context, null).n();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    @Override // ru.mail.libverify.g0.q
    public final boolean g() {
        try {
            FileLog.d("Utils", "proxy host %s", System.getProperty("http.proxyHost"));
            return !TextUtils.isEmpty(r1);
        } catch (Throwable th) {
            FileLog.e("Utils", "Failed to check proxy settings", th);
            return false;
        }
    }

    @Override // ru.mail.libverify.p0.f
    public final boolean handleMessage(@NonNull Message message) {
        if (ru.mail.libverify.p0.e.a(message, "NetworkManager", e.b.NORMAL) != ru.mail.libverify.p0.a.API_APPLICATION_START_CONFIG_CHANGED) {
            return false;
        }
        r networkSyncMode = this.c.getNetworkSyncMode();
        if (networkSyncMode == this.e) {
            return true;
        }
        boolean a2 = a(networkSyncMode);
        this.b.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.NETWORK_STATE_CHANGED, Boolean.valueOf(a2)));
        FileLog.v("NetworkManager", "Network sync mode changed from %s to %s (online = %s)", this.e, networkSyncMode, Boolean.valueOf(a2));
        this.e = networkSyncMode;
        return true;
    }

    private boolean a(@NonNull r rVar) {
        int i = a.a[rVar.ordinal()];
        if (i == 1) {
            return NetworkStateReceiver.e(this.a);
        }
        if (i == 2) {
            return NetworkStateReceiver.e(this.a) && NetworkStateReceiver.b(this.a);
        }
        if (i == 3) {
            return (!NetworkStateReceiver.e(this.a) || NetworkStateReceiver.a(this.a).booleanValue() || NetworkStateReceiver.g(this.a)) ? false : true;
        }
        if (i == 4) {
            return false;
        }
        FileLog.e("NetworkManager", "Illegal mode: " + rVar.name());
        throw new IllegalArgumentException("Illegal mode");
    }
}
