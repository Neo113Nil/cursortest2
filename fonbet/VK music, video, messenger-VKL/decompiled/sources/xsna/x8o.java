package xsna;

import android.os.Handler;
import android.os.Message;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import xsna.b9o;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class x8o implements Handler.Callback {
    public final /* synthetic */ b9o b;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        b9o b9oVar = this.b;
        CopyOnWriteArraySet<b9o.c> copyOnWriteArraySet = b9oVar.c;
        int i = message.what;
        if (i == 0) {
            List list = (List) message.obj;
            b9oVar.f = true;
            b9oVar.k = Collections.unmodifiableList(list);
            boolean i2 = b9oVar.i();
            Iterator<b9o.c> it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                it.next().onInitialized();
            }
            if (i2) {
                b9oVar.b();
            }
        } else if (i == 1) {
            int i3 = message.arg1;
            int i4 = message.arg2;
            int i5 = b9oVar.e - i3;
            b9oVar.e = i5;
            if (i4 == 0 && i5 == 0) {
                Iterator<b9o.c> it2 = copyOnWriteArraySet.iterator();
                while (it2.hasNext()) {
                    it2.next().getClass();
                }
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException();
            }
            b9o.a aVar = (b9o.a) message.obj;
            b9oVar.k = Collections.unmodifiableList(aVar.c);
            n7o n7oVar = aVar.a;
            boolean i6 = b9oVar.i();
            if (aVar.b) {
                Iterator<b9o.c> it3 = copyOnWriteArraySet.iterator();
                while (it3.hasNext()) {
                    it3.next().getClass();
                }
            } else {
                Iterator<b9o.c> it4 = copyOnWriteArraySet.iterator();
                while (it4.hasNext()) {
                    it4.next().a(b9oVar, n7oVar);
                }
            }
            if (i6) {
                b9oVar.b();
                return true;
            }
        }
        return true;
    }
}
