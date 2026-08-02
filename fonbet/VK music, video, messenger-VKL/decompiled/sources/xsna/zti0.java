package xsna;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;

/* compiled from: SessionLifecycleClient.kt */
/* loaded from: classes.dex */
public final class zti0 {
    public final kotlin.coroutines.d a;
    public Messenger b;
    public final LinkedBlockingDeque<Message> c = new LinkedBlockingDeque<>(20);
    public final b d = new b();

    /* compiled from: SessionLifecycleClient.kt */
    public static final class a extends Handler {
        public final kotlin.coroutines.d a;

        public a(kotlin.coroutines.d dVar) {
            super(Looper.getMainLooper());
            this.a = dVar;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            String str;
            if (message.what != 3) {
                message.toString();
                super.handleMessage(message);
                return;
            }
            Bundle data = message.getData();
            if (data == null || (str = data.getString("SessionUpdateExtra")) == null) {
                str = "";
            }
            myc0.h(zvj.a(this.a), null, null, new yti0(str, null), 3);
        }
    }

    /* compiled from: SessionLifecycleClient.kt */
    public static final class b implements ServiceConnection {
        public b() {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            zti0 zti0Var = zti0.this;
            LinkedBlockingDeque<Message> linkedBlockingDeque = zti0Var.c;
            linkedBlockingDeque.size();
            zti0Var.b = new Messenger(iBinder);
            ArrayList arrayList = new ArrayList();
            linkedBlockingDeque.drainTo(arrayList);
            myc0.h(zvj.a(zti0Var.a), null, null, new aui0(zti0Var, arrayList, null), 3);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            zti0 zti0Var = zti0.this;
            zti0Var.b = null;
            zti0Var.getClass();
        }
    }

    public zti0(kotlin.coroutines.d dVar) {
        this.a = dVar;
    }

    public static final Message a(zti0 zti0Var, List list, int i) {
        Object obj;
        zti0Var.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((Message) obj2).what == i) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long when = ((Message) next).getWhen();
                do {
                    Object next2 = it.next();
                    long when2 = ((Message) next2).getWhen();
                    if (when < when2) {
                        next = next2;
                        when = when2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (Message) obj;
    }

    public final void b(int i) {
        ArrayList arrayList = new ArrayList();
        this.c.drainTo(arrayList);
        arrayList.add(Message.obtain(null, i, 0, 0));
        myc0.h(zvj.a(this.a), null, null, new aui0(this, arrayList, null), 3);
    }
}
