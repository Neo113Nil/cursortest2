package xsna;

import android.content.Context;
import android.os.Trace;
import android.util.Pair;
import androidx.media3.exoplayer.h;
import androidx.media3.exoplayer.source.i;
import com.my.tracker.obfuscated.m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.TimeUnit;
import xsna.a8s;
import xsna.h5o0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class z7s implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ z7s(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                Iterable iterable = (Iterable) this.c;
                String str = (String) this.d;
                Runnable runnable = (Runnable) this.e;
                a8s a8sVar = (a8s) this.f;
                ArrayList arrayList = new ArrayList(c5g.u(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((a8s.a) ((h5o0.a) it.next())).a);
                }
                ForkJoinTask.invokeAll(arrayList);
                long nanoTime = System.nanoTime();
                ndp0.b(str);
                runnable.run();
                Trace.endSection();
                a8sVar.a.add(new mp10(str, System.nanoTime() - nanoTime, TimeUnit.NANOSECONDS));
                break;
            case 1:
                h.a aVar = (h.a) this.c;
                Pair pair = (Pair) this.d;
                androidx.media3.exoplayer.h.this.h.B(((Integer) pair.first).intValue(), (i.b) pair.second, (bpz) this.e, (pr10) this.f);
                break;
            default:
                com.my.tracker.obfuscated.m0.a((ArrayList) this.c, (String) this.d, (m0.b) this.e, (Context) this.f);
                break;
        }
    }
}
