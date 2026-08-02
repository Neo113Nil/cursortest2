package defpackage;

import android.content.Context;
import android.os.Looper;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.altbeacon.beacon.Region;
import org.altbeacon.beacon.service.Callback;
import org.altbeacon.beacon.service.RegionMonitoringState;
import yads.ih3;

/* loaded from: classes4.dex */
public final class i630 {
    public static volatile i630 f;
    public static final Object g = new Object();
    public final /* synthetic */ int a;
    public boolean b;
    public boolean c;
    public Object d;
    public Object e;

    public i630(Context context, Looper looper, o2x0 o2x0Var, int i) {
        this.a = i;
        switch (i) {
            case 3:
                this.d = new rr41(context.getApplicationContext(), 1);
                this.e = o2x0Var.a(looper, null);
                break;
            default:
                this.d = new kcz0(context.getApplicationContext());
                this.e = o2x0Var.a(looper, null);
                break;
        }
    }

    public static i630 b(Context context) {
        i630 i630Var;
        i630 i630Var2 = f;
        if (i630Var2 != null) {
            return i630Var2;
        }
        synchronized (g) {
            try {
                i630Var = f;
                if (i630Var == null) {
                    Context applicationContext = context.getApplicationContext();
                    i630Var = new i630();
                    i630Var.b = false;
                    i630Var.c = true;
                    i630Var.e = applicationContext;
                    f = i630Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i630Var;
    }

    public RegionMonitoringState a(Region region, Callback callback) {
        if (c().containsKey(region)) {
            Iterator it = c().keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Region region2 = (Region) it.next();
                if (region2.equals(region)) {
                    if (!region2.hasSameIdentifiers(region)) {
                        region.getUniqueId();
                        region2.toString();
                        region.toString();
                        c().remove(region);
                    } else if (!this.b) {
                        return (RegionMonitoringState) c().get(region2);
                    }
                }
            }
        }
        RegionMonitoringState regionMonitoringState = new RegionMonitoringState(callback);
        Objects.toString(region);
        regionMonitoringState.a = true;
        c().put(region, regionMonitoringState);
        return regionMonitoringState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b2, code lost:
    
        if (r2 == null) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Map c() {
        ObjectInputStream objectInputStream;
        if (((AbstractMap) this.d) == null) {
            long currentTimeMillis = System.currentTimeMillis();
            Context context = (Context) this.e;
            long lastModified = currentTimeMillis - context.getFileStreamPath("org.altbeacon.beacon.service.monitoring_status_state").lastModified();
            this.d = new ConcurrentHashMap();
            if (this.c && lastModified <= 900000) {
                FileInputStream fileInputStream = null;
                try {
                    FileInputStream openFileInput = context.openFileInput("org.altbeacon.beacon.service.monitoring_status_state");
                    try {
                        objectInputStream = new ObjectInputStream(openFileInput);
                        try {
                            Map map = (Map) objectInputStream.readObject();
                            map.size();
                            for (Region region : map.keySet()) {
                                Objects.toString(region);
                                region.getUniqueId();
                                Objects.toString(map.get(region));
                            }
                            for (RegionMonitoringState regionMonitoringState : map.values()) {
                                this.b = true;
                                if (regionMonitoringState.b()) {
                                    regionMonitoringState.c();
                                }
                            }
                            ((AbstractMap) this.d).putAll(map);
                            if (openFileInput != null) {
                                try {
                                    openFileInput.close();
                                } catch (IOException unused) {
                                }
                            }
                        } catch (IOException | ClassCastException | ClassNotFoundException unused2) {
                            fileInputStream = openFileInput;
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException unused3) {
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            fileInputStream = openFileInput;
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException unused4) {
                                }
                            }
                            if (objectInputStream == null) {
                                throw th;
                            }
                            try {
                                objectInputStream.close();
                                throw th;
                            } catch (IOException unused5) {
                                throw th;
                            }
                        }
                    } catch (IOException | ClassCastException | ClassNotFoundException unused6) {
                        objectInputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                        objectInputStream = null;
                    }
                } catch (IOException | ClassCastException | ClassNotFoundException unused7) {
                    objectInputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    objectInputStream = null;
                }
                try {
                    objectInputStream.close();
                } catch (IOException unused8) {
                }
            }
        }
        return (AbstractMap) this.d;
    }

    public synchronized void d() {
        try {
            if (this.b) {
                HashMap hashMap = new HashMap();
                boolean z = false;
                for (Region region : c().keySet()) {
                    RegionMonitoringState regionMonitoringState = (RegionMonitoringState) c().get(region);
                    if (regionMonitoringState.a) {
                        hashMap.put(region, regionMonitoringState);
                    } else {
                        Objects.toString(region);
                        z = true;
                    }
                }
                if (z) {
                    this.d = hashMap;
                    g();
                }
                this.b = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized Set e() {
        return c().keySet();
    }

    public synchronized int f() {
        return e().size();
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0081 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void g() {
        ObjectOutputStream objectOutputStream;
        FileOutputStream openFileOutput;
        if (this.c) {
            int size = c().size();
            Context context = (Context) this.e;
            if (size > 50) {
                context.deleteFile("org.altbeacon.beacon.service.monitoring_status_state");
                return;
            }
            FileOutputStream fileOutputStream = null;
            try {
                openFileOutput = context.openFileOutput("org.altbeacon.beacon.service.monitoring_status_state", 0);
                try {
                    objectOutputStream = new ObjectOutputStream(openFileOutput);
                } catch (IOException e) {
                    e = e;
                    objectOutputStream = null;
                } catch (Throwable th) {
                    th = th;
                    objectOutputStream = null;
                }
            } catch (IOException e2) {
                e = e2;
                objectOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                objectOutputStream = null;
            }
            try {
                try {
                    Map c = c();
                    HashMap hashMap = new HashMap();
                    for (Region region : c.keySet()) {
                        hashMap.put(region, (RegionMonitoringState) c.get(region));
                    }
                    objectOutputStream.writeObject(hashMap);
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (IOException unused) {
                        }
                    }
                } catch (IOException e3) {
                    e = e3;
                    fileOutputStream = openFileOutput;
                    try {
                        e.printStackTrace(System.err);
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        if (objectOutputStream == null) {
                            return;
                        }
                        objectOutputStream.close();
                    } catch (Throwable th3) {
                        th = th3;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused3) {
                            }
                        }
                        if (objectOutputStream != null) {
                            throw th;
                        }
                        try {
                            objectOutputStream.close();
                            throw th;
                        } catch (IOException unused4) {
                            throw th;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    fileOutputStream = openFileOutput;
                    if (fileOutputStream != null) {
                    }
                    if (objectOutputStream != null) {
                    }
                }
                objectOutputStream.close();
            } catch (IOException unused5) {
            }
        }
    }

    public void h(boolean z) {
        switch (this.a) {
            case 2:
                if (this.b != z) {
                    this.b = z;
                    ((a3x0) this.e).e(new kz8(3, this, z, this.c));
                    break;
                }
                break;
            default:
                if (this.b != z) {
                    this.b = z;
                    ((a3x0) this.e).e(new kz8(4, this, z, this.c));
                    break;
                }
                break;
        }
    }

    public void i(boolean z) {
        switch (this.a) {
            case 2:
                if (this.c != z) {
                    this.c = z;
                    if (this.b) {
                        ((a3x0) this.e).e(new rg3(this, z, 13));
                        break;
                    }
                }
                break;
            default:
                if (this.c != z) {
                    this.c = z;
                    if (this.b) {
                        ((a3x0) this.e).e(new rg3(this, z, 15));
                        break;
                    }
                }
                break;
        }
    }

    public synchronized RegionMonitoringState j(Region region) {
        return (RegionMonitoringState) c().get(region);
    }

    public synchronized void k() {
        ((Context) this.e).deleteFile("org.altbeacon.beacon.service.monitoring_status_state");
        this.c = false;
    }

    public i630(ih3 ih3Var, boolean z, boolean z2, Double d) {
        this.a = 4;
        this.d = ih3Var;
        this.b = z;
        this.c = z2;
        this.e = d;
    }

    public i630(boolean z, boolean z2, String str, String str2) {
        this.a = 1;
        this.d = str;
        this.e = str2;
        this.b = z;
        this.c = z2;
    }

    public /* synthetic */ i630() {
        this.a = 0;
    }
}
