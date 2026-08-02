package xsna;

import com.vk.log.L;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.collections.builders.ListBuilder;

/* compiled from: CommonSyncManager.kt */
/* loaded from: classes.dex */
public final class eng {
    public final w2w a;
    public boolean c;
    public final ArrayList b = new ArrayList();
    public final io.reactivex.rxjava3.disposables.b d = new io.reactivex.rxjava3.disposables.b();

    public eng(w2w w2wVar) {
        this.a = w2wVar;
    }

    public final synchronized void a() {
        try {
            if (this.c) {
                L.e("CommonSyncManager", "start skipped, already started");
            } else {
                L.e("CommonSyncManager", "start");
                ListBuilder e = e43.e();
                e.add(new p8q0());
                ListIterator listIterator = e.g().listIterator(0);
                while (true) {
                    ListBuilder.a aVar = (ListBuilder.a) listIterator;
                    if (!aVar.hasNext()) {
                        break;
                    }
                    le6 le6Var = (le6) aVar.next();
                    synchronized (this) {
                        this.b.add(this.a.J0(this, le6Var));
                    }
                }
                this.c = true;
                L.e("CommonSyncManager", "start finished");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized e8i b() {
        try {
            if (this.c) {
                L.e("CommonSyncManager", "stop");
                this.d.e();
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    ((io.reactivex.rxjava3.disposables.c) it.next()).dispose();
                }
                this.b.clear();
                this.c = false;
                L.e("CommonSyncManager", "stop finished");
            } else {
                L.e("CommonSyncManager", "stop skipped, already stopped");
            }
        } catch (Throwable th) {
            throw th;
        }
        return k7b0.h("CommonSyncManager");
    }
}
