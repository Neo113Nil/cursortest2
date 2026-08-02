package defpackage;

import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeScanner;
import android.content.Context;
import android.content.Intent;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import org.altbeacon.beacon.BeaconParser;
import org.altbeacon.beacon.b;
import org.altbeacon.beacon.service.ExtraDataBeaconTracker;
import org.altbeacon.beacon.startup.StartupBroadcastReceiver;

/* loaded from: classes4.dex */
public final class mlm0 {
    public static final /* synthetic */ int k = 0;
    public ExecutorService a;
    public final b b;
    public xof c;
    public i630 d;
    public final Context i;
    public final HashMap e = new HashMap();
    public final d2k f = new d2k();
    public ExtraDataBeaconTracker g = new ExtraDataBeaconTracker();
    public Set h = new HashSet();
    public final aye0 j = new aye0(29, this);

    public mlm0(Context context) {
        this.i = context;
        this.b = b.j(context);
    }

    public final ExecutorService a() {
        ExecutorService executorService = this.a;
        if (executorService != null) {
            executorService.isShutdown();
        }
        if (this.a == null) {
            this.a = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() + 1);
        }
        return this.a;
    }

    public final void b(int i, long j, BluetoothDevice bluetoothDevice, byte[] bArr) {
        this.b.getClass();
        try {
            a().execute(new lz(this, new d2e0(this, bluetoothDevice, i, bArr, j)));
        } catch (OutOfMemoryError | RejectedExecutionException unused) {
        }
    }

    public final void c() {
        HashSet hashSet = new HashSet();
        b bVar = this.b;
        hashSet.addAll(bVar.i);
        Iterator<E> it = bVar.i.iterator();
        boolean z = true;
        while (it.hasNext()) {
            BeaconParser beaconParser = (BeaconParser) it.next();
            if (beaconParser.g().size() > 0) {
                hashSet.addAll(beaconParser.g());
                z = false;
            }
        }
        this.h = hashSet;
        this.g = new ExtraDataBeaconTracker(z);
    }

    public final void d(Map map) {
        map.size();
        synchronized (this.e) {
            this.e.clear();
            this.e.putAll(map);
        }
    }

    public final void e() {
        Context context = this.i;
        try {
            BluetoothAdapter adapter = ((BluetoothManager) context.getApplicationContext().getSystemService("bluetooth")).getAdapter();
            if (adapter == null) {
                return;
            }
            adapter.isEnabled();
            BluetoothLeScanner bluetoothLeScanner = adapter.getBluetoothLeScanner();
            if (bluetoothLeScanner != null) {
                Intent intent = new Intent(context, (Class<?>) StartupBroadcastReceiver.class);
                intent.putExtra("o-scan", true);
                bluetoothLeScanner.stopScan(PendingIntent.getBroadcast(context, 0, intent, 167772160));
            }
        } catch (NullPointerException | SecurityException | RuntimeException unused) {
        }
    }

    public final void f() {
        ExecutorService executorService = this.a;
        if (executorService != null) {
            executorService.shutdown();
            try {
                this.a.awaitTermination(10L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
            }
            this.a = null;
        }
    }

    public final void finalize() {
        super.finalize();
        f();
    }
}
