package xsna;

import android.util.Log;
import java.nio.channels.ClosedByInterruptException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* compiled from: BitrateDumpGatheringConfigCacherImpl.kt */
@CallInternalApi
/* loaded from: classes8.dex */
public class rd7 {
    public final Object a;
    public Object b;

    public /* synthetic */ rd7(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public void a() {
        Iterator it = b().iterator();
        while (it.hasNext()) {
            ((dai0) it.next()).close();
        }
    }

    public List b() {
        Set<SelectionKey> keys;
        Selector selector = (Selector) this.b;
        if (selector == null || (keys = selector.keys()) == null) {
            return EmptyList.b;
        }
        Set<SelectionKey> set = keys;
        ArrayList arrayList = new ArrayList(c5g.u(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add((dai0) ((SelectionKey) it.next()).attachment());
        }
        return arrayList;
    }

    public void c(Selector selector) {
        int select;
        while (!selector.keys().isEmpty()) {
            try {
                select = selector.select();
            } catch (InterruptedException e) {
                Log.e("Poller", "exception:", e);
                a();
            } catch (ClosedByInterruptException e2) {
                Log.e("Poller", "exception:", e2);
                a();
            } catch (Throwable th) {
                Log.e("Poller", "Unexpected exception: ", th);
                a();
                throw th;
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            if (select != 0) {
                Iterator<SelectionKey> it = selector.selectedKeys().iterator();
                while (it.hasNext()) {
                    SelectionKey next = it.next();
                    it.remove();
                    dai0 dai0Var = (dai0) next.attachment();
                    if (next.isConnectable()) {
                        dai0Var.onConnected();
                    } else if (next.isReadable()) {
                        d(dai0Var);
                    } else if (next.isWritable()) {
                        dai0Var.W();
                    }
                }
            }
        }
    }

    public void d(dai0 dai0Var) {
        throw null;
    }

    public void e(SelectableChannel selectableChannel) {
        Selector selector = (Selector) this.b;
        if (selector == null) {
            throw new IllegalStateException("Required value was null.");
        }
        SelectionKey keyFor = selectableChannel.keyFor(selector);
        if (keyFor != null) {
            keyFor.cancel();
        }
        selector.wakeup();
    }

    public rd7(td7 td7Var, vd7 vd7Var, CidLogger cidLogger) {
        this.a = vd7Var;
        this.b = cidLogger;
    }

    public rd7(cdi cdiVar) {
        this.a = cdiVar;
    }
}
