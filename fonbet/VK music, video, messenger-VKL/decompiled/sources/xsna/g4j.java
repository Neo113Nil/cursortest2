package xsna;

import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.media.recorder.impl.Streamer;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import ru.ok.media.api.LiveStreamStatReporter;

/* compiled from: ConnectionManager.java */
/* loaded from: classes3.dex */
public final class g4j {
    public qom0 a;
    public ConcurrentHashMap b;
    public Selector c;
    public int d;
    public d4j e;
    public long f;
    public long g;
    public ConcurrentLinkedQueue h;
    public long i;
    public Streamer.b j;
    public ConcurrentHashMap k;
    public byi l;
    public cyi m;

    public static void a(g4j g4jVar) {
        if (g4jVar.i == 0) {
            g4jVar.i = System.currentTimeMillis();
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - g4jVar.i > 2000) {
            Iterator<SelectionKey> it = g4jVar.c.keys().iterator();
            while (it.hasNext()) {
                if (((wb6) it.next().attachment()) == null) {
                    Log.e("ConnectionManager", "null connection");
                }
            }
            g4jVar.i = currentTimeMillis;
        }
    }

    public static void b(g4j g4jVar) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - g4jVar.f < 500) {
            return;
        }
        g4jVar.f = uptimeMillis;
        while (true) {
            wb6 wb6Var = (wb6) g4jVar.h.poll();
            if (wb6Var == null) {
                return;
            }
            try {
                wb6Var.d(Streamer.CONNECTION_STATE.INITIALIZED, Streamer.STATUS.SUCCESS);
                wb6Var.a.register(wb6Var.c.c, 8, wb6Var);
                wb6Var.a.connect(new InetSocketAddress(wb6Var.e, wb6Var.f));
            } catch (Exception e) {
                Log.e("BaseConnection", Log.getStackTraceString(e));
                wb6Var.b();
            }
        }
    }

    public static void c(g4j g4jVar) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - g4jVar.g >= 200) {
            g4jVar.g = uptimeMillis;
            for (SelectionKey selectionKey : g4jVar.c.keys()) {
                if (selectionKey.isValid()) {
                    wb6 wb6Var = (wb6) selectionKey.attachment();
                    if (wb6Var == null) {
                        Log.e("ConnectionManager", "null connection");
                    } else if (wb6Var.c() == 0) {
                        wb6Var.g();
                    }
                }
            }
        }
    }

    public static void f(@NonNull String str, @Nullable LiveStreamStatReporter liveStreamStatReporter) {
        Log.e("ConnectionManager", str);
        if (liveStreamStatReporter != null) {
            int indexOf = str.indexOf("\n");
            if (indexOf == -1) {
                indexOf = str.length();
            }
            liveStreamStatReporter.streamStartFailed(str.substring(0, indexOf));
        }
    }

    public final void d(wb6 wb6Var, String str) {
        LiveStreamStatReporter liveStreamStatReporter = wb6Var.r;
        if (liveStreamStatReporter != null) {
            liveStreamStatReporter.streamConnecting(str);
        }
        this.b.put(Integer.valueOf(this.d), wb6Var);
        if (this.e == null) {
            d4j d4jVar = new d4j(this);
            this.e = d4jVar;
            d4jVar.start();
        }
        this.h.add(wb6Var);
        this.c.wakeup();
    }

    public final synchronized void e(int i) {
        this.k.remove(Integer.valueOf(i));
        wb6 wb6Var = (wb6) this.b.remove(Integer.valueOf(i));
        if (wb6Var != null) {
            wb6Var.b();
            if (this.b.isEmpty()) {
                g();
            }
        }
    }

    public final void g() {
        d4j d4jVar = this.e;
        if (d4jVar != null) {
            try {
                d4jVar.interrupt();
                this.e.join();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } finally {
                this.e = null;
            }
        }
    }
}
