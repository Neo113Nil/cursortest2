package xsna;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: ConnectionManager.java */
/* loaded from: classes12.dex */
public final class f4j implements Handler.Callback {
    public final Context b;
    public final Handler c;
    public final HashMap d = new HashMap();

    /* compiled from: ConnectionManager.java */
    public static class a {
    }

    public f4j(Context context, Looper looper) {
        this.b = context;
        this.c = new Handler(looper, this);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        Handler handler = this.c;
        switch (i) {
            case 1:
                soi0 soi0Var = (soi0) message.obj;
                HashMap hashMap = soi0Var.f;
                ConcurrentLinkedQueue concurrentLinkedQueue = soi0Var.c;
                for (Map.Entry entry : hashMap.entrySet()) {
                    Objects.toString(entry.getKey());
                    soi0Var.m((ore0) entry.getValue());
                }
                concurrentLinkedQueue.add((zkc) soi0Var.d.b);
                Iterator it = new ArrayList(concurrentLinkedQueue).iterator();
                while (it.hasNext()) {
                    ore0 ore0Var = (ore0) it.next();
                    if (concurrentLinkedQueue.remove(ore0Var)) {
                        soi0Var.m(ore0Var);
                    }
                }
                handler.removeMessages(6, soi0Var);
                handler.sendMessageDelayed(handler.obtainMessage(6, soi0Var), 15000L);
                return true;
            case 2:
                soi0 soi0Var2 = (soi0) message.obj;
                y3j y3jVar = soi0Var2.d;
                if (soi0Var2.f.isEmpty()) {
                    y3jVar.getClass();
                    return true;
                }
                soi0Var2.j++;
                y3jVar.getClass();
                soi0Var2.l();
                return true;
            case 3:
                ore0 ore0Var2 = (ore0) message.obj;
                y3j a2 = ore0Var2.a();
                String b = a2.b();
                HashMap hashMap2 = this.d;
                soi0 soi0Var3 = (soi0) hashMap2.get(b);
                if (soi0Var3 == null) {
                    soi0Var3 = new soi0(this.b, a2, new pel(), this);
                    hashMap2.put(b, soi0Var3);
                }
                IBinder iBinder = soi0Var3.h;
                if (iBinder == null || !iBinder.isBinderAlive()) {
                    soi0Var3.c.add(ore0Var2);
                    soi0Var3.l();
                } else {
                    soi0Var3.m(ore0Var2);
                }
                handler.removeMessages(6, soi0Var3);
                handler.sendMessageDelayed(handler.obtainMessage(6, soi0Var3), 15000L);
                return true;
            case 4:
                ((a) message.obj).getClass();
                throw null;
            case 5:
                ((a) message.obj).getClass();
                throw null;
            case 6:
                soi0 soi0Var4 = (soi0) message.obj;
                if (!handler.hasMessages(3) && !handler.hasMessages(4) && !handler.hasMessages(5)) {
                    if (soi0Var4.c.isEmpty() && soi0Var4.f.isEmpty()) {
                        soi0Var4.o();
                        return true;
                    }
                    handler.removeMessages(6, soi0Var4);
                    handler.sendMessageDelayed(handler.obtainMessage(6, soi0Var4), 15000L);
                }
                return true;
            default:
                Log.e("ConnectionManager", "Received unknown message: " + message.what);
                return false;
        }
    }
}
