package xsna;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: ObservableModel.java */
/* loaded from: classes3.dex */
public abstract class tq70<Observer> implements i80 {
    public final Handler b = new Handler(Looper.getMainLooper());
    public LinkedList c;

    /* compiled from: ObservableModel.java */
    public class a implements Runnable {
        public final /* synthetic */ b b;

        public a(b bVar) {
            this.b = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator it = tq70.this.c.iterator();
            while (it.hasNext()) {
                this.b.accept(it.next());
            }
        }
    }

    /* compiled from: ObservableModel.java */
    public interface b<T> {
        void accept(T t);
    }

    /* renamed from: D, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void r1(@NonNull Observer observer) {
        if (this.c == null) {
            this.c = new LinkedList();
        }
        this.c.add(observer);
    }

    @Override // xsna.i80
    public final void G1() {
        LinkedList linkedList = this.c;
        if (linkedList != null) {
            linkedList.clear();
        }
    }

    public final void y(@NonNull b<Observer> bVar) {
        if (this.c != null) {
            this.b.post(new a(bVar));
        }
    }
}
