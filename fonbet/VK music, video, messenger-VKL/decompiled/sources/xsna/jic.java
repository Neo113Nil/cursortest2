package xsna;

import android.util.Log;
import androidx.media3.exoplayer.offline.a;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: ClearTask.kt */
/* loaded from: classes8.dex */
public final class jic extends cbn<s3q0, IOException> {
    public final van i;
    public final yan j;
    public final String k = "clear_task";

    public jic(van vanVar, yan yanVar) {
        this.i = vanVar;
        this.j = yanVar;
    }

    @Override // xsna.bsg0
    public final Object c() {
        van vanVar = this.i;
        synchronized (vanVar.g) {
            try {
                androidx.media3.exoplayer.offline.a aVar = vanVar.e;
                if (aVar != null) {
                    ArrayList arrayList = new ArrayList();
                    a.C0060a g = aVar.g(new int[0]);
                    while (g.moveToNext()) {
                        try {
                            arrayList.add(androidx.media3.exoplayer.offline.a.l(g.b).a.b);
                        } finally {
                        }
                    }
                    s3q0 s3q0Var = s3q0.a;
                    g.close();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        aVar.a((String) it.next());
                    }
                }
                ConcurrentHashMap<File, androidx.media3.datasource.cache.c> concurrentHashMap = opj0.a;
                opj0.b(vanVar.a.a, vanVar.b);
                vanVar.d = opj0.a(vanVar.a.a, vanVar.c, vanVar.b);
                s3q0 s3q0Var2 = s3q0.a;
            } catch (Exception e) {
                Log.e("DiskCache", "Failed to clear cache/index.", e);
            }
        }
        this.j.b();
        return s3q0.a;
    }

    @Override // xsna.cbn
    public final String d() {
        return this.k;
    }
}
