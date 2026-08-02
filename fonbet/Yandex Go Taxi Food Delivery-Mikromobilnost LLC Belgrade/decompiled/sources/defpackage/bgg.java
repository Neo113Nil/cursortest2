package defpackage;

import android.os.Trace;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public final class bgg implements tt5, rvc0 {
    public final ewc0 A;
    public final WeakHashMap B;
    public final sae C;
    public final FlutterJNI a;
    public final HashMap b;
    public final HashMap c;
    public final Object w;
    public final AtomicBoolean x;
    public final HashMap y;
    public int z;

    public bgg(FlutterJNI flutterJNI) {
        sae saeVar = new sae(21);
        saeVar.b = jsr.d().d;
        this.b = new HashMap();
        this.c = new HashMap();
        this.w = new Object();
        this.x = new AtomicBoolean(false);
        this.y = new HashMap();
        this.z = 1;
        this.A = new ewc0();
        this.B = new WeakHashMap();
        this.a = flutterJNI;
        this.C = saeVar;
    }

    public final void a(String str, xfg xfgVar, ByteBuffer byteBuffer, int i, long j) {
        wfg wfgVar = xfgVar != null ? xfgVar.b : null;
        Trace.beginAsyncSection(ffx.f0(ozz0.a("PlatformChannel ScheduleHandler on " + str)), i);
        wt7 wt7Var = new wt7(this, str, i, xfgVar, byteBuffer, j);
        if (wfgVar == null) {
            wfgVar = this.A;
        }
        wfgVar.a(wt7Var);
    }

    @Override // defpackage.tt5
    public final o501 d(st5 st5Var) {
        sae saeVar = this.C;
        saeVar.getClass();
        agg aggVar = new agg((ExecutorService) saeVar.b);
        o501 o501Var = new o501(17);
        this.B.put(o501Var, aggVar);
        return o501Var;
    }

    @Override // defpackage.tt5
    public final void h(String str, qt5 qt5Var, o501 o501Var) {
        wfg wfgVar;
        if (qt5Var == null) {
            synchronized (this.w) {
                this.b.remove(str);
            }
            return;
        }
        if (o501Var != null) {
            wfgVar = (wfg) this.B.get(o501Var);
            if (wfgVar == null) {
                ny61.g("Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue).");
                return;
            }
        } else {
            wfgVar = null;
        }
        synchronized (this.w) {
            try {
                this.b.put(str, new xfg(qt5Var, wfgVar));
                List<vfg> list = (List) this.c.remove(str);
                if (list == null) {
                    return;
                }
                for (vfg vfgVar : list) {
                    a(str, (xfg) this.b.get(str), vfgVar.a, vfgVar.b, vfgVar.c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.tt5
    public final void j(String str, qt5 qt5Var) {
        h(str, qt5Var, null);
    }

    @Override // defpackage.tt5
    public final void l(String str, ByteBuffer byteBuffer) {
        m(str, byteBuffer, null);
    }

    @Override // defpackage.tt5
    public final void m(String str, ByteBuffer byteBuffer, rt5 rt5Var) {
        ozz0.c("DartMessenger#send on " + str);
        try {
            int i = this.z;
            this.z = i + 1;
            if (rt5Var != null) {
                this.y.put(Integer.valueOf(i), rt5Var);
            }
            FlutterJNI flutterJNI = this.a;
            if (byteBuffer == null) {
                flutterJNI.dispatchEmptyPlatformMessage(str, i);
            } else {
                flutterJNI.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), i);
            }
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
