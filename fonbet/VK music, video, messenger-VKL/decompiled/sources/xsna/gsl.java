package xsna;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import xsna.fsl;

/* compiled from: DeferredReleaserConcurrentImpl.java */
/* loaded from: classes.dex */
public final class gsl extends fsl {
    public final Object b = new Object();
    public final a f = new a();
    public ArrayList<fsl.a> d = new ArrayList<>();
    public ArrayList<fsl.a> e = new ArrayList<>();
    public final Handler c = new Handler(Looper.getMainLooper());

    /* compiled from: DeferredReleaserConcurrentImpl.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList<fsl.a> arrayList;
            synchronized (gsl.this.b) {
                gsl gslVar = gsl.this;
                ArrayList<fsl.a> arrayList2 = gslVar.e;
                arrayList = gslVar.d;
                gslVar.e = arrayList;
                gslVar.d = arrayList2;
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                gsl.this.e.get(i).release();
            }
            gsl.this.e.clear();
        }
    }

    @Override // xsna.fsl
    public final void a(ce ceVar) {
        synchronized (this.b) {
            this.d.remove(ceVar);
        }
    }
}
