package com.google.android.gms.gcm;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.ny61;
import defpackage.zra1;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes11.dex */
public class Task implements ReflectedParcelable {
    public static final int EXTRAS_LIMIT_BYTES = 10240;
    public static final int NETWORK_STATE_ANY = 2;
    public static final int NETWORK_STATE_CONNECTED = 0;
    public static final int NETWORK_STATE_UNMETERED = 1;
    protected static final long UNINITIALIZED = -1;
    private final Bundle extras;
    private final String gcmTaskService;
    private final boolean isPersisted;
    private final int requiredNetworkState;
    private final boolean requiresCharging;
    private final String tag;
    private final boolean updateCurrent;
    private final Set<Uri> zzaw;
    private final boolean zzax;
    private final zra1 zzay;

    public static abstract class a {
        public boolean a;
        public final Set b = Collections.EMPTY_SET;
        public final zra1 c = zra1.a;
    }

    @Deprecated
    public Task(Parcel parcel) {
        Log.e("Task", "Constructing a Task object using a parcel.");
        this.gcmTaskService = parcel.readString();
        this.tag = parcel.readString();
        this.updateCurrent = parcel.readInt() == 1;
        this.isPersisted = parcel.readInt() == 1;
        this.requiredNetworkState = 2;
        this.zzaw = Collections.EMPTY_SET;
        this.requiresCharging = false;
        this.zzax = false;
        this.zzay = zra1.a;
        this.extras = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzd(Uri uri) {
        if (uri == null) {
            ny61.g("Null URI");
            return;
        }
        String scheme = uri.getScheme();
        String host = uri.getHost();
        if (TextUtils.isEmpty(host) || "null".equals(host)) {
            ny61.g("URI hostname is required");
            return;
        }
        try {
            int port = uri.getPort();
            if (!"tcp".equals(scheme)) {
                if (!"ping".equals(scheme)) {
                    String valueOf = String.valueOf(scheme);
                    throw new IllegalArgumentException(valueOf.length() != 0 ? "Unsupported required URI scheme: ".concat(valueOf) : new String("Unsupported required URI scheme: "));
                }
                if (port == -1) {
                    return;
                }
                ny61.g("Ping does not support port numbers");
                return;
            }
            if (port <= 0 || port > 65535) {
                int port2 = uri.getPort();
                StringBuilder sb = new StringBuilder(38);
                sb.append("Invalid required URI port: ");
                sb.append(port2);
                throw new IllegalArgumentException(sb.toString());
            }
        } catch (NumberFormatException e) {
            String valueOf2 = String.valueOf(e.getMessage());
            throw new IllegalArgumentException(valueOf2.length() != 0 ? "Invalid port number: ".concat(valueOf2) : new String("Invalid port number: "));
        }
    }

    public static void zzg(Bundle bundle) {
        if (bundle != null) {
            Parcel obtain = Parcel.obtain();
            bundle.writeToParcel(obtain, 0);
            int dataSize = obtain.dataSize();
            obtain.recycle();
            if (dataSize > 10240) {
                StringBuilder sb = new StringBuilder(55);
                sb.append("Extras exceeding maximum size(10240 bytes): ");
                sb.append(dataSize);
                throw new IllegalArgumentException(sb.toString());
            }
            Iterator<String> it = bundle.keySet().iterator();
            while (it.hasNext()) {
                Object obj = bundle.get(it.next());
                if (!(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Double) && !(obj instanceof String) && !(obj instanceof Boolean)) {
                    if (!(obj instanceof Bundle)) {
                        ny61.g("Only the following extra parameter types are supported: Integer, Long, Double, String, Boolean, and nested Bundles with the same restrictions.");
                        return;
                    }
                    zzg((Bundle) obj);
                }
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Bundle getExtras() {
        return this.extras;
    }

    public int getRequiredNetwork() {
        return this.requiredNetworkState;
    }

    public boolean getRequiresCharging() {
        return this.requiresCharging;
    }

    public String getServiceName() {
        return this.gcmTaskService;
    }

    public String getTag() {
        return this.tag;
    }

    public boolean isPersisted() {
        return this.isPersisted;
    }

    public boolean isUpdateCurrent() {
        return this.updateCurrent;
    }

    public void toBundle(Bundle bundle) {
        bundle.putString("tag", this.tag);
        bundle.putBoolean("update_current", this.updateCurrent);
        bundle.putBoolean("persisted", this.isPersisted);
        bundle.putString(Constants.KEY_SERVICE, this.gcmTaskService);
        bundle.putInt("requiredNetwork", this.requiredNetworkState);
        if (!this.zzaw.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>();
            Iterator<Uri> it = this.zzaw.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().toString());
            }
            bundle.putStringArrayList("reachabilityUris", arrayList);
        }
        bundle.putBoolean("requiresCharging", this.requiresCharging);
        bundle.putBoolean("requiresIdle", false);
        zra1 zra1Var = this.zzay;
        Bundle bundle2 = new Bundle();
        zra1Var.getClass();
        bundle2.putInt("retry_policy", 0);
        bundle2.putInt("initial_backoff_seconds", 30);
        bundle2.putInt("maximum_backoff_seconds", 3600);
        bundle.putBundle("retryStrategy", bundle2);
        bundle.putBundle("extras", this.extras);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.gcmTaskService);
        parcel.writeString(this.tag);
        parcel.writeInt(this.updateCurrent ? 1 : 0);
        parcel.writeInt(this.isPersisted ? 1 : 0);
    }

    public Task(a aVar) {
        aVar.getClass();
        this.gcmTaskService = null;
        this.tag = null;
        this.updateCurrent = false;
        this.isPersisted = aVar.a;
        this.requiredNetworkState = 0;
        this.zzaw = aVar.b;
        this.requiresCharging = false;
        this.zzax = false;
        this.extras = null;
        zra1 zra1Var = aVar.c;
        this.zzay = zra1Var == null ? zra1.a : zra1Var;
    }
}
