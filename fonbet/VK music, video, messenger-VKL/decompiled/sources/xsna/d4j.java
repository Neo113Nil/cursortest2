package xsna;

import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.nio.channels.SelectionKey;
import java.util.Iterator;

/* compiled from: ConnectionManager.java */
/* loaded from: classes3.dex */
public final class d4j extends Thread {
    public final /* synthetic */ g4j b;

    public d4j(g4j g4jVar) {
        this.b = g4jVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        long uptimeMillis = SystemClock.uptimeMillis();
        g4j g4jVar = this.b;
        g4jVar.f = uptimeMillis;
        while (!isInterrupted()) {
            try {
                g4jVar.c.select(250L);
                Iterator<SelectionKey> it = g4jVar.c.selectedKeys().iterator();
                while (true) {
                    if (it.hasNext()) {
                        SelectionKey next = it.next();
                        if (next.isValid()) {
                            next.readyOps();
                            wb6 wb6Var = (wb6) next.attachment();
                            if (wb6Var == null) {
                                Log.e("ConnectionManager", "connection is null");
                                break;
                            }
                            wb6Var.h(next);
                        }
                    }
                }
                g4jVar.c.selectedKeys().clear();
                g4j.b(g4jVar);
                g4j.c(g4jVar);
                g4j.a(g4jVar);
            } catch (IOException e) {
                Log.e("ConnectionManager", Log.getStackTraceString(e));
                return;
            }
        }
    }
}
